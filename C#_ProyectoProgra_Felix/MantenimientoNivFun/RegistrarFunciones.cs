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
    public partial class RegistrarFunciones : Form
    {
        ModeloNivFun mn = new ModeloNivFun();
        ModeloBitacora mb = new ModeloBitacora();

        public RegistrarFunciones()
        {
            InitializeComponent();
            mn.cargarComboFunciones(comboBox1);
        }

        public void Limpiar()
        {
            textBox1.Text = "";
            textBox2.Text = "";
            comboBox1.Items.Clear();
            mn.cargarComboFunciones(comboBox1);
        }

        private void button5_Click(object sender, EventArgs e)
        {
            VistaPrincipal.MenuPrincipal nw = new VistaPrincipal.MenuPrincipal();
            this.Hide();
            nw.Show();
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {
            if (textBox1.Text.Length > 2)
                textBox1.Text = "" + textBox1.Text[0] + textBox1.Text[1];
            textBox1.Focus();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Limpiar();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (comboBox1.Items.Count > 0)
            {
                textBox1.Text = (Convert.ToInt32(comboBox1.Items[comboBox1.Items.Count - 1]) + 1).ToString();
                if (textBox1.Text.Length == 1)
                    textBox1.Text = "0" + textBox1.Text;
            }
            else
                textBox1.Text = "00";
        }

        private void button3_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == "" || textBox2.Text == "")
            {
                MessageBox.Show("Faltan datos por rellenar.", "Error de solicitud", MessageBoxButtons.OK);
            }
            else if (mn.buscarCodeFun(textBox1.Text) == 1)
            {
                MessageBox.Show("Función ya registrada.", "Error de solicitud", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            else
            {
                if (textBox1.Text.Length == 1)
                    textBox1.Text = "0" + textBox1.Text;
                mn.registrarFuncion(textBox1.Text, textBox2.Text);

                mn.odataAdapter.InsertCommand.Parameters["@codfun"].Value = this.textBox1.Text;
                mn.odataAdapter.InsertCommand.Parameters["@nomfun"].Value = this.textBox2.Text;

                mn.conexion.Open();
                mn.odataAdapter.InsertCommand.ExecuteNonQuery();
                mn.conexion.Close();

                mb.ingresarBitacora(DateTime.Now, "Registró la función: "+textBox1.Text, VistaPrincipal.IniciarSesion.Username);

                mb.odataAdapter.InsertCommand.Parameters["@fecha"].Value = DateTime.Now;
                mb.odataAdapter.InsertCommand.Parameters["@desc"].Value = "Registró la función: "+textBox1.Text;
                mb.odataAdapter.InsertCommand.Parameters["@user"].Value = VistaPrincipal.IniciarSesion.Username;

                mb.conexion.Open();
                mb.odataAdapter.InsertCommand.ExecuteNonQuery();
                mb.conexion.Close();

                MessageBox.Show("Función " + textBox2.Text + " agregada correctamente.", "Estado", MessageBoxButtons.OK);
                Limpiar();
            }
        }

        private void RegistrarFunciones_FormClosing(object sender, FormClosingEventArgs e)
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
