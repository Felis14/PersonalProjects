package Gestion_Clientes;

//Importes
import Control_Objetos.Control_Objetos_Clientes;
import Modelos.Modelo_Datos_Clientes;
import Modelos.Modelo_Bitacoras;
import Vista_Principal.MenuPrincipal;
import java.awt.Color;
import javax.swing.JOptionPane;
import Utilitario_Validaciones.Validaciones;
import java.awt.event.KeyEvent;

public class Registrar_Clientes extends javax.swing.JFrame {
    
    //Instancias
    Control_Objetos_Clientes cocl = new Control_Objetos_Clientes();
    Modelo_Datos_Clientes mdcl = new Modelo_Datos_Clientes();
    Modelo_Bitacoras mb = new Modelo_Bitacoras();
    Validaciones V = new Validaciones();

    public Registrar_Clientes() {
        initComponents();
        cocl.BloquearObjetosRegistrar(TextID, TextName, TextTel, TextDir, TextEmail, BotonBuscar, BotonRegistrar);
        //Pone un formato al datepicker
        jXDatePicker1.setFormats(new String[]{"dd-MM-yyyy"});
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
        BotonRegistrar = new javax.swing.JButton();
        BotonRegresar = new javax.swing.JLabel();
        TextID = new javax.swing.JTextField();
        TextName = new javax.swing.JTextField();
        TextTel = new javax.swing.JTextField();
        TextDir = new javax.swing.JTextField();
        TextEmail = new javax.swing.JTextField();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        BotonBuscar = new javax.swing.JButton();
        BotonSig = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bancos Felits - Registro de Clientes");

        jPanel1.setBackground(new java.awt.Color(0, 28, 56));

        Title.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Registro de Clientes");

        jSeparator1.setBackground(new java.awt.Color(0, 51, 102));
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

        jSeparator2.setBackground(new java.awt.Color(0, 51, 102));
        jSeparator2.setForeground(new java.awt.Color(0, 98, 152));

        BotonLimpiar.setBackground(new java.awt.Color(0, 98, 152));
        BotonLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        BotonLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        BotonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/White_TrashCan.png"))); // NOI18N
        BotonLimpiar.setText("Limpiar");
        BotonLimpiar.setToolTipText("Limpiar los campos.");
        BotonLimpiar.setFocusPainted(false);
        BotonLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BotonLimpiar.setIconTextGap(2);
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
        BotonRegistrar.setToolTipText("Registra los datos.");
        BotonRegistrar.setFocusPainted(false);
        BotonRegistrar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BotonRegistrar.setIconTextGap(2);
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
        jXDatePicker1.setForeground(new java.awt.Color(255, 255, 255));
        jXDatePicker1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jXDatePicker1KeyPressed(evt);
            }
        });

        BotonBuscar.setBackground(new java.awt.Color(0, 98, 152));
        BotonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/White_Lens.png"))); // NOI18N
        BotonBuscar.setToolTipText("Buscar identificación.");
        BotonBuscar.setFocusPainted(false);
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });

        BotonSig.setBackground(new java.awt.Color(0, 98, 152));
        BotonSig.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BotonSig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/White_Add.png"))); // NOI18N
        BotonSig.setToolTipText("Siguiente número disponible.");
        BotonSig.setFocusPainted(false);
        BotonSig.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonSig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSigActionPerformed(evt);
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
                        .addGap(95, 95, 95)
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addComponent(BotonSig, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addComponent(jXDatePicker1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(BotonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(BotonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ID, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                    .addComponent(TextID))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BotonSig, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FechaReg, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(jXDatePicker1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 20, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
        //"Reinicia" todo, limpia los campos y los vuelve a bloquear
        cocl.LimpiarRegistrar(TextID, TextName, TextTel, TextDir, TextEmail);
        cocl.BloquearObjetosRegistrar(TextID, TextName, TextTel, TextDir, TextEmail, BotonBuscar, BotonRegistrar);
        TextID.requestFocus();
        BotonSig.setEnabled(true);
    }//GEN-LAST:event_BotonLimpiarActionPerformed

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        //Si no se ha escrito nada o solo caracteres blancos
        if (TextID.getText().isBlank())
            JOptionPane.showMessageDialog(null, "No ha digitado ninguna identificación.", "Error", JOptionPane.ERROR_MESSAGE);
        else
            BuscarCliente(evt);
    }//GEN-LAST:event_BotonBuscarActionPerformed

    private void BotonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarActionPerformed
        RegistrarCliente(evt);
    }//GEN-LAST:event_BotonRegistrarActionPerformed

    private void BotonSigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSigActionPerformed
        //Devuelve el numero minimo disponible
        TextID.setText(""+mdcl.SigNumDispo());
    }//GEN-LAST:event_BotonSigActionPerformed

    private void BotonRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegresarMouseClicked
        //Vuelve al menu
        Vista_Principal.MenuPrincipal nw = new MenuPrincipal();
        this.hide(); this.dispose(); nw.show();
    }//GEN-LAST:event_BotonRegresarMouseClicked

    private void TextIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextIDKeyPressed
        char k = evt.getKeyChar();
        if (k == KeyEvent.VK_ENTER)
            BotonBuscar.doClick();
    }//GEN-LAST:event_TextIDKeyPressed

    private void TextIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextIDKeyTyped
        char k = evt.getKeyChar();
        if (k == '+') {
            evt.consume();
            BotonSig.doClick();
            TextID.requestFocus();
        } else
            V.soloNumeros(evt);
    }//GEN-LAST:event_TextIDKeyTyped

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

        char k = evt.getKeyChar();
        
        if (TextTel.getText().isBlank()) {
            if (k == KeyEvent.VK_0) {
                evt.consume();
                TextTel.setText("1");
            }
        }
        
        if (k == KeyEvent.VK_BACK_SPACE) {
            if (TextTel.getText().length() == 5) {
                String t = "";
                for (int i = 0; i < (TextTel.getText().length() - 1); i++) {
                    t += TextTel.getText().charAt(i);
                }
                TextTel.setText(t);
            }
        }
        
        if (TextTel.getText().length() == 4 && k != KeyEvent.VK_BACK_SPACE && k != KeyEvent.VK_SPACE) {
            TextTel.setText(TextTel.getText()+"-");
        }
        
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

    private void jXDatePicker1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jXDatePicker1KeyPressed
        jXDatePicker1.requestFocus();
    }//GEN-LAST:event_jXDatePicker1KeyPressed

    //Busca los clientes
    void BuscarCliente(java.awt.event.ActionEvent evt) {
        if (mdcl.BuscarID(TextID.getText()) == 0) {
            JOptionPane.showMessageDialog(null, "El cliente no está en el sistema, puede registrarlo.", "Solicitud de Registro", JOptionPane.PLAIN_MESSAGE);
            cocl.DesbloquearObjetosRegistrar(TextID, TextName, TextTel, TextDir, TextEmail, BotonBuscar, BotonRegistrar);
            BotonSig.setEnabled(false);
            TextName.requestFocus();
        } else {
            JOptionPane.showMessageDialog(null, "El cliente ya está registrado.", "Solicitud de Registro", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    //Verifica ciertos limites y registra clientes
    void RegistrarCliente(java.awt.event.ActionEvent e) {
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
            if (mdcl.RegistrarCliente(Integer.valueOf(TextID.getText()), TextName.getText(), TextTel.getText(), TextDir.getText(), TextEmail.getText(),
            cocl.DBFecha(jXDatePicker1.getEditor().getText())) == true) {
                JOptionPane.showMessageDialog(null, "Cliente registrado correctamente.", "Solicitud de Registro", JOptionPane.INFORMATION_MESSAGE);
                mb.IngresarBitacora(cocl.DBFecha(jXDatePicker1.getEditor().getText()), Vista_Principal.Iniciar_Sesion.pUser, "El usuario registró al cliente "+TextID.getText());
                cocl.BloquearObjetosRegistrar(TextID, TextName, TextTel, TextDir, TextEmail, BotonBuscar, BotonRegistrar);
                cocl.LimpiarRegistrar(TextID, TextName, TextTel, TextDir, TextEmail);
                BotonSig.setEnabled(true);
            }
            else {
                JOptionPane.showMessageDialog(null, "El cliente no pudo ser registrado debido a un error externo.", "Error de Solicitud", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar_Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonLimpiar;
    private javax.swing.JButton BotonRegistrar;
    private javax.swing.JLabel BotonRegresar;
    private javax.swing.JButton BotonSig;
    private javax.swing.JLabel Dir;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel FechaReg;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Tel;
    private javax.swing.JTextField TextDir;
    private javax.swing.JTextField TextEmail;
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
