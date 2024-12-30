using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using System.Data.Sql;  //biblioteca que permite hacer conexion con motor sql
using System.Data.SqlClient;    //biblioteca para poder ejecutar comandos en tablas BD
using System.Data;
using System.Windows.Forms;

namespace Cotidiano3_Felix.Modelos
{
    class ModeloReportes
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

        public void cargarTablaClientes(String query, DataGridView dgv1)
        {
            try
            {
                conexion.Open();

                SqlCommand oCmdConsulta = new SqlCommand(query, conexion);
                odataAdapter.SelectCommand = oCmdConsulta;

                odataset.Clear();
                odataAdapter.Fill(odataset, "Clientes"); //Llena odataset con todos los registros de clientes

                dgv1.DataSource = odataset.Tables["Clientes"]; // Cambia a la tabla correcta en el DataSet y define que la fuente de datos de la tabla es lo que estaba en odataset

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
        public void cargarTablaCuentas(String query, DataGridView dgv1)
        {
            try
            {
                conexion.Open();

                SqlCommand oCmdConsulta = new SqlCommand(query, conexion);
                odataAdapter.SelectCommand = oCmdConsulta;

                odataset.Clear();
                odataAdapter.Fill(odataset, "Cuentas");

                dgv1.DataSource = odataset.Tables["Cuentas"]; // Cambia a la tabla correcta en el DataSet

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
