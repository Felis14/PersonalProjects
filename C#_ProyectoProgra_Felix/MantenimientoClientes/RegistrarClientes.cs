using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using Cotidiano3_Felix.Modelos; //Importa las carpetas necesarias
using Cotidiano3_Felix.Controles;
using Cotidiano3_Felix.Conexion_DB;
using Cotidiano3_Felix;

namespace Cotidiano3_Felix.MantenimientoClientes
{
    public partial class RegistrarClientes : Form
    {
        //Instancia las clases a utilizar
        ModeloClientes mc = new ModeloClientes();
        ControlClientes cc = new ControlClientes();
        ModeloBitacora mb = new ModeloBitacora();
        Conexion_DB.Conexion_DB cn = new Conexion_DB.Conexion_DB();
        public RegistrarClientes()
        {
            InitializeComponent();
            dateTimePicker1.Value = DateTime.Now; //pone el dia actual como valor en el datepicker
        }

        //Boton buscar
        private void button1_Click(object sender, EventArgs e)
        {
            if (!textBox1.Text.Equals("")) //si hay texto en el textbox de ide
            {
                if (mc.buscarID(textBox1.Text) == 1) //busca la identificacion y si la encuentra tira error al no poderse registrar (ya está en uso la id)
                {
                    MessageBox.Show("Identificación ya registrada.", "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }
                else
                {
                    //Habilita los campos para poder ingresar los datos
                    MessageBox.Show("La identificación no está en el sistema, puede registrarla.", "Estado");
                    cc.AlternarObjetosBuscar(textBox1, textBox2, textBox3, textBox4, textBox5, dateTimePicker1, button1, button2);
                }
            } 
            else //no hay texto en el textbox de ide
            {
                MessageBox.Show("No hay datos para buscar.", "Error de Solicitud");
            }
        }

        //Boton limpiar
        private void button3_Click(object sender, EventArgs e)
        {
            cc.LimpiarObjetosBuscar(textBox1, textBox2, textBox3, textBox4, textBox5);
            cc.BloquearObjetosBuscar(textBox1, textBox2, textBox3, textBox4, textBox5, dateTimePicker1, button1, button2);
        }

        //Boton registrar
        private void button2_Click(object sender, EventArgs e)
        {
            //verifica si minimo uno de los campos está vacio
            if (textBox2.Text.Equals("") || textBox3.Text.Equals("") || textBox4.Text.Equals("") || textBox5.Text.Equals(""))
            {
                MessageBox.Show("Faltan datos por llenar.", "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            else //si ninguno de los campos esta vacio
            {
                //define el query para registrar un cliente
                mc.registrarCliente(textBox1.Text, textBox2.Text, textBox3.Text, textBox4.Text, textBox5.Text, dateTimePicker1.Value);
                //asigna cada valor a cada parametro
                mc.odataAdapter.InsertCommand.Parameters["@ide"].Value = this.textBox1.Text;
                mc.odataAdapter.InsertCommand.Parameters["@nombre"].Value = this.textBox2.Text;
                mc.odataAdapter.InsertCommand.Parameters["@tel"].Value = this.textBox3.Text;
                mc.odataAdapter.InsertCommand.Parameters["@dir"].Value = this.textBox4.Text;
                mc.odataAdapter.InsertCommand.Parameters["@email"].Value = this.textBox5.Text;
                mc.odataAdapter.InsertCommand.Parameters["@fechareg"].Value = this.dateTimePicker1.Value;
                //abre la conexion, ejecuta el query y cierra la conexion
                mc.conexion.Open();
                mc.odataAdapter.InsertCommand.ExecuteNonQuery();
                mc.conexion.Close();

                //registra en bitacora el cambio que se hizo
                mb.ingresarBitacora(DateTime.Now, "Registró a Cliente: "+textBox1.Text, VistaPrincipal.IniciarSesion.Username);

                mb.odataAdapter.InsertCommand.Parameters["@fecha"].Value = DateTime.Now;
                mb.odataAdapter.InsertCommand.Parameters["@desc"].Value = "Registró a Cliente: "+textBox1.Text;
                mb.odataAdapter.InsertCommand.Parameters["@user"].Value = VistaPrincipal.IniciarSesion.Username;

                mb.conexion.Open();
                mb.odataAdapter.InsertCommand.ExecuteNonQuery();
                mb.conexion.Close();

                MessageBox.Show("Cliente registrado exitosamente.", "Estado");
                cc.LimpiarObjetosBuscar(textBox1, textBox2, textBox3, textBox4, textBox5);
                cc.AlternarObjetosBuscar(textBox1, textBox2, textBox3, textBox4, textBox5, dateTimePicker1, button1, button2);
            }
        }

        private void button4_Click(object sender, EventArgs e)
        {
            VistaPrincipal.MenuPrincipal nw = new VistaPrincipal.MenuPrincipal();
            this.Hide();
            nw.Show();
        }

        private void RegistrarClientes_FormClosing(object sender, FormClosingEventArgs e)
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
