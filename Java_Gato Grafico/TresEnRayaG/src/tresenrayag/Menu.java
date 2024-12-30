package tresenrayag;
//Color sirve para modificar colores de fondos y letras
import java.awt.Color;
//ImageIcon funciona para poner un icono a la ventana
import javax.swing.ImageIcon;

public class Menu extends javax.swing.JFrame {
    //winsX almacena las victorias de X
    //winsO almacena las victorias de O
    //winsNo almacena los empates
    //partidas almacena la cantidad de partidas TERMINADAS
    //WinsP almacena las victorias contra la computadora
    //WinsC almacena las derrotas contra la computadora (veces que gana la consola)
    //Cempate almacena los empates contra la computadora
    //partidasC almacena las partidas TERMINADAS contra la computadora
    static int winsX, winsO, winsNo, partidas, WinsP, WinsC, Cempate, partidasC;
    //JvsC es una bool que se activa si se va a jugar contra la computadora o jugador contra jugador
    static boolean JvsC = false;
    
    public Menu() {
        //Inicializa los componentes del jframe
        initComponents();
        //pone la posición de la ventana en el centro de la pantalla
        this.setLocationRelativeTo(null);
        //Pone una imagen de icono de ventana
        setIconImage(new ImageIcon(getClass().getResource("GatoIcon.png")).getImage());
        
        //Esconde botones que no se tienen que mostrar hasta despues
        JJButton.hide();
        JCButton.hide();
        BackButton.hide();
        SalirText.hide();
        ExitYesButton.hide();
        NoExitButton.hide();
        
        //Importa los valores de las variables de las estadisticas de la clase juego
        winsX = (Juego.Xwin);
        winsO = (Juego.Owin);
        winsNo = (Juego.Nowin);
        partidas = (Juego.games);
        WinsP = (Juego.winsP);
        WinsC = (Juego.winsC);
        Cempate = (Juego.empateC);
        partidasC = (Juego.partidasC);
    }

