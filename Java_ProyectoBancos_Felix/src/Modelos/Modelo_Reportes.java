package Modelos;

import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Utilitario_Validaciones.Conexion_DB;
import Control_Objetos.Control_Objetos_Clientes;
import Modelos.Modelo_Datos_Niv;

public class Modelo_Reportes {
    
    Conexion_DB cn = new Conexion_DB();
    Control_Objetos_Clientes cocl = new Control_Objetos_Clientes();
    Modelo_Datos_Niv mdn = new Modelo_Datos_Niv();
    
    //Este procedimiento permite agregar nuevas filas a una tabla de tipo jTable
    public void AgregarNuevaFilaCuentas(JTable Table1) {
        //Define la variable temp de tipo DefaultTableModel y obtiene el modelo de la tabla por defecto
        DefaultTableModel temp = (DefaultTableModel) Table1.getModel();
        
        //Define nuevo como un objeto de cinco columnas y si fuesen mas columnas, estonces se especifican las comillas dependiendo de la cantidad de columnas
        Object nuevo[] = {"","","","","","","",""};
        
        //Agrega una nueva fila a temp del tipo de objeto nuevo, donde nuevo tiene 5 columnas especificadas
        temp.addRow(nuevo);
    }
    
    //Aqui inician los procesos para realizar los reportes
    public void CargarTablaCuentas(JTable Table1, String query) {
        //Esta variable linea sirve para ir controlando las lineas que se van reportando en la tabla
        int linea = 0;
        
        try {
            cn.conectarbase();
            ResultSet rs = cn.stmt.executeQuery(query);
            //Aqui ejecuta la instruccion de SQL que está en query y los resultados los guarda en la variable rs que es de tipo ResultSet
            rs.first();
            //Este ciclo permite cargar todos los registros del rs en el jTable
            do {
                Table1.setValueAt(rs.getString("Numero"), linea, 0);
                Table1.setValueAt(cocl.DisFecha(rs.getString("FechaAp")), linea, 1);
                Table1.setValueAt(rs.getString("TCuenta"), linea, 2);
                Table1.setValueAt(rs.getString("TMoneda"), linea, 3);
                Table1.setValueAt(rs.getString("Saldo"), linea, 4);
                Table1.setValueAt(rs.getString("ID"), linea, 5);
                Table1.setValueAt(rs.getString("MontoAp"), linea, 6);
                Table1.setValueAt(rs.getString("Estado"), linea, 7);
                linea++; //Aqui incrementa la variable linea para que cuando va a cargar un nuevo registro, se carge en la siguiente linea de la tabla
                if (linea >= 4) {
                    //Este procedimiento permite agregar nuevas filas o lineas a la tabla Table1
                    AgregarNuevaFilaCuentas(Table1);
                }
                rs.next(); //Accesa o mueve el puntero al siguiente registro del rs
            } while (rs != null);
        } catch(Exception ex) {
            
        } finally {
            cn.desconectarbase();
        }
    }
    
    public void AgregarNuevaFilaClientes(JTable Table1) {
        DefaultTableModel temp = (DefaultTableModel) Table1.getModel();
        
        Object nuevo[] = {"","","","","",""};
        
        temp.addRow(nuevo);
    }
    
    public void CargarTablaClientes(JTable Table1, String query) {
        int linea = 0;
        
        try {
            cn.conectarbase();
            ResultSet rs = cn.stmt.executeQuery(query);
            rs.first();
            do {
                Table1.setValueAt(rs.getString("ID"), linea, 0);
                Table1.setValueAt(rs.getString("Name"), linea, 1);
                Table1.setValueAt(rs.getString("Tel"), linea, 2);
                Table1.setValueAt(rs.getString("Dir"), linea, 3);
                Table1.setValueAt(rs.getString("Email"), linea, 4);
                Table1.setValueAt(cocl.DisFecha(rs.getString("FechaReg")), linea, 5);
                linea++;
                if (linea >= 4) {
                    AgregarNuevaFilaClientes(Table1);
                }
                rs.next();
            } while (rs != null);
        } catch(Exception ex) {
            
        } finally {
            cn.desconectarbase();
        }
    }
    
    public void AgregarNuevaFilaMoves(JTable Table1) {
        DefaultTableModel temp = (DefaultTableModel) Table1.getModel();
        
        Object nuevo[] = {"","","","","","","","",""};
        
        temp.addRow(nuevo);
    }
    
