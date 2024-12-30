package Gestion_Cuentas;

import Modelos.Modelo_Datos_Clientes;
import Modelos.Modelo_Datos_Cuentas;
import Modelos.Modelo_Bitacoras;
import Utilitario_Validaciones.Fecha_Sistema;
import Control_Objetos.Control_Objetos_Cuentas;
import Control_Objetos.Control_Objetos_Clientes;
import Vista_Principal.MenuPrincipal;
import java.awt.Color;
import javax.swing.JOptionPane;
import Utilitario_Validaciones.Validaciones;

public class Registrar_Cuentas extends javax.swing.JFrame {
    
    Modelo_Datos_Clientes mdcl = new Modelo_Datos_Clientes();
    Modelo_Datos_Cuentas mdcu = new Modelo_Datos_Cuentas();
    Modelo_Bitacoras mb = new Modelo_Bitacoras();
    Fecha_Sistema fs = new Fecha_Sistema();
    Control_Objetos_Clientes cocl = new Control_Objetos_Clientes();
    Control_Objetos_Cuentas cocu = new Control_Objetos_Cuentas();
    Validaciones V = new Validaciones();

    public Registrar_Cuentas() {
        initComponents();
        cocu.BloquearRegistrar(CbClientes, TextID, RadioCorriente, RadioAhorro, RadioColones, RadioDolar, TextMonto, BotonConfirmar, BotonBuscar, BotonRegistrar);
        mdcl.CargarCbClientes(CbClientes);
        jXDatePicker1.setFormats(new String[]{"dd-MM-yyyy"});
        jXDatePicker1.getEditor().setBackground(new java.awt.Color(0, 74, 114));
        jXDatePicker1.getEditor().setForeground(Color.WHITE);
        jXDatePicker1.getEditor().setEditable(false);
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
        BotonRegistrar = new javax.swing.JButton();
        BotonRegresar = new javax.swing.JLabel();
        TextMonto = new javax.swing.JTextField();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        RadioCorriente = new javax.swing.JRadioButton();
        RadioAhorro = new javax.swing.JRadioButton();
        RadioColones = new javax.swing.JRadioButton();
        RadioDolar = new javax.swing.JRadioButton();
        ID1 = new javax.swing.JLabel();
        CbClientes = new javax.swing.JComboBox<>();
        BotonConfirmar = new javax.swing.JButton();
        TextID = new javax.swing.JTextField();
        BotonBuscar = new javax.swing.JButton();
        Signo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bancos Felits - Registro de Cuentas");

        jPanel1.setBackground(new java.awt.Color(0, 28, 56));

        Title.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Registro de Cuentas");

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
        BotonLimpiar.setText("Limpiar");
        BotonLimpiar.setFocusPainted(false);
        BotonLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BotonLimpiar.setIconTextGap(0);
        BotonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLimpiarActionPerformed(evt);
            }
        });

        BotonRegistrar.setBackground(new java.awt.Color(0, 98, 152));
        BotonRegistrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BotonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        BotonRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/White_Register.png"))); // NOI18N
        BotonRegistrar.setText("Registrar");
        BotonRegistrar.setFocusPainted(false);
        BotonRegistrar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BotonRegistrar.setIconTextGap(0);
        BotonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarActionPerformed(evt);
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

        TextMonto.setBackground(new java.awt.Color(0, 74, 114));
        TextMonto.setForeground(new java.awt.Color(255, 255, 255));
        TextMonto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextMonto.setCaretColor(new java.awt.Color(255, 255, 255));
        TextMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextMontoKeyTyped(evt);
            }
        });

        jXDatePicker1.setBackground(new java.awt.Color(152, 0, 0));

        RadioCorriente.setBackground(new java.awt.Color(0, 28, 56));
        TipoCuenta.add(RadioCorriente);
        RadioCorriente.setForeground(new java.awt.Color(255, 255, 255));
        RadioCorriente.setText("Corriente");
        RadioCorriente.setFocusPainted(false);
        RadioCorriente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioCorrienteActionPerformed(evt);
            }
        });

        RadioAhorro.setBackground(new java.awt.Color(0, 28, 56));
        TipoCuenta.add(RadioAhorro);
        RadioAhorro.setForeground(new java.awt.Color(255, 255, 255));
        RadioAhorro.setText("Ahorro");
        RadioAhorro.setFocusPainted(false);
        RadioAhorro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioAhorroActionPerformed(evt);
            }
        });

        RadioColones.setBackground(new java.awt.Color(0, 28, 56));
        TipoMoneda.add(RadioColones);
        RadioColones.setForeground(new java.awt.Color(255, 255, 255));
        RadioColones.setText("Colones");
        RadioColones.setFocusPainted(false);
        RadioColones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioColonesActionPerformed(evt);
            }
        });

        RadioDolar.setBackground(new java.awt.Color(0, 28, 56));
        TipoMoneda.add(RadioDolar);
        RadioDolar.setForeground(new java.awt.Color(255, 255, 255));
        RadioDolar.setText("Dólares");
        RadioDolar.setFocusPainted(false);
        RadioDolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioDolarActionPerformed(evt);
            }
        });

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

        BotonConfirmar.setBackground(new java.awt.Color(0, 98, 152));
        BotonConfirmar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        BotonConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        BotonConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/CheckBlanco.png"))); // NOI18N
        BotonConfirmar.setText("Confirmar");
        BotonConfirmar.setToolTipText("");
        BotonConfirmar.setFocusPainted(false);
        BotonConfirmar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BotonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConfirmarActionPerformed(evt);
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
        BotonBuscar.setFocusPainted(false);
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });

        Signo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
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
                .addComponent(BotonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TextID)
                            .addComponent(ID1, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotonConfirmar))
                            .addComponent(CbClientes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Signo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                    .addComponent(RadioDolar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(BotonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addComponent(jSeparator2)
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
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BotonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(Email, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(Signo, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(TextMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        cocu.BloquearRegistrar(CbClientes, TextID, RadioCorriente, RadioAhorro, RadioColones, RadioDolar, TextMonto, BotonConfirmar, BotonBuscar, BotonRegistrar);
        CbClientes.setSelectedIndex(0);
        Signo.setText("-");
        cocu.LimpiarRegistrar(jXDatePicker1.getEditor(), TipoCuenta, TipoMoneda, TextMonto);
    }//GEN-LAST:event_BotonLimpiarActionPerformed

    private void BotonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConfirmarActionPerformed
        String cliente = ""+CbClientes.getSelectedItem();
        String clienteID = "";
        int i=0;
        do {
            if (cliente.charAt(i) >= 0 || cliente.charAt(i) <= 9)
                clienteID += cliente.charAt(i);
            i++;
        } while (cliente.charAt(i) != ' ');
        TextID.setText(""+clienteID);
        
        cocu.DesbloquearRegistrar(CbClientes, TextID, RadioCorriente, RadioAhorro, RadioColones, RadioDolar, TextMonto, BotonConfirmar, BotonBuscar, BotonRegistrar);
    }//GEN-LAST:event_BotonConfirmarActionPerformed

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
            String contactoID="", contacto = "";
            for (int i=0; i<CbClientes.getItemCount(); i++) {
                CbClientes.setSelectedIndex(i);
                contacto = ""+CbClientes.getSelectedItem();
                contactoID = "";
                for (int j=0; i<CbClientes.getItemAt(i).length(); j++) {
                    if (contacto.charAt(j) != ' ') {
                        contactoID += CbClientes.getItemAt(i).charAt(j);
                    }
                    else
                        break;
                }
                if (contactoID.equals(id)) {
                    CbClientes.setSelectedIndex(i);
                    break;
                }
            }
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

    private void BotonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarActionPerformed
        if ((RadioCorriente.isSelected() == true && RadioColones.isSelected() == true && Integer.valueOf(TextMonto.getText()) >= 100000) == true ||
        (RadioCorriente.isSelected() == true && RadioDolar.isSelected() == true && Integer.valueOf(TextMonto.getText()) >= 250) == true ||
        (RadioAhorro.isSelected() == true && RadioColones.isSelected() == true && Integer.valueOf(TextMonto.getText()) >= 50000) == true ||
        (RadioAhorro.isSelected() == true && RadioDolar.isSelected() == true && Integer.valueOf(TextMonto.getText()) >= 125) == true) {
            if (jXDatePicker1.getEditor().getText().equals("") || TipoCuenta.getSelection() == null || TipoMoneda.getSelection() == null || TextMonto.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Faltan datos por ingresar.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else {
                String TiCu, TiMo;
                if (RadioCorriente.isSelected() == true)
                    TiCu = "Corriente";
                else
                    TiCu = "Ahorro";
                
                if (RadioColones.isSelected() == true)
                    TiMo = "Colones";
                else
                    TiMo = "Dólares";
                
                if (mdcu.RegistrarCuenta(Integer.valueOf(TextID.getText()), cocl.DBFecha(jXDatePicker1.getEditor().getText()), TiCu, TiMo,
                TextMonto.getText()) == true) {
                    mb.IngresarBitacora(cocl.DBFecha(fs.fecha()), Vista_Principal.Iniciar_Sesion.pUser, "El usuario registró una cuenta a nombre del cliente "+TextID.getText());
                    JOptionPane.showMessageDialog(null, "Cuenta registrada correctamente.", "Solicitud de Registro", JOptionPane.INFORMATION_MESSAGE);
                    cocu.BloquearRegistrar(CbClientes, TextID, RadioCorriente, RadioAhorro, RadioColones, RadioDolar, TextMonto, BotonConfirmar, BotonBuscar, BotonRegistrar);
                    cocu.LimpiarRegistrar(jXDatePicker1.getEditor(), TipoCuenta, TipoMoneda, TextMonto);
                    Signo.setText("-");
                    CbClientes.setSelectedIndex(0);
                }
                else {
                    JOptionPane.showMessageDialog(null, "La cuenta no pudo ser registrado debido a un error externo.", "Error de Solicitud", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            if (RadioCorriente.isSelected() == true && RadioColones.isSelected() == true && Integer.valueOf(TextMonto.getText()) < 100000 == true)
                JOptionPane.showMessageDialog(null, "El monto mínimo para una cuenta corriente en colones es ¢100000.", "Error de Solicitud", JOptionPane.ERROR_MESSAGE);
            if (RadioCorriente.isSelected() == true && RadioDolar.isSelected() == true && Integer.valueOf(TextMonto.getText()) < 250 == true)
                JOptionPane.showMessageDialog(null, "El monto mínimo para una cuenta corriente en dólares es $250.", "Error de Solicitud", JOptionPane.ERROR_MESSAGE);
            if (RadioAhorro.isSelected() == true && RadioColones.isSelected() == true && Integer.valueOf(TextMonto.getText()) < 50000 == true)
                JOptionPane.showMessageDialog(null, "El monto mínimo para una cuenta de ahorro en colones es ¢50000.", "Error de Solicitud", JOptionPane.ERROR_MESSAGE);
            if (RadioAhorro.isSelected() == true && RadioDolar.isSelected() == true && Integer.valueOf(TextMonto.getText()) < 125 == true)
                JOptionPane.showMessageDialog(null, "El monto mínimo para una cuenta de ahorro en dólares es $125.", "Error de Solicitud", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BotonRegistrarActionPerformed

    private void RadioColonesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioColonesActionPerformed
        Signo.setText("¢");
        ActualizarMontoApertura();
    }//GEN-LAST:event_RadioColonesActionPerformed

    private void RadioDolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioDolarActionPerformed
        Signo.setText("$");
        ActualizarMontoApertura();
    }//GEN-LAST:event_RadioDolarActionPerformed

    private void RadioCorrienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioCorrienteActionPerformed
        ActualizarMontoApertura();
    }//GEN-LAST:event_RadioCorrienteActionPerformed

    private void RadioAhorroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioAhorroActionPerformed
        ActualizarMontoApertura();
    }//GEN-LAST:event_RadioAhorroActionPerformed

    private void BotonRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegresarMouseClicked
        Vista_Principal.MenuPrincipal nw = new MenuPrincipal();
        nw.show(); this.hide(); this.dispose();
    }//GEN-LAST:event_BotonRegresarMouseClicked

    private void TextIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextIDKeyTyped
        V.soloNumeros(evt);
    }//GEN-LAST:event_TextIDKeyTyped

    private void TextMontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextMontoKeyTyped
        V.soloNumeros(evt);
    }//GEN-LAST:event_TextMontoKeyTyped

    public void ActualizarMontoApertura() {
        if (RadioCorriente.isSelected() == true) {
            if (RadioColones.isSelected() == true) {
                TextMonto.setText("100000");
            } else if (RadioDolar.isSelected() == true) {
                TextMonto.setText("250");
            }
        } else if (RadioAhorro.isSelected() == true) {
            if (RadioColones.isSelected() == true) {
                TextMonto.setText("50000");
            } else if (RadioDolar.isSelected() == true) {
                TextMonto.setText("125");
            }
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar_Cuentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonConfirmar;
    private javax.swing.JButton BotonLimpiar;
    private javax.swing.JButton BotonRegistrar;
    private javax.swing.JLabel BotonRegresar;
    private javax.swing.JComboBox<String> CbClientes;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel ID1;
    private javax.swing.JLabel Name;
    private javax.swing.JRadioButton RadioAhorro;
    private javax.swing.JRadioButton RadioColones;
    private javax.swing.JRadioButton RadioCorriente;
    private javax.swing.JRadioButton RadioDolar;
    private javax.swing.JLabel Signo;
    private javax.swing.JLabel Tel;
    private javax.swing.JTextField TextID;
    private javax.swing.JTextField TextMonto;
    private javax.swing.ButtonGroup TipoCuenta;
    private javax.swing.ButtonGroup TipoMoneda;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    // End of variables declaration//GEN-END:variables
}
