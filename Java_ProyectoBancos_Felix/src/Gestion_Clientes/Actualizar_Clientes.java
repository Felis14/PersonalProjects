package Gestion_Clientes;

import Control_Objetos.Control_Objetos_Clientes;
import Modelos.Modelo_Datos_Clientes;
import Modelos.Modelo_Bitacoras;
import Vista_Principal.MenuPrincipal;
import java.awt.Color;
import javax.swing.JOptionPane;
import Utilitario_Validaciones.Validaciones;
import java.awt.event.KeyEvent;

public class Actualizar_Clientes extends javax.swing.JFrame {
    
    Control_Objetos_Clientes cocl = new Control_Objetos_Clientes();
    Modelo_Datos_Clientes mdcl = new Modelo_Datos_Clientes();
    Modelo_Bitacoras mb = new Modelo_Bitacoras();
    Validaciones V = new Validaciones();

    public Actualizar_Clientes() {
        initComponents();
        jXDatePicker1.setFormats(new String[]{"dd-MM-yyyy"});
        mdcl.CargarCbClientes(CbClientes);
        cocl.LimpiarConsultar(TextID, TextName, TextTel, TextDir, TextEmail, TextFechaAnt);
        cocl.BloquearObjetosActualizar(CbClientes, TextID, TextName, TextTel, TextDir, TextEmail, BotonBuscar, BotonActualizar);
        jXDatePicker1.getEditor().setBackground(new java.awt.Color(0, 98, 152));
        jXDatePicker1.getEditor().setForeground(Color.WHITE);
        jXDatePicker1.getEditor().setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        ID = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        Tel = new javax.swing.JLabel();
        Dir = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        FechaReg = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        BotonLimpiar = new javax.swing.JButton();
        BotonActualizar = new javax.swing.JButton();
        TextID = new javax.swing.JTextField();
        TextName = new javax.swing.JTextField();
        TextTel = new javax.swing.JTextField();
        TextDir = new javax.swing.JTextField();
        TextEmail = new javax.swing.JTextField();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        BotonBuscar = new javax.swing.JButton();
        ID1 = new javax.swing.JLabel();
        CbClientes = new javax.swing.JComboBox<>();
        TextFechaAnt = new javax.swing.JTextField();
        BotonRegresar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bancos Felits - Actualización de Clientes");

        jPanel1.setBackground(new java.awt.Color(0, 28, 56));

        Title.setFont(new java.awt.Font("Segoe UI", 1, 23)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Actualización de Clientes");

        jSeparator1.setForeground(new java.awt.Color(0, 98, 152));

        ID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ID.setForeground(new java.awt.Color(255, 255, 255));
        ID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ID.setText("Identificación:");

        Name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 255, 255));
        Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Name.setText("Nombre:");

        Tel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Tel.setForeground(new java.awt.Color(255, 255, 255));
        Tel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tel.setText("Teléfono:");

        Dir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Dir.setForeground(new java.awt.Color(255, 255, 255));
        Dir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Dir.setText("Dirección:");

        Email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Email.setForeground(new java.awt.Color(255, 255, 255));
        Email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Email.setText("Correo:");

        FechaReg.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        FechaReg.setForeground(new java.awt.Color(255, 255, 255));
        FechaReg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FechaReg.setText("Fecha Registro:");

        jSeparator2.setForeground(new java.awt.Color(0, 98, 152));

