using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using Cotidiano3_Felix;

using Cotidiano3_Felix.Modelos;

namespace Cotidiano3_Felix.VistaPrincipal
{
    public partial class MenuPrincipal : Form
    {
        ModeloNivFun mn = new ModeloNivFun();
        ModeloUsuarios mu = new ModeloUsuarios();
        ModeloBitacora mb = new ModeloBitacora();

        public MenuPrincipal()
        {
            InitializeComponent();
            CargarSistema();
            CargarToolTips();
        }

        public void CargarSistema()
        {
            //pone en el label4 la fecha actual en formato dd/MM/yyyy
            label4.Text = DateTime.Now.ToString("dd/MM/yyyy");
            //label3 es igual al nombre del nivel que tiene el username
            label3.Text = mn.getNivNombre(IniciarSesion.Nivel);
            //label2 es igual al texto label2 + el primer nombre del usuario
            label2.Text = label2.Text + mu.getNombre(IniciarSesion.Username);

            //Bloquea los elementos para el nivel Operador
            if (IniciarSesion.Nivel == "01")
            {
                GestUsersToolStripMenuItem.Enabled = false;
                usuariosToolStripMenuItem1.Enabled = false;
                BitacoraToolStripMenuItem.Enabled = false;
                toolStripButton11.Enabled = false;
                toolStripButton12.Enabled = false;
                toolStripButton13.Enabled = false;
                toolStripButton14.Enabled = false;
                toolStripButton15.Enabled = false;
                toolStripButton16.Enabled = false;
                toolStripButton17.Enabled = false;
                toolStripButton20.Enabled = false;
            }
            //Bloquea los elementos para el nivel Soporte
            if (IniciarSesion.Nivel == "02")
            {
                GestClientesToolStripMenuItem.Enabled = false;
                reportesClientesToolStripMenuItem.Enabled = false;
                BitacoraToolStripMenuItem.Enabled = false;
                toolStripButton1.Enabled = false;
                toolStripButton2.Enabled = false;
                toolStripButton3.Enabled = false;
                toolStripButton4.Enabled = false;
                toolStripButton5.Enabled = false;
                toolStripButton6.Enabled = false;
                toolStripButton7.Enabled = false;
                toolStripButton8.Enabled = false;
                toolStripButton9.Enabled = false;
                toolStripButton10.Enabled = false;
                toolStripButton12.Enabled = false;
                eliminarUsuarioToolStripMenuItem.Enabled = false;
                cambiarEstadoToolStripMenuItem.Enabled = false;
            }
            //Bloquea los elementos para el nivel Analista
            if (IniciarSesion.Nivel == "03")
            {
                GestClientesToolStripMenuItem.Enabled = false;
                GestUsersToolStripMenuItem.Enabled = false;
                toolStripButton1.Enabled = false;
                toolStripButton2.Enabled = false;
                toolStripButton3.Enabled = false;
                toolStripButton4.Enabled = false;
                toolStripButton5.Enabled = false;
                toolStripButton6.Enabled = false;
                toolStripButton7.Enabled = false;
                toolStripButton13.Enabled = false;
                toolStripButton14.Enabled = false;
                toolStripButton15.Enabled = false;
                toolStripButton16.Enabled = false;
                toolStripButton17.Enabled = false;
                toolStripButton20.Enabled = false;
            }
        }

