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
    public partial class RegistrarUsuarios : Form
    {
        ModeloNivFun mn = new ModeloNivFun();
        ModeloUsuarios mu = new ModeloUsuarios();
        ControlUsuarios cu = new ControlUsuarios();
        ModeloBitacora mb = new ModeloBitacora();

        ToolTip tip1 = new ToolTip();
        public int Nombre = 0, Passw = 0;
        public RegistrarUsuarios()
        {
            InitializeComponent();
            mn.cargarComboNiveles(comboBox1);
            dateTimePicker1.Value = DateTime.Now;

            pictureBox1.Image = null;
            pictureBox2.Image = null;

            tip1.SetToolTip(button1, "Mostrar / Ocultar contraseña");
            tip1.SetToolTip(button5, "Regresar al menú");
        }

        private void RegistrarUsuarios_FormClosing(object sender, FormClosingEventArgs e)
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

        private void button6_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == "" || textBox2.Text == "" || textBox3.Text == "" || textBox4.Text == "" || textBox5.Text == "" || comboBox1.Text == "")
            {
                MessageBox.Show("Faltan datos por completar.", "Error de solicitud", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            else if (Nombre == 0 || Passw == 0)
            {
                if (Nombre == 0)
                    MessageBox.Show(tip1.GetToolTip(pictureBox1), "Error de solicitud", MessageBoxButtons.OK, MessageBoxIcon.Error);
                if (Passw == 0)
                    MessageBox.Show(tip1.GetToolTip(pictureBox2), "Error de solicitud", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            else
            {
                mu.registrarUser(textBox3.Text, textBox4.Text, textBox5.Text, dateTimePicker1.Value, textBox1.Text, textBox2.Text, comboBox1.Text, "Activo");

                mu.odataAdapter.InsertCommand.Parameters["@ide"].Value = this.textBox3.Text;
                mu.odataAdapter.InsertCommand.Parameters["@nombre"].Value = this.textBox4.Text;
                mu.odataAdapter.InsertCommand.Parameters["@apel"].Value = this.textBox5.Text;
                mu.odataAdapter.InsertCommand.Parameters["@fecha"].Value = this.dateTimePicker1.Value;
                mu.odataAdapter.InsertCommand.Parameters["@user"].Value = this.textBox1.Text;
                mu.odataAdapter.InsertCommand.Parameters["@pass"].Value = this.textBox2.Text;
                mu.odataAdapter.InsertCommand.Parameters["@nivel"].Value = this.comboBox1.Text;
                mu.odataAdapter.InsertCommand.Parameters["@estado"].Value = "Activo";

                mu.conexion.Open();
                mu.odataAdapter.InsertCommand.ExecuteNonQuery();
                mu.conexion.Close();

                mb.ingresarBitacora(DateTime.Now, "Registró al usuario: "+textBox1.Text, VistaPrincipal.IniciarSesion.Username);

                mb.odataAdapter.InsertCommand.Parameters["@fecha"].Value = DateTime.Now;
                mb.odataAdapter.InsertCommand.Parameters["@desc"].Value = "Registró al usuario: "+textBox1.Text;
                mb.odataAdapter.InsertCommand.Parameters["@user"].Value = VistaPrincipal.IniciarSesion.Username;

                mb.conexion.Open();
                mb.odataAdapter.InsertCommand.ExecuteNonQuery();
                mb.conexion.Close();

                MessageBox.Show("El usuario fue registrado correctamente.", "Estado", MessageBoxButtons.OK);

                button3.PerformClick();
            }
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

        private void textBox1_TextChanged(object sender, EventArgs e)
        {
            if (textBox1.Text.Contains(' ') || textBox1.Text.Contains(' '))
            {
                pictureBox1.Image = global::Cotidiano3_Felix.Properties.Resources.Red_X;
                tip1.SetToolTip(pictureBox1, "El nombre de usuario no puede contener espacios");
                Nombre = 0;
            }
            else if (textBox1.Text.Length < 3)
            {
                pictureBox1.Image = global::Cotidiano3_Felix.Properties.Resources.Red_X;
                tip1.SetToolTip(pictureBox1, "El nombre de usuario tiene que ser de 3 caracteres mínimo");
                Nombre = 0;
            }
            else if (textBox1.Text.Length > 16)
            {
                pictureBox1.Image = global::Cotidiano3_Felix.Properties.Resources.Red_X;
                tip1.SetToolTip(pictureBox1, "El nombre de usuario no puede pasar de 16 caracteres");
                Nombre = 0;
            }
            else if (mu.buscarUser(textBox1.Text) == 1)
            {
                pictureBox1.Image = global::Cotidiano3_Felix.Properties.Resources.Red_X;
                tip1.SetToolTip(pictureBox1, "El nombre de usuario ya está en uso");
                Nombre = 0;
            }
            else
            {
                pictureBox1.Image = global::Cotidiano3_Felix.Properties.Resources.Green_Check;
                tip1.SetToolTip(pictureBox1, "El nombre de usuario puede usarse");
                Nombre = 1;
            }
        }

        private void button3_Click(object sender, EventArgs e)
        {
            Nombre = 0; Passw = 0;
            cu.LimpiarRegistrar(textBox1, textBox2, textBox3, textBox4, textBox5, button1, pictureBox1, pictureBox2);
            tip1.SetToolTip(pictureBox1, "");
            tip1.SetToolTip(pictureBox2, "");
        }

        private void button5_Click(object sender, EventArgs e)
        {
            VistaPrincipal.MenuPrincipal nw = new VistaPrincipal.MenuPrincipal();
            this.Hide();
            nw.Show();
        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {
            if (textBox2.Text.Contains(' ') || textBox2.Text.Contains(' '))
            {
                pictureBox2.Image = global::Cotidiano3_Felix.Properties.Resources.Red_X;
                tip1.SetToolTip(pictureBox2, "La contraseña no puede contener espacios");
                Passw = 0;
            }
            else if (textBox2.Text == "root")
            {
                pictureBox2.Image = global::Cotidiano3_Felix.Properties.Resources.Cyan_Check;
                tip1.SetToolTip(pictureBox2, "Electus Venit");
                Passw = 1;
            }
            else if (textBox2.Text.Length < 6)
            {
                pictureBox2.Image = global::Cotidiano3_Felix.Properties.Resources.Red_X;
                tip1.SetToolTip(pictureBox2, "La contraseña tiene que ser de 6 caracteres mínimo");
                Passw = 0;
            }
            else if (textBox2.Text.Length > 16)
            {
                pictureBox2.Image = global::Cotidiano3_Felix.Properties.Resources.Red_X;
                tip1.SetToolTip(pictureBox2, "La contraseña no puede pasar de 16 caracteres");
                Passw = 0;
            }
            else if (mu.ContraseñasMalas(textBox2.Text) == 1)
            {
                pictureBox2.Image = global::Cotidiano3_Felix.Properties.Resources.Red_X;
                tip1.SetToolTip(pictureBox2, "La contraseña es MUY vulnerable");
                Passw = 0;
            }
            else
            {
                pictureBox2.Image = global::Cotidiano3_Felix.Properties.Resources.Green_Check;
                tip1.SetToolTip(pictureBox2, "La contraseña puede usarse");
                Passw = 1;
            }
        }
    }
}
