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
    public partial class ConsultaMovimientos : Form
    {
        ModeloClientes mcl = new ModeloClientes();
        ModeloCuentas mcu = new ModeloCuentas();
        ModeloMovimientos mm = new ModeloMovimientos();
        ModeloBitacora mb = new ModeloBitacora();

        ControlMovimientos cm = new ControlMovimientos();
        public ConsultaMovimientos()
        {
            InitializeComponent();
            mcl.cargarComboClientes(comboBox1);
            cm.BuscandoClienteConsultar(comboBox1, textBox1, comboBox2, textBox6, comboBox3, textBox8, button1, button4, button7, button2, button6);
        }

        private void button5_Click(object sender, EventArgs e)
        {
            VistaPrincipal.MenuPrincipal nw = new VistaPrincipal.MenuPrincipal();
            this.Hide();
            nw.Show();
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
                    cm.BuscandoCuentaConsultar(comboBox1, textBox1, comboBox2, textBox6, comboBox3, textBox8, button1, button4, button7, button2, button6);
                    textBox6.Focus();
                }
                else
                {
                    MessageBox.Show("No existe ningún cliente bajo esta identificación.", "Estado", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }
            }
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            textBox1.Text = comboBox1.Text;
        }

        private void button4_Click(object sender, EventArgs e)
        {
            if (textBox6.Text == "")
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
                        if (Convert.ToInt32(textBox6.Text) == list[i])
                        {
                            enco = 1;
                            vecl = i;
                            break;
                        }
                    }
                    //Si la cuenta que busco sí está entre las cuentas asignadas al cliente que seleccionó
                    if (enco == 1)
                    {
                        comboBox2.SelectedIndex = vecl;
                        cm.BuscandoMovimientoConsultar(comboBox1, textBox1, comboBox2, textBox6, comboBox3, textBox8, button1, button4, button7, button2, button6);
                        mm.cargarComboMovimientos(comboBox3, textBox6.Text);
                        MessageBox.Show("Cuenta encontradá, puede consultar sus movimientos.", "Estado", MessageBoxButtons.OK);
                    }
                    else
                    //Si la cuenta que busco no está entre las cuentas asignadas al cliente, la busca en la base de datos, si aparece es porque es de otro cliente y si no, no existe
                    {
                        if (mcu.buscarCuenta(textBox6.Text) == 1)
                            MessageBox.Show("La cuenta está bajo el dominio de otro cliente.", "Error de Solicitud", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                        else
                            MessageBox.Show("La cuenta no existe.", "Error de solicitud", MessageBoxButtons.OK, MessageBoxIcon.Error);
                    }
                }
            }
        }

        private void comboBox2_SelectedIndexChanged(object sender, EventArgs e)
        {
            textBox6.Text = comboBox2.Text;
        }

        private void button7_Click(object sender, EventArgs e)
        {
            if (textBox8.Text == "")
            {
                MessageBox.Show("No hay ninguna cuenta para buscar.", "Error de solicitud", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            else
            {
                if (mcu.buscarCuenta(textBox6.Text) == 1)
                {
                    string nummov, mov;
                    int[] list = new int[comboBox3.Items.Count];
                    int vecl = list.Length;
                    for (int i = 0; i < comboBox3.Items.Count; i++)
                    {
                        //Reinicia la variable numero de movimiento y asigna a la variable movimiento el item que está en la posición i
                        nummov = ""; mov = "" + comboBox3.Items[i].ToString();
                        for (int j = 0; j < mov.Length; j++)
                        {
                            //Si el caracter es un espacio en blanco, el ciclo se rompe, dejando solo la variable que tenía el item del combo
                            if (mov[(char)j] == ' ')
                            {
                                break;
                            }
                            //Se le suma a la variable nummov el caracter en la posición i
                            nummov += mov[(char)j];
                        }
                        //Una vez terminado de formarse la variable con el numero de movimiento, la asigna al campo i de la lista
                        list[i] = Convert.ToInt32(nummov);
                    }
                    int enco = 0;
                    //Compara el numero de cuenta en el TextField con todos los campos de la lista
                    for (int i = 0; i < vecl; i++)
                    {
                        //Si lo que está en el espacio de numero de cuenta es igual al valor en i de la lista asigna 1 a enco
                        if (Convert.ToInt32(textBox8.Text) == list[i])
                        {
                            enco = 1;
                            vecl = i;
                            break;
                        }
                    }
                    //Si el movimiento que buscó sí está entre los movimientos asignados a la cuenta que seleccionó
                    if (enco == 1)
                    {
                        comboBox3.SelectedIndex = vecl;
                        mm.mostrarDatos(textBox8.Text, textBox7, textBox3, textBox4, textBox5, textBox2);
                        cm.BloquearTodoConsultar(comboBox1, textBox1, comboBox2, textBox6, comboBox3, textBox8, button1, button4, button7, button2, button6);
                    }
                    else
                    //Si la cuenta que busco no está entre las cuentas asignadas al cliente, la busca en la base de datos, si aparece es porque es de otro cliente y si no, no existe
                    {
                        if (mcu.buscarCuenta(textBox8.Text) == 1)
                            MessageBox.Show("El movimiento pertene a otra cuenta.", "Error de Solicitud", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                        else
                            MessageBox.Show("El movimiento no existe.", "Error de solicitud", MessageBoxButtons.OK, MessageBoxIcon.Error);
                    }
                }
            }
        }

        private void comboBox3_SelectedIndexChanged(object sender, EventArgs e)
        {
            textBox8.Text = comboBox3.Text;
        }

        private void button2_Click(object sender, EventArgs e)
        {
            cm.BuscandoCuentaConsultar(comboBox1, textBox1, comboBox2, textBox6, comboBox3, textBox8, button1, button4, button7, button2, button6);
            cm.LimpiarCuentaConsultar(textBox6, comboBox3, textBox8, textBox7, textBox3, textBox4, textBox5, textBox2);
        }

        private void button3_Click(object sender, EventArgs e)
        {
            cm.BuscandoClienteConsultar(comboBox1, textBox1, comboBox2, textBox6, comboBox3, textBox8, button1, button4, button7, button2, button6);
            cm.LimpiarTodoConsultar(textBox1, comboBox2, textBox6, comboBox3, textBox8, textBox7, textBox3, textBox4, textBox5, textBox2);
        }

        private void button6_Click(object sender, EventArgs e)
        {
            cm.BuscandoMovimientoConsultar(comboBox1, textBox1, comboBox2, textBox6, comboBox3, textBox8, button1, button4, button7, button2, button6);
            cm.LimpiarMovimientoConsultar(textBox8, textBox7, textBox3, textBox4, textBox5, textBox2);
        }

        private void ConsultaMovimientos_FormClosing(object sender, FormClosingEventArgs e)
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