        public void CargarToolTips()
        {
            //Le pone a los elementos del tool bar los tooltips para saber que hace cada que
            toolStripButton1.ToolTipText = "Registrar Cliente";
            toolStripButton2.ToolTipText = "Actualizar Cliente";
            toolStripButton3.ToolTipText = "Registrar Cuenta";
            toolStripButton4.ToolTipText = "Cambiar Estado de Cuenta";
            toolStripButton5.ToolTipText = "Actualizar Crédito Limite de Cuenta";
            toolStripButton6.ToolTipText = "Registrar Movimiento";
            toolStripButton7.ToolTipText = "Anular Movimiento";
            toolStripButton8.ToolTipText = "Reporte de Clientes";
            toolStripButton9.ToolTipText = "Reporte de Cuentas";
            toolStripButton10.ToolTipText = "Reporte de Movimientos";
            toolStripButton11.ToolTipText = "Reporte de Usuarios";
            toolStripButton12.ToolTipText = "Reporte de Bitácora";
            toolStripButton13.ToolTipText = "Registrar Usuario";
            toolStripButton14.ToolTipText = "Modificar Usuario";
            toolStripButton15.ToolTipText = "Cambiar Estado de Usuario";
            toolStripButton16.ToolTipText = "Registrar Niveles";
            toolStripButton17.ToolTipText = "Gestionar Permisos";
            toolStripButton18.ToolTipText = "Cerrar Sesión";
            toolStripButton19.ToolTipText = "Salir del Programa";
            toolStripButton20.ToolTipText = "Registrar Funciones";
        }

        //Opciones del menu bar para accesar a los formularios, cerrar sesion o salir del programa
        private void registrarClientesToolStripMenuItem_Click(object sender, EventArgs e)
        {
            MantenimientoClientes.RegistrarClientes nw = new MantenimientoClientes.RegistrarClientes();
            this.Hide();
            nw.Show();
        }

        private void consultarClientesToolStripMenuItem_Click(object sender, EventArgs e)
        {
            MantenimientoClientes.ConsultarClientes nw = new MantenimientoClientes.ConsultarClientes();
            this.Hide();
            nw.Show();
        }

        private void actualizarClientesToolStripMenuItem_Click(object sender, EventArgs e)
        {
            MantenimientoClientes.ModificarClientes nw = new MantenimientoClientes.ModificarClientes();
            this.Hide();
            nw.Show();
        }

        private void registrarCuentasToolStripMenuItem_Click(object sender, EventArgs e)
        {
            MantenimientoCuentas.RegistrarCuentas nw = new MantenimientoCuentas.RegistrarCuentas();
            this.Hide();
            nw.Show();
        }

        private void consultarCuentasToolStripMenuItem_Click(object sender, EventArgs e)
        {
            MantenimientoCuentas.ConsultarCuentas nw = new MantenimientoCuentas.ConsultarCuentas();
            this.Hide();
            nw.Show();
        }

        private void salirToolStripMenuItem_Click(object sender, EventArgs e)
        {
            mb.ingresarBitacora(DateTime.Now, "Cerró Sesión", IniciarSesion.Username);

            mb.odataAdapter.InsertCommand.Parameters["@fecha"].Value = DateTime.Now;
            mb.odataAdapter.InsertCommand.Parameters["@desc"].Value = "Cerró Sesión";
            mb.odataAdapter.InsertCommand.Parameters["@user"].Value = IniciarSesion.Username;

            mb.conexion.Open();
            mb.odataAdapter.InsertCommand.ExecuteNonQuery();
            mb.conexion.Close();

            Application.Exit();
        }

        private void activaciónDeCuentasToolStripMenuItem_Click(object sender, EventArgs e)
        {
            MantenimientoCuentas.CondicionCuentas nw = new MantenimientoCuentas.CondicionCuentas();
            this.Hide();
            nw.Show();
        }

        private void actualizarMontoLímiteCréditoToolStripMenuItem_Click(object sender, EventArgs e)
        {
            MantenimientoCuentas.ActualizaMontoLiCuentas nw = new MantenimientoCuentas.ActualizaMontoLiCuentas();
            this.Hide();
            nw.Show();
        }

        private void registrarMovimientoToolStripMenuItem_Click(object sender, EventArgs e)
        {
            MantenimientoMovimientos.RegistroMovimientos nw = new MantenimientoMovimientos.RegistroMovimientos();
            this.Hide();
            nw.Show();
        }

        private void consultarMovimientoToolStripMenuItem_Click(object sender, EventArgs e)
        {
            MantenimientoMovimientos.ConsultaMovimientos nw = new MantenimientoMovimientos.ConsultaMovimientos();
            this.Hide();
            nw.Show();
        }

