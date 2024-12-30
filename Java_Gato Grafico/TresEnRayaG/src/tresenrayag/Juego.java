package tresenrayag;
//Color sirve para modificar colores de fondos y letras
import java.awt.Color;
//ImageIcon funciona para poner un icono a la ventana
import javax.swing.ImageIcon;

public class Juego extends javax.swing.JFrame {
    //Crea el tablero del juego con una matriz de 3*3
    static int mat[][] = new int [3][3];
    //turnP almacenada de quien es el turno, solo puede ser 1 para X y 2 para O
    //winner almacena quien ganó cuando ya hay una victoria
    //turnos cuenta cuantas jugadas se han hecho (cada que ser marca una casilla)
    //Xwin almacena las victorias de X
    //Owin almacena las victorias de O
    //Nowin almacena los empates
    //games almacena las partidas TERMINADAS
    //winsP almacena las victorias contra la computadora
    //winsC almacena las derrotas contra la computadora (veces que ganó la consola)
    //empateC almacena los empates contra la consola
    //partidasC almacena la cantidad de partidas TERMINADAS contra la consola
    /* f y c sirve para almacenar filas y columnas, estas variables solo sirven
    para cuando se juega contra la consola */
    //PCturn almacena si la consola está jugando con X u O, o sea 1 o 2
    static int turnP, winner = 0, turnos = 0, Xwin=0, Owin=0, Nowin=0, games, winsP, winsC, empateC, partidasC, f, c, PCturn; 
    //Determina si se va a jugar o no contra la computadora
    static boolean vsPc;
    public Juego() {
        //Cuando se va a iniciar una partidas, inicia un turno aleatorio, sea X u O
        turnP = (int)(Math.random() * 2) + 1;
        //Inicializa los componentes del jFrame
        initComponents();
        //Posiciona la ventana en el centro de la pantalla
        this.setLocationRelativeTo(null);
        
        //Esconde el botón para que la maquina haga la primer jugada
        PCStartButton.hide();
        
        //Pone una imagen de icono de ventana
        setIconImage(new ImageIcon(getClass().getResource("GatoIcon.png")).getImage());
        
        //Esconde el botón para jugar de nuevo
        PlayAgain.hide();
        
        //Importa los valores de las variables de estadisticas del menu
        vsPc = (Menu.JvsC);
        Xwin = (Menu.winsX);
        Owin = (Menu.winsO);
        Nowin = (Menu.winsNo);
        games = (Menu.partidas);
        winsP = (Menu.WinsP);
        winsC = (Menu.WinsC);
        empateC = (Menu.Cempate);
        partidasC = (Menu.partidasC);
        
        //Si NO se juega contra la computadora
        if (vsPc == false) {
            //cambia cada texto de label a su variable correspondiente
            Xwinscant.setText(String.valueOf(Xwin));
            Owinscant.setText(String.valueOf(Owin));
            Nowinscant.setText(String.valueOf(Nowin));
            GamesCant.setText(String.valueOf(games));
        }
        //Si SÍ se juega contra la computadora
        else {
            //cambia cada texto de label a su variable correspondiente
            Xwinscant.setText(String.valueOf(winsP));
            Owinscant.setText(String.valueOf(winsC));
            Nowinscant.setText(String.valueOf(empateC));
            GamesCant.setText(String.valueOf(partidasC));
            //Muestra el boton para que la maquina haga la primer jugada
            PCStartButton.show();
            //Cambia el texto de "O" a "PC" ya que se usa un mismo label
            Owins.setText("PC");
            //Cambia el color de las letras a blanco
            Owins.setForeground(Color.white);
            //Cambia el texto de "X" a "Tú" ya que se usa un mismo label
            Xwins.setText("Tú");
            //Cambia el color de las letras a verde
            Xwins.setForeground(Color.green);
        }
        
        //Si turno es igual a 1 que equivale a X
        if (turnP == 1) {
            //El texto del label que muestra de quien es el turno cambia a "X"
            TextPlayer.setText("X");
            //El color del texto cambia a azul
            TextPlayer.setForeground(Color.blue); }
        //Si turno es igual a 2 que equivale a O
        else {
            //El texto del label que muestra de quien es el turno cambia a "O"
            TextPlayer.setText("O");
            //El color del texto cambia a rojo
            TextPlayer.setForeground(Color.red); }
        
        //Recorre filas y columnas para devolver todas las posiciones a 0
        for (int f=0; f<3; f++)
            for (int c=0; c<3; c++)
            {
                mat[f][c] = 0;
            }
    }
    
