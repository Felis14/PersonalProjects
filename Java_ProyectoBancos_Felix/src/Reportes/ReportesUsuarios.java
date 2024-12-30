package Reportes;

import Control_Objetos.Control_Objetos_Clientes;
import Modelos.Modelo_Reportes;
import Modelos.Modelo_Datos_Niv;
import Vista_Principal.MenuPrincipal;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ReportesUsuarios extends javax.swing.JFrame {
    
    Control_Objetos_Clientes cocl = new Control_Objetos_Clientes();
    Modelo_Reportes mrc = new Modelo_Reportes();
    Modelo_Datos_Niv mdn = new Modelo_Datos_Niv();
    
    //Control de filtros
    static int f1, f2, f3, f4, f5;
    static String ini1="%", ini2="%";
    static String query = "Select * from Users";
    static String aux = "";

    public ReportesUsuarios() {
        initComponents();
        jScrollPane1.getViewport().setBackground(new java.awt.Color(0,28,56));
        BloquearTodo();
        mdn.CargarCbNivelesNombres(CbNivs);
        System.out.println(query);
        mrc.CargarTablaUsers(jTable1, query);
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
        TogUser = new javax.swing.JToggleButton();
        TogName = new javax.swing.JToggleButton();
        TogID = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        TogNiv = new javax.swing.JToggleButton();
        TogEstado = new javax.swing.JToggleButton();
        TextID = new javax.swing.JTextField();
        TextName = new javax.swing.JTextField();
        TextUser = new javax.swing.JTextField();
        IniUser = new javax.swing.JToggleButton();
        IniName = new javax.swing.JToggleButton();
        CbNivs = new javax.swing.JComboBox<>();
        CbEstado = new javax.swing.JComboBox<>();
        BotonRegresar2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bancos Felits - Reporte de Usuarios");

        jPanel1.setBackground(new java.awt.Color(0, 28, 56));

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));

        jTable1.setBackground(new java.awt.Color(0, 28, 56));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre de Usuario", "Nombre Completo", "Identificación", "Nivel", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setSelectionBackground(new java.awt.Color(204, 237, 255));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reporte de Usuarios");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha: ");

        ButtonAct.setBackground(new java.awt.Color(0, 98, 152));
        ButtonAct.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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

        TogUser.setBackground(new java.awt.Color(0, 74, 114));
        TogUser.setForeground(new java.awt.Color(255, 255, 255));
        TogUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/White_Add.png"))); // NOI18N
        TogUser.setFocusPainted(false);
        TogUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TogUserActionPerformed(evt);
            }
        });

        TogName.setBackground(new java.awt.Color(0, 74, 114));
        TogName.setForeground(new java.awt.Color(255, 255, 255));
        TogName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/White_Add.png"))); // NOI18N
        TogName.setFocusPainted(false);
        TogName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TogNameActionPerformed(evt);
            }
        });

        TogID.setBackground(new java.awt.Color(0, 74, 114));
        TogID.setForeground(new java.awt.Color(255, 255, 255));
        TogID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/White_Add.png"))); // NOI18N
        TogID.setFocusPainted(false);
        TogID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TogIDActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Filtros:");

        TogNiv.setBackground(new java.awt.Color(0, 74, 114));
        TogNiv.setForeground(new java.awt.Color(255, 255, 255));
        TogNiv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/White_Add.png"))); // NOI18N
        TogNiv.setFocusPainted(false);
        TogNiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TogNivActionPerformed(evt);
            }
        });

        TogEstado.setBackground(new java.awt.Color(0, 74, 114));
        TogEstado.setForeground(new java.awt.Color(255, 255, 255));
        TogEstado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/White_Add.png"))); // NOI18N
        TogEstado.setFocusPainted(false);
        TogEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TogEstadoActionPerformed(evt);
            }
        });

        TextID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextID.setBackground(new java.awt.Color(0, 74, 114));
        TextID.setForeground(new java.awt.Color(255, 255, 255));
        TextID.setMaximumSize(new java.awt.Dimension(64, 22));

        TextName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextName.setBackground(new java.awt.Color(0, 74, 114));
        TextName.setForeground(new java.awt.Color(255, 255, 255));
        TextName.setMaximumSize(new java.awt.Dimension(64, 22));

        TextUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextUser.setBackground(new java.awt.Color(0, 74, 114));
        TextUser.setForeground(new java.awt.Color(255, 255, 255));
        TextUser.setMaximumSize(new java.awt.Dimension(64, 22));

        IniUser.setBackground(new java.awt.Color(0, 98, 152));
        IniUser.setFont(new java.awt.Font("Segoe UI", 0, 6)); // NOI18N
        IniUser.setForeground(new java.awt.Color(255, 255, 255));
        IniUser.setText(">");
        IniUser.setToolTipText("Si está activa, busca solo que empiece con:");
        IniUser.setFocusPainted(false);
        IniUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniUserActionPerformed(evt);
            }
        });

        IniName.setBackground(new java.awt.Color(0, 98, 152));
        IniName.setFont(new java.awt.Font("Segoe UI", 0, 6)); // NOI18N
        IniName.setForeground(new java.awt.Color(255, 255, 255));
        IniName.setText(">");
        IniName.setToolTipText("Si está activa, busca solo que empiece con:");
        IniName.setFocusPainted(false);
        IniName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniNameActionPerformed(evt);
            }
        });

        CbNivs.setBackground(new java.awt.Color(0, 74, 114));
        CbNivs.setForeground(new java.awt.Color(255, 255, 255));

        CbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        CbEstado.setBackground(new java.awt.Color(0, 74, 114));
        CbEstado.setForeground(new java.awt.Color(255, 255, 255));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonAct))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(IniUser, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextUser, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(IniName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextName, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TextID, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(CbNivs, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 919, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(82, 82, 82)
                                    .addComponent(TogUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(BotonRegresar2))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(136, 136, 136)
                                    .addComponent(TogName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(145, 145, 145)
                                    .addComponent(TogID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(148, 148, 148)
                                    .addComponent(TogNiv, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TogEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(66, 66, 66))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(147, 147, 147)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonRegresar2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonAct, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TogUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TogID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TogNiv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TogEstado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(IniUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TextUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CbNivs, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TextName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TextID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(IniName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TogName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TogUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TogUserActionPerformed
        if (TogUser.isSelected() == true) {
            TextUser.setEditable(true);
            IniUser.setEnabled(true);
            TogUser.setBackground(new java.awt.Color(0,98,152));
            f1 = 1;
        } else {
            TogUser.setBackground(new java.awt.Color(0, 74, 114));
            TextUser.setEditable(false);
            TextUser.setText("");
            IniUser.setEnabled(false);
            IniUser.setSelected(false);
            f1 = 0;
            ini1 = "%";
        }
    }//GEN-LAST:event_TogUserActionPerformed

    private void TogNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TogNameActionPerformed
        if (TogName.isSelected() == true) {
            TextName.setEditable(true);
            IniName.setEnabled(true);
            TogName.setBackground(new java.awt.Color(0,98,152));
            f2 = 1;
        } else {
            TogName.setBackground(new java.awt.Color(0, 74, 114));
            TextName.setEditable(false);
            TextName.setText("");
            IniName.setEnabled(false);
            IniName.setSelected(false);
            f2 = 0;
            ini2 = "%";
        }
    }//GEN-LAST:event_TogNameActionPerformed

    private void TogIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TogIDActionPerformed
        if (TogID.isSelected() == true) {
            TextID.setEditable(true);
            TogID.setBackground(new java.awt.Color(0,98,152));
            f3 = 1;
        } else {
            TogID.setBackground(new java.awt.Color(0, 74, 114));
            TextID.setEditable(false);
            TextID.setText("");
            f3 = 0;
        }
    }//GEN-LAST:event_TogIDActionPerformed

    private void TogNivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TogNivActionPerformed
        if (TogNiv.isSelected() == true) {
            CbNivs.setEnabled(true);
            TogNiv.setBackground(new java.awt.Color(0,98,152));
            f4 = 1;
        } else {
            TogNiv.setBackground(new java.awt.Color(0, 74, 114));
            CbNivs.setEnabled(false);
            CbNivs.setSelectedIndex(0);
            f4 = 0;
        }
    }//GEN-LAST:event_TogNivActionPerformed

    private void TogEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TogEstadoActionPerformed
        if (TogEstado.isSelected() == true) {
            CbEstado.setEnabled(true);
            TogEstado.setBackground(new java.awt.Color(0,98,152));
            f5 = 1;
        } else {
            TogEstado.setBackground(new java.awt.Color(0, 74, 114));
            CbEstado.setEnabled(false);
            CbEstado.setSelectedIndex(0);
            f5 = 0;
        }
    }//GEN-LAST:event_TogEstadoActionPerformed

    private void ButtonActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonActActionPerformed
        if ((f1 == 1 && TextUser.getText().isBlank()) ||
        (f2 == 1 && TextName.getText().isBlank()) ||
        (f3 == 1 && TextID.getText().isBlank())) {
            JOptionPane.showMessageDialog(null, "Faltan datos por completar", "Error de Solicitud", JOptionPane.WARNING_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            int rows = model.getRowCount();
            for (int i = rows-1; i >= 0; i--) {
                model.removeRow(i);
            }

            for (int i = 0; i < 4; i++)
                mrc.AgregarNuevaFilaUsers(jTable1);
            ConstruirQuery();
            System.out.println("Enviando el query "+query);
            mrc.CargarTablaUsers(jTable1, query);
        }
    }//GEN-LAST:event_ButtonActActionPerformed

    private void IniUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniUserActionPerformed
        if (IniUser.isSelected() == true)
            ini1 = "";
        else
            ini1 = "%";
    }//GEN-LAST:event_IniUserActionPerformed

    private void IniNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniNameActionPerformed
        if (IniName.isSelected() == true)
            ini2 = "";
        else
            ini2 = "%";
    }//GEN-LAST:event_IniNameActionPerformed

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
        
        if (f1 == 1 || f2 == 1 || f4 == 1 || f5 == 1)
            query = "Select * from Users where ID between 0 AND 9999999999";
        if (f3 == 1)
            query = "Select * from Users where ID = '"+TextID.getText()+"'";
        if (f1 == 0 && f2 == 0 && f3 == 0 && f4 == 0 && f5 == 0)
            query = "Select * from Users";
        if (f1 == 1)
            query += " AND Username like '"+ini1+TextUser.getText()+"%'";
        if (f2 == 1)
            query += " AND Fullname like '"+ini2+TextName.getText()+"%'";
        if (f4 == 1)
            query += " AND CodeNiv = '"+mdn.GetNivCode(""+CbNivs.getSelectedItem())+"'";
        if (f5 == 1)
            query += " AND Estado = '"+CbEstado.getSelectedItem()+"'";
    }
    
    void BloquearTodo() {
        IniUser.setEnabled(false);
        TextUser.setEditable(false);
        IniName.setEnabled(false);
        TextName.setEditable(false);
        TextID.setEditable(false);
        CbNivs.setEnabled(false);
        CbEstado.setEnabled(false);
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportesUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonRegresar2;
    private javax.swing.JButton ButtonAct;
    private javax.swing.JComboBox<String> CbEstado;
    private javax.swing.JComboBox<String> CbNivs;
    private javax.swing.JToggleButton IniName;
    private javax.swing.JToggleButton IniUser;
    private javax.swing.JTextField TextID;
    private javax.swing.JTextField TextName;
    private javax.swing.JTextField TextUser;
    private javax.swing.JToggleButton TogEstado;
    private javax.swing.JToggleButton TogID;
    private javax.swing.JToggleButton TogName;
    private javax.swing.JToggleButton TogNiv;
    private javax.swing.JToggleButton TogUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
