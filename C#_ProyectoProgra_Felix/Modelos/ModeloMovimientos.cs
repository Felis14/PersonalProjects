using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Cotidiano3_Felix.Conexion_DB;
using System.Data.Sql;  //biblioteca que permite hacer conexion con motor sql
using System.Data.SqlClient;    //biblioteca para poder ejecutar comandos en tablas BD
using System.Data;
using System.Windows.Forms;

namespace Cotidiano3_Felix.Modelos
{
    class ModeloMovimientos
    {
        //instancia la clase conexion base de datos
        static Conexion_DB.Conexion_DB cn = new Conexion_DB.Conexion_DB();

        public SqlConnection conexion = new SqlConnection(Conexion_DB.Conexion_DB.StringConexion);
        //public SqlConnection conexion = new SqlConnection("Data Source=DESKTOP-AQPCF9D;Initial Catalog=CreditosF;Integrated Security=True");

        //define e instancia la variable objeto odataset del tipo de objeto DataSet que funciona similar al resultset en java
        public DataSet odataset = new DataSet();

        //define e instancia la variable objeto odataAdapter del tipo de objeto SqlDataAdapter, este comando permite utilizar
        //y ejecutar las sentencias de SQL en la tabla de la base de datos
        //similar al "stmt" de java
        public SqlDataAdapter odataAdapter = new SqlDataAdapter();

