package Vista_Principal;

import Forms_Usuarios.Modificar_Usuarios;
import Forms_Usuarios.Eliminar_Usuarios;
import Forms_Usuarios.Registrar_Usuarios;
import Forms_Usuarios.Consultar_Usuarios;
import Forms_Contactos.Eliminar_Contactos;
import Forms_Contactos.Modificar_Contactos;
import Forms_Contactos.Consultar_Contactos;
import Forms_Contactos.Registrar_Contactos;
import Reportes.*;
import Reportes_Bitacoras.*;
import Utilitario.Fecha_Sistema;
import Utilitario.Modelo_Datos;
import javax.swing.ImageIcon;

public class Menu_Principal extends javax.swing.JFrame {

    Fecha_Sistema fs = new Fecha_Sistema();
    Modelo_Datos md = new Modelo_Datos();
    static Iniciar_Sesion is = new Iniciar_Sesion();
    
    String UserPassword, FechaCumple;
    
    public Menu_Principal() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/IMAGENES/LOGOCOLEGIOACTUAL.png")).getImage());
        jTextField3.setText(fs.fecha());
        jTextField1.setText(is.pUsername);
        jTextField2.setText(is.pNivel);
        UserPassword = is.pPass;
        bloquearopcionesmenuprincipal(jTextField2.getText());
    }
    
    //Procedimiento que bloquea opciones del menu principal segun el nivel correspondiente
    public void bloquearopcionesmenuprincipal(String nivel) {
        if (nivel.equals("Administrador")) {
            jMenuItem1.setEnabled(true); //Registrar
            jMenuItem2.setEnabled(true); //Consultar
            jMenuItem3.setEnabled(true); //Modificar
            jMenuItem4.setEnabled(true); //Eliminar
            jMenuItem5.setEnabled(true); //Registrar U
            jMenuItem6.setEnabled(true); //Consultar U
            jMenuItem7.setEnabled(true); //Modificar U
            jMenuItem8.setEnabled(true); //Eliminar U
            jMenuItem9.setEnabled(true); //Cerrar sesión
            jMenuItem10.setEnabled(true); //Salir
        }
        else if (nivel.equals("Operacional")) {
            jMenuItem1.setEnabled(true);
            jMenuItem2.setEnabled(true);
            jMenuItem3.setEnabled(false);
            jMenuItem4.setEnabled(false);
            jMenuItem5.setEnabled(true); //Registrar U
            jMenuItem6.setEnabled(true); //Consultar U
            jMenuItem7.setEnabled(false); //Modificar U
            jMenuItem8.setEnabled(false); //Eliminar U
            jMenuItem9.setEnabled(true); //Cerrar sesión
            jMenuItem10.setEnabled(true); //Salir
        }
        else {
            jMenuItem1.setEnabled(false);
            jMenuItem2.setEnabled(true);
            jMenuItem3.setEnabled(false);
            jMenuItem4.setEnabled(false);
            jMenuItem5.setEnabled(false); //Registrar U
            jMenuItem6.setEnabled(true); //Consultar U
            jMenuItem7.setEnabled(false); //Modificar U
            jMenuItem8.setEnabled(false); //Eliminar U
            jMenuItem9.setEnabled(true); //Cerrar sesión
            jMenuItem10.setEnabled(true); //Salir
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        setBackground(new java.awt.Color(0, 93, 127));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Usuario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 113, 34));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nivel Usuario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 113, 34));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(0, 47, 64));
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 192, 34));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 47, 64));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 192, 34));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/LOGOCOLEGIOACTUAL.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha Actual:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 0, 80, 30));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(0, 93, 127));
        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("0/0/0000");
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 93, 127)));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 100, 30));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos_VistaP/MenuP.png"))); // NOI18N
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 390));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 390));

        jMenuBar1.setBackground(new java.awt.Color(0, 93, 127));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        jMenu1.setBackground(new java.awt.Color(0, 93, 127));
        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Gestión de Contactos");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setBackground(new java.awt.Color(0, 93, 127));
        jMenuItem1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Usuario.png"))); // NOI18N
        jMenuItem1.setText("Registrar Contactos");
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setBackground(new java.awt.Color(0, 93, 127));
        jMenuItem2.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/busqueda (1).png"))); // NOI18N
        jMenuItem2.setText("Consultar Contactos");
        jMenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setBackground(new java.awt.Color(0, 93, 127));
        jMenuItem3.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/edit-alt-solid-24.png"))); // NOI18N
        jMenuItem3.setText("Modificar Contactos");
        jMenuItem3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem4.setBackground(new java.awt.Color(0, 93, 127));
        jMenuItem4.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/user-x-regular-24.png"))); // NOI18N
        jMenuItem4.setText("Eliminar Contactos");
        jMenuItem4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(0, 93, 127));
        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setText("Gestión de Usuarios");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem5.setBackground(new java.awt.Color(0, 93, 127));
        jMenuItem5.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Usuario.png"))); // NOI18N
        jMenuItem5.setText("Registrar Usuarios");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem6.setBackground(new java.awt.Color(0, 93, 127));
        jMenuItem6.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/busqueda (1).png"))); // NOI18N
        jMenuItem6.setText("Consultar Usuarios");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem7.setBackground(new java.awt.Color(0, 93, 127));
        jMenuItem7.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/pngwing.com.png"))); // NOI18N
        jMenuItem7.setText("Modificar Usuarios");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem8.setBackground(new java.awt.Color(0, 93, 127));
        jMenuItem8.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/user-x-regular-24.png"))); // NOI18N
        jMenuItem8.setText("Eliminar Usuarios");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuBar1.add(jMenu2);

        jMenu4.setBackground(new java.awt.Color(0, 93, 127));
        jMenu4.setForeground(new java.awt.Color(255, 255, 255));
        jMenu4.setText("Reportes");

        jMenuItem11.setBackground(new java.awt.Color(0, 93, 127));
        jMenuItem11.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/usuario_1.png"))); // NOI18N
        jMenuItem11.setText("Todos los Contactos");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);

        jMenuItem12.setBackground(new java.awt.Color(0, 93, 127));
        jMenuItem12.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/usuario_1.png"))); // NOI18N
        jMenuItem12.setText("Filtrar por Categoría");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem12);

        jMenuItem13.setBackground(new java.awt.Color(0, 93, 127));
        jMenuItem13.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/usuario_1.png"))); // NOI18N
        jMenuItem13.setText("Por Fecha de Registro");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem13);

        jMenuItem14.setBackground(new java.awt.Color(0, 93, 127));
        jMenuItem14.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/usuario_1.png"))); // NOI18N
        jMenuItem14.setText("Por Nombre");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem14);

        jMenuItem15.setBackground(new java.awt.Color(0, 93, 127));
        jMenuItem15.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/usuario_1.png"))); // NOI18N
        jMenuItem15.setText("Por Cumpleaños");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem15);

        jMenuItem16.setBackground(new java.awt.Color(0, 93, 127));
        jMenuItem16.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/usuario_1.png"))); // NOI18N
        jMenuItem16.setText("Todos los Usuarios");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem16);

        jMenuItem17.setBackground(new java.awt.Color(0, 93, 127));
        jMenuItem17.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/usuario_1.png"))); // NOI18N
        jMenuItem17.setText("Filtar por Nivel");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem17);

        jMenuBar1.add(jMenu4);

        jMenu5.setBackground(new java.awt.Color(0, 93, 127));
        jMenu5.setForeground(new java.awt.Color(255, 255, 255));
        jMenu5.setText("Registro de Cambios");

        jMenuItem18.setBackground(new java.awt.Color(0, 93, 127));
        jMenuItem18.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/usuario_1.png"))); // NOI18N
        jMenuItem18.setText("Todos los Cambios");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem18);

        jMenuItem19.setBackground(new java.awt.Color(0, 93, 127));
        jMenuItem19.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/usuario_1.png"))); // NOI18N
        jMenuItem19.setText("Filtrar por Usuario");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem19);

        jMenuItem20.setBackground(new java.awt.Color(0, 93, 127));
        jMenuItem20.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/usuario_1.png"))); // NOI18N
        jMenuItem20.setText("Filtrar por Fecha");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem20);

        jMenuBar1.add(jMenu5);

        jMenu3.setBackground(new java.awt.Color(0, 93, 127));
        jMenu3.setForeground(new java.awt.Color(255, 255, 255));
        jMenu3.setText("Salir");
        jMenu3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jMenu3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jMenuItem9.setBackground(new java.awt.Color(0, 93, 127));
        jMenuItem9.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/log-in-regular-24.png"))); // NOI18N
        jMenuItem9.setText("Cerrar Sesión");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuItem10.setBackground(new java.awt.Color(0, 93, 127));
        jMenuItem10.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/x-regular-24.png"))); // NOI18N
        jMenuItem10.setText("Salir");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem10);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Registrar_Contactos nw = new Registrar_Contactos();
        nw.show();
        this.hide();
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Consultar_Contactos nw = new Consultar_Contactos();
        nw.show();
        this.hide();
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Modificar_Contactos nw = new Modificar_Contactos();
        nw.show();
        this.hide();
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Eliminar_Contactos nw = new Eliminar_Contactos();
        nw.show();
        this.hide();
        this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Registrar_Usuarios nw = new Registrar_Usuarios();
        nw.show();
        this.hide();
        this.dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        Consultar_Usuarios nw = new Consultar_Usuarios();
        nw.show();
        this.hide();
        this.dispose();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        Modificar_Usuarios nw = new Modificar_Usuarios();
        nw.show();
        this.hide();
        this.dispose();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        Eliminar_Usuarios nw = new Eliminar_Usuarios();
        nw.show();
        this.hide();
        this.dispose();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        Todos_Los_Contactos nw = new Todos_Los_Contactos();
        nw.show(); this.hide(); this.dispose();
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        Iniciar_Sesion nw = new Iniciar_Sesion();
        nw.show(); this.hide(); this.dispose();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        Contactos_Categoria nw = new Contactos_Categoria();
        nw.show(); this.hide(); this.dispose();
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        Contactos_FechaRegistro nw = new Contactos_FechaRegistro();
        nw.show(); this.hide(); this.dispose();
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        Contactos_Nombre nw = new Contactos_Nombre();
        nw.show(); this.hide(); this.dispose();
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        Contactos_FechaCumple nw = new Contactos_FechaCumple();
        nw.show(); this.hide(); this.dispose();
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        Todos_Los_Usuarios nw = new Todos_Los_Usuarios();
        nw.show(); this.hide(); this.dispose();
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        Usuarios_Nivel nw = new Usuarios_Nivel();
        nw.show(); this.hide(); this.dispose();
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        Bitacoras_Usuario nw = new Bitacoras_Usuario();
        nw.show(); this.hide(); this.dispose();
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        Bitacoras_Todas nw = new Bitacoras_Todas();
        nw.show(); this.hide(); this.dispose();
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        Bitacoras_Fecha nw = new Bitacoras_Fecha();
        nw.show(); this.hide(); this.dispose();
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
