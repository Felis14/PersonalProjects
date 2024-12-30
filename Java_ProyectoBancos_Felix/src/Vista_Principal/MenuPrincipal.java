package Vista_Principal;

import Gestion_Clientes.*;
import Gestion_Cuentas.*;
import Gestion_Moves.*;
import Gestion_NivFun.*;
import Gestion_Usuarios.*;
import Utilitario_Validaciones.Fecha_Sistema;
import Modelos.Modelo_Datos_Niv;
import Modelos.Modelo_Bitacoras;
import Control_Objetos.Control_Objetos_Clientes;
import Reportes.*;
import java.net.ResponseCache;

public class MenuPrincipal extends javax.swing.JFrame {
    
    Fecha_Sistema fs = new Fecha_Sistema();
    Iniciar_Sesion is = new Iniciar_Sesion();
    Modelo_Datos_Niv mdn = new Modelo_Datos_Niv();
    Modelo_Bitacoras mb = new Modelo_Bitacoras();
    Control_Objetos_Clientes cocl = new Control_Objetos_Clientes();
    
    public MenuPrincipal() {
        initComponents();
        jLabel5.setText("Hoy: "+fs.fecha());
        jLabel3.setText("¡Bienvenido, "+GetPrimerNombre(Iniciar_Sesion.pName)+"!");
        jLabel4.setText("Iniciado como "+mdn.GetNivName(Iniciar_Sesion.pNivel)+".");
        mdn.AplicarNivel(Iniciar_Sesion.pUser, Iniciar_Sesion.pNivel, jMenuItem1, jMenuItem2, jMenuItem3, jMenuItem4, jMenuItem5, jMenuItem6,
        jMenuItem7, jMenuItem8, jMenuItem9, jMenuItem10, jMenuItem1, jMenuItem12, jMenuItem13, jMenuItem14,
        jMenuItem15, jMenuItem16, jMenuItem17, jMenuItem18, jMenuItem19, jMenuItem20, jMenuItem21, jMenuItem23);
    }
    
    String GetPrimerNombre(String nom) {
        String user = nom;
        String userFName = "";
        for (int i = 0; i < user.length(); i++) {
            if (nom.charAt(i) != ' ')
                userFName += user.charAt(i);
            else
                break;
        }
        return userFName;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bancos Felits - Menú Principal");

        jPanel1.setBackground(new java.awt.Color(0, 28, 56));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/TxtBanco.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Moviendo el Mundo junto a usted desde 1970");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Bienvenido");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nivel");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Hoy: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 74, 114));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        jMenu1.setBackground(new java.awt.Color(0, 28, 56));
        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Gestión Clientes");

        jMenuItem1.setBackground(new java.awt.Color(0, 98, 152));
        jMenuItem1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setText("Registrar Clientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setBackground(new java.awt.Color(0, 98, 152));
        jMenuItem2.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem2.setText("Consultar Clientes");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setBackground(new java.awt.Color(0, 98, 152));
        jMenuItem3.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem3.setText("Actualizar Clientes");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(0, 28, 56));
        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setText("Gestión Cuentas");

