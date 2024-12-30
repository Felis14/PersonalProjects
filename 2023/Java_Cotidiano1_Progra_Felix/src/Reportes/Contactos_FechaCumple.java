package Reportes;

import Vista_Principal.Menu_Principal;
import Utilitario.Fecha_Sistema;
import Utilitario.Modelo_Datos;
import Utilitario.ControlObjetos;
import Utilitario.Combo_Box_Fechas;
import java.util.Date;
import javax.swing.ImageIcon;

public class Contactos_FechaCumple extends javax.swing.JFrame {

    Fecha_Sistema fs = new Fecha_Sistema();
    Modelo_Datos md = new Modelo_Datos();
    ControlObjetos co = new ControlObjetos();
    Combo_Box_Fechas cbf = new Combo_Box_Fechas();
    Date f = new Date();
    
    public Contactos_FechaCumple() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/IMAGENES/LOGOCOLEGIOACTUAL.png")).getImage());
        jLabel2.setText("" + jLabel2.getText() + fs.fecha());
        cbf.d31(jComboBox2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reporte de Contactos");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(102, 0, 102));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Identificación", "Nombre", "Dirección", "Fecha Registro", "Fecha Nacimiento", "Categoría", "Teléfono Casa", "Teléfono Móvil", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setSelectionBackground(new java.awt.Color(239, 153, 255));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 92, 920, 367));

        jButton1.setBackground(new java.awt.Color(67, 0, 71));
        jButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Regresar");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(141, 0, 198)));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 487, 120, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reporte de Contactos por Cumpleaños");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 6, -1, 35));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 122, 23));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Fecha:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 53, -1, 29));

        jButton2.setBackground(new java.awt.Color(67, 0, 71));
        jButton2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Limpiar");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(141, 0, 198)));
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(756, 15, 104, -1));

        jButton3.setBackground(new java.awt.Color(67, 0, 71));
        jButton3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Buscar");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(141, 0, 198)));
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(756, 53, 104, -1));

        jComboBox1.setBackground(new java.awt.Color(67, 0, 71));
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(141, 0, 198)));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 54, 50, 32));

        jComboBox2.setBackground(new java.awt.Color(67, 0, 71));
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(141, 0, 198)));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 54, 50, 32));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos_Reportes/Reporte_Contacto_Cumple.png"))); // NOI18N
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu_Principal mp = new Menu_Principal();
        mp.show(); this.hide(); this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Contactos_FechaCumple nw = new Contactos_FechaCumple();
        nw.show(); this.hide(); this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String fecha1 = jComboBox2.getSelectedItem()+"/"+jComboBox1.getSelectedItem()+"/";
        System.out.println(fecha1);
        md.CargarTablaClientesPorFechaCumple(jTable1, fecha1);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        jComboBox2.removeAllItems();
        if (jComboBox1.getSelectedItem().equals("1") ||
        jComboBox1.getSelectedItem().equals("3") ||
        jComboBox1.getSelectedItem().equals("5") ||
        jComboBox1.getSelectedItem().equals("7") ||
        jComboBox1.getSelectedItem().equals("8") ||
        jComboBox1.getSelectedItem().equals("10") ||
        jComboBox1.getSelectedItem().equals("12")) {
            cbf.d31(jComboBox2);
        }
        else if ( jComboBox1.getSelectedItem().equals("4") ||
        jComboBox1.getSelectedItem().equals("6") ||
        jComboBox1.getSelectedItem().equals("9") ||
        jComboBox1.getSelectedItem().equals("11")) {
            cbf.d30(jComboBox2);
        }
        else
            cbf.d28(jComboBox2);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contactos_FechaCumple().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
