package Gestion_Moves;

import Modelos.Modelo_Datos_Clientes;
import Modelos.Modelo_Datos_Cuentas;
import Modelos.Modelo_Datos_Moves;
import Modelos.Modelo_Bitacoras;
import Control_Objetos.Control_Objetos_Cuentas;
import Control_Objetos.Control_Objetos_Clientes;
import Control_Objetos.Control_Objetos_Moves;
import javax.swing.JOptionPane;
import Utilitario_Validaciones.*;
import Vista_Principal.MenuPrincipal;

public class Registrar_Moves extends javax.swing.JFrame {
    
    Modelo_Datos_Clientes mdcl = new Modelo_Datos_Clientes();
    Modelo_Datos_Cuentas mdcu = new Modelo_Datos_Cuentas();
    Modelo_Datos_Moves mdm = new Modelo_Datos_Moves();
    Modelo_Bitacoras mb = new Modelo_Bitacoras();
    
    Control_Objetos_Clientes cocl = new Control_Objetos_Clientes();
    Control_Objetos_Cuentas cocu = new Control_Objetos_Cuentas();
    Control_Objetos_Moves com = new Control_Objetos_Moves();
    Fecha_Sistema fs = new Fecha_Sistema();
    Validaciones V = new Validaciones();

    public Registrar_Moves() {
        initComponents();
        com.BloquearRegistrar(CbClientes, TextID, BotonBuscar, CbCuenta, TextCuenta, BotonBuscarCuenta, BotonConfirm,
        TextMonto, TextNombreResp, TextDetalle, RadioDepo, RadioReti);
        mdcl.CargarCbClientes(CbClientes);
        TextFecha.setText(fs.fecha());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TipoMov = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        ID = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        BotonLimpiar = new javax.swing.JButton();
        BotonRegresar = new javax.swing.JLabel();
        TextNombreResp = new javax.swing.JTextField();
        RadioDepo = new javax.swing.JRadioButton();
        RadioReti = new javax.swing.JRadioButton();
        ID1 = new javax.swing.JLabel();
        CbClientes = new javax.swing.JComboBox<>();
        TextID = new javax.swing.JTextField();
        BotonBuscar = new javax.swing.JButton();
        ID2 = new javax.swing.JLabel();
        TextFecha = new javax.swing.JTextField();
        TextCuenta = new javax.swing.JTextField();
        BotonBuscarCuenta = new javax.swing.JButton();
        ID3 = new javax.swing.JLabel();
        TextMonto = new javax.swing.JTextField();
        Email1 = new javax.swing.JLabel();
        TextDetalle = new javax.swing.JTextField();
        CbCuenta = new javax.swing.JComboBox<>();
        BotonConsultarO = new javax.swing.JButton();
        BotonConfirm = new javax.swing.JButton();
        Signo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bancos Felits - Registro de Movimientos");

        jPanel1.setBackground(new java.awt.Color(0, 28, 56));

        Title.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Registro de Movimientos");

        jSeparator1.setForeground(new java.awt.Color(0, 98, 152));

        ID.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        ID.setForeground(new java.awt.Color(255, 255, 255));
        ID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ID.setText("Fecha:");

        Name.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 255, 255));
        Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Name.setText("Tipo de Movimiento:");

        Email.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Email.setForeground(new java.awt.Color(255, 255, 255));
        Email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Email.setText("Nombre del Responsable:");

        jSeparator2.setForeground(new java.awt.Color(0, 98, 152));

        BotonLimpiar.setBackground(new java.awt.Color(0, 98, 152));
        BotonLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        BotonLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        BotonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/White_TrashCan.png"))); // NOI18N
        BotonLimpiar.setText("Limpiar Todo");
        BotonLimpiar.setFocusPainted(false);
        BotonLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BotonLimpiar.setIconTextGap(0);
        BotonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLimpiarActionPerformed(evt);
            }
        });

        BotonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/ArrowBack.png"))); // NOI18N
        BotonRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRegresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonRegresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonRegresarMouseExited(evt);
            }
        });

        TextNombreResp.setEditable(false);
        TextNombreResp.setBackground(new java.awt.Color(0, 74, 114));
        TextNombreResp.setForeground(new java.awt.Color(255, 255, 255));
        TextNombreResp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextNombreResp.setCaretColor(new java.awt.Color(255, 255, 255));

        RadioDepo.setBackground(new java.awt.Color(0, 28, 56));
        TipoMov.add(RadioDepo);
        RadioDepo.setForeground(new java.awt.Color(255, 255, 255));
        RadioDepo.setText("Depósito");
        RadioDepo.setEnabled(false);
        RadioDepo.setFocusPainted(false);

        RadioReti.setBackground(new java.awt.Color(0, 28, 56));
        TipoMov.add(RadioReti);
        RadioReti.setForeground(new java.awt.Color(255, 255, 255));
        RadioReti.setText("Retiro");
        RadioReti.setEnabled(false);
        RadioReti.setFocusPainted(false);

        ID1.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        ID1.setForeground(new java.awt.Color(255, 255, 255));
        ID1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ID1.setText("A Nombre de:");

        CbClientes.setBackground(new java.awt.Color(0, 74, 114));
        CbClientes.setForeground(new java.awt.Color(255, 255, 255));
        CbClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbClientesActionPerformed(evt);
            }
        });

        TextID.setBackground(new java.awt.Color(0, 74, 114));
        TextID.setForeground(new java.awt.Color(255, 255, 255));
        TextID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextID.setCaretColor(new java.awt.Color(255, 255, 255));
        TextID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextIDKeyTyped(evt);
            }
        });

        BotonBuscar.setBackground(new java.awt.Color(0, 98, 152));
        BotonBuscar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        BotonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        BotonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/White_Lens.png"))); // NOI18N
        BotonBuscar.setText("Buscar ID");
        BotonBuscar.setFocusPainted(false);
        BotonBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BotonBuscar.setIconTextGap(0);
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });

        ID2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        ID2.setForeground(new java.awt.Color(255, 255, 255));
        ID2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ID2.setText("Número de Cuenta:");

        TextFecha.setEditable(false);
        TextFecha.setBackground(new java.awt.Color(0, 74, 114));
        TextFecha.setForeground(new java.awt.Color(255, 255, 255));
        TextFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextFecha.setCaretColor(new java.awt.Color(255, 255, 255));

        TextCuenta.setBackground(new java.awt.Color(0, 74, 114));
        TextCuenta.setForeground(new java.awt.Color(255, 255, 255));
        TextCuenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextCuenta.setCaretColor(new java.awt.Color(255, 255, 255));
        TextCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextCuentaKeyTyped(evt);
            }
        });

        BotonBuscarCuenta.setBackground(new java.awt.Color(0, 98, 152));
        BotonBuscarCuenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BotonBuscarCuenta.setForeground(new java.awt.Color(255, 255, 255));
        BotonBuscarCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/White_Lens.png"))); // NOI18N
        BotonBuscarCuenta.setText("Usar Cuenta");
        BotonBuscarCuenta.setFocusPainted(false);
        BotonBuscarCuenta.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BotonBuscarCuenta.setIconTextGap(0);
        BotonBuscarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarCuentaActionPerformed(evt);
            }
        });

        ID3.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        ID3.setForeground(new java.awt.Color(255, 255, 255));
        ID3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ID3.setText("Monto:");

        TextMonto.setEditable(false);
        TextMonto.setBackground(new java.awt.Color(0, 74, 114));
        TextMonto.setForeground(new java.awt.Color(255, 255, 255));
        TextMonto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextMonto.setCaretColor(new java.awt.Color(255, 255, 255));
        TextMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextMontoKeyTyped(evt);
            }
        });

        Email1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Email1.setForeground(new java.awt.Color(255, 255, 255));
        Email1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Email1.setText("Detalle:");

        TextDetalle.setEditable(false);
        TextDetalle.setBackground(new java.awt.Color(0, 74, 114));
        TextDetalle.setForeground(new java.awt.Color(255, 255, 255));
        TextDetalle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextDetalle.setCaretColor(new java.awt.Color(255, 255, 255));

        CbCuenta.setBackground(new java.awt.Color(0, 74, 114));
        CbCuenta.setForeground(new java.awt.Color(255, 255, 255));
        CbCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbCuentaActionPerformed(evt);
            }
        });

        BotonConsultarO.setBackground(new java.awt.Color(0, 98, 152));
        BotonConsultarO.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        BotonConsultarO.setForeground(new java.awt.Color(255, 255, 255));
        BotonConsultarO.setText("Usar otra");
        BotonConsultarO.setToolTipText("Consultar otra cuenta del mismo cliente.");
        BotonConsultarO.setFocusPainted(false);
        BotonConsultarO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConsultarOActionPerformed(evt);
            }
        });

        BotonConfirm.setBackground(new java.awt.Color(0, 98, 152));
        BotonConfirm.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        BotonConfirm.setForeground(new java.awt.Color(255, 255, 255));
        BotonConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/White_Register.png"))); // NOI18N
        BotonConfirm.setText("Confirmar");
        BotonConfirm.setFocusPainted(false);
        BotonConfirm.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BotonConfirm.setIconTextGap(0);
        BotonConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConfirmActionPerformed(evt);
            }
        });

        Signo.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        Signo.setForeground(new java.awt.Color(255, 255, 255));
        Signo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Signo.setText("-");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(Title)
                        .addContainerGap(105, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ID2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                    .addComponent(ID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                    .addComponent(BotonConsultarO, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(TextCuenta)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BotonBuscarCuenta))
                                    .addComponent(CbCuenta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TextFecha, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ID1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CbClientes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(TextID)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(RadioDepo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(RadioReti, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextNombreResp))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Email1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextDetalle))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ID3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(Signo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextMonto)))
                        .addGap(18, 18, 18))))
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(BotonLimpiar)
                .addGap(61, 61, 61)
                .addComponent(BotonConfirm)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(ID1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(TextID))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonConsultarO, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BotonBuscarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(RadioDepo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RadioReti)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Signo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextNombreResp, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TextDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addComponent(Email1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
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

    private void BotonRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegresarMouseExited
        BotonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/ArrowBack.png")));
    }//GEN-LAST:event_BotonRegresarMouseExited

    private void BotonRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegresarMouseEntered
        BotonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/ArrowBackHover.png")));
    }//GEN-LAST:event_BotonRegresarMouseEntered

    private void BotonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLimpiarActionPerformed
        com.LimpiarTodoRegistrar(TextID, TextCuenta, TextMonto, TextNombreResp, TextDetalle, Signo, TipoMov);
        com.BloquearRegistrar(CbClientes, TextID, BotonBuscar, CbCuenta, TextCuenta, BotonBuscarCuenta, BotonConfirm,
        TextMonto, TextNombreResp, TextDetalle, RadioDepo, RadioReti);
        
        try {
            CbClientes.removeAllItems();
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            CbCuenta.removeAllItems();
        } catch (Exception e) {
            System.out.println(e);
        }
        mdcl.CargarCbClientes(CbClientes);
    }//GEN-LAST:event_BotonLimpiarActionPerformed

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        if ((TextID.getText().equals(""))) {
            String contacto = ""+CbClientes.getSelectedItem();
            String contactID = "";
            int i=0;
            do {
                if (contacto.charAt(i) >= 0 || contacto.charAt(i) <= 9)
                    contactID += contacto.charAt(i);
                i++;
            } while (contacto.charAt(i) != ' ');
        TextID.setText(""+contactID);
        }
        if (mdcl.BuscarID(TextID.getText()) == 1) {
            String id=TextID.getText();
            String clienteID="", cliente = "";
            for (int i=0; i<CbClientes.getItemCount(); i++) {
                CbClientes.setSelectedIndex(i);
                cliente = ""+CbClientes.getSelectedItem();
                clienteID = "";
                for (int j=0; i<CbClientes.getItemAt(i).length(); j++) {
                    if (cliente.charAt(j) != ' ') {
                        clienteID += CbClientes.getItemAt(i).charAt(j);
                    }
                    else
                        break;
                }
                if (clienteID.equals(id)) {
                    CbClientes.setSelectedIndex(i);
                    break;
                }
            }
            CargarCuentas();
            if (CbCuenta.getItemCount() > 0)
                JOptionPane.showMessageDialog(null, "Cliente encontrado, se cargarán sus cuentas.", "Estado", JOptionPane.PLAIN_MESSAGE);
            else
                JOptionPane.showMessageDialog(null, "Cliente encontrado, pero no tiene ninguna cuenta registrada.", "Estado", JOptionPane.PLAIN_MESSAGE);
            com.DesbloquearRegistrar(CbClientes, TextID, BotonBuscar, CbCuenta, TextCuenta, BotonBuscarCuenta, BotonConfirm,
            TextMonto, TextNombreResp, TextDetalle, RadioDepo, RadioReti);
        } else {
            JOptionPane.showMessageDialog(null, "El cliente no está registrado.", "Estado", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BotonBuscarActionPerformed

    private void CbClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbClientesActionPerformed
        String cliente = ""+CbClientes.getSelectedItem();
        String clienteID = "";
        int i=0;
        do {
            if (cliente.charAt(i) >= 0 || cliente.charAt(i) <= 9)
                clienteID += cliente.charAt(i);
            i++;
        } while (cliente.charAt(i) != ' ');
        TextID.setText(""+clienteID);
    }//GEN-LAST:event_CbClientesActionPerformed

    private void BotonBuscarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarCuentaActionPerformed
        if ((TextCuenta.getText().equals(""))) {
            String cuenta = ""+CbCuenta.getSelectedItem();
            String numcu = "";
            int i=0;
            do {
                if (cuenta.charAt(i) >= 0 || cuenta.charAt(i) <= 9)
                    numcu += cuenta.charAt(i);
                i++;
            } while (cuenta.charAt(i) != ' ');
        TextCuenta.setText(""+numcu);
        }
        if (mdcu.GetEstado(TextCuenta.getText()).equals("Activa")) {
            String numcuenta = ""; int vecl=0;
            String cuenta = ""+CbCuenta.getSelectedItem();
            int list[] = new int [CbCuenta.getItemCount()];
            if ((TextCuenta.getText().equals(""))) {

                int i=0;
                do {
                    if (cuenta.charAt(i) >= 0 || cuenta.charAt(i) <= 9)
                        numcuenta += cuenta.charAt(i);
                    i++;
                } while (cuenta.charAt(i) != ' ');
                TextCuenta.setText(""+numcuenta);
                ActualizarSigno(""+CbCuenta.getSelectedItem());
            } else {
                //Procedimiento para evitar cargar cuentas de otras personas, y solo cargar cuentas del cliente que se está consultado.
                //Se crea un vector del tamaño de la suma de todos los items del combobox
                list = new int [CbCuenta.getItemCount()];
                vecl = list.length;
                for (int i=0; i<CbCuenta.getItemCount(); i++) {
                    //Reinicia la variable numero de cuenta y asigna a la variable cuenta el item que está en la posición i
                    numcuenta = ""; cuenta = ""+CbCuenta.getItemAt(i);
                    for (int j=0; j<cuenta.length(); j++) {
                        //Si el caracter es un espacio en blanco, el ciclo se rompe, dejando solo la variable que tenía el item del combo
                        if (cuenta.charAt(j) == ' ') {
                            break;
                        }
                        //Se le suma a la variable numcuenta el caracter en la posición i
                        numcuenta += cuenta.charAt(j);
                    }
                    //Una vez terminado de formarse la variable con el numero de cuenta, la asigna al campo i de la lista
                    list[i] = Integer.valueOf(numcuenta);
                }
                int enco = 0;
                //Compara el numero de cuenta en el TextField con todos los campos de la lista
                for (int i=0; i<vecl; i++) {
                    //Si lo que está en el espacio de numero de cuenta es igual al valor en i de la lista asigna 1 a enco
                    if (Integer.valueOf(TextCuenta.getText()) == list[i]) {
                        enco = 1;
                        vecl = i;
                        break;
                    }
                }
                if (enco == 1) {
                    CbCuenta.setSelectedIndex(vecl);
                    com.BloquearTodoRegistrar(CbClientes, TextID, BotonBuscar, CbCuenta, TextCuenta, BotonBuscarCuenta, BotonConfirm,
                    TextMonto, TextNombreResp, TextDetalle, RadioDepo, RadioReti);
                    ActualizarSigno(""+CbCuenta.getSelectedItem());
                } else {
                    if (mdcu.BuscarCuenta(TextCuenta.getText()) == 1) {
                        JOptionPane.showMessageDialog(null, "La cuenta está bajo el dominio de otro cliente", "Error de Solicitud", JOptionPane.WARNING_MESSAGE);
                    } else
                        JOptionPane.showMessageDialog(null, "La cuenta no existe.", "Error de Solicitud", JOptionPane.WARNING_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "La cuenta está inactiva.\n\nNinguna transacción puede ser realizada.", "Error de Solicitud", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BotonBuscarCuentaActionPerformed

    private void CbCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbCuentaActionPerformed
        String cuenta = ""+CbCuenta.getSelectedItem();
        String numcuenta = "";
        int i=0;
        do {
            if (cuenta.charAt(i) >= 0 || cuenta.charAt(i) <= 9)
                numcuenta += cuenta.charAt(i);
            i++;
        } while (cuenta.charAt(i) != ' ');
        TextCuenta.setText(""+numcuenta);
    }//GEN-LAST:event_CbCuentaActionPerformed

    private void BotonConsultarOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConsultarOActionPerformed
        if (CbCuenta.getItemCount() == 0) {
            if (CbClientes.isEnabled() == true) {
                JOptionPane.showMessageDialog(null, "No se ha seleccionado un cliente por consultar", "Error de Solicitud", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "El cliente no tiene cuentas registradas", "Error de Solicitud", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            CbCuenta.setSelectedIndex(0);
            com.ConsultarOtraCuenta(TextCuenta, TextMonto, TextNombreResp, TextDetalle, Signo, TipoMov);
            com.DesbloquearRegistrar(CbClientes, TextID, BotonBuscar, CbCuenta, TextCuenta, BotonBuscarCuenta, BotonConfirm,
            TextMonto, TextNombreResp, TextDetalle, RadioDepo, RadioReti);
        }
    }//GEN-LAST:event_BotonConsultarOActionPerformed

    private void BotonConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConfirmActionPerformed
        String TiMo;
        
        if (RadioDepo.isSelected() == true)
            TiMo = "Depósito";
        else
            TiMo = "Retiro";
            
        if (TiMo.equals("Retiro")) {
            if (TextMonto.getText().equals("") || TipoMov.getSelection() == null || TextNombreResp.getText().equals("") || TextDetalle.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Faltan datos por ingresar.", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (mdm.ComprobarSaldo(TextCuenta.getText()) < Integer.valueOf(TextMonto.getText()) || Integer.valueOf(TextMonto.getText()) == 0) {
                JOptionPane.showMessageDialog(null, "La cantidad especificada para retirar supera el saldo de la cuenta.", "Error de Solicitud", JOptionPane.ERROR_MESSAGE);
            } else {
                if (mdm.RegistrarMove(TextCuenta.getText(), TextFecha.getText(), TiMo, TextMonto.getText(), TextNombreResp.getText(), TextDetalle.getText()) == true) {
                    System.out.println("Se hará la transacción a la cuenta "+TextCuenta.getText()+" con monto "+TextMonto.getText()+" de tipo "+TiMo);
                    mdcu.TransaccionCuenta(TextCuenta.getText(), TextMonto.getText(), TiMo);
                    JOptionPane.showMessageDialog(null, "Transacción realizada correctamente.", "Solicitud de Transacción", JOptionPane.INFORMATION_MESSAGE);
                    com.DesbloquearRegistrar(CbClientes, TextID, BotonBuscar, CbCuenta, TextCuenta, BotonBuscarCuenta, BotonConfirm,
                    TextMonto, TextNombreResp, TextDetalle, RadioDepo, RadioReti);
                    com.ConsultarOtraCuenta(TextCuenta, TextMonto, TextNombreResp, TextDetalle, Signo, TipoMov);
                    int in = CbCuenta.getSelectedIndex();
                    try {
                        CbCuenta.removeAllItems();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    mdcu.CargarCbCuentas(CbCuenta, TextID.getText());
                    CbCuenta.setSelectedIndex(in);
                }
                else {
                    JOptionPane.showMessageDialog(null, "La transacción no pudo ser realizada debido a un error externo.", "Error de Solicitud", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else if (TiMo.equals("Depósito")) {
            if (TextMonto.getText().equals("") || TipoMov.getSelection() == null || TextNombreResp.getText().equals("") || TextDetalle.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Faltan datos por ingresar.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                if (mdm.RegistrarMove(TextCuenta.getText(), TextFecha.getText(), TiMo, TextMonto.getText(), TextNombreResp.getText(), TextDetalle.getText()) == true) {
                    System.out.println("Se hará la transacción a la cuenta "+TextCuenta.getText()+" con monto "+TextMonto.getText()+" de tipo "+TiMo);
                    mdcu.TransaccionCuenta(TextCuenta.getText(), TextMonto.getText(), TiMo);
                    mb.IngresarBitacora(cocl.DBFecha(fs.fecha()), Vista_Principal.Iniciar_Sesion.pUser, "El usuario registró una transacción para la cuenta "+TextCuenta.getText());
                    JOptionPane.showMessageDialog(null, "Transacción realizada correctamente.", "Solicitud de Transacción", JOptionPane.INFORMATION_MESSAGE);
                    com.DesbloquearRegistrar(CbClientes, TextID, BotonBuscar, CbCuenta, TextCuenta, BotonBuscarCuenta, BotonConfirm,
                    TextMonto, TextNombreResp, TextDetalle, RadioDepo, RadioReti);
                    com.ConsultarOtraCuenta(TextCuenta, TextMonto, TextNombreResp, TextDetalle, Signo, TipoMov);
                    int in = CbCuenta.getSelectedIndex();
                    try {
                        CbCuenta.removeAllItems();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    mdcu.CargarCbCuentas(CbCuenta, TextID.getText());
                    CbCuenta.setSelectedIndex(in);
                }
                else {
                    JOptionPane.showMessageDialog(null, "La transacción no pudo ser realizada debido a un error externo.", "Error de Solicitud", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No ha seleccionado el tipo de transacción.", "Error de Solicitud", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BotonConfirmActionPerformed

    private void BotonRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegresarMouseClicked
        Vista_Principal.MenuPrincipal nw = new MenuPrincipal();
        nw.show(); this.hide(); this.dispose();
    }//GEN-LAST:event_BotonRegresarMouseClicked

    private void TextCuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextCuentaKeyTyped
        V.soloNumeros(evt);
    }//GEN-LAST:event_TextCuentaKeyTyped

    private void TextIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextIDKeyTyped
        V.soloNumeros(evt);
    }//GEN-LAST:event_TextIDKeyTyped

    private void TextMontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextMontoKeyTyped
        V.soloNumeros(evt);
    }//GEN-LAST:event_TextMontoKeyTyped

    public void CargarCuentas() {
        mdcu.CargarCbCuentas(CbCuenta, TextID.getText());
    }
    
    public void ActualizarSigno(String cuenta) {
        String tipmon="";
        int esp=0;
        for (int i = 0; i < cuenta.length(); i++) {
            if (cuenta.charAt(i) == ' ') {
                if (esp == 4) {
                    break;
                }
                esp++;
                i++;
            }
            if (esp == 4) {
                tipmon += cuenta.charAt(i);
            }
        }
        if (tipmon.equals("Colones"))
            Signo.setText("¢");
        else
            Signo.setText("$");
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar_Moves().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonBuscarCuenta;
    private javax.swing.JButton BotonConfirm;
    private javax.swing.JButton BotonConsultarO;
    private javax.swing.JButton BotonLimpiar;
    private javax.swing.JLabel BotonRegresar;
    private javax.swing.JComboBox<String> CbClientes;
    private javax.swing.JComboBox<String> CbCuenta;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Email1;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel ID1;
    private javax.swing.JLabel ID2;
    private javax.swing.JLabel ID3;
    private javax.swing.JLabel Name;
    private javax.swing.JRadioButton RadioDepo;
    private javax.swing.JRadioButton RadioReti;
    private javax.swing.JLabel Signo;
    private javax.swing.JTextField TextCuenta;
    private javax.swing.JTextField TextDetalle;
    private javax.swing.JTextField TextFecha;
    private javax.swing.JTextField TextID;
    private javax.swing.JTextField TextMonto;
    private javax.swing.JTextField TextNombreResp;
    private javax.swing.ButtonGroup TipoMov;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
