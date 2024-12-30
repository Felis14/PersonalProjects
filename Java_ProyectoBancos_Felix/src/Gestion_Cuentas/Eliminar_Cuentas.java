package Gestion_Cuentas;

import Modelos.Modelo_Datos_Clientes;
import Modelos.Modelo_Datos_Cuentas;
import Modelos.Modelo_Datos_Moves;
import Modelos.Modelo_Bitacoras;
import Control_Objetos.Control_Objetos_Cuentas;
import Control_Objetos.Control_Objetos_Clientes;
import javax.swing.JOptionPane;
import Utilitario_Validaciones.Fecha_Sistema;
import Vista_Principal.MenuPrincipal;
import Utilitario_Validaciones.Validaciones;

public class Eliminar_Cuentas extends javax.swing.JFrame {
    
    Modelo_Datos_Clientes mdcl = new Modelo_Datos_Clientes();
    Modelo_Datos_Cuentas mdcu = new Modelo_Datos_Cuentas();
    Modelo_Datos_Moves mdm = new Modelo_Datos_Moves();
    Modelo_Bitacoras mb = new Modelo_Bitacoras();
    Validaciones V = new Validaciones();
    
    Fecha_Sistema fs = new Fecha_Sistema();
    
    Control_Objetos_Clientes cocl = new Control_Objetos_Clientes();
    Control_Objetos_Cuentas cocu = new Control_Objetos_Cuentas();