        jMenuItem4.setBackground(new java.awt.Color(0, 98, 152));
        jMenuItem4.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem4.setText("Registrar Cuentas");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setBackground(new java.awt.Color(0, 98, 152));
        jMenuItem5.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem5.setText("Consultar Cuentas");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setBackground(new java.awt.Color(0, 98, 152));
        jMenuItem6.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem6.setText("Activación de Cuentas");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setBackground(new java.awt.Color(0, 98, 152));
        jMenuItem7.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem7.setText("Eliminar Cuentas");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(0, 28, 56));
        jMenu3.setForeground(new java.awt.Color(255, 255, 255));
        jMenu3.setText("Gestión Transacciones");

        jMenuItem8.setBackground(new java.awt.Color(0, 98, 152));
        jMenuItem8.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem8.setText("Registrar Transacción");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem9.setBackground(new java.awt.Color(0, 98, 152));
        jMenuItem9.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem9.setText("Anular Transacción");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuItem10.setBackground(new java.awt.Color(0, 98, 152));
        jMenuItem10.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem10.setText("Consultar Transacción");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem10);

        jMenuBar1.add(jMenu3);

        jMenu4.setBackground(new java.awt.Color(0, 28, 56));
        jMenu4.setForeground(new java.awt.Color(255, 255, 255));
        jMenu4.setText("Gestión Permisos");

        jMenuItem11.setBackground(new java.awt.Color(0, 98, 152));
        jMenuItem11.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem11.setText("Registrar Niveles");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);

        jMenuItem12.setBackground(new java.awt.Color(0, 98, 152));
        jMenuItem12.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem12.setText("Registrar Funciones");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem12);

        jMenuItem23.setBackground(new java.awt.Color(0, 98, 152));
        jMenuItem23.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem23.setText("Registrar Permisos");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem23);

        jMenuBar1.add(jMenu4);

        jMenu6.setBackground(new java.awt.Color(0, 28, 56));
        jMenu6.setForeground(new java.awt.Color(255, 255, 255));
        jMenu6.setText("Gestión Usuarios");

        jMenuItem13.setBackground(new java.awt.Color(0, 98, 152));
        jMenuItem13.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem13.setText("Registrar Usuarios");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem13);

        jMenuItem14.setBackground(new java.awt.Color(0, 98, 152));
        jMenuItem14.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem14.setText("Consultar Usuarios");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem14);

        jMenuItem15.setBackground(new java.awt.Color(0, 98, 152));
        jMenuItem15.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem15.setText("Modificar Usuarios");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem15);

        jMenuItem16.setBackground(new java.awt.Color(0, 98, 152));
        jMenuItem16.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem16.setText("Activación de Usuarios");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem16);

        jMenuBar1.add(jMenu6);

        jMenu8.setBackground(new java.awt.Color(0, 28, 56));
        jMenu8.setForeground(new java.awt.Color(255, 255, 255));
        jMenu8.setText("Reportes");

        jMenuItem17.setBackground(new java.awt.Color(0, 98, 152));
        jMenuItem17.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem17.setText("Reportes Clientes");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem17);

        jMenuItem18.setBackground(new java.awt.Color(0, 98, 152));
        jMenuItem18.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem18.setText("Reportes Cuentas");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem18);

        jMenuItem19.setBackground(new java.awt.Color(0, 98, 152));
        jMenuItem19.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem19.setText("Reportes Transacciones");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem19);

        jMenuItem20.setBackground(new java.awt.Color(0, 98, 152));
        jMenuItem20.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem20.setText("Reportes Usuarios");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem20);

        jMenuItem21.setBackground(new java.awt.Color(0, 98, 152));
        jMenuItem21.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem21.setText("Reportes Bitácora");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem21);

        jMenuBar1.add(jMenu8);

        jMenu7.setBackground(new java.awt.Color(0, 28, 56));
        jMenu7.setForeground(new java.awt.Color(255, 255, 255));
        jMenu7.setText("Salir");

        jMenuItem22.setBackground(new java.awt.Color(0, 98, 152));
        jMenuItem22.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem22.setText("Cerrar Sesión");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem22);

        jMenuItem24.setBackground(new java.awt.Color(0, 98, 152));
        jMenuItem24.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem24.setText("Salir");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem24);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

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

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Gestion_Clientes.Registrar_Clientes nw = new Registrar_Clientes();
        nw.show(); this.hide(); this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Gestion_Clientes.Consultar_Clientes nw = new Consultar_Clientes();
        nw.show(); this.hide(); this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Gestion_Clientes.Actualizar_Clientes nw = new Actualizar_Clientes();
        nw.show(); this.hide(); this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Gestion_Cuentas.Registrar_Cuentas nw = new Registrar_Cuentas();
        nw.show(); this.hide(); this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Gestion_Cuentas.Consultar_Cuentas nw = new Consultar_Cuentas();
        nw.show(); this.hide(); this.dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        Gestion_Cuentas.Alternar_Cuentas nw = new Alternar_Cuentas();
        nw.show(); this.hide(); this.dispose();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        Gestion_Cuentas.Eliminar_Cuentas nw = new Eliminar_Cuentas();
        nw.show(); this.hide(); this.dispose();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        Gestion_Moves.Registrar_Moves nw = new Registrar_Moves();
        nw.show(); this.hide(); this.dispose();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        Gestion_Moves.Anular_Moves nw = new Anular_Moves();
        nw.show(); this.hide(); this.dispose();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        Gestion_Moves.Consultar_Moves nw = new Consultar_Moves();
        nw.show(); this.hide(); this.dispose();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        Gestion_NivFun.Registrar_Niveles nw = new Registrar_Niveles();
        nw.show(); this.hide(); this.dispose();
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        Gestion_NivFun.Registrar_Funciones nw = new Registrar_Funciones();
        nw.show(); this.hide(); this.dispose();
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
        Gestion_NivFun.Registrar_FunXNiv nw = new Registrar_FunXNiv();
        nw.show(); this.hide(); this.dispose();
    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        Gestion_Usuarios.Registrar_Users nw = new Registrar_Users();
        nw.show(); this.hide(); this.dispose();
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        Gestion_Usuarios.Consultar_Users nw = new Consultar_Users();
        nw.show(); this.hide(); this.dispose();
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        Gestion_Usuarios.Modificar_Users nw = new Modificar_Users();
        nw.show(); this.hide(); this.dispose();
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
        Iniciar_Sesion nw = new Iniciar_Sesion();
        nw.show(); this.hide(); this.dispose();
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
        mb.IngresarBitacora(cocl.DBFecha(fs.fecha()), Iniciar_Sesion.pUser, "El usuario "+Iniciar_Sesion.pUser+" cerró sesión.");
        System.exit(0);
    }//GEN-LAST:event_jMenuItem24ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        Activar_Users nw = new Activar_Users();
        nw.show(); this.hide(); this.dispose();
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        ReportesClientes nw = new ReportesClientes();
        nw.show(); this.hide(); this.dispose();
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        ReportesCuentas nw = new ReportesCuentas();
        nw.show(); this.hide(); this.dispose();
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        ReportesMoves nw = new ReportesMoves();
        nw.show(); this.hide(); this.dispose();
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        ReportesUsuarios nw = new ReportesUsuarios();
        nw.show(); this.hide(); this.dispose();
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        ReportesBitacora nw = new ReportesBitacora();
        nw.show(); this.hide(); this.dispose();
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
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
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
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
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
