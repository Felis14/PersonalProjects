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
    class ModeloUsuarios
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

        public int buscarUser(String user)
        {
            int enco = 0;

            try
            {
                conexion.Open();
                SqlCommand cmdconsulta = new SqlCommand("select * from Usuarios where Username = '" + user + "'", conexion);
                odataAdapter.SelectCommand = cmdconsulta;
                //ejecuta la instruccion en sql que está almacenada en la variable cmdconsulta
                odataset.Clear();
                odataAdapter.Fill(odataset, "Username");
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
        public void registrarUser(String ide, String nombre, String apel, DateTime fecha, String user, String pass, String nivel, String estado)
        {
            try
            {
                conexion.Open();
                SqlCommand cmdinsercion = new SqlCommand("insert into Usuarios (ID, Nombre, Apellidos, FechaReg, Username, Contra, NivelUsuario, Estado) values " +
                "(@ide, @nombre, @apel, @fecha, @user, @pass, @nivel, @estado)", conexion);
                odataAdapter.InsertCommand = cmdinsercion;
                //ejecuta la instruccion en sql que está almacenada en la variable cmdconsulta
                //aqui especificamos el tipo de dato de cada uno de los parametros que se van a guardar en los campos de la tabla
                odataAdapter.InsertCommand.Parameters.Add(new SqlParameter("@ide", SqlDbType.Int));
                odataAdapter.InsertCommand.Parameters.Add(new SqlParameter("@nombre", SqlDbType.VarChar));
                odataAdapter.InsertCommand.Parameters.Add(new SqlParameter("@apel", SqlDbType.VarChar));
                odataAdapter.InsertCommand.Parameters.Add(new SqlParameter("@fecha", SqlDbType.Date));
                odataAdapter.InsertCommand.Parameters.Add(new SqlParameter("@user", SqlDbType.VarChar));
                odataAdapter.InsertCommand.Parameters.Add(new SqlParameter("@pass", SqlDbType.VarChar));
                odataAdapter.InsertCommand.Parameters.Add(new SqlParameter("@nivel", SqlDbType.VarChar));
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
        public int ContraseñasMalas(String texto)
        {
            texto = texto.ToLower();
            int contramala = 0;
            String[] contrasmalas = {"password", "123456", "123456789", "guest", "qwerty", "12345678", "111111", "col123456", "123123",
            "1234567", "1234567890", "0123456789", "012345", "000000", "555555", "222222", "333333", "444444", "666666", "777777", "888888", "999999",
            "123321", "654321", "543210", "012210", "7777777", "d1lakiss", "110110jp", "dragon", "987654321", "9876543210", "000000000000", "111111111111",
            "222222222222", "333333333333", "444444444444", "555555555555", "666666666666", "77777777777", "888888888888", "999999999999", "qwerty123456",
            "qwerty012345", "ytrewq", "654321ytrewq", "ytrewq654321", "baseball", "abc123", "football", "monkey", "letmein", "shadow", "master", "696969",
            "michael", "mustang", "superman", "1qaz2wsx", "qazwsx", "fuckyou", "jordan", "killer", "trustno1", "hunter", "buster",
            "asdfgh", "batman", "soccer", "tigger", "charlie", "q1w2e3r4", "q1w2e3", "qweasdzxc", "asdfasdf", "qwer1234"};
            for (int i = 0; i < contrasmalas.Length; i++)
            {
                if (texto.Equals("" + contrasmalas[i]))
                {
                    contramala++;
                }
            }
            return contramala;
        }
        public void mostrarDatos(String user, TextBox txt1, TextBox txt2, TextBox txt3, TextBox txt4, TextBox txt5, TextBox txt6, TextBox txt7)
        {
            try
            {
                conexion.Open();
                SqlCommand cmdconsulta = new SqlCommand("select * from Usuarios where Username = '" + user + "'", conexion);
                odataAdapter.SelectCommand = cmdconsulta;
                //ejecuta la instruccion en sql que esta en la variable cmdconsulta
                odataset.Clear();
                odataAdapter.Fill(odataset, "Usuarios");
                //rellena el dataset con los datos de tablaclientes de acuerdo al select de cmdconsulta
                //si el dataset es mayor que 0 es porque hay datos
                if (odataAdapter.Fill(odataset) > 0)
                {
                    //enlaza o vincula el campo que está en el dataset y lo vincula con cada textbox
                    txt1.DataBindings.Add("text", odataset, "Usuarios.Contra");
                    txt2.DataBindings.Add("text", odataset, "Usuarios.ID");
                    txt3.DataBindings.Add("text", odataset, "Usuarios.Nombre");
                    txt4.DataBindings.Add("text", odataset, "Usuarios.Apellidos");
                    txt5.DataBindings.Add("text", odataset, "Usuarios.NivelUsuario");
                    txt6.DataBindings.Add("text", odataset, "Usuarios.FechaReg", true, DataSourceUpdateMode.OnPropertyChanged, "", "dd/MM/yyyy");
                    txt7.DataBindings.Add("text", odataset, "Usuarios.Estado");
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
        public void mostrarDatosMod(String user, TextBox txt1, TextBox txt2, TextBox txt3, TextBox txt4, ComboBox cb1)
        {
            try
            {
                conexion.Open();
                SqlCommand cmdconsulta = new SqlCommand("select * from Usuarios where Username = '" + user + "'", conexion);
                odataAdapter.SelectCommand = cmdconsulta;
                //ejecuta la instruccion en sql que esta en la variable cmdconsulta
                odataset.Clear();
                odataAdapter.Fill(odataset, "Usuarios");
                //rellena el dataset con los datos de tablaclientes de acuerdo al select de cmdconsulta
                //si el dataset es mayor que 0 es porque hay datos
                if (odataAdapter.Fill(odataset) > 0)
                {
                    //enlaza o vincula el campo que está en el dataset y lo vincula con cada textbox
                    txt1.DataBindings.Add("text", odataset, "Usuarios.Contra");
                    txt2.DataBindings.Add("text", odataset, "Usuarios.ID");
                    txt3.DataBindings.Add("text", odataset, "Usuarios.Nombre");
                    txt4.DataBindings.Add("text", odataset, "Usuarios.Apellidos");

                    for (int i = 0; i < cb1.Items.Count; i++)
                    {
                        if (cb1.Items[i].ToString() == odataset.Tables["Usuarios"].Rows[0]["NivelUsuario"].ToString())
                        {
                            cb1.SelectedIndex = i;
                            break;
                        }
                    }
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
        public void modificarUsuario(String user, String pass, int ide, String nombre, String apel, String nivel)
        {
            try
            {
                conexion.Open();
                SqlCommand CmdModificar = new SqlCommand("update Usuarios set Contra = @pass, ID = @ide, Nombre = @nombre, Apellidos = @apel where Username = '" + user + "'", conexion);
                odataAdapter.UpdateCommand = CmdModificar;
                //ejecuta la instruccion en sql que está almacenada en la variable cmdmodificar
                //aqui especificamos el tipo de dato de cada uno de los parametros que se van a guardar en los campos de la tabla
                odataAdapter.UpdateCommand.Parameters.Add(new SqlParameter("@pass", SqlDbType.VarChar));
                odataAdapter.UpdateCommand.Parameters.Add(new SqlParameter("@ide", SqlDbType.Int));
                odataAdapter.UpdateCommand.Parameters.Add(new SqlParameter("@nombre", SqlDbType.VarChar));
                odataAdapter.UpdateCommand.Parameters.Add(new SqlParameter("@apel", SqlDbType.VarChar));
                odataAdapter.UpdateCommand.Parameters.Add(new SqlParameter("@nivel", SqlDbType.VarChar));

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
        public void mostrarDatosAct(String user, TextBox txt1, TextBox txt2, TextBox txt3, TextBox txt4, TextBox txt5)
        {
            try
            {
                conexion.Open();
                SqlCommand cmdconsulta = new SqlCommand("select * from Usuarios where Username = '" + user + "'", conexion);
                odataAdapter.SelectCommand = cmdconsulta;
                //ejecuta la instruccion en sql que esta en la variable cmdconsulta
                odataset.Clear();
                odataAdapter.Fill(odataset, "Usuarios");
                //rellena el dataset con los datos de tablaclientes de acuerdo al select de cmdconsulta
                //si el dataset es mayor que 0 es porque hay datos
                if (odataAdapter.Fill(odataset) > 0)
                {
                    //enlaza o vincula el campo que está en el dataset y lo vincula con cada textbox
                    txt1.DataBindings.Add("text", odataset, "Usuarios.ID");
                    txt2.DataBindings.Add("text", odataset, "Usuarios.Nombre");
                    txt3.DataBindings.Add("text", odataset, "Usuarios.Apellidos");
                    txt4.DataBindings.Add("text", odataset, "Usuarios.NivelUsuario");
                    txt5.DataBindings.Add("text", odataset, "Usuarios.Estado");
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
        public void cambiarEstadoUsuario(String user, String estado)
        {
            try
            {
                conexion.Open();
                SqlCommand CmdModificar = new SqlCommand("update Usuarios set Estado = @estado where Username = '" + user + "'", conexion);
                odataAdapter.UpdateCommand = CmdModificar;
                //ejecuta la instruccion en sql que está almacenada en la variable cmdmodificar
                //aqui especificamos el tipo de dato de cada uno de los parametros que se van a guardar en los campos de la tabla
                odataAdapter.UpdateCommand.Parameters.Add(new SqlParameter("@estado", SqlDbType.VarChar));

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
        public void mostrarDatosEliminar(String user, TextBox txt1, TextBox txt2, TextBox txt3, TextBox txt4, TextBox txt5, TextBox txt6)
        {
            try
            {
                conexion.Open();
                SqlCommand cmdconsulta = new SqlCommand("select * from Usuarios where Username = '" + user + "'", conexion);
                odataAdapter.SelectCommand = cmdconsulta;
                //ejecuta la instruccion en sql que esta en la variable cmdconsulta
                odataset.Clear();
                odataAdapter.Fill(odataset, "Usuarios");
                //rellena el dataset con los datos de tablaclientes de acuerdo al select de cmdconsulta
                //si el dataset es mayor que 0 es porque hay datos
                if (odataAdapter.Fill(odataset) > 0)
                {
                    //enlaza o vincula el campo que está en el dataset y lo vincula con cada textbox
                    txt1.DataBindings.Add("text", odataset, "Usuarios.ID");
                    txt2.DataBindings.Add("text", odataset, "Usuarios.Nombre");
                    txt3.DataBindings.Add("text", odataset, "Usuarios.Apellidos");
                    txt4.DataBindings.Add("text", odataset, "Usuarios.NivelUsuario");
                    txt5.DataBindings.Add("text", odataset, "Usuarios.FechaReg", true, DataSourceUpdateMode.OnPropertyChanged, "", "dd/MM/yyyy");
                    txt6.DataBindings.Add("text", odataset, "Usuarios.Estado");
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
        public void EliminarUsuario(String user)
        {
            try
            {
                conexion.Open();
                SqlCommand cmdeliminar = new SqlCommand("delete from Usuarios where Username = '" + user + "'", conexion);
                odataAdapter.DeleteCommand = cmdeliminar;
                //ejecuta la instruccion en sql que esta en la variable cmdeliminar
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
        public String getEstado(String user)
        {
            conexion.Open();
            SqlCommand cmdconsulta = new SqlCommand("select * from Usuarios where Username = '" + user + "'", conexion);
            odataAdapter.SelectCommand = cmdconsulta;
            //ejecuta la instruccion en sql que está almacenada en la variable cmdconsulta
            //aqui especificamos el tipo de dato de cada uno de los parametros que se van a guardar en los campos de la tabla
            odataset.Clear();
            odataAdapter.Fill(odataset, "Usuarios");
            String estado = odataset.Tables["Usuarios"].Rows[0]["Estado"].ToString();
            conexion.Close();
            return estado;
        }
        public String getPass(String user)
        {
            conexion.Open();
            SqlCommand cmdconsulta = new SqlCommand("select * from Usuarios where Username = '" + user + "'", conexion);
            odataAdapter.SelectCommand = cmdconsulta;
            //ejecuta la instruccion en sql que está almacenada en la variable cmdconsulta
            //aqui especificamos el tipo de dato de cada uno de los parametros que se van a guardar en los campos de la tabla
            odataset.Clear();
            odataAdapter.Fill(odataset, "Usuarios");
            String pass = odataset.Tables["Usuarios"].Rows[0]["Contra"].ToString();
            conexion.Close();
            return pass;
        }
        public String getNivel(String user)
        {
            conexion.Open();
            SqlCommand cmdconsulta = new SqlCommand("select * from Usuarios where Username = '" + user + "'", conexion);
            odataAdapter.SelectCommand = cmdconsulta;
            //ejecuta la instruccion en sql que está almacenada en la variable cmdconsulta
            //aqui especificamos el tipo de dato de cada uno de los parametros que se van a guardar en los campos de la tabla
            odataset.Clear();
            odataAdapter.Fill(odataset, "Usuarios");
            String nivel = odataset.Tables["Usuarios"].Rows[0]["NivelUsuario"].ToString();
            conexion.Close();
            return nivel;
        }
        public String getNombre(String user)
        {
            String userna = "";
            conexion.Open();
            SqlCommand cmdconsulta = new SqlCommand("select * from Usuarios where Username = '" + user + "'", conexion);
            odataAdapter.SelectCommand = cmdconsulta;
            //ejecuta la instruccion en sql que está almacenada en la variable cmdconsulta
            //aqui especificamos el tipo de dato de cada uno de los parametros que se van a guardar en los campos de la tabla
            odataset.Clear();
            odataAdapter.Fill(odataset, "Usuarios");
            String usern = odataset.Tables["Usuarios"].Rows[0]["Nombre"].ToString();

            for (int i=0; i < usern.Length; i++)
            {
                if (usern[i] == ' ')
                    break;

                userna += usern[i];
            }

            conexion.Close();
            return userna;
        }
    }
}
