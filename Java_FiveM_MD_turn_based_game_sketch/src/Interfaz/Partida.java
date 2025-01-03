package Interfaz;

import Characters.*;
import javax.swing.JOptionPane;
import Utilitario.Utilitario;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JLabel;

public class Partida extends javax.swing.JFrame {
    
    Utilitario U = new Utilitario();
    
    String PsInfo;
    String H1Info;
    String H2Info;
    String H3Info;
    
    Personaje Target;
    Personaje Atacante;
    
    public static Char_Greenbeam P1 = new Char_Greenbeam();
    public static Char_Crimson_X P2 = new Char_Crimson_X();
    public static Char_Crimson_X P3 = new Char_Crimson_X();
    public static Char_Greenbeam P4 = new Char_Greenbeam();
    public static Char_Mortem P5 = new Char_Mortem();
    public static Char_Greenbeam P6 = new Char_Greenbeam();
    public static Char_Crimson_X P7 = new Char_Crimson_X();
    public static Char_Crimson_X P8 = new Char_Crimson_X();
    public static Char_Greenbeam P9 = new Char_Greenbeam();
    public static Char_Mortem P10 = new Char_Mortem();
    
    List<Personaje> CicloIni = new ArrayList<>();
    List<Personaje> CicloAux = new ArrayList<>();
    int IndexCursor = 0;
    
    int EnJuego = 1;

    public Partida() {
        initComponents();
        
        CargarIcons(P1, P2, P3, P4, P5, P6, P7, P8, P9, P10);
        
        P1.CargarStats(P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, 5, 2, 2, 2, 2, "1");
        P2.CargarStats(P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, 5, 2, 2, 2, 2, "2");
        P3.CargarStats(P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, 5, 2, 2, 2, 2, "3");
        P4.CargarStats(P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, 5, 2, 2, 2, 2, "4");
        P5.CargarStats(P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, 5, 2, 2, 2, 2, "5");
        P6.CargarStats(P6, P7, P8, P9, P10, P1, P2, P3, P4, P5, 5, 2, 2, 2, 2, "6");
        P7.CargarStats(P6, P7, P8, P9, P10, P1, P2, P3, P4, P5, 5, 2, 2, 2, 2, "7");
        P8.CargarStats(P6, P7, P8, P9, P10, P1, P2, P3, P4, P5, 5, 2, 2, 2, 2, "8");
        P9.CargarStats(P6, P7, P8, P9, P10, P1, P2, P3, P4, P5, 5, 2, 2, 2, 2, "9");
        P10.CargarStats(P6, P7, P8, P9, P10, P1, P2, P3, P4, P5, 5, 2, 2, 2, 2, "10");
        
        SetCiclo();
        
        for (Personaje CicloIni1 : CicloIni) {
            CicloIni1.Start();
        }
        
        ////DOS ARRAYS, UNO ORIGINAL Y UNO PARA CONTROLAR LOS CAMBIOS DE VELOCIDAD
        
        SetTurno(CicloIni.get(0));
        
        Update();
    }
    
    public void CargarIcons(Personaje P1, Personaje P2, Personaje P3, Personaje P4, Personaje P5, Personaje P6, Personaje P7, Personaje P8, Personaje P9, Personaje P10) {
        Char1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Char_Icons/Char"+P1.getID()+".png")));
        Char2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Char_Icons/Char"+P2.getID()+".png")));
        Char3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Char_Icons/Char"+P3.getID()+".png")));
        Char4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Char_Icons/Char"+P4.getID()+".png")));
        Char5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Char_Icons/Char"+P5.getID()+".png")));
        Char6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Char_Icons/Char"+P6.getID()+".png")));
        Char7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Char_Icons/Char"+P7.getID()+".png")));
        Char8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Char_Icons/Char"+P8.getID()+".png")));
        Char9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Char_Icons/Char"+P9.getID()+".png")));
        Char10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Char_Icons/Char"+P10.getID()+".png")));
    }
    
    public void SetTurno (Personaje Target) {
        EvaluateWin();
        
        if (!Target.IsDead()) { //Si el personaje con el turno no está muerto
            if (U.hasRepair(Target) || U.hasRegen(Target) || U.hasHemorrhage(Target) || U.hasBleeding(Target) || U.isBurned(Target)) //Si el personaje con el turno tiene regeneración o sangrado
                Target.HealBleed();
        }
        
        if (!Target.IsDead() || U.isStunned(Target) || U.isFreezed(Target)) { //Si el personaje está vivo y no está aturdido o congelado
            Atacante = Target;
            LabelChar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Char_Icons/Char"+Target.getID()+".png")));
            LabelCharName.setText(Atacante.getName().toUpperCase());
            LabelPs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Char_Icons/Char"+Target.getID()+"Ps.png")));
            ButtonH1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Char_Icons/Char"+Target.getID()+"H1.png")));
            ButtonH2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Char_Icons/Char"+Target.getID()+"H2.png")));
            ButtonH3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Char_Icons/Char"+Target.getID()+"H3.png")));
            LabelCharLvl.setText("Lvl "+Atacante.getLVL());
            LabelPsLvl.setText("Lvl "+Atacante.getPsLvl());
            LabelH1Lvl.setText("Lvl "+Atacante.getH1Lvl());
            LabelH2Lvl.setText("Lvl "+Atacante.getH2Lvl());
            LabelH3Lvl.setText("Lvl "+Atacante.getH3Lvl());
            PsInfo = Target.getPsInfo();
            H1Info = Target.getH1Info();
            H2Info = Target.getH2Info();
            H3Info = Target.getH3Info();
            Target.AddEnergy();

            Reload();

            LabelH2Energy.setText(Atacante.getH2Energy()+" / "+Atacante.getH2MaxEnergy());
            LabelH3Energy.setText(Atacante.getH3Energy()+" / "+Atacante.getH3MaxEnergy());
        } else {
            if (Target.getEfectosN()[1] > 0)
                Target.getEfectosN()[1]--;
            else if (Target.getEfectosN()[0] > 0)
                Target.getEfectosN()[0]--;
            
            IndexCursor++;
            if (IndexCursor >= CicloIni.size())
                IndexCursor = 0;
            SetTurno(CicloIni.get(IndexCursor));
        }
    }
    
    public void SetCiclo() {
        CicloIni.add(P1);
        CicloIni.add(P2);
        CicloIni.add(P3);
        CicloIni.add(P4);
        CicloIni.add(P5);
        CicloIni.add(P6);
        CicloIni.add(P7);
        CicloIni.add(P8);
        CicloIni.add(P9);
        CicloIni.add(P10);
        
        Collections.sort(CicloIni, (p1, p2) -> {
            int Vel = Integer.compare(p2.getSPEED(), p1.getSPEED());
            if (Vel == 0) {
                int Lvl = Integer.compare(p2.getLVL(), p1.getLVL());
                if (Lvl == 0) {
                    return Integer.compare(p2.getDMG(), p1.getDMG());
                }
                return Lvl;
            }
            return Vel;
        });
        
        CicloAux = CicloIni;
    }
    
