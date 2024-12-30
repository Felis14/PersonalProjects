using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data.Sql;  //biblioteca que permite hacer conexion con motor sql
using System.Data.SqlClient;    //biblioteca para poder ejecutar comandos en tablas BD
using System.Data;
using Cotidiano3_Felix.Conexion_DB;
using System.Windows.Forms;

namespace Cotidiano3_Felix.Modelos
{
    class ModeloClientes
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

        //busca una identificacion en la tabla clientes
        public int buscarID(String ide)
        {
            int enco = 0;

            try
            {
                conexion.Open();
                SqlCommand cmdconsulta = new SqlCommand("select * from Clientes where ID = '" + ide + "'", conexion);
                odataAdapter.SelectCommand = cmdconsulta;
                //ejecuta la instruccion en sql que está almacenada en la variable cmdconsulta
                odataset.Clear();
                odataAdapter.Fill(odataset, "Clientes");
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

        public void registrarCliente(String ide, String nombre, String telefono, String direccion, String email, DateTime fechareg)
        {
            try
            {
                conexion.Open();
                SqlCommand cmdinsercion = new SqlCommand("insert into Clientes (ID,Nombre,Tel,Dir,Email,FechaReg) values (@ide,@nombre,@tel,@dir,@email,@fechareg)", conexion);
                odataAdapter.InsertCommand = cmdinsercion;
                //ejecuta la instruccion en sql que está almacenada en la variable cmdconsulta
                //aqui especificamos el tipo de dato de cada uno de los parametros que se van a guardar en los campos de la tabla
                odataAdapter.InsertCommand.Parameters.Add(new SqlParameter("@ide", SqlDbType.Int));
                odataAdapter.InsertCommand.Parameters.Add(new SqlParameter("@nombre", SqlDbType.VarChar));
                odataAdapter.InsertCommand.Parameters.Add(new SqlParameter("@tel", SqlDbType.VarChar));
                odataAdapter.InsertCommand.Parameters.Add(new SqlParameter("@dir", SqlDbType.VarChar));
                odataAdapter.InsertCommand.Parameters.Add(new SqlParameter("@email", SqlDbType.VarChar));
                odataAdapter.InsertCommand.Parameters.Add(new SqlParameter("@fechareg", SqlDbType.Date));
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
        public void mostrarDatos(String ide, TextBox txt2, TextBox txt3, TextBox txt4, TextBox txt5, TextBox txt6)
        {
            try
            {
                conexion.Open(); 
                SqlCommand cmdconsulta = new SqlCommand("select * from Clientes where ID = '" + ide + "'", conexion);
                odataAdapter.SelectCommand = cmdconsulta;
                //ejecuta la instruccion en sql que esta en la variable cmdconsulta
                odataset.Clear();
                odataAdapter.Fill(odataset, "Clientes");
                //rellena el dataset con los datos de tablaclientes de acuerdo al select de cmdconsulta
                //si el dataset es mayor que 0 es porque hay datos
                if (odataAdapter.Fill(odataset) > 0)
                {
                    //enlaza o vincula el campo que está en el dataset y lo vincula con cada textbox
                    txt2.DataBindings.Add("text", odataset, "Clientes.nombre");
                    txt3.DataBindings.Add("text", odataset, "Clientes.tel");
                    txt4.DataBindings.Add("text", odataset, "Clientes.dir");
                    txt5.DataBindings.Add("text", odataset, "Clientes.email");
                    txt6.DataBindings.Add("text", odataset, "Clientes.fechareg");
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
        public void cargarComboClientes(ComboBox cb1)
        {
            SqlDataReader dr = null;

            conexion.Open();

            SqlCommand cmdConsulta = new SqlCommand("select * from Clientes", conexion);

            dr = cmdConsulta.ExecuteReader();
            //Aqui ejecuta la instruccion en sql y almacena el resultado del select

            //Este if permite controlar si el dr tiene datos si es verdadero, es porque hay datos en el dr
            if (dr.Read() == true)
            {
                //Ciclo que permite cargar los datos del dr en el combo
                do
                {
                    cb1.Items.Add(dr["ID"]).ToString();
                } while (dr.Read() == true);
            }

            conexion.Close();
        }
        public void mostrarDatosMod(String ide, TextBox txt2, TextBox txt3, TextBox txt4, TextBox txt5, DateTimePicker dtp1)
        {
            try
            {
                conexion.Open();
                SqlCommand cmdconsulta = new SqlCommand("select * from Clientes where ID = '" + ide + "'", conexion);
                odataAdapter.SelectCommand = cmdconsulta;
                //ejecuta la instruccion en sql que esta en la variable cmdconsulta
                odataset.Clear();
                odataAdapter.Fill(odataset, "Clientes");
                //rellena el dataset con los datos de tablaclientes de acuerdo al select de cmdconsulta
                //si el dataset es mayor que 0 es porque hay datos
                if (odataAdapter.Fill(odataset) > 0)
                {
                    //enlaza o vincula el campo que está en el dataset y lo vincula con cada textbox
                    txt2.DataBindings.Add("text", odataset, "Clientes.nombre");
                    txt3.DataBindings.Add("text", odataset, "Clientes.tel");
                    txt4.DataBindings.Add("text", odataset, "Clientes.dir");
                    txt5.DataBindings.Add("text", odataset, "Clientes.email");
                    dtp1.DataBindings.Add("text", odataset, "Clientes.fechareg");
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
        public void modificarcliente(String ide, String Nombre, String tel, String dir, String email, DateTime fechareg)
        {
            try
            {
                conexion.Open();
                SqlCommand CmdModificar = new SqlCommand("update Clientes set Nombre = @Nombre, Tel = @tel, Dir = @dir, Email = @email, fechareg = @fechareg where ID = '" + ide + "'", conexion);
                odataAdapter.UpdateCommand = CmdModificar;
                //ejecuta la instruccion en sql que está almacenada en la variable cmdconsulta
                //aqui especificamos el tipo de dato de cada uno de los parametros que se van a guardar en los campos de la tabla
                odataAdapter.UpdateCommand.Parameters.Add(new SqlParameter("@Nombre", SqlDbType.VarChar));
                odataAdapter.UpdateCommand.Parameters.Add(new SqlParameter("@tel", SqlDbType.VarChar));
                odataAdapter.UpdateCommand.Parameters.Add(new SqlParameter("@dir", SqlDbType.VarChar));
                odataAdapter.UpdateCommand.Parameters.Add(new SqlParameter("@email", SqlDbType.VarChar));
                odataAdapter.UpdateCommand.Parameters.Add(new SqlParameter("@fechareg", SqlDbType.Date));

                //rellena el dataset con los datos de tablaclientes de acuerdo al select especificado
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
    }
}
