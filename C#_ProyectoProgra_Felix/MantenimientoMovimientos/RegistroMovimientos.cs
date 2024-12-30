using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using Cotidiano3_Felix.Modelos;
using Cotidiano3_Felix.Controles;

namespace Cotidiano3_Felix.MantenimientoMovimientos
{
    public partial class RegistroMovimientos : Form
    {
        ModeloClientes mcl = new ModeloClientes();
        ModeloCuentas mcu = new ModeloCuentas();
        ModeloMovimientos mm = new ModeloMovimientos();
        ModeloBitacora mb = new ModeloBitacora();

        ControlMovimientos cm = new ControlMovimientos();
        public RegistroMovimientos()
        {
            InitializeComponent();
            mcl.cargarComboClientes(comboBox1);
            cm.BloquearObjetosRegistrar(comboBox1, textBox1, comboBox2, textBox2, dateTimePicker1, comboBox3, textBox3, textBox4, textBox5, button6);
            dateTimePicker1.Value = DateTime.Now;
            comboBox3.SelectedIndex = 0;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == "")
            {
                MessageBox.Show("No hay ninguna identificación para buscar.", "Error de solicitud", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            else
            {
                if (mcl.buscarID(textBox1.Text) == 1)
                {
                    MessageBox.Show("Cliente encontrado, ahora puede buscar sus cuentas.", "Estado", MessageBoxButtons.OK);
                    comboBox2.Items.Clear();
                    mcu.cargarComboCuentas(comboBox2, textBox1.Text);
                    cm.DesbloquearObjetosRegistrar(comboBox1, textBox1, comboBox2, textBox2, dateTimePicker1, comboBox3, textBox3, textBox4, textBox5, button6);
                    textBox2.Focus();
                }
                else
                {
                    MessageBox.Show("No existe ningún cliente bajo esta identificación.", "Estado", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }
            }
        }

        private void button4_Click(object sender, EventArgs e)
        {
            if (textBox2.Text == "")
            {
                MessageBox.Show("No hay ninguna cuenta para buscar.", "Error de solicitud", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            else
            {
                if (mcl.buscarID(textBox1.Text) == 1)
                {
                    string numcuenta, cuenta;
                    int[] list = new int[comboBox2.Items.Count];
                    int vecl = list.Length;
                    for (int i = 0; i < comboBox2.Items.Count; i++)
                    {
                        //Reinicia la variable numero de cuenta y asigna a la variable cuenta el item que está en la posición i
                        numcuenta = ""; cuenta = "" + comboBox2.Items[i].ToString();
                        for (int j = 0; j < cuenta.Length; j++)
                        {
                            //Si el caracter es un espacio en blanco, el ciclo se rompe, dejando solo la variable que tenía el item del combo
                            if (cuenta[(char)j] == ' ')
                            {
                                break;
                            }
                            //Se le suma a la variable numcuenta el caracter en la posición i
                            numcuenta += cuenta[(char)j];
                        }
                        //Una vez terminado de formarse la variable con el numero de cuenta, la asigna al campo i de la lista
                        list[i] = Convert.ToInt32(numcuenta);
                    }
                    int enco = 0;
                    //Compara el numero de cuenta en el TextField con todos los campos de la lista
                    for (int i = 0; i < vecl; i++)
                    {
                        //Si lo que está en el espacio de numero de cuenta es igual al valor en i de la lista asigna 1 a enco
                        if (Convert.ToInt32(textBox2.Text) == list[i])
                        {
                            enco = 1;
                            vecl = i;
                            break;
                        }
                    }
                    //Si la cuenta que busco sí está entre las cuentas asignadas al cliente que seleccionó
                    if (enco == 1 && mcu.getCondicion(textBox2.Text) == "Activa")
                    {
                        comboBox2.SelectedIndex = vecl;
                        cm.DesbloquearTodoRegistrar(comboBox1, textBox1, comboBox2, textBox2, dateTimePicker1, comboBox3, textBox3, textBox4, textBox5, button6);
                        MessageBox.Show("Cuenta encontrada y activa.\nPuede realizar el movimiento", "Estado", MessageBoxButtons.OK);
                    }
                    else if (enco ==1 && mcu.getCondicion(textBox2.Text) == "Inactiva")
                    {
                        MessageBox.Show("La cuenta está inactiva, no se pueden realizar movimientos.", "Error de solicitud", MessageBoxButtons.OK, MessageBoxIcon.Error);
                    }
                    else
                    //Si la cuenta que busco no está entre las cuentas asignadas al cliente, la busca en la base de datos, si aparece es porque es de otro cliente y si no, no existe
                    {
                        if (mcu.buscarCuenta(textBox2.Text) == 1)
                            MessageBox.Show("La cuenta está bajo el dominio de otro cliente.", "Error de Solicitud", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                        else
                            MessageBox.Show("La cuenta no existe.", "Error de solicitud", MessageBoxButtons.OK, MessageBoxIcon.Error);
                    }
                }
            }
        }

        private void button3_Click(object sender, EventArgs e)
        {
            cm.BloquearObjetosRegistrar(comboBox1, textBox1, comboBox2, textBox2, dateTimePicker1, comboBox3, textBox3, textBox4, textBox5, button6);
            cm.LimpiarTodoRegistrar(textBox1, comboBox2, textBox2, textBox3, textBox4, textBox5);
        }

        private void button2_Click(object sender, EventArgs e)
        {
            cm.DesbloquearObjetosRegistrar(comboBox1, textBox1, comboBox2, textBox2, dateTimePicker1, comboBox3, textBox3, textBox4, textBox5, button6);
            cm.LimpiarRegistrar(textBox2, textBox3, textBox4, textBox5);
        }

        private void button5_Click(object sender, EventArgs e)
        {
            VistaPrincipal.MenuPrincipal nw = new VistaPrincipal.MenuPrincipal();
            this.Hide();
            nw.Show();
        }

        private void button6_Click(object sender, EventArgs e)
        {
            //Verifica si los textos no están vacíos y si es compra: que el monto no supere el monto disponible
            if (!(textBox3.Text == "" || textBox4.Text == "" || textBox5.Text == "") && ((Convert.ToInt64(textBox3.Text) < mcu.getMontoDisp(textBox2.Text) && comboBox3.Text == "Compra")
            || (comboBox3.Text == "Abono" && (Convert.ToInt64(textBox3.Text) + mcu.getMontoDisp(textBox2.Text)) < mcu.getMontoLi(textBox2.Text))))
            {
                int monto;
                if (comboBox3.Text == "Compra")
                    monto = Convert.ToInt32(textBox3.Text) * -1;
                else
                    monto = Convert.ToInt32(textBox3.Text);

                try
                {
                    mm.registrarMovimiento(Convert.ToInt32(textBox2.Text), dateTimePicker1.Value, Convert.ToString(comboBox3.Text), Convert.ToDouble(textBox3.Text), textBox4.Text, textBox5.Text);

                    mm.odataAdapter.InsertCommand.Parameters["@numcu"].Value = Convert.ToInt32(this.textBox2.Text);
                    mm.odataAdapter.InsertCommand.Parameters["@fecha"].Value = this.dateTimePicker1.Value;
                    mm.odataAdapter.InsertCommand.Parameters["@tipo"].Value = Convert.ToString(this.comboBox3.Text);
                    mm.odataAdapter.InsertCommand.Parameters["@monto"].Value = Convert.ToDouble(this.textBox3.Text);
                    mm.odataAdapter.InsertCommand.Parameters["@nombreresp"].Value = this.textBox4.Text;
                    mm.odataAdapter.InsertCommand.Parameters["@detalle"].Value = this.textBox5.Text;

                    mm.conexion.Open();
                    mm.odataAdapter.InsertCommand.ExecuteNonQuery();
                    mm.conexion.Close();

                    mcu.actualizarMontoDispo(textBox2.Text, Convert.ToDouble(textBox3.Text));

                    mcu.odataAdapter.UpdateCommand.Parameters["@monto"].Value = Convert.ToDouble(monto);

                    mcu.conexion.Open();
                    mcu.odataAdapter.UpdateCommand.ExecuteNonQuery();
                    mcu.conexion.Close();

                    mb.ingresarBitacora(DateTime.Now, "Registró el movimiento: " + mm.getUltimoMov(), VistaPrincipal.IniciarSesion.Username);

                    mb.odataAdapter.InsertCommand.Parameters["@fecha"].Value = DateTime.Now;
                    mb.odataAdapter.InsertCommand.Parameters["@desc"].Value = "Registró el movimiento: " + mm.getUltimoMov();
                    mb.odataAdapter.InsertCommand.Parameters["@user"].Value = VistaPrincipal.IniciarSesion.Username;

                    mb.conexion.Open();
                    mb.odataAdapter.InsertCommand.ExecuteNonQuery();
                    mb.conexion.Close();
                }
                catch (Exception ex)
                {
                    Console.WriteLine(ex);
                }
                finally
                {
                    if (mcu.conexion.State == ConnectionState.Open)
                        mcu.conexion.Close();
                    if (mm.conexion.State == ConnectionState.Open)
                        mm.conexion.Close();
                }

                MessageBox.Show("El movimiento se realizó exitosamente.", "Estado", MessageBoxButtons.OK);
                cm.BloquearObjetosRegistrar(comboBox1, textBox1, comboBox2, textBox2, dateTimePicker1, comboBox3, textBox3, textBox4, textBox5, button6);
                cm.LimpiarTodoRegistrar(textBox1, comboBox2, textBox2, textBox3, textBox4, textBox5);
            }
            else if (comboBox3.Text == "Abono" && Convert.ToInt64(textBox3.Text) + mcu.getMontoDisp(textBox2.Text) > mcu.getMontoLi(textBox2.Text))
            {
                MessageBox.Show("No puede abonar esta cantidad puesto que estaría superando el crédito límite de la cuenta.", "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            else if (Convert.ToInt32(textBox3.Text) > mcu.getMontoDisp(textBox2.Text) && comboBox3.Text == "Compra")
            {
                MessageBox.Show("El monto del movimiento es mayor al monto disponible en la cuenta.", "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            else
            {
                MessageBox.Show("Faltan datos por completar.", "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            textBox1.Text = comboBox1.Text;
        }

        private void comboBox2_SelectedIndexChanged(object sender, EventArgs e)
        {
            textBox2.Text = comboBox2.Text;
        }

        private void RegistroMovimientos_FormClosing(object sender, FormClosingEventArgs e)
        {
            if (e.CloseReason == CloseReason.UserClosing)
            {
                mb.ingresarBitacora(DateTime.Now, "Cerró Sesión", VistaPrincipal.IniciarSesion.Username);

                mb.odataAdapter.InsertCommand.Parameters["@fecha"].Value = DateTime.Now;
                mb.odataAdapter.InsertCommand.Parameters["@desc"].Value = "Cerró Sesión";
                mb.odataAdapter.InsertCommand.Parameters["@user"].Value = VistaPrincipal.IniciarSesion.Username;

                mb.conexion.Open();
                mb.odataAdapter.InsertCommand.ExecuteNonQuery();
                mb.conexion.Close();

                Application.Exit();
            }
        }
    }
}
