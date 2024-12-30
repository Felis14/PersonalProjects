package Vista_Principal;

//Importes de clases y utilidades
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;
import Modelos.Modelo_Bitacoras;
import Control_Objetos.Control_Objetos_Clientes;
import Utilitario_Validaciones.Fecha_Sistema;
import Control_Objetos.Control_Objetos_Users;
import Modelos.Modelo_Datos_Users;
import Utilitario_Validaciones.Validaciones;

public class Iniciar_Sesion extends javax.swing.JFrame {

    //Instacias de clases
    Modelo_Datos_Users mdu = new Modelo_Datos_Users();
    Control_Objetos_Users cou = new Control_Objetos_Users();
    Validaciones V = new Validaciones();
    Modelo_Bitacoras mb = new Modelo_Bitacoras();
    Control_Objetos_Clientes cocl = new Control_Objetos_Clientes();
    Fecha_Sistema fs = new Fecha_Sistema();
    
    //Almacenan el nombre de usuario, nivel, contraseña y nombre completo
    static public String pUser, pNivel, pPass, pName;
    
    public Iniciar_Sesion() {
        initComponents();
        //Reinicia los campos de error para que no muestren nada
        UsernameError.setText("");
        UsernameError.setToolTipText(null);
        PasswordError.setText("");
        PasswordError.setToolTipText(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        UsernameError = new javax.swing.JLabel();
        PasswordError = new javax.swing.JLabel();
        ButtonMostrar = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tienes un ojo observándote, disfruta tu estadía.");
        setResizable(false);
        setSize(new java.awt.Dimension(481, 345));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Green_Check.png"))); // NOI18N
        jButton1.setText("Aceptar");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 100, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 92, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Login Usuario:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, 30));

