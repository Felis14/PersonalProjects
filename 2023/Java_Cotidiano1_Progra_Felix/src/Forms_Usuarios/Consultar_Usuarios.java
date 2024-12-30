package Forms_Usuarios;

import Utilitario.*;
import Vista_Principal.*;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Consultar_Usuarios extends javax.swing.JFrame {

    ControlObjetos co = new ControlObjetos();
    Modelo_Datos md = new Modelo_Datos();
    Fecha_Sistema fs = new Fecha_Sistema();
    Combo_Box_Paises CbP = new Combo_Box_Paises();
    static Iniciar_Sesion is = new Iniciar_Sesion();
    
    public Consultar_Usuarios() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/IMAGENES/LOGOCOLEGIOACTUAL.png")).getImage());
        TextFechaHoy.setText("Fecha: "+fs.fecha());
    }
    
    static int userR=0, passR=0;

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
        ButtonBuscar = new javax.swing.JButton();
        ButtonClear = new javax.swing.JButton();
        TextName = new javax.swing.JTextField();
        TextID = new javax.swing.JTextField();
        TextUserLvl = new javax.swing.JTextField();
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
        TextPass = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consulta de Usuarios");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonMostrar.setBackground(new java.awt.Color(0, 66, 48));
        ButtonMostrar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/OjoBlanco.png"))); // NOI18N
        ButtonMostrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 165, 39)));
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

        jSeparator1.setForeground(new java.awt.Color(0, 165, 39));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 57, 479, 7));

        TextFechaHoy.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TextFechaHoy.setForeground(new java.awt.Color(255, 255, 255));
        TextFechaHoy.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TextFechaHoy.setText("Fecha: ");
        jPanel1.add(TextFechaHoy, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, -1));

        Title.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Consultar Usuarios");
        jPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 17, 267, -1));

        TextUsername.setBackground(new java.awt.Color(0, 66, 48));
        TextUsername.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextUsername.setForeground(new java.awt.Color(255, 255, 255));
        TextUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 165, 39)));
        TextUsername.setCaretColor(new java.awt.Color(255, 255, 255));
        TextUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextUsernameKeyTyped(evt);
            }
        });
        jPanel1.add(TextUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 150, 32));

        jSeparator2.setForeground(new java.awt.Color(0, 165, 39));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 479, 4));

        ButtonBuscar.setBackground(new java.awt.Color(0, 66, 48));
        ButtonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/busqueda (1).png"))); // NOI18N
        ButtonBuscar.setText("Buscar");
        ButtonBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 165, 39)));
        ButtonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonBuscar.setFocusPainted(false);
        ButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 100, 30));

        ButtonClear.setBackground(new java.awt.Color(0, 66, 48));
        ButtonClear.setForeground(new java.awt.Color(255, 255, 255));
        ButtonClear.setText("Limpiar");
        ButtonClear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 165, 39)));
        ButtonClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonClear.setFocusPainted(false);
        ButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonClearActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 120, 40));

        TextName.setEditable(false);
        TextName.setBackground(new java.awt.Color(0, 66, 48));
        TextName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextName.setForeground(new java.awt.Color(255, 255, 255));
        TextName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 165, 39)));
        TextName.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(TextName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 260, 32));

        TextID.setEditable(false);
        TextID.setBackground(new java.awt.Color(0, 66, 48));
        TextID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextID.setForeground(new java.awt.Color(255, 255, 255));
        TextID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 165, 39)));
        TextID.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(TextID, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 260, 32));

        TextUserLvl.setEditable(false);
        TextUserLvl.setBackground(new java.awt.Color(0, 66, 48));
        TextUserLvl.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextUserLvl.setForeground(new java.awt.Color(255, 255, 255));
        TextUserLvl.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextUserLvl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 165, 39)));
        TextUserLvl.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(TextUserLvl, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 260, 32));

        TextEmail.setEditable(false);
        TextEmail.setBackground(new java.awt.Color(0, 66, 48));
        TextEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextEmail.setForeground(new java.awt.Color(255, 255, 255));
        TextEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 165, 39)));
        TextEmail.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(TextEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 260, 32));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
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

        TextRegDate.setEditable(false);
        TextRegDate.setBackground(new java.awt.Color(0, 66, 48));
        TextRegDate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextRegDate.setForeground(new java.awt.Color(255, 255, 255));
        TextRegDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextRegDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 165, 39)));
        TextRegDate.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(TextRegDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 260, 32));

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Contraseña");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 160, 32));

        ButtonBack.setBackground(new java.awt.Color(0, 66, 48));
        ButtonBack.setForeground(new java.awt.Color(255, 255, 255));
        ButtonBack.setText("Regresar");
        ButtonBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 165, 39)));
        ButtonBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonBack.setFocusPainted(false);
        ButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBackActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 120, 40));

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Correo");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 160, 32));

        TextPass.setEditable(false);
        TextPass.setBackground(new java.awt.Color(0, 66, 48));
        TextPass.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextPass.setForeground(new java.awt.Color(255, 255, 255));
        TextPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 165, 39)));
        TextPass.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(TextPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 260, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos_Usuarios/Usuarios_Consultar.png"))); // NOI18N
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

    private void ButtonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMostrarActionPerformed
        if (ButtonMostrar.isSelected() == true) {
            if (JOptionPane.showInputDialog(null, "Para mostrar la contraseña del usuario, digite su contraseña de aministrador:", "", JOptionPane.PLAIN_MESSAGE).equals(is.pPass)) {
                TextPass.setEchoChar((char)0);
                ButtonMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/OjoCerradoBlanco.png")));
                TextPass.requestFocus();
            }
            else {
                JOptionPane.showMessageDialog(null, "La contraseña no será mostrada.", "Error", JOptionPane.PLAIN_MESSAGE);
                TextPass.setEchoChar('•');
                ButtonMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/OjoBlanco.png")));
                ButtonMostrar.setSelected(false);
            }
        }
        else {
            TextPass.setEchoChar('•');
            ButtonMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/OjoBlanco.png")));
            TextPass.requestFocus();
        }
    }//GEN-LAST:event_ButtonMostrarActionPerformed

    private void ButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBuscarActionPerformed
        if (md.buscarusername(TextUsername.getText()) == 1) {
            md.MostrarDatosU(TextUsername.getText(), TextPass, TextName, TextID, TextEmail, TextUserLvl, TextRegDate);
        }
        else {
            JOptionPane.showMessageDialog(null, "No existe ningún usuario bajo ese nombre de usuario.", "Estado", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_ButtonBuscarActionPerformed

    private void TextUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextUsernameKeyTyped
        char k = evt.getKeyChar();
        if (k == KeyEvent.VK_ENTER) {
            ButtonBuscar.doClick();
        }
    }//GEN-LAST:event_TextUsernameKeyTyped
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultar_Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBack;
    private javax.swing.JButton ButtonBuscar;
    private javax.swing.JButton ButtonClear;
    private javax.swing.JToggleButton ButtonMostrar;
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
