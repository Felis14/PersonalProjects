using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using Cotidiano3_Felix.Modelos; //Se importan todos las carpetas necesarias
using Cotidiano3_Felix.Controles;

namespace Cotidiano3_Felix.MantenimientoClientes
{
    public partial class ConsultarClientes : Form
    {
        //Se instancian los modelos y los controles
        ControlClientes cc = new ControlClientes();
        ModeloClientes mc = new ModeloClientes();
        ModeloBitacora mb = new ModeloBitacora();
        public ConsultarClientes()
        {
            InitializeComponent();
            mc.cargarComboClientes(comboBox1); //Carga todos los clientes en la base en un comboBox
        }

        //Boton buscar
        private void button1_Click(object sender, EventArgs e)
        {
            if (mc.buscarID(textBox1.Text) == 0) //no encuentra el cliente a buscar
            {
                MessageBox.Show("El cliente no está registrado.", "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            else //Sí en cuentra el cliente a buscar
            {
                cc.LimpiarObjetosBuscar(textBox2, textBox3, textBox4, textBox5, textBox6);
                MessageBox.Show("Cliente encontrado.\nSus datos serán mostrados.", "Estado", MessageBoxButtons.OK, MessageBoxIcon.None);
                mc.mostrarDatos(Convert.ToString(textBox1.Text), textBox2, textBox3, textBox4, textBox5, textBox6);
            }
        }

        //Si se cambia el item en el comboBox
        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            //Pone lo que tiene el combo (la identificacion) en el textbox de ID
            textBox1.Text = comboBox1.Text;
        }

        //Boton limpiar
        private void button3_Click(object sender, EventArgs e)
        {
            cc.LimpiarObjetosConsultar(textBox1, textBox2, textBox3, textBox4, textBox5, textBox6);
        }

        //Boton regresar
        private void button4_Click(object sender, EventArgs e)
        {
            //Oculta este formulario y abre el de menu
            VistaPrincipal.MenuPrincipal nw = new VistaPrincipal.MenuPrincipal();
            this.Hide();
            nw.Show();
        }

        //Cuando el programa se cierra
        private void ConsultarClientes_FormClosed(object sender, FormClosedEventArgs e)
        {
            //Si se cerró porque el usuario le dio X
            //Esto se hace ya que cuando se cambia entre formularios usando .Hide() y .Show() lo toma como si se cerrara, por lo que
            //se agrega una condicion si fue el usuario quien cerró el formulario
            if (e.CloseReason == CloseReason.UserClosing)
            {
                //Ingresa datos en bitacora
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
