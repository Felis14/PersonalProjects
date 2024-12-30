package Reportes;

import Control_Objetos.Control_Objetos_Clientes;
import Modelos.Modelo_Reportes;
import Vista_Principal.MenuPrincipal;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ReportesCuentas extends javax.swing.JFrame {
    
    Control_Objetos_Clientes cocl = new Control_Objetos_Clientes();
    Modelo_Reportes mrc = new Modelo_Reportes();
    
    //Control de filtros
    static int f1, f2, f3, f4, f5, f6, f7;
    static String query = "Select * from Cuentas";
    static String aux = "";

    public ReportesCuentas() {
        initComponents();
        jScrollPane1.getViewport().setBackground(new java.awt.Color(0,28,56));
        Date1.getEditor().setBackground(new java.awt.Color(0, 98, 152));
        Date2.getEditor().setBackground(new java.awt.Color(0, 98, 152));
        Date1.setFormats(new String[]{"dd-MM-yyyy"});
        Date2.setFormats(new String[]{"dd-MM-yyyy"});
        BloquearTodo();
        mrc.CargarTablaCuentas(jTable1, query);
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
        TogFechaAp = new javax.swing.JToggleButton();
        CbTipCu = new javax.swing.JComboBox<>();
        CbTipMo = new javax.swing.JComboBox<>();
        TogTipCu = new javax.swing.JToggleButton();
        TogTipMo = new javax.swing.JToggleButton();
        TextSaldo2 = new javax.swing.JTextField();
        TextSaldo1 = new javax.swing.JTextField();
        TogSaldo = new javax.swing.JToggleButton();
        TextID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TextMonto2 = new javax.swing.JTextField();
        TextMonto1 = new javax.swing.JTextField();
        TogID = new javax.swing.JToggleButton();
        TogMontoAp = new javax.swing.JToggleButton();
        CbEstado = new javax.swing.JComboBox<>();
        TogEstado = new javax.swing.JToggleButton();
        BotonRegresar2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bancos Felits - Reporte de Cuentas");

        jPanel1.setBackground(new java.awt.Color(0, 28, 56));

        jTable1.setBackground(new java.awt.Color(0, 28, 56));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Numero Cuenta", "Fecha Apertura", "Tipo Cuenta", "Tipo Moneda", "Saldo", "ID de Dueño", "Monto Apertura", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
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
        jLabel1.setText("Reporte de Cuentas");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha: ");

        ButtonAct.setBackground(new java.awt.Color(0, 98, 152));
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

        TogFechaAp.setBackground(new java.awt.Color(0, 98, 152));
        TogFechaAp.setForeground(new java.awt.Color(255, 255, 255));
        TogFechaAp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/White_Add.png"))); // NOI18N
        TogFechaAp.setFocusPainted(false);
        TogFechaAp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TogFechaApActionPerformed(evt);
            }
        });

        CbTipCu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Corriente", "Ahorro" }));
        CbTipCu.setBackground(new java.awt.Color(0, 74, 114));
        CbTipCu.setForeground(new java.awt.Color(255, 255, 255));

        CbTipMo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Colones", "Dólares" }));
        CbTipMo.setBackground(new java.awt.Color(0, 74, 114));
        CbTipMo.setForeground(new java.awt.Color(255, 255, 255));

        TogTipCu.setBackground(new java.awt.Color(0, 98, 152));
        TogTipCu.setForeground(new java.awt.Color(255, 255, 255));
        TogTipCu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/White_Add.png"))); // NOI18N
        TogTipCu.setFocusPainted(false);
        TogTipCu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TogTipCuActionPerformed(evt);
            }
        });

        TogTipMo.setBackground(new java.awt.Color(0, 98, 152));
        TogTipMo.setForeground(new java.awt.Color(255, 255, 255));
        TogTipMo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/White_Add.png"))); // NOI18N
        TogTipMo.setFocusPainted(false);
        TogTipMo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TogTipMoActionPerformed(evt);
            }
        });

        TextSaldo2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextSaldo2.setBackground(new java.awt.Color(0, 74, 114));
        TextSaldo2.setCaretColor(new java.awt.Color(255, 255, 255));
        TextSaldo2.setForeground(new java.awt.Color(255, 255, 255));
        TextSaldo2.setMaximumSize(new java.awt.Dimension(64, 22));

        TextSaldo1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextSaldo1.setBackground(new java.awt.Color(0, 74, 114));
        TextSaldo1.setCaretColor(new java.awt.Color(255, 255, 255));
        TextSaldo1.setForeground(new java.awt.Color(255, 255, 255));
        TextSaldo1.setMaximumSize(new java.awt.Dimension(64, 22));

        TogSaldo.setBackground(new java.awt.Color(0, 98, 152));
        TogSaldo.setForeground(new java.awt.Color(255, 255, 255));
        TogSaldo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/White_Add.png"))); // NOI18N
        TogSaldo.setFocusPainted(false);
        TogSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TogSaldoActionPerformed(evt);
            }
        });

        TextID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextID.setBackground(new java.awt.Color(0, 74, 114));
        TextID.setCaretColor(new java.awt.Color(255, 255, 255));
        TextID.setForeground(new java.awt.Color(255, 255, 255));
        TextID.setMaximumSize(new java.awt.Dimension(64, 22));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Filtros:");

        TextMonto2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextMonto2.setBackground(new java.awt.Color(0, 74, 114));
        TextMonto2.setCaretColor(new java.awt.Color(255, 255, 255));
        TextMonto2.setForeground(new java.awt.Color(255, 255, 255));
        TextMonto2.setMaximumSize(new java.awt.Dimension(64, 22));

        TextMonto1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextMonto1.setBackground(new java.awt.Color(0, 74, 114));
        TextMonto1.setCaretColor(new java.awt.Color(255, 255, 255));
        TextMonto1.setForeground(new java.awt.Color(255, 255, 255));
        TextMonto1.setMaximumSize(new java.awt.Dimension(64, 22));

        TogID.setBackground(new java.awt.Color(0, 98, 152));
        TogID.setForeground(new java.awt.Color(255, 255, 255));
        TogID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/White_Add.png"))); // NOI18N
        TogID.setFocusPainted(false);
        TogID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TogIDActionPerformed(evt);
            }
        });

        TogMontoAp.setBackground(new java.awt.Color(0, 98, 152));
        TogMontoAp.setForeground(new java.awt.Color(255, 255, 255));
        TogMontoAp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/White_Add.png"))); // NOI18N
        TogMontoAp.setFocusPainted(false);
        TogMontoAp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TogMontoApActionPerformed(evt);
            }
        });

        CbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activa", "Inactiva" }));
        CbEstado.setBackground(new java.awt.Color(0, 74, 114));
        CbEstado.setForeground(new java.awt.Color(255, 255, 255));

        TogEstado.setBackground(new java.awt.Color(0, 98, 152));
        TogEstado.setForeground(new java.awt.Color(255, 255, 255));
        TogEstado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/White_Add.png"))); // NOI18N
        TogEstado.setFocusPainted(false);
        TogEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TogEstadoActionPerformed(evt);
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 919, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(TogFechaAp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(79, 79, 79)
                                        .addComponent(TogTipCu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(73, 73, 73)
                                        .addComponent(TogTipMo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(77, 77, 77)
                                        .addComponent(TogSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(74, 74, 74)
                                        .addComponent(TogID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(76, 76, 76)
                                        .addComponent(TogMontoAp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TogEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(120, 120, 120)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Date2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Date1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CbTipCu, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(BotonRegresar2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(CbTipMo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(TextSaldo2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(TextID, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(TextMonto2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(TextSaldo1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(TextMonto1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
                    .addComponent(TogFechaAp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TogTipCu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TogTipMo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TogSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TogID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TogMontoAp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TogEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextSaldo1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextMonto1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Date1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbTipCu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbTipMo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextSaldo2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextMonto2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void TogFechaApActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TogFechaApActionPerformed
        if (TogFechaAp.isSelected() == true) {
            Date1.setEnabled(true);
            Date2.setEnabled(true);
            f1 = 1;
        } else {
            Date1.setEnabled(false);
            Date2.setEnabled(false);
            Date1.getEditor().setText("");
            Date2.getEditor().setText("");
            f1 = 0;
        }
    }//GEN-LAST:event_TogFechaApActionPerformed

    private void TogTipCuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TogTipCuActionPerformed
        if (TogTipCu.isSelected() == true) {
            CbTipCu.setEnabled(true);
            f2 = 1;
        } else {
            CbTipCu.setEnabled(false);
            CbTipCu.setSelectedIndex(0);
            f2 = 0;
        }
    }//GEN-LAST:event_TogTipCuActionPerformed

    private void TogTipMoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TogTipMoActionPerformed
        if (TogTipMo.isSelected() == true) {
            CbTipMo.setEnabled(true);
            f3 = 1;
        } else {
            CbTipMo.setEnabled(false);
            CbTipMo.setSelectedIndex(0);
            f3 = 0;
        }
    }//GEN-LAST:event_TogTipMoActionPerformed

    private void TogSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TogSaldoActionPerformed
        if (TogSaldo.isSelected() == true) {
            TextSaldo1.setEditable(true);
            TextSaldo2.setEditable(true);
            f4 = 1;
        } else {
            TextSaldo1.setEditable(false);
            TextSaldo2.setEditable(false);
            TextSaldo1.setText("");
            TextSaldo2.setText("");
            f4 = 0;
        }
    }//GEN-LAST:event_TogSaldoActionPerformed

    private void TogIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TogIDActionPerformed
        if (TogID.isSelected() == true) {
            TextID.setEditable(true);
            f5 = 1;
        } else {
            TextID.setEditable(false);
            TextID.setText("");
            f5 = 0;
        }
    }//GEN-LAST:event_TogIDActionPerformed

    private void TogMontoApActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TogMontoApActionPerformed
        if (TogMontoAp.isSelected() == true) {
            TextMonto1.setEditable(true);
            TextMonto2.setEditable(true);
            f6 = 1;
        } else {
            TextMonto1.setEditable(false);
            TextMonto2.setEditable(false);
            TextMonto1.setText("");
            TextMonto2.setText("");
            f6 = 0;
        }
    }//GEN-LAST:event_TogMontoApActionPerformed

    private void TogEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TogEstadoActionPerformed
        if (TogEstado.isSelected() == true) {
            CbEstado.setEnabled(true);
            f7 = 1;
        } else {
            CbEstado.setEnabled(false);
            CbEstado.setSelectedIndex(0);
            f7 = 0;
        }
    }//GEN-LAST:event_TogEstadoActionPerformed

    private void ButtonActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonActActionPerformed
        if ((f1 == 1 && (Date1.getEditor().getText().isBlank() || Date2.getEditor().getText().isBlank())) ||
        (f4 == 1 && (TextSaldo1.getText().isBlank() || TextSaldo2.getText().isBlank())) ||
        (f5 == 1 && (TextID.getText().isBlank() || TextID.getText().equals("0"))) ||
        (f6 == 1 && (TextMonto1.getText().isBlank() || TextMonto2.getText().isBlank()))) {
            JOptionPane.showMessageDialog(null, "Faltan datos por completar", "Error de Solicitud", JOptionPane.WARNING_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            int rows = model.getRowCount();
            for (int i = rows-1; i >= 0; i--) {
                model.removeRow(i);
            }

            for (int i = 0; i < 4; i++)
                mrc.AgregarNuevaFilaCuentas(jTable1);
            ConstruirQuery();
            System.out.println("Enviando el query "+query);
            mrc.CargarTablaCuentas(jTable1, query);
        }
    }//GEN-LAST:event_ButtonActActionPerformed

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
        
        if (f4 == 1) {
            if (Integer.valueOf(TextSaldo1.getText()) > Integer.valueOf(TextSaldo2.getText())) {
                aux = TextSaldo2.getText();
                TextSaldo2.setText(TextSaldo1.getText());
                TextSaldo1.setText(aux);
            }
        }
        
        if (f6 == 1) {
            if (Integer.valueOf(TextMonto1.getText()) > Integer.valueOf(TextMonto2.getText())) {
                aux = TextMonto2.getText();
                TextMonto2.setText(TextMonto1.getText());
                TextMonto1.setText(aux);
            }
        }
        
        if (f1 == 1 || f2 == 1 || f3 == 1 || f4 == 1 || f5 == 1 || f6 == 1 || f7 == 1)
            query = "Select * from Cuentas where Numero between 0 AND 9999999999";
        else
            query = "Select * from Cuentas";
        if (f1 == 1)
            query += " AND FechaAp between '"+cocl.DBFecha(Date1.getEditor().getText())+"' AND '"+cocl.DBFecha(Date2.getEditor().getText())+"'";
        if (f2 == 1)
            query += " AND TCuenta = '"+CbTipCu.getSelectedItem()+"'";
        if (f3 == 1)
            query += " AND TMoneda = '"+CbTipMo.getSelectedItem()+"'";
        if (f4 == 1)
            query += " AND Saldo between "+TextSaldo1.getText()+" AND "+TextSaldo2.getText();
        if (f5 == 1)
            query += " AND ID = '"+TextID.getText()+"'";
        if (f6 == 1)
            query += " AND MontoAp between "+TextMonto1.getText()+" AND "+TextMonto2.getText();
        if (f7 == 1)
            query += " AND Estado = '"+CbEstado.getSelectedItem()+"'";
    }
    
    void BloquearTodo() {
        Date1.setEnabled(false);
        Date2.setEnabled(false);
        CbTipCu.setEnabled(false);
        CbTipMo.setEnabled(false);
        TextSaldo1.setEditable(false);
        TextSaldo2.setEditable(false);
        TextID.setEditable(false);
        TextMonto1.setEditable(false);
        TextMonto2.setEditable(false);
        CbEstado.setEnabled(false);
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportesCuentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonRegresar2;
    private javax.swing.JButton ButtonAct;
    private javax.swing.JComboBox<String> CbEstado;
    private javax.swing.JComboBox<String> CbTipCu;
    private javax.swing.JComboBox<String> CbTipMo;
    private org.jdesktop.swingx.JXDatePicker Date1;
    private org.jdesktop.swingx.JXDatePicker Date2;
    private javax.swing.JTextField TextID;
    private javax.swing.JTextField TextMonto1;
    private javax.swing.JTextField TextMonto2;
    private javax.swing.JTextField TextSaldo1;
    private javax.swing.JTextField TextSaldo2;
    private javax.swing.JToggleButton TogEstado;
    private javax.swing.JToggleButton TogFechaAp;
    private javax.swing.JToggleButton TogID;
    private javax.swing.JToggleButton TogMontoAp;
    private javax.swing.JToggleButton TogSaldo;
    private javax.swing.JToggleButton TogTipCu;
    private javax.swing.JToggleButton TogTipMo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
