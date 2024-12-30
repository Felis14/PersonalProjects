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
    public partial class GestionPermisos : Form
    {
        ModeloNivFun mn = new ModeloNivFun();
        ModeloBitacora mb = new ModeloBitacora();

        public GestionPermisos()
        {
            InitializeComponent();
            mn.cargarComboNiveles(comboBox1);
            LimpiarBloquear();
        }

        public void Desbloquear()
        {
            checkBox1.Enabled = true;
            checkBox2.Enabled = true;
            checkBox3.Enabled = true;
            checkBox4.Enabled = true;
            checkBox5.Enabled = true;
            button1.Enabled = false;
            button3.Enabled = true;
            comboBox1.Enabled = false;
        }

        public void LimpiarBloquear()
        {
            checkBox1.Checked = false; checkBox1.Enabled = false;
            checkBox2.Checked = false; checkBox2.Enabled = false;
            checkBox3.Checked = false; checkBox3.Enabled = false;
            checkBox4.Checked = false; checkBox4.Enabled = false;
            checkBox5.Checked = false; checkBox5.Enabled = false;
            button1.Enabled = true;
            button3.Enabled = false;
            comboBox1.Enabled = true;
        }

        private void button5_Click(object sender, EventArgs e)
        {
            VistaPrincipal.MenuPrincipal nw = new VistaPrincipal.MenuPrincipal();
            this.Hide();
            nw.Show();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            LimpiarBloquear();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            String perm1, perm2, perm3, perm4, perm5;
            if (checkBox1.Checked == true)
                perm1 = "S";
            else
                perm1 = "N";
            if (checkBox2.Checked == true)
                perm2 = "S";
            else
                perm2 = "N";
            if (checkBox3.Checked == true)
                perm3 = "S";
            else
                perm3 = "N";
            if (checkBox4.Checked == true)
                perm4 = "S";
            else
                perm4 = "N";
            if (checkBox5.Checked == true)
                perm5 = "S";
            else
                perm5 = "N";

            String nivel = comboBox1.Text;
            if (MessageBox.Show("¿Desea aplicar estos permisos al nivel " + mn.getNivNombre(comboBox1.Text) + "?", "Confirmación", MessageBoxButtons.YesNo) == DialogResult.Yes)
            {
                Console.WriteLine("Verificando si el codigofuncion "+nivel+"00 ya está registrado");
                if (mn.buscarCodeNivFun(nivel + "00") == 0)
                {
                    mn.registrarFuncionNivel("00", nivel, perm1);
                    mn.odataAdapter.InsertCommand.Parameters["@codfun"].Value = "00";
                    mn.odataAdapter.InsertCommand.Parameters["@codniv"].Value = nivel;
                    mn.odataAdapter.InsertCommand.Parameters["@estado"].Value = perm1;
                    mn.conexion.Open();
                    mn.odataAdapter.InsertCommand.ExecuteNonQuery();
                    mn.conexion.Close();
                }
                else
                {
                    mn.modificarFuncionNivel(nivel + "00", perm1);
                    mn.odataAdapter.UpdateCommand.Parameters["@codnivfun"].Value = nivel + "00";
                    mn.odataAdapter.UpdateCommand.Parameters["@estado"].Value = perm1;
                    mn.conexion.Open();
                    mn.odataAdapter.UpdateCommand.ExecuteNonQuery();
                    mn.conexion.Close();
                }

                if (mn.buscarCodeNivFun(nivel + "01") == 0)
                {
                    mn.registrarFuncionNivel("01", nivel, perm2);
                    mn.odataAdapter.InsertCommand.Parameters["@codfun"].Value = "01";
                    mn.odataAdapter.InsertCommand.Parameters["@codniv"].Value = nivel;
                    mn.odataAdapter.InsertCommand.Parameters["@estado"].Value = perm2;
                    mn.conexion.Open();
                    mn.odataAdapter.InsertCommand.ExecuteNonQuery();
                    mn.conexion.Close();
                }
                else
                {
                    mn.modificarFuncionNivel(nivel + "01", perm2);
                    mn.odataAdapter.UpdateCommand.Parameters["@codnivfun"].Value = nivel + "01";
                    mn.odataAdapter.UpdateCommand.Parameters["@estado"].Value = perm2;
                    mn.conexion.Open();
                    mn.odataAdapter.UpdateCommand.ExecuteNonQuery();
                    mn.conexion.Close();
                }

                if (mn.buscarCodeNivFun(nivel + "02") == 0)
                {
                    mn.registrarFuncionNivel("02", nivel, perm3);
                    mn.odataAdapter.InsertCommand.Parameters["@codfun"].Value = "02";
                    mn.odataAdapter.InsertCommand.Parameters["@codniv"].Value = nivel;
                    mn.odataAdapter.InsertCommand.Parameters["@estado"].Value = perm3;
                    mn.conexion.Open();
                    mn.odataAdapter.InsertCommand.ExecuteNonQuery();
                    mn.conexion.Close();
                }
                else
                {
                    mn.modificarFuncionNivel(nivel + "02", perm3);
                    mn.odataAdapter.UpdateCommand.Parameters["@codnivfun"].Value = nivel + "02";
                    mn.odataAdapter.UpdateCommand.Parameters["@estado"].Value = perm3;
                    mn.conexion.Open();
                    mn.odataAdapter.UpdateCommand.ExecuteNonQuery();
                    mn.conexion.Close();
                }

                if (mn.buscarCodeNivFun(nivel + "03") == 0)
                {
                    mn.registrarFuncionNivel("03", nivel, perm4);
                    mn.odataAdapter.InsertCommand.Parameters["@codfun"].Value = "03";
                    mn.odataAdapter.InsertCommand.Parameters["@codniv"].Value = nivel;
                    mn.odataAdapter.InsertCommand.Parameters["@estado"].Value = perm4;
                    mn.conexion.Open();
                    mn.odataAdapter.InsertCommand.ExecuteNonQuery();
                    mn.conexion.Close();
                }
                else
                {
                    mn.modificarFuncionNivel(nivel + "03", perm4);
                    mn.odataAdapter.UpdateCommand.Parameters["@codnivfun"].Value = nivel + "03";
                    mn.odataAdapter.UpdateCommand.Parameters["@estado"].Value = perm4;
                    mn.conexion.Open();
                    mn.odataAdapter.UpdateCommand.ExecuteNonQuery();
                    mn.conexion.Close();
                }

                if (mn.buscarCodeNivFun(nivel + "04") == 0)
                {
                    mn.registrarFuncionNivel("04", nivel, perm5);
                    mn.odataAdapter.InsertCommand.Parameters["@codfun"].Value = "04";
                    mn.odataAdapter.InsertCommand.Parameters["@codniv"].Value = nivel;
                    mn.odataAdapter.InsertCommand.Parameters["@estado"].Value = perm5;
                    mn.conexion.Open();
                    mn.odataAdapter.InsertCommand.ExecuteNonQuery();
                    mn.conexion.Close();
                }
                else
                {
                    mn.modificarFuncionNivel(nivel + "04", perm5);
                    mn.odataAdapter.UpdateCommand.Parameters["@codnivfun"].Value = nivel + "04";
                    mn.odataAdapter.UpdateCommand.Parameters["@estado"].Value = perm5;
                    mn.conexion.Open();
                    mn.odataAdapter.UpdateCommand.ExecuteNonQuery();
                    mn.conexion.Close();
                }

                mb.ingresarBitacora(DateTime.Now, "Cambió los permisos del nivel: "+nivel, VistaPrincipal.IniciarSesion.Username);

                mb.odataAdapter.InsertCommand.Parameters["@fecha"].Value = DateTime.Now;
                mb.odataAdapter.InsertCommand.Parameters["@desc"].Value = "Cambió los permisos del nivel: "+nivel;
                mb.odataAdapter.InsertCommand.Parameters["@user"].Value = VistaPrincipal.IniciarSesion.Username;

                mb.conexion.Open();
                mb.odataAdapter.InsertCommand.ExecuteNonQuery();
                mb.conexion.Close();

                MessageBox.Show("Los permisos fueron actualizados correctamente.", "Estado", MessageBoxButtons.OK);
                LimpiarBloquear();
            }
            else
            {
                MessageBox.Show("Los cambios no fueron aplicados.", "Estado", MessageBoxButtons.OK);
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (comboBox1.Text == "")
                MessageBox.Show("No ha seleccionado cual nivel quiere modificar.", "Error de solicitud", MessageBoxButtons.OK, MessageBoxIcon.Error);
            else
            {
                Desbloquear();
            }
        }

        private void GestionPermisos_FormClosing(object sender, FormClosingEventArgs e)
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
