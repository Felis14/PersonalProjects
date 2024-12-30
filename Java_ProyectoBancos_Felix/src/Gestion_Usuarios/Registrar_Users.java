package Gestion_Usuarios;

import Control_Objetos.Control_Objetos_Users;
import Modelos.Modelo_Datos_Users;
import Modelos.Modelo_Datos_Niv;
import javax.swing.JOptionPane;
import Modelos.Modelo_Bitacoras;
import Control_Objetos.Control_Objetos_Clientes;
import Utilitario_Validaciones.Fecha_Sistema;
import Vista_Principal.MenuPrincipal;
import Utilitario_Validaciones.Validaciones;

public class Registrar_Users extends javax.swing.JFrame {
    
    Control_Objetos_Users cou = new Control_Objetos_Users();
    Modelo_Datos_Users mdu = new Modelo_Datos_Users();
    Modelo_Datos_Niv mdn = new Modelo_Datos_Niv();
    Modelo_Bitacoras mb = new Modelo_Bitacoras();
    Control_Objetos_Clientes cocl = new Control_Objetos_Clientes();
    Fecha_Sistema fs = new Fecha_Sistema();
    Validaciones V = new Validaciones();

    static int userR = 0, passR = 0;
    
    public Registrar_Users() {
        initComponents();
        mdn.CargarCbNiveles(CbNivs);
        BotonReg.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BotonRegresar2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TextUser = new javax.swing.JTextField();
        TextName = new javax.swing.JTextField();
        TextPass = new javax.swing.JPasswordField();
        TextID = new javax.swing.JTextField();
        TogContra = new javax.swing.JToggleButton();
        jSeparator2 = new javax.swing.JSeparator();
        BotonReg = new javax.swing.JButton();
        BotonLimp = new javax.swing.JButton();
        UsernameError = new javax.swing.JLabel();
        PasswordError = new javax.swing.JLabel();
        CbNivs = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bancos Felits - Registro de Usuarios");

        jPanel1.setBackground(new java.awt.Color(0, 28, 56));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrar Usuarios");

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

        jSeparator1.setForeground(new java.awt.Color(0, 98, 152));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nombre de Usuario:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Contraseña:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nivel:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Identificación:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Nombre Completo:");

        TextUser.setBackground(new java.awt.Color(0, 74, 114));
        TextUser.setForeground(new java.awt.Color(255, 255, 255));
        TextUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextUser.setCaretColor(new java.awt.Color(255, 255, 255));
        TextUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextUserFocusLost(evt);
            }
        });

        TextName.setBackground(new java.awt.Color(0, 74, 114));
        TextName.setForeground(new java.awt.Color(255, 255, 255));
        TextName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextName.setCaretColor(new java.awt.Color(255, 255, 255));
        TextName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextNameKeyTyped(evt);
            }
        });

        TextPass.setBackground(new java.awt.Color(0, 74, 114));
        TextPass.setForeground(new java.awt.Color(255, 255, 255));
        TextPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextPass.setCaretColor(new java.awt.Color(255, 255, 255));
        TextPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextPassFocusLost(evt);
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

        TogContra.setBackground(new java.awt.Color(0, 98, 152));
        TogContra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/OjoBlanco.png"))); // NOI18N
        TogContra.setToolTipText("Mostrar / Ocultar contraseña");
        TogContra.setFocusPainted(false);
        TogContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TogContraActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 98, 152));

        BotonReg.setBackground(new java.awt.Color(0, 98, 152));
        BotonReg.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        BotonReg.setForeground(new java.awt.Color(255, 255, 255));
        BotonReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/White_Register.png"))); // NOI18N
        BotonReg.setText("Registrar");
        BotonReg.setFocusPainted(false);
        BotonReg.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BotonReg.setIconTextGap(0);
        BotonReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegActionPerformed(evt);
            }
        });

        BotonLimp.setBackground(new java.awt.Color(0, 98, 152));
        BotonLimp.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        BotonLimp.setForeground(new java.awt.Color(255, 255, 255));
        BotonLimp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/White_TrashCan.png"))); // NOI18N
        BotonLimp.setText("Limpiar");
        BotonLimp.setFocusPainted(false);
        BotonLimp.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BotonLimp.setIconTextGap(0);
        BotonLimp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLimpActionPerformed(evt);
            }
        });

        UsernameError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        PasswordError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        CbNivs.setBackground(new java.awt.Color(0, 74, 114));
        CbNivs.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonRegresar2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(130, 130, 130))
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextName, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CbNivs, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TogContra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextPass))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextUser, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextID, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UsernameError, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordError, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(BotonLimp, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonReg)
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonRegresar2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(UsernameError, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(TextUser))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                .addComponent(TextPass))
                            .addComponent(TogContra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(PasswordError, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(CbNivs))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextID, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonReg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonLimp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
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

    private void BotonRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegActionPerformed
        TextID.requestFocus();
        RegUser(evt);
    }//GEN-LAST:event_BotonRegActionPerformed

    private void BotonLimpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLimpActionPerformed
        cou.LimpiarRegistrar(TextUser, TextPass, TextName, TextID, UsernameError, PasswordError);
        TextPass.setEchoChar('•');
        TogContra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/OjoBlanco.png")));
        userR = 0; passR = 0;
        permitirRegistro();
        TextUser.requestFocus();
    }//GEN-LAST:event_BotonLimpActionPerformed

    private void TogContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TogContraActionPerformed
        if (TogContra.isSelected() == true) {
            TextPass.setEchoChar((char)0);
            TogContra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/OjoCerradoBlanco.png")));
        } else {
            TextPass.setEchoChar('•');
            TogContra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/OjoBlanco.png")));
        }
        verificacionesPassword();
        permitirRegistro();
        TextPass.requestFocus();
    }//GEN-LAST:event_TogContraActionPerformed

    private void TextPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextPassFocusLost
        verificacionesPassword();
    }//GEN-LAST:event_TextPassFocusLost

    private void TextUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextUserFocusLost
        verificacionesUser();
    }//GEN-LAST:event_TextUserFocusLost

    private void TextUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextUserFocusGained
        UsernameError.setIcon(null);
        UsernameError.setToolTipText(null);
    }//GEN-LAST:event_TextUserFocusGained

    private void TextPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextPassFocusGained
        PasswordError.setIcon(null);
        PasswordError.setToolTipText(null);
    }//GEN-LAST:event_TextPassFocusGained

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

    private void TextNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextNameKeyTyped
        V.soloLetras(evt);
    }//GEN-LAST:event_TextNameKeyTyped

    private void TextIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextIDKeyTyped
        V.soloNumeros(evt);
    }//GEN-LAST:event_TextIDKeyTyped

    public void permitirRegistro() {
        if (userR == 1 && passR == 1)
            BotonReg.setEnabled(true);
        else
            BotonReg.setEnabled(false);
    }
    
    public void verificacionesPassword() {
        if (TextPass.getText().isBlank() == true) {
            PasswordError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Red_X.png")));
            PasswordError.setToolTipText("El campo no puede estar vacío.");
            passR=0;
        }
        else if (TextPass.getText().equals("root")) {
            PasswordError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Cian_Check2.png")));
            PasswordError.setToolTipText("El Universo se detiene ante esta Verdad."); passR=1;
            passR=1;
        }
        else if (TextPass.getText().length() < 6) {
            PasswordError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Red_X.png")));
            PasswordError.setToolTipText("La contraseña tiene que tener mínimo 6 caracteres.");
            passR=0;
        }
        else if (TextPass.getText().length() > 16) {
            PasswordError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Red_X.png")));
            PasswordError.setToolTipText("La contraseña no puede excederse de los 16 caracteres.");
            passR=0; 
        }
        else if (cou.ContraseñasMalas(TextPass.getText()) == 1) {
            PasswordError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Red_Idiot.png")));
            PasswordError.setToolTipText("No.");
            passR=0; 
        }
        else {
            PasswordError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Green_Check.png")));
            PasswordError.setToolTipText("La contraseña puede usarse."); passR=1;
            passR=1;
        }
        permitirRegistro();
    }
    
    void verificacionesUser() {
        if (TextUser.getText().isBlank() == true) {
            UsernameError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Red_X.png")));
            UsernameError.setToolTipText("El campo no puede estar vacío.");
            userR=0;
        }
        else if (TextUser.getText().length() < 3) {
            UsernameError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Red_X.png")));
            UsernameError.setToolTipText("El nombre de usuario tiene que tener mínimo 3 caracteres.");
            userR=0;
        }
        else if (TextUser.getText().length() > 16) {
            UsernameError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Red_X.png")));
            UsernameError.setToolTipText("El nombre de usuario no puede pasarse de los 16 caracteres.");
            userR=0;
        }
        else if (mdu.buscarusername(TextUser.getText()) == 1) {
            UsernameError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Red_X.png")));
            UsernameError.setToolTipText("El nombre de usuario ya está en uso.");
            userR=0;
        }
        else {
            UsernameError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Green_Check.png")));
            UsernameError.setToolTipText("El nombre de usuario se puede registrar.");
            userR=1;
        }
        permitirRegistro();
    }
    
    void RegUser(java.awt.event.ActionEvent evt) {
        if (TextName.getText().isBlank() == true || TextID.getText().isBlank() == true) {
            JOptionPane.showMessageDialog(null, "Faltan datos por ingresar.", "Error de solicitud", JOptionPane.WARNING_MESSAGE);
            if (TextID.getText().isBlank() == true) {
                TextID.setText(""); TextID.requestFocus();
            }
            if (TextName.getText().isBlank() == true) {
                TextName.setText(""); TextName.requestFocus();
            }
        } else {
            
            String nivel = ""+CbNivs.getSelectedItem();
            String nivelcod = "";
            int i=0;
            do {
                if (nivel.charAt(i) >= 0 || nivel.charAt(i) <= 9)
                    nivelcod += nivel.charAt(i);
                i++;
            } while (nivel.charAt(i) != ' ');
            
            if (mdu.RegistrarUser(TextUser.getText(), TextPass.getText(), TextName.getText(), nivelcod, TextID.getText())) {
                mb.IngresarBitacora(cocl.DBFecha(fs.fecha()), Vista_Principal.Iniciar_Sesion.pUser, "El usuario registró al usuario "+TextUser.getText());
                JOptionPane.showMessageDialog(null, "El usuario fue registrado correctamente.", "Solicitud realizada", JOptionPane.PLAIN_MESSAGE);
                BotonLimp.doClick();
            } else {
                JOptionPane.showMessageDialog(null, "El usuario no se ha podido registrar por un error externo.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar_Users().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonLimp;
    private javax.swing.JButton BotonReg;
    private javax.swing.JLabel BotonRegresar2;
    private javax.swing.JComboBox<String> CbNivs;
    private javax.swing.JLabel PasswordError;
    private javax.swing.JTextField TextID;
    private javax.swing.JTextField TextName;
    private javax.swing.JPasswordField TextPass;
    private javax.swing.JTextField TextUser;
    private javax.swing.JToggleButton TogContra;
    private javax.swing.JLabel UsernameError;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
