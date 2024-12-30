package Modelos;

import java.sql.ResultSet;
import Utilitario_Validaciones.Conexion_DB;
import javax.swing.JComboBox;
import Control_Objetos.Control_Objetos_Clientes;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import Modelos.Modelo_Datos_Cuentas;

public class Modelo_Datos_Moves {
    
    Conexion_DB cn = new Conexion_DB();
    Control_Objetos_Clientes cocl = new Control_Objetos_Clientes();
    Modelo_Datos_Cuentas mdcu = new Modelo_Datos_Cuentas();
    
    public int ComprobarSaldo(String num) {
        int saldo = 0;
        try {
            cn.conectarbase();
            String query = "select * from cuentas where Numero = '"+num+"'";
            ResultSet rs = cn.stmt.executeQuery(query);
            //Aqui ejecuta la instruccion en SQL que está almacenada 
            //en query y los resultados los deja en la variable rs
            rs.first(); //Ubica el primer registro del rs
            if (rs != null) {
                //Compara lo que hay en el rs en el campo ID con Ide
                saldo = rs.getInt("Saldo");
            }
        }
        catch(Exception ex) {
            System.out.println(ex);
        }
        return saldo;
    }
    
    public boolean RegistrarMove(String numcu, String fecha, String tipo, String monto, String nombreresp, String deta) {
        try {
            cn.conectarbase();
            String query = "insert into moves (NumeroC, FechaMov, TipoMov, MontoMov, NombreResp, Detalle) VALUES"
            + "('"+numcu+"','"+cocl.DBFecha(fecha)+"','"+tipo+"','"+monto+"','"+nombreresp+"','"+deta+"')";
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
    
    public void CargarCbMoves(JComboBox combo, String numcu) {
        try {
            cn.conectarbase();
            String query = "select * from moves where NumeroC = '"+numcu+"'";
            ResultSet rs = cn.stmt.executeQuery(query);
            rs.first();
            if (rs != null) {
                //Ciclo para recorrer el rs y cargar los datos en el combo
                do {
                    //Agrega el campo ID y Name de cada registro del rs en el campo
                    combo.addItem(rs.getString("NumeroMov")+" - "+cocl.DisFecha(rs.getString("FechaMov")) + " - "+rs.getString("TipoMov")+ " - "+rs.getString("MontoMov"));
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
    
    public void MostrarDatos(String nummov, JTextField txt1, JTextField txt2, JTextField txt3, JTextField txt4,
    JRadioButton rb1, JRadioButton rb2) {
        try {
            cn.conectarbase();
            String query = "select * from moves where NumeroMov = '"+nummov+"'";
            ResultSet rs = cn.stmt.executeQuery(query);
            //Aqui ejecuta la instruccion que esta en query y los resultados quedan en la variable rs
            rs.first();
            if (rs != null) {
                if (nummov.equals(rs.getString("NumeroMov"))) {
                    txt1.setText(cocl.DisFecha(rs.getString("FechaMov")));
                    txt2.setText(rs.getString("MontoMov"));
                    txt3.setText(rs.getString("NombreResp"));
                    txt4.setText(rs.getString("Detalle"));
                    
                    if (rs.getString("TipoMov").equals("Depósito"))
                        rb1.setSelected(true);
                    else
                        rb2.setSelected(true);
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
    
    public int BuscarMov(String nummov) {
        int enco = 0;
        try {
            cn.conectarbase();
            String query = "select * from Moves where NumeroMov = '"+nummov+"'";
            ResultSet rs = cn.stmt.executeQuery(query);
            //Aqui ejecuta la instruccion en SQL que está almacenada 
            //en query y los resultados los deja en la variable rs
            rs.first(); //Ubica el primer registro del rs
            if (rs != null) {
                //Compara lo que hay en el rs en el campo ID con Ide
                if (nummov.equals(rs.getString("NumeroMov")))
                    enco = 1;
            }
        }
        catch(Exception ex) {
            System.out.println(ex);
        }
        return enco;
    }
    
    public boolean AnularMove(String nummov, String numcu, String monto, String tipomov) {
        try {
            cn.conectarbase();
            String query = "delete from Moves where NumeroMov = '"+nummov+"'";
            cn.stmt.execute(query);
            mdcu.TransaccionCuenta(numcu, monto, tipomov);
            //Aqui ejecuta la sentencia en SQL que está en query
        } catch(Exception ex) {
            System.out.println(ex);
        }
        finally {
            try {
                cn.desconectarbase();
            } catch(Exception ex){};
        }
        return true;
    }
    
    public boolean BorrarMovimientos(String numcu) {
        try {
            cn.conectarbase();
            String query = "delete from Moves where NumeroC = '"+numcu+"'";
            cn.stmt.execute(query);
            //Aqui ejecuta la sentencia en SQL que está en query
        } catch(Exception ex) {
            System.out.println(ex);
        }
        finally {
            try {
                cn.desconectarbase();
            } catch(Exception ex){};
        }
        return true;
    }
}
