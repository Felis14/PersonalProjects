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
    public partial class EliminarUsuarios : Form
    {
        ModeloUsuarios mu = new ModeloUsuarios();
        ControlUsuarios cu = new ControlUsuarios();
        ModeloNivFun mn = new ModeloNivFun();
        ModeloBitacora mb = new ModeloBitacora();

        public EliminarUsuarios()
        {
            InitializeComponent();
            button1.Enabled = false;
        }

        private void EliminarUsuarios_FormClosing(object sender, FormClosingEventArgs e)
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

        private void button3_Click(object sender, EventArgs e)
        {
            textBox1.ReadOnly = false;
            button2.Enabled = true;
            button1.Enabled = false;
            cu.LimpiarEliminar(textBox1, textBox2, textBox3, textBox4, textBox5, textBox6, textBox7);
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
                    MessageBox.Show("Usuario encontrado, puede eliminarlo.", "Estado", MessageBoxButtons.OK);
                    mu.mostrarDatosEliminar(textBox1.Text, textBox2, textBox3, textBox4, textBox5, textBox6, textBox7);
                    button2.Enabled = false;
                    textBox1.ReadOnly = true;
                    button1.Enabled = true;

                    textBox5.Text = textBox5.Text + " - " + mn.getNivNombre(textBox5.Text);
                }
                else
                    MessageBox.Show("El usuario no existe", "Error de solicitud", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (MessageBox.Show("¿Está segur@ que desea eliminar al usuario " + textBox1.Text + "?", "Confirmación", MessageBoxButtons.YesNo, MessageBoxIcon.Warning) == DialogResult.Yes)
            {
                if (MessageBox.Show("Está a punto de eliminar al usuario " + textBox1.Text + ".\n¿Está totalmente segur@?\n\nEsta acción es irreversible.", "Cuidado", MessageBoxButtons.YesNo, MessageBoxIcon.Warning) == DialogResult.Yes)
                {
                    mu.EliminarUsuario(textBox1.Text);

                    mu.conexion.Open();
                    mu.odataAdapter.DeleteCommand.ExecuteNonQuery();
                    mu.conexion.Close();

                    mb.ingresarBitacora(DateTime.Now, "Eliminó al usuario: "+textBox1.Text, VistaPrincipal.IniciarSesion.Username);

                    mb.odataAdapter.InsertCommand.Parameters["@fecha"].Value = DateTime.Now;
                    mb.odataAdapter.InsertCommand.Parameters["@desc"].Value = "Eliminó al usuario: "+textBox1.Text;
                    mb.odataAdapter.InsertCommand.Parameters["@user"].Value = VistaPrincipal.IniciarSesion.Username;

                    mb.conexion.Open();
                    mb.odataAdapter.InsertCommand.ExecuteNonQuery();
                    mb.conexion.Close();

                    MessageBox.Show("El usuario " + textBox1.Text + " fue eliminado.", "Estado", MessageBoxButtons.OK);
                    button3.PerformClick();
                }
                else
                    MessageBox.Show("El usuario no fue eliminado.", "Estado", MessageBoxButtons.OK);
            }
            else
                MessageBox.Show("El usuario no fue eliminado.", "Estado", MessageBoxButtons.OK);
        }
    }
}