    public Eliminar_Cuentas() {
        initComponents();
        cocu.BloquearConsultar(CbClientes, TextID, BotonBuscar, CbCuenta, TextCuenta, BotonBuscarCuenta);
        mdcl.CargarCbClientes(CbClientes);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TipoCuenta = new javax.swing.ButtonGroup();
        TipoMoneda = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        ID = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        Tel = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        BotonLimpiar = new javax.swing.JButton();
        BotonRegresar = new javax.swing.JLabel();
        TextMonto = new javax.swing.JTextField();
        RadioCorriente = new javax.swing.JRadioButton();
        RadioAhorro = new javax.swing.JRadioButton();
        RadioColones = new javax.swing.JRadioButton();
        RadioDolar = new javax.swing.JRadioButton();
        ID1 = new javax.swing.JLabel();
        CbClientes = new javax.swing.JComboBox<>();
        TextID = new javax.swing.JTextField();
        BotonBuscar = new javax.swing.JButton();
        Signo = new javax.swing.JLabel();
        ID2 = new javax.swing.JLabel();
        TextFecha = new javax.swing.JTextField();
        TextCuenta = new javax.swing.JTextField();
        BotonBuscarCuenta = new javax.swing.JButton();
        ID3 = new javax.swing.JLabel();
        TextSaldo = new javax.swing.JTextField();
        Email1 = new javax.swing.JLabel();
        TextEstado = new javax.swing.JTextField();
        CbCuenta = new javax.swing.JComboBox<>();
        BotonConsultarO = new javax.swing.JButton();
        BotonDel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bancos Felits - Eliminación de Cuentas");

        jPanel1.setBackground(new java.awt.Color(0, 28, 56));

        Title.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Eliminación de Cuentas");

        jSeparator1.setForeground(new java.awt.Color(0, 98, 152));

        ID.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        ID.setForeground(new java.awt.Color(255, 255, 255));
        ID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ID.setText("Fecha de Apertura:");

        Name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 255, 255));
        Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Name.setText("Tipo de Cuenta:");

        Tel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Tel.setForeground(new java.awt.Color(255, 255, 255));
        Tel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tel.setText("Tipo de Moneda:");

        Email.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Email.setForeground(new java.awt.Color(255, 255, 255));
        Email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Email.setText("Monto de Apertura:");

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

        TextMonto.setEditable(false);
        TextMonto.setBackground(new java.awt.Color(0, 74, 114));
        TextMonto.setForeground(new java.awt.Color(255, 255, 255));
        TextMonto.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        RadioCorriente.setBackground(new java.awt.Color(0, 28, 56));
        TipoCuenta.add(RadioCorriente);
        RadioCorriente.setForeground(new java.awt.Color(255, 255, 255));
        RadioCorriente.setText("Corriente");
        RadioCorriente.setEnabled(false);
        RadioCorriente.setFocusPainted(false);

        RadioAhorro.setBackground(new java.awt.Color(0, 28, 56));
        TipoCuenta.add(RadioAhorro);
        RadioAhorro.setForeground(new java.awt.Color(255, 255, 255));
        RadioAhorro.setText("Ahorro");
        RadioAhorro.setEnabled(false);
        RadioAhorro.setFocusPainted(false);

        RadioColones.setBackground(new java.awt.Color(0, 28, 56));
        TipoMoneda.add(RadioColones);
        RadioColones.setForeground(new java.awt.Color(255, 255, 255));
        RadioColones.setText("Colones");
        RadioColones.setEnabled(false);
        RadioColones.setFocusPainted(false);

        RadioDolar.setBackground(new java.awt.Color(0, 28, 56));
        TipoMoneda.add(RadioDolar);
        RadioDolar.setForeground(new java.awt.Color(255, 255, 255));
        RadioDolar.setText("Dólares");
        RadioDolar.setEnabled(false);
        RadioDolar.setFocusPainted(false);

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
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });

        Signo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Signo.setForeground(new java.awt.Color(255, 255, 255));
        Signo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Signo.setText("-");

        ID2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        ID2.setForeground(new java.awt.Color(255, 255, 255));
        ID2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ID2.setText("Número de Cuenta:");

        TextFecha.setEditable(false);
        TextFecha.setBackground(new java.awt.Color(0, 74, 114));
        TextFecha.setForeground(new java.awt.Color(255, 255, 255));
        TextFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        TextCuenta.setBackground(new java.awt.Color(0, 74, 114));
        TextCuenta.setForeground(new java.awt.Color(255, 255, 255));
        TextCuenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextCuentaKeyTyped(evt);
            }
        });

        BotonBuscarCuenta.setBackground(new java.awt.Color(0, 98, 152));
        BotonBuscarCuenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BotonBuscarCuenta.setForeground(new java.awt.Color(255, 255, 255));
        BotonBuscarCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/White_Lens.png"))); // NOI18N
        BotonBuscarCuenta.setText("Buscar Cuenta");
        BotonBuscarCuenta.setFocusPainted(false);
        BotonBuscarCuenta.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BotonBuscarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarCuentaActionPerformed(evt);
            }
        });

        ID3.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        ID3.setForeground(new java.awt.Color(255, 255, 255));
        ID3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ID3.setText("Saldo:");

        TextSaldo.setEditable(false);
        TextSaldo.setBackground(new java.awt.Color(0, 74, 114));
        TextSaldo.setForeground(new java.awt.Color(255, 255, 255));
        TextSaldo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Email1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Email1.setForeground(new java.awt.Color(255, 255, 255));
        Email1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Email1.setText("Estado:");

        TextEstado.setEditable(false);
        TextEstado.setBackground(new java.awt.Color(0, 74, 114));
        TextEstado.setForeground(new java.awt.Color(255, 255, 255));
        TextEstado.setHorizontalAlignment(javax.swing.JTextField.CENTER);

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
        BotonConsultarO.setText("Consultar otra");
        BotonConsultarO.setToolTipText("Consultar otra cuenta del mismo cliente.");
        BotonConsultarO.setFocusPainted(false);
        BotonConsultarO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConsultarOActionPerformed(evt);
            }
        });

        BotonDel.setBackground(new java.awt.Color(0, 98, 152));
        BotonDel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        BotonDel.setForeground(new java.awt.Color(255, 255, 255));
        BotonDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Red_X.png"))); // NOI18N
        BotonDel.setText("Eliminar Cuenta");
        BotonDel.setFocusPainted(false);
        BotonDel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BotonDel.setIconTextGap(0);
        BotonDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ID2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                    .addComponent(ID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                    .addComponent(BotonConsultarO, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextFecha)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(TextCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BotonBuscarCuenta))
                                    .addComponent(CbCuenta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(ID1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CbClientes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(TextID)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BotonBuscar))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(ID3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextSaldo))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Signo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextMonto))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Email1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextEstado)))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(Title)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(RadioCorriente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(RadioAhorro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Tel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(RadioColones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(RadioDolar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(BotonLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonDel)
                .addGap(51, 51, 51))
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
                        .addComponent(BotonBuscarCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                        .addComponent(TextCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(RadioCorriente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RadioAhorro)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(RadioColones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RadioDolar)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TextMonto)
                        .addGap(1, 1, 1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Signo, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonDel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        cocu.LimpiarTodoConsultar(CbClientes, TextID, TextCuenta, TextFecha, TipoCuenta, TipoMoneda, Signo, TextMonto, TextSaldo, TextEstado);
        cocu.BloquearConsultar(CbClientes, TextID, BotonBuscar, CbCuenta, TextCuenta, BotonBuscarCuenta);
        BotonDel.setEnabled(false);
        
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
            if (CbCuenta.getItemCount() > 0) {
                JOptionPane.showMessageDialog(null, "Cliente encontrado, se cargarán sus cuentas.", "Estado", JOptionPane.PLAIN_MESSAGE);
                cocu.DesbloquearConsultar(CbClientes, TextID, BotonBuscar, CbCuenta, TextCuenta, BotonBuscarCuenta);
            } else
                JOptionPane.showMessageDialog(null, "Cliente encontrado, pero no tiene ninguna cuenta registrada.", "Estado", JOptionPane.PLAIN_MESSAGE);
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
            BotonDel.setEnabled(true);
            cocu.BloquearTodoConsultar(CbClientes, TextID, BotonBuscar, CbCuenta, TextCuenta, BotonBuscarCuenta);
            mdcu.MostrarDatosCuenta(TextCuenta.getText(), TextFecha, TextSaldo, TextMonto, TextEstado, Signo, RadioCorriente, RadioAhorro, RadioColones, RadioDolar);
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
                BotonDel.setEnabled(true);
                CbCuenta.setSelectedIndex(vecl);
                mdcu.MostrarDatosCuenta(TextCuenta.getText(), TextFecha, TextSaldo, TextMonto, TextEstado, Signo, RadioCorriente, RadioAhorro, RadioColones, RadioDolar);
                cocu.BloquearTodoConsultar(CbClientes, TextID, BotonBuscar, CbCuenta, TextCuenta, BotonBuscarCuenta);
            } else {
                if (mdcu.BuscarCuenta(TextCuenta.getText()) == 1) {
                    JOptionPane.showMessageDialog(null, "La cuenta está bajo el dominio de otro cliente", "Error de Solicitud", JOptionPane.WARNING_MESSAGE);
                } else
                    JOptionPane.showMessageDialog(null, "La cuenta no existe.", "Error de Solicitud", JOptionPane.WARNING_MESSAGE);
            }
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
            BotonDel.setEnabled(false);
            cocu.LimpiarConsultar(CbCuenta, TextCuenta, TextFecha, TextSaldo, TipoCuenta, TipoMoneda, Signo, TextMonto, TextEstado);
            cocu.DesbloquearConsultar(CbClientes, TextID, BotonBuscar, CbCuenta, TextCuenta, BotonBuscarCuenta);
        }
    }//GEN-LAST:event_BotonConsultarOActionPerformed

    private void BotonDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDelActionPerformed
        if (mdcu.GetSaldoCuenta(TextCuenta.getText()) > 0) {
            JOptionPane.showMessageDialog(null, "Una cuenta solo puede ser eliminada si no tiene saldo.", "Error de Solicitud", JOptionPane.ERROR_MESSAGE);
        } else {
            if (JOptionPane.showConfirmDialog(null, "¿Está seguro que quiere eliminar esta cuenta?", "Confirmación", JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION) {
                mdm.BorrarMovimientos(TextCuenta.getText());
                mdcu.EliminarCuenta(TextCuenta.getText());
                mb.IngresarBitacora(cocl.DBFecha(fs.fecha()), Vista_Principal.Iniciar_Sesion.pUser, "El usuario eliminó a la cuenta "+TextCuenta.getText());
                if (CbCuenta.getItemCount() == 1) {
                    cocu.LimpiarTodoConsultar(CbClientes, TextID, TextCuenta, TextFecha, TipoCuenta, TipoMoneda, Signo, TextMonto, TextSaldo, TextEstado);
                } else {
                    cocu.LimpiarConsultar(CbCuenta, TextCuenta, TextFecha, TextSaldo, TipoCuenta, TipoMoneda, Signo, TextMonto, TextEstado);
                }
                cocu.DesbloquearConsultar(CbClientes, TextID, BotonBuscar, CbCuenta, TextCuenta, BotonBuscarCuenta);
                try {
                    CbCuenta.removeItemAt(CbCuenta.getSelectedIndex());
                } catch (Exception e) {
                    System.out.println(e);
                }
                JOptionPane.showMessageDialog(null, "La cuenta fue eliminada correctamente.", "Solicitud realizada", JOptionPane.PLAIN_MESSAGE);
                BotonDel.setEnabled(false);
            }
        }
    }//GEN-LAST:event_BotonDelActionPerformed

    private void BotonRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegresarMouseClicked
        Vista_Principal.MenuPrincipal nw = new MenuPrincipal();
        nw.show(); this.hide(); this.dispose();
    }//GEN-LAST:event_BotonRegresarMouseClicked

    private void TextIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextIDKeyTyped
        V.soloNumeros(evt);
    }//GEN-LAST:event_TextIDKeyTyped

    private void TextCuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextCuentaKeyTyped
        V.soloNumeros(evt);
    }//GEN-LAST:event_TextCuentaKeyTyped

    public void CargarCuentas() {
        mdcu.CargarCbCuentas(CbCuenta, TextID.getText());
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Eliminar_Cuentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonBuscarCuenta;
    private javax.swing.JButton BotonConsultarO;
    private javax.swing.JButton BotonDel;
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
    private javax.swing.JRadioButton RadioAhorro;
    private javax.swing.JRadioButton RadioColones;
    private javax.swing.JRadioButton RadioCorriente;
    private javax.swing.JRadioButton RadioDolar;
    private javax.swing.JLabel Signo;
    private javax.swing.JLabel Tel;
    private javax.swing.JTextField TextCuenta;
    private javax.swing.JTextField TextEstado;
    private javax.swing.JTextField TextFecha;
    private javax.swing.JTextField TextID;
    private javax.swing.JTextField TextMonto;
    private javax.swing.JTextField TextSaldo;
    private javax.swing.ButtonGroup TipoCuenta;
    private javax.swing.ButtonGroup TipoMoneda;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