    //Código autogenerado por netbeans
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menucillo = new javax.swing.JPanel();
        GatoText = new javax.swing.JLabel();
        GatoIMG = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        JJButton = new javax.swing.JButton();
        JCButton = new javax.swing.JButton();
        PlayButton = new javax.swing.JButton();
        SalirText = new javax.swing.JLabel();
        ExitButton = new javax.swing.JButton();
        NoExitButton = new javax.swing.JButton();
        ExitYesButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gato");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menucillo.setBackground(new java.awt.Color(0, 0, 0));
        Menucillo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GatoText.setFont(new java.awt.Font("LEMON MILK", 0, 48)); // NOI18N
        GatoText.setForeground(new java.awt.Color(255, 255, 255));
        GatoText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GatoText.setText("GATO");
        Menucillo.add(GatoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 580, 60));

        GatoIMG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GatoIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tresenrayag/GatoIcon.png"))); // NOI18N
        Menucillo.add(GatoIMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 140, 100));

        BackButton.setBackground(new java.awt.Color(0, 0, 0));
        BackButton.setFont(new java.awt.Font("LEMON MILK", 0, 24)); // NOI18N
        BackButton.setForeground(new java.awt.Color(255, 255, 255));
        BackButton.setText("Volver");
        BackButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BackButton.setFocusPainted(false);
        BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BackButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BackButtonMouseExited(evt);
            }
        });
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        Menucillo.add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 160, 40));

        JJButton.setBackground(new java.awt.Color(0, 0, 0));
        JJButton.setFont(new java.awt.Font("LEMON MILK", 0, 11)); // NOI18N
        JJButton.setForeground(new java.awt.Color(255, 255, 255));
        JJButton.setText("Jugador vs Jugador");
        JJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JJButton.setFocusPainted(false);
        JJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JJButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JJButtonMouseExited(evt);
            }
        });
        JJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JJButtonActionPerformed(evt);
            }
        });
        Menucillo.add(JJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 180, 40));

        JCButton.setBackground(new java.awt.Color(0, 0, 0));
        JCButton.setFont(new java.awt.Font("LEMON MILK", 0, 11)); // NOI18N
        JCButton.setForeground(new java.awt.Color(255, 255, 255));
        JCButton.setText("Jugador vs Consola");
        JCButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JCButton.setFocusPainted(false);
        JCButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JCButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JCButtonMouseExited(evt);
            }
        });
        JCButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCButtonActionPerformed(evt);
            }
        });
        Menucillo.add(JCButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 127, 180, 40));

        PlayButton.setBackground(new java.awt.Color(0, 0, 0));
        PlayButton.setFont(new java.awt.Font("LEMON MILK", 0, 24)); // NOI18N
        PlayButton.setForeground(new java.awt.Color(255, 255, 255));
        PlayButton.setText("Jugar");
        PlayButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PlayButton.setFocusPainted(false);
        PlayButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PlayButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PlayButtonMouseExited(evt);
            }
        });
        PlayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayButtonActionPerformed(evt);
            }
        });
        Menucillo.add(PlayButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 160, 40));

        SalirText.setBackground(new java.awt.Color(0, 0, 0));
        SalirText.setFont(new java.awt.Font("LEMON MILK", 0, 16)); // NOI18N
        SalirText.setForeground(new java.awt.Color(255, 255, 255));
        SalirText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SalirText.setText("¿Salir?");
        SalirText.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Menucillo.add(SalirText, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 80, 30));

        ExitButton.setBackground(new java.awt.Color(0, 0, 0));
        ExitButton.setFont(new java.awt.Font("LEMON MILK", 0, 24)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(255, 255, 255));
        ExitButton.setText("Salir");
        ExitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ExitButton.setFocusPainted(false);
        ExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitButtonMouseExited(evt);
            }
        });
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        Menucillo.add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 160, 40));

        NoExitButton.setBackground(new java.awt.Color(0, 0, 0));
        NoExitButton.setFont(new java.awt.Font("LEMON MILK", 0, 16)); // NOI18N
        NoExitButton.setForeground(new java.awt.Color(255, 255, 255));
        NoExitButton.setText("NO");
        NoExitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        NoExitButton.setFocusPainted(false);
        NoExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NoExitButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NoExitButtonMouseExited(evt);
            }
        });
        NoExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoExitButtonActionPerformed(evt);
            }
        });
        Menucillo.add(NoExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 70, 30));

        ExitYesButton.setBackground(new java.awt.Color(0, 0, 0));
        ExitYesButton.setFont(new java.awt.Font("LEMON MILK", 0, 16)); // NOI18N
        ExitYesButton.setForeground(new java.awt.Color(255, 255, 255));
        ExitYesButton.setText("Sí");
        ExitYesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ExitYesButton.setFocusPainted(false);
        ExitYesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitYesButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitYesButtonMouseExited(evt);
            }
        });
        ExitYesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitYesButtonActionPerformed(evt);
            }
        });
        Menucillo.add(ExitYesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 70, 30));

        getContentPane().add(Menucillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Codigo autogenerado por netbeans
    
    //Evento para cambiar el color del fondo y las letras cuando el cursor está encima del botón
    private void JJButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JJButtonMouseEntered
        JJButton.setBackground(Color.white);
        JJButton.setForeground(Color.black);
    }//GEN-LAST:event_JJButtonMouseEntered

    //Evento para cambiar el color del fondo y las letras cuando el cursor ya no está encima del botón
    private void JJButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JJButtonMouseExited
        JJButton.setBackground(Color.black);
        JJButton.setForeground(Color.white);
    }//GEN-LAST:event_JJButtonMouseExited

    //Evento para cambiar el color del fondo y las letras cuando el cursor está encima del botón
    private void JCButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JCButtonMouseEntered
        JCButton.setBackground(Color.white);
        JCButton.setForeground(Color.black);
    }//GEN-LAST:event_JCButtonMouseEntered

    //Evento para cambiar el color del fondo y las letras cuando el cursor ya no está encima del botón
    private void JCButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JCButtonMouseExited
        JCButton.setBackground(Color.black);
        JCButton.setForeground(Color.white);
    }//GEN-LAST:event_JCButtonMouseExited

    //Evento para cambiar el color del fondo y las letras cuando el cursor está encima del botón
    private void BackButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseEntered
        BackButton.setBackground(Color.white);
        BackButton.setForeground(Color.black);
    }//GEN-LAST:event_BackButtonMouseEntered

    //Evento para cambiar el color del fondo y las letras cuando el cursor ya no está encima del botón
    private void BackButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseExited
        BackButton.setBackground(Color.black);
        BackButton.setForeground(Color.white);
    }//GEN-LAST:event_BackButtonMouseExited

    //Evento para cambiar el color del fondo y las letras cuando el cursor está encima del botón
    private void PlayButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlayButtonMouseEntered
        PlayButton.setBackground(Color.white);
        PlayButton.setForeground(Color.black);
    }//GEN-LAST:event_PlayButtonMouseEntered

    //Evento para cambiar el color del fondo y las letras cuando el cursor ya no está encima del botón
    private void PlayButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlayButtonMouseExited
        PlayButton.setBackground(Color.black);
        PlayButton.setForeground(Color.white);
    }//GEN-LAST:event_PlayButtonMouseExited

    //Evento para cambiar el color del fondo y las letras cuando el cursor está encima del botón
    private void ExitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseEntered
        ExitButton.setBackground(Color.white);
        ExitButton.setForeground(Color.black);
    }//GEN-LAST:event_ExitButtonMouseEntered

    //Evento para cambiar el color del fondo y las letras cuando el cursor ya no está encima del botón
    private void ExitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseExited
        ExitButton.setBackground(Color.black);
        ExitButton.setForeground(Color.white);
    }//GEN-LAST:event_ExitButtonMouseExited

    //Evento para cambiar el color del fondo y las letras cuando el cursor está encima del botón
    private void ExitYesButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitYesButtonMouseEntered
        ExitYesButton.setBackground(Color.white);
        ExitYesButton.setForeground(Color.black);
    }//GEN-LAST:event_ExitYesButtonMouseEntered

    //Evento para cambiar el color del fondo y las letras cuando el cursor ya no está encima del botón
    private void ExitYesButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitYesButtonMouseExited
        ExitYesButton.setBackground(Color.black);
        ExitYesButton.setForeground(Color.white);
    }//GEN-LAST:event_ExitYesButtonMouseExited

    //Evento para cambiar el color del fondo y las letras cuando el cursor está encima del botón
    private void NoExitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NoExitButtonMouseEntered
        NoExitButton.setBackground(Color.white);
        NoExitButton.setForeground(Color.black);
    }//GEN-LAST:event_NoExitButtonMouseEntered

    //Evento para cambiar el color del fondo y las letras cuando el cursor ya no está encima del botón
    private void NoExitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NoExitButtonMouseExited
        NoExitButton.setBackground(Color.black);
        NoExitButton.setForeground(Color.white);
    }//GEN-LAST:event_NoExitButtonMouseExited

    //Cuando se presiona el boton para el modo jugador vs jugador
    private void JJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JJButtonActionPerformed
        //Devuelve la bool de JvsC a false porque no se está jugando contra la computadora
        JvsC = false;
        //Esconde el jframe actual
        this.setVisible(false);
        //Convierte la clase en una variable utilizable
        Juego mostrar = new Juego();
        //Muestra la clase por medio de la variable
        mostrar.setVisible(true);
    }//GEN-LAST:event_JJButtonActionPerformed

    //Cuando se presiona el boton para salir
    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        //Pregunta si se quiere salir o no, y esconde los demás botones
        //Muestra el boton de no salir
        NoExitButton.show();
        //Muestra el boton de sí salir
        ExitYesButton.show();
        //Esconde el boton de jugar
        PlayButton.hide();
        //Muestra el texto que dice "¿Salir?"
        SalirText.show();
        //Esconde el boton para mostrar las opciones de salir
        ExitButton.hide();
    }//GEN-LAST:event_ExitButtonActionPerformed

    //Cuando se presiona la opcion de no salir del juego
    private void NoExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoExitButtonActionPerformed
        //Vuelve a mostrar todo lo que se esconde, a esconder todo lo que se
        //muestra cuando se presiona el boton salir
        //Esconde el boton de no salir
        NoExitButton.hide();
        //Esconde el boton de sí salir
        ExitYesButton.hide();
        //Muestra el boton de jugar
        PlayButton.show();
        //Esconde el texto que dice "¿Salir?"
        SalirText.hide();
        //Muestra el boton de salir
        ExitButton.show();
    }//GEN-LAST:event_NoExitButtonActionPerformed

    //Cuando se preciona el boton de sí salir
    private void ExitYesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitYesButtonActionPerformed
        //Cierra el programa
        System.exit(0);
    }//GEN-LAST:event_ExitYesButtonActionPerformed

    //Cuando se presiona el boton de jugar
    private void PlayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayButtonActionPerformed
        //Esconde y muestra las otras opciones
        //Esconde el boton de jugar
        PlayButton.hide();
        //Esconde el boton de salir
        ExitButton.hide();
        //Muestra el boton para volver
        BackButton.show();
        //Muestra el boton para jugar en jugador vs jugador
        JJButton.show();
        //Muestra el boton para jugar contra la maquina
        JCButton.show();
        //Cambia el texto que dice "Gato" a "Modo de juego"
        GatoText.setText("Modo de juego");
    }//GEN-LAST:event_PlayButtonActionPerformed

    //Cuando se presiona el boton para volver
    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        //Esconde los botones que mostró y muestra los botones que escondió el
        //boton de jugar
        //Muestra el boton de jugar
        PlayButton.show();
        //Muestra el boton de salir
        ExitButton.show();
        //Esconde el boton de volver
        BackButton.hide();
        //Esconde el boton para jugar el jugador vs jugador
        JJButton.hide();
        //Esconde el boton para jugar contra la maquina
        JCButton.hide();
        //Cambia el texto de arriba de "Modo de juego" a "Gato"
        GatoText.setText("Gato");
    }//GEN-LAST:event_BackButtonActionPerformed

    //Cuando se presiona el boton de jugar contra la maquina
    private void JCButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCButtonActionPerformed
        //La variable bool de JvsC se pone en true porque se va a jugar contra
        //la computadora
        JvsC = true;
        //Esconde la ventana actual
        this.setVisible(false);
        //Convierte la clase Juego en una variable utilizable
        Juego mostrar = new Juego();
        //Muestra la ventana de juego por medio de la variable
        mostrar.setVisible(true);
    }//GEN-LAST:event_JCButtonActionPerformed

    //Procedimiento principal para mostrar la ventana
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    
    //Codigo autogenerado por NetBeans, define las variables de los
    //elementos del jFrame
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton BackButton;
    public static javax.swing.JButton ExitButton;
    public static javax.swing.JButton ExitYesButton;
    private javax.swing.JLabel GatoIMG;
    public static javax.swing.JLabel GatoText;
    public static javax.swing.JButton JCButton;
    public static javax.swing.JButton JJButton;
    private javax.swing.JPanel Menucillo;
    public static javax.swing.JButton NoExitButton;
    public static javax.swing.JButton PlayButton;
    public static javax.swing.JLabel SalirText;
    // End of variables declaration//GEN-END:variables
}
