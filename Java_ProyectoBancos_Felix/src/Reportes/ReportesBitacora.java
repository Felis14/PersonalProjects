package Reportes;

import Control_Objetos.Control_Objetos_Clientes;
import Modelos.Modelo_Reportes;
import Vista_Principal.MenuPrincipal;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ReportesBitacora extends javax.swing.JFrame {
    
    Control_Objetos_Clientes cocl = new Control_Objetos_Clientes();
    Modelo_Reportes mrc = new Modelo_Reportes();
    
    //Control de filtros
    static int f1, f2, f3;
    static String ini1="%", ini2="%";
    static String query = "Select * from Bitacora";
    static String aux = "";

    public ReportesBitacora() {
        initComponents();
        jScrollPane1.getViewport().setBackground(new java.awt.Color(0,28,56));
        Date1.getEditor().setBackground(new java.awt.Color(0, 98, 152));
        Date2.getEditor().setBackground(new java.awt.Color(0, 98, 152));
        Date1.setFormats(new String[]{"dd-MM-yyyy"});
        Date2.setFormats(new String[]{"dd-MM-yyyy"});
        BloquearTodo();
        System.out.println(query);
        mrc.CargarTablaBit(jTable1, query);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ButtonAct = new javax.swing.JButton();
        Date2 = new org.jdesktop.swingx.JXDatePicker();
        Date1 = new org.jdesktop.swingx.JXDatePicker();
        TogFecha = new javax.swing.JToggleButton();
        TogUser = new javax.swing.JToggleButton();
        TogCambio = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        TextCambio = new javax.swing.JTextField();
        TextUser = new javax.swing.JTextField();
        IniUser = new javax.swing.JToggleButton();
        IniCambio = new javax.swing.JToggleButton();
        BotonRegresar2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bancos Felits - Reporte de Bitácora");

        jPanel1.setBackground(new java.awt.Color(0, 28, 56));

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));

        jTable1.setBackground(new java.awt.Color(0, 28, 56));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Número de Movimiento", "Fecha", "Usuario", "Cambio Realizado"
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
        jTable1.setSelectionBackground(new java.awt.Color(204, 204, 255));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reporte de Bitácora");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha: ");

        ButtonAct.setBackground(new java.awt.Color(0, 74, 114));
        ButtonAct.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        ButtonAct.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/White_MenuBar.png"))); // NOI18N
        ButtonAct.setText("Actualizar Tabla");
        ButtonAct.setFocusPainted(false);
        ButtonAct.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        ButtonAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActActionPerformed(evt);
            }
        });

        Date2.setForeground(new java.awt.Color(255, 255, 255));

        Date1.setForeground(new java.awt.Color(255, 255, 255));

        TogFecha.setBackground(new java.awt.Color(0, 98, 152));
        TogFecha.setForeground(new java.awt.Color(255, 255, 255));
        TogFecha.setFocusPainted(false);
        TogFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TogFechaActionPerformed(evt);
            }
        });

        TogUser.setBackground(new java.awt.Color(0, 98, 152));
        TogUser.setForeground(new java.awt.Color(255, 255, 255));
        TogUser.setFocusPainted(false);
        TogUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TogUserActionPerformed(evt);
            }
        });

        TogCambio.setBackground(new java.awt.Color(0, 98, 152));
        TogCambio.setForeground(new java.awt.Color(255, 255, 255));
        TogCambio.setFocusPainted(false);
        TogCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TogCambioActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Filtros:");

        TextCambio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextCambio.setBackground(new java.awt.Color(0, 74, 114));
        TextCambio.setForeground(new java.awt.Color(255, 255, 255));
        TextCambio.setMaximumSize(new java.awt.Dimension(64, 22));

        TextUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextUser.setBackground(new java.awt.Color(0, 74, 114));
        TextUser.setForeground(new java.awt.Color(255, 255, 255));
        TextUser.setMaximumSize(new java.awt.Dimension(64, 22));

        IniUser.setBackground(new java.awt.Color(0, 98, 152));
        IniUser.setForeground(new java.awt.Color(255, 255, 255));
        IniUser.setToolTipText("Si está activa, busca solo que empiece con:");
        IniUser.setFocusPainted(false);
        IniUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniUserActionPerformed(evt);
            }
        });

        IniCambio.setBackground(new java.awt.Color(0, 98, 152));
        IniCambio.setForeground(new java.awt.Color(255, 255, 255));
        IniCambio.setToolTipText("Si está activa, busca solo que empiece con:");
        IniCambio.setFocusPainted(false);
        IniCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniCambioActionPerformed(evt);
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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 919, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(ButtonAct)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TogFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(192, 192, 192)
                                .addComponent(TogUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(190, 190, 190)
                                .addComponent(TogCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Date1, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(Date2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(IniUser, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextUser, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(IniCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotonRegresar2)
                        .addGap(237, 237, 237)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonRegresar2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ButtonAct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TogFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TogUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TogCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Date1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(IniCambio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(IniUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TextCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextUser, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Date2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TogFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TogFechaActionPerformed
        if (TogFecha.isSelected() == true) {
            Date1.setEnabled(true);
            Date2.setEnabled(true);
            f1 = 1;
        } else {
            Date1.setEnabled(false);
            Date2.setEnabled(false);
            f1 = 0;
        }
    }//GEN-LAST:event_TogFechaActionPerformed

    private void TogUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TogUserActionPerformed
        if (TogUser.isSelected() == true) {
            TextUser.setEditable(true);
            IniUser.setEnabled(true);
            f2 = 1;
        } else {
            TextUser.setEditable(false);
            TextUser.setText("");
            IniUser.setEnabled(false);
            IniUser.setSelected(false);
            f2 = 0;
            ini1 = "%";
        }
    }//GEN-LAST:event_TogUserActionPerformed

    private void TogCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TogCambioActionPerformed
        if (TogCambio.isSelected() == true) {
            TextCambio.setEditable(true);
            IniCambio.setEnabled(true);
            f3 = 1;
        } else {
            TextCambio.setEditable(false);
            TextCambio.setText("");
            IniCambio.setEnabled(false);
            IniCambio.setSelected(false);
            f3 = 0;
            ini2 = "%";
        }
    }//GEN-LAST:event_TogCambioActionPerformed

    private void ButtonActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonActActionPerformed
        if ((f1 == 1 && (Date1.getEditor().getText().isBlank() || Date2.getEditor().getText().isBlank())) ||
        (f2 == 1 && TextUser.getText().isBlank()) ||
        (f3 == 1 && TextCambio.getText().isBlank())) {
            JOptionPane.showMessageDialog(null, "Faltan datos por completar", "Error de Solicitud", JOptionPane.WARNING_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            int rows = model.getRowCount();
            for (int i = rows-1; i >= 0; i--) {
                model.removeRow(i);
            }

            for (int i = 0; i < 4; i++)
                mrc.AgregarNuevaFilaBit(jTable1);
            ConstruirQuery();
            System.out.println("Enviando el query "+query);
            mrc.CargarTablaBit(jTable1, query);
        }
    }//GEN-LAST:event_ButtonActActionPerformed

    private void IniUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniUserActionPerformed
        if (IniUser.isSelected() == true)
            ini1 = "";
        else
            ini1 = "%";
    }//GEN-LAST:event_IniUserActionPerformed

    private void IniCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniCambioActionPerformed
        if (IniCambio.isSelected() == true)
            ini2 = "";
        else
            ini2 = "%";
    }//GEN-LAST:event_IniCambioActionPerformed

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

    void ConstruirQuery() {
        
        if (f1 == 1) {
            if (Date1.getEditor().getText().compareTo(Date2.getEditor().getText()) > 0) {
                aux = Date2.getEditor().getText();
                Date2.getEditor().setText(Date1.getEditor().getText());
                Date1.getEditor().setText(aux);
            }
        }
        
        if (f1 == 1 || f2 == 1 || f3 == 1)
            query = "Select * from Bitacora where NumMov between 0 AND 9999999999";
        else
            query = "Select * from Bitacora";
        if (f1 == 1)
            query += " AND FechaMov between '"+cocl.DBFecha(Date1.getEditor().getText())+"' AND '"+cocl.DBFecha(Date2.getEditor().getText())+"'";
        if (f2 == 1)
            query += " AND Username like '"+ini1+TextUser.getText()+"%'";
        if (f3 == 1)
            query += " AND Cambio like '"+ini2+TextCambio.getText()+"%'";
    }
    
    void BloquearTodo() {
        Date1.setEnabled(false);
        Date2.setEnabled(false);
        TextUser.setEditable(false);
        TextCambio.setEditable(false);
        IniUser.setEnabled(false);
        IniCambio.setEnabled(false);
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportesBitacora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonRegresar2;
    private javax.swing.JButton ButtonAct;
    private org.jdesktop.swingx.JXDatePicker Date1;
    private org.jdesktop.swingx.JXDatePicker Date2;
    private javax.swing.JToggleButton IniCambio;
    private javax.swing.JToggleButton IniUser;
    private javax.swing.JTextField TextCambio;
    private javax.swing.JTextField TextUser;
    private javax.swing.JToggleButton TogCambio;
    private javax.swing.JToggleButton TogFecha;
    private javax.swing.JToggleButton TogUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
