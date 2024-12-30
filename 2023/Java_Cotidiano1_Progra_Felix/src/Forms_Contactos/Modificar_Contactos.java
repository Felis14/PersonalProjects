package Forms_Contactos;

import Utilitario.*;
import Vista_Principal.*;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Modificar_Contactos extends javax.swing.JFrame {

    ControlObjetos co = new ControlObjetos();
    Modelo_Datos md = new Modelo_Datos();
    Fecha_Sistema fs = new Fecha_Sistema();
    Validaciones V = new Validaciones();
    static Iniciar_Sesion is = new Iniciar_Sesion();
    
    public Modificar_Contactos() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/IMAGENES/LOGOCOLEGIOACTUAL.png")).getImage());
        TextFechaHoy.setText("Fecha: "+fs.fecha());
        md.CargarCbContactos(CbContactos);
        co.CargarCbCategoria(CbCat);
        co.BloquearObjetosRegistrar(TextID, TextName, TextRegDate, TextBirth, TextTelF, TextTelM, TextEmail, ButtonBuscar, ButtonMod);
        CbContactos.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Title = new javax.swing.JLabel();
        TextID = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        ButtonBuscar = new javax.swing.JButton();
        ButtonClear = new javax.swing.JButton();
        TextEmail = new javax.swing.JTextField();
        TextOldDir = new javax.swing.JTextField();
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
        CbDir = new javax.swing.JComboBox<>();
        TextName = new javax.swing.JTextField();
        ButtonMod = new javax.swing.JButton();
        ButtonBack = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        CbContactos = new javax.swing.JComboBox<>();
        CbCat = new javax.swing.JComboBox<>();
        TextOldCat = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TextFechaHoy = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modificación de Contactos");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/LOGOCOLEGIOACTUAL.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 50, -1));

        jSeparator1.setForeground(new java.awt.Color(59, 0, 176));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 57, 479, 7));

        Title.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Modificar Contactos");
        jPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 17, 267, -1));

        TextID.setBackground(new java.awt.Color(62, 0, 102));
        TextID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextID.setForeground(new java.awt.Color(255, 255, 255));
        TextID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 0, 151)));
        TextID.setCaretColor(new java.awt.Color(255, 255, 255));
        TextID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextIDKeyTyped(evt);
            }
        });
        jPanel1.add(TextID, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 150, 32));

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 17)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Contactos Registrados");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 160, 32));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Correo");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 160, 32));

        jSeparator2.setForeground(new java.awt.Color(59, 0, 176));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 479, 4));

        ButtonBuscar.setBackground(new java.awt.Color(62, 0, 102));
        ButtonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/busqueda (1).png"))); // NOI18N
        ButtonBuscar.setText("Buscar");
        ButtonBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 0, 151)));
        ButtonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonBuscar.setFocusPainted(false);
        ButtonBuscar.setIconTextGap(1);
        ButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 100, 30));

        ButtonClear.setBackground(new java.awt.Color(62, 0, 102));
        ButtonClear.setForeground(new java.awt.Color(255, 255, 255));
        ButtonClear.setText("Limpiar");
        ButtonClear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 0, 151)));
        ButtonClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonClear.setFocusPainted(false);
        ButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonClearActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 610, 120, 40));

        TextEmail.setBackground(new java.awt.Color(62, 0, 102));
        TextEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextEmail.setForeground(new java.awt.Color(255, 255, 255));
        TextEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 0, 151)));
        TextEmail.setCaretColor(new java.awt.Color(255, 255, 255));
        TextEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextEmailKeyTyped(evt);
            }
        });
        jPanel1.add(TextEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 260, 32));

        TextOldDir.setEditable(false);
        TextOldDir.setBackground(new java.awt.Color(62, 0, 102));
        TextOldDir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextOldDir.setForeground(new java.awt.Color(255, 255, 255));
        TextOldDir.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextOldDir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 0, 151)));
        jPanel1.add(TextOldDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 120, 32));

        TextRegDate.setBackground(new java.awt.Color(62, 0, 102));
        TextRegDate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextRegDate.setForeground(new java.awt.Color(255, 255, 255));
        TextRegDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextRegDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 0, 151)));
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

        TextBirth.setBackground(new java.awt.Color(62, 0, 102));
        TextBirth.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextBirth.setForeground(new java.awt.Color(255, 255, 255));
        TextBirth.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextBirth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 0, 151)));
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

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Nueva:");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 60, 30));

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Teléfono fijo");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 160, 32));

        TextTelF.setBackground(new java.awt.Color(62, 0, 102));
        TextTelF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextTelF.setForeground(new java.awt.Color(255, 255, 255));
        TextTelF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextTelF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 0, 151)));
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

        TextTelM.setBackground(new java.awt.Color(62, 0, 102));
        TextTelM.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextTelM.setForeground(new java.awt.Color(255, 255, 255));
        TextTelM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextTelM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 0, 151)));
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

        CbDir.setBackground(new java.awt.Color(62, 0, 102));
        CbDir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CbDir.setForeground(new java.awt.Color(255, 255, 255));
        CbDir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "San José", "Alajuela", "Cartago", "Heredia", "Guanacaste", "Puntarenas", "Limón" }));
        CbDir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 0, 151)));
        CbDir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CbDirKeyPressed(evt);
            }
        });
        jPanel1.add(CbDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 130, 30));

        TextName.setBackground(new java.awt.Color(62, 0, 102));
        TextName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextName.setForeground(new java.awt.Color(255, 255, 255));
        TextName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 0, 151)));
        TextName.setCaretColor(new java.awt.Color(255, 255, 255));
        TextName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextNameKeyTyped(evt);
            }
        });
        jPanel1.add(TextName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 260, 32));

        ButtonMod.setBackground(new java.awt.Color(62, 0, 102));
        ButtonMod.setForeground(new java.awt.Color(255, 255, 255));
        ButtonMod.setText("Modificar");
        ButtonMod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 0, 151)));
        ButtonMod.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonMod.setFocusPainted(false);
        ButtonMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonModActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 610, 120, 40));

        ButtonBack.setBackground(new java.awt.Color(62, 0, 102));
        ButtonBack.setForeground(new java.awt.Color(255, 255, 255));
        ButtonBack.setText("Regresar");
        ButtonBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 0, 151)));
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

        CbContactos.setBackground(new java.awt.Color(62, 0, 102));
        CbContactos.setForeground(new java.awt.Color(255, 255, 255));
        CbContactos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 0, 151)));
        CbContactos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbContactosActionPerformed(evt);
            }
        });
        jPanel1.add(CbContactos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 540, 260, 30));

        CbCat.setBackground(new java.awt.Color(62, 0, 102));
        CbCat.setForeground(new java.awt.Color(255, 255, 255));
        CbCat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 0, 151)));
        CbCat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CbCatKeyTyped(evt);
            }
        });
        jPanel1.add(CbCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 130, 30));

        TextOldCat.setEditable(false);
        TextOldCat.setBackground(new java.awt.Color(62, 0, 102));
        TextOldCat.setForeground(new java.awt.Color(255, 255, 255));
        TextOldCat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 0, 151)));
        jPanel1.add(TextOldCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 100, 30));

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Categoría");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 160, 32));

        TextFechaHoy.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TextFechaHoy.setForeground(new java.awt.Color(255, 255, 255));
        TextFechaHoy.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TextFechaHoy.setText("Fecha: ");
        jPanel1.add(TextFechaHoy, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, -1));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos_Contactos/Contactos_Modificar.png"))); // NOI18N
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 660));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonClearActionPerformed
        co.LimpiarTextosRegistrar(TextID, TextName, CbDir, TextRegDate, TextBirth, CbCat, TextTelF, TextTelM, TextEmail);
        TextOldCat.setText("");
        CbCat.setSelectedIndex(0);
        CbDir.setSelectedIndex(0);
        co.BloquearObjetosRegistrar(TextID, TextName, TextRegDate, TextBirth, TextTelF, TextTelM, TextEmail, ButtonBuscar, ButtonMod);
        CbContactos.setEnabled(true);
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
                JOptionPane.showMessageDialog(null, "Se mostrarán los datos del contacto a modificar.", "Estado", JOptionPane.INFORMATION_MESSAGE);
                md.MostrarDatos(TextID.getText(), TextName, TextOldDir, TextRegDate, TextBirth, TextOldCat, TextTelF, TextTelM, TextEmail); 
                co.DesbloquearObjetosRegistrar(TextID, TextName, TextRegDate, TextBirth, TextTelF, TextTelM, TextEmail, ButtonBuscar, ButtonMod);
                CbContactos.setEnabled(false);
                
               
                String id=TextID.getText(), contactoID="", contacto = "";
                for (int i=0; i<CbContactos.getItemCount(); i++) {
                    CbContactos.setSelectedIndex(i);
                    contacto = ""+CbContactos.getSelectedItem();
                    contactoID = "";
                    for (int j=0; i<CbContactos.getItemAt(i).length(); j++) {
                        if (contacto.charAt(j) != ' ') {
                            contactoID += CbContactos.getItemAt(i).charAt(j);
                        }
                        else
                            break;
                    }
                    if (contactoID.equals(id)) {
                        CbContactos.setSelectedIndex(i);
                        break;
                    }
                }
                
                switch(TextOldCat.getText()) {
                    case "Personal": {
                        CbCat.setSelectedIndex(0);
                    } break;
                    case "Compañero": {
                        CbCat.setSelectedIndex(1);
                    } break;
                    case "Trabajo": {
                        CbCat.setSelectedIndex(2);
                    } break;
                    case "Confidencial": {
                        CbCat.setSelectedIndex(3);
                    }
                }
                switch(TextOldDir.getText()) {
                    case "San José": {
                        CbCat.setSelectedIndex(0);
                    } break;
                    case "Alajuela": {
                        CbCat.setSelectedIndex(1);
                    } break;
                    case "Cartago": {
                        CbCat.setSelectedIndex(2);
                    } break;
                    case "Heredia": {
                        CbCat.setSelectedIndex(3);
                    } break;
                    case "Guanacaste": {
                        CbCat.setSelectedIndex(4);
                    } break;
                    case "Puntarenas": {
                        CbCat.setSelectedIndex(5);
                    } break;
                    case "Limón": {
                        CbCat.setSelectedIndex(6);
                    } break;
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "El contacto no está registrado.", "Estado", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        co.DesbloquearObjetosRegistrar(TextID, TextName, TextRegDate, TextBirth, TextTelF, TextTelM, TextEmail, ButtonBuscar, ButtonMod);
    }//GEN-LAST:event_ButtonBuscarActionPerformed

    private void CbContactosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbContactosActionPerformed
        String contacto = ""+CbContactos.getSelectedItem();
        String contactID = "";
        int i=0;
        do {
            if (contacto.charAt(i) == '0' || contacto.charAt(i) == '1' || contacto.charAt(i) == '2' || contacto.charAt(i) == '3' || contacto.charAt(i) == '4' || contacto.charAt(i) == '5' || contacto.charAt(i) == '6' || contacto.charAt(i) == '7' || contacto.charAt(i) == '8' || contacto.charAt(i) == '9')
                contactID += ""+contacto.charAt(i);
            i++;
        } while (contacto.charAt(i) != ' ');
        TextID.setText(""+contactID);
        //TextID.setText(""+CbContactos.getSelectedItem());
    }//GEN-LAST:event_CbContactosActionPerformed

    private void ButtonModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonModActionPerformed
        if (TextEmail.getText().equals("")) TextEmail.requestFocus();
        else if (TextTelM.getText().equals("")) TextTelM.requestFocus();
        else if (TextTelF.getText().equals("")) TextTelF.requestFocus();
        else if (TextBirth.getText().equals("")) TextBirth.requestFocus();
        else if (TextRegDate.getText().equals("")) TextRegDate.requestFocus();
        else if (TextOldDir.getText().equals("")) TextOldDir.requestFocus();
        else if (TextName.getText().equals("")) TextName.requestFocus();
        
        if (TextName.getText().equals("") || TextOldDir.getText().equals("") ||
            TextRegDate.getText().equals("")  || TextBirth.getText().equals("") ||
            TextTelF.getText().equals("") || TextTelM.getText().equals("") || TextEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan datos por ingresar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else {
            TextID.requestFocus();
            if (md.ModificarContacto(TextID.getText(), TextName.getText(), ""+CbDir.getSelectedItem(), TextRegDate.getText(), TextBirth.getText(), ""+CbCat.getSelectedItem(), TextTelF.getText(), TextTelM.getText(), TextEmail.getText()) == true) {
                JOptionPane.showMessageDialog(null, "Cliente modificado correctamente.", "Estado", JOptionPane.INFORMATION_MESSAGE);
                md.IngresarBitacora(fs.fecha(), is.pUser, "Modificación del contacto N°"+TextID.getText()+" - "+TextName.getText());
                TextOldCat.setText(""+CbCat.getSelectedItem());
                TextOldDir.setText(""+CbDir.getSelectedItem());
            }
            else {
                JOptionPane.showMessageDialog(null, "El cliente no pudo ser modificado.", "Estado", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_ButtonModActionPerformed

    private void CbDirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CbDirKeyPressed
        char k = evt.getKeyChar();
        if (k == KeyEvent.VK_ENTER)
            TextRegDate.requestFocus();
    }//GEN-LAST:event_CbDirKeyPressed

    private void TextIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextIDKeyTyped
        V.solonumeros(evt);
        
        char k = evt.getKeyChar();
        if (k == KeyEvent.VK_ENTER)
            ButtonBuscar.doClick();
    }//GEN-LAST:event_TextIDKeyTyped

    private void TextNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextNameKeyTyped
        V.sololetras(evt);
        
        char k = evt.getKeyChar();
        if (k == KeyEvent.VK_ENTER)
            CbDir.requestFocus();
    }//GEN-LAST:event_TextNameKeyTyped

    private void TextRegDateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextRegDateFocusGained
        String fecha=""; 
        String fechaA="";
        
        if (TextRegDate.getText().length() == 8) {
            if (TextRegDate.getText().charAt(0) != 0) {
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
        else if (TextRegDate.getText().length() == 9) {
            if (TextRegDate.getText().charAt(1) == '/') {
                fecha += "0";
                for (int i=0; i<TextRegDate.getText().length(); i++) {
                    if (TextRegDate.getText().charAt(i) == '/') i++;
                    fecha += TextRegDate.getText().charAt(i);
                }
            }
            else {
                for (int i=0; i<TextRegDate.getText().length(); i++) {
                    if (i == 2) { fecha+="0"; i++;}
                    if (TextRegDate.getText().charAt(i) == '/') i++;
                    fecha += TextRegDate.getText().charAt(i);
                }
            }
            TextRegDate.setText(fecha);
        }
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
        
        if (TextRegDate.getText().equals("")) {}
        else {
            if (TextRegDate.getText().length() == 8) {
                for (int i=0; i<TextRegDate.getText().length(); i++) {
                    if (i==2 || i==4)
                        fecha += "/";
                    fecha += TextRegDate.getText().charAt(i);
                }
                TextRegDate.setText(fecha);
                if (fecha.charAt(0) == '0') {
                    for (int i=1; i<fecha.length(); i++) {
                        fechaA += fecha.charAt(i);
                    }
                    TextRegDate.setText(fechaA);
                    fecha="";
                    if (fechaA.charAt(2) == '0') {
                        for (int i=0; i<fechaA.length(); i++) {
                            if (i == 2) i++;
                            fecha += fechaA.charAt(i);
                        }
                        TextRegDate.setText(fecha);
                    }
                }
                else {
                    if (fecha.charAt(3) == '0') {
                        for (int i=0; i<fecha.length(); i++) {
                            if (i == 3) i++;
                            fechaA += fecha.charAt(i);
                        }
                        TextRegDate.setText(fechaA);
                    }
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Digite una fecha correcta\nEscriba: DDMMAAAA\nNo digite espacios, letras o caracteres.", "Error", JOptionPane.ERROR_MESSAGE);
                TextRegDate.setText("");
                TextRegDate.requestFocus();
            }
        }
    }//GEN-LAST:event_TextRegDateFocusLost

    private void TextRegDateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextRegDateKeyTyped
        V.solonumerosfecha(evt);
        
        char k = evt.getKeyChar();
        if (k == KeyEvent.VK_ENTER)
            TextBirth.requestFocus();
    }//GEN-LAST:event_TextRegDateKeyTyped

    private void TextBirthFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextBirthFocusGained
        String fecha=""; 
        String fechaA="";
        
        if (TextBirth.getText().length() == 8) {
            if (TextBirth.getText().charAt(0) != 0) {
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
        else if (TextBirth.getText().length() == 9) {
            if (TextBirth.getText().charAt(1) == '/') {
                fecha += "0";
                for (int i=0; i<TextBirth.getText().length(); i++) {
                    if (TextBirth.getText().charAt(i) == '/') i++;
                    fecha += TextBirth.getText().charAt(i);
                }
            }
            else {
                for (int i=0; i<TextBirth.getText().length(); i++) {
                    if (i == 2) { fecha+="0"; i++;}
                    if (TextBirth.getText().charAt(i) == '/') i++;
                    fecha += TextBirth.getText().charAt(i);
                }
            }
            TextBirth.setText(fecha);
        }
        else {
            for (int i=0; i<TextBirth.getText().length(); i++) {
                if (TextBirth.getText().charAt(i) == '/') i++;
                fecha += TextBirth.getText().charAt(i);
            }
            TextBirth.setText(fecha);
        }
    }//GEN-LAST:event_TextBirthFocusGained

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

    private void TextBirthKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextBirthKeyTyped
        V.solonumerosfecha(evt);
        
        char k = evt.getKeyChar();
        if (k == KeyEvent.VK_ENTER)
            CbCat.requestFocus();
    }//GEN-LAST:event_TextBirthKeyTyped

    private void CbCatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CbCatKeyTyped
        char k = evt.getKeyChar();
        if (k == KeyEvent.VK_ENTER)
            TextTelF.requestFocus();
    }//GEN-LAST:event_CbCatKeyTyped

    private void TextTelFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextTelFKeyTyped
        V.solonumeros(evt);
        
        char k = evt.getKeyChar();
        if (k == KeyEvent.VK_ENTER)
            TextTelM.requestFocus();
    }//GEN-LAST:event_TextTelFKeyTyped

    private void TextTelMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextTelMKeyTyped
        V.solonumeros(evt);
        
        char k = evt.getKeyChar();
        if (k == KeyEvent.VK_ENTER)
            TextEmail.requestFocus();
    }//GEN-LAST:event_TextTelMKeyTyped

    private void TextTelFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextTelFFocusGained
        String telf="";
        if (!TextTelF.getText().equals("")) {
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
                TextTelF.setText(""); TextTelF.requestFocus();
            }
        }
    }//GEN-LAST:event_TextTelMFocusLost

    private void TextEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextEmailKeyTyped
        V.noEspacios(evt);
        
        char k = evt.getKeyChar();
        if (k == KeyEvent.VK_ENTER)
            ButtonMod.doClick();
    }//GEN-LAST:event_TextEmailKeyTyped
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultar_Contactos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBack;
    private javax.swing.JButton ButtonBuscar;
    private javax.swing.JButton ButtonClear;
    private javax.swing.JButton ButtonMod;
    private javax.swing.JComboBox<String> CbCat;
    private javax.swing.JComboBox<String> CbContactos;
    private javax.swing.JComboBox<String> CbDir;
    private javax.swing.JTextField TextBirth;
    private javax.swing.JTextField TextEmail;
    private javax.swing.JLabel TextFechaHoy;
    private javax.swing.JTextField TextID;
    private javax.swing.JTextField TextName;
    private javax.swing.JTextField TextOldCat;
    private javax.swing.JTextField TextOldDir;
    private javax.swing.JTextField TextRegDate;
    private javax.swing.JTextField TextTelF;
    private javax.swing.JTextField TextTelM;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
