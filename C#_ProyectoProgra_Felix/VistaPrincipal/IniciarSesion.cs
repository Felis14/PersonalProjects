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

namespace Cotidiano3_Felix.VistaPrincipal
{
    public partial class IniciarSesion : Form
    {
        ModeloUsuarios mu = new ModeloUsuarios();
        ModeloBitacora mb = new ModeloBitacora();

        public static String Username, Nivel;

        public IniciarSesion()
        {
            InitializeComponent();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            textBox1.Text = "";
            textBox2.Text = "";
            textBox2.PasswordChar = '*';
            button3.Image = global::Cotidiano3_Felix.Properties.Resources.White_Eye_Open;
        }

        private void IniciarSesion_FormClosing(object sender, FormClosingEventArgs e)
        {
            Application.Exit();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            if (textBox2.PasswordChar == '*')
            {
                textBox2.PasswordChar = '\0';
                button3.Image = global::Cotidiano3_Felix.Properties.Resources.White_Eye_Closed;
            }
            else
            {
                textBox2.PasswordChar = '*';
                button3.Image = global::Cotidiano3_Felix.Properties.Resources.White_Eye_Open;
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == "" || textBox2.Text == "")
            {
                MessageBox.Show("Faltan datos por completar.", "Error de solicitud", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            else if (textBox1.Text.Contains(' ') || textBox1.Text.Contains(' '))
            {
                MessageBox.Show("El nombre de usuario no puede contener espacios", "Error de solicitud", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            else if (textBox1.Text.Length < 3)
            {
                MessageBox.Show("El nombre de usuario tiene que ser de 3 caracteres mínimo", "Error de solicitud", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            else if (textBox1.Text.Length > 16)
            {
                MessageBox.Show("El nombre de usuario no puede pasar de 16 caracteres", "Error de solicitud", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            else if (textBox2.Text.Contains(' ') || textBox2.Text.Contains(' '))
            {
                MessageBox.Show("La contraseña no puede contener espacios", "Error de solicitud", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            else if (textBox2.Text.Length < 6 && textBox2.Text != ("root"))
            {
                MessageBox.Show("La contraseña tiene que ser de 6 caracteres mínimo", "Error de solicitud", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            else if (textBox2.Text.Length > 16)
            {
                MessageBox.Show("La contraseña no puede pasar de 16 caracteres", "Error de solicitud", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            else
            {
                if (mu.buscarUser(textBox1.Text) == 1 && mu.getEstado(textBox1.Text) == "Activo" && textBox2.Text == mu.getPass(textBox1.Text))
                {
                    Username = textBox1.Text;
                    Nivel = mu.getNivel(textBox1.Text);

                    Console.WriteLine("Iniciando sesion con el usuario " + Username + " de nivel " + Nivel);

                    mb.ingresarBitacora(DateTime.Now, "Inicio Sesión", Username);

                    mb.odataAdapter.InsertCommand.Parameters["@fecha"].Value = DateTime.Now;
                    mb.odataAdapter.InsertCommand.Parameters["@desc"].Value = "Inicio Sesión";
                    mb.odataAdapter.InsertCommand.Parameters["@user"].Value = Username;

                    mb.conexion.Open();
                    mb.odataAdapter.InsertCommand.ExecuteNonQuery();
                    mb.conexion.Close();

                    MenuPrincipal nw = new MenuPrincipal();
                    this.Hide();
                    nw.Show();
                }
                else if (mu.buscarUser(textBox1.Text) == 1 && mu.getEstado(textBox1.Text) == "Activo" && textBox2.Text != mu.getPass(textBox1.Text))
                {
                    MessageBox.Show("La contraseña es incorrecta.", "Error de solicitud", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }
                else if (mu.buscarUser(textBox1.Text) == 1 && mu.getEstado(textBox1.Text) == "Inactivo")
                {
                    MessageBox.Show("El usuario está inactivo, no puede ingresar.", "Error de solicitud", MessageBoxButtons.OK);
                }
                else
                {
                    MessageBox.Show("El usuario no existe.", "Error de solicitud", MessageBoxButtons.OK);
                }
            }
        }
    }
}