        private void anularMovimientoToolStripMenuItem_Click(object sender, EventArgs e)
        {
            MantenimientoMovimientos.AnularMovimiento nw = new MantenimientoMovimientos.AnularMovimiento();
            this.Hide();
            nw.Show();
        }

        private void registrarNivelesToolStripMenuItem_Click(object sender, EventArgs e)
        {
            MantenimientoNivFun.RegistrarNiveles nw = new MantenimientoNivFun.RegistrarNiveles();
            this.Hide();
            nw.Show();
        }

        private void registrarFuncionesToolStripMenuItem_Click(object sender, EventArgs e)
        {
            MantenimientoNivFun.RegistrarFunciones nw = new MantenimientoNivFun.RegistrarFunciones();
            this.Hide();
            nw.Show();
        }

        private void actualizarPermisosToolStripMenuItem_Click(object sender, EventArgs e)
        {
            MantenimientoNivFun.GestionPermisos nw = new MantenimientoNivFun.GestionPermisos();
            this.Hide();
            nw.Show();
        }

        private void verToolStripMenuItem_Click(object sender, EventArgs e)
        {
            MantenimientoNivFun.VisualizarNiveles nw = new MantenimientoNivFun.VisualizarNiveles();
            this.Hide();
            nw.Show();
        }

        private void registrarUsuarioToolStripMenuItem_Click(object sender, EventArgs e)
        {
            MantenimientoUsuarios.RegistrarUsuarios nw = new MantenimientoUsuarios.RegistrarUsuarios();
            this.Hide();
            nw.Show();
        }

        private void consultarUsuarioToolStripMenuItem_Click(object sender, EventArgs e)
        {
            MantenimientoUsuarios.ConsultarUsuarios nw = new MantenimientoUsuarios.ConsultarUsuarios();
            this.Hide();
            nw.Show();
        }

        private void modificarUsuarioToolStripMenuItem_Click(object sender, EventArgs e)
        {
            MantenimientoUsuarios.ModificarUsuarios nw = new MantenimientoUsuarios.ModificarUsuarios();
            this.Hide();
            nw.Show();
        }

        private void cambiarEstadoToolStripMenuItem_Click(object sender, EventArgs e)
        {
            MantenimientoUsuarios.ActivacionUsuarios nw = new MantenimientoUsuarios.ActivacionUsuarios();
            this.Hide();
            nw.Show();
        }

        private void eliminarUsuarioToolStripMenuItem_Click(object sender, EventArgs e)
        {
            MantenimientoUsuarios.EliminarUsuarios nw = new MantenimientoUsuarios.EliminarUsuarios();
            this.Hide();
            nw.Show();
        }

        //Opciones del tool bar (replican la misma accion de la opcion del menu a la que corresponden)
        private void toolStripButton1_Click(object sender, EventArgs e)
        {
            registrarClientesToolStripMenuItem.PerformClick();
        }

        private void toolStripButton2_Click(object sender, EventArgs e)
        {
            actualizarClientesToolStripMenuItem.PerformClick();
        }

        private void toolStripButton3_Click(object sender, EventArgs e)
        {
            registrarCuentasToolStripMenuItem.PerformClick();
        }

        private void toolStripButton4_Click(object sender, EventArgs e)
        {
            CambiarEstadoCuentaToolStripMenuItem.PerformClick();
        }

        private void toolStripButton5_Click(object sender, EventArgs e)
        {
            actualizarMontoLímiteCréditoToolStripMenuItem.PerformClick();
        }

        private void toolStripButton6_Click(object sender, EventArgs e)
        {
            registrarMovimientoToolStripMenuItem.PerformClick();
        }

        private void toolStripButton7_Click(object sender, EventArgs e)
        {
            anularMovimientoToolStripMenuItem.PerformClick();
        }

        private void toolStripButton8_Click(object sender, EventArgs e)
        {
            clientesToolStripMenuItem.PerformClick();
        }

        private void toolStripButton9_Click(object sender, EventArgs e)
        {
            cuentasToolStripMenuItem.PerformClick();
        }

