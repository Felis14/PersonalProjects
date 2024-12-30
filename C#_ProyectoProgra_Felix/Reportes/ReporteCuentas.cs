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
    public partial class ReporteCuentas : Form
    {
        ModeloReportes mr = new ModeloReportes();
        ModeloBitacora mb = new ModeloBitacora();

        String queryb;
        public ReporteCuentas()
        {
            InitializeComponent();
            queryb = "select * from Cuentas";

            mr.cargarTablaClientes(queryb, dataGridView1);
            AjustarTabla();
            comboBox1.SelectedIndex = 0;
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
            dataGridView1.Columns[4].AutoSizeMode = DataGridViewAutoSizeColumnMode.Fill;
            dataGridView1.Columns[5].AutoSizeMode = DataGridViewAutoSizeColumnMode.Fill;
            dataGridView1.Columns[6].AutoSizeMode = DataGridViewAutoSizeColumnMode.Fill;

            dataGridView1.Columns[0].HeaderText = "N° Cuenta";
            dataGridView1.Columns[1].HeaderText = "Fecha de Apertura";
            dataGridView1.Columns[2].HeaderText = "Estado";
            dataGridView1.Columns[3].HeaderText = "Saldo A Pagar";
            dataGridView1.Columns[4].HeaderText = "Limite Crédito";
            dataGridView1.Columns[5].HeaderText = "Monto Disponible";
            dataGridView1.Columns[6].HeaderText = "ID Cliente";
        }

        private void ReporteCuentas_FormClosing(object sender, FormClosingEventArgs e)
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

        private void button1_Click(object sender, EventArgs e)
        {
            queryb = "select * from Cuentas";

            if (!textBox1.Text.Equals("") || textBox2.Text != "" || comboBox1.Text != " ")
            {
                queryb = "select * from Cuentas where NumCuenta between 0 and 999999";

                if (!textBox1.Text.Equals(""))
                    queryb = "select * from Cuentas where NumCuenta = '" + textBox1.Text + "'";
                if (comboBox1.Text != " ")
                    queryb += " AND Estado = '" + comboBox1.Text + "'";
                if (textBox2.Text != "")
                    queryb += " AND ID = '" + textBox2.Text + "'";
            }

            Console.WriteLine("Enviando query " + queryb);

            ReiniciarTabla();

            mr.cargarTablaClientes(queryb, dataGridView1);
        }

        private void button5_Click(object sender, EventArgs e)
        {
            VistaPrincipal.MenuPrincipal nw = new VistaPrincipal.MenuPrincipal();
            this.Hide();
            nw.Show();
        }
    }
}
