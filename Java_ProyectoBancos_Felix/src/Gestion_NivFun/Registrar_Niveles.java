package Gestion_NivFun;

import Modelos.Modelo_Datos_Niv;
import Modelos.Modelo_Bitacoras;
import Control_Objetos.Control_Objetos_Clientes;
import Utilitario_Validaciones.Fecha_Sistema;
import Vista_Principal.MenuPrincipal;
import javax.swing.JOptionPane;
import Utilitario_Validaciones.Validaciones;

public class Registrar_Niveles extends javax.swing.JFrame {
    
    Modelo_Bitacoras mb = new Modelo_Bitacoras();
    Control_Objetos_Clientes cocl = new Control_Objetos_Clientes();
    Fecha_Sistema fs = new Fecha_Sistema();
    Modelo_Datos_Niv mdn = new Modelo_Datos_Niv();
    Validaciones V = new Validaciones();
    
    public Registrar_Niveles() {
        initComponents();
        mdn.CargarCbNiveles(CbNivs);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BotonRegresar1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        TextNiv = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CbNivs = new javax.swing.JComboBox<>();
        BotonSig = new javax.swing.JButton();
        BotonBuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        TextName = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bancos Felits - Registro de Niveles");

        jPanel1.setBackground(new java.awt.Color(0, 28, 56));

        BotonRegresar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/ArrowBack.png"))); // NOI18N
        BotonRegresar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRegresar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonRegresar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonRegresar1MouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro de Niveles");

        jSeparator1.setForeground(new java.awt.Color(0, 98, 152));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Código Nivel:");

        TextNiv.setBackground(new java.awt.Color(0, 74, 114));
        TextNiv.setForeground(new java.awt.Color(255, 255, 255));
        TextNiv.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextNiv.setCaretColor(new java.awt.Color(255, 255, 255));
        TextNiv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextNivKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Niveles Registrados:");

        CbNivs.setBackground(new java.awt.Color(0, 74, 114));
        CbNivs.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CbNivs.setForeground(new java.awt.Color(255, 255, 255));

        BotonSig.setBackground(new java.awt.Color(0, 98, 152));
        BotonSig.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
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
        TextName.setCaretColor(new java.awt.Color(255, 255, 255));

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
                .addGap(80, 80, 80)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(77, 77, 77))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                        .addComponent(CbNivs, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TextNiv, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonSig, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BotonRegresar1)
                        .addGap(108, 108, 108)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonRegresar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(CbNivs))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TextNiv)
                    .addComponent(BotonSig, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(BotonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TextName)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
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
        if (String.valueOf(mdn.SigNumDispo()).length() == 1)
            TextNiv.setText("0"+mdn.SigNumDispo());
        else
            TextNiv.setText(""+mdn.SigNumDispo());
    }//GEN-LAST:event_BotonSigActionPerformed

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        if (TextNiv.getText().isBlank() == true)
            JOptionPane.showMessageDialog(null, "No ha digitado ningun código.", "Error", JOptionPane.ERROR_MESSAGE);
        else
            BuscarNiv(evt);
    }//GEN-LAST:event_BotonBuscarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        RegNiv(evt);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BotonRegresar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegresar1MouseEntered
        BotonRegresar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/ArrowBackHover.png")));
    }//GEN-LAST:event_BotonRegresar1MouseEntered

    private void BotonRegresar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegresar1MouseExited
        BotonRegresar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/ArrowBack.png")));
    }//GEN-LAST:event_BotonRegresar1MouseExited

    private void BotonRegresar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegresar1MouseClicked
        Vista_Principal.MenuPrincipal nw = new MenuPrincipal();
        nw.show(); this.hide(); this.dispose();
    }//GEN-LAST:event_BotonRegresar1MouseClicked

    private void TextNivKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextNivKeyTyped
        V.soloNumeros(evt);
    }//GEN-LAST:event_TextNivKeyTyped

    void BuscarNiv(java.awt.event.ActionEvent evt) {
        if (TextNiv.getText().isBlank() == true) {
            JOptionPane.showMessageDialog(null, "Faltan datos por ingresar.", "Error de Solicitud", JOptionPane.WARNING_MESSAGE);
        } else {
            if (mdn.BuscarNiv(TextNiv.getText()) == 0) {
                JOptionPane.showMessageDialog(null, "El nivel puede ser registrado.", "Solicitud aceptada", JOptionPane.PLAIN_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "El nivel ya está registrado.");
            }
        }
    }
    
    void RegNiv(java.awt.event.ActionEvent evt) {
        if (TextNiv.getText().isBlank() == true || TextName.getText().isBlank() == true)
            JOptionPane.showMessageDialog(null, "Faltan datos por ingresar.", "Error de Solicitud", JOptionPane.WARNING_MESSAGE);
        else {
            mdn.IngresarNiv(TextNiv.getText(), TextName.getText());
            JOptionPane.showMessageDialog(null, "El nivel "+TextName.getText()+" fue ingresado correctamente");
            mb.IngresarBitacora(cocl.DBFecha(fs.fecha()), Vista_Principal.Iniciar_Sesion.pUser, "El usuario registró el nivel "+TextName.getText());
            Limpiar();
        }
    }
    
    void Limpiar() {
        if (CbNivs.getItemCount() > 0) {
            try {
                    CbNivs.removeAllItems();
                } catch (Exception e) {
                    System.out.println(e);
                }
        }
        TextNiv.setText("");
        TextName.setText("");
        mdn.CargarCbNiveles(CbNivs);
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar_Niveles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JLabel BotonRegresar1;
    private javax.swing.JButton BotonSig;
    private javax.swing.JComboBox<String> CbNivs;
    private javax.swing.JTextField TextName;
    private javax.swing.JTextField TextNiv;
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
