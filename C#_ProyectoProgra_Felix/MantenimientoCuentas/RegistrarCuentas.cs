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
    public partial class RegistrarCuentas : Form
    {
        //Se instancian todas las clases que se van a utilizar
        ModeloClientes mcl = new ModeloClientes();
        ModeloCuentas mcu = new ModeloCuentas();
        ControlCuentas cc = new ControlCuentas();
        ModeloBitacora mb = new ModeloBitacora();
        public RegistrarCuentas()
        {
            InitializeComponent();
            //Bloquea los componentes
            cc.BloquearObjetosRegistrar(comboBox1, textBox1, textBox2,textBox4, dateTimePicker1, button1, button2);
            mcl.cargarComboClientes(comboBox1); //carga los clientes en el combo clientes
            dateTimePicker1.Value = DateTime.Now; //asigna al datepicker la fecha actual
        }

        //Boton buscar
        private void button1_Click(object sender, EventArgs e)
        {
            if (!textBox1.Text.Equals("")) //si hay texto en el campo
            {
                if (mcl.buscarID(textBox1.Text) == 0) //si no encuentra el cliente
                {
                    MessageBox.Show("No existe ningún cliente bajo esa identificación.", "Error");
                }
                else //si SÍ encuentra el cliente
                {
                    MessageBox.Show("Identificación encontrada.\nSe registrará la cuenta bajo ese cliente.", "Estado");
                    //Desbloquea los objetos para que se pueda ingresar los datos y registrar una cuenta
                    cc.DesbloquearObjetosRegistrar(comboBox1, textBox1, textBox2, textBox4, dateTimePicker1, button1, button2);
                }
            }
            else //si el texto está vacio
            {
                MessageBox.Show("No hay datos para buscar.", "Error de Solicitud");
            }
        }

        //Boton limpiar
        private void button3_Click(object sender, EventArgs e)
        {
            //Limpia los campos y vuelve a bloquear los componentes
            cc.BloquearObjetosRegistrar(comboBox1, textBox1, textBox2, textBox4, dateTimePicker1, button1, button2);
            cc.LimpiarObjetosRegistrar(textBox1, textBox2, textBox4);
        }

        //boton registrar
        private void button2_Click(object sender, EventArgs e)
        {
            if (textBox2.Text.Equals("") || textBox4.Text.Equals("")) //Si alguno de los campos está vacio
            {
                MessageBox.Show("Faltan datos por llenar.", "Error");
            }
            else //Si todos los campos tiene informacion
            {
                if (mcu.buscarCuenta(textBox2.Text) == 0) //si la cuenta no existe
                {
                    //construye el query para registrar la cuenta
                    mcu.registrarCuenta(textBox2.Text, dateTimePicker1.Value, "Activa", Convert.ToDouble(textBox4.Text), textBox1.Text);

                    mcu.odataAdapter.InsertCommand.Parameters["@numcu"].Value = this.textBox2.Text;
                    mcu.odataAdapter.InsertCommand.Parameters["@fecha"].Value = this.dateTimePicker1.Value;
                    mcu.odataAdapter.InsertCommand.Parameters["@estado"].Value = "Activa";
                    mcu.odataAdapter.InsertCommand.Parameters["@MontoLi"].Value = this.textBox4.Text;
                    mcu.odataAdapter.InsertCommand.Parameters["@ID"].Value = this.textBox1.Text;
                    //Ejecuta el registrar cuenta
                    mcu.conexion.Open();
                    mcu.odataAdapter.InsertCommand.ExecuteNonQuery();
                    mcu.conexion.Close();

                    //Agrega la bitacora
                    mb.ingresarBitacora(DateTime.Now, "Registró la cuenta: "+textBox2.Text, VistaPrincipal.IniciarSesion.Username);

                    mb.odataAdapter.InsertCommand.Parameters["@fecha"].Value = DateTime.Now;
                    mb.odataAdapter.InsertCommand.Parameters["@desc"].Value = "Registró la cuenta: "+textBox2.Text;
                    mb.odataAdapter.InsertCommand.Parameters["@user"].Value = VistaPrincipal.IniciarSesion.Username;

                    mb.conexion.Open();
                    mb.odataAdapter.InsertCommand.ExecuteNonQuery();
                    mb.conexion.Close();

                    MessageBox.Show("Cliente registrado exitosamente.", "Estado");
                    cc.BloquearObjetosRegistrar(comboBox1, textBox1, textBox2, textBox4, dateTimePicker1, button1, button2);
                    cc.LimpiarObjetosRegistrar(textBox1, textBox2, textBox4);
                } 
                else //Si ya existe la cuenta
                {
                    MessageBox.Show("Ya hay una cuenta bajo esta identificación númerica.", "Error de Solicitud", MessageBoxButtons.OK, MessageBoxIcon.Error);
                    textBox2.Focus();
                }
            }
        }

        private void button4_Click(object sender, EventArgs e)
        {
            VistaPrincipal.MenuPrincipal nw = new VistaPrincipal.MenuPrincipal();
            this.Hide();
            nw.Show();
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            textBox1.Text = comboBox1.Text;
        }

        private void RegistrarCuentas_FormClosing(object sender, FormClosingEventArgs e)
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
