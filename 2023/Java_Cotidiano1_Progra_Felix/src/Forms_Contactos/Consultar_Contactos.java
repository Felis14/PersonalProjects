package Forms_Contactos;

import Utilitario.*;
import Vista_Principal.Menu_Principal;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;

public class Consultar_Contactos extends javax.swing.JFrame {

    ControlObjetos co = new ControlObjetos();
    Modelo_Datos md = new Modelo_Datos();
    Fecha_Sistema fs = new Fecha_Sistema();
    Validaciones V = new Validaciones();
    
    public Consultar_Contactos() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/IMAGENES/LOGOCOLEGIOACTUAL.png")).getImage());
        TextFechaHoy.setText("Fecha: "+fs.fecha());
        md.CargarCbContactos(CbContactos);
        co.BloquearObjetosConsultar(TextID, TextName, TextDir, TextRegDate, TextBirth, TextCat, TextTelF, TextTelM, TextEmail);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Title = new javax.swing.JLabel();
        TextID = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        ButtonBuscar = new javax.swing.JButton();
        ButtonClear = new javax.swing.JButton();
        TextCat = new javax.swing.JTextField();
        TextEmail = new javax.swing.JTextField();
        TextDir = new javax.swing.JTextField();
        TextRegDate = new javax.swing.JTextField();
        TextBirth = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TextTelF = new javax.swing.JTextField();
        TextTelM = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TextName = new javax.swing.JTextField();
        ButtonBack = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        CbContactos = new javax.swing.JComboBox<>();
        TextFechaHoy = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consulta de Contactos");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/LOGOCOLEGIOACTUAL.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 50, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 57, 479, 7));