    //Código autogenerado por netbeans
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jueguillo = new javax.swing.JPanel();
        Author = new javax.swing.JLabel();
        MenuButton = new javax.swing.JButton();
        Tile00 = new javax.swing.JLabel();
        Tile01 = new javax.swing.JLabel();
        Tile02 = new javax.swing.JLabel();
        Tile10 = new javax.swing.JLabel();
        Tile11 = new javax.swing.JLabel();
        Tile12 = new javax.swing.JLabel();
        Tile20 = new javax.swing.JLabel();
        Tile21 = new javax.swing.JLabel();
        Tile22 = new javax.swing.JLabel();
        GridImg = new javax.swing.JLabel();
        VictoriesText = new javax.swing.JLabel();
        TextPlayer = new javax.swing.JLabel();
        WinText = new javax.swing.JLabel();
        PlayAgain = new javax.swing.JButton();
        TurnText = new javax.swing.JLabel();
        Owins = new javax.swing.JLabel();
        Owinscant = new javax.swing.JLabel();
        Nowins = new javax.swing.JLabel();
        Nowinscant = new javax.swing.JLabel();
        Xwinscant = new javax.swing.JLabel();
        Xwins = new javax.swing.JLabel();
        PartidasText = new javax.swing.JLabel();
        GamesCant = new javax.swing.JLabel();
        PCStartButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Miau :3");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jueguillo.setBackground(new java.awt.Color(0, 0, 0));
        Jueguillo.setMinimumSize(new java.awt.Dimension(650, 500));
        Jueguillo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Author.setBackground(new java.awt.Color(0, 0, 0));
        Author.setFont(new java.awt.Font("LEMON MILK", 0, 10)); // NOI18N
        Author.setForeground(new java.awt.Color(255, 255, 255));
        Author.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Author.setText("Frenetic Phoenix™");
        Jueguillo.add(Author, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 480, 110, 20));

        MenuButton.setBackground(new java.awt.Color(0, 0, 0));
        MenuButton.setFont(new java.awt.Font("LEMON MILK", 0, 12)); // NOI18N
        MenuButton.setForeground(new java.awt.Color(255, 255, 255));
        MenuButton.setText("MENU");
        MenuButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        MenuButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MenuButton.setFocusPainted(false);
        MenuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuButtonMouseExited(evt);
            }
        });
        MenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuButtonActionPerformed(evt);
            }
        });
        Jueguillo.add(MenuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 70, 30));

        Tile00.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tile00.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tile00MouseClicked(evt);
            }
        });
        Jueguillo.add(Tile00, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 120, 120));

        Tile01.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tile01.setIconTextGap(0);
        Tile01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tile01MouseClicked(evt);
            }
        });
        Jueguillo.add(Tile01, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 110, 120));

        Tile02.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tile02.setIconTextGap(0);
        Tile02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tile02MouseClicked(evt);
            }
        });
        Jueguillo.add(Tile02, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 120, 120));

        Tile10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tile10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tile10MouseClicked(evt);
            }
        });
        Jueguillo.add(Tile10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 120, 120));

        Tile11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tile11.setIconTextGap(0);
        Tile11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tile11MouseClicked(evt);
            }
        });
        Jueguillo.add(Tile11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 110, 120));

        Tile12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tile12.setIconTextGap(0);
        Tile12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tile12MouseClicked(evt);
            }
        });
        Jueguillo.add(Tile12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 120, 120));

        Tile20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tile20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tile20MouseClicked(evt);
            }
        });
        Jueguillo.add(Tile20, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 120, 120));

        Tile21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tile21.setIconTextGap(0);
        Tile21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tile21MouseClicked(evt);
            }
        });
        Jueguillo.add(Tile21, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 110, 120));

        Tile22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tile22.setIconTextGap(0);
        Tile22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tile22MouseClicked(evt);
            }
        });
        Jueguillo.add(Tile22, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 120, 120));

        GridImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tresenrayag/Grid.png"))); // NOI18N
        Jueguillo.add(GridImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 380, 380));

        VictoriesText.setFont(new java.awt.Font("LEMON MILK", 0, 12)); // NOI18N
        VictoriesText.setForeground(new java.awt.Color(255, 255, 255));
        VictoriesText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VictoriesText.setText("Victorias:");
        Jueguillo.add(VictoriesText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 80, 30));

        TextPlayer.setFont(new java.awt.Font("LEMON MILK", 0, 24)); // NOI18N
        TextPlayer.setForeground(new java.awt.Color(255, 255, 255));
        Jueguillo.add(TextPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 40, 40));

        WinText.setFont(new java.awt.Font("LEMON MILK", 0, 18)); // NOI18N
        WinText.setForeground(new java.awt.Color(255, 255, 255));
        WinText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WinText.setToolTipText("");
        Jueguillo.add(WinText, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 210, 30));

        PlayAgain.setBackground(new java.awt.Color(0, 0, 0));
        PlayAgain.setFont(new java.awt.Font("LEMON MILK", 0, 24)); // NOI18N
        PlayAgain.setForeground(new java.awt.Color(255, 255, 255));
        PlayAgain.setText("Jugar de Nuevo");
        PlayAgain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        PlayAgain.setFocusPainted(false);
        PlayAgain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PlayAgainMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PlayAgainMouseExited(evt);
            }
        });
        PlayAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayAgainActionPerformed(evt);
            }
        });
        Jueguillo.add(PlayAgain, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 270, 50));

        TurnText.setFont(new java.awt.Font("LEMON MILK", 0, 12)); // NOI18N
        TurnText.setForeground(new java.awt.Color(255, 255, 255));
        TurnText.setText("Turno de:");
        Jueguillo.add(TurnText, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 70, 30));

        Owins.setFont(new java.awt.Font("LEMON MILK", 0, 24)); // NOI18N
        Owins.setForeground(new java.awt.Color(255, 0, 0));
        Owins.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Owins.setText("O");
        Jueguillo.add(Owins, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 40, 40));

        Owinscant.setFont(new java.awt.Font("LEMON MILK", 0, 24)); // NOI18N
        Owinscant.setForeground(new java.awt.Color(255, 255, 255));
        Owinscant.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Owinscant.setText("0");
        Jueguillo.add(Owinscant, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 40, 40));

        Nowins.setFont(new java.awt.Font("LEMON MILK", 0, 24)); // NOI18N
        Nowins.setForeground(new java.awt.Color(255, 255, 255));
        Nowins.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nowins.setText("-");
        Jueguillo.add(Nowins, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 40, 40));

        Nowinscant.setFont(new java.awt.Font("LEMON MILK", 0, 24)); // NOI18N
        Nowinscant.setForeground(new java.awt.Color(255, 255, 255));
        Nowinscant.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nowinscant.setText("0");
        Jueguillo.add(Nowinscant, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 40, 40));

        Xwinscant.setFont(new java.awt.Font("LEMON MILK", 0, 24)); // NOI18N
        Xwinscant.setForeground(new java.awt.Color(255, 255, 255));
        Xwinscant.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Xwinscant.setText("0");
        Jueguillo.add(Xwinscant, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 40, 40));

        Xwins.setFont(new java.awt.Font("LEMON MILK", 0, 24)); // NOI18N
        Xwins.setForeground(new java.awt.Color(0, 0, 255));
        Xwins.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Xwins.setText("X");
        Jueguillo.add(Xwins, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 40, 40));

        PartidasText.setFont(new java.awt.Font("LEMON MILK", 0, 12)); // NOI18N
        PartidasText.setForeground(new java.awt.Color(255, 255, 255));
        PartidasText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PartidasText.setText("Partidas:");
        Jueguillo.add(PartidasText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 80, 20));

        GamesCant.setFont(new java.awt.Font("LEMON MILK", 0, 24)); // NOI18N
        GamesCant.setForeground(new java.awt.Color(255, 255, 255));
        GamesCant.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GamesCant.setText("0");
        Jueguillo.add(GamesCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 40, 30));

        PCStartButton.setBackground(new java.awt.Color(0, 0, 0));
        PCStartButton.setFont(new java.awt.Font("LEMON MILK", 0, 12)); // NOI18N
        PCStartButton.setForeground(new java.awt.Color(255, 255, 255));
        PCStartButton.setText("Consola empieza");
        PCStartButton.setFocusPainted(false);
        PCStartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PCStartButtonActionPerformed(evt);
            }
        });
        Jueguillo.add(PCStartButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, -1, -1));

        getContentPane().add(Jueguillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Codigo autogenerado por netbeans
    
    //Evento para cambiar el color del fondo y las letras cuando el cursor está encima del botón
    private void MenuButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuButtonMouseEntered
        MenuButton.setBackground(Color.white);
        MenuButton.setForeground(Color.black);
    }//GEN-LAST:event_MenuButtonMouseEntered

    //Evento para cambiar el color del fondo y las letras cuando el cursor ya no está encima del botón
    private void MenuButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuButtonMouseExited
        MenuButton.setBackground(Color.black);
        MenuButton.setForeground(Color.white);
    }//GEN-LAST:event_MenuButtonMouseExited

    //Cuando se presiona el boton de volver al menu
    private void MenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuButtonActionPerformed
        //Devuelve winner a 0
        winner = 0;
        //Devuelve turnos a 0
        turnos = 0;
        //Oculta la ventana actual
        this.setVisible(false);
        //Convierte la clase de menu en una variable utilizable
        Menu i = new Menu();
        //Muestra la ventana de menu por medio de la variable
        i.setVisible(true);
    }//GEN-LAST:event_MenuButtonActionPerformed

    //Cuando se presiona cualquiera de las nueve casillas pasa lo siguiente:
    
    //Verifica si está vacía y si aún no hay un ganador
    //la posicion es igual a turnP, que almacena 1 o 2, X u O respectivamente
    //Si turno es igual a 1
        //Cambia la imagen de la casilla a una X
        //Cambia por medio de un procedimiento el texto que muestra de quien es el turno
        //cambia turno a 2, para que ahora juegue O
    //Si turno es igual a 2
        //Cambia la imagen de la casilla a una O
        //cambia por medio de un procedimiento el texto que muestra de quien es el turno
        //cambia turno a 1, para que ahora juegue X
    //suma 1 a la variable turnos;
    //procedimiento que verifica si hay patrones completos
    //Si se está jugando contra la computadora, y turnos es menor a nueve y no hay ningun ganador
        //Por medio de un procedimiento hace que la maquina marque una casilla aleatoria
        //Y vuelve a verificar si hay patrones completos
    
    //Cuando se presiona la casilla 01
    private void Tile01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tile01MouseClicked
        //Verifica si está vacía y si aún no hay un ganador
        if ((mat[0][1] == 0)&&(winner == 0)) {
            //la posicion es igual a turnP, que almacena 1 o 2, X u O respectivamente
            mat[0][1] = turnP;
            
            //Si turno es igual a 1
            if (turnP == 1) {
                //Cambia la imagen de la casilla a una X
                Tile01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tresenrayag/TileX.png")));
                //Cambia por medio de un procedimiento el texto que muestra de quien es el turno
                cambioturnodisp();
                //cambia turno a 2, para que ahora juegue O
                turnP = 2; }
            //Si turno es igual a 2
            else {
                //Cambia la imagen de la casilla a una O
                Tile01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tresenrayag/TileO.png")));
                //cambia por medio de un procedimiento el texto que muestra de quien es el turno
                cambioturnodisp();
                //cambia turno a 1, para que ahora juegue X
                turnP = 1; }
            //suma 1 a la variable turnos;
            turnos++;
            //procedimiento que verifica si hay patrones completos
            checkforwin();
            //Si se está jugando contra la computadora, y turnos es menor a nueve y no hay ningun ganador
            if ((Menu.JvsC == true)&&(turnos<9)&&(winner == 0)) {
                //Por medio de un procedimiento hace que la maquina marque una casilla aleatoria
                randomtile();
                //Y vuelve a verificar si hay patrones completos
                checkforwin();
            }
        }
    }//GEN-LAST:event_Tile01MouseClicked

    //Cuando se presiona la casilla 02
    private void Tile02MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tile02MouseClicked
        if ((mat[0][2] == 0)&&(winner == 0)) {
            mat[0][2] = turnP;
        
            if (turnP == 1) {
                Tile02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tresenrayag/TileX.png")));
                cambioturnodisp();
                turnP = 2; }
            else {
                Tile02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tresenrayag/TileO.png")));
                cambioturnodisp();
                turnP = 1; }
            turnos++;
            
            checkforwin();
            
            if ((Menu.JvsC == true)&&(turnos<9)&&(winner == 0)) {
                randomtile();
                checkforwin();
            }
        }
    }//GEN-LAST:event_Tile02MouseClicked

    //Cuando se presiona la casilla 03
    private void Tile10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tile10MouseClicked
        if ((mat[1][0] == 0)&&(winner == 0)) {
            mat[1][0] = turnP;
        
            if (turnP == 1) {
                Tile10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tresenrayag/TileX.png")));
                cambioturnodisp();
                turnP = 2; }
            else {
                Tile10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tresenrayag/TileO.png")));
                cambioturnodisp();
                turnP = 1; }
            turnos++;
            
            checkforwin();
            
            if ((Menu.JvsC == true)&&(turnos<9)&&(winner == 0)) {
                randomtile();
                checkforwin();
            }
        }
    }//GEN-LAST:event_Tile10MouseClicked

    //Cuando se presiona la casilla 11
    private void Tile11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tile11MouseClicked
        if ((mat[1][1] == 0)&&(winner == 0)) {
            mat[1][1] = turnP;
        
            if (turnP == 1) {
                Tile11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tresenrayag/TileX.png")));
                cambioturnodisp();
                turnP = 2; }
            else {
                Tile11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tresenrayag/TileO.png")));
                cambioturnodisp();
                turnP = 1; }
            turnos++;
            
            checkforwin();
            
            if ((Menu.JvsC == true)&&(turnos<9)&&(winner == 0)) {
                randomtile();
                checkforwin();
            }
        }
    }//GEN-LAST:event_Tile11MouseClicked

    //Cuando se presiona la casilla 12
    private void Tile12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tile12MouseClicked
        if ((mat[1][2] == 0)&&(winner == 0)) {
            mat[1][2] = turnP;
        
            if (turnP == 1) {
                Tile12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tresenrayag/TileX.png")));
                cambioturnodisp();
                turnP = 2; }
            else {
                Tile12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tresenrayag/TileO.png")));
                cambioturnodisp();
                turnP = 1; }
            turnos++;
            
            checkforwin();
            
            if ((Menu.JvsC == true)&&(turnos<9)&&(winner == 0)) {
                randomtile();
                checkforwin();
            }
        }
    }//GEN-LAST:event_Tile12MouseClicked

    //Cuando se presiona la casilla 20
    private void Tile20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tile20MouseClicked
        if ((mat[2][0] == 0)&&(winner == 0)) {
            mat[2][0] = turnP;
        
            if (turnP == 1) {
                Tile20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tresenrayag/TileX.png")));
                cambioturnodisp();
                turnP = 2; }
            else {
                Tile20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tresenrayag/TileO.png")));
                cambioturnodisp();
                turnP = 1; }
            turnos++;
            
            checkforwin();
            
            if ((Menu.JvsC == true)&&(turnos<9)&&(winner == 0)) {
                randomtile();
                checkforwin();
            }
        }
    }//GEN-LAST:event_Tile20MouseClicked

    //Cuando se presiona la casilla 21
    private void Tile21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tile21MouseClicked
        if ((mat[2][1] == 0)&&(winner == 0)) {
            mat[2][1] = turnP;
        
            if (turnP == 1) {
                Tile21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tresenrayag/TileX.png")));
                cambioturnodisp();
                turnP = 2; }
            else {
                Tile21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tresenrayag/TileO.png")));
                cambioturnodisp();
                turnP = 1; }
            turnos++;
            
            checkforwin();
            
            if ((Menu.JvsC == true)&&(turnos<9)&&(winner == 0)) {
                randomtile();
                checkforwin();
            }
        }
    }//GEN-LAST:event_Tile21MouseClicked

    //Cuando se presiona la casilla 22
    private void Tile22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tile22MouseClicked
        if ((mat[2][2] == 0)&&(winner == 0)) {
            mat[2][2] = turnP;
        
            if (turnP == 1) {
                Tile22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tresenrayag/TileX.png")));
                cambioturnodisp();
                turnP = 2; }
            else {
                Tile22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tresenrayag/TileO.png")));
                cambioturnodisp();
                turnP = 1; }
            turnos++;
            
            checkforwin();
            
            if ((Menu.JvsC == true)&&(turnos<9)&&(winner == 0)) {
                randomtile();
                checkforwin();
            }
        }
    }//GEN-LAST:event_Tile22MouseClicked

    //Evento para cambiar el color del fondo y las letras cuando el cursor está encima del botón
    private void PlayAgainMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlayAgainMouseEntered
        PlayAgain.setBackground(Color.white);
        PlayAgain.setForeground(Color.black);
    }//GEN-LAST:event_PlayAgainMouseEntered

    //Evento para cambiar el color del fondo y las letras cuando el cursor ya NO está encima del botón
    private void PlayAgainMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlayAgainMouseExited
        PlayAgain.setBackground(Color.black);
        PlayAgain.setForeground(Color.white);
    }//GEN-LAST:event_PlayAgainMouseExited

    //Cuando se presiona el boton de jugar de nuevo
    private void PlayAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayAgainActionPerformed
        //Devuelve a 0 turnos y ganador
        turnos = 0;
        winner = 0;
        
        //Esconde el texto de quien gana
        WinText.hide();
        //Procedimiento para que esconda las imagenes de X y O
        reseticons();
        
        //Por medio de dos ciclos devuelve las posiciones de la matriz a 0
        for (int f=0; f<3; f++) {
            for (int c=0; c<3; c++)
            {
                mat[f][c] = 0;
            }
        }
        
        //Si se está jugando contra la computadora
        if (vsPc == true)
            //muestra el boton para que empiece la consola
            PCStartButton.show();
        //Oculta el boton de jugar de nuevo
        PlayAgain.hide();
    }//GEN-LAST:event_PlayAgainActionPerformed
    
    //Cuando se presiona la casilla 00
    private void Tile00MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tile00MouseClicked
        if ((mat[0][0] == 0)&&(winner == 0)) {
            mat[0][0] = turnP;
        
            if (turnP == 1) {
                Tile00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tresenrayag/TileX.png")));
                cambioturnodisp();
                turnP = 2; }
            else {
                Tile00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tresenrayag/TileO.png")));
                cambioturnodisp();
                turnP = 1; }
            turnos++;
            
            checkforwin();
            
            if ((Menu.JvsC == true)&&(turnos<9)&&(winner == 0)) {
                randomtile();
                checkforwin();
            }
        }
    }//GEN-LAST:event_Tile00MouseClicked

    //Cuando se presiona el boton para que empiece la maquina
    private void PCStartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PCStartButtonActionPerformed
        //Asigna el valor de turno a el turno de la consola, si empieza 1,
        //el programa sabe que la consola está usando X, si es 2, está usando O
        PCturn = turnP;
        //Por medio de un procedimiento la computadora marca una casilla aleatoria
        randomtile();
        //Oculta el boton (Ya que es un boton de un solo uso)
        PCStartButton.hide();
    }//GEN-LAST:event_PCStartButtonActionPerformed

    //Para generar la ventana del juego
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }
    
    //cambioturnodisp cambia el texto a X u O depende del turno, pero este
    //procedimiento se hace antes de cambiar la variable turno, por lo que funciona
    //al revés, si el turno es uno entonces ahora mostrará que toca O, y viceversa
    static void cambioturnodisp()
    {
        //Si turno es 1
        if (turnP == 1) {
            //Cambia el texto de turno a O
            TextPlayer.setText("O");
            //Cambia el color del texto a rojo
            TextPlayer.setForeground(Color.red); }
        else {
            //Cambia el texto de turno a X
            TextPlayer.setText("X");
            //Cambia el color del texto a rojo
            TextPlayer.setForeground(Color.blue); }
    }
    
    //chekforwin contiene 8 if's, cada uno verifica si ya un patrón está hecho
    //la lógica es, si pos1 igual pos2 y pos1 igual pos3 y pos1 es diferente al valor nulo
    //entonces winner (que almacena quien gana) es igual a el valor en pos1, por lo que funciona
    //para ambos simbolos
    static void checkforwin()
    {
        //Si turno es igual a 1
        if (turnos == 1)
        {
            //Esconde el boton para que la consola empiece, pues ya empezó el jugador
            PCStartButton.hide();
            //el turno de consola es igual al turno actual (que ya sería diferente al del jugador)
            PCturn = turnP;
        }
        
        if ((mat[0][0] != 0)&&(mat[0][0] == mat[1][1])&&(mat[0][0] == mat[2][2])) //Diagonal izq
        {
            winner = mat[0][0];
        }
        if ((mat[0][2] != 0)&&(mat[0][2] == mat[1][1])&&(mat[0][2] == mat[2][0])) //Diagonal derecha
        {
            winner = mat[0][2];
        }
        if ((mat[0][0] == mat[0][1])&&(mat[0][0] == mat[0][2])&&(mat[0][0] != 0)) //Horizontal 1
        {
            winner = mat[0][0];
        }
        if ((mat[1][0] == mat[1][1])&&(mat[1][0] == mat[1][2])&&(mat[1][0] != 0)) //Horizontal 2
        {
            winner = mat[1][0];
        }
        if ((mat[2][0] == mat[2][1])&&(mat[2][0] == mat[2][2])&&(mat[2][0] != 0)) //Horizontal 3
        {
            winner = mat[2][0];
        }
        if ((mat[0][0] == mat[1][0])&&(mat[0][0] == mat[2][0])&&(mat[0][0] != 0)) //Vertical 1
        {
            winner = mat[0][0];
        }
        if ((mat[0][1] == mat[1][1])&&(mat[0][1] == mat[2][1])&&(mat[0][1] != 0)) //Vertical 2
        {
            winner = mat[0][1];
        }
        if ((mat[0][2] == mat[1][2])&&(mat[0][2] == mat[2][2])&&(mat[0][2] != 0)) //Vertical 3
        {
            winner = mat[0][2];
        }
        
        //Despues de verificar todos los patrones, y de definir un ganador si se cumplió un patrón
        //Se verifica si ya hay ganadores o si ya llegó a su limite (9 turnos)
        //Si ganador es 1
        if (winner == 1) {
            //Si NO se está jugando contra la maquina
            if (vsPc == false) {
                //Aparece el texto de victoria
                WinText.show();
                //Se cambia el texto de victoria
                WinText.setText("X GANA");
                //Se aumentan las victorias de X
                Xwin++;
                //Se aumentan las partidas jugadas
                games++;
                //Se actualizas los textos que tienen las estadisticas
                Xwinscant.setText(String.valueOf(Xwin));
                GamesCant.setText(String.valueOf(games));
                //Se cambia el color del texto de victoria
                WinText.setForeground(Color.blue);
            }
            //Si SÍ se está jugando contra la maquina
            else
            {
                //Se aumenta la cantidad de partidas jugadas contra la maquina
                partidasC++;
                //Si el ganador NO es la maquina
                if (winner != PCturn) {
                    //Se aumentan las victorias del jugador
                    winsP++;
                    //Muestra el texto de victorias
                    WinText.show();
                    //Cambia el texto de victoria
                    WinText.setText("Tú ganas");
                    //Cambia el color del texto de victoria
                    WinText.setForeground(Color.green);
                    //Se actualiza el texto de victorias
                    Xwinscant.setText(String.valueOf(winsP));
                    //Se actualiza el texto con las partidas contra la maquina
                    GamesCant.setText(String.valueOf(partidasC));
                }
                //Si el ganador es la maquina
                else {
                    //Se aumenta las victorias de la maquina
                    winsC++;
                    //Muestra el texto de victoria
                    WinText.show();
                    //Cambia el texto de victoria
                    WinText.setText("Consola gana");
                    //Cambia el color del texto de victoria
                    WinText.setForeground(Color.white);
                    //Actualiza el texto de victorias de la maquina
                    Owinscant.setText(String.valueOf(winsC));
                    //Actualiza el texto con las partidas contra la maquina
                    GamesCant.setText(String.valueOf(partidasC));
                }
            }
            //Se muestra el botón de jugar de nuevo
            PlayAgain.show();
        }
        //Si ganador es igual a 2
        if ( winner == 2) {
            //Si NO se está jugando contra la computadora
            if (vsPc == false) {
                //Muestra el texto de victoria
                WinText.show();
                //Cambia el texto de victoria
                WinText.setText("O GANA");
                //Cambia el color del texto de victoria
                WinText.setForeground(Color.red);
                //Aumenta la cantidad de victorias de O
                Owin++;
                //Aumenta la cantidad de partidas jugadas
                games++;
                //Actualiza el texto con la cantidad de victorias de O
                Owinscant.setText(String.valueOf(Owin));
                //Actualiza el texto con la cantidad de partidas jugadas
                GamesCant.setText(String.valueOf(games));
            }
            //Si SÍ se está jugando contra la maquina
            else {
                //Se aumentan las partidas jugadas contra la maquina
                partidasC++;
                //Si el ganador NO es la maquina
                if (winner != PCturn) {
                    //Aumenta las victorias del jugador
                    winsP++;
                    //Muestra el texto de victoria
                    WinText.show();
                    //Cambia el texto de victoria
                    WinText.setText("Tú ganas");
                    //Cambia el color del texto de victoria
                    WinText.setForeground(Color.green);
                    //Actualiza el texto con las victorias del jugador
                    Xwinscant.setText(String.valueOf(winsP));
                    //Actualiza el texto con las partidas jugadas contra la maquina
                    GamesCant.setText(String.valueOf(partidasC));
                }
                //Si el ganador SÍ es la maquina
                else {
                    //Aumenta la cantidad de victorias de la consola
                    winsC++;
                    //Muestra el texto de victoria
                    WinText.show();
                    //Cambia el texto de victoria
                    WinText.setText("Consola gana");
                    //Cambia el color del texto de victoria
                    WinText.setForeground(Color.white);
                    //Actualiza el texto con las victorias de la consola
                    Owinscant.setText(String.valueOf(winsC));
                    //Actualiza el texto con las partidas jugadas contra la consola
                    GamesCant.setText(String.valueOf(partidasC));
                }
            }
            //Muestra el boton para volver a jugar
            PlayAgain.show();
        }
        //Si aun no hay ganador pero ya se hicieron 9 turnos
        if ((winner == 0)&&(turnos == 9)) {
            //Si NO se juega contra la maquina
            if (vsPc == false) {
                //Se aumentan las partidas jugadas
                games++;
                //Se aumentan los empates
                Nowin++;
                //Se actualiza el texto con los empates
                Nowinscant.setText(String.valueOf(Nowin));
                //Se actualiza el texto con las partidas
                GamesCant.setText(String.valueOf(games));
                //Muestra el texto de victoria
                WinText.show();
                //Cambia el texto de victoria
                WinText.setText("NADIE GANA");
                //Cambia el color del texto de victoria
                WinText.setForeground(Color.white);
            }
            //Si SÍ se juega contra la maquina
            else {
                //Aumenta la cantidad de empates contra la consola
                empateC++;
                //Aumenta la cantidad de partidas contra la maquina
                partidasC++;
                //Actualiza el texto con los empates contra la maquina
                Nowinscant.setText(String.valueOf(empateC));
                //Actualiza el texto con las partidas contra la maquina
                GamesCant.setText(String.valueOf(partidasC));
                //Muestra el texto de victoria
                WinText.show();
                //Cambia el texto de victoria
                WinText.setText("NADIE GANA");
                //Cambia el color del texto de victoria
                WinText.setForeground(Color.white);
            }
            //Muestra el boton para jugar de nuevo
            PlayAgain.show();
        }
    }
    
    //Procedimiento que hace que las nueve casillas no tengan un icono, o sea que
    //no muestren ni O, ni X
    static void reseticons()
    {
        Tile00.setIcon(null);
        Tile01.setIcon(null);
        Tile02.setIcon(null);
        Tile10.setIcon(null);
        Tile11.setIcon(null);
        Tile12.setIcon(null);
        Tile20.setIcon(null);
        Tile21.setIcon(null);
        Tile22.setIcon(null);
    }
    
    //Procedimiento para que la maquina genere una casilla aleatoria
    public void randomtile()
    {
        //Genera una fila y una columna aleatoria hasta que la posicion esté libre
        do {
            //Asigna un valor aleatorio entre 0 y 2 a la variable f (fila)
            f = (int)(Math.random() * 3);
            //Aisgna un valor aleatorio entre 0 y 2 a la variable c (columna)
            c = (int)(Math.random() * 3);
        } while (mat[f][c] != 0); //Se repite hasta que la posición sea 0
        
        //la posicion aleatoria es igual al turno de la maquina
        mat[f][c] = turnP;
        
        //Si turno es igual a 1
        if (turnP == 1) {
            //realiza cambio de imagen de X de la casilla
            cambiosVsPcX();
        }
        //Si turno es igual a 2
        else
            //Realiza cambio de imagen de O de la casilla
            cambiosVsPcO();
        
        //Si turno es igual a 1
        if (turnP == 1) {
            //Realiza el cambio de texto de turno
            cambioturnodisp();
            //Devuelve turno a 2
            turnP = 2;
        }
        //Si turno es igual a 2
        else {
            //Realiza el cambio de texto de turno
            cambioturnodisp();
            //Devuelve turno a 1
            turnP = 1;
        }
        //Aumenta la cantidad de turnos
        turnos++;
    }
    
    //Realiza cambios de imagen a X segun la posicion aleatoria generada
    public void cambiosVsPcX()
    {
        //Si f = 0 y c = 0 entonces asigna la imagen al label Tile 00 y así con las 9 posiciones
        if ((f == 0)&&(c == 0))
            Tile00.setIcon(new javax.swing.ImageIcon(getClass().getResource("TileX.png")));
        if ((f == 0)&&(c == 1))
            Tile01.setIcon(new javax.swing.ImageIcon(getClass().getResource("TileX.png")));
        if ((f == 0)&&(c == 2))
            Tile02.setIcon(new javax.swing.ImageIcon(getClass().getResource("TileX.png")));
        if ((f == 1)&&(c == 0))
            Tile10.setIcon(new javax.swing.ImageIcon(getClass().getResource("TileX.png")));
        if ((f == 1)&&(c == 1))
            Tile11.setIcon(new javax.swing.ImageIcon(getClass().getResource("TileX.png")));
        if ((f == 1)&&(c == 2))
            Tile12.setIcon(new javax.swing.ImageIcon(getClass().getResource("TileX.png")));
        if ((f == 2)&&(c == 0))
            Tile20.setIcon(new javax.swing.ImageIcon(getClass().getResource("TileX.png")));
        if ((f == 2)&&(c == 1))
            Tile21.setIcon(new javax.swing.ImageIcon(getClass().getResource("TileX.png")));
        if ((f == 2)&&(c == 2))
            Tile22.setIcon(new javax.swing.ImageIcon(getClass().getResource("TileX.png")));
    }
    
    //Realiza cambios de imagen a O segun la posicion aleatoria general
    public void cambiosVsPcO()
    {
        //Si f = 0 y c = 0 entonces asigna la imagen al label Tile 00 y así con las 9 posiciones
        if ((f == 0)&&(c == 0))
            Tile00.setIcon(new javax.swing.ImageIcon(getClass().getResource("TileO.png")));
        if ((f == 0)&&(c == 1))
            Tile01.setIcon(new javax.swing.ImageIcon(getClass().getResource("TileO.png")));
        if ((f == 0)&&(c == 2))
            Tile02.setIcon(new javax.swing.ImageIcon(getClass().getResource("TileO.png")));
        if ((f == 1)&&(c == 0))
            Tile10.setIcon(new javax.swing.ImageIcon(getClass().getResource("TileO.png")));
        if ((f == 1)&&(c == 1))
            Tile11.setIcon(new javax.swing.ImageIcon(getClass().getResource("TileO.png")));
        if ((f == 1)&&(c == 2))
            Tile12.setIcon(new javax.swing.ImageIcon(getClass().getResource("TileO.png")));
        if ((f == 2)&&(c == 0))
            Tile20.setIcon(new javax.swing.ImageIcon(getClass().getResource("TileO.png")));
        if ((f == 2)&&(c == 1))
            Tile21.setIcon(new javax.swing.ImageIcon(getClass().getResource("TileO.png")));
        if ((f == 2)&&(c == 2))
            Tile22.setIcon(new javax.swing.ImageIcon(getClass().getResource("TileO.png")));
    }

    //Código autogenerado de NetBeans para definir los elementos del jFrame
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Author;
    public static javax.swing.JLabel GamesCant;
    private javax.swing.JLabel GridImg;
    private javax.swing.JPanel Jueguillo;
    private javax.swing.JButton MenuButton;
    public static javax.swing.JLabel Nowins;
    public static javax.swing.JLabel Nowinscant;
    public static javax.swing.JLabel Owins;
    public static javax.swing.JLabel Owinscant;
    public static javax.swing.JButton PCStartButton;
    public static javax.swing.JLabel PartidasText;
    public static javax.swing.JButton PlayAgain;
    public static javax.swing.JLabel TextPlayer;
    public static javax.swing.JLabel Tile00;
    public static javax.swing.JLabel Tile01;
    public static javax.swing.JLabel Tile02;
    public static javax.swing.JLabel Tile10;
    public static javax.swing.JLabel Tile11;
    public static javax.swing.JLabel Tile12;
    public static javax.swing.JLabel Tile20;
    public static javax.swing.JLabel Tile21;
    public static javax.swing.JLabel Tile22;
    private javax.swing.JLabel TurnText;
    public static javax.swing.JLabel VictoriesText;
    public static javax.swing.JLabel WinText;
    public static javax.swing.JLabel Xwins;
    public static javax.swing.JLabel Xwinscant;
    // End of variables declaration//GEN-END:variables
}
