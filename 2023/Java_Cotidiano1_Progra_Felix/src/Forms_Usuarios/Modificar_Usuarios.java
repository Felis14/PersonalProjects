package Forms_Usuarios;

import Utilitario.*;
import Vista_Principal.*;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Modificar_Usuarios extends javax.swing.JFrame {

    ControlObjetos co = new ControlObjetos();
    Modelo_Datos md = new Modelo_Datos();
    Fecha_Sistema fs = new Fecha_Sistema();
    Validaciones V = new Validaciones();
    static Iniciar_Sesion is = new Iniciar_Sesion();
    
    public Modificar_Usuarios() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/IMAGENES/LOGOCOLEGIOACTUAL.png")).getImage());
        PasswordError.setText("");
        PasswordError.setToolTipText(null);
        TextFechaHoy.setText("Fecha: "+fs.fecha());
        co.CargarNivelesUsuarios(CbLvl);
        co.BloquearObjetosModificarU(TextUsername, TextPass, TextName, TextID, TextEmail, TextRegDate, ButtonBuscar4, ButtonMod);
    }
    
    static int passR=0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ButtonMostrar = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        TextFechaHoy = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        TextUsername = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        ButtonMod = new javax.swing.JButton();
        ButtonClear = new javax.swing.JButton();
        PasswordError = new javax.swing.JLabel();
        TextName = new javax.swing.JTextField();
        TextID = new javax.swing.JTextField();
        TextEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TextUserLvl = new javax.swing.JTextField();
        TextRegDate = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ButtonBack = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        CbLvl = new javax.swing.JComboBox<>();
        TextPass = new javax.swing.JPasswordField();
        ButtonBuscar4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modificación de Usuarios");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonMostrar.setBackground(new java.awt.Color(23, 66, 0));
        ButtonMostrar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/OjoBlanco.png"))); // NOI18N
        ButtonMostrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(106, 165, 0)));
        ButtonMostrar.setFocusPainted(false);
        ButtonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 30, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/LOGOCOLEGIOACTUAL.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 50, -1));

        jSeparator1.setForeground(new java.awt.Color(106, 165, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 57, 479, 7));

        TextFechaHoy.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TextFechaHoy.setForeground(new java.awt.Color(255, 255, 255));
        TextFechaHoy.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TextFechaHoy.setText("Fecha: ");
        jPanel1.add(TextFechaHoy, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, -1));

        Title.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Modificar Usuarios");
        jPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 17, 267, -1));

        TextUsername.setBackground(new java.awt.Color(23, 66, 0));
        TextUsername.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextUsername.setForeground(new java.awt.Color(255, 255, 255));
        TextUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(106, 165, 0)));
        TextUsername.setCaretColor(new java.awt.Color(255, 255, 255));
        TextUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextUsernameKeyTyped(evt);
            }
        });
        jPanel1.add(TextUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 150, 32));

        jSeparator2.setForeground(new java.awt.Color(106, 165, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 479, 4));

        ButtonMod.setBackground(new java.awt.Color(23, 66, 0));
        ButtonMod.setForeground(new java.awt.Color(255, 255, 255));
        ButtonMod.setText("Modificar");
        ButtonMod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(106, 165, 0)));
        ButtonMod.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonMod.setEnabled(false);
        ButtonMod.setFocusPainted(false);
        ButtonMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonModActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 120, 40));

        ButtonClear.setBackground(new java.awt.Color(23, 66, 0));
        ButtonClear.setForeground(new java.awt.Color(255, 255, 255));
        ButtonClear.setText("Limpiar");
        ButtonClear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(106, 165, 0)));
        ButtonClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonClear.setFocusPainted(false);
        ButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonClearActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 120, 40));

        PasswordError.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        PasswordError.setForeground(new java.awt.Color(255, 0, 0));
        PasswordError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PasswordError.setText("X");
        PasswordError.setToolTipText("El nombre de usuario ya está en uso.");
        jPanel1.add(PasswordError, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 30, 30));

        TextName.setBackground(new java.awt.Color(23, 66, 0));
        TextName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextName.setForeground(new java.awt.Color(255, 255, 255));
        TextName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(106, 165, 0)));
        TextName.setCaretColor(new java.awt.Color(255, 255, 255));
        TextName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextNameKeyTyped(evt);
            }
        });
        jPanel1.add(TextName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 260, 32));

        TextID.setBackground(new java.awt.Color(23, 66, 0));
        TextID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextID.setForeground(new java.awt.Color(255, 255, 255));
        TextID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(106, 165, 0)));
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

        TextEmail.setBackground(new java.awt.Color(23, 66, 0));
        TextEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextEmail.setForeground(new java.awt.Color(255, 255, 255));
        TextEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(106, 165, 0)));
        TextEmail.setCaretColor(new java.awt.Color(255, 255, 255));
        TextEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextEmailKeyTyped(evt);
            }
        });
        jPanel1.add(TextEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 260, 32));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 21)); // NOI18N
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

        TextUserLvl.setEditable(false);
        TextUserLvl.setBackground(new java.awt.Color(23, 66, 0));
        TextUserLvl.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextUserLvl.setForeground(new java.awt.Color(255, 255, 255));
        TextUserLvl.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextUserLvl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(106, 165, 0)));
        TextUserLvl.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(TextUserLvl, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 120, 32));

        TextRegDate.setBackground(new java.awt.Color(23, 66, 0));
        TextRegDate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextRegDate.setForeground(new java.awt.Color(255, 255, 255));
        TextRegDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextRegDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(106, 165, 0)));
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

        ButtonBack.setBackground(new java.awt.Color(23, 66, 0));
        ButtonBack.setForeground(new java.awt.Color(255, 255, 255));
        ButtonBack.setText("Regresar");
        ButtonBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(106, 165, 0)));
        ButtonBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonBack.setFocusPainted(false);
        ButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBackActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 120, 40));

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Correo");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 160, 32));

        CbLvl.setBackground(new java.awt.Color(23, 66, 0));
        CbLvl.setForeground(new java.awt.Color(255, 255, 255));
        CbLvl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(106, 165, 0)));
        CbLvl.setLightWeightPopupEnabled(false);
        CbLvl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CbLvlKeyPressed(evt);
            }
        });
        jPanel1.add(CbLvl, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 120, 30));

        TextPass.setBackground(new java.awt.Color(23, 66, 0));
        TextPass.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextPass.setForeground(new java.awt.Color(255, 255, 255));
        TextPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(106, 165, 0)));
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

        ButtonBuscar4.setBackground(new java.awt.Color(23, 66, 0));
        ButtonBuscar4.setForeground(new java.awt.Color(255, 255, 255));
        ButtonBuscar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/busqueda (1).png"))); // NOI18N
        ButtonBuscar4.setText("Buscar");
        ButtonBuscar4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(106, 165, 0)));
        ButtonBuscar4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonBuscar4.setFocusPainted(false);
        ButtonBuscar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBuscar4ActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonBuscar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 100, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos_Usuarios/Usuarios_Modificar.png"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 480));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonClearActionPerformed
        TextPass.setEchoChar('•');
        ButtonMostrar.setSelected(false);
        ButtonMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/OjoBlanco.png")));
        co.LimpiarTextosConsultarU(TextUsername, TextPass, TextName, TextID, TextEmail, TextUserLvl, TextRegDate);
        
    }//GEN-LAST:event_ButtonClearActionPerformed

    private void ButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBackActionPerformed
        Menu_Principal nw = new Menu_Principal();
        nw.show();
        this.hide();
        this.dispose();
    }//GEN-LAST:event_ButtonBackActionPerformed

    private void ButtonModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonModActionPerformed
        if (!TextName.getText().equals("") && !TextID.getText().equals("") && !TextEmail.getText().equals("") && !TextRegDate.getText().equals("")) {
            TextUsername.requestFocus();
            modifica(evt);
            md.IngresarBitacora(fs.fecha(), is.pUser, "Modificación del usuario "+TextUsername.getText());
        }
        else {
            JOptionPane.showMessageDialog(null, "Faltan datos por completar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ButtonModActionPerformed

    public void modifica(java.awt.event.ActionEvent e) {
        if (TextRegDate.getText().equals(""))
            TextRegDate.requestFocus();
        else if (TextEmail.getText().equals(""))
            TextEmail.requestFocus();
        else if (TextID.getText().equals(""))
            TextID.requestFocus();
        else if (TextName.getText().equals(""))
            TextName.requestFocus();
        if (TextName.getText().equals("") || 
            TextEmail.getText().equals("") ||
            TextRegDate.getText().equals("") ||
            TextID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan datos por ingresar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else {
            if (md.ModificarUsuarios(TextID.getText(), TextName.getText(), TextRegDate.getText(), TextEmail.getText(), "" + CbLvl.getSelectedItem(), TextUsername.getText(), TextPass.getText())) {
                JOptionPane.showMessageDialog(null, "Cliente modificado correctamente.", "Estado", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    
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

    private void ButtonBuscar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBuscar4ActionPerformed
        if (md.buscarusername(TextUsername.getText()) == 1) {
            md.MostrarDatosU(TextUsername.getText(), TextPass, TextName, TextID, TextEmail, TextUserLvl, TextRegDate);
            verificacionesPassword();
            co.DesbloquearObjetosModificarU(TextUsername, TextPass, TextName, TextID, TextEmail, TextRegDate, ButtonBuscar4, ButtonMod);
            TextPass.requestFocus();
            PasswordError.setText("♦");
            PasswordError.setForeground(new java.awt.Color(0, 255, 0));
            PasswordError.setToolTipText("La contraseña puede usarse.");
        }
        else {
            JOptionPane.showMessageDialog(null, "No existe ningún usuario bajo ese nombre de usuario.", "Estado", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_ButtonBuscar4ActionPerformed

    private void TextPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextPassFocusGained
        PasswordError.setText("");
        PasswordError.setToolTipText(null);
        ButtonMod.setEnabled(false);
    }//GEN-LAST:event_TextPassFocusGained

    private void TextPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextPassFocusLost
        verificacionesPassword();
    }//GEN-LAST:event_TextPassFocusLost

    private void TextUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextUsernameKeyTyped
        if (TextUsername.isEditable() == true) {
            char k = evt.getKeyChar();
            if (k == KeyEvent.VK_ENTER)
                ButtonBuscar4.doClick();
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

    private void CbLvlKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CbLvlKeyPressed
        if (TextID.isEditable() == true) {
            V.noEspacios(evt);
            
            char k = evt.getKeyChar();
            if (k == KeyEvent.VK_ENTER)
                TextRegDate.requestFocus();
        }
    }//GEN-LAST:event_CbLvlKeyPressed

    private void TextRegDateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextRegDateKeyTyped
        if (TextID.isEditable() == true) {
            V.solonumeros(evt);
            
            char k = evt.getKeyChar();
            if (k == KeyEvent.VK_ENTER)
                ButtonMod.doClick();
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
        if (passR == 1)
            ButtonMod.setEnabled(true);
        else
            ButtonMod.setEnabled(false);
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
            PasswordError.setToolTipText("La contraseña puede usarse.");
            passR=1; permitirRegistro();
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modificar_Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBack;
    private javax.swing.JButton ButtonBuscar4;
    private javax.swing.JButton ButtonClear;
    private javax.swing.JButton ButtonMod;
    private javax.swing.JToggleButton ButtonMostrar;
    private javax.swing.JComboBox<String> CbLvl;
    private javax.swing.JLabel PasswordError;
    private javax.swing.JTextField TextEmail;
    private javax.swing.JLabel TextFechaHoy;
    private javax.swing.JTextField TextID;
    private javax.swing.JTextField TextName;
    private javax.swing.JPasswordField TextPass;
    private javax.swing.JTextField TextRegDate;
    private javax.swing.JTextField TextUserLvl;
    private javax.swing.JTextField TextUsername;
    private javax.swing.JLabel Title;
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
