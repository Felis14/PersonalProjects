using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using Cotidiano3_Felix.Controles; //se importan las carpetas necesarias
using Cotidiano3_Felix.Modelos;

namespace Cotidiano3_Felix.MantenimientoClientes
{
    public partial class ModificarClientes : Form
    {
        //Se instancian los modelos y controles a utilizar
        ModeloClientes mc = new ModeloClientes();
        ControlClientes cc = new ControlClientes();
        ModeloBitacora mb = new ModeloBitacora();
        public ModificarClientes()
        {
            InitializeComponent();
            mc.cargarComboClientes(comboBox1); //carga todos los clientes en el comboBox
            cc.BloquearObjetosModificar(textBox1, textBox2, textBox3, textBox4, textBox5, dateTimePicker1, button1, button2); //bloquea los componentes del form
        }

        //Boton Buscar
        private void button1_Click(object sender, EventArgs e)
        {
            if (mc.buscarID(textBox1.Text) == 0) //Si no lo encuentra
            {
                MessageBox.Show("El cliente no está registrado.", "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            else //Si lo encuentra
            {
                cc.LimpiarObjetosBuscar(textBox2, textBox3, textBox4, textBox5, textBox5); //Limpia los objetos
                MessageBox.Show("Cliente encontrado.\nSus datos pueden ser modificados.", "Estado", MessageBoxButtons.OK, MessageBoxIcon.None);
                mc.mostrarDatosMod(Convert.ToString(textBox1.Text), textBox2, textBox3, textBox4, textBox5, dateTimePicker1); //muestra los datos del cliente
                //Desbloquea los campos para que el cliente pueda ser modificado
                cc.DesbloquearObjetosModificar(textBox1, textBox2, textBox3, textBox4, textBox5, dateTimePicker1, button1, button2);
            }
        }

        //Si se cambia el item del combobox
        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            //Pone la identificacion elegida en el combobox en el campo texto de identificacion
            textBox1.Text = comboBox1.Text;
        }

        //Boton modificar
        private void button2_Click(object sender, EventArgs e)
        {
            //Muestra un mensaje de confirmacion si quiere modificar los datos del cliente, si responde que sí entonces la condicion de este if es verdadera
            if (MessageBox.Show("¿Está seguro de modificar los datos del cliente?", "Confirmación", MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.Yes)
            {
                //crea el query para modificar el cliente
                mc.modificarcliente(textBox1.Text, textBox2.Text, textBox3.Text, textBox4.Text, textBox5.Text, dateTimePicker1.Value);
                //asigna cada valor a cada parametro
                mc.odataAdapter.UpdateCommand.Parameters["@Nombre"].Value = this.textBox2.Text;
                mc.odataAdapter.UpdateCommand.Parameters["@Tel"].Value = this.textBox3.Text;
                mc.odataAdapter.UpdateCommand.Parameters["@Dir"].Value = this.textBox4.Text;
                mc.odataAdapter.UpdateCommand.Parameters["@Email"].Value = this.textBox5.Text;
                mc.odataAdapter.UpdateCommand.Parameters["@fechareg"].Value = this.dateTimePicker1.Value;
                //abre la conexion, ejecuta el query y cierra lo conexion
                mc.conexion.Open();
                mc.odataAdapter.UpdateCommand.ExecuteNonQuery();
                mc.conexion.Close();

                //crea el query para agregar el cambio en la bitacora
                mb.ingresarBitacora(DateTime.Now, "Modificó al Cliente: "+textBox1.Text, VistaPrincipal.IniciarSesion.Username);
                //asigna cada valor a cada parametro
                mb.odataAdapter.InsertCommand.Parameters["@fecha"].Value = DateTime.Now;
                mb.odataAdapter.InsertCommand.Parameters["@desc"].Value = "Modificó al Cliente: "+textBox1.Text;
                mb.odataAdapter.InsertCommand.Parameters["@user"].Value = VistaPrincipal.IniciarSesion.Username;
                //abre la conexion, ejecuta el query y cierra la conexion
                mb.conexion.Open();
                mb.odataAdapter.InsertCommand.ExecuteNonQuery();
                mb.conexion.Close();

                MessageBox.Show("El cliente fue actualizado.", "Estado", MessageBoxButtons.OK, MessageBoxIcon.None);
            }
            else //si se responde que no en el cuadro de mensaje
            {
                MessageBox.Show("El cliente no fue modificado.", "Estado", MessageBoxButtons.OK, MessageBoxIcon.None);
                cc.LimpiarObjetosBuscar(textBox1, textBox2, textBox3, textBox4, textBox5);
                cc.BloquearObjetosModificar(textBox1, textBox2, textBox3, textBox4, textBox5, dateTimePicker1, button1, button2);
            }
        }

        //Boton limpiar
        private void button3_Click(object sender, EventArgs e)
        {
            cc.LimpiarObjetosBuscar(textBox1, textBox2, textBox3, textBox4, textBox5);
            cc.BloquearObjetosModificar(textBox1, textBox2, textBox3, textBox4, textBox5, dateTimePicker1, button1, button2);
        }

        //Boton regresar
        private void button4_Click(object sender, EventArgs e)
        {
            VistaPrincipal.MenuPrincipal nw = new VistaPrincipal.MenuPrincipal();
            this.Hide();
            nw.Show();
        }

        private void ModificarClientes_FormClosing(object sender, FormClosingEventArgs e)
        {
            //Si el usuario cierra el formulario, registra que cerró sesion y cierra el programa
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
