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

namespace Cotidiano3_Felix.MantenimientoUsuarios
{
    public partial class ConsultarUsuarios : Form
    {
        ModeloUsuarios mu = new ModeloUsuarios();
        ControlUsuarios cu = new ControlUsuarios();
        ModeloNivFun mn = new ModeloNivFun();
        ModeloBitacora mb = new ModeloBitacora();

        public ConsultarUsuarios()
        {
            InitializeComponent();
        }

        private void ConsultarUsuarios_FormClosing(object sender, FormClosingEventArgs e)
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

        private void button5_Click(object sender, EventArgs e)
        {
            VistaPrincipal.MenuPrincipal nw = new VistaPrincipal.MenuPrincipal();
            this.Hide();
            nw.Show();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (textBox2.PasswordChar == '*')
            {
                textBox2.PasswordChar = '\0';
                button1.Image = global::Cotidiano3_Felix.Properties.Resources.White_Eye_Closed;
            }
            else
            {
                textBox2.PasswordChar = '*';
                button1.Image = global::Cotidiano3_Felix.Properties.Resources.White_Eye_Open;
            }
        }

        private void button3_Click(object sender, EventArgs e)
        {
            cu.LimpiarConsultar(textBox1, textBox2, textBox3, textBox4, textBox5, textBox6, textBox7, textBox8, button1);
            button2.Enabled = true;
            textBox1.ReadOnly = false;
        }

        private void button2_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == "")
            {
                MessageBox.Show("No ha ingresado ningún nombre de usuario.", "Error de solicitud", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            else if (textBox1.Text.Contains(' '))
                MessageBox.Show("El nombre de usuario no puede contener espacios", "Error de solicitud", MessageBoxButtons.OK, MessageBoxIcon.Error);
            else if (textBox1.Text.Length < 3)
                MessageBox.Show("El nombre de usuario tiene 3 caracteres como minimo", "Error de solicitud", MessageBoxButtons.OK, MessageBoxIcon.Error);
            else if (textBox1.Text.Length > 16)
                MessageBox.Show("El nombre de usuario no puede pasarse de los 16 caracteres", "Error de solicitud", MessageBoxButtons.OK, MessageBoxIcon.Error);
            else
            {
                if (mu.buscarUser(textBox1.Text) == 1)
                {
                    MessageBox.Show("Usuario encontrado, se mostrarán sus datos.", "Estado", MessageBoxButtons.OK);
                    mu.mostrarDatos(textBox1.Text, textBox2, textBox3, textBox4, textBox5, textBox6, textBox7, textBox8);
                    button2.Enabled = false;
                    textBox1.ReadOnly = true;
                    textBox6.Text = textBox6.Text + " - " + mn.getNivNombre(textBox6.Text);
                }
                else
                    MessageBox.Show("El usuario no existe", "Error de solicitud", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }
    }
}