        jTextField1.setBackground(new java.awt.Color(0, 51, 51));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        jTextField1.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 155, 30));

        jPasswordField1.setBackground(new java.awt.Color(0, 51, 51));
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField1.setToolTipText("");
        jPasswordField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        jPasswordField1.setCaretColor(new java.awt.Color(255, 255, 255));
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyTyped(evt);
            }
        });
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 155, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Iniciando Sesión Usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 51, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Red_X.png"))); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 100, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 153, 153));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 480, 10));

        UsernameError.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        UsernameError.setForeground(new java.awt.Color(255, 0, 0));
        UsernameError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UsernameError.setToolTipText("El nombre de usuario ya está en uso.");
        jPanel1.add(UsernameError, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 30, 30));

        PasswordError.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        PasswordError.setForeground(new java.awt.Color(255, 0, 0));
        PasswordError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PasswordError.setToolTipText("El nombre de usuario ya está en uso.");
        jPanel1.add(PasswordError, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 30, 30));

        ButtonMostrar.setBackground(new java.awt.Color(0, 51, 51));
        ButtonMostrar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/OjoBlanco.png"))); // NOI18N
        ButtonMostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonMostrar.setFocusPainted(false);
        ButtonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 30, 30));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/IniciarSesion.png"))); // NOI18N
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel5.setMaximumSize(new java.awt.Dimension(480, 345));
        jLabel5.setMinimumSize(new java.awt.Dimension(480, 345));
        jLabel5.setPreferredSize(new java.awt.Dimension(480, 345));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 345));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Boton ingresar
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Verifica si todos los datos están completos
        if (jTextField1.getText().isBlank() || jPasswordField1.getText().isBlank()) {
            System.out.println("Campos vacios");
            JOptionPane.showMessageDialog(null,"Faltan datos por completar",
            "Advertencia", JOptionPane.ERROR_MESSAGE);
            jTextField1.requestFocus();
        } else if (mdu.BuscarUser(jTextField1.getText(), jPasswordField1.getText()) == 1) {
            System.out.println("Usuario encontrado");
            if (mdu.GetEstado(jTextField1.getText()).equals("Activo")) {
                JOptionPane.showMessageDialog(null,"Usuario encontrado",
                "Bienvenid@ al programa", JOptionPane.INFORMATION_MESSAGE);
                //Asigna los valores utiles del usuario a las variables
                pName = mdu.GetUserName(jTextField1.getText());
                pNivel = mdu.GetUserNiv(jTextField1.getText());
                pPass = mdu.GetUserPass(jTextField1.getText());
                pUser = jTextField1.getText();
                
                //Ingresa una bitácora
                mb.IngresarBitacora(cocl.DBFecha(fs.fecha()), Vista_Principal.Iniciar_Sesion.pUser, "El usuario "+pUser+" inició sesión.");

                //Muestra la ventana de MenuPrincipal
                MenuPrincipal nw = new MenuPrincipal();
                nw.show(); this.hide(); this.dispose();
            //Si no está activa
            } else {
                System.out.println("No está activo");
                JOptionPane.showMessageDialog(null, "No se puede iniciar sesión.\nEl usuario está inactivo.", "Error", JOptionPane.WARNING_MESSAGE);
            }
            //Si BuscarUser es 2 es porque el usuario está bien pero la contraseña no
        } else if (mdu.BuscarUser(jTextField1.getText(), jPasswordField1.getText()) == 0) {
            System.out.println("No encuentra al usuario");
            JOptionPane.showMessageDialog(null, "El usuario no existe.", "Error", JOptionPane.WARNING_MESSAGE);
            //No encuentra al usuario, se reinicia todo
            jTextField1.requestFocus();
            UsernameError.setText("");
            UsernameError.setToolTipText(null);
        //Si encuentra el usuario y está activo y la contraseña está mala
        } else if (mdu.BuscarUser(jTextField1.getText(), jPasswordField1.getText()) == 2 && mdu.GetEstado(jTextField1.getText()).equals("Activo")) {
            System.out.println("Está activo, pero la contra está mala");
            JOptionPane.showMessageDialog(null, "La contraseña es incorrecta.", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            System.out.println("No pasa nada");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    //Cancelar programa
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(null, "Programa cancelado.", "Uuugh", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
        this.hide();this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ButtonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMostrarActionPerformed
        //Si el boton esta seleccionado
        if (ButtonMostrar.isSelected() == true) {
            //setEchoChar((char)0) hace que el texto oculto en el password field se muestre
            jPasswordField1.setEchoChar((char)0);
            //Cambia el icono del boton
            ButtonMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/OjoCerradoBlanco.png")));
            //Llama a que verifique las contraseña
            verificacionesPassword();
            jPasswordField1.requestFocus();
        }
        //Si no el boton no esta seleccionado
        else {
            //Pone el caracter oculto como •
            jPasswordField1.setEchoChar('•');
            //Cambia el icono del boton
            ButtonMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/OjoBlanco.png")));
            //Llama a que vuelva a verificar la contraseña
            verificacionesPassword();
            jPasswordField1.requestFocus();
        }
    }//GEN-LAST:event_ButtonMostrarActionPerformed

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained
        //Se borra el icono de los errores
        PasswordError.setIcon(null);
        PasswordError.setToolTipText(null);
    }//GEN-LAST:event_jPasswordField1FocusGained

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusLost
        //Cuando ya se está digitando más vuelve a verificar la contraseña
        verificacionesPassword();
    }//GEN-LAST:event_jPasswordField1FocusLost

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        UsernameError.setIcon(null);
        UsernameError.setToolTipText(null);
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        //Verifica si el nombre de usuario está dentro de todos estos controles
        //Si está en blancos (vacio)
        if (jTextField1.getText().isBlank() == true) {
            UsernameError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Red_X.png")));
            UsernameError.setToolTipText("El campo no puede estar vacío.");
        //Si es menor que 3
        } else if (jTextField1.getText().length() < 3) {
            UsernameError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Red_X.png")));
            UsernameError.setToolTipText("El nombre de usuario tiene que tener mínimo 3 caracteres.");
        //Si es mayor que 16
        } else if (jTextField1.getText().length() > 16) {
            UsernameError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Red_X.png")));
            UsernameError.setToolTipText("El nombre de usuario no puede pasarse de los 16 caracteres.");
        //Si sí existe dentro de los datos
        } else if (mdu.buscarusername(jTextField1.getText()) == 1) {
            UsernameError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Green_Check.png")));
            UsernameError.setToolTipText("El usuario fue encontrado.");
        //Si no existe
        } else if (mdu.buscarusername(jTextField1.getText()) == 0) {
            UsernameError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Red_X.png")));
            UsernameError.setToolTipText("El usuario no existe.");
        }
    }//GEN-LAST:event_jTextField1FocusLost

    //Evita poner espacios en el campo de username
    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        char k = evt.getKeyChar();
        if (k == KeyEvent.VK_ENTER) {
            jPasswordField1.requestFocus();
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    //Evita poner espacios en el campo de contraseña
    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        char k = evt.getKeyChar();
        if (k == KeyEvent.VK_ENTER) {
            jButton1.doClick();
        }
    }//GEN-LAST:event_jPasswordField1KeyPressed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        V.noEspacios(evt);
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jPasswordField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyTyped
        V.noEspacios(evt);
    }//GEN-LAST:event_jPasswordField1KeyTyped

    //Verifica si las contraseñas son seguras o no
    public void verificacionesPassword() {
        if (jPasswordField1.getText().isBlank() == true) {
            PasswordError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Red_X.png")));
            PasswordError.setToolTipText("El campo no puede estar vacío.");
        }
        else if (jPasswordField1.getText().equals("root")) {
            PasswordError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Cian_Check2.png")));
            PasswordError.setToolTipText("El Universo se detiene ante esta Verdad.");
        }
        else if (jPasswordField1.getText().length() < 6) {
            PasswordError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Red_X.png")));
            PasswordError.setToolTipText("La contraseña tiene que tener mínimo 6 caracteres.");
        }
        else if (jPasswordField1.getText().length() > 16) {
            PasswordError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Red_X.png")));
            PasswordError.setToolTipText("La contraseña no puede excederse de los 16 caracteres.");
        }
        else if (cou.ContraseñasMalas(jPasswordField1.getText()) == 1) {
            PasswordError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Red_Idiot.png")));
            PasswordError.setToolTipText("No.");
        }
        else {
            PasswordError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Green_Check.png")));
            PasswordError.setToolTipText("La contraseña puede usarse.");
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Iniciar_Sesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton ButtonMostrar;
    private javax.swing.JLabel PasswordError;
    private javax.swing.JLabel UsernameError;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
