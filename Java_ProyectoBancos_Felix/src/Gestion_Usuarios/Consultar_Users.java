package Gestion_Usuarios;

import Control_Objetos.Control_Objetos_Users;
import Modelos.Modelo_Datos_Users;
import Modelos.Modelo_Datos_Niv;
import Vista_Principal.MenuPrincipal;
import javax.swing.JOptionPane;

public class Consultar_Users extends javax.swing.JFrame {
    
    Control_Objetos_Users cou = new Control_Objetos_Users();
    Modelo_Datos_Users mdu = new Modelo_Datos_Users();
    Modelo_Datos_Niv mdn = new Modelo_Datos_Niv();

    static int userR = 0, passR = 0;
    
    public Consultar_Users() {
        initComponents();
        mdu.CargarCbUsers(CbUsers);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BotonRegresar2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TextUser = new javax.swing.JTextField();
        TextName = new javax.swing.JTextField();
        TextPass = new javax.swing.JPasswordField();
        TextID = new javax.swing.JTextField();
        TogContra = new javax.swing.JToggleButton();
        jSeparator2 = new javax.swing.JSeparator();
        BotonLimp = new javax.swing.JButton();
        TextNiv = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        CbUsers = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        TextEstado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Banco Felits - Consulta de Usuarios");

        jPanel1.setBackground(new java.awt.Color(0, 28, 56));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consultar Usuarios");

        BotonRegresar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/ArrowBack.png"))); // NOI18N
        BotonRegresar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRegresar2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonRegresar2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonRegresar2MouseExited(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 98, 152));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nombre de Usuario:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Contraseña:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nivel:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Identificación:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Nombre Completo:");

        TextUser.setBackground(new java.awt.Color(0, 74, 114));
        TextUser.setForeground(new java.awt.Color(255, 255, 255));
        TextUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextUser.setCaretColor(new java.awt.Color(255, 255, 255));

        TextName.setEditable(false);
        TextName.setBackground(new java.awt.Color(0, 74, 114));
        TextName.setForeground(new java.awt.Color(255, 255, 255));
        TextName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextName.setCaretColor(new java.awt.Color(255, 255, 255));

        TextPass.setEditable(false);
        TextPass.setBackground(new java.awt.Color(0, 74, 114));
        TextPass.setForeground(new java.awt.Color(255, 255, 255));
        TextPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextPass.setCaretColor(new java.awt.Color(255, 255, 255));

        TextID.setEditable(false);
        TextID.setBackground(new java.awt.Color(0, 74, 114));
        TextID.setForeground(new java.awt.Color(255, 255, 255));
        TextID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextID.setCaretColor(new java.awt.Color(255, 255, 255));

