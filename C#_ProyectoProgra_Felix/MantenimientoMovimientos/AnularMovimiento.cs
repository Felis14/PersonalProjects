using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

using Cotidiano3_Felix.Controles;
using Cotidiano3_Felix.Modelos;

namespace Cotidiano3_Felix.MantenimientoMovimientos
{
    public partial class AnularMovimiento : Form
    {
        ModeloClientes mcl = new ModeloClientes();
        ModeloCuentas mcu = new ModeloCuentas();
        ModeloMovimientos mm = new ModeloMovimientos();
        ModeloBitacora mb = new ModeloBitacora();

        ControlMovimientos cm = new ControlMovimientos();
        public AnularMovimiento()
        {
            InitializeComponent();
            mcl.cargarComboClientes(comboBox1);
            cm.BuscandoClienteConsultar(comboBox1, textBox1, comboBox2, textBox6, comboBox3, textBox8, button1, button4, button7, button2, button6);
            button8.Enabled = false;
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
                MessageBox.Show("No hay ningun movimiento para buscar.", "Error de solicitud", MessageBoxButtons.OK, MessageBoxIcon.Error);
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
                            if (mov[j] == ' ')
                                break;

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
                        MessageBox.Show("Movimiento encontrado, puede anularlo.", "Estado", MessageBoxButtons.OK);
                        button8.Enabled = true;
                    }
                    else
                    //Si la cuenta que busco no está entre las cuentas asignadas al cliente, la busca en la base de datos, si aparece es porque es de otro cliente y si no, no existe
                    {
                        if (mm.buscarMov(Convert.ToInt32(textBox8.Text)) == 1)
                            MessageBox.Show("El movimiento pertene a otra cuenta.", "Error de Solicitud", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                        else
                            MessageBox.Show("El movimiento no existe.", "Error de solicitud", MessageBoxButtons.OK, MessageBoxIcon.Error);
                    }
                }
            }
        }

        private void comboBox3_SelectedIndexChanged(object sender, EventArgs e)
        {
            String nummov = "";
            textBox8.Text = "";
            for (int i=0; i < comboBox3.Text.Length; i++)
            {
                if (comboBox3.Text[i] == ' ')
                    break;

                nummov += comboBox3.Text[i];
            }
            textBox8.Text = nummov;
        }

        private void button3_Click(object sender, EventArgs e)
        {
            cm.BuscandoClienteConsultar(comboBox1, textBox1, comboBox2, textBox6, comboBox3, textBox8, button1, button4, button7, button2, button6);
            cm.LimpiarTodoConsultar(textBox1, comboBox2, textBox6, comboBox3, textBox8, textBox7, textBox3, textBox4, textBox5, textBox2);
            button8.Enabled = false;
        }

        private void button2_Click(object sender, EventArgs e)
        {
            cm.BuscandoCuentaConsultar(comboBox1, textBox1, comboBox2, textBox6, comboBox3, textBox8, button1, button4, button7, button2, button6);
            cm.LimpiarCuentaConsultar(textBox6, comboBox3, textBox8, textBox7, textBox3, textBox4, textBox5, textBox2);
            button8.Enabled = false;
        }

        private void button6_Click(object sender, EventArgs e)
        {
            cm.BuscandoMovimientoConsultar(comboBox1, textBox1, comboBox2, textBox6, comboBox3, textBox8, button1, button4, button7, button2, button6);
            cm.LimpiarMovimientoConsultar(textBox8, textBox7, textBox3, textBox4, textBox5, textBox2);
            button8.Enabled = false;
        }

        private void button8_Click(object sender, EventArgs e)
        {
            Console.WriteLine("Verificando: " + textBox4.Text + " + " + mcu.getMontoDisp(textBox6.Text) + " > " + mcu.getMontoLi(textBox6.Text) + "\n" + (Convert.ToInt32(textBox4.Text) + mcu.getMontoDisp(textBox6.Text)) + " > " + mcu.getMontoLi(textBox6.Text));
            //Si la cuenta está inactiva
            if (mcu.getCondicion(textBox6.Text) == "Inactiva")
            {
                MessageBox.Show("El movimiento no puede ser anulado ya que la cuenta está inactiva.", "Estado", MessageBoxButtons.OK);
            }
            //Si al anular una compra, el monto rebasa el monto limite
            else if (textBox3.Text == "Compra" && Convert.ToInt32(textBox4.Text) + mcu.getMontoDisp(textBox6.Text) > mcu.getMontoLi(textBox6.Text))
            {
                MessageBox.Show("El movimiento no puede ser anulado ya que el monto a devolver hace que se supere el Monto Limite de la cuenta.", "Estado", MessageBoxButtons.OK);
            }
            //Si al anular un abono, la cuenta queda con un monto disponible menor a cero
            else if (textBox3.Text == "Abono" && mcu.getMontoDisp(textBox6.Text) - Convert.ToInt32(textBox4.Text) < 0)
            {
                MessageBox.Show("El movimiento no puede ser anulado ya que la cuenta no tiene suficientes fondos y quedaría en números negativos.", "Estado", MessageBoxButtons.OK);
            }
            //Si el movimiento sí puede ser anulado
            else if (MessageBox.Show("¿Está segur@ de anular el movimiento?", "Anulación de Movimiento", MessageBoxButtons.YesNo, MessageBoxIcon.Warning) == DialogResult.Yes)
            {
                double monto = Convert.ToDouble(textBox4.Text);
                if (textBox3.Text == "Abono")
                    monto *= -1;

                mcu.actualizarMontoDispo(textBox6.Text, monto);

                mcu.odataAdapter.UpdateCommand.Parameters["@monto"].Value = monto;

                mcu.conexion.Open();
                mcu.odataAdapter.UpdateCommand.ExecuteNonQuery();
                mcu.conexion.Close();

                mm.anularMovimiento(Convert.ToInt32(textBox8.Text));

                mm.odataAdapter.DeleteCommand.Parameters["@nummov"].Value = Convert.ToInt32(this.textBox8.Text);

                mm.conexion.Open();
                mm.odataAdapter.DeleteCommand.ExecuteNonQuery();
                mm.conexion.Close();

                mb.ingresarBitacora(DateTime.Now, "Anuló el movimiento: "+textBox8.Text, VistaPrincipal.IniciarSesion.Username);

                mb.odataAdapter.InsertCommand.Parameters["@fecha"].Value = DateTime.Now;
                mb.odataAdapter.InsertCommand.Parameters["@desc"].Value = "Anuló el movimiento: "+textBox8.Text;
                mb.odataAdapter.InsertCommand.Parameters["@user"].Value = VistaPrincipal.IniciarSesion.Username;

                mb.conexion.Open();
                mb.odataAdapter.InsertCommand.ExecuteNonQuery();
                mb.conexion.Close();

                MessageBox.Show("El movimiento fue anulado y el Monto Disponible de la cuenta actualizado", "Estado", MessageBoxButtons.OK);
                cm.BuscandoMovimientoConsultar(comboBox1, textBox1, comboBox2, textBox6, comboBox3, textBox8, button1, button4, button7, button2, button6);
                cm.LimpiarMovimientoConsultar(textBox8, textBox7, textBox3, textBox4, textBox5, textBox2);
                button8.Enabled = false;

                comboBox3.Items.Clear();
                mm.cargarComboMovimientos(comboBox3, textBox6.Text);
            } else
            {
                MessageBox.Show("El movimiento no fue anulado.", "Estado", MessageBoxButtons.OK);
            }
        }

        private void AnularMovimiento_FormClosed(object sender, FormClosedEventArgs e)
        {
            Application.Exit();
        }

        private void button5_Click(object sender, EventArgs e)
        {
            VistaPrincipal.MenuPrincipal nw = new VistaPrincipal.MenuPrincipal();
            this.Hide();
            nw.Show();
        }

        private void AnularMovimiento_FormClosing(object sender, FormClosingEventArgs e)
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
