package Reportes_Bitacoras;

import Vista_Principal.Menu_Principal;
import Utilitario.Fecha_Sistema;
import Utilitario.Modelo_Datos;
import Utilitario.ControlObjetos;
import Utilitario.Combo_Box_Fechas;
import java.util.Date;
import javax.swing.ImageIcon;

public class Bitacoras_Fecha extends javax.swing.JFrame {

    Fecha_Sistema fs = new Fecha_Sistema();
    Modelo_Datos md = new Modelo_Datos();
    ControlObjetos co = new ControlObjetos();
    Combo_Box_Fechas cbf = new Combo_Box_Fechas();
    Date f = new Date();
    
    public Bitacoras_Fecha() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/IMAGENES/LOGOCOLEGIOACTUAL.png")).getImage());
        jLabel2.setText("" + jLabel2.getText() + fs.fecha());
        cbf.d31(jComboBox2); cbf.d31(jComboBox4);
        CargarAnios();
    }
    
    public void CargarAnios() {
        int yyyy = f.getYear()+1900;
        int Pyyyy = yyyy-80;
        
        while (Pyyyy <= yyyy) {
            jComboBox3.addItem(""+Pyyyy);
            jComboBox6.addItem(""+Pyyyy);
            Pyyyy++;
        }
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
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reporte de Contactos");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(0, 86, 102));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Número de Cambio", "Fecha", "Usuario", "Descripción"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setSelectionBackground(new java.awt.Color(172, 249, 255));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 92, 920, 367));

        jButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton1.setText("Regresar");
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
        jLabel1.setText("Registro de Cambios por fecha");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 5, -1, 40));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 122, 23));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Desde:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 47, -1, 29));

        jButton2.setBackground(new java.awt.Color(0, 52, 71));
        jButton2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Limpiar");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 198, 165)));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 15, 104, -1));

        jButton3.setBackground(new java.awt.Color(0, 52, 71));
        jButton3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Buscar");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 198, 165)));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 51, 104, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Hasta:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 47, 80, 29));

        jComboBox1.setBackground(new java.awt.Color(0, 52, 71));
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 198, 165)));
        jComboBox1.setLightWeightPopupEnabled(false);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 48, 50, 32));

        jComboBox2.setBackground(new java.awt.Color(0, 52, 71));
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 198, 165)));
        jComboBox2.setLightWeightPopupEnabled(false);
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 48, 50, 32));

        jComboBox3.setBackground(new java.awt.Color(0, 52, 71));
        jComboBox3.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 198, 165)));
        jComboBox3.setLightWeightPopupEnabled(false);
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 48, 56, 32));

        jComboBox4.setBackground(new java.awt.Color(0, 52, 71));
        jComboBox4.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 198, 165)));
        jComboBox4.setLightWeightPopupEnabled(false);
        getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 47, 50, 32));

        jComboBox5.setBackground(new java.awt.Color(0, 52, 71));
        jComboBox5.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jComboBox5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 198, 165)));
        jComboBox5.setLightWeightPopupEnabled(false);
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 47, 50, 32));

        jComboBox6.setBackground(new java.awt.Color(0, 52, 71));
        jComboBox6.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 198, 165)));
        jComboBox6.setLightWeightPopupEnabled(false);
        getContentPane().add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 47, 56, 32));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos_Reportes/Reporte_Contacto_Registro.png"))); // NOI18N
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu_Principal mp = new Menu_Principal();
        mp.show(); this.hide(); this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Bitacoras_Fecha nw = new Bitacoras_Fecha();
        nw.show(); this.hide(); this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String fecha1, fecha2;
        fecha1 = jComboBox2.getSelectedItem()+"/"+jComboBox1.getSelectedItem()+"/"+jComboBox3.getSelectedItem();
        fecha2 = jComboBox4.getSelectedItem()+"/"+jComboBox5.getSelectedItem()+"/"+jComboBox6.getSelectedItem();
        System.out.println(fecha1+"  /  "+fecha2);
        md.CargarTablaBitacoraFecha(jTable1, fecha1, fecha2);
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

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        jComboBox4.removeAllItems();
        if (jComboBox5.getSelectedItem().equals("1") ||
        jComboBox5.getSelectedItem().equals("3") ||
        jComboBox5.getSelectedItem().equals("5") ||
        jComboBox5.getSelectedItem().equals("7") ||
        jComboBox5.getSelectedItem().equals("8") ||
        jComboBox5.getSelectedItem().equals("10") ||
        jComboBox5.getSelectedItem().equals("12")) {
            cbf.d31(jComboBox4);
        }
        else if ( jComboBox1.getSelectedItem().equals("4") ||
        jComboBox5.getSelectedItem().equals("6") ||
        jComboBox5.getSelectedItem().equals("9") ||
        jComboBox5.getSelectedItem().equals("11")) {
            cbf.d30(jComboBox4);
        }
        else
            cbf.d28(jComboBox4);
    }//GEN-LAST:event_jComboBox5ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bitacoras_Fecha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
