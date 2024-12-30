package Gestion_Clientes;

import Control_Objetos.Control_Objetos_Clientes;
import Modelos.Modelo_Datos_Clientes;
import Vista_Principal.MenuPrincipal;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import Utilitario_Validaciones.Validaciones;

public class Consultar_Clientes extends javax.swing.JFrame {
    
    Control_Objetos_Clientes cocllll = new Control_Objetos_Clientes();
    Modelo_Datos_Clientes mdcl = new Modelo_Datos_Clientes();
    Validaciones V = new Validaciones();

    public Consultar_Clientes() {
        initComponents();
        TextID.requestFocus();
        mdcl.CargarCbClientes(CbClientes);
        cocllll.LimpiarConsultar(TextID, TextName, TextTel, TextDir, TextEmail, TextFechaReg);
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
        BotonBuscar = new javax.swing.JButton();
        BotonRegresar = new javax.swing.JLabel();
        TextID = new javax.swing.JTextField();
        TextName = new javax.swing.JTextField();
        TextTel = new javax.swing.JTextField();
        TextDir = new javax.swing.JTextField();
        TextEmail = new javax.swing.JTextField();
        TextFechaReg = new javax.swing.JTextField();
        ID1 = new javax.swing.JLabel();
        CbClientes = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bancos Felits - Consulta de Clientes");

        jPanel1.setBackground(new java.awt.Color(0, 28, 56));
        jPanel1.setForeground(new java.awt.Color(0, 98, 152));

        Title.setFont(new java.awt.Font("Segoe UI", 1, 23)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Consulta de Clientes");

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
        BotonLimpiar.setToolTipText("Borra todo los campos.");
        BotonLimpiar.setFocusPainted(false);
        BotonLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BotonLimpiar.setIconTextGap(2);
        BotonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLimpiarActionPerformed(evt);
            }
        });

        BotonBuscar.setBackground(new java.awt.Color(0, 98, 152));
        BotonBuscar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        BotonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        BotonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/White_Lens.png"))); // NOI18N
        BotonBuscar.setText("Buscar");
        BotonBuscar.setToolTipText("Busca la identificación en el sistema.");
        BotonBuscar.setFocusPainted(false);
        BotonBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BotonBuscar.setIconTextGap(2);
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
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
        TextID.setToolTipText("");
        TextID.setCaretColor(new java.awt.Color(255, 255, 255));
        TextID.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        TextID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextIDKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextIDKeyTyped(evt);
            }
        });

        TextName.setEditable(false);
        TextName.setBackground(new java.awt.Color(0, 98, 152));
        TextName.setForeground(new java.awt.Color(255, 255, 255));
        TextName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextName.setCaretColor(new java.awt.Color(255, 255, 255));
        TextName.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        TextTel.setEditable(false);
        TextTel.setBackground(new java.awt.Color(0, 98, 152));
        TextTel.setForeground(new java.awt.Color(255, 255, 255));
        TextTel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextTel.setCaretColor(new java.awt.Color(255, 255, 255));
        TextTel.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        TextDir.setEditable(false);
        TextDir.setBackground(new java.awt.Color(0, 98, 152));
        TextDir.setForeground(new java.awt.Color(255, 255, 255));
        TextDir.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextDir.setCaretColor(new java.awt.Color(255, 255, 255));
        TextDir.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        TextEmail.setEditable(false);
        TextEmail.setBackground(new java.awt.Color(0, 98, 152));
        TextEmail.setForeground(new java.awt.Color(255, 255, 255));
        TextEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextEmail.setCaretColor(new java.awt.Color(255, 255, 255));
        TextEmail.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        TextFechaReg.setEditable(false);
        TextFechaReg.setBackground(new java.awt.Color(0, 98, 152));
        TextFechaReg.setForeground(new java.awt.Color(255, 255, 255));
        TextFechaReg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextFechaReg.setCaretColor(new java.awt.Color(255, 255, 255));
        TextFechaReg.setDisabledTextColor(new java.awt.Color(255, 255, 255));

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
                        .addGap(89, 89, 89)
                        .addComponent(Title)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ID1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CbClientes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextName))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextID))
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
                                .addComponent(TextFechaReg)))))
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(BotonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(BotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(ID1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(CbClientes))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TextID)
                    .addComponent(ID, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(FechaReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TextFechaReg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                mdcl.MostrarDatos(TextID.getText(), TextName, TextTel, TextDir, TextEmail, TextFechaReg);
     
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
            } else {
                JOptionPane.showMessageDialog(null, "El cliente no está registrado.", "Estado", JOptionPane.WARNING_MESSAGE);
                cocllll.LimpiarConsultar(TextID, TextName, TextTel, TextDir, TextEmail, TextFechaReg);
                TextID.requestFocus();
            }
        //}
    }//GEN-LAST:event_BotonBuscarActionPerformed

    private void BotonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLimpiarActionPerformed
        cocllll.LimpiarConsultar(TextID, TextName, TextTel, TextDir, TextEmail, TextFechaReg);
        TextID.requestFocus();
    }//GEN-LAST:event_BotonLimpiarActionPerformed

    private void BotonRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegresarMouseClicked
        Vista_Principal.MenuPrincipal nw = new MenuPrincipal();
        nw.show(); this.hide(); this.dispose();
    }//GEN-LAST:event_BotonRegresarMouseClicked

    private void TextIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextIDKeyPressed
        V.subirCursorCombo(evt, CbClientes);
        
        char k = evt.getKeyChar();
        if (k == KeyEvent.VK_ENTER)
            BotonBuscar.doClick();
    }//GEN-LAST:event_TextIDKeyPressed

    private void TextIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextIDKeyTyped
        V.soloNumeros(evt);
    }//GEN-LAST:event_TextIDKeyTyped

    private void CbClientesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CbClientesKeyPressed
        char k = evt.getKeyChar();
        if (k == KeyEvent.VK_ENTER)
            BotonBuscar.doClick();
    }//GEN-LAST:event_CbClientesKeyPressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultar_Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JTextField TextFechaReg;
    private javax.swing.JTextField TextID;
    private javax.swing.JTextField TextName;
    private javax.swing.JTextField TextTel;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
