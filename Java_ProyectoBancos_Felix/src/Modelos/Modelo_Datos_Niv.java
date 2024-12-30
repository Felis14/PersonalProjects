package Modelos;

import Utilitario_Validaciones.Conexion_DB;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JMenuItem;

public class Modelo_Datos_Niv {
    
    Conexion_DB cn = new Conexion_DB();
    
    public int SigNumDispo() {
        int n=0;
        try {
            cn.conectarbase();
            String query = "select * from Niveles order by CodeNiv asc";
            ResultSet rs = cn.stmt.executeQuery(query);
            //Aqui ejecuta la instruccion en SQL que está almacenada 
            //en query y los resultados los deja en la variable rs
            rs.first(); //Ubica el primer registro del rs
            do {
                //Asigna a la variable n el número en el query en el campo ID
                n = Integer.valueOf(rs.getString("CodeNiv"));
                rs.next();
                //Si n es menor al valor ID y es menor al valor ID-1 tambien,
                //rompe el ciclo (ya que queda un espacio libre entre un numero y otro
                if (n < rs.getInt("CodeNiv") && n < (rs.getInt("CodeNiv") - 1))
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
    
    public int BuscarNiv(String niv) {
        int enco = 0;
        try {
            cn.conectarbase();
            String query = "select * from Niveles where CodeNiv = '"+niv+"'";
            ResultSet rs = cn.stmt.executeQuery(query);
            //Aqui ejecuta la instruccion en SQL que está almacenada 
            //en query y los resultados los deja en la variable rs
            rs.first(); //Ubica el primer registro del rs
            if (rs != null) {
                //Compara lo que hay en el rs en el campo ID con Ide
                if (niv.equals(rs.getString("CodeNiv")))
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
    
    public boolean IngresarNiv(String niv, String nom) {
        try {
            cn.conectarbase();
            String query = "insert into Niveles (CodeNiv, NombreNiv) values ('"+niv+"','"+nom+"')";
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
    
    public void CargarCbNiveles(JComboBox combo) {
        try {
            cn.conectarbase();
            String query = "select * from niveles";
            ResultSet rs = cn.stmt.executeQuery(query);
            rs.first();
            if (rs != null) {
                //Ciclo para recorrer el rs y cargar los datos en el combo
                do {
                    //Agrega el campo Niv y Name de cada registro del rs en el campo
                    combo.addItem(rs.getString("CodeNiv")+" - "+rs.getString("NameNiv"));
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
    
    public void CargarCbNivelesNombres(JComboBox combo) {
        try {
            cn.conectarbase();
            String query = "select * from niveles";
            ResultSet rs = cn.stmt.executeQuery(query);
            rs.first();
            if (rs != null) {
                //Ciclo para recorrer el rs y cargar los datos en el combo
                do {
                    //Agrega el campo Niv y Name de cada registro del rs en el campo
                    combo.addItem(rs.getString("NameNiv"));
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
    
    public boolean IngresarPerm(String nivfun, String niv, String fun, String Estado) {
        try {
            cn.conectarbase();
            String query = "insert into funporniv (CodNivCodFun, CodNiv, CodFun, Estado) values ('"+nivfun+"','"+niv+"','"+fun+"','"+Estado+"')";
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
    
    public int BuscarPerm(String nivfun) {
        int enco = 0;
        try {
            cn.conectarbase();
            String query = "select * from funporniv where CodNivCodFun = '"+nivfun+"'";
            ResultSet rs = cn.stmt.executeQuery(query);
            //Aqui ejecuta la instruccion en SQL que está almacenada 
            //en query y los resultados los deja en la variable rs
            rs.first(); //Ubica el primer registro del rs
            if (rs != null) {
                //Compara lo que hay en el rs en el campo ID con Ide
                if (nivfun.equals(rs.getString("CodNivCodFun")))
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
    
    public String GetNivName(String CodNiv) {
        String name = "";
        try {
            cn.conectarbase();
            String query = "select * from Niveles where CodeNiv = '"+CodNiv+"'";
            ResultSet rs = cn.stmt.executeQuery(query);
            //Aqui ejecuta la instruccion en SQL que está almacenada 
            //en query y los resultados los deja en la variable rs
            rs.first(); //Ubica el primer registro del rs
            if (rs != null) {
                //Compara lo que hay en el rs en el campo ID con Ide
                name = rs.getString("NameNiv");
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
        return name;
    }
    
    public String GetNivCode(String NameNiv) {
        String code = "";
        try {
            cn.conectarbase();
            String query = "select * from Niveles where NameNiv = '"+NameNiv+"'";
            ResultSet rs = cn.stmt.executeQuery(query);
            //Aqui ejecuta la instruccion en SQL que está almacenada 
            //en query y los resultados los deja en la variable rs
            rs.first(); //Ubica el primer registro del rs
            if (rs != null) {
                //Compara lo que hay en el rs en el campo ID con Ide
                code = rs.getString("CodeNiv");
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
        return code;
    }
    
    //Procedimiento que permite bloquear las opciones del menú principal
    //de acuerdo con los niveles o permisos del usuario
    public void AplicarNivel(String login, String nivel, JMenuItem op1,JMenuItem op2, JMenuItem op3, JMenuItem op4,
    JMenuItem op5,JMenuItem op6, JMenuItem op7, JMenuItem op8, JMenuItem op9, JMenuItem op10, JMenuItem op11,
    JMenuItem op12, JMenuItem op13, JMenuItem op14, JMenuItem op15, JMenuItem op16, JMenuItem op17, JMenuItem op18,
    JMenuItem op19, JMenuItem op20, JMenuItem op21, JMenuItem op22) {
        try {
            ResultSet rs = null;
            //Se llama al procedimiento conectarbase de la variable cn
            cn.conectarbase();
            //Sentencia query para seleccionar el registro de la Base de Datos donde 
            //el numero de cuenta almacenado sea igual al parámetro recibido
            String query = "SELECT * FROM funporniv where CodNiv = '"+nivel+"'";
            //La instrucción en SQL indica que seleccione todos los datos
            //de la tabla CUENTAS donde el campo NUMEROCUENTA sea igual al num
            rs = cn.stmt.executeQuery(query);
            rs.first();
            if (rs!=null) {
                do  //Ciclo que recorre el rs
                {
                    //Comenzamos con la secuencia de If para activar o bloquear los JMenuItem
                    //para comparar que el codigonivel sea igual al codigo de nivel del parámetro
                    //y que la opción correspondiente sea cada una y si está DESACTIVA
                    //bloquea la opción en el menú
                    if (rs.getString("CodNiv").equals(nivel) && rs.getString("CodFun").equals("01") &&
                    rs.getString("Estado").equals("Denegado"))
                        op1.setEnabled(false);

                    if (rs.getString("CodNiv").equals(nivel) && rs.getString("CodFun").equals("02") &&
                    rs.getString("Estado").equals("Denegado"))
                        op2.setEnabled(true);
                                      
                    if (rs.getString("CodNiv").equals(nivel) && rs.getString("CodFun").equals("03") &&
                    rs.getString("Estado").equals("Denegado"))
                        op3.setEnabled(false);
                                          
                    if (rs.getString("CodNiv").equals(nivel) && rs.getString("CodFun").equals("04") &&
                    rs.getString("Estado").equals("Denegado"))
                        op4.setEnabled(false);
                                            
                    if (rs.getString("CodNiv").equals(nivel) && rs.getString("CodFun").equals("05") &&
                    rs.getString("Estado").equals("Denegado"))
                        op5.setEnabled(false);

                    if (rs.getString("CodNiv").equals(nivel) && rs.getString("CodFun").equals("06") &&
                    rs.getString("Estado").equals("Denegado"))
                        op6.setEnabled(false);
                    
                    if (rs.getString("CodNiv").equals(nivel) && rs.getString("CodFun").equals("07") &&
                    rs.getString("Estado").equals("Denegado"))
                        op7.setEnabled(false);
                    
                    if (rs.getString("CodNiv").equals(nivel) && rs.getString("CodFun").equals("08") &&
                    rs.getString("Estado").equals("Denegado"))
                        op8.setEnabled(false);
                    
                    if (rs.getString("CodNiv").equals(nivel) && rs.getString("CodFun").equals("09") &&
                    rs.getString("Estado").equals("Denegado"))
                        op9.setEnabled(false);
                    
                    if (rs.getString("CodNiv").equals(nivel) && rs.getString("CodFun").equals("10") &&
                    rs.getString("Estado").equals("Denegado"))
                        op10.setEnabled(false);
                    
                    if (rs.getString("CodNiv").equals(nivel) && rs.getString("CodFun").equals("11") &&
                    rs.getString("Estado").equals("Denegado"))
                        op11.setEnabled(false);
                    
                    if (rs.getString("CodNiv").equals(nivel) && rs.getString("CodFun").equals("12") &&
                    rs.getString("Estado").equals("Denegado"))
                        op12.setEnabled(false);
                    
                    if (rs.getString("CodNiv").equals(nivel) && rs.getString("CodFun").equals("13") &&
                    rs.getString("Estado").equals("Denegado"))
                        op13.setEnabled(false);
                    
                    if (rs.getString("CodNiv").equals(nivel) && rs.getString("CodFun").equals("14") &&
                    rs.getString("Estado").equals("Denegado"))
                        op14.setEnabled(false);
                    
                    if (rs.getString("CodNiv").equals(nivel) && rs.getString("CodFun").equals("15") &&
                    rs.getString("Estado").equals("Denegado"))
                        op15.setEnabled(false);
                    
                    if (rs.getString("CodNiv").equals(nivel) && rs.getString("CodFun").equals("16") &&
                    rs.getString("Estado").equals("Denegado"))
                        op16.setEnabled(false);
                    
                    if (rs.getString("CodNiv").equals(nivel) && rs.getString("CodFun").equals("17") &&
                    rs.getString("Estado").equals("Denegado"))
                        op17.setEnabled(false);
                    
                    if (rs.getString("CodNiv").equals(nivel) && rs.getString("CodFun").equals("18") &&
                    rs.getString("Estado").equals("Denegado"))
                        op18.setEnabled(false);
                    
                    if (rs.getString("CodNiv").equals(nivel) && rs.getString("CodFun").equals("19") &&
                    rs.getString("Estado").equals("Denegado"))
                        op19.setEnabled(false);
                    
                    if (rs.getString("CodNiv").equals(nivel) && rs.getString("CodFun").equals("20") &&
                    rs.getString("Estado").equals("Denegado"))
                        op20.setEnabled(false);
                    
                    if (rs.getString("CodNiv").equals(nivel) && rs.getString("CodFun").equals("21") &&
                    rs.getString("Estado").equals("Denegado"))
                        op21.setEnabled(false);
                    
                    if (rs.getString("CodNiv").equals(nivel) && rs.getString("CodFun").equals("22") &&
                    rs.getString("Estado").equals("Denegado"))
                        op22.setEnabled(false);
                    
                    rs.next(); //Mueve el puntero al siguiente registro del rs
                } while (rs!=null);                                                                   
            }           
        } catch(Exception e) {
            System.out.println(e);
        } finally {
            try {
                cn.desconectarbase();   //Se llama la procedimiento desconectarbase()
            } catch(Exception e) {   }
        }
    }
}
