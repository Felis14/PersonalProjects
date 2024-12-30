package Utilitario;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Modelo_Datos {
    Conexion_DB cn = new Conexion_DB();
    
    public String pUsername, pNivel;
    
    //Funcion que busca una identificacion en la tabla para ver si ya existe
    public int buscaridentificacion(String Ide) {
        int enco = 0;
        try {
            cn.conectarbase();
            String query = "select * from tabla_contactos where ID = '"+Ide+"'";
            ResultSet rs = cn.stmt.executeQuery(query);
            //Aqui ejecuta la instruccion en SQL que está almacenada 
            //en query y los resultados los deja en la variable rs
            rs.first(); //Ubica el primer registro del rs
            if (rs != null) {
                //Compara lo que hay en el rs en el campo ID con Ide
                if (Ide.equals(rs.getString("ID")))
                    enco = 1;
            }
        }
        catch(Exception ex) {
            System.out.println(ex);
        }
        return enco;
    }
    
    public boolean AddContact(String ID, String Nom, String Dir, String RD, String BD,
    String Catego, String TelF, String TelM, String Corr) {
        try {
            cn.conectarbase();
            String query = "insert into tabla_contactos (ID, Name, Dir, Reg_Date, Birthday, Cat, Tel_Casa, Tel_Mov, Email) VALUES"
            + "('"+ID+"','"+Nom+"','"+Dir+"','"+RD+"','"+BD+"','"+Catego+"','"+TelF+"','"+TelM+"','"+Corr+"')";
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
    
    public void CargarCbContactos(JComboBox combo) {
        try {
            cn.conectarbase();
            String query = "select * from tabla_contactos";
            ResultSet rs = cn.stmt.executeQuery(query);
            rs.first();
            if (rs != null) {
                //Ciclo para recorrer el rs y cargar los datos en el combo
                do {
                    //Agrega el campo ID de cada registro del rs en el campo
                    combo.addItem(rs.getString("ID")+" - "+rs.getString("Name"));
                    rs.next();
                    //Acceso o lee el sgte registro del rs
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
    
    public void MostrarDatos(String Ide, JTextField nombre, JTextField dir, JTextField FechaReg,
    JTextField FechaCum, JTextField Cate, JTextField TelF, JTextField TelM, JTextField Mail) {
        try {
            cn.conectarbase();
            String query = "select * from tabla_contactos where ID = '"+Ide+"'";
            ResultSet rs = cn.stmt.executeQuery(query);
            //Aqui ejecuta la instruccion que esta en query y los resultados quedan en la variable rs
            rs.first();
            if (rs != null) {
                if (Ide.equals(rs.getString("ID"))) {
                    nombre.setText(rs.getString("Name"));
                    dir.setText(rs.getString("Dir"));
                    FechaReg.setText(rs.getString("Reg_Date"));
                    FechaCum.setText(rs.getString("Birthday"));
                    Cate.setText(rs.getString("Cat"));
                    TelF.setText(rs.getString("Tel_Casa"));
                    TelM.setText(rs.getString("Tel_Mov"));
                    Mail.setText(rs.getString("Email"));
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
    
    public boolean ModificarContacto(String ID, String Name, String Dir, String RegDate, String Birth, String Cat, String TelF, String TelM, String Email) {
        try {
            cn.conectarbase();
            String query = "UPDATE tabla_contactos SET Name = '"+Name+"', Dir = '"+Dir+"', Reg_Date = '"+RegDate+"', Birthday = '"+Birth+"', Cat = '"+Cat+"', Tel_Casa = '"+TelF+"', Tel_Mov = '"+TelM+"', Email = '"+Email+"' where ID = '"+ID+"'";
            //
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
    
    public boolean EliminarContacto(String ide) {
        boolean borrado = true;
        try {
            cn.conectarbase();
            String query = "Delete from tabla_contactos where ID = '"+ide+"'";
            cn.stmt.execute(query);
            /*query = "ALTER TABLE `base_contactos`.`tabla_contactos` MODIFY COLUMN `ID` INT(5) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT;";
            cn.stmt.execute(query); */
            
        }
        catch(Exception ex) {
            System.out.println(ex);
            borrado = false;
        }
        finally {
            cn.desconectarbase();
        }
        return borrado;
    }
    
    public int buscarusername(String username) {
        int enco = 0;
        try {
            cn.conectarbase();
            String query = "select * from tabla_usuarios where Username = '"+username+"'";
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
        }
        return enco;
    }
    
    public boolean AddUser(String Username, String Password, String Name, String ID,
    String Email, String UserLvl, String Reg_Date) {
        try {
            cn.conectarbase();
            String query = "insert into tabla_usuarios (ID, Name, Reg_Date, Email, User_Lvl, Username, Password) VALUES"
            + "('"+ID+"','"+Name+"','"+Reg_Date+"','"+Email+"','"+UserLvl+"','"+Username+"','"+Password+"')";
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
    
    public void MostrarDatosU(String username, JTextField password, JTextField name, JTextField id,
    JTextField email, JTextField userlvl, JTextField regdate) {
        try {
            cn.conectarbase();
            String query = "select * from tabla_usuarios where Username = '"+username+"'";
            ResultSet rs = cn.stmt.executeQuery(query);
            //Aqui ejecuta la instruccion que esta en query y los resultados quedan en la variable rs
            rs.first();
            if (rs != null) {
                if (username.equals(rs.getString("Username"))) {
                    password.setText(rs.getString("Password"));
                    name.setText(rs.getString("Name"));
                    id.setText(rs.getString("ID"));
                    email.setText(rs.getString("Email"));
                    userlvl.setText(rs.getString("User_Lvl"));
                    regdate.setText(rs.getString("Reg_Date"));
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
    
    public boolean EliminarUsuario(String user) {
        boolean borrado = true;
        try {
            cn.conectarbase();
            String query = "Delete from tabla_usuarios where Username = '"+user+"'";
            cn.stmt.execute(query);
        }
        catch(Exception ex) {
            System.out.println(ex);
            borrado = false;
        }
        finally {
            cn.desconectarbase();
        }
        return borrado;
    }
    
    public boolean ModificarUsuarios(String ID, String Name, String Regdate, String Email, String Userlv, String User, String Pass) {
        try {
            cn.conectarbase();
            String query = "UPDATE tabla_usuarios SET ID = '"+ID+"', Name = '"+Name+"', Reg_Date = '"+Regdate+"', Email = '"+Email+"', User_Lvl = '"+Userlv+"', Password = '"+Pass+"', Username = '"+User+"' where Username = '"+User+"'";
            //
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
    
    //Este procedimiento permite agregar nuevas filas a una tabla de tipo jTable
    public void AgregarNuevaFila(JTable Table1) {
        //Define la variable temp de tipo DefaultTableModel y obtiene el modelo de la tabla por defecto
        DefaultTableModel temp = (DefaultTableModel) Table1.getModel();
        
        //Define nuevo como un objeto de cinco columnas y si fuesen mas columnas, estonces se especifican las comillas dependiendo de la cantidad de columnas
        Object nuevo[] = {"","","","","","","","",""};
        
        //Agrega una nueva fila a temp del tipo de objeto nuevo, donde nuevo tiene 5 columnas especificadas
        temp.addRow(nuevo);
    }
    
    //Aqui inician los procesos para realizar los reportes
    public void CargarTablaClientes(JTable Table1) {
        //Esta variable linea sirve para ir controlando las lineas que se van reportando en la tabla
        int linea = 0;
        
        try {
            cn.conectarbase();
            String query = "select * from tabla_contactos";
            ResultSet rs = cn.stmt.executeQuery(query);
            //Aqui ejecuta la instruccion de SQL que está en query y los resultados los guarda en la variable rs que es de tipo ResultSet
            rs.first();
            //Este ciclo permite cargar todos los registros del rs en el jTable
            do {
                Table1.setValueAt(rs.getString("ID"), linea, 0);
                Table1.setValueAt(rs.getString("Name"), linea, 1);
                Table1.setValueAt(rs.getString("Dir"), linea, 2);
                Table1.setValueAt(rs.getString("Reg_Date"), linea, 3);
                Table1.setValueAt(rs.getString("Birthday"), linea, 4);
                Table1.setValueAt(rs.getString("Cat"), linea, 5);
                Table1.setValueAt(rs.getString("Tel_Casa"), linea, 6);
                Table1.setValueAt(rs.getString("Tel_Mov"), linea, 7);
                Table1.setValueAt(rs.getString("Email"), linea, 8);
                linea++; //Aqui incrementa la variable linea para que cuando va a cargar un nuevo registro, se carge en la siguiente linea de la tabla
                if (linea >= 4) {
                    //Este procedimiento permite agregar nuevas filas o lineas a la tabla Table1
                    AgregarNuevaFila(Table1);
                }
                rs.next(); //Accesa o mueve el puntero al siguiente registro del rs
            } while (rs != null);
        } catch(Exception ex) {
            
        } finally {
            cn.desconectarbase();
        }
    }
    
    public void CargarTablaClientesPorCategoria(JTable Table1, String cate) {
        int linea = 0;
        
        try {
            cn.conectarbase();
            String query = "select * from tabla_contactos where Cat = '"+cate+"'";
            ResultSet rs = cn.stmt.executeQuery(query);
            //Aqui ejecuta la instruccion de SQL que está en query y los resultados los guarda en la variable rs que es de tipo ResultSet
            rs.first();
            //Este ciclo permite cargar todos los registros del rs en el jTable
            do {
                Table1.setValueAt(rs.getString("ID"), linea, 0);
                Table1.setValueAt(rs.getString("Name"), linea, 1);
                Table1.setValueAt(rs.getString("Dir"), linea, 2);
                Table1.setValueAt(rs.getString("Reg_Date"), linea, 3);
                Table1.setValueAt(rs.getString("Birthday"), linea, 4);
                Table1.setValueAt(rs.getString("Cat"), linea, 5);
                Table1.setValueAt(rs.getString("Tel_Casa"), linea, 6);
                Table1.setValueAt(rs.getString("Tel_Mov"), linea, 7);
                Table1.setValueAt(rs.getString("Email"), linea, 8);
                linea++; //Aqui incrementa la variable linea para que cuando va a cargar un nuevo registro, se carge en la siguiente linea de la tabla
                if (linea >= 4) {
                    //Este procedimiento permite agregar nuevas filas o lineas a la tabla Table1
                    AgregarNuevaFila(Table1);
                }
                rs.next(); //Accesa o mueve el puntero al siguiente registro del rs
            } while (rs != null);
        } catch(Exception ex) {
            System.out.println(ex);
        } finally {
            cn.desconectarbase();
        }
    }
    
    public void CargarTablaClientesPorFechaRegistro(JTable Table1, String fecha1, String fecha2) {
        int linea = 0;
        
        try {
            cn.conectarbase();
            String query = "select * from tabla_contactos where Reg_Date between '"+fecha1+"' AND '"+fecha2+"'";
            ResultSet rs = cn.stmt.executeQuery(query);
            //Aqui ejecuta la instruccion de SQL que está en query y los resultados los guarda en la variable rs que es de tipo ResultSet
            rs.first();
            //Este ciclo permite cargar todos los registros del rs en el jTable
            do {
                Table1.setValueAt(rs.getString("ID"), linea, 0);
                Table1.setValueAt(rs.getString("Name"), linea, 1);
                Table1.setValueAt(rs.getString("Dir"), linea, 2);
                Table1.setValueAt(rs.getString("Reg_Date"), linea, 3);
                Table1.setValueAt(rs.getString("Birthday"), linea, 4);
                Table1.setValueAt(rs.getString("Cat"), linea, 5);
                Table1.setValueAt(rs.getString("Tel_Casa"), linea, 6);
                Table1.setValueAt(rs.getString("Tel_Mov"), linea, 7);
                Table1.setValueAt(rs.getString("Email"), linea, 8);
                linea++; //Aqui incrementa la variable linea para que cuando va a cargar un nuevo registro, se carge en la siguiente linea de la tabla
                if (linea >= 4) {
                    //Este procedimiento permite agregar nuevas filas o lineas a la tabla Table1
                    AgregarNuevaFila(Table1);
                }
                rs.next(); //Accesa o mueve el puntero al siguiente registro del rs
            } while (rs != null);
        } catch(Exception ex) {
            System.out.println(ex);
        } finally {
            cn.desconectarbase();
        }
    }
    
    public void CargarTablaClientesPorNombre(JTable Table1, String name) {
        int linea = 0;
        
        try {
            cn.conectarbase();
            String query = "select * from tabla_contactos where Name like '"+name+"%'";
            ResultSet rs = cn.stmt.executeQuery(query);
            //Aqui ejecuta la instruccion de SQL que está en query y los resultados los guarda en la variable rs que es de tipo ResultSet
            rs.first();
            //Este ciclo permite cargar todos los registros del rs en el jTable
            do {
                Table1.setValueAt(rs.getString("ID"), linea, 0);
                Table1.setValueAt(rs.getString("Name"), linea, 1);
                Table1.setValueAt(rs.getString("Dir"), linea, 2);
                Table1.setValueAt(rs.getString("Reg_Date"), linea, 3);
                Table1.setValueAt(rs.getString("Birthday"), linea, 4);
                Table1.setValueAt(rs.getString("Cat"), linea, 5);
                Table1.setValueAt(rs.getString("Tel_Casa"), linea, 6);
                Table1.setValueAt(rs.getString("Tel_Mov"), linea, 7);
                Table1.setValueAt(rs.getString("Email"), linea, 8);
                linea++; //Aqui incrementa la variable linea para que cuando va a cargar un nuevo registro, se carge en la siguiente linea de la tabla
                if (linea >= 4) {
                    //Este procedimiento permite agregar nuevas filas o lineas a la tabla Table1
                    AgregarNuevaFila(Table1);
                }
                rs.next(); //Accesa o mueve el puntero al siguiente registro del rs
            } while (rs != null);
        } catch(Exception ex) {
            System.out.println(ex);
        } finally {
            cn.desconectarbase();
        }
    }
    
    public void CargarTablaClientesPorFechaCumple(JTable Table1, String fecha1) {
        int linea = 0;
        
        try {
            cn.conectarbase();
            String query = "select * from tabla_contactos where Birthday like '"+fecha1+"%'";
            ResultSet rs = cn.stmt.executeQuery(query);
            //Aqui ejecuta la instruccion de SQL que está en query y los resultados los guarda en la variable rs que es de tipo ResultSet
            rs.first();
            //Este ciclo permite cargar todos los registros del rs en el jTable
            do {
                Table1.setValueAt(rs.getString("ID"), linea, 0);
                Table1.setValueAt(rs.getString("Name"), linea, 1);
                Table1.setValueAt(rs.getString("Dir"), linea, 2);
                Table1.setValueAt(rs.getString("Reg_Date"), linea, 3);
                Table1.setValueAt(rs.getString("Birthday"), linea, 4);
                Table1.setValueAt(rs.getString("Cat"), linea, 5);
                Table1.setValueAt(rs.getString("Tel_Casa"), linea, 6);
                Table1.setValueAt(rs.getString("Tel_Mov"), linea, 7);
                Table1.setValueAt(rs.getString("Email"), linea, 8);
                linea++; //Aqui incrementa la variable linea para que cuando va a cargar un nuevo registro, se carge en la siguiente linea de la tabla
                if (linea >= 4) {
                    //Este procedimiento permite agregar nuevas filas o lineas a la tabla Table1
                    AgregarNuevaFila(Table1);
                }
                rs.next(); //Accesa o mueve el puntero al siguiente registro del rs
            } while (rs != null);
        } catch(Exception ex) {
            System.out.println(ex);
        } finally {
            cn.desconectarbase();
        }
    }
    
    public void CargarTablaUsuarios(JTable Table1) {
        //Esta variable linea sirve para ir controlando las lineas que se van reportando en la tabla
        int linea = 0;
        
        try {
            cn.conectarbase();
            String query = "select * from tabla_usuarios";
            ResultSet rs = cn.stmt.executeQuery(query);
            //Aqui ejecuta la instruccion de SQL que está en query y los resultados los guarda en la variable rs que es de tipo ResultSet
            rs.first();
            //Este ciclo permite cargar todos los registros del rs en el jTable
            do {
                Table1.setValueAt(rs.getString("ID"), linea, 0);
                Table1.setValueAt(rs.getString("Name"), linea, 1);
                Table1.setValueAt(rs.getString("Reg_Date"), linea, 2);
                Table1.setValueAt(rs.getString("Email"), linea, 3);
                Table1.setValueAt(rs.getString("User_Lvl"), linea, 4);
                Table1.setValueAt(rs.getString("Username"), linea, 5);
                Table1.setValueAt("******", linea, 6);
                linea++; //Aqui incrementa la variable linea para que cuando va a cargar un nuevo registro, se carge en la siguiente linea de la tabla
                if (linea >= 4) {
                    //Este procedimiento permite agregar nuevas filas o lineas a la tabla Table1
                    AgregarNuevaFila(Table1);
                }
                rs.next(); //Accesa o mueve el puntero al siguiente registro del rs
            } while (rs != null);
        } catch(Exception ex) {
            
        } finally {
            cn.desconectarbase();
        }
    }
    
    public void CargarTablaUsuariosPorNivel(JTable Table1, String nivel) {
        //Esta variable linea sirve para ir controlando las lineas que se van reportando en la tabla
        int linea = 0;
        
        try {
            cn.conectarbase();
            String query = "select * from tabla_usuarios where User_Lvl = '"+nivel+"'";
            ResultSet rs = cn.stmt.executeQuery(query);
            //Aqui ejecuta la instruccion de SQL que está en query y los resultados los guarda en la variable rs que es de tipo ResultSet
            rs.first();
            //Este ciclo permite cargar todos los registros del rs en el jTable
            do {
                Table1.setValueAt(rs.getString("ID"), linea, 0);
                Table1.setValueAt(rs.getString("Name"), linea, 1);
                Table1.setValueAt(rs.getString("Reg_Date"), linea, 2);
                Table1.setValueAt(rs.getString("Email"), linea, 3);
                Table1.setValueAt(rs.getString("User_Lvl"), linea, 4);
                Table1.setValueAt(rs.getString("Username"), linea, 5);
                Table1.setValueAt("******", linea, 6);
                linea++; //Aqui incrementa la variable linea para que cuando va a cargar un nuevo registro, se carge en la siguiente linea de la tabla
                if (linea >= 4) {
                    //Este procedimiento permite agregar nuevas filas o lineas a la tabla Table1
                    AgregarNuevaFila(Table1);
                }
                rs.next(); //Accesa o mueve el puntero al siguiente registro del rs
            } while (rs != null);
        } catch(Exception ex) {
            
        } finally {
            cn.desconectarbase();
        }
    }
    
    public int BuscarUsuario(String username, String pass) {
        int enco = 0;
        try {
            cn.conectarbase();
            String query = "Select * From Tabla_Usuarios where Username = '"+username+"'";
            ResultSet rs = cn.stmt.executeQuery(query);
            //Aqui ejecuta la instruccion en SQL que está almacenada en query y los resultados los deja en la variable rs
            rs.first();
            if (rs != null) {
                if (username.equals(rs.getString("Username")) && pass.equals(rs.getString("Password"))) {
                    enco=1;
                    
                    pUsername = rs.getString("Username");
                    pNivel = rs.getString("User_Lvl");
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
    
    public String GetUser(String username) {
        String user = "";
        try {
            cn.conectarbase();
            String query = "Select * From Tabla_Usuarios where Username = '"+username+"'";
            ResultSet rs = cn.stmt.executeQuery(query);
            //Aqui ejecuta la instruccion en SQL que está almacenada en query y los resultados los deja en la variable rs
            rs.first();
            if (rs != null) {
                if (username.equals(rs.getString("Username")))
                    user = rs.getString("Name");
            }
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            cn.desconectarbase();
        }
        return user;
    }
    
    public String GetUsername(String username) {
        String user = "";
        try {
            cn.conectarbase();
            String query = "Select * From Tabla_Usuarios where Username = '"+username+"'";
            ResultSet rs = cn.stmt.executeQuery(query);
            //Aqui ejecuta la instruccion en SQL que está almacenada en query y los resultados los deja en la variable rs
            rs.first();
            if (rs != null) {
                if (username.equals(rs.getString("Username")))
                    user = rs.getString("Username");
            }
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            cn.desconectarbase();
        }
        return user;
    }
    
    public String GetUserLvl(String username) {
        String userL = "";
        try {
            cn.conectarbase();
            String query = "Select * From Tabla_Usuarios where Username = '"+username+"'";
            ResultSet rs = cn.stmt.executeQuery(query);
            //Aqui ejecuta la instruccion en SQL que está almacenada en query y los resultados los deja en la variable rs
            rs.first();
            if (rs != null) {
                if (username.equals(rs.getString("Username")))
                    userL = rs.getString("User_Lvl");
            }
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            cn.desconectarbase();
        }
        return userL;
    }
    
    public String GetPass(String username) {
        String Pass = "";
        try {
            cn.conectarbase();
            String query = "Select * From Tabla_Usuarios where Username = '"+username+"'";
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
    
    public boolean IngresarBitacora(String fecha, String user, String descripcion) {
        try {
            cn.conectarbase();
            String query = "Insert into tabla_bitacora (FechaMov, User, Descripcion) VALUES ('"+fecha+"','"+user+"','"+descripcion+"')";
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
    
    public void CargarTablaBitacora(JTable tabla) {
        int linea=0;
        
        try {
            cn.conectarbase();
            String query = "select * from tabla_bitacora order by NumMov";
            ResultSet rs = cn.stmt.executeQuery(query);
            rs.first();
            do {
                tabla.setValueAt(rs.getString("NumMov"), linea, 0);
                tabla.setValueAt(rs.getString("FechaMov"), linea, 1);
                tabla.setValueAt(rs.getString("User"), linea, 2);
                tabla.setValueAt(rs.getString("Descripcion"), linea, 3);
                linea++;
                
                if (linea >= 4)
                    AgregarNuevaFila(tabla);
                rs.next();
            } while (rs != null);
        } catch(Exception ex) {
            System.out.println(ex);
        } finally {
            cn.desconectarbase();
        }
    }
    
    public void CargarTablaBitacoraUsuario(JTable tabla, String user) {
        int linea=0;
        
        try {
            cn.conectarbase();
            String query = "select * from tabla_bitacora where User = '"+user+"'";
            ResultSet rs = cn.stmt.executeQuery(query);
            rs.first();
            do {
                tabla.setValueAt(rs.getString("NumMov"), linea, 0);
                tabla.setValueAt(rs.getString("FechaMov"), linea, 1);
                tabla.setValueAt(rs.getString("User"), linea, 2);
                tabla.setValueAt(rs.getString("Descripcion"), linea, 3);
                linea++;
                
                if (linea >= 4)
                    AgregarNuevaFila(tabla);
                rs.next();
            } while (rs != null);
        } catch(Exception ex) {
            System.out.println(ex);
        } finally {
            cn.desconectarbase();
        }
    }
    
    public void CargarTablaBitacoraFecha(JTable tabla, String fecha1, String fecha2) {
        int linea = 0;
        
        try {
            cn.conectarbase();
            String query = "select * from tabla_bitacora where FechaMov between '"+fecha1+"' AND '"+fecha2+"'";
            ResultSet rs = cn.stmt.executeQuery(query);
            rs.first();
            do {
                tabla.setValueAt(rs.getString("NumMov"), linea, 0);
                tabla.setValueAt(rs.getString("FechaMov"), linea, 1);
                tabla.setValueAt(rs.getString("User"), linea, 2);
                tabla.setValueAt(rs.getString("Descripcion"), linea, 3);
                linea++;
                
                if (linea >= 4)
                    AgregarNuevaFila(tabla);
                rs.next();
            } while (rs != null);
        } catch(Exception ex) {
            System.out.println(ex);
        } finally {
            cn.desconectarbase();
        }
    }
}
