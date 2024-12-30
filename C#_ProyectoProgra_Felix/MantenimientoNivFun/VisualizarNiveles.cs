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

namespace Cotidiano3_Felix.MantenimientoNivFun
{
    public partial class VisualizarNiveles : Form
    {
        ModeloNivFun mn = new ModeloNivFun();
        ModeloBitacora mb = new ModeloBitacora();

        public VisualizarNiveles()
        {
            InitializeComponent();
            mn.cargarComboNiveles(comboBox1);
        }

        public void Limpiar()
        {
            button1.Enabled = true;
            checkBox1.Checked = false;
            checkBox2.Checked = false;
            checkBox3.Checked = false;
            checkBox4.Checked = false;
            checkBox5.Checked = false;
        }

        private void button5_Click(object sender, EventArgs e)
        {
            VistaPrincipal.MenuPrincipal nw = new VistaPrincipal.MenuPrincipal();
            this.Hide();
            nw.Show();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Limpiar();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (comboBox1.Text == "")
            {
                MessageBox.Show("No ha seleccionado ningun nivel para buscar.", "Error de solicitud", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            else
            {
                if (mn.getEstado(comboBox1.Text + "00") == "S")
                    checkBox1.Checked = true;
                else
                    checkBox1.Checked = false;

                if (mn.getEstado(comboBox1.Text + "01") == "S")
                    checkBox2.Checked = true;
                else
                    checkBox2.Checked = false;

                if (mn.getEstado(comboBox1.Text + "02") == "S")
                    checkBox3.Checked = true;
                else
                    checkBox3.Checked = false;

                if (mn.getEstado(comboBox1.Text + "03") == "S")
                    checkBox4.Checked = true;
                else
                    checkBox4.Checked = false;

                if (mn.getEstado(comboBox1.Text + "04") == "S")
                    checkBox5.Checked = true;
                else
                    checkBox5.Checked = false;
            }
        }

        private void VisualizarNiveles_FormClosing(object sender, FormClosingEventArgs e)
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
