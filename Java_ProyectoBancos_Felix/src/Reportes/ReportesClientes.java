package Reportes;

import Control_Objetos.Control_Objetos_Clientes;
import Modelos.Modelo_Reportes;
import Vista_Principal.MenuPrincipal;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ReportesClientes extends javax.swing.JFrame {
    
    Control_Objetos_Clientes cocl = new Control_Objetos_Clientes();
    Modelo_Reportes mrc = new Modelo_Reportes();
    
    //Control de filtros
    static int f1, f2, f3, f4, f5;
    static String ini1="%", ini2="%", ini3="%", ini4="%";
    static String query = "Select * from Clientes";
    static String aux = "";

    public ReportesClientes() {
        initComponents();
        jScrollPane1.getViewport().setBackground(new java.awt.Color(0,28,56));
        Date1.getEditor().setBackground(new java.awt.Color(0, 98, 152));
        Date2.getEditor().setBackground(new java.awt.Color(0, 98, 152));
        Date1.setFormats(new String[]{"dd-MM-yyyy"});
        Date2.setFormats(new String[]{"dd-MM-yyyy"});
        BloquearTodo();
        System.out.println(query);
        mrc.CargarTablaClientes(jTable1, query);
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
        TogNom = new javax.swing.JToggleButton();
        TogTel = new javax.swing.JToggleButton();
        TogDir = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        TextEmail = new javax.swing.JTextField();
        TogEmail = new javax.swing.JToggleButton();
        TogFecha = new javax.swing.JToggleButton();
        TextDir = new javax.swing.JTextField();
        TextTel = new javax.swing.JTextField();
        TextNom = new javax.swing.JTextField();
        IniNom = new javax.swing.JToggleButton();
        IniTel = new javax.swing.JToggleButton();
        IniDir = new javax.swing.JToggleButton();
        IniEmail = new javax.swing.JToggleButton();
        BotonRegresar2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bancos Felits - Reporte de Clientes");

        jPanel1.setBackground(new java.awt.Color(0, 28, 56));

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));

        jTable1.setBackground(new java.awt.Color(0, 28, 56));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Identificación", "Nombre", "Teléfono", "Dirección", "Email", "Fecha de Registro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
        jLabel1.setText("Reporte de Clientes");

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

        TogNom.setBackground(new java.awt.Color(0, 98, 152));
        TogNom.setForeground(new java.awt.Color(255, 255, 255));
        TogNom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/White_Add.png"))); // NOI18N
        TogNom.setFocusPainted(false);
        TogNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TogNomActionPerformed(evt);
            }
        });

        TogTel.setBackground(new java.awt.Color(0, 98, 152));
        TogTel.setForeground(new java.awt.Color(255, 255, 255));
        TogTel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/White_Add.png"))); // NOI18N
        TogTel.setFocusPainted(false);
        TogTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TogTelActionPerformed(evt);
            }
        });

        TogDir.setBackground(new java.awt.Color(0, 98, 152));
        TogDir.setForeground(new java.awt.Color(255, 255, 255));
        TogDir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/White_Add.png"))); // NOI18N
        TogDir.setFocusPainted(false);
        TogDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TogDirActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Filtros:");

        TextEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextEmail.setBackground(new java.awt.Color(0, 74, 114));
        TextEmail.setForeground(new java.awt.Color(255, 255, 255));
        TextEmail.setMaximumSize(new java.awt.Dimension(64, 22));

        TogEmail.setBackground(new java.awt.Color(0, 98, 152));
        TogEmail.setForeground(new java.awt.Color(255, 255, 255));
        TogEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/White_Add.png"))); // NOI18N
        TogEmail.setFocusPainted(false);
        TogEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TogEmailActionPerformed(evt);
            }
        });

        TogFecha.setBackground(new java.awt.Color(0, 98, 152));
        TogFecha.setForeground(new java.awt.Color(255, 255, 255));
        TogFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/White_Add.png"))); // NOI18N
        TogFecha.setFocusPainted(false);
        TogFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TogFechaActionPerformed(evt);
            }
        });

        TextDir.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextDir.setBackground(new java.awt.Color(0, 74, 114));
        TextDir.setForeground(new java.awt.Color(255, 255, 255));
        TextDir.setMaximumSize(new java.awt.Dimension(64, 22));

        TextTel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextTel.setBackground(new java.awt.Color(0, 74, 114));
        TextTel.setForeground(new java.awt.Color(255, 255, 255));
        TextTel.setMaximumSize(new java.awt.Dimension(64, 22));

        TextNom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextNom.setBackground(new java.awt.Color(0, 74, 114));
        TextNom.setForeground(new java.awt.Color(255, 255, 255));
        TextNom.setMaximumSize(new java.awt.Dimension(64, 22));

        IniNom.setBackground(new java.awt.Color(0, 98, 152));
        IniNom.setForeground(new java.awt.Color(255, 255, 255));
        IniNom.setToolTipText("Si está activa, busca solo que empiece con:");
        IniNom.setFocusPainted(false);
        IniNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniNomActionPerformed(evt);
            }
        });

        IniTel.setBackground(new java.awt.Color(0, 98, 152));
        IniTel.setForeground(new java.awt.Color(255, 255, 255));
        IniTel.setToolTipText("Si está activa, busca solo que empiece con:");
        IniTel.setFocusPainted(false);
        IniTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniTelActionPerformed(evt);
            }
        });

        IniDir.setBackground(new java.awt.Color(0, 98, 152));
        IniDir.setForeground(new java.awt.Color(255, 255, 255));
        IniDir.setToolTipText("Si está activa, busca solo que empiece con:");
        IniDir.setFocusPainted(false);
        IniDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniDirActionPerformed(evt);
            }
        });

        IniEmail.setBackground(new java.awt.Color(0, 98, 152));
        IniEmail.setForeground(new java.awt.Color(255, 255, 255));
        IniEmail.setToolTipText("Si está activa, busca solo que empiece con:");
        IniEmail.setFocusPainted(false);
        IniEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniEmailActionPerformed(evt);
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
                                .addGap(89, 89, 89)
                                .addComponent(TogNom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(114, 114, 114)
                                .addComponent(TogTel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(112, 112, 112)
                                .addComponent(TogDir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(113, 113, 113)
                                .addComponent(TogEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TogFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 919, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(BotonRegresar2)
                                        .addGap(239, 239, 239)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(IniNom, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TextNom, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15)
                                        .addComponent(IniTel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TextTel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(IniDir, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TextDir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(IniEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Date1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Date2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TogNom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TogTel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TogDir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TogFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Date1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TogEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(IniEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IniDir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IniTel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Date2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextDir, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextTel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextNom, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(IniNom, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void TogNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TogNomActionPerformed
        if (TogNom.isSelected() == true) {
            TextNom.setEditable(true);
            IniNom.setEnabled(true);
            f1 = 1;
        } else {
            TextNom.setEditable(false);
            TextNom.setText("");
            IniNom.setEnabled(false);
            IniNom.setSelected(false);
            f1 = 0;
            ini1 = "%";
        }
    }//GEN-LAST:event_TogNomActionPerformed

    private void TogTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TogTelActionPerformed
        if (TogTel.isSelected() == true) {
            TextTel.setEditable(true);
            IniTel.setEnabled(true);
            f2 = 1;
        } else {
            TextTel.setEditable(false);
            TextTel.setText("");
            IniTel.setEnabled(false);
            IniTel.setSelected(false);
            f2 = 0;
            ini2 = "%";
        }
    }//GEN-LAST:event_TogTelActionPerformed

    private void TogDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TogDirActionPerformed
        if (TogDir.isSelected() == true) {
            TextDir.setEditable(true);
            IniDir.setEnabled(true);
            f3 = 1;
        } else {
            TextDir.setEditable(false);
            TextDir.setText("");
            IniDir.setEnabled(false);
            IniDir.setSelected(false);
            f3 = 0;
            ini3 = "%";
        }
    }//GEN-LAST:event_TogDirActionPerformed

    private void TogEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TogEmailActionPerformed
        if (TogEmail.isSelected() == true) {
            TextEmail.setEditable(true);
            IniEmail.setEnabled(true);
            f4 = 1;
        } else {
            TextEmail.setEditable(false);
            TextEmail.setText("");
            IniEmail.setEnabled(false);
            IniEmail.setSelected(false);
            f4 = 0;
            ini4 = "%";
        }
    }//GEN-LAST:event_TogEmailActionPerformed

    private void TogFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TogFechaActionPerformed
        if (TogFecha.isSelected() == true) {
            Date1.setEnabled(true);
            Date2.setEnabled(true);
            f5 = 1;
        } else {
            Date1.setEnabled(false);
            Date2.setEnabled(false);
            Date1.getEditor().setText("");
            Date2.getEditor().setText("");
            f5 = 0;
        }
    }//GEN-LAST:event_TogFechaActionPerformed

    private void ButtonActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonActActionPerformed
        if ((f1 == 1 && TextNom.getText().isBlank()) ||
        (f2 == 1 && TextTel.getText().isBlank()) ||
        (f3 == 1 && TextDir.getText().isBlank()) ||
        (f4 == 1 && TextEmail.getText().isBlank()) ||
        (f5 == 1 && (Date1.getEditor().getText().isBlank() || Date2.getEditor().getText().isBlank()))) {
            JOptionPane.showMessageDialog(null, "Faltan datos por completar", "Error de Solicitud", JOptionPane.WARNING_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            int rows = model.getRowCount();
            for (int i = rows-1; i >= 0; i--) {
                model.removeRow(i);
            }

            for (int i = 0; i < 4; i++)
                mrc.AgregarNuevaFilaClientes(jTable1);
            ConstruirQuery();
            System.out.println("Enviando el query "+query);
            mrc.CargarTablaClientes(jTable1, query);
        }
    }//GEN-LAST:event_ButtonActActionPerformed

    private void IniNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniNomActionPerformed
        if (IniNom.isSelected() == true)
            ini1 = "";
        else
            ini1 = "%";
    }//GEN-LAST:event_IniNomActionPerformed

    private void IniTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniTelActionPerformed
        if (IniTel.isSelected() == true)
            ini2 = "";
        else
            ini2 = "%";
    }//GEN-LAST:event_IniTelActionPerformed

    private void IniDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniDirActionPerformed
        if (IniDir.isSelected() == true)
            ini3 = "";
        else
            ini3 = "%";
    }//GEN-LAST:event_IniDirActionPerformed

    private void IniEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniEmailActionPerformed
        if (IniTel.isSelected() == true)
            ini4 = "";
        else
            ini4 = "%";
    }//GEN-LAST:event_IniEmailActionPerformed

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
        
        if (f5 == 1) {
            if (Date1.getEditor().getText().compareTo(Date2.getEditor().getText()) > 0) {
                aux = Date2.getEditor().getText();
                Date2.getEditor().setText(Date1.getEditor().getText());
                Date1.getEditor().setText(aux);
            }
        }
        
        if (f1 == 1 || f2 == 1 || f3 == 1 || f4 == 1 || f5 == 1)
            query = "Select * from Clientes where ID between 0 AND 9999999999";
        else
            query = "Select * from Clientes";
        if (f1 == 1)
            query += " AND Name like '"+ini1+TextNom.getText()+"%'";
        if (f2 == 1)
            query += " AND Tel like '"+ini2+TextTel.getText()+"%'";
        if (f3 == 1)
            query += " AND Dir like '"+ini3+TextDir.getText()+"%'";
        if (f4 == 1)
            query += " AND Email like '"+ini4+TextEmail.getText()+"%'";
        if (f5 == 1)
            query += " AND FechaReg between '"+cocl.DBFecha(Date1.getEditor().getText())+"' AND '"+cocl.DBFecha(Date2.getEditor().getText())+"'";
    }
    
    void BloquearTodo() {
        Date1.setEnabled(false);
        Date2.setEnabled(false);
        TextDir.setEditable(false);
        TextEmail.setEditable(false);
        TextNom.setEditable(false);
        TextTel.setEditable(false);
        IniDir.setEnabled(false);
        IniEmail.setEnabled(false);
        IniNom.setEnabled(false);
        IniTel.setEnabled(false);
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportesClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonRegresar2;
    private javax.swing.JButton ButtonAct;
    private org.jdesktop.swingx.JXDatePicker Date1;
    private org.jdesktop.swingx.JXDatePicker Date2;
    private javax.swing.JToggleButton IniDir;
    private javax.swing.JToggleButton IniEmail;
    private javax.swing.JToggleButton IniNom;
    private javax.swing.JToggleButton IniTel;
    private javax.swing.JTextField TextDir;
    private javax.swing.JTextField TextEmail;
    private javax.swing.JTextField TextNom;
    private javax.swing.JTextField TextTel;
    private javax.swing.JToggleButton TogDir;
    private javax.swing.JToggleButton TogEmail;
    private javax.swing.JToggleButton TogFecha;
    private javax.swing.JToggleButton TogNom;
    private javax.swing.JToggleButton TogTel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
