package Modelos;

import java.sql.ResultSet;
import javax.swing.JComboBox;
import Utilitario_Validaciones.Conexion_DB;

public class Modelo_Datos_Fun {
    
    Conexion_DB cn = new Conexion_DB();
    
    public int SigNumDispo() {
        int n=0;
        try {
            cn.conectarbase();
            String query = "select * from Funciones order by CodeFun asc";
            ResultSet rs = cn.stmt.executeQuery(query);
            //Aqui ejecuta la instruccion en SQL que está almacenada 
            //en query y los resultados los deja en la variable rs
            rs.first(); //Ubica el primer registro del rs
            do {
                //Asigna a la variable n el número en el query en el campo ID
                n = Integer.valueOf(rs.getString("CodeFun"));
                rs.next();
                //Si n es menor al valor ID y es menor al valor ID-1 tambien,
                //rompe el ciclo (ya que queda un espacio libre entre un numero y otro
                if (n < rs.getInt("CodeFun") && n < (rs.getInt("CodeFun") - 1))
                    break;
            } while (rs != null);
        }
        catch(Exception ex) {
            System.out.println(ex);
        } finally {
            try {
                cn.desconectarbase();
            }
            catch(Exception ex){};
        }
        return n+1;
    }
    
    public int BuscarFun(String fun) {
        int enco = 0;
        try {
            String query = "select * from Funciones where CodeFun = '"+fun+"'";
            ResultSet rs = cn.stmt.executeQuery(query);
            //Aqui ejecuta la instruccion en SQL que está almacenada 
            //en query y los resultados los deja en la variable rs
            rs.first(); //Ubica el primer registro del rs
            if (rs != null) {
                //Compara lo que hay en el rs en el campo ID con Ide
                if (fun.equals(rs.getString("CodeFun")))
                    enco = 1;
            }
        }
        catch(Exception ex) {
            System.out.println(ex);
        } finally {
            try {
                cn.desconectarbase();
            }
            catch(Exception ex){};
        }
        return enco;
    }
    
    public boolean IngresarFun(String fun, String nom) {
        try {
            cn.conectarbase();
            String query = "insert into Funciones (CodeFun, NameFun) values ('"+fun+"','"+nom+"')";
            cn.stmt.execute(query);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                cn.desconectarbase();
            }
            catch(Exception ex){};
        }
        return true;
    }
    
    public void CargarCbFuns(JComboBox combo) {
        try {
            cn.conectarbase();
            String query = "select * from funciones";
            ResultSet rs = cn.stmt.executeQuery(query);
            rs.first();
            if (rs != null) {
                //Ciclo para recorrer el rs y cargar los datos en el combo
                do {
                    //Agrega el campo Niv y Name de cada registro del rs en el campo
                    combo.addItem(rs.getString("CodeFun")+" - "+rs.getString("NameFun"));
                    rs.next();
                    //Acceso o lee el siguiente registro del rs
                } while (rs != null);
            }
        }
        catch(Exception ex) {
            System.out.println(ex);
        } finally {
            try {
                cn.desconectarbase();
            }
            catch(Exception e){}
        }
    }
}
