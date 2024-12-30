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
    class ModeloNivFun
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

        public void cargarComboNiveles(ComboBox cb1)
        {
            SqlDataReader dr = null;

            conexion.Open();

            SqlCommand cmdConsulta = new SqlCommand("select * from Niveles", conexion);

            dr = cmdConsulta.ExecuteReader();
            //Aqui ejecuta la instruccion en sql y almacena el resultado del select

            //Este if permite controlar si el dr tiene datos si es verdadero, es porque hay datos en el dr
            if (dr.Read() == true)
            {
                //Ciclo que permite cargar los datos del dr en el combo
                do
                {
                    cb1.Items.Add(dr["CodeNiv"]).ToString();
                } while (dr.Read() == true);
            }

            conexion.Close();
        }
        public int buscarCodeNiv(String codniv)
        {
            int enco = 0;

            try
            {
                conexion.Open();
                SqlCommand cmdconsulta = new SqlCommand("select * from Niveles where CodeNiv = '" + codniv + "'", conexion);
                odataAdapter.SelectCommand = cmdconsulta;
                //ejecuta la instruccion en sql que está almacenada en la variable cmdconsulta
                odataset.Clear();
                odataAdapter.Fill(odataset, "Niveles");
                //rellena el dataset con los datos de tabla niveles de acuerdo al select especificado
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
        public void registrarNivel(String codniv, String nomniv)
        {
            try
            {
                conexion.Open();
                SqlCommand cmdinsercion = new SqlCommand("insert into Niveles (CodeNiv, NameNiv) values (@codniv, @nomniv)", conexion);
                odataAdapter.InsertCommand = cmdinsercion;
                //ejecuta la instruccion en sql que está almacenada en la variable cmdconsulta
                //aqui especificamos el tipo de dato de cada uno de los parametros que se van a guardar en los campos de la tabla
                odataAdapter.InsertCommand.Parameters.Add(new SqlParameter("@codniv", SqlDbType.VarChar));
                odataAdapter.InsertCommand.Parameters.Add(new SqlParameter("@nomniv", SqlDbType.VarChar));
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
        public void cargarComboFunciones(ComboBox cb1)
        {
            SqlDataReader dr = null;

            conexion.Open();

            SqlCommand cmdConsulta = new SqlCommand("select * from Funciones", conexion);

            dr = cmdConsulta.ExecuteReader();
            //Aqui ejecuta la instruccion en sql y almacena el resultado del select

            //Este if permite controlar si el dr tiene datos si es verdadero, es porque hay datos en el dr
            if (dr.Read() == true)
            {
                //Ciclo que permite cargar los datos del dr en el combo
                do
                {
                    cb1.Items.Add(dr["CodeFun"]).ToString();
                } while (dr.Read() == true);
            }

            conexion.Close();
        }
        public int buscarCodeFun(String codfun)
        {
            int enco = 0;

            try
            {
                conexion.Open();
                SqlCommand cmdconsulta = new SqlCommand("select * from Funciones where CodeFun = '" + codfun + "'", conexion);
                odataAdapter.SelectCommand = cmdconsulta;
                //ejecuta la instruccion en sql que está almacenada en la variable cmdconsulta
                odataset.Clear();
                odataAdapter.Fill(odataset, "Funciones");
                //rellena el dataset con los datos de tabla funciones de acuerdo al select especificado
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
        public void registrarFuncion(String codfun, String nomfun)
        {
            try
            {
                conexion.Open();
                SqlCommand cmdinsercion = new SqlCommand("insert into Funciones (CodeFun, NameFun) values (@codfun, @nomfun)", conexion);
                odataAdapter.InsertCommand = cmdinsercion;
                //ejecuta la instruccion en sql que está almacenada en la variable cmdconsulta
                //aqui especificamos el tipo de dato de cada uno de los parametros que se van a guardar en los campos de la tabla
                odataAdapter.InsertCommand.Parameters.Add(new SqlParameter("@codfun", SqlDbType.VarChar));
                odataAdapter.InsertCommand.Parameters.Add(new SqlParameter("@nomfun", SqlDbType.VarChar));
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
        public void registrarFuncionNivel(String codfun, String codniv, String estado)
        {
            String nivfun = codniv + codfun;
            try
            {
                conexion.Open();
                SqlCommand cmdinsercion = new SqlCommand("insert into FuncionNivel (CodeNivFun, CodeNiv, CodeFun, Estado) values ('" + nivfun + "',@codniv, @codfun, @estado)", conexion);
                Console.WriteLine("Registrando el nivelfuncion "+nivfun+" con estado "+estado);
                odataAdapter.InsertCommand = cmdinsercion;
                //ejecuta la instruccion en sql que está almacenada en la variable cmdconsulta
                //aqui especificamos el tipo de dato de cada uno de los parametros que se van a guardar en los campos de la tabla
                odataAdapter.InsertCommand.Parameters.Add(new SqlParameter("@codfun", SqlDbType.VarChar));
                odataAdapter.InsertCommand.Parameters.Add(new SqlParameter("@codniv", SqlDbType.VarChar));
                odataAdapter.InsertCommand.Parameters.Add(new SqlParameter("@estado", SqlDbType.VarChar));
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
        public void modificarFuncionNivel(String codnivfun, String estado)
        {
            try
            {
                conexion.Open();
                SqlCommand cmdinsercion = new SqlCommand("update FuncionNivel set Estado = @estado where CodeNivFun = '"+codnivfun+"'", conexion);
                Console.WriteLine("Modificando el nivelfuncion " + codnivfun + " con estado " + estado);
                odataAdapter.UpdateCommand = cmdinsercion;
                //ejecuta la instruccion en sql que está almacenada en la variable cmdconsulta
                //aqui especificamos el tipo de dato de cada uno de los parametros que se van a guardar en los campos de la tabla
                odataAdapter.UpdateCommand.Parameters.Add(new SqlParameter("@codnivfun", SqlDbType.VarChar));
                odataAdapter.UpdateCommand.Parameters.Add(new SqlParameter("@estado", SqlDbType.VarChar));
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
        public int buscarCodeNivFun(String codnivfun)
        {
            int enco = 0;

            try
            {
                conexion.Open();
                SqlCommand cmdconsulta = new SqlCommand("select * from FuncionNivel where CodeNivFun = '" + codnivfun + "'", conexion);
                odataAdapter.SelectCommand = cmdconsulta;
                //ejecuta la instruccion en sql que está almacenada en la variable cmdconsulta
                odataset.Clear();
                odataAdapter.Fill(odataset, "FuncionNivel");
                //rellena el dataset con los datos de tabla funciones de acuerdo al select especificado
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
        public String getNivNombre(String codniv)
        {
            conexion.Open();
            SqlCommand cmdconsulta = new SqlCommand("select * from Niveles where CodeNiv = '" + codniv + "'", conexion);
            odataAdapter.SelectCommand = cmdconsulta;
            //ejecuta la instruccion en sql que está almacenada en la variable cmdconsulta
            //aqui especificamos el tipo de dato de cada uno de los parametros que se van a guardar en los campos de la tabla
            odataset.Clear();
            odataAdapter.Fill(odataset, "Niveles");
            String nombre = odataset.Tables["Niveles"].Rows[0]["NameNiv"].ToString();
            conexion.Close();
            return nombre;
        }
        public String getEstado(String codnivfun)
        {
            conexion.Open();
            SqlCommand cmdconsulta = new SqlCommand("select * from FuncionNivel where CodeNivFun = '" + codnivfun + "'", conexion);
            odataAdapter.SelectCommand = cmdconsulta;
            //ejecuta la instruccion en sql que está almacenada en la variable cmdconsulta
            //aqui especificamos el tipo de dato de cada uno de los parametros que se van a guardar en los campos de la tabla
            odataset.Clear();
            odataAdapter.Fill(odataset, "FuncionNivel");
            String estado = odataset.Tables["FuncionNivel"].Rows[0]["Estado"].ToString();
            conexion.Close();
            return estado;
        }
    }
}
