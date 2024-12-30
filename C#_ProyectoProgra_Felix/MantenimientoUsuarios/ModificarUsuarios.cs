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
    public partial class ModificarUsuarios : Form
    {
        ModeloUsuarios mu = new ModeloUsuarios();
        ControlUsuarios cu = new ControlUsuarios();
        ModeloNivFun mn = new ModeloNivFun();
        ModeloBitacora mb = new ModeloBitacora();

        String passw;
        ToolTip tip1 = new ToolTip();
        int Pass;

        public ModificarUsuarios()
        {
            InitializeComponent();
            mn.cargarComboNiveles(comboBox1);
            cu.BloquearObjetosModificar(textBox1, textBox2, textBox3, textBox4, textBox5, button2, button1, button6);
            pictureBox2.Image = null;
        }

        private void ModificarUsuarios_FormClosing(object sender, FormClosingEventArgs e)
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
            cu.LimpiarModificar(textBox1, textBox2, textBox3, textBox4, textBox5, pictureBox2, button1);
            cu.BloquearObjetosModificar(textBox1, textBox2, textBox3, textBox4, textBox5, button2, button1, button6);
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
                    MessageBox.Show("Usuario encontrado, puede ser modificado.", "Estado", MessageBoxButtons.OK);
                    mu.mostrarDatosMod(textBox1.Text, textBox2, textBox3, textBox4, textBox5, comboBox1);
                    cu.DesbloquearObjetosModificar(textBox1, textBox2, textBox3, textBox4, textBox5, button2, button1, button6);
                    passw = textBox2.Text;
                    Pass = 1;
                    textBox1.Focus();
                }
                else
                    MessageBox.Show("El usuario no existe.", "Error de solicitud", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }

        private void button6_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == "" || textBox2.Text == "" || textBox3.Text == "" || textBox4.Text == "" || textBox5.Text == "" || comboBox1.Text == "")
            {
                MessageBox.Show("Faltan datos por rellenar", "Error de solicitud", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            else if (Pass == 0)
                MessageBox.Show(tip1.GetToolTip(pictureBox2), "Error de solicitud", MessageBoxButtons.OK, MessageBoxIcon.Error);
            else if (MessageBox.Show("¿Está segur@ que desea modificar al usuario?", "Confirmación", MessageBoxButtons.YesNo, MessageBoxIcon.Warning) == DialogResult.Yes)
            {
                mu.modificarUsuario(textBox1.Text, textBox2.Text, Convert.ToInt32(textBox3.Text), textBox4.Text, textBox5.Text, comboBox1.Text);

                mu.odataAdapter.UpdateCommand.Parameters["@pass"].Value = this.textBox2.Text;
                mu.odataAdapter.UpdateCommand.Parameters["@ide"].Value = Convert.ToInt32(this.textBox3.Text);
                mu.odataAdapter.UpdateCommand.Parameters["@nombre"].Value = this.textBox4.Text;
                mu.odataAdapter.UpdateCommand.Parameters["@apel"].Value = this.textBox5.Text;
                mu.odataAdapter.UpdateCommand.Parameters["@nivel"].Value = this.comboBox1.Text;

                mu.conexion.Open();
                mu.odataAdapter.UpdateCommand.ExecuteNonQuery();
                mu.conexion.Close();

                mb.ingresarBitacora(DateTime.Now, "Modificó al usuario: "+textBox1.Text, VistaPrincipal.IniciarSesion.Username);

                mb.odataAdapter.InsertCommand.Parameters["@fecha"].Value = DateTime.Now;
                mb.odataAdapter.InsertCommand.Parameters["@desc"].Value = "Modificó al usuario: "+textBox1.Text;
                mb.odataAdapter.InsertCommand.Parameters["@user"].Value = VistaPrincipal.IniciarSesion.Username;

                mb.conexion.Open();
                mb.odataAdapter.InsertCommand.ExecuteNonQuery();
                mb.conexion.Close();

                MessageBox.Show("El usuario fue modificado correctamente.", "Estado", MessageBoxButtons.OK);
                cu.BloquearObjetosModificar(textBox1, textBox2, textBox3, textBox4, textBox5, button2, button1, button6);
                cu.LimpiarModificar(textBox1, textBox2, textBox3, textBox4, textBox5, pictureBox2, button1);

            }
            else
                MessageBox.Show("El usuario no fue modificado.", "Estado", MessageBoxButtons.OK);
        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {
            if (textBox2.Text.Contains(' ') || textBox2.Text.Contains(' '))
            {
                pictureBox2.Image = global::Cotidiano3_Felix.Properties.Resources.Red_X;
                tip1.SetToolTip(pictureBox2, "La contraseña no puede contener espacios");
                Pass = 0;
            }
            else if (textBox2.Text == "root")
            {
                pictureBox2.Image = global::Cotidiano3_Felix.Properties.Resources.Cyan_Check;
                tip1.SetToolTip(pictureBox2, "Electus Venit");
                Pass = 1;
            }
            else if (textBox2.Text.Length < 6)
            {
                pictureBox2.Image = global::Cotidiano3_Felix.Properties.Resources.Red_X;
                tip1.SetToolTip(pictureBox2, "La contraseña tiene que ser de 6 caracteres mínimo");
                Pass = 0;
            }
            else if (textBox2.Text.Length > 16)
            {
                pictureBox2.Image = global::Cotidiano3_Felix.Properties.Resources.Red_X;
                tip1.SetToolTip(pictureBox2, "La contraseña no puede pasar de 16 caracteres");
                Pass = 0;
            }
            else if (mu.ContraseñasMalas(textBox2.Text) == 1)
            {
                pictureBox2.Image = global::Cotidiano3_Felix.Properties.Resources.Red_X;
                tip1.SetToolTip(pictureBox2, "La contraseña es MUY vulnerable");
                Pass = 0;
            }
            else
            {
                pictureBox2.Image = global::Cotidiano3_Felix.Properties.Resources.Green_Check;
                tip1.SetToolTip(pictureBox2, "La contraseña puede usarse");
                Pass = 1;
            }
        }
    }
}
