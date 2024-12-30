package Forms_Usuarios;

import Utilitario.*;
import Vista_Principal.Iniciar_Sesion;
import Vista_Principal.Menu_Principal;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Registrar_Usuarios extends javax.swing.JFrame {

    ControlObjetos co = new ControlObjetos();
    Modelo_Datos md = new Modelo_Datos();
    Fecha_Sistema fs = new Fecha_Sistema();
    static Iniciar_Sesion is = new Iniciar_Sesion();
    Validaciones V = new Validaciones();
    
    public Registrar_Usuarios() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/IMAGENES/LOGOCOLEGIOACTUAL.png")).getImage());
        UsernameError.setText("");
        UsernameError.setToolTipText(null);
        PasswordError.setText("");
        PasswordError.setToolTipText(null);
        TextRegDate.setText(fs.fecha());
        TextFechaHoy.setText("Fecha: "+fs.fecha());
        co.CargarNivelesUsuarios(CbLvl);
    }
    
    static int userR=0, passR=0;
    static String password;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ButtonMostrar = new javax.swing.JToggleButton();
        PasswordError = new javax.swing.JLabel();
        UsernameError = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        TextFechaHoy = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        TextUsername = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        ButtonReg = new javax.swing.JButton();
        ButtonClear = new javax.swing.JButton();
        TextName = new javax.swing.JTextField();
        TextID = new javax.swing.JTextField();
        TextEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TextRegDate = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ButtonBack = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        CbLvl = new javax.swing.JComboBox<>();
        TextPass = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Usuarios");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonMostrar.setBackground(new java.awt.Color(66, 56, 0));
        ButtonMostrar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/OjoBlanco.png"))); // NOI18N
        ButtonMostrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(165, 110, 0)));
        ButtonMostrar.setFocusPainted(false);
        ButtonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 30, 30));

        PasswordError.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        PasswordError.setForeground(new java.awt.Color(255, 0, 0));
        PasswordError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PasswordError.setText("X");
        PasswordError.setToolTipText("El nombre de usuario ya está en uso.");
        jPanel1.add(PasswordError, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 30, 30));

        UsernameError.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        UsernameError.setForeground(new java.awt.Color(255, 0, 0));
        UsernameError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UsernameError.setText("X");
        UsernameError.setToolTipText("El nombre de usuario ya está en uso.");
        jPanel1.add(UsernameError, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 30, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/LOGOCOLEGIOACTUAL.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 50, -1));

        jSeparator1.setForeground(new java.awt.Color(165, 110, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 57, 479, 7));

        TextFechaHoy.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TextFechaHoy.setForeground(new java.awt.Color(255, 255, 255));
        TextFechaHoy.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TextFechaHoy.setText("Fecha: ");
        jPanel1.add(TextFechaHoy, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, -1));

        Title.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Registrar Usuarios");
        jPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 17, 267, -1));

        TextUsername.setBackground(new java.awt.Color(66, 56, 0));
        TextUsername.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextUsername.setForeground(new java.awt.Color(255, 255, 255));
        TextUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(165, 110, 0)));
        TextUsername.setCaretColor(new java.awt.Color(255, 255, 255));
        TextUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextUsernameFocusLost(evt);
            }
        });
        TextUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextUsernameKeyTyped(evt);
            }
        });
        jPanel1.add(TextUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 260, 32));

        jSeparator2.setForeground(new java.awt.Color(165, 110, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 480, -1));

        ButtonReg.setBackground(new java.awt.Color(66, 56, 0));
        ButtonReg.setForeground(new java.awt.Color(255, 255, 255));
        ButtonReg.setText("Registrar");
        ButtonReg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(165, 110, 0)));
        ButtonReg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonReg.setEnabled(false);
        ButtonReg.setFocusPainted(false);
        ButtonReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 431, 120, 40));

        ButtonClear.setBackground(new java.awt.Color(66, 56, 0));
        ButtonClear.setForeground(new java.awt.Color(255, 255, 255));
        ButtonClear.setText("Limpiar");
        ButtonClear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(165, 110, 0)));
        ButtonClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonClear.setFocusPainted(false);
        ButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonClearActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 431, 120, 40));

        TextName.setBackground(new java.awt.Color(66, 56, 0));
        TextName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextName.setForeground(new java.awt.Color(255, 255, 255));
        TextName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(165, 110, 0)));
        TextName.setCaretColor(new java.awt.Color(255, 255, 255));
        TextName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextNameKeyTyped(evt);
            }
        });
        jPanel1.add(TextName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 260, 32));

        TextID.setBackground(new java.awt.Color(66, 56, 0));
        TextID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextID.setForeground(new java.awt.Color(255, 255, 255));
        TextID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(165, 110, 0)));
        TextID.setCaretColor(new java.awt.Color(255, 255, 255));
        TextID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextIDFocusLost(evt);
            }
        });
        TextID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextIDKeyTyped(evt);
            }
        });
        jPanel1.add(TextID, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 260, 32));

        TextEmail.setBackground(new java.awt.Color(66, 56, 0));
        TextEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextEmail.setForeground(new java.awt.Color(255, 255, 255));
        TextEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(165, 110, 0)));
        TextEmail.setCaretColor(new java.awt.Color(255, 255, 255));
        TextEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextEmailKeyTyped(evt);
            }
        });
        jPanel1.add(TextEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 260, 32));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 19)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Fecha de Registro");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 160, 32));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nombre Completo");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 160, 32));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Identificación");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 160, 32));

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Nivel de Usuario");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 160, 32));

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 19)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Nombre de Usuario");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 160, 32));

        TextRegDate.setBackground(new java.awt.Color(66, 56, 0));
        TextRegDate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextRegDate.setForeground(new java.awt.Color(255, 255, 255));
        TextRegDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextRegDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(165, 110, 0)));
        TextRegDate.setCaretColor(new java.awt.Color(255, 255, 255));
        TextRegDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextRegDateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextRegDateFocusLost(evt);
            }
        });
        TextRegDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextRegDateKeyTyped(evt);
            }
        });
        jPanel1.add(TextRegDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 260, 32));

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Contraseña");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 160, 32));

        ButtonBack.setBackground(new java.awt.Color(66, 56, 0));
        ButtonBack.setForeground(new java.awt.Color(255, 255, 255));
        ButtonBack.setText("Regresar");
        ButtonBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(165, 110, 0)));
        ButtonBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonBack.setFocusPainted(false);
        ButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBackActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 431, 120, 40));

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Correo");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 160, 32));

        CbLvl.setBackground(new java.awt.Color(66, 56, 0));
        CbLvl.setForeground(new java.awt.Color(255, 255, 255));
        CbLvl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(165, 110, 0)));
        CbLvl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CbLvlKeyReleased(evt);
            }
        });
        jPanel1.add(CbLvl, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 260, 30));

        TextPass.setBackground(new java.awt.Color(66, 56, 0));
        TextPass.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextPass.setForeground(new java.awt.Color(255, 255, 255));
        TextPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(165, 110, 0)));
        TextPass.setCaretColor(new java.awt.Color(255, 255, 255));
        TextPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextPassFocusLost(evt);
            }
        });
        TextPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextPassKeyTyped(evt);
            }
        });
        jPanel1.add(TextPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 260, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos_Usuarios/Usuarios_Registrar.png"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 480));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonClearActionPerformed
        UsernameError.setText("");
        UsernameError.setToolTipText(null);
        PasswordError.setText("");
        PasswordError.setToolTipText(null);
        TextPass.setEchoChar('•');
        ButtonMostrar.setSelected(false);
        ButtonMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/ojo.png")));
        co.LimpiarTextosRegistrarU(TextUsername, TextPass, TextName, TextID, TextEmail, TextRegDate);
        TextRegDate.setText(fs.fecha());
    }//GEN-LAST:event_ButtonClearActionPerformed

    private void ButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBackActionPerformed
        Menu_Principal nw = new Menu_Principal();
        nw.show();
        this.hide();
        this.dispose();
    }//GEN-LAST:event_ButtonBackActionPerformed

    private void ButtonRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegActionPerformed
        if (!TextName.getText().equals("") && !TextID.getText().equals("") && !TextEmail.getText().equals("") && !TextRegDate.getText().equals("")) {
            if (md.buscarusername(TextUsername.getText()) == 1) {
                JOptionPane.showMessageDialog(null, "El nombre de usuario ya está en uso.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else {
                TextID.requestFocus();
                md.IngresarBitacora(fs.fecha(), is.pUser, "Registro del usuario "+TextUsername.getText()+" de nivel "+CbLvl.getSelectedItem());
                ingresardatos(evt);
                TextRegDate.setText(""+fs.fecha());
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Faltan datos por completar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ButtonRegActionPerformed

    private void TextUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextUsernameFocusGained
        UsernameError.setText("");
        UsernameError.setToolTipText(null);
        ButtonReg.setEnabled(false);
    }//GEN-LAST:event_TextUsernameFocusGained

    private void TextUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextUsernameFocusLost
        if (TextUsername.getText().equals("")) {
            UsernameError.setText("X");
            UsernameError.setForeground(new java.awt.Color(255, 0, 0));
            UsernameError.setToolTipText("El campo no puede estar vacío.");
            userR=0; permitirRegistro();
        }
        else if (co.EspacioEnBlanco(TextUsername.getText()) == 1) {
            UsernameError.setText("X");
            UsernameError.setForeground(new java.awt.Color(255, 0, 0));
            UsernameError.setToolTipText("El nombre de usuario no puede contener espacios vacíos.");
            userR=0; permitirRegistro(); 
        }
        else if (TextUsername.getText().length() < 3) {
            UsernameError.setText("X");
            UsernameError.setForeground(new java.awt.Color(255, 0, 0));
            UsernameError.setToolTipText("El nombre de usuario tiene que tener mínimo 3 caracteres.");
            userR=0; permitirRegistro(); 
        }
        else if (TextUsername.getText().length() > 20) {
            UsernameError.setText("X");
            UsernameError.setForeground(new java.awt.Color(255, 0, 0));
            UsernameError.setToolTipText("El nombre de usuario no puede pasarse de los 20 caracteres.");
            userR=0; permitirRegistro(); 
        }
        else if (md.buscarusername(TextUsername.getText()) == 1) {
            UsernameError.setText("X");
            UsernameError.setForeground(new java.awt.Color(255, 0, 0));
            UsernameError.setToolTipText("El nombre de usuario ya está en uso.");
            userR=0; permitirRegistro(); 
        }
        else {
            UsernameError.setText("♦");
            UsernameError.setForeground(new java.awt.Color(0, 255, 0));
            UsernameError.setToolTipText("El nombre de usuario se puede registrar.");
            userR=1; permitirRegistro();
        }
    }//GEN-LAST:event_TextUsernameFocusLost

    private void TextPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextPassFocusGained
        PasswordError.setText("");
        PasswordError.setToolTipText(null);
        ButtonReg.setEnabled(false);
    }//GEN-LAST:event_TextPassFocusGained

    private void TextPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextPassFocusLost
        verificacionesPassword();
    }//GEN-LAST:event_TextPassFocusLost

    private void ButtonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMostrarActionPerformed
        if (ButtonMostrar.isSelected() == true) {
            TextPass.setEchoChar((char)0);
            ButtonMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/OjoCerradoBlanco.png")));
            verificacionesPassword();
            permitirRegistro();
            TextPass.requestFocus();
        }
        else {
            TextPass.setEchoChar('•');
            ButtonMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/OjoBlanco.png")));
            verificacionesPassword();
            permitirRegistro();
            TextPass.requestFocus();
        }
    }//GEN-LAST:event_ButtonMostrarActionPerformed

    private void TextUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextUsernameKeyTyped
        if (TextID.isEditable() == true) {
            V.noEspacios(evt);
            
            char k = evt.getKeyChar();
            if (k == KeyEvent.VK_ENTER)
                TextPass.requestFocus();
        }
    }//GEN-LAST:event_TextUsernameKeyTyped

    private void TextPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextPassKeyTyped
        if (TextID.isEditable() == true) {
            V.noEspacios(evt);
            
            char k = evt.getKeyChar();
            if (k == KeyEvent.VK_ENTER)
                TextName.requestFocus();
        }
    }//GEN-LAST:event_TextPassKeyTyped

    private void TextNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextNameKeyTyped
        if (TextID.isEditable() == true) {
            V.sololetras(evt);
            
            char k = evt.getKeyChar();
            if (k == KeyEvent.VK_ENTER)
                TextID.requestFocus();
        }
    }//GEN-LAST:event_TextNameKeyTyped

    private void TextIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextIDKeyTyped
        if (TextID.isEditable() == true) {
            V.solonumeros(evt);
            
            if (TextID.getText().equals("")) {
                char k = evt.getKeyChar();
                if (k == KeyEvent.VK_0) {
                    evt.consume();
                    TextID.setText(TextID.getText() + "1");
                }
            }
            
            char k = evt.getKeyChar();
            if (k == KeyEvent.VK_ENTER)
                TextEmail.requestFocus();
        }
    }//GEN-LAST:event_TextIDKeyTyped

    private void TextEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextEmailKeyTyped
        if (TextID.isEditable() == true) {
            V.noEspacios(evt);
            
            char k = evt.getKeyChar();
            if (k == KeyEvent.VK_ENTER)
                CbLvl.requestFocus();
        }
    }//GEN-LAST:event_TextEmailKeyTyped

    private void CbLvlKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CbLvlKeyReleased
        if (TextID.isEditable() == true) {
            V.noEspacios(evt);
            
            char k = evt.getKeyChar();
            if (k == KeyEvent.VK_ENTER)
                TextRegDate.requestFocus();
        }
    }//GEN-LAST:event_CbLvlKeyReleased

    private void TextRegDateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextRegDateKeyTyped
        if (TextID.isEditable() == true) {
            V.solonumeros(evt);
            
            char k = evt.getKeyChar();
            if (k == KeyEvent.VK_ENTER)
                ButtonReg.doClick();
        }
    }//GEN-LAST:event_TextRegDateKeyTyped

    private void TextIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextIDFocusGained
        String ID="";
        if (!TextID.getText().equals("") && TextID.getText().length() == 11) {
            for (int i=0; i<TextID.getText().length(); i++) {
                if (i==1 || i==6) i++;
                ID += TextID.getText().charAt(i);
            }
            TextID.setText(ID);
        }
    }//GEN-LAST:event_TextIDFocusGained

    private void TextIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextIDFocusLost
        String ID="";
        if (!TextID.getText().equals("")) {
            if (TextID.getText().length() == 9) {
                for (int i=0; i<TextID.getText().length(); i++) {
                    if (i==1 || i==5) ID += "-";
                    ID += TextID.getText().charAt(i);
                }
                TextID.setText(ID);
            }
            else {
                JOptionPane.showMessageDialog(null, "Identificación inválida.", "Error", JOptionPane.ERROR_MESSAGE);
                TextID.requestFocus();
            }
        }
    }//GEN-LAST:event_TextIDFocusLost

    private void TextRegDateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextRegDateFocusGained
        String fecha=""; 
        String fechaA="";
        //Se va a convertir de DD/MM/AAAA a DDMMAAAA añadiendo algun cero que se ocupe
        
        //Si la fecha es D/M/AAAA hace la conversion
        if (TextRegDate.getText().length() == 8) {
            if (TextRegDate.getText().charAt(0) != 0) {
                //Añade de una vez el 0 al inicio y quita las "/" para que pase a 0DMAAAA
                fecha += "0";
                for (int i=0; i<TextRegDate.getText().length(); i++) {
                    if (TextRegDate.getText().charAt(i) == '/') i++;
                    fecha += TextRegDate.getText().charAt(i);
                }
                TextRegDate.setText(fecha);
                if (TextRegDate.getText().charAt(2) != 0) {
                    for (int i=0; i<TextRegDate.getText().length(); i++) {
                        if (i==2) fechaA += "0";
                        fechaA += TextRegDate.getText().charAt(i);
                    }
                    TextRegDate.setText(fechaA);
                }
            }
        }
        //Si la fecha es DD/M/AAAA o D/MM/AAAA
        else if (TextRegDate.getText().length() == 9) {
            //Primero comprueba si es D/MM/AAAA
            if (TextRegDate.getText().charAt(1) == '/') {
                //Añade 0 al inicio y se salta las "/" para que pase a DDMMAAAA
                fecha += "0";
                for (int i=0; i<TextRegDate.getText().length(); i++) {
                    if (TextRegDate.getText().charAt(i) == '/') i++;
                    fecha += TextRegDate.getText().charAt(i);
                }
            }
            //Si no es D/MM/AAAA, entonces es DD/M/AAAA, hace la conversion
            else {
                for (int i=0; i<TextRegDate.getText().length(); i++) {
                    if (i == 2) { fecha+="0"; i++;}
                    if (TextRegDate.getText().charAt(i) == '/') i++;
                    fecha += TextRegDate.getText().charAt(i);
                }
            }
            TextRegDate.setText(fecha);
        }
        //Si es DD/MM/AAAA solo se salta las "/"
        else {
            for (int i=0; i<TextRegDate.getText().length(); i++) {
                if (TextRegDate.getText().charAt(i) == '/') i++;
                fecha += TextRegDate.getText().charAt(i);
            }
            TextRegDate.setText(fecha);
        }
    }//GEN-LAST:event_TextRegDateFocusGained

    private void TextRegDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextRegDateFocusLost
        String fecha=""; 
        String fechaA="";
        
        //Se va a convertir de DDMMAAAA a DD/MM/AAAA quitando algun cero que no se ocupe
        //Si la fecha tiene exactamente 8 digitos está bien escrita, y se inicia la conversion
        if (TextRegDate.getText().equals("")) {}
        else {
            if (TextRegDate.getText().length() == 8) {
                //Ciclo que repite lo mismo que hay en la fecha, añadiendo "/" cuando ya haya añadido 2 y 4 digitos Ej: 12082005 a 12/08/2005
                for (int i=0; i<TextRegDate.getText().length(); i++) {
                    if (i==2 || i==4)
                        fecha += "/";
                    fecha += TextRegDate.getText().charAt(i);
                }
                TextRegDate.setText(fecha);
                //Si el primer caracter es 0 continua la conversion, Ej: de 01 hasta 09
                if (fecha.charAt(0) == '0') {
                    //Asigna en la variable fechaA lo mismo que lo de la variable fecha pero iniciando desde el caracter 1 (Saltándose el 0)
                    for (int i=1; i<fecha.length(); i++) {
                        fechaA += fecha.charAt(i);
                    }
                    TextRegDate.setText(fechaA);
                    //Vuelve a vaciar fecha para usarlo otra vez
                    fecha="";
                    //Despues de convertido, si el caracter en el campo 2 es otro cero, continua la conversion, Ej: 1/08/2005
                    if (fechaA.charAt(2) == '0') {
                        //Asigna en la variable fecha lo mismo que está en la variable fechaA, pero cuando llega al 0, lo salta
                        for (int i=0; i<fechaA.length(); i++) {
                            //Si está en el 0 que no se ocupa, suma el contador saltándose el caracter
                            if (i == 2) i++;
                            fecha += fechaA.charAt(i);
                        }
                        TextRegDate.setText(fecha);
                    }
                }
                //Si el primer caracter no es 0, entonces revisa si el cuarto caracter sí lo es, Ej: 12/08/2005
                else {
                    //Si el cuarto caracter (posicion 3) es 0, entonces hace la conversion
                    if (fecha.charAt(3) == '0') {
                        //Asigna en la variable FechaA lo mismo que está en la variable fecha, pero se salta el cero cuando llega a la posicion 3
                        for (int i=0; i<fecha.length(); i++) {
                            //Cuando llega a la posicion 3, en donde está el 0, suma el contador para ignorarlo
                            if (i == 3) i++;
                            fechaA += fecha.charAt(i);
                        }
                        TextRegDate.setText(fechaA);
                    }
                }
            }
            //Si la fecha no está puesta como DDMMYYYY envia este mensaje de error
            else {
                JOptionPane.showMessageDialog(null, "Digite una fecha correcta\nEscriba: DDMMAAAA\nNo digite espacios, letras o caracteres.", "Error", JOptionPane.ERROR_MESSAGE);
                TextRegDate.setText("");
                TextRegDate.requestFocus();
            }
        }
    }//GEN-LAST:event_TextRegDateFocusLost

    public void ingresardatos(java.awt.event.ActionEvent e) {
        if (TextRegDate.getText().equals(""))
            TextRegDate.requestFocus();
        else if (TextEmail.getText().equals(""))
            TextEmail.requestFocus();
        else if (TextID.getText().equals(""))
            TextID.requestFocus();
        else if (TextName.getText().equals(""))
            TextName.requestFocus();
        else if (TextPass.getText().equals(""))
            TextPass.requestFocus();
        else if (TextUsername.getText().equals(""))
            TextUsername.requestFocus();
        if (TextPass.getText().equals("") || TextName.getText().equals("") || TextID.getText().equals("") ||
        TextUsername.getText().equals("") || TextRegDate.getText().equals("") || TextEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan datos por ingresar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else {
            String userlvl = ""+CbLvl.getSelectedItem();
            if (md.AddUser(TextUsername.getText(), TextPass.getText(), TextName.getText(), TextID.getText(), TextEmail.getText(),
            userlvl, TextRegDate.getText()) == true) {
                JOptionPane.showMessageDialog(null, "Usuario registrado correctamente.", "Estado", JOptionPane.INFORMATION_MESSAGE);
                co.LimpiarTextosRegistrarU(TextUsername, TextPass, TextName, TextID, TextEmail, TextRegDate);
            }
            else {
                JOptionPane.showMessageDialog(null, "El Usuario no pudo ser registrado.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    
    public void permitirRegistro() {
        if (userR == 1 && passR == 1)
            ButtonReg.setEnabled(true);
        else
            ButtonReg.setEnabled(false);
    }
    
    public void verificacionesPassword() {
        if (TextPass.getText().equals("")) {
            PasswordError.setText("X");
            PasswordError.setForeground(new java.awt.Color(255, 0, 0));
            PasswordError.setToolTipText("El campo no puede estar vacío.");
            passR=0; permitirRegistro();
        }
        else if (co.EspacioEnBlanco(TextPass.getText()) == 1) {
            PasswordError.setText("X");
            PasswordError.setForeground(new java.awt.Color(255, 0, 0));
            PasswordError.setToolTipText("La contraseña no puede contener espacios vacíos.");
            passR=0; permitirRegistro();
        }
        else if (TextPass.getText().equals("root")) {
            PasswordError.setText("♦");
            PasswordError.setForeground(new java.awt.Color(0, 255, 0));
            PasswordError.setToolTipText("Es la respuesta."); passR=1;
            passR=1; permitirRegistro();
        }
        else if (TextPass.getText().length() < 6) {
            PasswordError.setText("X");
            PasswordError.setForeground(new java.awt.Color(255, 0, 0));
            PasswordError.setToolTipText("La contraseña tiene que tener mínimo 6 caracteres.");
            passR=0; permitirRegistro();
        }
        else if (TextPass.getText().length() > 16) {
            PasswordError.setText("X");
            PasswordError.setForeground(new java.awt.Color(255, 0, 0));
            PasswordError.setToolTipText("La contraseña no puede excederse de los 16 caracteres.");
            passR=0; permitirRegistro(); 
        }
        else if (co.ContraseñasMalas(TextPass.getText()) == 1) {
            PasswordError.setText("☺");
            PasswordError.setForeground(new java.awt.Color(255, 0, 0));
            PasswordError.setToolTipText("No.");
            passR=0; permitirRegistro(); 
        }
        else {
            PasswordError.setText("♦");
            PasswordError.setForeground(new java.awt.Color(0, 255, 0));
            PasswordError.setToolTipText("La contraseña puede usarse."); passR=1;
            passR=1; permitirRegistro();
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar_Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBack;
    private javax.swing.JButton ButtonClear;
    private javax.swing.JToggleButton ButtonMostrar;
    private javax.swing.JButton ButtonReg;
    private javax.swing.JComboBox<String> CbLvl;
    private javax.swing.JLabel PasswordError;
    private javax.swing.JTextField TextEmail;
    private javax.swing.JLabel TextFechaHoy;
    private javax.swing.JTextField TextID;
    private javax.swing.JTextField TextName;
    private javax.swing.JPasswordField TextPass;
    private javax.swing.JTextField TextRegDate;
    private javax.swing.JTextField TextUsername;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel UsernameError;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
