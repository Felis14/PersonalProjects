package Modelos;

import Control_Objetos.Control_Objetos_Clientes;
import Utilitario_Validaciones.Conexion_DB;
import java.sql.*;
import javax.swing.*;

public class Modelo_Datos_Clientes {
    Control_Objetos_Clientes coc = new Control_Objetos_Clientes();
    Conexion_DB cn = new Conexion_DB();
    
    //Funcion que busca una identificacion en la tabla para ver si ya existe
    public int BuscarID(String id) {
        int enco = 0;
        try {
            cn.conectarbase();
            String query = "select * from clientes where ID = '"+id+"'";
            ResultSet rs = cn.stmt.executeQuery(query);
            //Aqui ejecuta la instruccion en SQL que está almacenada 
            //en query y los resultados los deja en la variable rs
            rs.first(); //Ubica el primer registro del rs
            if (rs != null) {
                //Compara lo que hay en el rs en el campo ID con Ide
                if (id.equals(rs.getString("ID")))
                    enco = 1;
            }
        }
        catch(Exception ex) {
            System.out.println(ex);
        }
        return enco;
    }
    
    public boolean RegistrarCliente(int ID, String Nom, String Tel, String Dir, String Email, String FechaReg) {
        try {
            cn.conectarbase();
            String query = "insert into clientes (ID, Name, Tel, Dir, Email, FechaReg) VALUES"
            + "('"+ID+"','"+Nom+"','"+Tel+"','"+Dir+"','"+Email+"','"+FechaReg+"')";
            cn.stmt.execute(query);
            //Aqui ejecuta la sentencia en SQL que está en query
        }
        catch(Exception ex) {
            System.out.println(ex);
        }
        finally {
            try {
                cn.desconectarbase();
            }
            catch(Exception ex){};
        }
        return true;
    }
    
    //Carga un combo box con todos los clientes registrados
    public void CargarCbClientes(JComboBox combo) {
        try {
            cn.conectarbase();
            String query = "select * from clientes";
            ResultSet rs = cn.stmt.executeQuery(query);
            rs.first();
            if (rs != null) {
                //Ciclo para recorrer el rs y cargar los datos en el combo
                do {
                    //Agrega el campo ID y Name de cada registro del rs en el campo
                    combo.addItem(rs.getString("ID")+" - "+rs.getString("Name"));
                    rs.next();
                    //Acceso o lee el siguiente registro del rs
                } while (rs != null);
            }
        }
        catch(Exception ex) {
            System.out.println(ex);
        }
        finally {
            try {
                cn.desconectarbase();
            }
            catch(Exception e){}
        }
    }
    
    public void MostrarDatos(String id, JTextField nom, JTextField tel, JTextField dir,
    JTextField email, JTextField fechareg) {
        try {
            cn.conectarbase();
            String query = "select * from clientes where ID = '"+id+"'";
            ResultSet rs = cn.stmt.executeQuery(query);
            //Aqui ejecuta la instruccion que esta en query y los resultados quedan en la variable rs
            rs.first();
            if (rs != null) {
                if (id.equals(rs.getString("ID"))) {
                    nom.setText(rs.getString("Name"));
                    tel.setText(rs.getString("Tel"));
                    dir.setText(rs.getString("Dir"));
                    email.setText(rs.getString("Email"));
                    fechareg.setText(coc.DisFecha(rs.getString("FechaReg")));
                }
            }
        }
        catch(Exception ex) {
            System.out.println(ex);
        }
        finally {
            try {
                cn.desconectarbase();
            }
            catch(Exception e){}
        }
    }
    
    public boolean ActualizarCliente(int ID, String Nom, String Tel, String Dir, String Email, String FechaReg) {
        try {
            cn.conectarbase();
            String query = "UPDATE clientes SET Name = '"+Nom+"', Tel = '"+Tel+"', Dir = '"+Dir+"', Email = '"+Email+"', FechaReg = '"+FechaReg+"' where ID = '"+ID+"'";
            cn.stmt.execute(query);
        }
        catch(Exception ex) {
            System.out.println(ex);
            return false;
        }
        finally {
            cn.desconectarbase();
        }
        return true;
    }
    
    public int SigNumDispo() {
        int n=0;
        try {
            cn.conectarbase();
            String query = "select * from clientes order by ID asc";
            ResultSet rs = cn.stmt.executeQuery(query);
            //Aqui ejecuta la instruccion en SQL que está almacenada 
            //en query y los resultados los deja en la variable rs
            rs.first(); //Ubica el primer registro del rs
            do {
                //Asigna a la variable n el número en el query en el campo ID
                n = Integer.valueOf(rs.getString("ID"));
                rs.next();
                //Si n es menor al valor ID y es menor al valor ID-1 tambien,
                //rompe el ciclo (ya que queda un espacio libre entre un numero y otro
                if (n < rs.getInt("ID") && n < (rs.getInt("ID") - 1))
                    break;
            } while (rs != null);
        }
        catch(Exception ex) {
            System.out.println(ex);
        }
        return n+1;
    }
}
