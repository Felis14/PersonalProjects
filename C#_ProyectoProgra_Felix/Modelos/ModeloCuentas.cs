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
    class ModeloCuentas
    {
        //instancia la clase conexion base de datos
        static Conexion_DB.Conexion_DB cn = new Conexion_DB.Conexion_DB();
        
        public SqlConnection conexion = new SqlConnection(Conexion_DB.Conexion_DB.StringConexion);

        //define e instancia la variable objeto odataset del tipo de objeto DataSet que funciona similar al resultset en java
        public DataSet odataset = new DataSet();

        //define e instancia la variable objeto odataAdapter del tipo de objeto SqlDataAdapter, este comando permite utilizar
        //y ejecutar las sentencias de SQL en la tabla de la base de datos
        //similar al "stmt" de java
        public SqlDataAdapter odataAdapter = new SqlDataAdapter();

        public int buscarCuenta(String numcu)
        {
            int enco = 0;

            try
            {
                conexion.Open();
                SqlCommand cmdconsulta = new SqlCommand("select * from Cuentas where NumCuenta = '" + numcu + "'", conexion);
                odataAdapter.SelectCommand = cmdconsulta;
                //ejecuta la instruccion en sql que está almacenada en la variable cmdconsulta
                odataset.Clear();
                odataAdapter.Fill(odataset, "Cuentas");
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
        public void registrarCuenta(String numcu, DateTime fecha, String estado, double MontoLi, String ID)
        {
            try
            {
                conexion.Open();
                SqlCommand cmdinsercion = new SqlCommand("insert into Cuentas (NumCuenta, FechaAper, Estado, SaldoAPagar, MontoLimite, MontoDispo, ID) values "+
                "(@numcu,@fecha, @estado, 0, @MontoLi, @MontoLi,@ID)", conexion);
                odataAdapter.InsertCommand = cmdinsercion;
                //ejecuta la instruccion en sql que está almacenada en la variable cmdconsulta
                //aqui especificamos el tipo de dato de cada uno de los parametros que se van a guardar en los campos de la tabla
                odataAdapter.InsertCommand.Parameters.Add(new SqlParameter("@numcu", SqlDbType.Int));
                odataAdapter.InsertCommand.Parameters.Add(new SqlParameter("@fecha", SqlDbType.Date));
                odataAdapter.InsertCommand.Parameters.Add(new SqlParameter("@estado", SqlDbType.VarChar));
                odataAdapter.InsertCommand.Parameters.Add(new SqlParameter("@MontoLi", SqlDbType.Float));
                odataAdapter.InsertCommand.Parameters.Add(new SqlParameter("@ID", SqlDbType.Int));
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
        public void cargarComboCuentas(ComboBox cb1, String ide)
        {
            SqlDataReader dr = null;

            conexion.Open();

            SqlCommand cmdConsulta = new SqlCommand("select * from Cuentas where ID = "+ide, conexion);

            dr = cmdConsulta.ExecuteReader();
            //Aqui ejecuta la instruccion en sql y almacena el resultado del select

            //Este if permite controlar si el dr tiene datos si es verdadero, es porque hay datos en el dr
            if (dr.Read() == true)
            {
                //Ciclo que permite cargar los datos del dr en el combo
                do
                {
                    cb1.Items.Add(dr["NumCuenta"]).ToString();
                } while (dr.Read() == true);
            }

            conexion.Close();
        }
        public void mostrarDatos(String numcu, TextBox txt1, TextBox txt2, TextBox txt3, TextBox txt4, TextBox txt5)
        {
            try
            {
                conexion.Open();
                SqlCommand cmdconsulta = new SqlCommand("select * from Cuentas where NumCuenta = '" + numcu + "'", conexion);
                odataAdapter.SelectCommand = cmdconsulta;
                //ejecuta la instruccion en sql que esta en la variable cmdconsulta
                odataset.Clear();
                odataAdapter.Fill(odataset, "Cuentas");
                //rellena el dataset con los datos de tablaclientes de acuerdo al select de cmdconsulta
                //si el dataset es mayor que 0 es porque hay datos
                if (odataAdapter.Fill(odataset) > 0)
                {
                    //enlaza o vincula el campo que está en el dataset y lo vincula con cada textbox
                    txt1.DataBindings.Add("text", odataset, "Cuentas.SaldoAPagar");
                    txt2.DataBindings.Add("text", odataset, "Cuentas.MontoLimite");
                    txt3.DataBindings.Add("text", odataset, "Cuentas.MontoDispo");
                    txt4.DataBindings.Add("text", odataset, "Cuentas.FechaAper", true, DataSourceUpdateMode.OnPropertyChanged, "", "dd/MM/yyyy");
                    txt5.DataBindings.Add("text", odataset, "Cuentas.Estado");
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
        public void condicionCuenta(String numcu, String condi)
        {
            try
            {
                conexion.Open();
                SqlCommand CmdModificar = new SqlCommand("update Cuentas set Estado = @condi where NumCuenta = '" + numcu + "'", conexion);
                odataAdapter.UpdateCommand = CmdModificar;
                //ejecuta la instruccion en sql que está almacenada en la variable cmdconsulta
                //aqui especificamos el tipo de dato de cada uno de los parametros que se van a guardar en los campos de la tabla
                odataAdapter.UpdateCommand.Parameters.Add(new SqlParameter("@condi", SqlDbType.VarChar));
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
        public void actualizarMontoLimite(String numcu, double MontoL, double MontoD)
        {
            try
            {
                conexion.Open();
                SqlCommand CmdModificar = new SqlCommand("update Cuentas set MontoLimite = @MontoL, MontoDispo = @MontoD where NumCuenta = '" + numcu + "'", conexion);
                odataAdapter.UpdateCommand = CmdModificar;
                //ejecuta la instruccion en sql que está almacenada en la variable cmdconsulta
                //aqui especificamos el tipo de dato de cada uno de los parametros que se van a guardar en los campos de la tabla
                odataAdapter.UpdateCommand.Parameters.Add(new SqlParameter("@MontoL", SqlDbType.Float));
                odataAdapter.UpdateCommand.Parameters.Add(new SqlParameter("@MontoD", SqlDbType.Float));
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
        //Obtiene y devuelve el valor de la condicion de una cuenta
        public String getCondicion(String numcu)
        {
            conexion.Open();
            SqlCommand cmdconsulta = new SqlCommand("select * from Cuentas where NumCuenta = '" + numcu + "'", conexion);
            odataAdapter.SelectCommand = cmdconsulta;
            //ejecuta la instruccion en sql que está almacenada en la variable cmdconsulta
            //aqui especificamos el tipo de dato de cada uno de los parametros que se van a guardar en los campos de la tabla
            odataset.Clear();
            odataAdapter.Fill(odataset, "Cuentas");
            String condi = odataset.Tables["Cuentas"].Rows[0]["Estado"].ToString();
            conexion.Close();
            return condi;
        }
        //Obtiene y devuelve el valor del monto disponible de una cuenta
        public int getMontoDisp(String numcu)
        {
            conexion.Open();
            SqlCommand cmdconsulta = new SqlCommand("select * from Cuentas where NumCuenta = '" + numcu + "'", conexion);
            odataAdapter.SelectCommand = cmdconsulta;
            //ejecuta la instruccion en sql que está almacenada en la variable cmdconsulta
            //aqui especificamos el tipo de dato de cada uno de los parametros que se van a guardar en los campos de la tabla
            odataset.Clear();
            odataAdapter.Fill(odataset, "Cuentas");
            int montod = Convert.ToInt32(odataset.Tables["Cuentas"].Rows[0]["MontoDispo"]);
            conexion.Close();
            return montod;
        }
        public void actualizarMontoDispo(String numcu, double monto)
        {
            try
            {
                conexion.Open();
                SqlCommand CmdModificar = new SqlCommand("update Cuentas set MontoDispo = MontoDispo + @monto, SaldoAPagar = SaldoAPagar - @monto where NumCuenta = '" + numcu + "'", conexion);
                odataAdapter.UpdateCommand = CmdModificar;
                //ejecuta la instruccion en sql que está almacenada en la variable cmdconsulta
                //aqui especificamos el tipo de dato de cada uno de los parametros que se van a guardar en los campos de la tabla
                odataAdapter.UpdateCommand.Parameters.Add(new SqlParameter("@monto", SqlDbType.Float));
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
        //Obtiene y devuelve la cantida de monto limite de una cuenta
        public int getMontoLi(String numcu)
        {
            conexion.Open();
            SqlCommand cmdconsulta = new SqlCommand("select * from Cuentas where NumCuenta = '" + numcu + "'", conexion);
            odataAdapter.SelectCommand = cmdconsulta;
            //ejecuta la instruccion en sql que está almacenada en la variable cmdconsulta
            //aqui especificamos el tipo de dato de cada uno de los parametros que se van a guardar en los campos de la tabla
            odataset.Clear();
            odataAdapter.Fill(odataset, "Cuentas");
            int montol = Convert.ToInt32(odataset.Tables["Cuentas"].Rows[0]["MontoLimite"]);
            conexion.Close();
            return montol;
        }
    }
}