        private void toolStripButton10_Click(object sender, EventArgs e)
        {
            movimientosToolStripMenuItem.PerformClick();
        }

        private void toolStripButton11_Click(object sender, EventArgs e)
        {
            usuariosToolStripMenuItem1.PerformClick();
        }

        private void toolStripButton12_Click(object sender, EventArgs e)
        {
            BitacoraToolStripMenuItem.PerformClick();
        }

        private void toolStripButton13_Click(object sender, EventArgs e)
        {
            registrarUsuarioToolStripMenuItem.PerformClick();
        }

        private void toolStripButton14_Click(object sender, EventArgs e)
        {
            modificarUsuarioToolStripMenuItem.PerformClick();
        }

        private void toolStripButton15_Click(object sender, EventArgs e)
        {
            cambiarEstadoToolStripMenuItem.PerformClick();
        }

        private void toolStripButton16_Click(object sender, EventArgs e)
        {
            registrarNivelesToolStripMenuItem.PerformClick();
        }

        private void toolStripButton20_Click(object sender, EventArgs e)
        {
            registrarFuncionesToolStripMenuItem.PerformClick();
        }

        private void toolStripButton17_Click(object sender, EventArgs e)
        {
            actualizarPermisosToolStripMenuItem.PerformClick();
        }

        private void toolStripButton18_Click(object sender, EventArgs e)
        {
            cerrarSesiónToolStripMenuItem.PerformClick();
        }

        private void toolStripButton19_Click(object sender, EventArgs e)
        {
            salirToolStripMenuItem.PerformClick();
        }

        //Más opciones del menu bar (reportes)
        private void cerrarSesiónToolStripMenuItem_Click(object sender, EventArgs e)
        {
            mb.ingresarBitacora(DateTime.Now, "Cerró Sesión", IniciarSesion.Username);

            mb.odataAdapter.InsertCommand.Parameters["@fecha"].Value = DateTime.Now;
            mb.odataAdapter.InsertCommand.Parameters["@desc"].Value = "Cerró Sesión";
            mb.odataAdapter.InsertCommand.Parameters["@user"].Value = IniciarSesion.Username;

            mb.conexion.Open();
            mb.odataAdapter.InsertCommand.ExecuteNonQuery();
            mb.conexion.Close();

            IniciarSesion nw = new IniciarSesion();
            this.Hide();
            nw.Show();
        }

        private void MenuPrincipal_FormClosed(object sender, FormClosedEventArgs e)
        {
            //Si el programa es cerrado por el usuario
            if (e.CloseReason == CloseReason.UserClosing)
            {
                mb.ingresarBitacora(DateTime.Now, "Cerró Sesión", IniciarSesion.Username);

                mb.odataAdapter.InsertCommand.Parameters["@fecha"].Value = DateTime.Now;
                mb.odataAdapter.InsertCommand.Parameters["@desc"].Value = "Cerró Sesión";
                mb.odataAdapter.InsertCommand.Parameters["@user"].Value = IniciarSesion.Username;

                mb.conexion.Open();
                mb.odataAdapter.InsertCommand.ExecuteNonQuery();
                mb.conexion.Close();

                Application.Exit();
            }
        }

        private void clientesToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Reportes.ReporteClientes nw = new Reportes.ReporteClientes();
            this.Hide();
            nw.Show();
        }

        private void cuentasToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Reportes.ReporteCuentas nw = new Reportes.ReporteCuentas();
            this.Hide();
            nw.Show();
        }

        private void movimientosToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Reportes.ReporteMovimientos nw = new Reportes.ReporteMovimientos();
            this.Hide();
            nw.Show();
        }

        private void usuariosToolStripMenuItem1_Click(object sender, EventArgs e)
        {
            Reportes.ReporteUsuarios nw = new Reportes.ReporteUsuarios();
            this.Hide();
            nw.Show();
        }

        private void BitacoraToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Reportes.ReporteBitacora nw = new Reportes.ReporteBitacora();
            this.Hide();
            nw.Show();
        }
    }
}