        TogContra.setBackground(new java.awt.Color(0, 98, 152));
        TogContra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/OjoBlanco.png"))); // NOI18N
        TogContra.setToolTipText("Mostrar / Ocultar contraseña");
        TogContra.setFocusPainted(false);
        TogContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TogContraActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 98, 152));

        BotonLimp.setBackground(new java.awt.Color(0, 98, 152));
        BotonLimp.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        BotonLimp.setForeground(new java.awt.Color(255, 255, 255));
        BotonLimp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/White_TrashCan.png"))); // NOI18N
        BotonLimp.setText("Limpiar");
        BotonLimp.setFocusPainted(false);
        BotonLimp.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BotonLimp.setIconTextGap(0);
        BotonLimp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLimpActionPerformed(evt);
            }
        });

        TextNiv.setEditable(false);
        TextNiv.setBackground(new java.awt.Color(0, 74, 114));
        TextNiv.setForeground(new java.awt.Color(255, 255, 255));
        TextNiv.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextNiv.setCaretColor(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(0, 98, 152));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/White_Lens.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Usuarios Registrados:");

        CbUsers.setBackground(new java.awt.Color(0, 74, 114));
        CbUsers.setForeground(new java.awt.Color(255, 255, 255));
        CbUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbUsersActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Estado:");

        TextEstado.setEditable(false);
        TextEstado.setBackground(new java.awt.Color(0, 74, 114));
        TextEstado.setForeground(new java.awt.Color(255, 255, 255));
        TextEstado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextEstado.setCaretColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonRegresar2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(130, 130, 130))
            .addComponent(jSeparator1)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonLimp, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 4, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextNiv, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TextUser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CbUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TogContra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TextName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                    .addComponent(TextPass, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextID, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonRegresar2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                            .addComponent(CbUsers))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextUser, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TogContra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextPass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextNiv, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextID, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonLimp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotonLimpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLimpActionPerformed
        cou.LimpiarConsultar(CbUsers, TextUser, TextPass, TextName, TextNiv, TextID, TextEstado);
        TogContra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/OjoBlanco.png")));
        TogContra.setSelected(false);
        userR = 0; passR = 0;
        TextUser.requestFocus();
    }//GEN-LAST:event_BotonLimpActionPerformed

    private void TogContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TogContraActionPerformed
        if (TogContra.isSelected() == true) { System.out.println(Vista_Principal.Iniciar_Sesion.pPass);
            if (JOptionPane.showInputDialog(null, "Para mostrar la contraseña del usuario, digite su contraseña de administrador:",
            "", JOptionPane.PLAIN_MESSAGE).equals(Vista_Principal.Iniciar_Sesion.pPass)) {
                TextPass.setEchoChar((char)0);
                TogContra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/OjoCerradoBlanco.png")));
                TextPass.requestFocus();
            }
            else {
                JOptionPane.showMessageDialog(null, "La contraseña no será mostrada.", "Error", JOptionPane.PLAIN_MESSAGE);
                TextPass.setEchoChar('•');
                TogContra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/OjoBlanco.png")));
                TogContra.setSelected(false);
            }
        }
        else {
            TextPass.setEchoChar('•');
            TogContra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/OjoBlanco.png")));
            TextPass.requestFocus();
        }
    }//GEN-LAST:event_TogContraActionPerformed

    private void CbUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbUsersActionPerformed
        TextUser.setText(""+CbUsers.getSelectedItem());
    }//GEN-LAST:event_CbUsersActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if ((TextUser.getText().equals(""))) {
            TextUser.setText(""+CbUsers.getSelectedItem());
        }
        if (mdu.buscarusername(TextUser.getText()) == 1) {
            String user = TextUser.getText();
            for (int i=0; i<CbUsers.getItemCount(); i++) {
                CbUsers.setSelectedIndex(i);
                if (user.equals(""+CbUsers.getSelectedItem())) {
                    break;
                }
            }
            mdu.MostrarDatos(TextUser.getText(), TextPass, TextName, TextNiv, TextID, TextEstado);
        } else {
            JOptionPane.showMessageDialog(null, "El cliente no está registrado.", "Estado", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BotonRegresar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegresar2MouseClicked
        Vista_Principal.MenuPrincipal nw = new MenuPrincipal();
        nw.show(); this.hide(); this.dispose();
    }//GEN-LAST:event_BotonRegresar2MouseClicked

    private void BotonRegresar2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegresar2MouseEntered
        BotonRegresar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/ArrowBackHover.png")));
    }//GEN-LAST:event_BotonRegresar2MouseEntered

    private void BotonRegresar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegresar2MouseExited
        BotonRegresar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/ArrowBack.png")));
    }//GEN-LAST:event_BotonRegresar2MouseExited

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultar_Users().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonLimp;
    private javax.swing.JLabel BotonRegresar2;
    private javax.swing.JComboBox<String> CbUsers;
    private javax.swing.JTextField TextEstado;
    private javax.swing.JTextField TextID;
    private javax.swing.JTextField TextName;
    private javax.swing.JTextField TextNiv;
    private javax.swing.JPasswordField TextPass;
    private javax.swing.JTextField TextUser;
    private javax.swing.JToggleButton TogContra;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
