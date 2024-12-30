using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using Cotidiano3_Felix.Modelos; //Importa las carpetas necesarias
using Cotidiano3_Felix.Controles;

namespace Cotidiano3_Felix.MantenimientoCuentas
{
    public partial class ActualizaMontoLiCuentas : Form
    {
        ModeloClientes mcl = new ModeloClientes(); //Instancia las clases que se van a utilizar
        ModeloCuentas mcu = new ModeloCuentas();
        ControlCuentas cc = new ControlCuentas();
        ModeloBitacora mb = new ModeloBitacora();
        int MontoLimiteIni;
        public ActualizaMontoLiCuentas()
        {
            InitializeComponent();
            mcl.cargarComboClientes(comboBox1); //carga todos los clientes en el combo
            //Bloquea los objetos del form
            cc.BloquearObjetosMontoLimite(comboBox1, textBox1, comboBox2, textBox6, textBox7, button1, button4, button6);
        }

        //Boton buscar cliente
        private void button1_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == "") //Si el texto esta vacio
            {
                MessageBox.Show("No hay ninguna identificación para buscar.", "Error de solicitud", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            else
            {
                if (mcl.buscarID(textBox1.Text) == 1) //si encuentra el cliente
                {
                    MessageBox.Show("Cliente encontrado, ahora puede buscar sus cuentas.", "Estado", MessageBoxButtons.OK);
                    comboBox2.Items.Clear();
                    //carga las cuentas del cliente encontrado
                    mcu.cargarComboCuentas(comboBox2, textBox1.Text);
                    cc.DesbloquearObjetosMontoLimite(comboBox1, textBox1, comboBox2, textBox6, textBox7, button1, button4, button6);
                    textBox6.Focus();
                }
                else //si no encuentra el cliente
                {
                    MessageBox.Show("No existe ningún cliente bajo esta identificación.", "Estado", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }
            }
        }

        //Boton buscar cuenta
        private void button4_Click(object sender, EventArgs e)
        {
            if (textBox6.Text == "") //si el texto está vacío
            {
                MessageBox.Show("No hay ninguna cuenta para buscar.", "Error de solicitud", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            else
            {
                if (mcl.buscarID(textBox1.Text) == 1) //si encuentra la cuenta
                {
                    string numcuenta, cuenta;
                    int[] list = new int[comboBox2.Items.Count];
                    int vecl = list.Length;
                    for (int i = 0; i < comboBox2.Items.Count; i++)
                    {
                        //Reinicia la variable numero de cuenta y asigna a la variable cuenta el item que está en la posición i
                        numcuenta = ""; cuenta = "" + comboBox2.Items[i].ToString();
                        for (int j = 0; j < cuenta.Length; j++)
                        {
                            //Si el caracter es un espacio en blanco, el ciclo se rompe, dejando solo la variable que tenía el item del combo
                            if (cuenta[(char)j] == ' ')
                            {
                                break;
                            }
                            //Se le suma a la variable numcuenta el caracter en la posición i
                            numcuenta += cuenta[(char)j];
                        }
                        //Una vez terminado de formarse la variable con el numero de cuenta, la asigna al campo i de la lista
                        list[i] = Convert.ToInt32(numcuenta);
                    }
                    int enco = 0;
                    //Compara el numero de cuenta en el TextField con todos los campos de la lista
                    for (int i = 0; i < vecl; i++)
                    {
                        //Si lo que está en el espacio de numero de cuenta es igual al valor en i de la lista asigna 1 a enco
                        if (Convert.ToInt32(textBox6.Text) == list[i])
                        {
                            enco = 1;
                            vecl = i;
                            break;
                        }
                    }
                    //Si la cuenta que busco sí está entre las cuentas asignadas al cliente que seleccionó
                    if (enco == 1)
                    {
                        comboBox2.SelectedIndex = vecl;
                        mcu.mostrarDatos(textBox6.Text, textBox4, textBox7, textBox3, textBox2, textBox5);
                        cc.BloquearTodoMontoLimite(comboBox1, textBox1, comboBox2, textBox6, textBox7, button1, button4, button6);

                        //Asigna a montolimiteini el valor que tiene el montolimite en la base de datos
                        MontoLimiteIni = Convert.ToInt32(textBox7.Text);
                    }
                    else
                    //Si la cuenta que busco no está entre las cuentas asignadas al cliente, la busca en la base de datos, si aparece es porque es de otro cliente y si no, no existe
                    {
                        if (mcu.buscarCuenta(textBox6.Text) == 1)
                            MessageBox.Show("La cuenta está bajo el dominio de otro cliente.", "Error de Solicitud", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                        else
                            MessageBox.Show("La cuenta no existe.", "Error de solicitud", MessageBoxButtons.OK, MessageBoxIcon.Error);
                    }
                }
            }
        }

        //Boton limpiar
        private void button3_Click(object sender, EventArgs e)
        {
            cc.BloquearObjetosMontoLimite(comboBox1, textBox1, comboBox2, textBox6, textBox7, button1, button4, button6);
            cc.LimpiarTodoConsultar(textBox1, comboBox2, textBox2, textBox3, textBox4, textBox5, textBox6, textBox7);
        }

        //Boton consultar otra cuenta
        private void button2_Click(object sender, EventArgs e)
        {
            //Solo funciona si ya se encontró un cliente
            if (button1.Enabled == false)
            {
                cc.DesbloquearObjetosMontoLimite(comboBox1, textBox1, comboBox2, textBox6, textBox7, button1, button4, button6);
                cc.LimpiarConsultar(textBox6, textBox3, textBox4, textBox5, textBox2, textBox7);
            }
        }

        //Si se cambia el item del combobox
        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            textBox1.Text = comboBox1.Text; //se le asigna al textbox lo que tiene el combo
        }

        private void comboBox2_SelectedIndexChanged(object sender, EventArgs e)
        {
            textBox6.Text = comboBox2.Text; //se le asigna al textbox lo que tiene el combo
        }

        //Boton regresar
        private void button5_Click(object sender, EventArgs e)
        {
            VistaPrincipal.MenuPrincipal nw = new VistaPrincipal.MenuPrincipal();
            this.Hide();
            nw.Show();
        }

        //Boton actualizar monto
        private void button6_Click(object sender, EventArgs e)
        {
            //MontoDisp es igual al monto disponible de la cuenta
            int MontoDisp = Convert.ToInt32(textBox3.Text);
            //MontoLimite es igual al montolimite de la cuenta
            int MontoLimite = Convert.ToInt32(textBox7.Text);
            int MontoDispResultante;

            //Si el Limite nuevo es mayor al LimiteInicial
            if (MontoLimiteIni < Convert.ToInt32(textBox7.Text))
                MontoDispResultante = MontoLimite - MontoDisp; //Calcula el nuevo monto disponible
            else
                MontoDispResultante = MontoDisp; //Deja el monto disponible igual

            //Si el textbox lo deja vacio o digita un monto menor al monto disponible
            if (textBox7.Text == "" || Convert.ToInt32(textBox7.Text) < MontoDisp)
            {
                MessageBox.Show("Tiene que digitar un monto igual o mayor a su monto disponible", "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            else if (MontoLimite == MontoLimiteIni) //Si el monto limite no ha cambiado
            {
                MessageBox.Show("No ha cambiado su monto de crédito límite.", "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            else
            {
                if (MessageBox.Show("¿Está seguro que quiere actualizar el monto limite a ¢" + MontoLimite + "? Su saldo disponible será de ¢" + MontoDispResultante + "\n¿Está seguro que desea continuar?",
                "Confirmación", MessageBoxButtons.YesNo, MessageBoxIcon.Warning) == DialogResult.Yes)
                {
                    try
                    {
                        //Actualiza el monto limite
                        mcu.actualizarMontoLimite(textBox6.Text, Convert.ToDouble(textBox7.Text), Convert.ToDouble(MontoDispResultante));

                        mcu.odataAdapter.UpdateCommand.Parameters["@MontoL"].Value = Convert.ToDouble(this.textBox7.Text);
                        mcu.odataAdapter.UpdateCommand.Parameters["@MontoD"].Value = Convert.ToDouble(MontoDispResultante);

                        mcu.conexion.Open();
                        mcu.odataAdapter.UpdateCommand.ExecuteNonQuery();
                        mcu.conexion.Close();

                        //Ingresa en bitacora
                        mb.ingresarBitacora(DateTime.Now, "Actualizó el crédito de cuenta: "+textBox6.Text, VistaPrincipal.IniciarSesion.Username);

                        mb.odataAdapter.InsertCommand.Parameters["@fecha"].Value = DateTime.Now;
                        mb.odataAdapter.InsertCommand.Parameters["@desc"].Value = "Actualizó el crédito de cuenta: "+textBox6.Text;
                        mb.odataAdapter.InsertCommand.Parameters["@user"].Value = VistaPrincipal.IniciarSesion.Username;

                        mb.conexion.Open();
                        mb.odataAdapter.InsertCommand.ExecuteNonQuery();
                        mb.conexion.Close();

                        MessageBox.Show("El cambio de Monto Limite se realizó correctamente.", "Estado", MessageBoxButtons.OK);
                        mcu.mostrarDatos(textBox6.Text, textBox4, textBox7, textBox3, textBox2, textBox5);
                        MontoLimiteIni = Convert.ToInt32(textBox7.Text);
                    }
                    catch (Exception ex)
                    {
                       Console.WriteLine("Error: " + ex);
                    }
                    finally
                    {
                        if (mcu.conexion.State == ConnectionState.Open)
                        {
                             mcu.conexion.Close();
                        }
                    }
                }
            }
        }

        //Si el usuario cierra el programa
        private void ActualizaMontoLiCuentas_FormClosing(object sender, FormClosingEventArgs e)
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
