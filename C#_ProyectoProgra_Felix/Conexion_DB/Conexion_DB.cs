using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using System.Data.Sql;  //biblioteca que permite hacer conexion con motor sql
using System.Data.SqlClient;    //biblioteca para poder ejecutar comandos en tablas BD
using System.Data;

namespace Cotidiano3_Felix.Conexion_DB
{
    class Conexion_DB
    {
        //define o construye una variable de tipo objeto que permite hacer
        //conexion con la base de datos de sql
        //En el parentesis lo que iria la cadena de conexion a la base de datos

        //Aqui están todas las fuentes de datos como una variable estática que se usa en todo el programa, solo una se activa y las demas se desactivan
        //poniendolas como comentario
        //public static String StringConexion = "Data Source=LAPTOP-GM17HO9T;Initial Catalog=CreditosF;Integrated Security=True";
        //public static String StringConexion = "Data Source=DESKTOP-AQPCF9D;Initial Catalog=CreditosF;Integrated Security=True";
        public static String StringConexion = "Data Source=LAPTOP-M044RKF3;Initial Catalog=CreditosF;Integrated Security=True";

        public SqlConnection conexion = new SqlConnection(StringConexion);

        public void conectarbase()
        {
            try
            {
                conexion.Open();
                Console.WriteLine("Conexion exitosa");
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