        Title.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Consultar Contactos");
        jPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 17, 267, -1));

        TextID.setBackground(new java.awt.Color(27, 72, 92));
        TextID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextID.setForeground(new java.awt.Color(255, 255, 255));
        TextID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));
        TextID.setCaretColor(new java.awt.Color(255, 255, 255));
        TextID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextIDKeyTyped(evt);
            }
        });
        jPanel1.add(TextID, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 150, 32));

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 17)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Contactos Registrados");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 160, 32));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Correo");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 160, 32));

        jSeparator2.setForeground(new java.awt.Color(0, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 479, 4));

        ButtonBuscar.setBackground(new java.awt.Color(27, 72, 92));
        ButtonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/busqueda (1).png"))); // NOI18N
        ButtonBuscar.setText("Buscar");
        ButtonBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));
        ButtonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonBuscar.setFocusPainted(false);
        ButtonBuscar.setIconTextGap(1);
        ButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 100, 30));

        ButtonClear.setBackground(new java.awt.Color(27, 72, 92));
        ButtonClear.setForeground(new java.awt.Color(255, 255, 255));
        ButtonClear.setText("Limpiar");
        ButtonClear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));
        ButtonClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonClear.setFocusPainted(false);
        ButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonClearActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 610, 120, 40));

        TextCat.setBackground(new java.awt.Color(27, 72, 92));
        TextCat.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextCat.setForeground(new java.awt.Color(255, 255, 255));
        TextCat.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextCat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));
        jPanel1.add(TextCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 260, 32));

        TextEmail.setBackground(new java.awt.Color(27, 72, 92));
        TextEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextEmail.setForeground(new java.awt.Color(255, 255, 255));
        TextEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));
        jPanel1.add(TextEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 260, 32));

        TextDir.setBackground(new java.awt.Color(27, 72, 92));
        TextDir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextDir.setForeground(new java.awt.Color(255, 255, 255));
        TextDir.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextDir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));
        jPanel1.add(TextDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 260, 32));

        TextRegDate.setBackground(new java.awt.Color(27, 72, 92));
        TextRegDate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextRegDate.setForeground(new java.awt.Color(255, 255, 255));
        TextRegDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextRegDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));
        jPanel1.add(TextRegDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 260, 32));

        TextBirth.setBackground(new java.awt.Color(27, 72, 92));
        TextBirth.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextBirth.setForeground(new java.awt.Color(255, 255, 255));
        TextBirth.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextBirth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));
        jPanel1.add(TextBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 260, 32));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Identificación");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 160, 32));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Dirección");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 160, 32));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 21)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Fecha de Registro");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 160, 32));

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Categoría");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 160, 32));

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Teléfono fijo");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 160, 32));

        TextTelF.setBackground(new java.awt.Color(27, 72, 92));
        TextTelF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextTelF.setForeground(new java.awt.Color(255, 255, 255));
        TextTelF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextTelF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));
        jPanel1.add(TextTelF, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 260, 32));

        TextTelM.setBackground(new java.awt.Color(27, 72, 92));
        TextTelM.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextTelM.setForeground(new java.awt.Color(255, 255, 255));
        TextTelM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextTelM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));
        jPanel1.add(TextTelM, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 260, 32));

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Teléfono móvil");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 160, 32));

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Nombre");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 160, 32));

        TextName.setBackground(new java.awt.Color(27, 72, 92));
        TextName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextName.setForeground(new java.awt.Color(255, 255, 255));
        TextName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));
        jPanel1.add(TextName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 260, 32));

        ButtonBack.setBackground(new java.awt.Color(27, 72, 92));
        ButtonBack.setForeground(new java.awt.Color(255, 255, 255));
        ButtonBack.setText("Regresar");
        ButtonBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));
        ButtonBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonBack.setFocusPainted(false);
        ButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBackActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, 120, 40));

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Fecha de Nacimiento");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 160, 32));

        CbContactos.setBackground(new java.awt.Color(27, 72, 92));
        CbContactos.setForeground(new java.awt.Color(255, 255, 255));
        CbContactos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));
        CbContactos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbContactosActionPerformed(evt);
            }
        });
        jPanel1.add(CbContactos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, 260, 30));

        TextFechaHoy.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TextFechaHoy.setForeground(new java.awt.Color(255, 255, 255));
        TextFechaHoy.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TextFechaHoy.setText("Fecha: ");
        jPanel1.add(TextFechaHoy, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, -1));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos_Contactos/Contactos_Consultar.png"))); // NOI18N
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 660));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonClearActionPerformed
        co.LimpiarTextosConsultar(TextID, TextName, TextDir, TextRegDate, TextBirth, TextCat, TextTelF, TextTelM, TextEmail);
        co.BloquearObjetosConsultar(TextID, TextName, TextDir, TextRegDate, TextBirth, TextCat, TextTelF, TextTelM, TextEmail);
    }//GEN-LAST:event_ButtonClearActionPerformed

    private void ButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBackActionPerformed
        Menu_Principal nw = new Menu_Principal();
        nw.show();
        this.hide();
        this.dispose();
    }//GEN-LAST:event_ButtonBackActionPerformed

    private void ButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBuscarActionPerformed
        if ((TextID.getText().equals(""))) {
            JOptionPane.showMessageDialog(null, "No ha ingresado ninguna identificación.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else {
            if (md.buscaridentificacion(TextID.getText())==1) {
                JOptionPane.showMessageDialog(null, "Contacto encontrado, se mostrarán sus datos", "Estado", JOptionPane.INFORMATION_MESSAGE);
                md.MostrarDatos(TextID.getText(), TextName, TextDir, TextRegDate, TextBirth, TextCat, TextTelF, TextTelM, TextEmail);
                
                //Ciclo para que cuando se busque una identificacion usando solo el TextField, que el combo box cambie a la identificacion que se buscó
                //Asigna a la variable id la identificacion que se buscó
                String id=TextID.getText();
                //Contacto será igual a todo el texto en el item del combo box, contactoID solo almacenará la identificación mediante un ciclo
                String contactoID="", contacto = "";
                //De 0 hasta la cantidad de items del combo box
                for (int i=0; i<CbContactos.getItemCount(); i++) {
                    //Se selecciona en el combo box el item en el indice i
                    CbContactos.setSelectedIndex(i);
                    //Se le asigna a contacto lo que está en el item Ej: 1 - Felix Barboza Soto
                    contacto = ""+CbContactos.getSelectedItem();
                    //Se reinicia contactoID
                    contactoID = "";
                    //Recorre todo el texto del item
                    for (int j=0; i<CbContactos.getItemAt(i).length(); j++) {
                        //Si el caracter en la posicion j no es un espacio vacio
                        if (contacto.charAt(j) != ' ') {
                            //Suma el caracter numerico a la variable contactoID
                            contactoID += CbContactos.getItemAt(i).charAt(j);
                        }
                        //Si el caracter si es un espacio vacio
                        else
                            break; //Rompe el ciclo
                    }
                    //Si la ID del contacto es igual a la ID que se buscó en primer lugar
                    if (contactoID.equals(id)) {
                        //Se selecciona el item del combo box con el que se quedó el primer ciclo (i)
                        CbContactos.setSelectedIndex(i);
                        break; //Y rompe el ciclo
                    }
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "El contacto no está registrado.", "Estado", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_ButtonBuscarActionPerformed

    private void CbContactosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbContactosActionPerformed
        //Contacto almacena lo que esté en el item seleccionado del combo box
        String contacto = ""+CbContactos.getSelectedItem();
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
        //Se muestran los datos
        md.MostrarDatos(TextID.getText(), TextName, TextDir, TextRegDate, TextBirth, TextCat, TextTelF, TextTelM, TextEmail);
    }//GEN-LAST:event_CbContactosActionPerformed

    private void TextIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextIDKeyTyped
        V.solonumeros(evt);
        
        char k = evt.getKeyChar();
        if (k == KeyEvent.VK_ENTER)
            ButtonBuscar.doClick();
    }//GEN-LAST:event_TextIDKeyTyped
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultar_Contactos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBack;
    private javax.swing.JButton ButtonBuscar;
    private javax.swing.JButton ButtonClear;
    private javax.swing.JComboBox<String> CbContactos;
    private javax.swing.JTextField TextBirth;
    private javax.swing.JTextField TextCat;
    private javax.swing.JTextField TextDir;
    private javax.swing.JTextField TextEmail;
    private javax.swing.JLabel TextFechaHoy;
    private javax.swing.JTextField TextID;
    private javax.swing.JTextField TextName;
    private javax.swing.JTextField TextRegDate;
    private javax.swing.JTextField TextTelF;
    private javax.swing.JTextField TextTelM;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