        public void registrarMovimiento(int numcu, DateTime fecha, String tipo, double monto, String nombreresp, String detalle)
        {
            try
            {
                conexion.Open();
                SqlCommand cmdinsercion = new SqlCommand("insert into Movimientos (NumCuenta, FechaMov, TipoMov, MontoMov, NombreDelResp, Detalle) values " +
                "(@numcu,@fecha,@tipo,@monto,@nombreresp,@detalle)", conexion);
                odataAdapter.InsertCommand = cmdinsercion;
                //ejecuta la instruccion en sql que está almacenada en la variable cmdconsulta
                //aqui especificamos el tipo de dato de cada uno de los parametros que se van a guardar en los campos de la tabla
                odataAdapter.InsertCommand.Parameters.Add(new SqlParameter("@numcu", SqlDbType.Int));
                odataAdapter.InsertCommand.Parameters.Add(new SqlParameter("@fecha", SqlDbType.Date));
                odataAdapter.InsertCommand.Parameters.Add(new SqlParameter("@tipo", SqlDbType.VarChar));
                odataAdapter.InsertCommand.Parameters.Add(new SqlParameter("@monto", SqlDbType.Float));
                odataAdapter.InsertCommand.Parameters.Add(new SqlParameter("@nombreresp", SqlDbType.VarChar));
                odataAdapter.InsertCommand.Parameters.Add(new SqlParameter("@detalle", SqlDbType.VarChar));
                conexion.Close();
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex);
            }
            finally
            {
                if (conexion.State == ConnectionState.Open)
                    conexion.Close();
            }
        }
        //getUltimoMov sirve para agarrar el numero movimiento del ultimo registro creado en la tabla movimientos
        public int getUltimoMov()
        {
            conexion.Open();
            SqlCommand cmdconsulta = new SqlCommand("select * from Movimientos", conexion);
            odataAdapter.SelectCommand = cmdconsulta;
            //ejecuta la instruccion en sql que está almacenada en la variable cmdconsulta
            //aqui especificamos el tipo de dato de cada uno de los parametros que se van a guardar en los campos de la tabla
            odataset.Clear();
            odataAdapter.Fill(odataset, "Movimientos");
            int ultimoMov = Convert.ToInt32(odataset.Tables["Movimientos"].Rows[(odataset.Tables["Movimientos"].Rows.Count)-1]["NumMov"]);
            conexion.Close();
            return ultimoMov;
        }
        //cargarComboMovimientos sirve para cargar todos los movimientos en un combo box
        public void cargarComboMovimientos(ComboBox cb1, String numcu)
        {
            SqlDataReader dr = null;

            conexion.Open();

            SqlCommand cmdConsulta = new SqlCommand("select * from Movimientos where NumCuenta = " + numcu, conexion);

            dr = cmdConsulta.ExecuteReader();
            //Aqui ejecuta la instruccion en sql y almacena el resultado del select

            //Este if permite controlar si el dr tiene datos si es verdadero, es porque hay datos en el dr
            if (dr.Read() == true)
            {
                //Ciclo que permite cargar los datos del dr en el combo
                do
                {
                    cb1.Items.Add(dr["NumMov"] +" - " + dr["Detalle"]).ToString();
                } while (dr.Read() == true);
            }

            conexion.Close();
        }
        public void mostrarDatos(String nummov, TextBox txt1, TextBox txt2, TextBox txt3, TextBox txt4, TextBox txt5)
        {
            try
            {
                conexion.Open();
                SqlCommand cmdconsulta = new SqlCommand("select * from Movimientos where NumMov = '" + nummov + "'", conexion);
                odataAdapter.SelectCommand = cmdconsulta;
                //ejecuta la instruccion en sql que esta en la variable cmdconsulta
                odataset.Clear();
                odataAdapter.Fill(odataset, "Movimientos");
                //rellena el dataset con los datos de tablaclientes de acuerdo al select de cmdconsulta
                //si el dataset es mayor que 0 es porque hay datos
                if (odataAdapter.Fill(odataset) > 0)
                {
                    //enlaza o vincula el campo que está en el dataset y lo vincula con cada textbox
                    txt1.DataBindings.Add("text", odataset, "Movimientos.FechaMov", true, DataSourceUpdateMode.OnPropertyChanged, "", "dd/MM/yyyy");
                    txt2.DataBindings.Add("text", odataset, "Movimientos.TipoMov");
                    txt3.DataBindings.Add("text", odataset, "Movimientos.MontoMov");
                    txt4.DataBindings.Add("text", odataset, "Movimientos.NombreDelResp");
                    txt5.DataBindings.Add("text", odataset, "Movimientos.Detalle");
                }
                conexion.Close();
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex);
            }
            finally
            {
                if (conexion.State == ConnectionState.Open)
                    conexion.Close();
            }
        }
        public void anularMovimiento(int nummov)
        {
            try
            {
                conexion.Open();
                SqlCommand CmdEliminar = new SqlCommand("delete from Movimientos where NumMov = '" + nummov + "'", conexion);
                odataAdapter.DeleteCommand = CmdEliminar;
                //ejecuta la instruccion en sql que está almacenada en la variable cmdconsulta
                //aqui especificamos el tipo de dato de cada uno de los parametros que se van a guardar en los campos de la tabla
                odataAdapter.DeleteCommand.Parameters.Add(new SqlParameter("@nummov", SqlDbType.Int));
                conexion.Close();
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex);
            }
            finally
            {
                if (conexion.State == ConnectionState.Open)
                    conexion.Close();
            }
        }
        public int buscarMov(int nummov)
        {
            int enco = 0;

            try
            {
                conexion.Open();
                SqlCommand cmdconsulta = new SqlCommand("select * from Movimientos where NumMov = '" + nummov + "'", conexion);
                odataAdapter.SelectCommand = cmdconsulta;
                //ejecuta la instruccion en sql que está almacenada en la variable cmdconsulta
                odataset.Clear();
                odataAdapter.Fill(odataset, "Movimientos");
                //rellena el dataset con los datos de tablaclientes de acuerdo al select especificado
                conexion.Close();
                //si el dataset es mayor que 0 es porque hay datos
                if (odataAdapter.Fill(odataset) > 0)
                {
                    enco = 1;
                }
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex);
            }
            finally
            {
                if (conexion.State == ConnectionState.Open)
                    conexion.Close();
            }
            return enco;
        }
    }
}