    public void Update() {
        CharHP1.setText(P1.getHP()+"/"+P1.getBaseHP());
        CharHP2.setText(P2.getHP()+"/"+P2.getBaseHP());
        CharHP3.setText(P3.getHP()+"/"+P3.getBaseHP());
        CharHP4.setText(P4.getHP()+"/"+P4.getBaseHP());
        CharHP5.setText(P5.getHP()+"/"+P5.getBaseHP());
        CharHP6.setText(P6.getHP()+"/"+P6.getBaseHP());
        CharHP7.setText(P7.getHP()+"/"+P7.getBaseHP());
        CharHP8.setText(P8.getHP()+"/"+P8.getBaseHP());
        CharHP9.setText(P9.getHP()+"/"+P9.getBaseHP());
        CharHP10.setText(P10.getHP()+"/"+P10.getBaseHP());
        
        CharShield1.setText(P1.getShield() + "/" + P1.getBaseHP());
        CharShield2.setText(P2.getShield() + "/" + P2.getBaseHP());
        CharShield3.setText(P3.getShield() + "/" + P3.getBaseHP());
        CharShield4.setText(P4.getShield() + "/" + P4.getBaseHP());
        CharShield5.setText(P5.getShield() + "/" + P5.getBaseHP());
        CharShield6.setText(P6.getShield() + "/" + P6.getBaseHP());
        CharShield7.setText(P7.getShield() + "/" + P7.getBaseHP());
        CharShield8.setText(P8.getShield() + "/" + P8.getBaseHP());
        CharShield9.setText(P9.getShield() + "/" + P9.getBaseHP());
        CharShield10.setText(P10.getShield() + "/" + P10.getBaseHP());
        
        // Actualizar las cargas de los personajes si tienen cargas
        updateCargas(P1, CharCargaFuego1);
        updateCargas(P2, CharCargaFuego2);
        updateCargas(P3, CharCargaFuego3);
        updateCargas(P4, CharCargaFuego4);
        updateCargas(P5, CharCargaFuego5);
        updateCargas(P6, CharCargaFuego6);
        updateCargas(P7, CharCargaFuego7);
        updateCargas(P8, CharCargaFuego8);
        updateCargas(P9, CharCargaFuego9);
        updateCargas(P10, CharCargaFuego10);
        
        /*
        int[] Cargas1 = P1.getCargas();
        int[] Cargas2 = P2.getCargas();
        int[] Cargas3 = P3.getCargas();
        int[] Cargas4 = P4.getCargas();
        int[] Cargas5 = P5.getCargas();
        int[] Cargas6 = P6.getCargas();
        int[] Cargas7 = P7.getCargas();
        int[] Cargas8 = P8.getCargas();
        int[] Cargas9 = P9.getCargas();
        int[] Cargas10 = P10.getCargas();
        
        CharCargaFuego1.setText(Cargas1[0]+"");
        CharCargaElec1.setText(Cargas1[1]+"");
        
        CharCargaFuego2.setText(Cargas2[0]+"");
        CharCargaElec2.setText(Cargas2[1]+"");
        
        CharCargaFuego3.setText(Cargas3[0]+"");
        CharCargaElec3.setText(Cargas3[1]+"");
        
        CharCargaFuego4.setText(Cargas4[0] + "");
        CharCargaElec4.setText(Cargas4[1] + "");

        CharCargaFuego5.setText(Cargas5[0] + "");
        CharCargaElec5.setText(Cargas5[1] + "");

        CharCargaFuego6.setText(Cargas6[0] + "");
        CharCargaElec6.setText(Cargas6[1] + "");

        CharCargaFuego7.setText(Cargas7[0] + "");
        CharCargaElec7.setText(Cargas7[1] + "");

        CharCargaFuego8.setText(Cargas8[0] + "");
        CharCargaElec8.setText(Cargas8[1] + "");

        CharCargaFuego9.setText(Cargas9[0] + "");
        CharCargaElec9.setText(Cargas9[1] + "");

        CharCargaFuego10.setText(Cargas10[0] + "");
        CharCargaElec10.setText(Cargas10[1] + "");
        */
    }
    
    public void updateCargas(Personaje personaje, JLabel fuegoLabel) {
        int[] cargas = personaje.getCargas();
        
        String txtcargas = " ";
        
        if (cargas != null && cargas.length > 0) {
            for (int i=0; i<cargas.length; i++) {
                if (i != 0)
                    txtcargas += ", ";
                txtcargas += cargas[i]+"";
            }
        }
        
        fuegoLabel.setText(txtcargas);
    }
    
