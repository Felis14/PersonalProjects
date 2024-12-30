package Gestion_NivFun;

import Modelos.Modelo_Datos_Fun;
import Modelos.Modelo_Bitacoras;
import Control_Objetos.Control_Objetos_Clientes;
import Utilitario_Validaciones.Fecha_Sistema;
import Vista_Principal.MenuPrincipal;
import javax.swing.JOptionPane;
import Utilitario_Validaciones.Validaciones;

public class Registrar_Funciones extends javax.swing.JFrame {
    
    Modelo_Datos_Fun mdf = new Modelo_Datos_Fun();
    Modelo_Bitacoras mb = new Modelo_Bitacoras();
    Control_Objetos_Clientes cocl = new Control_Objetos_Clientes();
    Fecha_Sistema fs = new Fecha_Sistema();
    Validaciones V = new Validaciones();
    
    public Registrar_Funciones() {
        initComponents();
        mdf.CargarCbFuns(CbFuns);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        TextFun = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CbFuns = new javax.swing.JComboBox<>();
        BotonSig = new javax.swing.JButton();
        BotonBuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        TextName = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        BotonRegresar2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bancos Felits - Registro de Funciones");

        jPanel1.setBackground(new java.awt.Color(0, 28, 56));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro de Funciones");

        jSeparator1.setForeground(new java.awt.Color(0, 98, 152));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Código Función:");

        TextFun.setBackground(new java.awt.Color(0, 74, 114));
        TextFun.setForeground(new java.awt.Color(255, 255, 255));
        TextFun.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextFun.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextFunKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Funciones Registradas:");

        CbFuns.setBackground(new java.awt.Color(0, 74, 114));
        CbFuns.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CbFuns.setForeground(new java.awt.Color(255, 255, 255));

        BotonSig.setBackground(new java.awt.Color(0, 98, 152));
        BotonSig.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BotonSig.setForeground(new java.awt.Color(255, 255, 255));
        BotonSig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/White_Add.png"))); // NOI18N
        BotonSig.setToolTipText("Provee el siguien número mínimo disponible.");
        BotonSig.setFocusPainted(false);
        BotonSig.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonSig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSigActionPerformed(evt);
            }
        });

        BotonBuscar.setBackground(new java.awt.Color(0, 98, 152));
        BotonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        BotonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/White_Lens.png"))); // NOI18N
        BotonBuscar.setFocusPainted(false);
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nombre:");

        TextName.setBackground(new java.awt.Color(0, 74, 114));
        TextName.setForeground(new java.awt.Color(255, 255, 255));
        TextName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jSeparator2.setForeground(new java.awt.Color(0, 98, 152));

        jButton1.setBackground(new java.awt.Color(0, 98, 152));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/White_TrashCan.png"))); // NOI18N
        jButton1.setText("Limpiar");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton1.setIconTextGap(0);

        jButton2.setBackground(new java.awt.Color(0, 98, 152));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/White_Register.png"))); // NOI18N
        jButton2.setText("Registrar");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton2.setIconTextGap(0);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BotonRegresar2)
                        .addGap(93, 93, 93)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CbFuns, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TextFun, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonSig, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(77, 77, 77))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonRegresar2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(CbFuns))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TextFun)
                    .addComponent(BotonSig, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(BotonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TextName)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSigActionPerformed
        if (String.valueOf(mdf.SigNumDispo()).length() == 1)
            TextFun.setText("0"+mdf.SigNumDispo());
        else
            TextFun.setText(""+mdf.SigNumDispo());
    }//GEN-LAST:event_BotonSigActionPerformed

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        if (TextFun.getText().equals(""))
            JOptionPane.showMessageDialog(null, "No ha digitado ningun código.", "Error", JOptionPane.ERROR_MESSAGE);
        else
            BuscarFun(evt);
    }//GEN-LAST:event_BotonBuscarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        RegNiv(evt);
    }//GEN-LAST:event_jButton2ActionPerformed

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

    private void TextFunKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFunKeyTyped
        V.soloNumeros(evt);
    }//GEN-LAST:event_TextFunKeyTyped

    void RegNiv(java.awt.event.ActionEvent evt) {
        if (TextFun.getText().isBlank() == true || TextName.getText().isBlank() == true)
            JOptionPane.showMessageDialog(null, "Faltan datos por ingresar.", "Error de Solicitud", JOptionPane.WARNING_MESSAGE);
        else {
            mdf.IngresarFun(TextFun.getText(), TextName.getText());
            JOptionPane.showMessageDialog(null, "La función "+TextName.getText()+" fue ingresado correctamente");
            mb.IngresarBitacora(cocl.DBFecha(fs.fecha()), Vista_Principal.Iniciar_Sesion.pUser, "El usuario registró la función "+TextName.getText());
            Limpiar();
        }
    }
    
    void BuscarFun(java.awt.event.ActionEvent evt) {
        if (TextFun.getText().isBlank() == true) {
            JOptionPane.showMessageDialog(null, "Faltan datos por ingresar.", "Error de Solicitud", JOptionPane.WARNING_MESSAGE);
        } else {
            if (mdf.BuscarFun(TextFun.getText()) == 0) {
                JOptionPane.showMessageDialog(null, "La función puede ser registrada.", "Solicitud aceptada", JOptionPane.PLAIN_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "La función ya está registrada.");
            }
        }
    }
    
    void Limpiar() {
        if (CbFuns.getItemCount() > 0) {
            try {
                    CbFuns.removeAllItems();
                } catch (Exception e) {
                    System.out.println(e);
                }
        }
        TextFun.setText("");
        TextName.setText("");
        mdf.CargarCbFuns(CbFuns);
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar_Funciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JLabel BotonRegresar2;
    private javax.swing.JButton BotonSig;
    private javax.swing.JComboBox<String> CbFuns;
    private javax.swing.JTextField TextFun;
    private javax.swing.JTextField TextName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
