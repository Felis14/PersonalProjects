package Modelos;

import Control_Objetos.Control_Objetos_Clientes;
import Utilitario_Validaciones.Conexion_DB;
import java.sql.ResultSet;
import javax.swing.*;

public class Modelo_Bitacoras {
    
    Conexion_DB cn = new Conexion_DB();
    
    public boolean IngresarBitacora(String fecha, String user, String cambio) {
        try {
            cn.conectarbase();
            String query = "Insert into bitacora (FechaMov, Username, Cambio) VALUES ('"+fecha+"','"+user+"','"+cambio+"')";
            cn.stmt.execute(query);
        } catch(Exception ex) {
            System.out.println(ex);
        } finally {
            try {
                cn.desconectarbase();
            } catch(Exception e) {}
        }
        return true;
    }
}
