package Modelos;

import javax.swing.JComboBox;
import java.sql.*;

import Utilitario_Validaciones.Conexion_DB;

import javax.swing.JLabel;
import javax.swing.JTextField;
import Control_Objetos.Control_Objetos_Clientes;
import javax.swing.JRadioButton;

public class Modelo_Datos_Cuentas {
    
    Conexion_DB cn = new Conexion_DB();
    Control_Objetos_Clientes cocl = new Control_Objetos_Clientes();
    
    public boolean RegistrarCuenta(int ID, String fecha, String tcue, String tmon, String MontoAp) {
        try {
            cn.conectarbase();
            String query = "insert into cuentas (FechaAp, TCuenta, TMoneda, Saldo, ID, MontoAp, Estado) VALUES"
            + "('"+fecha+"','"+tcue+"','"+tmon+"','"+MontoAp+"','"+ID+"','"+MontoAp+"','Activa')";
            cn.stmt.execute(query);
            //Aqui ejecuta la sentencia en SQL que está en query
        }
        catch(Exception ex) {
            System.out.println(ex);
        } finally {
            try {
                cn.desconectarbase();
            }
            catch(Exception ex){};
        }
        return true;
    }
    
    public void CargarCbCuentas(JComboBox combo, String ID) {
        try {
            cn.conectarbase();
            String query = "select * from cuentas where ID = '"+ID+"'";
            ResultSet rs = cn.stmt.executeQuery(query);
            rs.first();
            if (rs != null) {
                //Ciclo para recorrer el rs y cargar los datos en el combo
                do {
                    //Agrega el campo ID y Name de cada registro del rs en el campo
                    combo.addItem(rs.getString("Numero")+" - "+rs.getString("TCuenta") + " - "+rs.getString("TMoneda")+ " - "+rs.getString("Saldo")+ " - "+rs.getString("Estado"));
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
    
    public void MostrarDatosCuenta(String numcu, JTextField txt1, JTextField txt2, JTextField txt3, JTextField txt4, JLabel lb1,
    JRadioButton rb1, JRadioButton rb2, JRadioButton rb3, JRadioButton rb4) {
        try {
            cn.conectarbase();
            String query = "select * from cuentas where Numero = '"+numcu+"'";
            ResultSet rs = cn.stmt.executeQuery(query);
            //Aqui ejecuta la instruccion que esta en query y los resultados quedan en la variable rs
            rs.first();
            if (rs != null) {
                if (numcu.equals(rs.getString("Numero"))) {
                    txt1.setText(cocl.DisFecha(rs.getString("FechaAp")));
                    txt2.setText(rs.getString("Saldo"));
                    txt3.setText(rs.getString("MontoAp"));
                    txt4.setText(rs.getString("Estado"));
                    
                    if (rs.getString("TCuenta").equals("Corriente"))
                        rb1.setSelected(true);
                    if (rs.getString("TCuenta").equals("Ahorro"))
                        rb2.setSelected(true);
                    if (rs.getString("TMoneda").equals("Colones")) {
                        rb3.setSelected(true);
                        lb1.setText("¢");
                    }
                    if (rs.getString("TMoneda").equals("Dólares")) {
                        rb4.setSelected(true);
                        lb1.setText("$");
                    }
                }
            }
        } catch(Exception ex) {
            System.out.println(ex);
        } finally {
            try {
                cn.desconectarbase();
            } catch(Exception e){System.out.println(e);}
        }
    }
    
    public int BuscarCuenta(String num) {
        int enco = 0;
        try {
            cn.conectarbase();
            String query = "select * from cuentas where Numero = '"+num+"'";
            ResultSet rs = cn.stmt.executeQuery(query);
            //Aqui ejecuta la instruccion en SQL que está almacenada 
            //en query y los resultados los deja en la variable rs
            rs.first(); //Ubica el primer registro del rs
            if (rs != null) {
                //Compara lo que hay en el rs en el campo ID con Ide
                if (num.equals(rs.getString("Numero")))
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
    
    public boolean AlternarCuenta(String estado, String num) {
        try {
            cn.conectarbase();
            String query = "update cuentas set Estado = '"+estado+"' where Numero = '"+num+"'";
            cn.stmt.execute(query);
            //Aqui ejecuta la instruccion en SQL que está almacenada 
            //en query y los resultados los deja en la variable rs
        }
        catch(Exception ex) {
            System.out.println(ex);
        } finally {
            try {
                cn.desconectarbase();
            }
            catch(Exception ex){};
        }
        return true;
    }
    
    public int GetSaldoCuenta(String numcu) {
        int saldo = 0;
        try {
            cn.conectarbase();
            String query = "select * from cuentas where Numero = '"+numcu+"'";
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
        } finally {
            try {
                cn.desconectarbase();
            }
            catch(Exception ex){};
        }
        return saldo;
    }
    
    public String GetEstado(String numcu) {
        String estado = "";
        try {
            cn.conectarbase();
            String query = "select * from cuentas where Numero = '"+numcu+"'";
            ResultSet rs = cn.stmt.executeQuery(query);
            //Aqui ejecuta la instruccion en SQL que está almacenada 
            //en query y los resultados los deja en la variable rs
            rs.first(); //Ubica el primer registro del rs
            if (rs != null) {
                //Compara lo que hay en el rs en el campo ID con Ide
                estado = rs.getString("Estado");
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
        return estado;
    }
    
    public boolean TransaccionCuenta(String numcu, String monto, String tipomov) {
        int nsaldo=0;
        
        if (tipomov.equals("Depósito")) {
            System.out.println("Nuevo saldo será "+ (GetSaldoCuenta(numcu) + Integer.valueOf(monto)));
            nsaldo = GetSaldoCuenta(numcu) + Integer.valueOf(monto);
        }
        else if (tipomov.equals("Retiro")) {
            System.out.println("Nuevo saldo será "+ (GetSaldoCuenta(numcu) - Integer.valueOf(monto)));
            nsaldo = GetSaldoCuenta(numcu) - Integer.valueOf(monto);
        }
        
        try {
            cn.conectarbase();
            String query = "update cuentas set Saldo = '"+nsaldo+"' where Numero = '"+numcu+"'";
            cn.stmt.execute(query);
            //Aqui ejecuta la instruccion en SQL que está almacenada 
            //en query y los resultados los deja en la variable rs
        }
        catch(Exception ex) {
            System.out.println(ex);
        } finally {
            try {
                cn.desconectarbase();
            }
            catch(Exception ex){};
        }
        return true;
    }
    
    public boolean EliminarCuenta(String numcu) {
        try {
            cn.conectarbase();
            String query = "delete from Cuentas where Numero = '"+numcu+"'";
            cn.stmt.execute(query);
            //Aqui ejecuta la instruccion en SQL que está almacenada 
            //en query y los resultados los deja en la variable rs
        }
        catch(Exception ex) {
            System.out.println(ex);
        } finally {
            try {
                cn.desconectarbase();
            }
            catch(Exception ex){};
        }
        return true;
    }
}