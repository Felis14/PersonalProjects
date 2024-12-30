package Reportes;

import Control_Objetos.Control_Objetos_Clientes;
import Modelos.Modelo_Reportes;
import Vista_Principal.MenuPrincipal;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ReportesMoves extends javax.swing.JFrame {
    
    Control_Objetos_Clientes cocl = new Control_Objetos_Clientes();
    Modelo_Reportes mrc = new Modelo_Reportes();
    
    //Control de filtros
    static int f1, f2, f3, f4, f5, f6, f7, f8;
    static String ini1 = "%", ini2 = "%";
    static String query = "Select * from Moves";
    static String aux = "";

    public ReportesMoves() {
        initComponents();
        jScrollPane1.getViewport().setBackground(new java.awt.Color(0,28,56));
        Date1.setFormats(new String[]{"dd-MM-yyyy"});
        Date2.setFormats(new String[]{"dd-MM-yyyy"});
        Date1.getEditor().setBackground(new java.awt.Color(0, 98, 152));
        Date2.getEditor().setBackground(new java.awt.Color(0, 98, 152));
        BloquearTodo();
        mrc.CargarTablaMoves(jTable1, query);
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
        TogID = new javax.swing.JToggleButton();
        CbTip = new javax.swing.JComboBox<>();
        TogNumCu = new javax.swing.JToggleButton();
        TogFecha = new javax.swing.JToggleButton();
        TogTip = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        TextMonto2 = new javax.swing.JTextField();
        TextMonto1 = new javax.swing.JTextField();
        TogMont = new javax.swing.JToggleButton();
        TogResp = new javax.swing.JToggleButton();
        CbMon = new javax.swing.JComboBox<>();
        TextResp = new javax.swing.JTextField();
        TextDeta = new javax.swing.JTextField();
        IniResp = new javax.swing.JToggleButton();
        TextID = new javax.swing.JTextField();
        TextCuenta = new javax.swing.JTextField();
        TogMone = new javax.swing.JToggleButton();
        TogDeta = new javax.swing.JToggleButton();
        IniDeta = new javax.swing.JToggleButton();
        BotonRegresar2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bancos Felits - Reporte de Transacciones");

        jPanel1.setBackground(new java.awt.Color(0, 28, 56));

        jTable1.setBackground(new java.awt.Color(0, 28, 56));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Transacción", "ID Cliente", "Numero Cuenta", "Fecha", "Tipo Transacción", "Monto", "Moneda", "Responsable", "Detalle"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, false, false, false, false
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
        jLabel1.setText("Reporte de Transacciones");

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

        Date2.setForeground(new java.awt.Color(255, 255, 255));

        Date1.setForeground(new java.awt.Color(255, 255, 255));

        TogID.setBackground(new java.awt.Color(0, 98, 152));
        TogID.setForeground(new java.awt.Color(255, 255, 255));
        TogID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/White_Add.png"))); // NOI18N
        TogID.setFocusPainted(false);
        TogID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TogIDActionPerformed(evt);
            }
        });

        CbTip.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Depósito", "Retiro" }));
        CbTip.setBackground(new java.awt.Color(0, 74, 114));
        CbTip.setForeground(new java.awt.Color(255, 255, 255));

        TogNumCu.setBackground(new java.awt.Color(0, 98, 152));
        TogNumCu.setForeground(new java.awt.Color(255, 255, 255));
        TogNumCu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/White_Add.png"))); // NOI18N
        TogNumCu.setFocusPainted(false);
        TogNumCu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TogNumCuActionPerformed(evt);
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

        TogTip.setBackground(new java.awt.Color(0, 98, 152));
        TogTip.setForeground(new java.awt.Color(255, 255, 255));
        TogTip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/White_Add.png"))); // NOI18N
        TogTip.setFocusPainted(false);
        TogTip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TogTipActionPerformed(evt);
            }
        });

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

        TogMont.setBackground(new java.awt.Color(0, 98, 152));
        TogMont.setForeground(new java.awt.Color(255, 255, 255));
        TogMont.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/White_Add.png"))); // NOI18N
        TogMont.setFocusPainted(false);
        TogMont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TogMontActionPerformed(evt);
            }
        });

        TogResp.setBackground(new java.awt.Color(0, 98, 152));
        TogResp.setForeground(new java.awt.Color(255, 255, 255));
        TogResp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/White_Add.png"))); // NOI18N
        TogResp.setFocusPainted(false);
        TogResp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TogRespActionPerformed(evt);
            }
        });

        CbMon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Colones", "Dólares" }));
        CbMon.setBackground(new java.awt.Color(0, 74, 114));
        CbMon.setForeground(new java.awt.Color(255, 255, 255));

        TextResp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextResp.setBackground(new java.awt.Color(0, 74, 114));
        TextResp.setCaretColor(new java.awt.Color(255, 255, 255));
        TextResp.setForeground(new java.awt.Color(255, 255, 255));
        TextResp.setMaximumSize(new java.awt.Dimension(64, 22));

        TextDeta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextDeta.setBackground(new java.awt.Color(0, 74, 114));
        TextDeta.setCaretColor(new java.awt.Color(255, 255, 255));
        TextDeta.setForeground(new java.awt.Color(255, 255, 255));
        TextDeta.setMaximumSize(new java.awt.Dimension(64, 22));

        IniResp.setBackground(new java.awt.Color(0, 98, 152));
        IniResp.setForeground(new java.awt.Color(255, 255, 255));
        IniResp.setToolTipText("Si está activa, busca solo que empiece con:");
        IniResp.setFocusPainted(false);
        IniResp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniRespActionPerformed(evt);
            }
        });

        TextID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextID.setBackground(new java.awt.Color(0, 74, 114));
        TextID.setCaretColor(new java.awt.Color(255, 255, 255));
        TextID.setForeground(new java.awt.Color(255, 255, 255));
        TextID.setMaximumSize(new java.awt.Dimension(64, 22));

        TextCuenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextCuenta.setBackground(new java.awt.Color(0, 74, 114));
        TextCuenta.setCaretColor(new java.awt.Color(255, 255, 255));
        TextCuenta.setForeground(new java.awt.Color(255, 255, 255));
        TextCuenta.setMaximumSize(new java.awt.Dimension(64, 22));

        TogMone.setBackground(new java.awt.Color(0, 98, 152));
        TogMone.setForeground(new java.awt.Color(255, 255, 255));
        TogMone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/White_Add.png"))); // NOI18N
        TogMone.setFocusPainted(false);
        TogMone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TogMoneActionPerformed(evt);
            }
        });

        TogDeta.setBackground(new java.awt.Color(0, 98, 152));
        TogDeta.setForeground(new java.awt.Color(255, 255, 255));
        TogDeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/White_Add.png"))); // NOI18N
        TogDeta.setFocusPainted(false);
        TogDeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TogDetaActionPerformed(evt);
            }
        });

        IniDeta.setBackground(new java.awt.Color(0, 98, 152));
        IniDeta.setForeground(new java.awt.Color(255, 255, 255));
        IniDeta.setToolTipText("Si está activa, busca solo que empiece con:");
        IniDeta.setFocusPainted(false);
        IniDeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniDetaActionPerformed(evt);
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
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ButtonAct)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TextID, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TextCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(245, 245, 245)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Date1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Date2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TextMonto1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(CbTip, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(TextMonto2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(CbMon, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TextResp, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(TogID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(TogNumCu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(TogFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(80, 80, 80)
                                        .addComponent(TogTip, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(82, 82, 82)
                                        .addComponent(TogMont, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(81, 81, 81)
                                        .addComponent(TogMone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(79, 79, 79)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(IniResp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(TogResp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextDeta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(IniDeta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(TogDeta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)))
                        .addGap(18, 18, 18))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonRegresar2)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BotonRegresar2))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(ButtonAct, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TogID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TogNumCu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TogFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TogTip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TogMont, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TogMone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TextMonto1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Date1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TogResp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(IniResp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CbTip, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextMonto2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Date2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CbMon, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextResp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TogDeta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(IniDeta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextDeta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
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

    private void TogIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TogIDActionPerformed
        if (TogID.isSelected() == true) {
            TextID.setEditable(true);
            f1 = 1;
        } else {
            TextID.setEditable(false);
            TextID.setText("");
            f1 = 0;
        }
    }//GEN-LAST:event_TogIDActionPerformed

    private void TogNumCuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TogNumCuActionPerformed
        if (TogNumCu.isSelected() == true) {
            TextCuenta.setEditable(true);
            f2 = 1;
        } else {
            TextCuenta.setEditable(false);
            TextCuenta.setText("");
            f2 = 0;
        }
    }//GEN-LAST:event_TogNumCuActionPerformed

    private void TogFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TogFechaActionPerformed
        if (TogFecha.isSelected() == true) {
            Date1.setEnabled(true);
            Date2.setEnabled(true);
            f3 = 1;
        } else {
            Date1.setEnabled(false);
            Date2.setEnabled(false);
            Date1.getEditor().setText("");
            Date2.getEditor().setText("");
            f3 = 0;
        }
    }//GEN-LAST:event_TogFechaActionPerformed

    private void TogTipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TogTipActionPerformed
        if (TogTip.isSelected() == true) {
            CbTip.setEnabled(true);
            f4 = 1;
        } else {
            CbTip.setEnabled(false);
            CbTip.setSelectedIndex(0);
            f4 = 0;
        }
    }//GEN-LAST:event_TogTipActionPerformed

    private void TogMontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TogMontActionPerformed
        if (TogMont.isSelected() == true) {
            TextMonto1.setEditable(true);
            TextMonto2.setEditable(true);
            f5 = 1;
        } else {
            TextMonto1.setEditable(false);
            TextMonto2.setEditable(false);
            TextMonto1.setText("");
            TextMonto1.setText("");
            f5 = 0;
        }
    }//GEN-LAST:event_TogMontActionPerformed

    private void TogRespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TogRespActionPerformed
        if (TogResp.isSelected() == true) {
            TextResp.setEditable(true);
            IniResp.setEnabled(true);
            f7 = 1;
        } else {
            TextResp.setEditable(false);
            TextResp.setText("");
            IniResp.setEnabled(false);
            IniResp.setSelected(false);
            ini1 = "%";
            f7 = 0;
        }
    }//GEN-LAST:event_TogRespActionPerformed

    private void ButtonActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonActActionPerformed
        if ((f1 == 1 && TextID.getText().isBlank()) ||
        (f2 == 1 && TextCuenta.getText().isBlank()) ||
        (f3 == 1 && (Date1.getEditor().getText().isBlank() || Date2.getEditor().getText().isBlank())) ||
        (f5 == 1 && (TextMonto1.getText().isBlank() || TextMonto2.getText().isBlank())) ||
        (f7 == 1 && TextResp.getText().isBlank()) ||
        (f8 == 1 && TextDeta.getText().isBlank())) {
            JOptionPane.showMessageDialog(null, "Faltan datos por completar", "Error de Solicitud", JOptionPane.WARNING_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            int rows = model.getRowCount();
            for (int i = rows-1; i >= 0; i--) {
                model.removeRow(i);
            }

            for (int i = 0; i < 4; i++)
                mrc.AgregarNuevaFilaMoves(jTable1);
            ConstruirQuery();
            System.out.println("Enviando el query "+query);
            mrc.CargarTablaMoves(jTable1, query);
        }
    }//GEN-LAST:event_ButtonActActionPerformed

    private void IniRespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniRespActionPerformed
        if (IniResp.isSelected() == true)
            ini1 = "";
        else
            ini1 = "%";
    }//GEN-LAST:event_IniRespActionPerformed

    private void TogMoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TogMoneActionPerformed
        if (TogMone.isSelected() == true) {
            CbMon.setEnabled(true);
            f6 = 1;
        } else {
            CbMon.setEnabled(false);
            CbMon.setSelectedIndex(0);
            f6 = 0;
        }
    }//GEN-LAST:event_TogMoneActionPerformed

    private void TogDetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TogDetaActionPerformed
        if (TogDeta.isSelected() == true) {
            TextDeta.setEditable(true);
            IniDeta.setEnabled(true);
            f8 = 1;
        } else {
            TextDeta.setEditable(false);
            TextDeta.setText("");
            IniDeta.setEnabled(false);
            IniDeta.setSelected(false);
            ini2 = "%";
            f8 = 0;
        }
    }//GEN-LAST:event_TogDetaActionPerformed

    private void IniDetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniDetaActionPerformed
        if (IniDeta.isSelected() == true)
            ini2 = "";
        else
            ini2 = "%";
    }//GEN-LAST:event_IniDetaActionPerformed

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

    //Procedimiento para cambia el query segun los filtros utilizados
    void ConstruirQuery() {
        
        //Si el filtro de fecha está activado
        if (f3 == 1) {
            //Si la primera fecha es mayor a la segunda, se le dan vuelta antes de buscarlo
            if (Date1.getEditor().getText().compareTo(Date2.getEditor().getText()) > 0) {
                //Aux es igual a la fecha en el campo 2
                aux = Date2.getEditor().getText();
                //La fecha del campo 2 cambia a la fecha del primer campo
                Date2.getEditor().setText(Date1.getEditor().getText());
                //La fecha del campo 1 cambia a lo que tenia antes el campo 2
                Date1.getEditor().setText(aux);
            }
        }
        
        //Si el filtro de monto está activado
        if (f5 == 1) {
            //Si el primer monto es mayor al segundo, se les da la vuelta antes de buscarlo
            if (Integer.valueOf(TextMonto1.getText()) > Integer.valueOf(TextMonto2.getText())) {
                //Aux es igual al monto en el segundo campo
                aux = TextMonto2.getText();
                //El segundo campo cambia a lo que tiene el primer campo
                TextMonto2.setText(TextMonto1.getText());
                //El primer campo cambia a lo que tenia el segundo campo
                TextMonto1.setText(aux);
            }
        }
        
        //Si alguno de estos filtros están activados, no busca nada especial, para agregar "AND's" sin que intervenga
        //Se le pone el where NumeroMov between 0 AND 9999999999, que será igual que un select * from sin ninguna condicion
        if (f2 == 1 || f3 == 1 || f4 == 1 || f5 == 1 || f7 == 1 || f8 == 1)
            query = "Select * from Moves where NumeroMov between 0 AND 9999999999";
        else
            //Si no hay ningun filtro de los de arriba activos, cambia el query a uno corriente
            query = "Select * from Moves";
        if (f1 == 1)
            //Si se busca por id de cliente, se hace una busqueda con inner join usando la tabla cuentas
            query = "Select * from moves INNER JOIN cuentas ON NumeroC = cuentas.Numero where cuentas.ID = '"+TextID.getText()+"'";
        if (f1 == 1 && f6 == 1)
            //Si se busca por id de cliente y tipo de moneda, se hacen dos inner joins, uno para la id y otro para el tipo de moneda
            query = "Select moves.*, cuentas.TMoneda from moves INNER JOIN cuentas ON moves.NumeroC = cuentas.Numero WHERE cuentas.ID = '"+mrc.GetID(TextCuenta.getText())+"' AND cuentas.TMoneda IN ('"+CbMon.getSelectedItem()+"')";
        if (f6 == 1)
            //Si solo se busca por tipo de moneda cambia el query por un inner join que utiliza la tabla cuentas y saca el tipo de moneda de un movimiento
            query = "Select moves.*, cuentas.TMoneda from moves INNER JOIN cuentas ON moves.NumeroC = cuentas.Numero WHERE cuentas.TMoneda IN ('"+CbMon.getSelectedItem()+"')";
        if (f2 == 1)
            //Si el filtro de numero cuenta esta activado
            query += " AND NumeroC = '"+TextCuenta.getText()+"'";
        if (f3 == 1)
            //Si el filtro de fecha esta activado
            query += " AND FechaMov between '"+cocl.DBFecha(Date1.getEditor().getText())+"' AND '"+cocl.DBFecha(Date2.getEditor().getText())+"'";
        if (f4 == 1)
            //Si el filtro de tipo de transaccion esta activado
            query += " AND TipoMov = '"+CbTip.getSelectedItem()+"'";
        if (f5 == 1)
            //Si el filtro de monto de transaccion esta activado
            query += " AND MontoMov between "+TextMonto1.getText()+" AND "+TextMonto2.getText();
        if (f7 == 1)
            //Si el filtro de nombre del responsable esta activado
            query += " AND NombreResp like '"+ini1+TextResp.getText()+"%'";
        if (f8 == 1)
            //Si el filtro de detalle esta activado
            query += " AND Detalle like '"+ini2+TextDeta.getText()+"%'";
    }
    
    //Bloquea todo lo modificable en los filtros
    void BloquearTodo() {
        Date1.setEnabled(false);
        Date2.setEnabled(false);
        CbTip.setEnabled(false);
        TextCuenta.setEditable(false);
        TextID.setEditable(false);
        TextMonto1.setEditable(false);
        TextMonto2.setEditable(false);
        CbMon.setEnabled(false);
        TextDeta.setEditable(false);
        TextResp.setEditable(false);
        IniDeta.setEnabled(false);
        IniResp.setEnabled(false);
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportesMoves().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonRegresar2;
    private javax.swing.JButton ButtonAct;
    private javax.swing.JComboBox<String> CbMon;
    private javax.swing.JComboBox<String> CbTip;
    private org.jdesktop.swingx.JXDatePicker Date1;
    private org.jdesktop.swingx.JXDatePicker Date2;
    private javax.swing.JToggleButton IniDeta;
    private javax.swing.JToggleButton IniResp;
    private javax.swing.JTextField TextCuenta;
    private javax.swing.JTextField TextDeta;
    private javax.swing.JTextField TextID;
    private javax.swing.JTextField TextMonto1;
    private javax.swing.JTextField TextMonto2;
    private javax.swing.JTextField TextResp;
    private javax.swing.JToggleButton TogDeta;
    private javax.swing.JToggleButton TogFecha;
    private javax.swing.JToggleButton TogID;
    private javax.swing.JToggleButton TogMone;
    private javax.swing.JToggleButton TogMont;
    private javax.swing.JToggleButton TogNumCu;
    private javax.swing.JToggleButton TogResp;
    private javax.swing.JToggleButton TogTip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
