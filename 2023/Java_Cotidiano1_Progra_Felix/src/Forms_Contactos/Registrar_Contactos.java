package Forms_Contactos;

import Utilitario.*;
import Vista_Principal.*;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Registrar_Contactos extends javax.swing.JFrame {

    ControlObjetos co = new ControlObjetos();
    Modelo_Datos md = new Modelo_Datos();
    Fecha_Sistema fs = new Fecha_Sistema();
    Combo_Box_Paises CbP = new Combo_Box_Paises();
    Validaciones V = new Validaciones();
    static Iniciar_Sesion is = new Iniciar_Sesion();
    
    public Registrar_Contactos() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/IMAGENES/LOGOCOLEGIOACTUAL.png")).getImage());
        CbPais.hide(); CbEstado.hide();
        TextRegDate.setText(fs.fecha());
        TextFechaHoy.setText("Fecha: "+fs.fecha());
        co.CargarCbCategoria(CbCat);
        CbP.CargarCbPaises(CbPais);
        co.BloquearObjetosRegistrar(TextID, TextName, TextRegDate, TextBirth, TextTelF, TextTelM, TextEmail, ButtonBuscar, ButtonReg);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        TextFechaHoy = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        TextID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        CbPais = new javax.swing.JComboBox<>();
        CbEstado = new javax.swing.JComboBox<>();
        ButtonBuscar = new javax.swing.JButton();
        ButtonReg = new javax.swing.JButton();
        ButtonClear = new javax.swing.JButton();
        TextEmail = new javax.swing.JTextField();
        TextRegDate = new javax.swing.JTextField();
        TextBirth = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TextTelF = new javax.swing.JTextField();
        TextTelM = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TextName = new javax.swing.JTextField();
        ButtonBack = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        CbCat = new javax.swing.JComboBox<>();
        CbDir = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Contactos");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/LOGOCOLEGIOACTUAL.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 50, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 153, 204));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 57, 479, 7));

        TextFechaHoy.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TextFechaHoy.setForeground(new java.awt.Color(255, 255, 255));
        TextFechaHoy.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TextFechaHoy.setText("Fecha: ");
        TextFechaHoy.setName(""); // NOI18N
        jPanel1.add(TextFechaHoy, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, -1));

        Title.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Registrar Contactos");
        jPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 17, 267, -1));

        TextID.setBackground(new java.awt.Color(27, 31, 92));
        TextID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextID.setForeground(new java.awt.Color(255, 255, 255));
        TextID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        TextID.setCaretColor(new java.awt.Color(255, 255, 255));
        TextID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextIDKeyTyped(evt);
            }
        });
        jPanel1.add(TextID, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 150, 32));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Correo");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 160, 32));

        jSeparator2.setForeground(new java.awt.Color(0, 153, 204));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 479, 4));

        CbPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbPaisActionPerformed(evt);
            }
        });
        jPanel1.add(CbPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, 160, 30));

        jPanel1.add(CbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 520, 170, 30));

        ButtonBuscar.setBackground(new java.awt.Color(27, 31, 92));
        ButtonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/busqueda (1).png"))); // NOI18N
        ButtonBuscar.setText("Buscar");
        ButtonBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        ButtonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonBuscar.setFocusPainted(false);
        ButtonBuscar.setIconTextGap(1);
        ButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 100, 30));

        ButtonReg.setBackground(new java.awt.Color(27, 31, 92));
        ButtonReg.setForeground(new java.awt.Color(255, 255, 255));
        ButtonReg.setText("Registrar");
        ButtonReg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        ButtonReg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonReg.setFocusPainted(false);
        ButtonReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 610, 120, 40));

        ButtonClear.setBackground(new java.awt.Color(27, 31, 92));
        ButtonClear.setForeground(new java.awt.Color(255, 255, 255));
        ButtonClear.setText("Limpiar");
        ButtonClear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        ButtonClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonClear.setFocusPainted(false);
        ButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonClearActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 610, 120, 40));

        TextEmail.setBackground(new java.awt.Color(27, 31, 92));
        TextEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextEmail.setForeground(new java.awt.Color(255, 255, 255));
        TextEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        TextEmail.setCaretColor(new java.awt.Color(255, 255, 255));
        TextEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextEmailKeyTyped(evt);
            }
        });
        jPanel1.add(TextEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 260, 32));

        TextRegDate.setBackground(new java.awt.Color(27, 31, 92));
        TextRegDate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextRegDate.setForeground(new java.awt.Color(255, 255, 255));
        TextRegDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextRegDate.setToolTipText("Escriba: DDMMAAAA");
        TextRegDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
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
        jPanel1.add(TextRegDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 260, 32));

        TextBirth.setBackground(new java.awt.Color(27, 31, 92));
        TextBirth.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextBirth.setForeground(new java.awt.Color(255, 255, 255));
        TextBirth.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextBirth.setToolTipText("Escriba: DDMMAAAA");
        TextBirth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        TextBirth.setCaretColor(new java.awt.Color(255, 255, 255));
        TextBirth.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextBirthFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextBirthFocusLost(evt);
            }
        });
        TextBirth.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextBirthKeyTyped(evt);
            }
        });
        jPanel1.add(TextBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 260, 32));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Identificación");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 160, 32));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Dirección");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 160, 32));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 21)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Fecha de Registro");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 160, 32));

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Categoría");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 160, 32));

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Teléfono fijo");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 160, 32));

        TextTelF.setBackground(new java.awt.Color(27, 31, 92));
        TextTelF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextTelF.setForeground(new java.awt.Color(255, 255, 255));
        TextTelF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextTelF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        TextTelF.setCaretColor(new java.awt.Color(255, 255, 255));
        TextTelF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextTelFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextTelFFocusLost(evt);
            }
        });
        TextTelF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextTelFKeyTyped(evt);
            }
        });
        jPanel1.add(TextTelF, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 260, 32));

        TextTelM.setBackground(new java.awt.Color(27, 31, 92));
        TextTelM.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextTelM.setForeground(new java.awt.Color(255, 255, 255));
        TextTelM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextTelM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        TextTelM.setCaretColor(new java.awt.Color(255, 255, 255));
        TextTelM.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextTelMFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextTelMFocusLost(evt);
            }
        });
        TextTelM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextTelMKeyTyped(evt);
            }
        });
        jPanel1.add(TextTelM, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 260, 32));

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Teléfono móvil");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 160, 32));

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Nombre");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 160, 32));

        TextName.setBackground(new java.awt.Color(27, 31, 92));
        TextName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextName.setForeground(new java.awt.Color(255, 255, 255));
        TextName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        TextName.setCaretColor(new java.awt.Color(255, 255, 255));
        TextName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextNameKeyTyped(evt);
            }
        });
        jPanel1.add(TextName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 260, 32));

        ButtonBack.setBackground(new java.awt.Color(27, 31, 92));
        ButtonBack.setForeground(new java.awt.Color(255, 255, 255));
        ButtonBack.setText("Regresar");
        ButtonBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        ButtonBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonBack.setFocusPainted(false);
        ButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBackActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 120, 40));

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Fecha de Nacimiento");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 160, 32));

        CbCat.setBackground(new java.awt.Color(27, 31, 92));
        CbCat.setForeground(new java.awt.Color(255, 255, 255));
        CbCat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        CbCat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CbCatKeyPressed(evt);
            }
        });
        jPanel1.add(CbCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 260, 30));

        CbDir.setBackground(new java.awt.Color(27, 31, 92));
        CbDir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CbDir.setForeground(new java.awt.Color(255, 255, 255));
        CbDir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "San José", "Alajuela", "Cartago", "Heredia", "Guanacaste", "Puntarenas", "Limón" }));
        CbDir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        CbDir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CbDirKeyPressed(evt);
            }
        });
        jPanel1.add(CbDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 260, 30));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos_Contactos/Contactos_Registrar.png"))); // NOI18N
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 660));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonClearActionPerformed
        co.LimpiarTextosRegistrar(TextID, TextName, CbDir, TextRegDate, TextBirth, CbCat, TextTelF, TextTelM, TextEmail);
        co.BloquearObjetosRegistrar(TextID, TextName, TextRegDate, TextBirth, TextTelF, TextTelM, TextEmail, ButtonBuscar, ButtonReg);
        TextRegDate.setText(fs.fecha());
    }//GEN-LAST:event_ButtonClearActionPerformed

    private void ButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBackActionPerformed
        Menu_Principal nw = new Menu_Principal();
        nw.show();
        this.hide();
        this.dispose();
    }//GEN-LAST:event_ButtonBackActionPerformed

    private void ButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBuscarActionPerformed
        if ((TextID.getText().equals(""))) {
            JOptionPane.showMessageDialog(null, "No ha ingresado ninguna identificación.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else {
            if (md.buscaridentificacion(TextID.getText())==1) {
                JOptionPane.showMessageDialog(null, "El contacto ya está registrado", "ERROR", JOptionPane.ERROR_MESSAGE);
                TextID.requestFocus();
            }
            else {
                JOptionPane.showMessageDialog(null, "Contacto no registrado, puede registrarlo.", "Registro", JOptionPane.INFORMATION_MESSAGE);
                co.DesbloquearObjetosRegistrar(TextID, TextName, TextRegDate, TextBirth, TextTelF, TextTelM, TextEmail, ButtonBuscar, ButtonReg);
                TextName.requestFocus();
            }
        }
    }//GEN-LAST:event_ButtonBuscarActionPerformed

    private void ButtonRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegActionPerformed
        md.IngresarBitacora(fs.fecha(), is.pUser, "Registro de Contacto N°"+TextID.getText()+" - "+TextName.getText());
        TextID.requestFocus();
        ingresardatos(evt);
        TextRegDate.setText(""+fs.fecha());
    }//GEN-LAST:event_ButtonRegActionPerformed

    private void CbPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbPaisActionPerformed
        if (CbPais.getSelectedIndex() == 0) { CbEstado.removeAllItems(); CbP.CargarCbAFG(CbEstado); }
        if (CbPais.getSelectedIndex() == 1) { CbEstado.removeAllItems(); CbP.CargarCbARG(CbEstado); }
        if (CbPais.getSelectedIndex() == 2) { CbEstado.removeAllItems(); CbP.CargarCbBHS(CbEstado); }
        if (CbPais.getSelectedIndex() == 3) { CbEstado.removeAllItems(); CbP.CargarCbBRB(CbEstado); }
        if (CbPais.getSelectedIndex() == 4) { CbEstado.removeAllItems(); CbP.CargarCbBLZ(CbEstado); }
        if (CbPais.getSelectedIndex() == 5) { CbEstado.removeAllItems(); CbP.CargarCbBOL(CbEstado); }
        if (CbPais.getSelectedIndex() == 6) { CbEstado.removeAllItems(); CbP.CargarCbBRA(CbEstado); }
        if (CbPais.getSelectedIndex() == 7) { CbEstado.removeAllItems(); CbP.CargarCbCAN(CbEstado); }
        if (CbPais.getSelectedIndex() == 8) { CbEstado.removeAllItems(); CbP.CargarCbCHL(CbEstado); }
        if (CbPais.getSelectedIndex() == 9) { CbEstado.removeAllItems(); CbP.CargarCbCOL(CbEstado); }
        if (CbPais.getSelectedIndex() == 10) { CbEstado.removeAllItems(); CbP.CargarCbCRC(CbEstado); }
    }//GEN-LAST:event_CbPaisActionPerformed

    //Aqui se aplica la validacion para que solo acepte numeros
    private void TextTelFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextTelFKeyTyped
        if (TextTelF.isEditable() == true) {
            V.solonumeros(evt);

            char k = evt.getKeyChar();
            if (k == KeyEvent.VK_ENTER)
                TextTelM.requestFocus();
        }
    }//GEN-LAST:event_TextTelFKeyTyped

    private void TextNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextNameKeyTyped
        if (TextName.isEditable() == true) {
            V.sololetras(evt);

            char k = evt.getKeyChar();
            if (k == KeyEvent.VK_ENTER)
                CbDir.requestFocus();
        }
    }//GEN-LAST:event_TextNameKeyTyped

    private void TextRegDateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextRegDateKeyTyped
        if (TextRegDate.isEditable() == true) {
            V.solonumerosfecha(evt);

            char k = evt.getKeyChar();
            if (k == KeyEvent.VK_ENTER)
                TextBirth.requestFocus();
        }
    }//GEN-LAST:event_TextRegDateKeyTyped

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
                //Si el primer caracter es 0 continua la conversion, Ej: de 01 hasta 09 Ej: 12/08/2005 a 12/8/2005
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
                            //Si está en la posicion 2, donde está el 0 que no se ocupa, suma el contador saltándose el caracter
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

    private void TextBirthKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextBirthKeyTyped
        if (TextBirth.isEditable() == true) {
            V.solonumerosfecha(evt);

            char k = evt.getKeyChar();
            if (k == KeyEvent.VK_ENTER)
                CbCat.requestFocus();
        }
    }//GEN-LAST:event_TextBirthKeyTyped

    private void TextBirthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextBirthFocusLost
        String fecha=""; 
        String fechaA="";
        
        if (TextBirth.getText().equals("")) {}
        else {
            if (TextBirth.getText().length() == 8) {
                for (int i=0; i<TextBirth.getText().length(); i++) {
                    if (i==2 || i==4)
                        fecha += "/";
                    fecha += TextBirth.getText().charAt(i);
                }
                TextBirth.setText(fecha);
                if (fecha.charAt(0) == '0') {
                    for (int i=1; i<fecha.length(); i++) {
                        fechaA += fecha.charAt(i);
                    }
                    TextBirth.setText(fechaA);
                    fecha="";
                    if (fechaA.charAt(2) == '0') {
                        for (int i=0; i<fechaA.length(); i++) {
                            if (i == 2) i++;
                            fecha += fechaA.charAt(i);
                        }
                        TextBirth.setText(fecha);
                    }
                }
                else {
                    if (fecha.charAt(3) == '0') {
                        for (int i=0; i<fecha.length(); i++) {
                        if (i == 3) i++;
                        fechaA += fecha.charAt(i);
                    }
                    TextBirth.setText(fechaA);
                    }
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Digite una fecha correcta\nEscriba: DDMMAAAA\nNo digite espacios, letras o caracteres.", "Error", JOptionPane.ERROR_MESSAGE);
                TextBirth.setText("");
                TextBirth.requestFocus();
            }
        }
    }//GEN-LAST:event_TextBirthFocusLost

    private void TextIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextIDKeyTyped
        if (TextID.isEditable() == true) {
        V.solonumeros(evt);
        
        char k = evt.getKeyChar();
        if (k == KeyEvent.VK_ENTER)
            ButtonBuscar.doClick();
        }
    }//GEN-LAST:event_TextIDKeyTyped

    private void CbDirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CbDirKeyPressed
        char k = evt.getKeyChar();
        if (k == KeyEvent.VK_ENTER)
            TextRegDate.requestFocus();
    }//GEN-LAST:event_CbDirKeyPressed

    private void CbCatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CbCatKeyPressed
        char k = evt.getKeyChar();
        if (k == KeyEvent.VK_ENTER)
            TextTelF.requestFocus();
    }//GEN-LAST:event_CbCatKeyPressed

    private void TextTelMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextTelMKeyTyped
        if (TextTelM.isEditable() == true) {
            V.solonumeros(evt);

            char k = evt.getKeyChar();
            if (k == KeyEvent.VK_ENTER)
                TextEmail.requestFocus();
        }
    }//GEN-LAST:event_TextTelMKeyTyped

    private void TextEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextEmailKeyTyped
        if (TextEmail.isEditable() == true) {
            V.noEspacios(evt);

            char k = evt.getKeyChar();
            if (k == KeyEvent.VK_ENTER)
                ButtonReg.doClick();
        }
    }//GEN-LAST:event_TextEmailKeyTyped

    private void TextRegDateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextRegDateFocusGained
        String fecha="";
        String fechaA="";
        //Se va a convertir de DD/MM/AAAA a DDMMAAAA añadiendo algun cero que se ocupe
        
        //Si la fecha es D/M/AAAA hace la conversion //Ej: 1/1/2005
        if (TextRegDate.getText().length() == 8) {
            if (TextRegDate.getText().charAt(0) != 0) {
                //Añade de una vez el 0 al inicio y quita las "/" para que pase a 0DMAAAA
                fecha += "0";
                for (int i=0; i<TextRegDate.getText().length(); i++) {
                    if (TextRegDate.getText().charAt(i) == '/') i++;
                    fecha += TextRegDate.getText().charAt(i);
                }
                TextRegDate.setText(fecha);
                //Si la posicion 2 en la fecha es diferente de 0, hace la conversion Ej: 0112005 a 01012005
                if (TextRegDate.getText().charAt(2) != 0) {
                    //Hace la conversion de caracter a caracter a la variable, pero antes de sumar la posicion 2, agrega un 0
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
            //Primero comprueba si es D/MM/AAAA Ej: 1/10/2005
            if (TextRegDate.getText().charAt(1) == '/') {
                //Añade 0 al inicio y se salta las "/" para que pase a DDMMAAAA
                fecha += "0";
                for (int i=0; i<TextRegDate.getText().length(); i++) {
                    if (TextRegDate.getText().charAt(i) == '/') i++;
                    fecha += TextRegDate.getText().charAt(i);
                }
            }
            //Si no es D/MM/AAAA, entonces es DD/M/AAAA, hace la conversion Ej: 12/5/2005 12052005
            else {
                //Cuando llega a la posicion 2 (Donde hay una /) añade un 0 y se salta el caracter
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

    private void TextBirthFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextBirthFocusGained
        String fecha=""; 
        String fechaA="";
        //Se va a convertir de DD/MM/AAAA a DDMMAAAA añadiendo algun cero que se ocupe
        
        //Si la fecha es D/M/AAAA hace la conversion
        if (TextBirth.getText().length() == 8) {
            if (TextBirth.getText().charAt(0) != 0) {
                //Añade de una vez el 0 al inicio y quita las "/" para que pase a 0DMAAAA
                fecha += "0";
                for (int i=0; i<TextBirth.getText().length(); i++) {
                    if (TextBirth.getText().charAt(i) == '/') i++;
                    fecha += TextBirth.getText().charAt(i);
                }
                TextBirth.setText(fecha);
                if (TextBirth.getText().charAt(2) != 0) {
                    for (int i=0; i<TextBirth.getText().length(); i++) {
                        if (i==2) fechaA += "0";
                        fechaA += TextBirth.getText().charAt(i);
                    }
                    TextBirth.setText(fechaA);
                }
            }
        }
        //Si la fecha es DD/M/AAAA o D/MM/AAAA
        else if (TextBirth.getText().length() == 9) {
            //Primero comprueba si es D/MM/AAAA
            if (TextBirth.getText().charAt(1) == '/') {
                //Añade 0 al inicio y se salta las "/" para que pase a DDMMAAAA
                fecha += "0";
                for (int i=0; i<TextBirth.getText().length(); i++) {
                    if (TextBirth.getText().charAt(i) == '/') i++;
                    fecha += TextBirth.getText().charAt(i);
                }
            }
            //Si no es D/MM/AAAA, entonces es DD/M/AAAA, hace la conversion
            else {
                for (int i=0; i<TextBirth.getText().length(); i++) {
                    if (i == 2) { fecha+="0"; i++;}
                    if (TextBirth.getText().charAt(i) == '/') i++;
                    fecha += TextBirth.getText().charAt(i);
                }
            }
            TextBirth.setText(fecha);
        }
        //Si es DD/MM/AAAA solo se salta las "/"
        else {
            for (int i=0; i<TextBirth.getText().length(); i++) {
                if (TextBirth.getText().charAt(i) == '/') i++;
                fecha += TextBirth.getText().charAt(i);
            }
            TextBirth.setText(fecha);
        }
    }//GEN-LAST:event_TextBirthFocusGained

    private void TextTelFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextTelFFocusGained
        String telf="";
        if (!TextTelF.getText().equals("")) {
            //Suma caracter por caracter el texto en el textfield a la variable, y cuando llegue a la posicion 4, le añade un -
            for (int i=0; i<TextTelF.getText().length(); i++) {
                if (i==4) i++;
                telf += TextTelF.getText().charAt(i);
            }
            TextTelF.setText(telf);
        }
    }//GEN-LAST:event_TextTelFFocusGained

    private void TextTelFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextTelFFocusLost
        String telf="";
        if (!TextTelF.getText().equals("")) {
            if (TextTelF.getText().length() == 8) {
                for (int i=0; i<TextTelF.getText().length(); i++) {
                    telf += TextTelF.getText().charAt(i);
                    if (i==3) telf += "-";
                }
                TextTelF.setText(telf);
            }
            else {
                JOptionPane.showMessageDialog(null, "El número debe tener exactamente 8 dígitos.\nSin espacios, letras o caracteres.", "Error", JOptionPane.ERROR_MESSAGE);
                TextTelF.setText(""); TextTelF.requestFocus();
            }
        }
    }//GEN-LAST:event_TextTelFFocusLost

    private void TextTelMFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextTelMFocusGained
        String telf="";
        if (!TextTelM.getText().equals("")) {
            for (int i=0; i<TextTelM.getText().length(); i++) {
                if (i==4) i++;
                telf += TextTelM.getText().charAt(i);
            }
            TextTelM.setText(telf);
        }
    }//GEN-LAST:event_TextTelMFocusGained

    private void TextTelMFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextTelMFocusLost
        String telf="";
        if (!TextTelM.getText().equals("")) {
            if (TextTelM.getText().length() == 8) {
                for (int i=0; i<TextTelM.getText().length(); i++) {
                    telf += TextTelM.getText().charAt(i);
                    if (i==3) telf += "-";
                }
                TextTelM.setText(telf);
            }
            else {
                JOptionPane.showMessageDialog(null, "El número debe tener exactamente 8 dígitos.\nSin espacios, letras o caracteres.", "Error", JOptionPane.ERROR_MESSAGE);
                TextTelM.setText(""); TextTelM.requestFocus();
            }
        }
    }//GEN-LAST:event_TextTelMFocusLost

    public void ingresardatos(java.awt.event.ActionEvent e) {
        if (TextEmail.getText().equals(""))
            TextEmail.requestFocus();
        else if (TextTelM.getText().equals(""))
            TextTelM.requestFocus();
        else if (TextTelF.getText().equals(""))
            TextTelF.requestFocus();
        else if (TextBirth.getText().equals(""))
            TextBirth.requestFocus();
        else if (TextRegDate.getText().equals(""))
            TextRegDate.requestFocus();
        else if (TextName.getText().equals(""))
            TextName.requestFocus();
        if (TextName.getText().equals("") || TextRegDate.getText().equals("") ||
        TextBirth.getText().equals("") || TextTelF.getText().equals("") || TextTelM.getText().equals("") ||
        TextEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan datos por ingresar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else {
            String cate = ""+CbCat.getSelectedItem();
            String dir = ""+CbDir.getSelectedItem();
            if (md.AddContact(TextID.getText(), TextName.getText(), dir, TextRegDate.getText(), TextBirth.getText(), cate,
            TextTelF.getText(), TextTelM.getText(), TextEmail.getText()) == true) {
                JOptionPane.showMessageDialog(null, "Contacto registrado correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
                co.BloquearObjetosRegistrar(TextID, TextName, TextRegDate, TextBirth, TextTelF, TextTelM, TextEmail, ButtonBuscar, ButtonReg);
                co.LimpiarTextosRegistrar(TextID, TextName, CbDir, TextRegDate, TextBirth, CbCat, TextTelF, TextTelM, TextEmail);
            }
            else {
                JOptionPane.showMessageDialog(null, "El contacto no pudo ser registrado.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar_Contactos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBack;
    private javax.swing.JButton ButtonBuscar;
    private javax.swing.JButton ButtonClear;
    private javax.swing.JButton ButtonReg;
    private javax.swing.JComboBox<String> CbCat;
    private javax.swing.JComboBox<String> CbDir;
    private javax.swing.JComboBox<String> CbEstado;
    private javax.swing.JComboBox<String> CbPais;
    private javax.swing.JTextField TextBirth;
    private javax.swing.JTextField TextEmail;
    private javax.swing.JLabel TextFechaHoy;
    private javax.swing.JTextField TextID;
    private javax.swing.JTextField TextName;
    private javax.swing.JTextField TextRegDate;
    private javax.swing.JTextField TextTelF;
    private javax.swing.JTextField TextTelM;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