    public void CargarTablaMoves(JTable Table1, String query) {
        int linea = 0;
        
        try {
            cn.conectarbase();
            ResultSet rs = cn.stmt.executeQuery(query);
            rs.first();
            do {
                Table1.setValueAt(rs.getString("NumeroMov"), linea, 0);
                Table1.setValueAt(GetID(rs.getString("NumeroC")), linea, 1);
                Table1.setValueAt(rs.getString("NumeroC"), linea, 2);
                Table1.setValueAt(cocl.DisFecha(rs.getString("FechaMov")), linea, 3);
                Table1.setValueAt(rs.getString("TipoMov"), linea, 4);
                Table1.setValueAt(rs.getString("MontoMov"), linea, 5);
                Table1.setValueAt(GetMon(rs.getString("NumeroC")), linea, 6);
                Table1.setValueAt(rs.getString("NombreResp"), linea, 7);
                Table1.setValueAt(rs.getString("Detalle"), linea, 8);
                linea++;
                if (linea >= 4) {
                    AgregarNuevaFilaMoves(Table1);
                }
                rs.next();
            } while (rs != null);
        } catch(Exception ex) {
            
        } finally {
            cn.desconectarbase();
        }
    }
    
    public void AgregarNuevaFilaUsers(JTable Table1) {
        DefaultTableModel temp = (DefaultTableModel) Table1.getModel();
        
        Object nuevo[] = {"","","","",""};
        
        temp.addRow(nuevo);
    }
    
    public void CargarTablaUsers(JTable Table1, String query) {
        int linea = 0;
        
        try {
            cn.conectarbase();
            ResultSet rs = cn.stmt.executeQuery(query);
            rs.first();
            do {
                Table1.setValueAt(rs.getString("Username"), linea, 0);
                Table1.setValueAt(rs.getString("Fullname"), linea, 1);
                Table1.setValueAt(rs.getString("ID"), linea, 2);
                Table1.setValueAt(mdn.GetNivName(rs.getString("CodeNiv")), linea, 3);
                Table1.setValueAt(rs.getString("Estado"), linea, 4);
                linea++;
                if (linea >= 4) {
                    AgregarNuevaFilaUsers(Table1);
                }
                rs.next();
            } while (rs != null);
        } catch(Exception ex) {
            
        } finally {
            cn.desconectarbase();
        }
    }
    
    public void AgregarNuevaFilaBit(JTable Table1) {
        DefaultTableModel temp = (DefaultTableModel) Table1.getModel();
        
        Object nuevo[] = {"","","",""};
        
        temp.addRow(nuevo);
    }
    
    public void CargarTablaBit(JTable Table1, String query) {
        int linea = 0;
        
        try {
            cn.conectarbase();
            ResultSet rs = cn.stmt.executeQuery(query);
            rs.first();
            do {
                Table1.setValueAt(rs.getString("NumMov"), linea, 0);
                Table1.setValueAt(cocl.DisFecha(rs.getString("FechaMov")), linea, 1);
                Table1.setValueAt(rs.getString("Username"), linea, 2);
                Table1.setValueAt(rs.getString("Cambio"), linea, 3);
                linea++;
                if (linea >= 4) {
                    AgregarNuevaFilaBit(Table1);
                }
                rs.next();
            } while (rs != null);
        } catch(Exception ex) {
            
        } finally {
            cn.desconectarbase();
        }
    }
    
    public String GetID(String numcu) {
        String IDCliente = "";
        try {
            cn.conectarbase();
            ResultSet rs = cn.stmt.executeQuery("select * from cuentas where Numero = '"+numcu+"'");
            //Aqui ejecuta la instruccion de SQL que está en query y los resultados los guarda en la variable rs que es de tipo ResultSet
            rs.first();
            if (rs != null) {
                IDCliente = rs.getString("ID");
            }
        } catch(Exception ex) {} 
        finally {
            cn.desconectarbase();
        }
        return IDCliente;
    }
    
    public String GetMon(String numcu) {
        String Mon = "";
        try {
            cn.conectarbase();
            ResultSet rs = cn.stmt.executeQuery("select * from cuentas where Numero = '"+numcu+"'");
            //Aqui ejecuta la instruccion de SQL que está en query y los resultados los guarda en la variable rs que es de tipo ResultSet
            rs.first();
            if (rs != null) {
                Mon = rs.getString("TMoneda");
            }
        } catch(Exception ex) {} 
        finally {
            cn.desconectarbase();
        }
        return Mon;
    }
}