    public void Reload() {
        Target = null;
        Char1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Char2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Char3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Char4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Char5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Char6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Char7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Char8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Char9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Char10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        
        if (Atacante.getInGameID() >= 1 && Atacante.getInGameID() <= 5) {
            Char1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 2));
            Char2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 2));
            Char3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 2));
            Char4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 2));
            Char5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 2));
        }
        else {
            Char6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 2));
            Char7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 2));
            Char8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 2));
            Char9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 2));
            Char10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 2));
        }
        
        switch(Atacante.getInGameID()) {
            case 1 -> {
                Char1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 2));
            }
            case 2 -> {
                Char2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 2));
            }
            case 3 -> {
                Char3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 2));
            }
            case 4 -> {
                Char4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 2));
            }
            case 5 -> {
                Char5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 2));
            }
            case 6 -> {
                Char6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 2));
            }
            case 7 -> {
                Char7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 2));
            }
            case 8 -> {
                Char8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 2));
            }
            case 9 -> {
                Char9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 2));
            }
            case 10 -> {
                Char10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 2));
            }
        }
        
        TurnOffDeads();
    }
    
    public void InfoStatus(Personaje Con) {
        String status = Con.getName();
        status += "\nNivel: "+Con.getLVL();
        status += "\nNivel Pasiva: "+Con.getPsLvl();
        status += "\nNivel Habilidad Básica: "+Con.getH1Lvl();
        status += "\nNivel Habilidad Estándar: "+Con.getH2Lvl();
        status += "\nNivel Habilidad Potente: "+Con.getH3Lvl();
                
        status += "\n\nEfectos Positivos: ";

        int cont=0;
        for (int i=0; i<Con.getEfectosP().length; i++) {
            if (Con.getEfectosP()[i] > 0) {
                status += "\n" + U.GetPEffectName(i) + ": " + Con.getEfectosP()[i];
                cont++;
            }
        }
        
        if (cont == 0) {
            status += "\nNo tiene";
        }

        status += "\n\nEfectos Negativos: ";

        cont = 0;
        for (int i=0; i<Con.getEfectosN().length; i++) {
            if (Con.getEfectosN()[i] > 0) {
                status += "\n" + U.GetNEffectName(i) + ": " + Con.getEfectosN()[i];
                cont++;
            }
        }
        
        if (cont == 0) {
            status += "\nNo tiene";
        }

        JOptionPane.showMessageDialog(null, status);
    }
    
    public void TurnOffDeads() {
        if (P1.IsDead())
            Char1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        if (P2.IsDead())
            Char2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        if (P3.IsDead())
            Char3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        if (P4.IsDead())
            Char4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        if (P5.IsDead())
            Char5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        if (P6.IsDead())
            Char6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        if (P7.IsDead())
            Char7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        if (P8.IsDead())
            Char8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        if (P9.IsDead())
            Char9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        if (P10.IsDead())
            Char10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Char1 = new javax.swing.JLabel();
        Char2 = new javax.swing.JLabel();
        Char3 = new javax.swing.JLabel();
        Char4 = new javax.swing.JLabel();
        Char5 = new javax.swing.JLabel();
        Char6 = new javax.swing.JLabel();
        Char7 = new javax.swing.JLabel();
        Char8 = new javax.swing.JLabel();
        Char9 = new javax.swing.JLabel();
        Char10 = new javax.swing.JLabel();
        CharHP1 = new javax.swing.JLabel();
        CharHP7 = new javax.swing.JLabel();
        CharHP6 = new javax.swing.JLabel();
        CharCargaFuego1 = new javax.swing.JLabel();
        CharCargaFuego7 = new javax.swing.JLabel();
        CharCargaFuego6 = new javax.swing.JLabel();
        ButtonStatusP1 = new javax.swing.JButton();
        ButtonStatusP2 = new javax.swing.JButton();
        ButtonStatusP3 = new javax.swing.JButton();
        ButtonStatusP4 = new javax.swing.JButton();
        ButtonStatusP5 = new javax.swing.JButton();
        ButtonStatusP6 = new javax.swing.JButton();
        ButtonStatusP7 = new javax.swing.JButton();
        CharHP2 = new javax.swing.JLabel();
        CharCargaFuego2 = new javax.swing.JLabel();
        CharCargaFuego3 = new javax.swing.JLabel();
        CharHP3 = new javax.swing.JLabel();
        CharHP4 = new javax.swing.JLabel();
        CharCargaFuego4 = new javax.swing.JLabel();
        CharHP5 = new javax.swing.JLabel();
        CharCargaFuego5 = new javax.swing.JLabel();
        ButtonStatusP8 = new javax.swing.JButton();
        CharHP8 = new javax.swing.JLabel();
        CharCargaFuego8 = new javax.swing.JLabel();
        CharHP9 = new javax.swing.JLabel();
        CharCargaFuego9 = new javax.swing.JLabel();
        ButtonStatusP9 = new javax.swing.JButton();
        CharHP10 = new javax.swing.JLabel();
        CharCargaFuego10 = new javax.swing.JLabel();
        ButtonStatusP10 = new javax.swing.JButton();
        CharShield1 = new javax.swing.JLabel();
        CharShield2 = new javax.swing.JLabel();
        CharShield3 = new javax.swing.JLabel();
        CharShield4 = new javax.swing.JLabel();
        CharShield5 = new javax.swing.JLabel();
        CharShield6 = new javax.swing.JLabel();
        CharShield7 = new javax.swing.JLabel();
        CharShield8 = new javax.swing.JLabel();
        CharShield9 = new javax.swing.JLabel();
        CharShield10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ButtonPsInfo = new javax.swing.JButton();
        ButtonH1 = new javax.swing.JButton();
        ButtonH1info = new javax.swing.JButton();
        ButtonH2 = new javax.swing.JButton();
        ButtonH2info = new javax.swing.JButton();
        ButtonH3 = new javax.swing.JButton();
        ButtonH3info = new javax.swing.JButton();
        LabelPs = new javax.swing.JLabel();
        LabelH2Energy = new javax.swing.JLabel();
        LabelH3Energy = new javax.swing.JLabel();
        LabelChar = new javax.swing.JLabel();
        LabelCharName = new javax.swing.JLabel();
        LabelCharLvl = new javax.swing.JLabel();
        LabelPsLvl = new javax.swing.JLabel();
        LabelH1Lvl = new javax.swing.JLabel();
        LabelH2Lvl = new javax.swing.JLabel();
        LabelH3Lvl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Partida Five M");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        Char1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Char1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Char1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Char1MouseClicked(evt);
            }
        });

        Char2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Char2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Char2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Char2MouseClicked(evt);
            }
        });

        Char3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Char3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Char3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Char3MouseClicked(evt);
            }
        });

        Char4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Char4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Char4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Char4MouseClicked(evt);
            }
        });

        Char5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Char5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Char5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Char5MouseClicked(evt);
            }
        });

        Char6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Char6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Char6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Char6MouseClicked(evt);
            }
        });

        Char7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Char7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Char7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Char7MouseClicked(evt);
            }
        });

        Char8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Char8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Char8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Char8MouseClicked(evt);
            }
        });

        Char9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Char9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Char9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Char9MouseClicked(evt);
            }
        });

        Char10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Char10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Char10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Char10MouseClicked(evt);
            }
        });

        CharHP1.setFont(new java.awt.Font("LEMON MILK", 0, 18)); // NOI18N
        CharHP1.setForeground(new java.awt.Color(153, 255, 153));
        CharHP1.setText("0/0");

        CharHP7.setFont(new java.awt.Font("LEMON MILK", 0, 18)); // NOI18N
        CharHP7.setForeground(new java.awt.Color(153, 255, 153));
        CharHP7.setText("0/0");

        CharHP6.setFont(new java.awt.Font("LEMON MILK", 0, 18)); // NOI18N
        CharHP6.setForeground(new java.awt.Color(153, 255, 153));
        CharHP6.setText("0/0");

        CharCargaFuego1.setFont(new java.awt.Font("LEMON MILK", 0, 18)); // NOI18N
        CharCargaFuego1.setForeground(new java.awt.Color(255, 153, 0));
        CharCargaFuego1.setText("0");

        CharCargaFuego7.setFont(new java.awt.Font("LEMON MILK", 0, 18)); // NOI18N
        CharCargaFuego7.setForeground(new java.awt.Color(255, 153, 0));
        CharCargaFuego7.setText("0");

        CharCargaFuego6.setFont(new java.awt.Font("LEMON MILK", 0, 18)); // NOI18N
        CharCargaFuego6.setForeground(new java.awt.Color(255, 153, 0));
        CharCargaFuego6.setText("0");

        ButtonStatusP1.setFont(new java.awt.Font("LEMON MILK", 0, 24)); // NOI18N
        ButtonStatusP1.setText("?");
        ButtonStatusP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonStatusP1ActionPerformed(evt);
            }
        });

        ButtonStatusP2.setFont(new java.awt.Font("LEMON MILK", 0, 24)); // NOI18N
        ButtonStatusP2.setText("?");
        ButtonStatusP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonStatusP2ActionPerformed(evt);
            }
        });

        ButtonStatusP3.setFont(new java.awt.Font("LEMON MILK", 0, 24)); // NOI18N
        ButtonStatusP3.setText("?");
        ButtonStatusP3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonStatusP3ActionPerformed(evt);
            }
        });

        ButtonStatusP4.setFont(new java.awt.Font("LEMON MILK", 0, 24)); // NOI18N
        ButtonStatusP4.setText("?");
        ButtonStatusP4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonStatusP4ActionPerformed(evt);
            }
        });

        ButtonStatusP5.setFont(new java.awt.Font("LEMON MILK", 0, 24)); // NOI18N
        ButtonStatusP5.setText("?");
        ButtonStatusP5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonStatusP5ActionPerformed(evt);
            }
        });

        ButtonStatusP6.setFont(new java.awt.Font("LEMON MILK", 0, 24)); // NOI18N
        ButtonStatusP6.setText("?");
        ButtonStatusP6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonStatusP6ActionPerformed(evt);
            }
        });

        ButtonStatusP7.setFont(new java.awt.Font("LEMON MILK", 0, 24)); // NOI18N
        ButtonStatusP7.setText("?");
        ButtonStatusP7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonStatusP7ActionPerformed(evt);
            }
        });

        CharHP2.setFont(new java.awt.Font("LEMON MILK", 0, 18)); // NOI18N
        CharHP2.setForeground(new java.awt.Color(153, 255, 153));
        CharHP2.setText("0/0");

        CharCargaFuego2.setFont(new java.awt.Font("LEMON MILK", 0, 18)); // NOI18N
        CharCargaFuego2.setForeground(new java.awt.Color(255, 153, 0));
        CharCargaFuego2.setText("0");

        CharCargaFuego3.setFont(new java.awt.Font("LEMON MILK", 0, 18)); // NOI18N
        CharCargaFuego3.setForeground(new java.awt.Color(255, 153, 0));
        CharCargaFuego3.setText("0");

        CharHP3.setFont(new java.awt.Font("LEMON MILK", 0, 18)); // NOI18N
        CharHP3.setForeground(new java.awt.Color(153, 255, 153));
        CharHP3.setText("0/0");

        CharHP4.setFont(new java.awt.Font("LEMON MILK", 0, 18)); // NOI18N
        CharHP4.setForeground(new java.awt.Color(153, 255, 153));
        CharHP4.setText("0/0");

        CharCargaFuego4.setFont(new java.awt.Font("LEMON MILK", 0, 18)); // NOI18N
        CharCargaFuego4.setForeground(new java.awt.Color(255, 153, 0));
        CharCargaFuego4.setText("0");

        CharHP5.setFont(new java.awt.Font("LEMON MILK", 0, 18)); // NOI18N
        CharHP5.setForeground(new java.awt.Color(153, 255, 153));
        CharHP5.setText("0/0");

        CharCargaFuego5.setFont(new java.awt.Font("LEMON MILK", 0, 18)); // NOI18N
        CharCargaFuego5.setForeground(new java.awt.Color(255, 153, 0));
        CharCargaFuego5.setText("0");

        ButtonStatusP8.setFont(new java.awt.Font("LEMON MILK", 0, 24)); // NOI18N
        ButtonStatusP8.setText("?");
        ButtonStatusP8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonStatusP8ActionPerformed(evt);
            }
        });

        CharHP8.setFont(new java.awt.Font("LEMON MILK", 0, 18)); // NOI18N
        CharHP8.setForeground(new java.awt.Color(153, 255, 153));
        CharHP8.setText("0/0");

        CharCargaFuego8.setFont(new java.awt.Font("LEMON MILK", 0, 18)); // NOI18N
        CharCargaFuego8.setForeground(new java.awt.Color(255, 153, 0));
        CharCargaFuego8.setText("0");

        CharHP9.setFont(new java.awt.Font("LEMON MILK", 0, 18)); // NOI18N
        CharHP9.setForeground(new java.awt.Color(153, 255, 153));
        CharHP9.setText("0/0");

        CharCargaFuego9.setFont(new java.awt.Font("LEMON MILK", 0, 18)); // NOI18N
        CharCargaFuego9.setForeground(new java.awt.Color(255, 153, 0));
        CharCargaFuego9.setText("0");

        ButtonStatusP9.setFont(new java.awt.Font("LEMON MILK", 0, 24)); // NOI18N
        ButtonStatusP9.setText("?");
        ButtonStatusP9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonStatusP9ActionPerformed(evt);
            }
        });

        CharHP10.setFont(new java.awt.Font("LEMON MILK", 0, 18)); // NOI18N
        CharHP10.setForeground(new java.awt.Color(153, 255, 153));
        CharHP10.setText("0/0");

        CharCargaFuego10.setFont(new java.awt.Font("LEMON MILK", 0, 18)); // NOI18N
        CharCargaFuego10.setForeground(new java.awt.Color(255, 153, 0));
        CharCargaFuego10.setText("0");

        ButtonStatusP10.setFont(new java.awt.Font("LEMON MILK", 0, 24)); // NOI18N
        ButtonStatusP10.setText("?");
        ButtonStatusP10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonStatusP10ActionPerformed(evt);
            }
        });

        CharShield1.setFont(new java.awt.Font("LEMON MILK", 0, 18)); // NOI18N
        CharShield1.setForeground(new java.awt.Color(153, 200, 255));
        CharShield1.setText("0/0");

        CharShield2.setFont(new java.awt.Font("LEMON MILK", 0, 18)); // NOI18N
        CharShield2.setForeground(new java.awt.Color(153, 200, 255));
        CharShield2.setText("0/0");

        CharShield3.setFont(new java.awt.Font("LEMON MILK", 0, 18)); // NOI18N
        CharShield3.setForeground(new java.awt.Color(153, 200, 255));
        CharShield3.setText("0/0");

        CharShield4.setFont(new java.awt.Font("LEMON MILK", 0, 18)); // NOI18N
        CharShield4.setForeground(new java.awt.Color(153, 200, 255));
        CharShield4.setText("0/0");

        CharShield5.setFont(new java.awt.Font("LEMON MILK", 0, 18)); // NOI18N
        CharShield5.setForeground(new java.awt.Color(153, 200, 255));
        CharShield5.setText("0/0");

        CharShield6.setFont(new java.awt.Font("LEMON MILK", 0, 18)); // NOI18N
        CharShield6.setForeground(new java.awt.Color(153, 200, 255));
        CharShield6.setText("0/0");

        CharShield7.setFont(new java.awt.Font("LEMON MILK", 0, 18)); // NOI18N
        CharShield7.setForeground(new java.awt.Color(153, 200, 255));
        CharShield7.setText("0/0");

        CharShield8.setFont(new java.awt.Font("LEMON MILK", 0, 18)); // NOI18N
        CharShield8.setForeground(new java.awt.Color(153, 200, 255));
        CharShield8.setText("0/0");

        CharShield9.setFont(new java.awt.Font("LEMON MILK", 0, 18)); // NOI18N
        CharShield9.setForeground(new java.awt.Color(153, 200, 255));
        CharShield9.setText("0/0");

        CharShield10.setFont(new java.awt.Font("LEMON MILK", 0, 18)); // NOI18N
        CharShield10.setForeground(new java.awt.Color(153, 200, 255));
        CharShield10.setText("0/0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Char3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CharCargaFuego3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CharHP3)
                                .addGap(18, 18, 18)
                                .addComponent(CharShield3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 735, Short.MAX_VALUE)
                        .addComponent(CharCargaFuego8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Char1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CharCargaFuego1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CharCargaFuego6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(CharHP1)
                                .addGap(18, 18, 18)
                                .addComponent(CharShield1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ButtonStatusP6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CharHP6)
                                .addGap(18, 18, 18)
                                .addComponent(CharShield6))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Char2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CharCargaFuego2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(CharHP2)
                                                .addGap(18, 18, 18)
                                                .addComponent(CharShield2))
                                            .addComponent(CharShield4, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(CharShield5, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ButtonStatusP3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ButtonStatusP2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ButtonStatusP4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ButtonStatusP5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ButtonStatusP1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Char4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CharHP4)
                                    .addComponent(CharCargaFuego4)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Char5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CharHP5)
                                    .addComponent(CharCargaFuego5))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(ButtonStatusP10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(CharHP10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CharShield10))
                                .addComponent(CharCargaFuego10, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(ButtonStatusP9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(CharHP9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CharShield9))
                                .addComponent(CharCargaFuego9, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(ButtonStatusP8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(CharHP8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CharShield8))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(ButtonStatusP7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(CharHP7)
                                    .addGap(18, 18, 18)
                                    .addComponent(CharShield7)))
                            .addComponent(CharCargaFuego7, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Char10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Char9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Char8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Char7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Char6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(CharHP1)
                                                    .addComponent(CharHP6)
                                                    .addComponent(ButtonStatusP1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(ButtonStatusP6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(CharShield1)
                                                    .addComponent(CharShield6))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(CharCargaFuego1)
                                                    .addComponent(CharCargaFuego6))
                                                .addGap(30, 30, 30))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Char6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Char1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Char7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Char2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(CharHP2)
                                                    .addComponent(ButtonStatusP2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(CharShield2))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(CharCargaFuego2)
                                                .addGap(30, 30, 30))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(CharHP7)
                                            .addComponent(CharShield7)
                                            .addComponent(ButtonStatusP7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CharCargaFuego7)
                                        .addGap(30, 30, 30)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Char8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Char3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(CharHP8)
                                            .addComponent(ButtonStatusP8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CharShield8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CharCargaFuego8)
                                        .addGap(30, 30, 30))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CharHP3)
                                    .addComponent(ButtonStatusP3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CharShield3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CharCargaFuego3)
                                .addGap(30, 30, 30)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Char9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Char4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CharHP9)
                                    .addComponent(ButtonStatusP9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CharShield9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CharCargaFuego9)
                                .addGap(30, 30, 30))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CharHP4)
                            .addComponent(ButtonStatusP4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CharShield4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CharCargaFuego4)
                        .addGap(30, 30, 30)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Char10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Char5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CharHP5)
                            .addComponent(ButtonStatusP5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CharShield5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CharCargaFuego5)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CharHP10)
                            .addComponent(ButtonStatusP10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CharShield10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CharCargaFuego10)
                        .addGap(30, 30, 30)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        ButtonPsInfo.setFont(new java.awt.Font("LEMON MILK", 0, 24)); // NOI18N
        ButtonPsInfo.setText("?");
        ButtonPsInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPsInfoActionPerformed(evt);
            }
        });

        ButtonH1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonH1ActionPerformed(evt);
            }
        });

        ButtonH1info.setFont(new java.awt.Font("LEMON MILK", 0, 24)); // NOI18N
        ButtonH1info.setText("?");
        ButtonH1info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonH1infoActionPerformed(evt);
            }
        });

        ButtonH2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonH2ActionPerformed(evt);
            }
        });

        ButtonH2info.setFont(new java.awt.Font("LEMON MILK", 0, 24)); // NOI18N
        ButtonH2info.setText("?");
        ButtonH2info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonH2infoActionPerformed(evt);
            }
        });

        ButtonH3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonH3ActionPerformed(evt);
            }
        });

        ButtonH3info.setFont(new java.awt.Font("LEMON MILK", 0, 24)); // NOI18N
        ButtonH3info.setText("?");
        ButtonH3info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonH3infoActionPerformed(evt);
            }
        });

        LabelPs.setBackground(new java.awt.Color(0, 0, 0));
        LabelPs.setForeground(new java.awt.Color(78, 80, 82));
        LabelPs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelPs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        LabelH2Energy.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LabelH2Energy.setForeground(new java.awt.Color(0, 0, 0));
        LabelH2Energy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelH2Energy.setText("jLabel1");

        LabelH3Energy.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LabelH3Energy.setForeground(new java.awt.Color(0, 0, 0));
        LabelH3Energy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelH3Energy.setText("jLabel1");

        LabelChar.setBackground(new java.awt.Color(0, 0, 0));
        LabelChar.setForeground(new java.awt.Color(78, 80, 82));
        LabelChar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelChar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        LabelCharName.setBackground(new java.awt.Color(0, 0, 0));
        LabelCharName.setFont(new java.awt.Font("Caviar Dreams", 1, 18)); // NOI18N
        LabelCharName.setForeground(new java.awt.Color(78, 80, 82));
        LabelCharName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelCharName.setText("CRIMSON X");
        LabelCharName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        LabelCharLvl.setBackground(new java.awt.Color(0, 0, 0));
        LabelCharLvl.setFont(new java.awt.Font("Caviar Dreams", 1, 18)); // NOI18N
        LabelCharLvl.setForeground(new java.awt.Color(78, 80, 82));
        LabelCharLvl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelCharLvl.setText("Lvl 3");
        LabelCharLvl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        LabelPsLvl.setBackground(new java.awt.Color(0, 0, 0));
        LabelPsLvl.setFont(new java.awt.Font("Caviar Dreams", 1, 18)); // NOI18N
        LabelPsLvl.setForeground(new java.awt.Color(78, 80, 82));
        LabelPsLvl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelPsLvl.setText("Lvl 3");
        LabelPsLvl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        LabelH1Lvl.setBackground(new java.awt.Color(0, 0, 0));
        LabelH1Lvl.setFont(new java.awt.Font("Caviar Dreams", 1, 18)); // NOI18N
        LabelH1Lvl.setForeground(new java.awt.Color(78, 80, 82));
        LabelH1Lvl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelH1Lvl.setText("Lvl 3");
        LabelH1Lvl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        LabelH2Lvl.setBackground(new java.awt.Color(0, 0, 0));
        LabelH2Lvl.setFont(new java.awt.Font("Caviar Dreams", 1, 18)); // NOI18N
        LabelH2Lvl.setForeground(new java.awt.Color(78, 80, 82));
        LabelH2Lvl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelH2Lvl.setText("Lvl 3");
        LabelH2Lvl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        LabelH3Lvl.setBackground(new java.awt.Color(0, 0, 0));
        LabelH3Lvl.setFont(new java.awt.Font("Caviar Dreams", 1, 18)); // NOI18N
        LabelH3Lvl.setForeground(new java.awt.Color(78, 80, 82));
        LabelH3Lvl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelH3Lvl.setText("Lvl 3");
        LabelH3Lvl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LabelCharName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(LabelChar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(LabelCharLvl)))
                        .addGap(26, 26, 26)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(LabelPs, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelPsLvl)
                            .addComponent(ButtonPsInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonH1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelH1Lvl)
                            .addComponent(ButtonH1info, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonH2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LabelH2Lvl)
                                    .addComponent(ButtonH2info, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(ButtonH3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LabelH3Lvl)
                                    .addComponent(ButtonH3info, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(LabelH2Energy, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LabelH3Energy, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelH2Energy)
                            .addComponent(LabelH3Energy))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ButtonH2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ButtonH3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ButtonH2info, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ButtonH3info, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ButtonH1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonH1info, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelH1Lvl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelH2Lvl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelH3Lvl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(LabelPs, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonPsInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelPsLvl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(LabelChar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelCharName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelCharLvl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonH1infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonH1infoActionPerformed
        JOptionPane.showMessageDialog(null, H1Info, "Habilidad Básica:", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_ButtonH1infoActionPerformed

    private void ButtonH1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonH1ActionPerformed
        if (Target == null)
            JOptionPane.showMessageDialog(null, "No hay ningún objetivo seleccionado", "Error", JOptionPane.ERROR_MESSAGE);
        else {
            if (Target.getHP() == 0) {
                JOptionPane.showMessageDialog(null, "Sí claro, atacar un cadáver.");
            }
            else {
                Atacante.H1Get(Target, Target.getEfectosN(), Target.getEfectosP());
                
                Atacante.UpdateEfectos();

                Update();
                
                IndexCursor++;
                if (IndexCursor >= CicloIni.size())
                    IndexCursor = 0;
                SetTurno(CicloIni.get(IndexCursor));
            }
        }
    }//GEN-LAST:event_ButtonH1ActionPerformed

    private void ButtonH2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonH2ActionPerformed
        if (Atacante.getH2Behave().equals("Harm") && (Target != Atacante.Aliado1()
                                                  && Target != Atacante.Aliado2()
                                                  && Target != Atacante.Aliado3()
                                                  && Target != Atacante.Aliado4()
                                                  && Target != Atacante.Aliado5())) {
            if (Atacante.getH2Energy() == Atacante.getH2MaxEnergy()) {
                if (Target == null)
                    JOptionPane.showMessageDialog(null, "No hay ningún objetivo seleccionado", "Error", JOptionPane.ERROR_MESSAGE);
                else {
                    if (Target.IsDead()) {
                        JOptionPane.showMessageDialog(null, "No puedes atacar un cadáver", "...", JOptionPane.ERROR_MESSAGE);
                    }
                    else {
                        Atacante.H2Get(Target, Target.getEfectosN(), Target.getEfectosP());

                        Atacante.UpdateEfectos();

                        Update();

                        IndexCursor++;
                        if (IndexCursor >= CicloIni.size())
                            IndexCursor = 0;
                        SetTurno(CicloIni.get(IndexCursor));
                    }
                }
            }
            else {
                JOptionPane.showMessageDialog(null, Atacante.msgH2NotReady());
            }
        } else if (Atacante.getH2Behave().equals("Good")) {
            if (Atacante.getH2Energy() == Atacante.getH2MaxEnergy()) {
                Target = Atacante.Aliado1();
                Atacante.H2Get(Target, Target.getEfectosN(), Target.getEfectosP());

                Atacante.UpdateEfectos();

                Update();

                IndexCursor++;
                if (IndexCursor >= CicloIni.size())
                    IndexCursor = 0;
                SetTurno(CicloIni.get(IndexCursor));
            }
            else {
                JOptionPane.showMessageDialog(null, Atacante.msgH2NotReady());
            }
        } else {
            JOptionPane.showMessageDialog(null, "No puedes atacar un aliado");
        }
        
        
    }//GEN-LAST:event_ButtonH2ActionPerformed

    private void ButtonH2infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonH2infoActionPerformed
        JOptionPane.showMessageDialog(null, H2Info, "Habilidad Estándar:", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_ButtonH2infoActionPerformed

    private void ButtonPsInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPsInfoActionPerformed
        JOptionPane.showMessageDialog(null, PsInfo, "Pasiva:", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_ButtonPsInfoActionPerformed

    private void ButtonH3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonH3ActionPerformed
        if (Atacante.getH3Behave().equals("Harm") && (Target != Atacante.Aliado1()
                                                  && Target != Atacante.Aliado2()
                                                  && Target != Atacante.Aliado3()
                                                  && Target != Atacante.Aliado4()
                                                  && Target != Atacante.Aliado5())) {
            if (Atacante.getH3Energy() == Atacante.getH3MaxEnergy()) {
                if (Target == null)
                    JOptionPane.showMessageDialog(null, "No hay ningún objetivo seleccionado", "Error", JOptionPane.ERROR_MESSAGE);
                else {
                    if (Target.IsDead()) {
                        JOptionPane.showMessageDialog(null, "No puedes atacar un cadáver", "...", JOptionPane.ERROR_MESSAGE);
                    }
                    else {
                        Atacante.H3Get(Target, Target.getEfectosN(), Target.getEfectosP());

                        Atacante.UpdateEfectos();

                        Update();

                        IndexCursor++;
                        if (IndexCursor >= CicloIni.size())
                            IndexCursor = 0;
                        SetTurno(CicloIni.get(IndexCursor));
                    }
                }
            }
            else {
                JOptionPane.showMessageDialog(null, Atacante.msgH3NotReady());
            }
        } else if (Atacante.getH2Behave().equals("Good")) {
            if (Atacante.getH2Energy() == Atacante.getH2MaxEnergy()) {
                Target = Atacante.Aliado1();
                Atacante.H2Get(Target, Target.getEfectosN(), Target.getEfectosP());

                Atacante.UpdateEfectos();

                Update();

                IndexCursor++;
                if (IndexCursor >= CicloIni.size())
                    IndexCursor = 0;
                SetTurno(CicloIni.get(IndexCursor));
            }
            else {
                JOptionPane.showMessageDialog(null, Atacante.msgH2NotReady());
            }
        } else {
            JOptionPane.showMessageDialog(null, "No puedes atacar un aliado");
        }
        
        /*if (Atacante.getH3Behave().equals("Good")) {
            if (Atacante.getH3Energy() == Atacante.getH3MaxEnergy()) {
                Target = Atacante.Aliado1();
                Atacante.H3Get(Target, Target.getEfectosN(), Target.getEfectosP());

                Atacante.UpdateEfectos();

                Update();

                IndexCursor++;
                if (IndexCursor >= CicloIni.size())
                    IndexCursor = 0;
                SetTurno(CicloIni.get(IndexCursor));
            }
            else {
                JOptionPane.showMessageDialog(null, Atacante.msgH3NotReady());
            }
        }*/
    }//GEN-LAST:event_ButtonH3ActionPerformed

    private void ButtonH3infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonH3infoActionPerformed
        JOptionPane.showMessageDialog(null, H3Info, "Habilidad Potente:", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_ButtonH3infoActionPerformed

    private void ButtonStatusP10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonStatusP10ActionPerformed
        InfoStatus(P10);
    }//GEN-LAST:event_ButtonStatusP10ActionPerformed

    private void ButtonStatusP9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonStatusP9ActionPerformed
        InfoStatus(P9);
    }//GEN-LAST:event_ButtonStatusP9ActionPerformed

    private void ButtonStatusP8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonStatusP8ActionPerformed
        InfoStatus(P8);
    }//GEN-LAST:event_ButtonStatusP8ActionPerformed

    private void ButtonStatusP7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonStatusP7ActionPerformed
        InfoStatus(P7);
    }//GEN-LAST:event_ButtonStatusP7ActionPerformed

    private void ButtonStatusP6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonStatusP6ActionPerformed
        InfoStatus(P6);
    }//GEN-LAST:event_ButtonStatusP6ActionPerformed

    private void ButtonStatusP5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonStatusP5ActionPerformed
        InfoStatus(P5);
    }//GEN-LAST:event_ButtonStatusP5ActionPerformed

    private void ButtonStatusP4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonStatusP4ActionPerformed
        InfoStatus(P4);
    }//GEN-LAST:event_ButtonStatusP4ActionPerformed

    private void ButtonStatusP3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonStatusP3ActionPerformed
        InfoStatus(P3);
    }//GEN-LAST:event_ButtonStatusP3ActionPerformed

    private void ButtonStatusP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonStatusP2ActionPerformed
        InfoStatus(P2);
    }//GEN-LAST:event_ButtonStatusP2ActionPerformed

    private void ButtonStatusP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonStatusP1ActionPerformed
        InfoStatus(P1);
    }//GEN-LAST:event_ButtonStatusP1ActionPerformed

    private void Char10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Char10MouseClicked
        if (Atacante.getInGameID() >= 1 && Atacante.getInGameID() <= 5) {
            Target = P10;
            if (!Target.IsDead()) {
                Char10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));

                Char6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
                Char7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
                Char8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
                Char9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
            } else {
                JOptionPane.showMessageDialog(null, "No puedes atacar un cadáver");
                Target = null;
            }
        } else {
            JOptionPane.showMessageDialog(null, "No puedes atacar a un aliado");
        }
        
        TurnOffDeads();
    }//GEN-LAST:event_Char10MouseClicked

    private void Char9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Char9MouseClicked
        if (Atacante.getInGameID() >= 1 && Atacante.getInGameID() <= 5) {
            Target = P9;
            if (!Target.IsDead()) {
                Char9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));

                Char6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
                Char7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
                Char8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
                Char10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
            } else {
                JOptionPane.showMessageDialog(null, "No puedes atacar un cadáver");
                Target = null;
            }
        } else {
            JOptionPane.showMessageDialog(null, "No puedes atacar a un aliado");
        }
        
        TurnOffDeads();
    }//GEN-LAST:event_Char9MouseClicked

    private void Char8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Char8MouseClicked
        if (Atacante.getInGameID() >= 1 && Atacante.getInGameID() <= 5) {
            Target = P8;
            if (!Target.IsDead()) {
                Char8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));

                Char6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
                Char7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
                Char9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
                Char10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
            } else {
                JOptionPane.showMessageDialog(null, "No puedes atacar un cadáver");
                Target = null;
            }
        } else {
            JOptionPane.showMessageDialog(null, "No puedes atacar a un aliado");
        }
        
        TurnOffDeads();
    }//GEN-LAST:event_Char8MouseClicked

    private void Char7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Char7MouseClicked
        if (Atacante.getInGameID() >= 1 && Atacante.getInGameID() <= 5) {
            Target = P7;
            if (!Target.IsDead()) {
                Char7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));

                Char6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
                Char8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
                Char9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
                Char10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
            } else {
                JOptionPane.showMessageDialog(null, "No puedes atacar un cadáver");
                Target = null;
            }
        } else {
            JOptionPane.showMessageDialog(null, "No puedes atacar a un aliado");
        }
        
        TurnOffDeads();
    }//GEN-LAST:event_Char7MouseClicked

    private void Char6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Char6MouseClicked
        if (Atacante.getInGameID() >= 1 && Atacante.getInGameID() <= 5) {
            Target = P6;
            if (!Target.IsDead()) {
                Char6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));

                Char7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
                Char8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
                Char9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
                Char10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
            } else {
                JOptionPane.showMessageDialog(null, "No puedes atacar un cadáver");
                Target = null;
            }
        } else {
            JOptionPane.showMessageDialog(null, "No puedes atacar a un aliado");
        }
        
        TurnOffDeads();
    }//GEN-LAST:event_Char6MouseClicked

    private void Char5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Char5MouseClicked
        if (Atacante.getInGameID() >= 6 && Atacante.getInGameID() <= 10) {
            Target = P5;
            if (!Target.IsDead()) {
                Char5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));

                Char1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
                Char2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
                Char3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
                Char4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
            } else {
                JOptionPane.showMessageDialog(null, "No puedes atacar un cadáver");
                Target = null;
            }
        } else {
            JOptionPane.showMessageDialog(null, "No puedes atacar a un aliado");
        }
        
        TurnOffDeads();
    }//GEN-LAST:event_Char5MouseClicked

    private void Char4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Char4MouseClicked
        if (Atacante.getInGameID() >= 6 && Atacante.getInGameID() <= 10) {
            Target = P4;
            if (!Target.IsDead()) {
                Char4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));

                Char1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
                Char2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
                Char3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
                Char5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
            } else {
                JOptionPane.showMessageDialog(null, "No puedes atacar un cadáver");
                Target = null;
            }
        } else {
            JOptionPane.showMessageDialog(null, "No puedes atacar a un aliado");
        }
        
        TurnOffDeads();
    }//GEN-LAST:event_Char4MouseClicked

    private void Char3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Char3MouseClicked
        if (Atacante.getInGameID() >= 6 && Atacante.getInGameID() <= 10) {
            Target = P3;
            if (!Target.IsDead()) {
                Char3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));

                Char1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
                Char2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
                Char4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
                Char5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
            } else {
                JOptionPane.showMessageDialog(null, "No puedes atacar un cadáver");
                Target = null;
            }
        } else {
            JOptionPane.showMessageDialog(null, "No puedes atacar a un aliado");
        }
        
        TurnOffDeads();
    }//GEN-LAST:event_Char3MouseClicked

    private void Char2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Char2MouseClicked
        if (Atacante.getInGameID() >= 6 && Atacante.getInGameID() <= 10) {
            Target = P2;
            if (!Target.IsDead()) {
                Char2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));

                Char1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
                Char3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
                Char4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
                Char5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
            } else {
                JOptionPane.showMessageDialog(null, "No puedes atacar un cadáver");
                Target = null;
            }
        } else {
            JOptionPane.showMessageDialog(null, "No puedes atacar a un aliado");
        }
        
        TurnOffDeads();
    }//GEN-LAST:event_Char2MouseClicked

    private void Char1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Char1MouseClicked
        if (Atacante.getInGameID() >= 6 && Atacante.getInGameID() <= 10) {
            Target = P1;
            if (!Target.IsDead()) {
                Char1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));

                Char2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
                Char3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
                Char4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
                Char5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
            } else {
                JOptionPane.showMessageDialog(null, "No puedes atacar un cadáver");
                Target = null;
            }
        } else {
            JOptionPane.showMessageDialog(null, "No puedes atacar a un aliado");
        }
        
        TurnOffDeads();
    }//GEN-LAST:event_Char1MouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Partida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Partida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Partida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Partida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Partida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonH1;
    private javax.swing.JButton ButtonH1info;
    private javax.swing.JButton ButtonH2;
    private javax.swing.JButton ButtonH2info;
    private javax.swing.JButton ButtonH3;
    private javax.swing.JButton ButtonH3info;
    private javax.swing.JButton ButtonPsInfo;
    private javax.swing.JButton ButtonStatusP1;
    private javax.swing.JButton ButtonStatusP10;
    private javax.swing.JButton ButtonStatusP2;
    private javax.swing.JButton ButtonStatusP3;
    private javax.swing.JButton ButtonStatusP4;
    private javax.swing.JButton ButtonStatusP5;
    private javax.swing.JButton ButtonStatusP6;
    private javax.swing.JButton ButtonStatusP7;
    private javax.swing.JButton ButtonStatusP8;
    private javax.swing.JButton ButtonStatusP9;
    private javax.swing.JLabel Char1;
    private javax.swing.JLabel Char10;
    private javax.swing.JLabel Char2;
    private javax.swing.JLabel Char3;
    private javax.swing.JLabel Char4;
    private javax.swing.JLabel Char5;
    private javax.swing.JLabel Char6;
    private javax.swing.JLabel Char7;
    private javax.swing.JLabel Char8;
    private javax.swing.JLabel Char9;
    private javax.swing.JLabel CharCargaFuego1;
    private javax.swing.JLabel CharCargaFuego10;
    private javax.swing.JLabel CharCargaFuego2;
    private javax.swing.JLabel CharCargaFuego3;
    private javax.swing.JLabel CharCargaFuego4;
    private javax.swing.JLabel CharCargaFuego5;
    private javax.swing.JLabel CharCargaFuego6;
    private javax.swing.JLabel CharCargaFuego7;
    private javax.swing.JLabel CharCargaFuego8;
    private javax.swing.JLabel CharCargaFuego9;
    private javax.swing.JLabel CharHP1;
    private javax.swing.JLabel CharHP10;
    private javax.swing.JLabel CharHP2;
    private javax.swing.JLabel CharHP3;
    private javax.swing.JLabel CharHP4;
    private javax.swing.JLabel CharHP5;
    private javax.swing.JLabel CharHP6;
    private javax.swing.JLabel CharHP7;
    private javax.swing.JLabel CharHP8;
    private javax.swing.JLabel CharHP9;
    private javax.swing.JLabel CharShield1;
    private javax.swing.JLabel CharShield10;
    private javax.swing.JLabel CharShield2;
    private javax.swing.JLabel CharShield3;
    private javax.swing.JLabel CharShield4;
    private javax.swing.JLabel CharShield5;
    private javax.swing.JLabel CharShield6;
    private javax.swing.JLabel CharShield7;
    private javax.swing.JLabel CharShield8;
    private javax.swing.JLabel CharShield9;
    private javax.swing.JLabel LabelChar;
    private javax.swing.JLabel LabelCharLvl;
    private javax.swing.JLabel LabelCharName;
    private javax.swing.JLabel LabelH1Lvl;
    private javax.swing.JLabel LabelH2Energy;
    private javax.swing.JLabel LabelH2Lvl;
    private javax.swing.JLabel LabelH3Energy;
    private javax.swing.JLabel LabelH3Lvl;
    private javax.swing.JLabel LabelPs;
    private javax.swing.JLabel LabelPsLvl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    private void EvaluateWin() {
        if (P1.IsDead() && P2.IsDead() && P3.IsDead() && P4.IsDead() && P5.IsDead()) {
            JOptionPane.showMessageDialog(null, "Equipo 2 gana la partida\n"+P6.getName()+" - "+P7.getName()+" - "+P8.getName()+" - "+P9.getName()+" - "+P10.getName());
        } else if (P6.IsDead() && P7.IsDead() && P8.IsDead() && P9.IsDead() && P10.IsDead()) {
            JOptionPane.showMessageDialog(null, "Equipo 1 gana la partida\n"+P1.getName()+" - "+P2.getName()+" - "+P3.getName()+" - "+P4.getName()+" - "+P5.getName());
        }
    }
}
