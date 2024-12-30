package Utilitario_Validaciones;

import java.sql.*;

public class Conexion_DB {
    //Se define como static para que puedan utilizarse en cualquier lugar de todo el proyecto
    static String db = "bancosfelix";
    static String login = "root";
    static String password = "";
    static String url = "jdbc:mysql://localhost/"+db;
    //En la url especificamos la direccion donde esta la db ya que se hace por medio del enlace al localhost, pero si
    //la base estuviera en un servidor, en lugar de localhost, escribiriamos la máscara del servidor o IP del servidor 190.100
    
    //La variable o objeto Connection es la que va a mantener la conexion establecida
    public static Connection con = null;
    
    //La variable Statement es por medio de la cual se van a realizar todos los comandos sobre la tabla
    public static Statement stmt;
    
    public void conectarbase() throws SQLException {
        try {
            //Permite accesar al driver de conexion de MySQL
            Class.forName("com.mysql.jdbc.Driver");
            //Esblece la conexion en la variable con, manejando los datos que tiene url, login y password
            con = DriverManager.getConnection(url, login, password);
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            //Configura el stmt para poder trabajar con los comandos sobre la tabla de la DB
            if (con != null)
                System.out.println("Conexion con Base de Datos " + con + " Correcta.");
        }
        catch(ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
    
    public void desconectarbase() {
        try {
            con.close();
        }
        catch(Exception ex) {
            System.out.println(ex);
        }
    }
}
