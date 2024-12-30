using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using Cotidiano3_Felix.Modelos; //importa las carpetas necesarias
using Cotidiano3_Felix.Controles;

namespace Cotidiano3_Felix.MantenimientoCuentas
{
    public partial class ConsultarCuentas : Form
    {
        //Instancia las clases que se van a utilizar
        ModeloClientes mcl = new ModeloClientes();
        ModeloCuentas mcu = new ModeloCuentas();
        ModeloMovimientos mm = new ModeloMovimientos();
        ControlCuentas cc = new ControlCuentas();
        ModeloBitacora mb = new ModeloBitacora();
        public ConsultarCuentas()
        {
            InitializeComponent();
            mcl.cargarComboClientes(comboBox1); //carga los clientes en el combo box
            cc.BloquearObjetosConsultar(comboBox1, textBox1, comboBox2, textBox6, button1, button4); //bloquea los componentes
        }

        //Boton buscar cliente
        private void button1_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == "") //Si no hay texto para buscar
            {
                MessageBox.Show("No hay ninguna identificación para buscar.", "Error de solicitud", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            else //Si hay texto para buscar
            {
                if (mcl.buscarID(textBox1.Text) == 1) //si el cliente está registrado
                {
                    MessageBox.Show("Cliente encontrado, ahora puede buscar sus cuentas.", "Estado", MessageBoxButtons.OK);
                    comboBox2.Items.Clear(); //borra los items del combo cuentas
                    mcu.cargarComboCuentas(comboBox2, textBox1.Text); //carga las cuentas del cliente encontrado en el combo cuentas
                    cc.DesbloquearObjetosConsultar(comboBox1, textBox1, comboBox2, textBox6, button1, button4); //Desbloquea los objetos
                    textBox6.Focus();
                }
                else //Si el cliente no está registro
                {
                    MessageBox.Show("No existe ningún cliente bajo esta identificación.", "Estado", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }
            }
        }

        //boton buscar cuenta
        private void button4_Click(object sender, EventArgs e)
        {
            if (textBox6.Text == "") //si el texto cuenta esta vacio
            {
                MessageBox.Show("No hay ninguna cuenta para buscar.", "Error de solicitud", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            else //Si hay datos en el texto cuenta
            {
                if (mcl.buscarID(textBox1.Text) == 1) //busca si el cliente esta registrado
                {
                    string numcuenta, cuenta; //define dos variables, en una se guarda todo el item del combo y en la otra solo la id de cuenta
                    int[] list = new int[comboBox2.Items.Count]; //define una lista del tamaño del combo box
                    int vecl = list.Length; //vecl es igual al tamaño de la lista
                    //ciclo que corre las mismas veces que el tamaño del combo
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
                        cc.BloquearTodoConsultar(comboBox1, textBox1, comboBox2, textBox6, button1, button4);
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
            cc.BloquearObjetosConsultar(comboBox1, textBox1, comboBox2, textBox6, button1, button4);
            cc.LimpiarTodoConsultar(textBox1, comboBox2, textBox2, textBox3, textBox4, textBox5, textBox6, textBox7);
        }

        //boton consultar otra cuenta
        private void button2_Click(object sender, EventArgs e)
        {
            //Si se está buscando una cuenta el button1 debería estar en false, si no está en true}
            //Verifica si se está buscando una cuenta
            if (button1.Enabled == false)
            {
                cc.DesbloquearObjetosConsultar(comboBox1, textBox1, comboBox2, textBox6, button1, button4);
                cc.LimpiarConsultar(textBox6, textBox3, textBox4, textBox5, textBox2, textBox7);
            }
        }

        //Cuando se cambia el combo
        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            //Pone en el textbox lo que se eligio en el combo
            textBox1.Text = comboBox1.Text;
        }
        private void comboBox2_SelectedIndexChanged(object sender, EventArgs e)
        {
            textBox6.Text = comboBox2.Text;
        }

        //Boton regresar
        private void button5_Click(object sender, EventArgs e)
        {
            VistaPrincipal.MenuPrincipal nw = new VistaPrincipal.MenuPrincipal();
            this.Hide();
            nw.Show();
        }

        //Cuando el usuario cierra el programa
        private void ConsultarCuentas_FormClosing(object sender, FormClosingEventArgs e)
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
