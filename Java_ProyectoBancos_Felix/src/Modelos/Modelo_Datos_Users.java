package Modelos;

import Utilitario_Validaciones.Conexion_DB;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import Modelos.Modelo_Datos_Niv;

public class Modelo_Datos_Users {
    
    public String pUser, pNivel;
    
    Conexion_DB cn = new Conexion_DB();
    Modelo_Datos_Niv mdn = new Modelo_Datos_Niv();
    
    public int buscarusername(String username) {
        int enco = 0;
        try {
            cn.conectarbase();
            String query = "select * from users where Username = '"+username+"'";
            ResultSet rs = cn.stmt.executeQuery(query);
            //Aqui ejecuta la instruccion en SQL que está almacenada 
            //en query y los resultados los deja en la variable rs
            rs.first(); //Ubica el primer registro del rs
            if (rs != null) {
                //Compara lo que hay en el rs en el campo ID con Ide
                if (username.equals(rs.getString("Username")))
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
    
    public boolean RegistrarUser(String User, String Pass, String Name, String Niv, String ID) {
        try {
            cn.conectarbase();
            String query = "insert into users (Username, Password, CodeNiv, ID, Estado, Fullname) VALUES "
            + "('"+User+"','"+Pass+"','"+Niv+"','"+ID+"','Activo','"+Name+"')";
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
    
    //Procedimiento para buscar un usuario y de paso ver si la contraseña que se ingresó no es la del usuario, o sea que está incorrecta
    public int BuscarUser(String user, String pass) {
        int enco = 0;
        try {
            cn.conectarbase();
            String query = "Select * From users where Username = '"+user+"'";
            ResultSet rs = cn.stmt.executeQuery(query);
            //Aqui ejecuta la instruccion en SQL que está almacenada en query y los resultados los deja en la variable rs
            rs.first();
            if (rs != null) {
                if (user.equals(rs.getString("Username")) && pass.equals(rs.getString("Password"))) {
                    enco=1;
                    
                    pUser = rs.getString("Username");
                    pNivel = rs.getString("CodeNiv");
                }
                else {
                    enco=2;
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            cn.desconectarbase();
        }
        return enco;
    }
    
    public String GetUserName(String user) {
        String usern = "";
        try {
            cn.conectarbase();
            String query = "Select * From users where Username = '"+user+"'";
            ResultSet rs = cn.stmt.executeQuery(query);
            //Aqui ejecuta la instruccion en SQL que está almacenada en query y los resultados los deja en la variable rs
            rs.first();
            if (rs != null) {
                if (user.equals(rs.getString("Username")))
                    usern = rs.getString("Fullname");
            }
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            cn.desconectarbase();
        }
        return usern;
    }
    
    public String GetUserNiv(String username) {
        String userL = "";
        try {
            cn.conectarbase();
            String query = "Select * From users where Username = '"+username+"'";
            ResultSet rs = cn.stmt.executeQuery(query);
            //Aqui ejecuta la instruccion en SQL que está almacenada en query y los resultados los deja en la variable rs
            rs.first();
            if (rs != null) {
                if (username.equals(rs.getString("Username")))
                    userL = rs.getString("CodeNiv");
            }
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            cn.desconectarbase();
        }
        return userL;
    }
    
    public String GetUserPass(String username) {
        String Pass = "";
        try {
            cn.conectarbase();
            String query = "Select * From users where Username = '"+username+"'";
            ResultSet rs = cn.stmt.executeQuery(query);
            //Aqui ejecuta la instruccion en SQL que está almacenada en query y los resultados los deja en la variable rs
            rs.first();
            if (rs != null) {
                if (username.equals(rs.getString("Username")))
                    Pass = rs.getString("Password");
            }
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            cn.desconectarbase();
        }
        return Pass;
    }
    
    public void CargarCbUsers(JComboBox combo) {
        try {
            cn.conectarbase();
            String query = "select * from users";
            ResultSet rs = cn.stmt.executeQuery(query);
            rs.first();
            if (rs != null) {
                //Ciclo para recorrer el rs y cargar los datos en el combo
                do {
                    //Agrega el campo ID y Name de cada registro del rs en el campo
                    combo.addItem(rs.getString("Username"));
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
    
    public void MostrarDatos(String user, JPasswordField txt1, JTextField txt2, JTextField txt3, JTextField txt4, JTextField txt5) {
        try {
            cn.conectarbase();
            String query = "select * from users where Username = '"+user+"'";
            ResultSet rs = cn.stmt.executeQuery(query);
            //Aqui ejecuta la instruccion que esta en query y los resultados quedan en la variable rs
            rs.first();
            if (rs != null) {
                if (user.equals(rs.getString("Username"))) {
                    txt1.setText(rs.getString("Password"));
                    txt2.setText(rs.getString("Fullname"));
                    txt3.setText(mdn.GetNivName(rs.getString("CodeNiv")));
                    txt4.setText(rs.getString("ID"));
                    txt5.setText(rs.getString("Estado"));
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
    
    public void MostrarDatosMod(String user, JPasswordField txt1, JTextField txt2, JTextField txt3, JTextField txt4, JTextField txt5) {
        try {
            cn.conectarbase();
            String query = "select * from users where Username = '"+user+"'";
            ResultSet rs = cn.stmt.executeQuery(query);
            //Aqui ejecuta la instruccion que esta en query y los resultados quedan en la variable rs
            rs.first();
            if (rs != null) {
                if (user.equals(rs.getString("Username"))) {
                    txt1.setText(rs.getString("Password"));
                    txt2.setText(rs.getString("Fullname"));
                    txt3.setText(mdn.GetNivName(rs.getString("CodeNiv")));
                    txt4.setText(rs.getString("ID"));
                    txt5.setText(rs.getString("Estado"));
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
    
    public boolean ModificarUser(String User, String Pass, String Name, String ID) {
        try {
            cn.conectarbase();
            String query = "UPDATE users SET Password = '" + Pass + "', ID = '" + ID + "', Fullname = '" + Name + "' WHERE Username = '" + User + "'";
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
    
    public boolean AlternarUsuario(String User, String Estado) {
        try {
            cn.conectarbase();
            String query = "UPDATE users SET Estado = '" + Estado + "' WHERE Username = '" + User + "'";
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
    
    public String GetEstado(String User) {
        String estado="";
        try {
            cn.conectarbase();
            String query = "select * from users where Username = '"+User+"'";
            ResultSet rs = cn.stmt.executeQuery(query);
            //Aqui ejecuta la sentencia en SQL que está en query
            rs.first();
            if (rs != null)
                estado = rs.getString("Estado");
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
        return estado;
    }
}
