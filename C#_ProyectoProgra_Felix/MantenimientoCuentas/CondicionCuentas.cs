using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using Cotidiano3_Felix.Modelos; //se importan las carpetas necesarias
using Cotidiano3_Felix.Controles;

namespace Cotidiano3_Felix.MantenimientoCuentas
{
    public partial class CondicionCuentas : Form
    {
        ModeloClientes mcl = new ModeloClientes(); //Se instancian las clases a utilizar
        ModeloCuentas mcu = new ModeloCuentas();
        ControlCuentas cc = new ControlCuentas();
        ModeloBitacora mb = new ModeloBitacora();
        public CondicionCuentas()
        {
            InitializeComponent();
            mcl.cargarComboClientes(comboBox1); //se carga el combo con los clientes
            cc.BloquearObjetosCondicion(comboBox1, textBox1, comboBox2, textBox6, button1, button4, button6); //se bloquean los componentes
        }

        //Boton buscar cliente
        private void button1_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == "") //si el texto esta vacio
            {
                MessageBox.Show("No hay ninguna identificación para buscar.", "Error de solicitud", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            else
            {
                if (mcl.buscarID(textBox1.Text) == 1) //Si el ciente está en la base
                {
                    MessageBox.Show("Cliente encontrado, ahora puede buscar sus cuentas.", "Estado", MessageBoxButtons.OK);
                    comboBox2.Items.Clear();
                    mcu.cargarComboCuentas(comboBox2, textBox1.Text);
                    cc.DesbloquearObjetosCondicion(comboBox1, textBox1, comboBox2, textBox6, button1, button4, button6);
                    textBox6.Focus();
                }
                else //si el cliente no existe
                {
                    MessageBox.Show("No existe ningún cliente bajo esta identificación.", "Estado", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }
            }
        }

        //boton buscar cuenta
        private void button4_Click(object sender, EventArgs e)
        {
            if (textBox6.Text == "") //si el texto está vacio
            {
                MessageBox.Show("No hay ninguna cuenta para buscar.", "Error de solicitud", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            else
            {
                if (mcl.buscarID(textBox1.Text) == 1) //si el cliente sí existe
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
                        mcu.mostrarDatos(textBox6.Text, textBox3, textBox4, textBox5, textBox2, textBox7);
                        cc.BloquearTodoCondicion(comboBox1, textBox1, comboBox2, textBox6, button1, button4, button6);
                        if (textBox7.Text == "Activa")
                        {
                            button6.Text = "Desactivar";
                        }
                        else
                        {
                            button6.Text = "Activar";
                        }
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

        //Boton limpiar
        private void button3_Click(object sender, EventArgs e)
        {
            cc.BloquearObjetosCondicion(comboBox1, textBox1, comboBox2, textBox6, button1, button4, button6);
            cc.LimpiarTodoConsultar(textBox1, comboBox2, textBox2, textBox3, textBox4, textBox5, textBox6, textBox7);
        }

        //Boton consultar otra cuenta
        private void button2_Click(object sender, EventArgs e)
        {
            //Solo funciona si ya se encontró un cliente
            if (button1.Enabled == false)
            {
                cc.DesbloquearObjetosCondicion(comboBox1, textBox1, comboBox2, textBox6, button1, button4, button6);
                cc.LimpiarConsultar(textBox6, textBox3, textBox4, textBox5, textBox2, textBox7);
            }
        }

        //Cuando se cambia el item del combo box
        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            textBox1.Text = comboBox1.Text; //asigna al textbox el valor del combo
        }
        private void comboBox2_SelectedIndexChanged(object sender, EventArgs e)
        {
            textBox6.Text = comboBox2.Text; //Asigna al textbox el valor del combo
        }
    
        //Boton regresar
        private void button5_Click(object sender, EventArgs e)
        {
            VistaPrincipal.MenuPrincipal nw = new VistaPrincipal.MenuPrincipal();
            this.Hide();
            nw.Show();
        }

        //Boton Activar / Desactivar
        private void button6_Click(object sender, EventArgs e)
        {
            //condi es una variable dinamica que va cambiando si se va a activar o desactivar una cuenta
            String condi;
            if (textBox7.Text == "Activa")
            {
                condi = "Inactiva";
                button6.Text = "Activar";
            }
            else
            {
                condi = "Activa";
                button6.Text = "Desactivar";
            }
            textBox7.Text = condi;
            mcu.condicionCuenta(textBox6.Text, condi);

            mcu.odataAdapter.UpdateCommand.Parameters["@condi"].Value = condi;

            mcu.conexion.Open();
            mcu.odataAdapter.UpdateCommand.ExecuteNonQuery();
            mcu.conexion.Close();

            if (condi == "Inactiva")
                condi = "desactivada.";
            else
                condi = "activada.";
            MessageBox.Show("La cuenta ha sido "+condi, "Estado", MessageBoxButtons.OK);

            mb.ingresarBitacora(DateTime.Now, "Cambió el estado de cuenta: "+textBox6.Text, VistaPrincipal.IniciarSesion.Username);

            mb.odataAdapter.InsertCommand.Parameters["@fecha"].Value = DateTime.Now;
            mb.odataAdapter.InsertCommand.Parameters["@desc"].Value = "Cambió el estado de cuenta: "+textBox6.Text;
            mb.odataAdapter.InsertCommand.Parameters["@user"].Value = VistaPrincipal.IniciarSesion.Username;

            mb.conexion.Open();
            mb.odataAdapter.InsertCommand.ExecuteNonQuery();
            mb.conexion.Close();
        }

        private void CondicionCuentas_FormClosing(object sender, FormClosingEventArgs e)
        {
            //Si el usuario cierra el formulario
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