        BotonLimpiar.setBackground(new java.awt.Color(0, 98, 152));
        BotonLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        BotonLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        BotonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/White_TrashCan.png"))); // NOI18N
        BotonLimpiar.setText("Limpiar");
        BotonLimpiar.setToolTipText("Borra todo los campos.");
        BotonLimpiar.setFocusPainted(false);
        BotonLimpiar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BotonLimpiar.setIconTextGap(2);
        BotonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLimpiarActionPerformed(evt);
            }
        });

        BotonActualizar.setBackground(new java.awt.Color(0, 98, 152));
        BotonActualizar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        BotonActualizar.setForeground(new java.awt.Color(255, 255, 255));
        BotonActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/White_Register.png"))); // NOI18N
        BotonActualizar.setText("Actualizar");
        BotonActualizar.setToolTipText("Actualiza al cliente seleccionado.");
        BotonActualizar.setFocusPainted(false);
        BotonActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BotonActualizar.setIconTextGap(2);
        BotonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActualizarActionPerformed(evt);
            }
        });

        TextID.setBackground(new java.awt.Color(0, 98, 152));
        TextID.setForeground(new java.awt.Color(255, 255, 255));
        TextID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextID.setCaretColor(new java.awt.Color(255, 255, 255));
        TextID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextIDKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextIDKeyTyped(evt);
            }
        });

        TextName.setBackground(new java.awt.Color(0, 98, 152));
        TextName.setForeground(new java.awt.Color(255, 255, 255));
        TextName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextName.setCaretColor(new java.awt.Color(255, 255, 255));
        TextName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextNameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextNameKeyTyped(evt);
            }
        });

        TextTel.setBackground(new java.awt.Color(0, 98, 152));
        TextTel.setForeground(new java.awt.Color(255, 255, 255));
        TextTel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextTel.setCaretColor(new java.awt.Color(255, 255, 255));
        TextTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextTelKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextTelKeyTyped(evt);
            }
        });

        TextDir.setBackground(new java.awt.Color(0, 98, 152));
        TextDir.setForeground(new java.awt.Color(255, 255, 255));
        TextDir.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextDir.setCaretColor(new java.awt.Color(255, 255, 255));
        TextDir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextDirKeyPressed(evt);
            }
        });

        TextEmail.setBackground(new java.awt.Color(0, 98, 152));
        TextEmail.setForeground(new java.awt.Color(255, 255, 255));
        TextEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextEmail.setCaretColor(new java.awt.Color(255, 255, 255));
        TextEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextEmailKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextEmailKeyTyped(evt);
            }
        });

        jXDatePicker1.setBackground(new java.awt.Color(0, 98, 152));

        BotonBuscar.setBackground(new java.awt.Color(0, 98, 152));
        BotonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/White_Lens.png"))); // NOI18N
        BotonBuscar.setToolTipText("Busca la identificación en el sistema.");
        BotonBuscar.setFocusPainted(false);
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });

        ID1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        ID1.setForeground(new java.awt.Color(255, 255, 255));
        ID1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ID1.setText("Clientes Registrados:");

        CbClientes.setBackground(new java.awt.Color(0, 98, 152));
        CbClientes.setForeground(new java.awt.Color(255, 255, 255));
        CbClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbClientesActionPerformed(evt);
            }
        });
        CbClientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CbClientesKeyPressed(evt);
            }
        });

        TextFechaAnt.setEditable(false);
        TextFechaAnt.setBackground(new java.awt.Color(0, 98, 152));
        TextFechaAnt.setForeground(new java.awt.Color(255, 255, 255));
        TextFechaAnt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextFechaAnt.setCaretColor(new java.awt.Color(255, 255, 255));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BotonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(Title)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextName))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Tel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextTel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Dir, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextDir))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextEmail))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(FechaReg, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextFechaAnt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ID1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CbClientes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(BotonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(BotonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ID1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextName, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextTel, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextDir, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FechaReg, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(TextFechaAnt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jXDatePicker1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        //else {
            if (mdcl.BuscarID(TextID.getText()) == 1) {
                JOptionPane.showMessageDialog(null, "Cliente encontrado, se mostrarán sus datos", "Solicitud realizada", JOptionPane.INFORMATION_MESSAGE);
                mdcl.MostrarDatos(TextID.getText(), TextName, TextTel, TextDir, TextEmail, TextFechaAnt);
                jXDatePicker1.getEditor().setText(TextFechaAnt.getText());
                cocl.DesbloquearObjetosActualizar(CbClientes, TextID, TextName, TextTel, TextDir, TextEmail, BotonBuscar, BotonActualizar);
     
                //Ciclo para que cuando se busque una identificacion usando solo el TextField, que el combo box cambie a la identificacion que se buscó
                //Asigna a la variable id la identificacion que se buscó
                String id=TextID.getText();
                //Contacto será igual a todo el texto en el item del combo box, contactoID solo almacenará la identificación mediante un ciclo
                String contactoID="", contacto = "";
                //De 0 hasta la cantidad de items del combo box
                for (int i=0; i<CbClientes.getItemCount(); i++) {
                    //Se selecciona en el combo box el item en el indice i
                    CbClientes.setSelectedIndex(i);
                    //Se le asigna a contacto lo que está en el item Ej: 1 - Felix Barboza Soto
                    contacto = ""+CbClientes.getSelectedItem();
                    //Se reinicia contactoID
                    contactoID = "";
                    //Recorre todo el texto del item
                    for (int j=0; i<CbClientes.getItemAt(i).length(); j++) {
                        //Si el caracter en la posicion j no es un espacio vacio
                        if (contacto.charAt(j) != ' ') {
                        //Suma el caracter numerico a la variable contactoID
                        contactoID += CbClientes.getItemAt(i).charAt(j);
                        }
                        //Si el caracter si es un espacio vacio
                        else
                        break; //Rompe el ciclo
                    }
                    //Si la ID del contacto es igual a la ID que se buscó en primer lugar
                    if (contactoID.equals(id)) {
                    //Se selecciona el item del combo box con el que se quedó el primer ciclo (i)
                    CbClientes.setSelectedIndex(i);
                    break; //Y rompe el ciclo
                    }
                }
                TextName.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "El cliente no está registrado.", "Estado", JOptionPane.WARNING_MESSAGE);
                cocl.LimpiarRegistrar(TextID, TextName, TextTel, TextDir, TextEmail);
                TextID.requestFocus();
            }
        //}
    }//GEN-LAST:event_BotonBuscarActionPerformed

    private void CbClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbClientesActionPerformed
        //Contacto almacena lo que esté en el item seleccionado del combo box
        String contacto = ""+CbClientes.getSelectedItem();
        //contactID solo almacenará la ID
        String contactID = "";
        int i=0;
        //Mientras que el caracter no sea un espacio en blanco, el ciclo continua
        //Esto quiere decir, que poniendo por ejemplo "1 - Felix", el ciclo se dentendrá despues del 1
        do {
            //Si el caracter en la posicion i del contacto es un numero
            if (contacto.charAt(i) >= 0 || contacto.charAt(i) <= 9)
                //Suma a contactID el caracter en la posicion i
                contactID += contacto.charAt(i);
            //Aumenta el contador
            i++;
        } while (contacto.charAt(i) != ' ');
        //El texto en ID se actuaiza con lo que se guardó en la variable
        TextID.setText(""+contactID);
    }//GEN-LAST:event_CbClientesActionPerformed

    private void BotonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLimpiarActionPerformed
        cocl.LimpiarConsultar(TextID, TextName, TextTel, TextDir, TextEmail, TextFechaAnt);
        jXDatePicker1.getEditor().setText("");
        cocl.BloquearObjetosActualizar(CbClientes, TextID, TextName, TextTel, TextDir, TextEmail, BotonBuscar, BotonActualizar);
        TextID.requestFocus();
    }//GEN-LAST:event_BotonLimpiarActionPerformed

    private void BotonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActualizarActionPerformed
        ActualizarDatos(evt);
    }//GEN-LAST:event_BotonActualizarActionPerformed

    private void CbClientesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CbClientesKeyPressed
        char k = evt.getKeyChar();
        if (k == KeyEvent.VK_ENTER)
            BotonBuscar.doClick();
    }//GEN-LAST:event_CbClientesKeyPressed

    private void TextIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextIDKeyTyped
        V.soloNumeros(evt);
    }//GEN-LAST:event_TextIDKeyTyped

    private void TextIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextIDKeyPressed
        V.subirCursorCombo(evt, CbClientes);
        
        char k = evt.getKeyChar();
        if (k == KeyEvent.VK_ENTER)
            BotonBuscar.doClick();
        
    }//GEN-LAST:event_TextIDKeyPressed

    private void TextNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextNameKeyPressed
        V.bajarCursorText(evt, TextTel);
        V.saltoEnterText(evt, TextTel);
    }//GEN-LAST:event_TextNameKeyPressed

    private void TextNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextNameKeyTyped
        V.soloLetras(evt);
    }//GEN-LAST:event_TextNameKeyTyped

    private void TextTelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextTelKeyPressed
        V.subirCursorText(evt, TextName);
        V.bajarCursorText(evt, TextDir);
        V.saltoEnterText(evt, TextDir);
    }//GEN-LAST:event_TextTelKeyPressed

    private void TextTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextTelKeyTyped
        V.soloNumeros(evt);

        //Asigna el caracter que se presiono en el teclado
        char k = evt.getKeyChar();
        
        //Si el campo de telefono está blanco y ponen un 0, lo consume y pone un 1
        if (TextTel.getText().isBlank()) {
            if (k == KeyEvent.VK_0) {
                evt.consume();
                TextTel.setText("1");
            }
        }
        
        //Si se presiono la tecla borrar y hay 5 digitos, borra el guion y el numero
        if (k == KeyEvent.VK_BACK_SPACE) {
            if (TextTel.getText().length() == 5) {
                String t = "";
                for (int i = 0; i < (TextTel.getText().length() - 1); i++) {
                    t += TextTel.getText().charAt(i);
                }
                TextTel.setText(t);
            }
        }
        
        //Si tiene 4 digitos, no se presiono espacio ni borrar pone el guion y despues el numero
        if (TextTel.getText().length() == 4 && k != KeyEvent.VK_BACK_SPACE && k != KeyEvent.VK_SPACE) {
            TextTel.setText(TextTel.getText()+"-");
        }
        
        //Si ya hay nueve digitos, no deja poner mas
        if (TextTel.getText().length() == 9) {
            evt.consume();
        }
    }//GEN-LAST:event_TextTelKeyTyped

    private void TextDirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextDirKeyPressed
        V.subirCursorText(evt, TextTel);
        V.bajarCursorText(evt, TextEmail);
        V.saltoEnterText(evt, TextEmail);
    }//GEN-LAST:event_TextDirKeyPressed

    private void TextEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextEmailKeyPressed
        V.subirCursorText(evt, TextDir);
    }//GEN-LAST:event_TextEmailKeyPressed

    private void TextEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextEmailKeyTyped
        V.noEspacios(evt);
    }//GEN-LAST:event_TextEmailKeyTyped

    private void BotonRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegresarMouseClicked
        Vista_Principal.MenuPrincipal nw = new MenuPrincipal();
        this.hide(); this.dispose(); nw.show();
    }//GEN-LAST:event_BotonRegresarMouseClicked

    private void BotonRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegresarMouseEntered
        BotonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/ArrowBackHover.png")));
    }//GEN-LAST:event_BotonRegresarMouseEntered

    private void BotonRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegresarMouseExited
        BotonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/ArrowBack.png")));
    }//GEN-LAST:event_BotonRegresarMouseExited

    void ActualizarDatos(java.awt.event.ActionEvent e) {
        if (TextName.getText().equals(""))
            TextName.requestFocus();
        else if (TextTel.getText().equals(""))
            TextTel.requestFocus();
        else if (TextDir.getText().equals(""))
            TextDir.requestFocus();
        else if (TextEmail.getText().equals(""))
            TextEmail.requestFocus();
        else if (jXDatePicker1.getEditor().getText().equals("")) {
            jXDatePicker1.requestFocus();
        }
        if (TextName.getText().equals("") || TextTel.getText().equals("") ||
        TextDir.getText().equals("") || TextEmail.getText().equals("") || jXDatePicker1.getEditor().getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan datos por ingresar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else {
            if (mdcl.ActualizarCliente(Integer.valueOf(TextID.getText()), TextName.getText(), TextTel.getText(), TextDir.getText(), TextEmail.getText(),
            cocl.DBFecha(jXDatePicker1.getEditor().getText())) == true) {
                mb.IngresarBitacora(cocl.DBFecha(jXDatePicker1.getEditor().getText()), Vista_Principal.Iniciar_Sesion.pUser, "El usuario actualizó al cliente "+TextID.getText());
                JOptionPane.showMessageDialog(null, "Cliente actualizado correctamente.", "Solicitud de Modificación", JOptionPane.INFORMATION_MESSAGE);
                cocl.BloquearObjetosActualizar(CbClientes, TextID, TextName, TextTel, TextDir, TextEmail, BotonBuscar, BotonActualizar);
                cocl.LimpiarConsultar(TextID, TextName, TextTel, TextDir, TextEmail, TextFechaAnt);
                jXDatePicker1.getEditor().setText("");
            }
            else {
                JOptionPane.showMessageDialog(null, "El cliente no pudo ser actualizado debido a un error externo.", "Error de Solicitud", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Actualizar_Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonActualizar;
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonLimpiar;
    private javax.swing.JLabel BotonRegresar;
    private javax.swing.JComboBox<String> CbClientes;
    private javax.swing.JLabel Dir;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel FechaReg;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel ID1;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Tel;
    private javax.swing.JTextField TextDir;
    private javax.swing.JTextField TextEmail;
    private javax.swing.JTextField TextFechaAnt;
    private javax.swing.JTextField TextID;
    private javax.swing.JTextField TextName;
    private javax.swing.JTextField TextTel;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    // End of variables declaration//GEN-END:variables
}
