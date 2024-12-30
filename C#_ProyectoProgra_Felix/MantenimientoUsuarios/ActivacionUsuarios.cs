using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

using Cotidiano3_Felix.Controles;
using Cotidiano3_Felix.Modelos;

namespace Cotidiano3_Felix.MantenimientoUsuarios
{
    public partial class ActivacionUsuarios : Form
    {
        ModeloUsuarios mu = new ModeloUsuarios();
        ControlUsuarios cu = new ControlUsuarios();
        ModeloNivFun mn = new ModeloNivFun();
        ModeloBitacora mb = new ModeloBitacora();

        public ActivacionUsuarios()
        {
            InitializeComponent();
            button6.Enabled = false;
        }

        private void ActivacionUsuarios_FormClosing(object sender, FormClosingEventArgs e)
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
                    mu.mostrarDatosAct(textBox1.Text, textBox2, textBox3, textBox4, textBox5, textBox6);

                    textBox5.Text = textBox5.Text + " - " + mn.getNivNombre(textBox5.Text);

                    String condi;
                    if (textBox6.Text == "Activo")
                    {
                        condi = "desactivado";
                        button6.Text = "Desactivar";
                    }
                    else
                    {
                        condi = "activado";
                        button6.Text = "Activar";
                    }

                    MessageBox.Show("Usuario encontrado, puede ser "+ condi +".", "Estado", MessageBoxButtons.OK);

                    textBox1.ReadOnly = true;
                    button2.Enabled = false;
                    button6.Enabled = true;
                }
                else
                    MessageBox.Show("El usuario no existe.", "Error de solicitud", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }

        private void button6_Click(object sender, EventArgs e)
        {
            String condi;
            if (textBox6.Text == "Activo")
                condi = "desactivar";
            else
                condi = "activar";

            if (MessageBox.Show("¿Está segur@ que desea " + condi + " al usuario?", "Confirmación", MessageBoxButtons.YesNo) == DialogResult.Yes)
            {
                if (textBox6.Text == "Activo")
                    condi = "Inactivo";
                else
                    condi = "Activo";

                mu.cambiarEstadoUsuario(textBox1.Text, condi);

                mu.odataAdapter.UpdateCommand.Parameters["@estado"].Value = condi;

                mu.conexion.Open();
                mu.odataAdapter.UpdateCommand.ExecuteNonQuery();
                mu.conexion.Close();

                mb.ingresarBitacora(DateTime.Now, "Cambió el estado del usuario: "+textBox1.Text, VistaPrincipal.IniciarSesion.Username);

                mb.odataAdapter.InsertCommand.Parameters["@fecha"].Value = DateTime.Now;
                mb.odataAdapter.InsertCommand.Parameters["@desc"].Value = "Cambió el estado del usuario: "+textBox1.Text;
                mb.odataAdapter.InsertCommand.Parameters["@user"].Value = VistaPrincipal.IniciarSesion.Username;

                mb.conexion.Open();
                mb.odataAdapter.InsertCommand.ExecuteNonQuery();
                mb.conexion.Close();

                MessageBox.Show("El estado del usuario fue actualizado correctamente.", "Estado", MessageBoxButtons.OK);
                button3.PerformClick();
                textBox1.Focus();
            }
            else
            {
                if (textBox6.Text == "Activo")
                    condi = "desactivó";
                else
                    condi = "activó";
                MessageBox.Show("El usuario no se "+condi+".", "Estado", MessageBoxButtons.OK);
            }
        }

        private void button3_Click(object sender, EventArgs e)
        {
            button2.Enabled = true;
            textBox1.ReadOnly = false;
            button6.Enabled = false;
            cu.LimpiarActivar(textBox1, textBox2, textBox3, textBox4, textBox5, textBox6, button6);
        }
    }
}
