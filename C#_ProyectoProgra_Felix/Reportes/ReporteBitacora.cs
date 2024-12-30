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

namespace Cotidiano3_Felix.Reportes
{
    public partial class ReporteBitacora : Form
    {
        ModeloReportes mr = new ModeloReportes();
        ModeloBitacora mb = new ModeloBitacora();
        ModeloUsuarios mu = new ModeloUsuarios();

        String queryb;
        public ReporteBitacora()
        {
            InitializeComponent();
            queryb = "select * from Bitacora";

            mr.cargarTablaClientes(queryb, dataGridView1);
            AjustarTabla();

            dateTimePicker1.Value = DateTime.Now;
            dateTimePicker2.Value = DateTime.Now.AddDays(1);

            dateTimePicker1.Enabled = false;
            dateTimePicker2.Enabled = false;
        }

        public void ReiniciarTabla()
        {
            dataGridView1.AllowUserToAddRows = false;
            dataGridView1.AllowUserToDeleteRows = false;
            dataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            dataGridView1.Location = new System.Drawing.Point(12, 183);
            dataGridView1.Name = "dataGridView1";
            dataGridView1.ReadOnly = true;
            dataGridView1.Size = new System.Drawing.Size(895, 393);
            dataGridView1.TabIndex = 43;
        }

        public void AjustarTabla()
        {
            dataGridView1.Columns[0].AutoSizeMode = DataGridViewAutoSizeColumnMode.Fill;
            dataGridView1.Columns[1].AutoSizeMode = DataGridViewAutoSizeColumnMode.Fill;
            dataGridView1.Columns[2].AutoSizeMode = DataGridViewAutoSizeColumnMode.Fill;
            dataGridView1.Columns[3].AutoSizeMode = DataGridViewAutoSizeColumnMode.Fill;

            dataGridView1.Columns[0].HeaderText = "N° Movimiento";
            dataGridView1.Columns[1].HeaderText = "Fecha";
            dataGridView1.Columns[2].HeaderText = "Descripción";
            dataGridView1.Columns[3].HeaderText = "Usuario";
        }

        private void ReporteBitacora_FormClosing(object sender, FormClosingEventArgs e)
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

        private void checkBox1_CheckedChanged(object sender, EventArgs e)
        {
            if (checkBox1.Checked)
            {
                dateTimePicker1.Enabled = true;
                dateTimePicker2.Enabled = true;
            }
            else
            {
                dateTimePicker1.Enabled = false;
                dateTimePicker2.Enabled = false;
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if ((mu.buscarUser(textBox1.Text) == 1 && textBox1.Text != "") || textBox1.Text == "")
            {
                queryb = "select * from Bitacora";

                if (!textBox1.Text.Equals("") || checkBox1.Checked)
                {
                    queryb = "select * from Bitacora where NumMov between 0 and 9999999";

                    if (!textBox1.Text.Equals(""))
                        queryb = "select * from Bitacora where Usuario = '" + textBox1.Text + "'";
                    if (checkBox1.Checked)
                    {
                        DateTime f1 = dateTimePicker1.Value.Date;
                        DateTime f2 = dateTimePicker2.Value.Date;

                        if (DateTime.Compare(f1, f2) < 0)
                            queryb += " AND FechaMov between '" + f1.ToString("yyyy/MM/dd") + "' AND '" + f2.ToString("yyyy/MM/dd") + "'";
                        else
                            queryb += " AND FechaMov between '" + f2.ToString("yyyy/MM/dd") + "' AND '" + f1.ToString("yyyy/MM/dd") + "'";
                    }
                }

                Console.WriteLine("Enviando query " + queryb);

                ReiniciarTabla();

                mr.cargarTablaClientes(queryb, dataGridView1);
            }
            else if (textBox1.Text.Length < 3)
            {
                MessageBox.Show("El nombre de usuario no puede tener menos de 4 caracteres.", "Error de solicitud", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            else if (textBox1.Text.Length > 16)
            {
                MessageBox.Show("El nombre de usuario no puede tener mas de 16 caracteres.", "Error de solicitud", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            else
            {
                MessageBox.Show("El usuario no existe.", "Error de solicitud", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }

        private void button5_Click(object sender, EventArgs e)
        {
            VistaPrincipal.MenuPrincipal nw = new VistaPrincipal.MenuPrincipal();
            this.Hide();
            nw.Show();
        }
    }
}
