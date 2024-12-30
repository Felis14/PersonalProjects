package Vista_Principal;

//Importes de clases y utilidades
import javax.swing.JOptionPane;
import Utilitario.Modelo_Datos;
import Utilitario.ControlObjetos;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Iniciar_Sesion extends javax.swing.JFrame {

    //Instacia de clases
    Modelo_Datos md = new Modelo_Datos();
    ControlObjetos co = new ControlObjetos();
    
    //Almacenan el nombre de usuario, nivel, contraseña y nombre completo
    public static String pUsername, pNivel, pPass, pUser;
    
    public Iniciar_Sesion() {
        initComponents();
        //Reinicia los campos de error para que no muestren nada
        UsernameError.setText("");
        UsernameError.setToolTipText(null);
        PasswordError.setText("");
        PasswordError.setToolTipText(null);
        //Asigna un icono a la ventana
        setIconImage(new ImageIcon(getClass().getResource("/IMAGENES/LOGOCOLEGIOACTUAL.png")).getImage());
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
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        UsernameError = new javax.swing.JLabel();
        PasswordError = new javax.swing.JLabel();
        ButtonMostrar = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(481, 345));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/CheckCian.png"))); // NOI18N
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
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 155, 30));

        jPasswordField1.setBackground(new java.awt.Color(0, 51, 51));
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
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
        });
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 155, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Iniciando Sesión Usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/LOGOCOLEGIOACTUAL.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 50, -1));

        jButton2.setBackground(new java.awt.Color(0, 51, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/EquisCian.png"))); // NOI18N
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
        UsernameError.setText("X");
        UsernameError.setToolTipText("El nombre de usuario ya está en uso.");
        jPanel1.add(UsernameError, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 30, 30));

        PasswordError.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        PasswordError.setForeground(new java.awt.Color(255, 0, 0));
        PasswordError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PasswordError.setText("X");
        PasswordError.setToolTipText("El nombre de usuario ya está en uso.");
        jPanel1.add(PasswordError, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 30, 30));

        ButtonMostrar.setBackground(new java.awt.Color(0, 51, 51));
        ButtonMostrar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/OjoBlanco.png"))); // NOI18N
        ButtonMostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonMostrar.setFocusPainted(false);
        ButtonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 30, 30));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos_VistaP/IniciarSesion.png"))); // NOI18N
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel5.setMaximumSize(new java.awt.Dimension(480, 345));
        jLabel5.setMinimumSize(new java.awt.Dimension(480, 345));
        jLabel5.setPreferredSize(new java.awt.Dimension(480, 345));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 345));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Pregunta si los campos textos están vacíos
        if (jTextField1.getText().equals("")||jPasswordField1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Faltan datos por completar",
                "Advertencia", JOptionPane.ERROR_MESSAGE);
            jTextField1.requestFocus();
        }
        else
        {
            /*Aquí llama a la función buscarusuario pasando como pa lo que tenga el
            campo texto y el campo passwordfield*/
            if(md.BuscarUsuario(jTextField1.getText(), jPasswordField1.getText())==1)
            {
                JOptionPane.showMessageDialog(null,"Usuario encontrado",
                    "Bienvenid@ al programa", JOptionPane.INFORMATION_MESSAGE);
                pUsername = md.GetUser(jTextField1.getText());
                pNivel = md.GetUserLvl(jTextField1.getText());
                pPass = md.GetPass(jTextField1.getText());
                pUser = jTextField1.getText();

                Menu_Principal nw = new Menu_Principal();
                nw.show();this.hide();this.dispose();
            }
            else if (md.BuscarUsuario(jTextField1.getText(), jPasswordField1.getText()) == 2) {
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta", "Error", JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Usuario no encontrado",
                    "Error de Usuario", JOptionPane.ERROR_MESSAGE);
                jTextField1.requestFocus();
                UsernameError.setText("");
                UsernameError.setToolTipText(null);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(null, "Programa cancelado...", "Información", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
        this.hide();this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ButtonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMostrarActionPerformed
        //Si el boton esta seleccionado
        if (ButtonMostrar.isSelected() == true) {
            //setEchoChar((char)0) hace que el texto oculto en el password field se muestre
            jPasswordField1.setEchoChar((char)0);
            //Cambia el icono del boton
            ButtonMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/OjoCerradoBlanco.png")));
            //Llama a que verifique las contraseña
            verificacionesPassword();
            jPasswordField1.requestFocus();
        }
        //Si no el boton no esta seleccionado
        else {
            //Pone el caracter oculto como •
            jPasswordField1.setEchoChar('•');
            //Cambia el icono del boton
            ButtonMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/OjoBlanco.png")));
            //Llama a que vuelva a verificar la contraseña
            verificacionesPassword();
            jPasswordField1.requestFocus();
        }
    }//GEN-LAST:event_ButtonMostrarActionPerformed

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained
        //Cuando se va a digitar en el campo de la contraseña, oculta el icono de error y el texto que muestra
        PasswordError.setText("");
        PasswordError.setToolTipText(null);
    }//GEN-LAST:event_jPasswordField1FocusGained

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusLost
        //Cuando ya se está digitando más vuelve a verificar la contraseña
        verificacionesPassword();
    }//GEN-LAST:event_jPasswordField1FocusLost

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        UsernameError.setText("");
        UsernameError.setToolTipText(null);
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        if (jTextField1.getText().equals("")) {
            UsernameError.setText("X");
            UsernameError.setForeground(new java.awt.Color(255, 0, 0));
            UsernameError.setToolTipText("El campo no puede estar vacío.");
        }
        else if (co.EspacioEnBlanco(jTextField1.getText()) == 1) {
            UsernameError.setText("X");
            UsernameError.setForeground(new java.awt.Color(255, 0, 0));
            UsernameError.setToolTipText("El nombre de usuario no puede contener espacios vacíos.");
        }
        else if (jTextField1.getText().length() < 3) {
            UsernameError.setText("X");
            UsernameError.setForeground(new java.awt.Color(255, 0, 0));
            UsernameError.setToolTipText("El nombre de usuario tiene que tener mínimo 3 caracteres.");
        }
        else if (jTextField1.getText().length() > 20) {
            UsernameError.setText("X");
            UsernameError.setForeground(new java.awt.Color(255, 0, 0));
            UsernameError.setToolTipText("El nombre de usuario no puede pasarse de los 20 caracteres.");
        }
        else if (md.buscarusername(jTextField1.getText()) == 1) {
            UsernameError.setText("♦");
            UsernameError.setForeground(new java.awt.Color(0, 255, 0));
            UsernameError.setToolTipText("El usuario fue encontrado.");
        }
        else if (md.buscarusername(jTextField1.getText()) == 0) {
            UsernameError.setText("X");
            UsernameError.setForeground(new java.awt.Color(255, 0, 0));
            UsernameError.setToolTipText("El usuario no está registrado.");
        }
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        char k = evt.getKeyChar();
        if (k == KeyEvent.VK_ENTER) {
            jPasswordField1.requestFocus();
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        char k = evt.getKeyChar();
        if (k == KeyEvent.VK_ENTER) {
            jButton1.doClick();
        }
    }//GEN-LAST:event_jPasswordField1KeyPressed

    public void verificacionesPassword() {
        if (jPasswordField1.getText().equals("")) {
            PasswordError.setText("X");
            PasswordError.setForeground(new java.awt.Color(255, 0, 0));
            PasswordError.setToolTipText("El campo no puede estar vacío.");
        }
        else if (co.EspacioEnBlanco(jPasswordField1.getText()) == 1) {
            PasswordError.setText("X");
            PasswordError.setForeground(new java.awt.Color(255, 0, 0));
            PasswordError.setToolTipText("La contraseña no puede contener espacios vacíos.");
        }
        else if (jPasswordField1.getText().equals("root")) {
            PasswordError.setText("");
            PasswordError.setForeground(new java.awt.Color(0, 255, 0));
            PasswordError.setToolTipText("");
        }
        else if (jPasswordField1.getText().length() < 6) {
            PasswordError.setText("X");
            PasswordError.setForeground(new java.awt.Color(255, 0, 0));
            PasswordError.setToolTipText("La contraseña tiene que tener mínimo 6 caracteres.");
        }
        else if (jPasswordField1.getText().length() > 16) {
            PasswordError.setText("X");
            PasswordError.setForeground(new java.awt.Color(255, 0, 0));
            PasswordError.setToolTipText("La contraseña no puede excederse de los 16 caracteres.");
        }
        else if (co.ContraseñasMalas(jPasswordField1.getText()) == 1) {
            PasswordError.setText("☺");
            PasswordError.setForeground(new java.awt.Color(255, 0, 0));
            PasswordError.setToolTipText("No.");
        }
        else {
            PasswordError.setText("");
            PasswordError.setForeground(new java.awt.Color(0, 255, 0));
            PasswordError.setToolTipText("");
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
