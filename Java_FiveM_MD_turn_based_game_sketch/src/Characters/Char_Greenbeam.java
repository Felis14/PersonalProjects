package Characters;

import Interfaz.Partida;
import Utilitario.Utilitario;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Char_Greenbeam implements Personaje {

    Utilitario U = new Utilitario();
    
    int CharLv, PsLv, H1Lv, H2Lv, H3Lv;
    
    //Stats base (lvl 1)
    String Nombre = "Greenbeam", TEAM = "Five M", SIDE = "Heroe"; int ID = 1, InGameID;
    boolean IsDead = false;
    
    Personaje LeftAlly;
    Personaje RightAlly;
    
    Personaje[] Aliados = new Personaje [5];
    Personaje Aliado1;
    Personaje Aliado2;
    Personaje Aliado3;
    Personaje Aliado4;
    Personaje Aliado5;
    
    Personaje[] Enemigos = new Personaje [5];
    Personaje Enemigo1;
    Personaje Enemigo2;
    Personaje Enemigo3;
    Personaje Enemigo4;
    Personaje Enemigo5;
    
    //A cada stat base se le resta su incremento, para que a la hora de ser llamados se pueda hacer stat + stat*incremento%
    int SHP = 1753; double HPI = 2.6; int BaseHP, HP;
    int Shield = 0;
    int SDMG = 111; double DMGI = 2.24; int DMG;
    int SSPEED = 79; double SPEEDI = 1.51; int BaseSpeed, SPEED;
    int SDEF = 11; double DEFI = 10.5; int DEF;
    int SRES = 19; double RESI = 3.03; int RES;
    int SACC = 94; double ACCI = 3; int ACC;
    int SEVA = 2; double EVAI = 2; int EVA;
    double CritChance = 5;
    double CritDmg = 0.6;
    
    int assist = 0;
    
    //Se utilizan como vector ya que cada posicion contiene la ID del efecto y su valor la cantidad
    //de cargas de ese efecto
    int SEfectosP[] = new int [U.CantidadEfectosPo]; //Vector que almacenará los efectos positivos que tenga aplicados
    int SEfectosN[] = new int [U.CantidadEfectosNe]; //Y este todos los efectos negativos que tenga aplicados
    
    String PsDesc = "";
    String H1Desc = "";
    String H2Desc = "";
    String H3Desc = "";
    int H2Energy = 5;
    int H2MaxEnergy = 6;
    int H3Energy = 0;
    int H3MaxEnergy = 5;
    
    //Para las habilidades
    int dmg; //daño %
    int shield;
    int extraPorCargas=0; //Para la H3
    boolean evadido = false;
    boolean hitInChain = false;
    
    public void Pasiva(int dmg, Personaje Target, Personaje Atacante, int Condiciones[]) {
        if (!this.IsDead && Target.getShield() < Target.getBaseHP()) {
            //Barrera a aplicar al aliado
            int barrera = 0;
            double mit;

            int[] AEfectosP = new int [U.CantidadEfectosPo];
            Arrays.fill(AEfectosP, 0);

            int[] AEfectosN = new int [U.CantidadEfectosNe];
            Arrays.fill(AEfectosN, 0);

            int[] Con = new int [U.CantidadCondiciones];
            Arrays.fill(Con, 0);

            Con[13] = 1; //Se comporta como escudo

            //El daño mitigado es 5 * Nivel (5, 10, 15, 20, 25)
            mit = 5 * PsLv;

            JOptionPane.showMessageDialog(null, "Greenbeam protegerá a "+Target.getName(), "Pasiva de Greenbeam", JOptionPane.PLAIN_MESSAGE);

            //Si el aliado atacado es de Five M el daño mitigado aumenta en 2%, 4%, 6%, 8%, 10%
            if (Target.getTeam().equals("Five M"))
                mit += 2 * PsLv;
            //Si el aliado no es de Five M pero es heroe, solo mitigará la mitad 1%, 2%, 3%, 4%, 5%
            else if (Target.getSide().equals("Heroe"))
                mit += 1 * PsLv;

            //Se multiplica para usar el porcentaje como decimal (25*0.01 = 0.25 (el 25% porciento))
            mit *= 0.01;

            //La barrera es igual al daño multiplicado por la mitigación 100 * 25% = 25, la barrera será de 25
            barrera = (int)Math.ceil(dmg * mit);
            Target.ReceiveAid(0, barrera, Target, this, AEfectosN, AEfectosP, Con);
        }
    }
    
    public void Pasiva2() {
        DMG += (int) Math.ceil(DMG * ((1 * PsLv)*0.01));
        DEF += (int) Math.ceil(DEF * ((2.5 + 1.5 * PsLv)*0.01));
        RES += (int) Math.ceil(RES * ((2.5 + 1.5 * PsLv)*0.01));
        System.out.println(this.getName()+" se hizo un poco más fuerte");
    }
    
    public void CargarInfos() {
        //<editor-fold defaultstate="collapsed" desc=" Pasiva ">
        switch(PsLv) {
            case 1 -> {
                PsDesc = """
                         Instinto Protector:
                         
                         Cuando un enemigo está por atacar a un aliado, hay una probabilidad de 5% de que Greenbeam proteja al aliado con una barrera de 5% del daño que va a recibir.
                         Si el aliado es Héroe, la mitigación aumenta en 0,5% y si es de Five en su lugar aumenta en 1%
                         
                         Después de cada turno de Greenbeam, aumenta 1% su daño y 4% su defensa y resistencia.""";
            }
            case 2 -> {
                PsDesc = """
                         Instinto Protector:
                         
                         Cuando un enemigo está por atacar a un aliado, hay una probabilidad de 7% de que Greenbeam proteja al aliado con una barrera de 10% del daño que va a recibir.
                         Si el aliado es Héroe, la mitigación aumenta en 0,75% y si es de Five en su lugar aumenta en 1,5%
                         
                         Después de cada turno de Greenbeam, aumenta 2% su daño y 5,5% su defensa y resistencia.""";
            }
            case 3 -> {
                PsDesc = """
                         Instinto Protector:
                         
                         Cuando un enemigo está por atacar a un aliado, hay una probabilidad de 10% de que Greenbeam proteja al aliado con una barrera de 15% del daño que va a recibir.
                         Si el aliado es Héroe, la mitigación aumenta en 1% y si es de Five en su lugar aumenta en 2%
                         
                         Después de cada turno de Greenbeam, aumenta 3% su daño y 7% su defensa y resistencia.""";
            }
            case 4 -> {
                PsDesc = """
                         Instinto Protector:
                         
                         Cuando un enemigo está por atacar a un aliado, hay una probabilidad de 13% de que Greenbeam proteja al aliado con una barrera de 20% del daño que va a recibir.
                         Si el aliado es Héroe, la mitigación aumenta en 1,25% y si es de Five en su lugar aumenta en 2,5%
                         
                         Después de cada turno de Greenbeam, aumenta 4% su daño y 8,5% su defensa y resistencia.""";
            }
            case 5 -> {
                PsDesc = """
                         Instinto Protector:
                         
                         Cuando un enemigo está por atacar a un aliado, hay una probabilidad de 15% de que Greenbeam proteja al aliado con una barrera de 25% del daño que va a recibir.
                         Si el aliado es Héroe, la mitigación aumenta en 1,5% y si es de Five en su lugar aumenta en 3%
                         
                         Después de cada turno de Greenbeam, aumenta 5% su daño y 10% su defensa y resistencia.""";
            }
        }
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc=" Habilidad Básica ">
        switch(H1Lv) {
            case 1 -> {
                H1Desc = """
                         Manos de Destrucción:
                         
                         Ataca al enemigo con un láser que desintegra haciendo 70% de daño penetrante y eliminando 1 carga de efecto positivo aleatorio.
                         
                         40% de probabilidad de hacer una asistencia con un miembro de Five M.
                         """;
            }
            case 2 -> {
                H1Desc = """
                         Manos de Destrucción:
                         
                         Ataca al enemigo con un láser que desintegra haciendo 100% de daño penetrante y eliminando 1 o 2 cargas de efecto positivo aleatorio.
                         
                         55% de probabilidad de hacer una asistencia con un miembro de Five M.
                         """;
            }
            case 3 -> {
                H1Desc = """
                         Manos de Destrucción:
                         
                         Ataca al enemigo con un láser que desintegra haciendo 130% de daño penetrante y eliminando 2 cargas de efecto positivo aleatorio.
                         
                         10% de probabilidad de que el tiro sea potenciado, doblando el daño y eliminando 1 carga de efecto positivo adicional.
                         
                         70% de probabilidad de hacer una asistencia con un miembro de Five M.
                         """;
            }
            case 4 -> {
                H1Desc = """
                         Manos de Destrucción:
                         
                         Ataca al enemigo con un láser que desintegra haciendo 160% de daño penetrante y eliminando 2 o 3 cargas de efecto positivo aleatorio.
                         
                         20% de probabilidad de que el tiro sea potenciado, doblando el daño y eliminando 1 carga de efecto positivo adicional.
                         
                         85% de probabilidad de hacer una asistencia con un miembro de Five M.
                         """;
            }
            case 5 -> {
                H1Desc = """
                         Manos de Destrucción:
                         
                         Ataca al enemigo con un láser que desintegra haciendo 190% de daño penetrante y eliminando 3 cargas de efecto positivo aleatorio.
                         
                         30% de probabilidad de que el tiro sea potenciado, doblando el daño y eliminando 1 carga de efecto positivo adicional.
                         
                         Hace una asistencia con un miembro de Five M.
                         """;
            }
        }
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc=" Habilidad Estándar ">
        switch(H2Lv) {
            case 1 -> {
                H2Desc = """
                         Barrera Mística:
                         
                         Otorga a todos sus aliados y a él mismo escudo equivalente al 30% de su vida máxima.
                         El escudo aumenta en 1% de vida máxima por cada aliado de Five M.
                         
                         Da 1 carga de Bloqueo a todos los aliados y a él mismo.
                         """;
            }
            case 2 -> {
                H2Desc = """
                         Barrera Mística:
                         
                         Otorga a todos sus aliados y a él mismo escudo equivalente al 35% de su vida máxima.
                         El escudo aumenta en 1,25% de vida máxima por cada aliado de Five M.
                         
                         Da 1 carga de Bloqueo a todos los aliados y a él mismo.
                         """;
            }
            case 3 -> {
                H2Desc = """
                         Barrera Mística:
                         
                         Otorga a todos sus aliados y a él mismo escudo equivalente al 40% de su vida máxima.
                         El escudo aumenta en 1,5% de vida máxima por cada aliado de Five M.
                         
                         Da 2 cargas de Bloqueo a todos los aliados y a él mismo.
                         """;
            }
            case 4 -> {
                H2Desc = """
                         Barrera Mística:
                         
                         Otorga a todos sus aliados y a él mismo escudo equivalente al 45% de su vida máxima.
                         El escudo aumenta en 1,75% de vida máxima por cada aliado de Five M.
                         
                         Da 2 cargas de Bloqueo a todos los aliados y a él mismo.
                         """;
            }
            case 5 -> {
                H2Desc = """
                         Barrera Mística:
                         
                         Otorga a todos sus aliados y a él mismo escudo equivalente al 50% de su vida máxima.
                         El escudo aumenta en 2% de vida máxima por cada aliado de Five M.
                         
                         Da 3 cargas de Bloqueo a todos los aliados y a él mismo.
                         """;
            }
        }
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc=" Habilidad Potente ">
        switch(H3Lv) {
            case 1 -> {
                H3Desc = """
                         Desintegrado Total:
                         
                         Dispara un devastador láser que hace 160% de daño penetrante al enemigo.
                         Hace 10% de daño penetrante adicional por cada carga de Efecto Negativo que tenga el objetivo.
                         """;
            }
            case 2 -> {
                H3Desc = """
                         Desintegrado Total:
                                                                           
                         Dispara un devastador láser que hace 190% de daño penetrante al enemigo.
                         Hace 20% de daño penetrante adicional por cada carga de Efecto Negativo que tenga el objetivo.
                         """;
            }
            case 3 -> {
                H3Desc = """
                         Desintegrado Total:
                                                                           
                         Dispara un devastador láser que hace 220% de daño penetrante al enemigo.
                         Hace 30% de daño penetrante adicional por cada carga de Efecto Negativo que tenga el objetivo.
                         """;
            }
            case 4 -> {
                H3Desc = """
                         Desintegrado Total:
                                                                           
                         Dispara un devastador láser que hace 250% de daño penetrante al enemigo.
                         Hace 40% de daño penetrante adicional por cada carga de Efecto Negativo que tenga el objetivo.
                         """;
            }
            case 5 -> {
                H3Desc = """
                         Desintegrado Total:
                                                                           
                         Dispara un devastador láser que hace 280% de daño penetrante al enemigo.
                         Hace 50% de daño penetrante adicional por cada carga de Efecto Negativo que tenga el objetivo.
                         """;
            }
        }
        //</editor-fold>
    }
    
    public void CheckGetsAlly(Personaje Target) {
        if (this != Aliado1 && !Aliado1.IsDead())
            Aliado1.CheckAllyGet(Target, this);
        if (this != Aliado2 && !Aliado2.IsDead())
            Aliado2.CheckAllyGet(Target, this);
        if (this != Aliado3 && !Aliado3.IsDead())
            Aliado3.CheckAllyGet(Target, this);
        if (this != Aliado4 && !Aliado4.IsDead())
            Aliado4.CheckAllyGet(Target, this);
        if (this != Aliado5 && !Aliado5.IsDead())
            Aliado5.CheckAllyGet(Target, this);
    }
    
    public void CheckPostsAlly(Personaje Target) {
        if (this != Aliado1 && !Aliado1.IsDead())
            Aliado1.CheckAllyPost(Target, this);
        if (this != Aliado2 && !Aliado2.IsDead())
            Aliado2.CheckAllyPost(Target, this);
        if (this != Aliado3 && !Aliado3.IsDead())
            Aliado3.CheckAllyPost(Target, this);
        if (this != Aliado4 && !Aliado4.IsDead())
            Aliado4.CheckAllyPost(Target, this);
        if (this != Aliado5 && !Aliado5.IsDead())
            Aliado5.CheckAllyPost(Target, this);
    }
    
    @Override
    public void CargarStats(Personaje A1, Personaje A2, Personaje A3, Personaje A4, Personaje A5,
                    Personaje E1, Personaje E2, Personaje E3, Personaje E4, Personaje E5,
                    int CharLv, int PsLv, int H1Lv, int H2Lv, int H3Lv, String InGameID) {
        
        this.CharLv = CharLv;
        this.PsLv = PsLv;
        this.H1Lv = H1Lv;
        this.H2Lv = H2Lv;
        this.H3Lv = H3Lv;
        
        this.InGameID = Integer.parseInt(InGameID);
        
        Aliado1 = A1;
        Aliado2 = A2;
        Aliado3 = A3;
        Aliado4 = A4;
        Aliado5 = A5;
        
        Enemigo1 = E1;
        Enemigo2 = E2;
        Enemigo3 = E3;
        Enemigo4 = E4;
        Enemigo5 = E5;
        
        Aliados[0] = Aliado1;
        Aliados[1] = Aliado2;
        Aliados[2] = Aliado3;
        Aliados[3] = Aliado4;
        Aliados[4] = Aliado5;
        
        Enemigos[0] = Enemigo1;
        Enemigos[1] = Enemigo2;
        Enemigos[2] = Enemigo3;
        Enemigos[3] = Enemigo4;
        Enemigos[4] = Enemigo5;
        
        CargarInfos();
        
        switch(InGameID) {
            case "1" -> {
                LeftAlly = null;
                RightAlly = Partida.P2;
            }
            case "2" -> {
                LeftAlly = Partida.P1;
                RightAlly = Partida.P3;
            }
            case "3" -> {
                LeftAlly = Partida.P2;
                RightAlly = Partida.P4;
            }
            case "4" -> {
                LeftAlly = Partida.P3;
                RightAlly = Partida.P5;
            }
            case "5" -> {
                LeftAlly = Partida.P4;
                RightAlly = null;
            }
            
            case "6" -> {
                RightAlly = null;
                LeftAlly = Partida.P7;
            }
            case "7" -> {
                RightAlly = Partida.P6;
                LeftAlly = Partida.P8;
            }
            case "8" -> {
                RightAlly = Partida.P7;
                LeftAlly = Partida.P9;
            }
            case "9" -> {
                RightAlly = Partida.P8;
                LeftAlly = Partida.P10;
            }
            case "10" -> {
                RightAlly = Partida.P9;
                LeftAlly = null;
            }
        }
        
        for (int i = 0; i<SEfectosP.length; i++)
            SEfectosP[i] = 0;
        for (int i = 0; i<SEfectosN.length; i++)
            SEfectosN[i] = 0;
        
        BaseHP = (int)Math.ceil(SHP + ((SHP+47) * ((HPI*CharLv) * 0.01)));
        HP = BaseHP;
        DMG = (int) Math.ceil(SDMG + ((SDMG+3) * ((DMGI*CharLv) * 0.01)));
        SPEED = (int) Math.ceil(SSPEED + ((SSPEED+1) * ((SPEEDI*CharLv) * 0.01)));
        DEF = (int) Math.ceil(SDEF + (SDEF * (DEFI * CharLv) * 0.01));
        RES = (int) Math.ceil(SRES + (SRES * (RESI * CharLv) * 0.01));
        ACC = (int) Math.ceil(SACC + (((SACC+1)/2) * ((ACCI*CharLv) * 0.01)));
        EVA = (int) Math.ceil(SEVA + (SEVA * (EVAI * CharLv) * 0.01));
    }
    
    @Override
    public void Start() {
        //Greenbeam no hace nada especial cuando aparece
    }
    
    @Override
    public void SufferGet(int hp, Personaje Target, int EfectosN[], int EfectosP[], Personaje Atacante, int Condiciones[]) {
        //Activa los checkgets de todo el equipo
        if (!U.ignoreCheckGet(Condiciones)) {
            if (this != Aliado1)
                Aliado1.CheckGet(hp, Target, Atacante, Condiciones);
            if (this != Aliado2)
                Aliado2.CheckGet(hp, Target, Atacante, Condiciones);
            if (this != Aliado3)
                Aliado3.CheckGet(hp, Target, Atacante, Condiciones);
            if (this != Aliado4)
                Aliado4.CheckGet(hp, Target, Atacante, Condiciones);
            if (this != Aliado5)
                Aliado5.CheckGet(hp, Target, Atacante, Condiciones);
        } else {
            System.out.println("Los aliados no pueden preveer el ataque de "+Atacante.getName());
        }
        
        //Antes de que vaya a ser atacado
        //Intenta esquivar el ataque
        int prob = U.RandomEntre(0, 100);
        
        evadido = false;
        
        double Eva = EVA;
        double Acc = Atacante.getACC();
        
        if (U.hasHighEva(this) && !U.hasLowEva(this))
            Eva = (double)Math.ceil(Eva * 1.25);
        if (U.hasLowEva(this) && !U.hasHighEva(this))
            Eva = (double)Math.ceil(Eva * 0.75);
        
        if (U.hasHighAcc(Atacante) && !U.hasLowAcc(Atacante))
            Acc = (double)Math.ceil(Acc * 1.25);
        if (U.hasLowAcc(Atacante) && !U.hasHighAcc(Atacante))
            Acc = (double)Math.ceil(Acc * 0.75);
        
        if(!U.ignoreEvade(Condiciones)) { //Si el ataque no ignora el esquive
            if (prob <= Math.ceil((double)Eva / Acc * 100) || U.hasEvasion(this)) { //Intenta esquivar o usa una carga de evasión
                if (U.hasEvasion(this)) {
                    this.SEfectosP[6]--;
                }

                evadido = true;
                JOptionPane.showMessageDialog(null, this.Nombre + " logró esquivar el ataque");
            }
        }
        
        if (!U.ignoreEthereal(Condiciones) && !evadido) { //Si el ataque no ignora etéreo y no lo ha evadido
            if (U.isEthereal(this)) {
                evadido = true;
                this.SEfectosP[5]--;
                
                JOptionPane.showMessageDialog(null, this.Nombre + " se volvió etéreo para evadir el ataque");
            }
        }
        
        if (evadido) {
            hp = 0;

            for (int i=0; i < EfectosN.length; i++) {
                EfectosN[i] = 0;
            }
        } else if (!U.ignoreBlock(Condiciones) && hp != 0) { //Si el ataque no fue evadido y es bloqueable
            if (U.hasDeflection(this)) { //Si tiene desvío
                hp = 0;
                this.SEfectosP[4]--;
                
                JOptionPane.showMessageDialog(null, this.Nombre + " desvió el ataque");
            }
            else if (U.hasBlock(this)) {
                hp = (int)Math.ceil(hp * 0.5);
                this.SEfectosP[1]--;
                
                JOptionPane.showMessageDialog(null, this.Nombre + " bloqueó el ataque");
            }
        }
        
        //Después de esquivar el ataque manda el sufferpost
        SufferPost(hp, Target, EfectosN, EfectosP, Atacante, Condiciones);
        
        //Si tiene el efecto de contraataque, contraataca al enemigo que lo acaba de atacar
        if (U.hasCounter(this)) {
            if (!U.ignoreCounter(Condiciones)) {
                this.SEfectosP[3]--;
                Assist(Atacante, null);
            } else
                System.out.println(this.Nombre + " no puede contraatacar a " + Atacante.getName());
        }
        
        //Activa los checkpost de todos los aliados, exceptuan él mismo
        if (U.ignoreCheckPost(Condiciones)) {
            if (this != Aliado1)
                Aliado1.CheckPost(hp, Target, Atacante, Condiciones);
            if (this != Aliado2)
                Aliado2.CheckPost(hp, Target, Atacante, Condiciones);
            if (this != Aliado3)
                Aliado3.CheckPost(hp, Target, Atacante, Condiciones);
            if (this != Aliado4)
                Aliado4.CheckPost(hp, Target, Atacante, Condiciones);
            if (this != Aliado5)
                Aliado5.CheckPost(hp, Target, Atacante, Condiciones);
        }
    }
    
    @Override
    public void SufferPost(int hp, Personaje Target, int EfectosN[], int EfectosP[], Personaje Atacante, int Condiciones[]) {
        String outputMsg = "";
        
        boolean affected=false;
        boolean removedeffects=false;
        
        //Es atacado y realiza actividades después de serlo
        if (U.hasHighDef(this) && !U.hasLowDef(this)) {
            System.out.println(this.getName()+" mitigará parte del daño por tener subida de defensa");
            hp = (int)Math.ceil(hp * 0.5);
        }
        if (U.hasLowDef(this) && !U.hasHighDef(this)) {
            System.out.println(this.getName()+" recibirá daño adicional por tener bajada de defensa");
            hp = (int)Math.ceil(hp * 1.5);
        }
        
        //JOptionPane.showMessageDialog(null, "Recibiendo finalmente "+hp+" de daño");
        
        int IniHP = this.HP;
        boolean AbsorbedDmg = false;
        
        if (hp > 0) {
            if (!U.isTrueDmg(Condiciones)) { //si el daño NO es penetrante
                if (this.Shield > 0) { //Si el personaje tiene escudo
                    int IniShield = this.Shield;
                    
                    if (hp >= this.Shield) { //Si el daño es mayor que el escudo
                        int IniDmg = hp; //100
                        
                        hp -= this.Shield; //100 - 20
                        
                        this.Shield -= (IniDmg - hp); //20 - (100 - 80)
                    } else if (hp < this.Shield) { //Si el daño es menor que el escudo
                        this.Shield -= hp; //50 - 30 = 20
                        hp = 0;
                        AbsorbedDmg = true;
                    }
                    //                                                                  50 - 20 = 30
                    outputMsg += this.getName() + " absorbió "+(IniShield - this.Shield)+" de daño con escudo\n";
                }
                
                if (hp - this.getDEF() <= 0) //Si el daño entrante es menor a la defensa
                    hp = 1 + this.getDEF(); //Da como output 1 de vida
                
                if (AbsorbedDmg)
                    hp = this.getDEF();
                
                HP -= (hp - this.getDEF()); //Su aplica el daño - la defensa
            }
            else {
                HP -= hp; //Si el daño es penetrante
            }
            
            if (!AbsorbedDmg)
                outputMsg += this.getName() + " sufrió "+(IniHP - this.HP)+" de daño\n";
        }
        
        if (!U.isImmune(this)) {
            int Res = this.getRES();
            
            if (U.hasHighRes(this) && !U.hasLowRes(this))
                Res = (int)Math.ceil(Res * 1.5);
            if (U.hasLowRes(this) && !U.hasHighRes(this))
                Res = (int)Math.ceil(Res * 0.5);
            
            if (evadido == false) {
                if (!U.alwaysApplyEffects(Condiciones)) {
                    for (int i=0; i<EfectosN.length; i++) {
                        if (EfectosN[i] > 0) {
                            if (U.RandomEntre(0, 100) <= (Res+RESI)/(Atacante.getDMG()*100)) { //Si resiste los efectos
                                EfectosN[i] = 0;

                                System.out.println(this.getName() + " logró resistir el efecto "+U.GetNEffectName(i));
                            }
                        }
                    }
                } else {
                    System.out.println("Los efectos que se aplicarán a " + this.getName() + " no pueden ser resistidos");
                }

                String effectsapply = "";
                String effectsremove = "";
                
                for (int i=0; i<EfectosN.length; i++) { //Suma todos los efectos que sí se aplicaron
                    if (EfectosN[i] > 0) {
                        this.SEfectosN[i] += EfectosN[i];
                        if (U.isVulnerable(this)) //Si tiene vulnerabilidad aplica la carga extra
                            this.SEfectosN[i] += 1;

                        effectsapply += "\n"+U.GetNEffectName(i)+ " [" + EfectosN[i]+"]";
                        affected = true;
                    }
                }
                for (int i=0; i<EfectosP.length; i++) { //Resta todos los efectos que le pudieran eliminar
                    if (EfectosP[i] < 0) {
                        if (!U.hasSalvation(this)) {
                            removedeffects = true;
                            this.SEfectosP[i] += EfectosP[i];
                            effectsremove += "\n"+U.GetPEffectName(i)+ " ["+ EfectosP[i]+"]";
                        }
                    }
                }
                if (affected)
                    outputMsg += "\n"+this.Nombre + " ahora sufre estos efectos:"+effectsapply+"\n";
                if (removedeffects)
                    outputMsg += "\nLe eliminaron estos efectos:"+effectsremove;
                
                JOptionPane.showMessageDialog(null, outputMsg);
            }
        }
        else {
            System.out.println(this.Nombre + " no sufrirá efectos por tener Inmunidad");
        }
        
        if (HP <= 0) {
            DeathGet(Target, EfectosP, Atacante, Condiciones);
        }
    }
    
    @Override
    public void ReceiveAid(int hp, int shield, Personaje Target, Personaje Aliado, int[] EfectosN, int[] EfectosP, int[] Condiciones) {
        
        String outputMsg = "";
        String effectsclean = "";
        String effectsadded = "";
        String heal = "";
        String shielded = "";
        
        if (!this.IsDead()) { //Si no está muerto
            if (U.behaveCleanEffects(Condiciones) && U.firstCleanEffects(Condiciones)) { //Si el comportamiento es de limpiar efectos negativos y elimina efectos primero
                if (U.hasEffectsNe(this) && !U.isDoomed(this)) { //Si el target tiene efectos negativos y no tiene perdición
                    for (int i = 0; i < U.CantidadEfectosNe; i++) {
                        if (EfectosN[i] < 0) { //Si un efecto está en negativo entonces se le suma a los efectos negativos ya existentes para que se reste
                            this.SEfectosN[i] += EfectosN[i];
                            
                            effectsclean += "\n"+U.GetNEffectName(i) + " ["+(EfectosN[i]*-1)+"]";
                        }
                    }
                }
            }
            
            if (U.behaveHeal(Condiciones)) { //Si el comportamiento es de curar
                //Si el target no tiene bloqueo de curación o lo tiene pero la habilidad lo ignora
                if ((!U.hasBlockHealing(this) && hp > 0) || (U.hasBlockHealing(Target) && U.ignoreBlockHealing(Condiciones) && hp > 0)) {
                    int IniHp = this.HP;
                    HP += hp;
                    
                    if (HP > BaseHP) //Evita que se cure más de la vida máxima
                        HP = BaseHP;

                    heal = Target.getName() + " se curó " + (HP - IniHp) + " de salud gracias a "+Aliado.getName()+"\n";
                }
            }
            
            if (U.behaveCleanEffects(Condiciones) && !U.firstCleanEffects(Condiciones)) { //Si el comportamiento es limpiar efectos y no los limpiaba primero
                if (U.hasEffectsNe(this) && !U.isDoomed(Target)) { //Si el target tiene efectos negativos y no tiene perdición
                    for (int i = 0; i < U.CantidadEfectosNe; i++) {
                        if (EfectosN[i] < 0) { //Si un efecto está en negativo entonces se le suma a los efectos negativos ya existentes para que se reste
                            this.SEfectosN[i] += EfectosN[i];
                            
                            effectsclean += "\n"+U.GetNEffectName(i) + " ["+(EfectosN[i]*-1)+"]";
                        }
                    }
                }
            }
            
            if (U.behaveAddEffects(Condiciones) && (!U.isAltered(this) || (U.isAltered(this) && U.ignoreAltered(Condiciones)))) { //Si agrega efectos y no está alterado o lo está pero lo ignora
                for (int i = 0; i < U.CantidadEfectosPo; i++) {
                    if (EfectosP[i] > 0) {
                        if (U.isLoosed(this)) { //Si tiene holgura suma cada efecto aplicado una carga extra
                            EfectosP[i]++;
                        }

                        this.SEfectosP[i] += EfectosP[i];

                        effectsadded += "\n"+U.GetPEffectName(i) + " ["+(EfectosP[i])+"]";
                    }
                }
            }
            
            if (U.behaveShield(Condiciones)) { //Si el comportamiento agrega escudo
                if (shield > 0 && Target.getShield() < Target.getBaseHP()) {
                    int IniShield = this.Shield;
                    this.Shield += shield;
                    
                    if (this.Shield > BaseHP) //Evita que el escudo supere la vida máxima
                        this.Shield = BaseHP;
                    
                    shielded = Target.getName() + " generó " + (Shield - IniShield) + " de escudo gracias a "+Aliado.getName()+"\n";
                }
            }
            
            outputMsg = heal;
            outputMsg += shielded;
            
            if (!effectsclean.equals(""))
                outputMsg += "\n"+this.Nombre + " limpió estos efectos:"+effectsclean;
            if (!effectsadded.equals(""))
                outputMsg += "\n"+this.Nombre + " ganó estos efectos:"+effectsadded;
            
            JOptionPane.showMessageDialog(null, outputMsg);
        }
    }
    
    @Override
    public void CheckGet(int dmg, Personaje Target, Personaje Atacante, int Condiciones[]) {
        if (!U.ignoreCheckGet(Condiciones)) {
            int probShield = 5;
            
            switch(PsLv) {
                case 1 -> probShield = 5;
                case 2 -> probShield = 7;
                case 3 -> probShield = 10;
                case 4 -> probShield = 13;
                case 5 -> probShield = 15;
            }
            
            if (U.RandomEntre(1, 100) <= probShield) {
                Pasiva(dmg, Target, Atacante, Condiciones);
            }
        } else {
            System.out.println("Greenbeam no puede preveer el ataque de "+Atacante.getName());
        }
    }
    
    @Override
    public void CheckPost(int dmg, Personaje Target, Personaje Atacante, int Condiciones[]) {
        //Greenbeam no hace nada especial después de que un enemigo ataca
    }
    
    @Override
    public void Assist(Personaje Target, Personaje Asistido) {
        String critMsg = "";
        String effectsremove = "";
        
        int AEfectosN[] = new int [U.CantidadEfectosNe];
        Arrays.fill(AEfectosN, 0);
        
        int AEfectosP[] = new int [U.CantidadEfectosPo];
        Arrays.fill(AEfectosP, 0);
        
        int Condiciones[] = new int [U.CantidadCondiciones];
        Arrays.fill(Condiciones, 0);
        
        int efectosEliminados=0;
        int[] TargetEffectsP = Target.getEfectosP();
        
        for (int b = 0; b < 1; b++) {
            if (U.hasEffectsPo(Target) && !U.hasSalvation(Target)) { //Para eliminar un efecto positivo del enemigo
                int[] targetEffectsPo = U.EffectsPoOf(Target);
                
                if (efectosEliminados >= 1)
                    break;
                
                int randomIndex = U.RandomEntre(0, targetEffectsPo.length-1);
                int effect = targetEffectsPo[randomIndex];
                
                if (U.RandomEntre(1, 100) <= U.GetPEffectProbDelConver(effect) || targetEffectsPo.length == 1) { //Probabilidad del efecto en ser eliminado o si solo tiene un tipo de efecto
                    AEfectosP[effect]--; //Pone el efecto positivo en -1 lo que hará que se le reste 1 al enemigo
                    TargetEffectsP[effect]--;
                    efectosEliminados++;
                    effectsremove = "\nEliminará el efecto "+U.GetPEffectName(effect);

                    switch(effect) {
                        case 1, 4 -> {
                            if (TargetEffectsP[1] < 1 && TargetEffectsP[4] < 1) //Si el efecto a eliminar es bloqueo o desvío y no le sobran
                            Condiciones[2] = 1;
                        }
                        case 5 -> {
                            Condiciones[3] = 1;
                        }
                        case 6 -> {
                            if (TargetEffectsP[6] < 1) //Si el efecto a eliminar es el esquive y solo tiene una carga de evasión
                                Condiciones[1] = 1;
                        }
                    }
                } else {
                    b--;
                }
            } else if (U.hasSalvation(Target)) {
                System.out.println(this.getName() + " no podrá eliminar efectos positivos de "+Target.getName()+ " porque tiene salvación");
            } else {
                System.out.println(this.getName() +" no eliminará ningún efecto positivo porque "+Target.getName() + " no tiene ninguno");
            }
        }
        
        dmg = (int)Math.ceil(this.DMG * 0.6); //El daño de la asistencia es 60% el daño
        
        if (U.RandomEntreDec(1, 100) <= CritChance) { //Probabilidad de crítico
            dmg += (int)Math.ceil(dmg * CritDmg); //El daño se multiplica por la potencia de crítico
            critMsg = "\nEs un golpe crítico!";
        }
        
        if (U.hasHighDmg(this) && !U.hasLowDmg(this)) {
            dmg = (int)Math.ceil(dmg * 1.5);
            System.out.println("Aumentando daño por tener Subida de Ataque");
        }
        
        if (U.hasLowDmg(this) && !U.hasHighDmg(this)) {
            dmg = (int)Math.ceil(dmg * 0.5);
            System.out.println("Reduciendo daño por tener Bajada de Ataque");
        }
        
        Condiciones[0] = 1; //Greenbeam hace daño penetrante
        Condiciones[4] = 1; //Una asistencia o contraataque no puede ser contraatacada
        
        if (Asistido != null) {
            JOptionPane.showMessageDialog(null, this.getName()+" asistirá a "+Asistido.getName()+critMsg+effectsremove);
            Target.SufferGet(dmg, Target, AEfectosN, AEfectosP, this, Condiciones);
        } else {
            JOptionPane.showMessageDialog(null, this.getName() + " va a contraatacar a "+Target.getName()+critMsg+effectsremove);
        }
    }
    
    @Override
    public void H1Get(Personaje Target, int EfectosN[], int EfectosP[]) {
        CheckGetsAlly(Target);
        
        dmg = 0; //reinicia las variables para un nuevo ataque
        assist = 0;
        
        int AEfectosN[] = new int [U.CantidadEfectosNe];
        Arrays.fill(AEfectosN, 0);
        
        int AEfectosP[] = new int [U.CantidadEfectosPo];
        Arrays.fill(AEfectosP, 0);
        
        int[] TargetEffectsP = Target.getEfectosP().clone();
        int TotalEffectsP = U.TotalEffectsPoOf(Target);
        
        int Condiciones[] = new int [U.CantidadCondiciones];
        Arrays.fill(Condiciones, 0);
        
        dmg = (int)Math.ceil(DMG*(0.4+0.3*H1Lv));
        
        int EfectosEliminar= switch(H1Lv) {
            case 1 -> EfectosEliminar = 1;
            case 2 -> EfectosEliminar = U.RandomEntre(1, 2);
            case 3 -> EfectosEliminar = 2;
            case 4 -> EfectosEliminar = U.RandomEntre(2, 3);
            case 5 -> EfectosEliminar = 3;
            default -> 1;
        };
        
        if (U.RandomEntre(1, 100) <= 25+(15*H1Lv))
            assist = 1;
        
        if (H1Lv >= 3) {
            if (U.RandomEntre(1, 100) <= -20+(10)*H1Lv) {
                JOptionPane.showMessageDialog(null, "Greenbeam hará un tiro potenciado");
                EfectosEliminar++;
                dmg = dmg*2;
            }
        }
        
        int efectosEliminados=0;
        
        for (int b = 0; b < EfectosEliminar; b++) {
            if (U.hasEffectsPo(Target) && !U.hasSalvation(Target)) { //Para eliminar un efecto positivo del enemigo
                int[] targetEffectsPo = U.EffectsPoOf(Target);
                
                if (efectosEliminados >= TotalEffectsP)
                    break;
                
                int randomIndex = U.RandomEntre(0, targetEffectsPo.length-1);
                int effect = targetEffectsPo[randomIndex];
                
                if (U.RandomEntre(1, 100) <= U.GetPEffectProbDelConver(effect) || targetEffectsPo.length == 1) { //Probabilidad del efecto en ser eliminado o si solo tiene un tipo de efecto
                    AEfectosP[effect]--; //Pone el efecto positivo en -1 lo que hará que se le reste 1 al enemigo
                    TargetEffectsP[effect]--;
                    efectosEliminados++;

                    switch(effect) {
                        case 1, 4 -> {
                            if (TargetEffectsP[1] < 1 && TargetEffectsP[4] < 1) //Si el efecto a eliminar es bloqueo o desvío y no le sobran
                            Condiciones[2] = 1;
                        }
                        case 3 -> {
                            if (TargetEffectsP[3] < 1) //Si el efecto a eliminar es el contraataque y solo tiene una carga de contraataque
                                Condiciones[4] = 1;
                        }
                        case 5 -> {
                            Condiciones[3] = 1;
                        }
                        case 6 -> {
                            if (TargetEffectsP[6] < 1) //Si el efecto a eliminar es el esquive y solo tiene una carga de evasión
                                Condiciones[1] = 1;
                        }
                    }
                } else {
                    b--; //Si no tiene el efecto, reintenta
                }
            } else if (U.hasSalvation(Target)) {
                System.out.println(this.getName() + " no podrá eliminar efectos positivos de "+Target.getName()+ " porque tiene salvación");
            } else {
                System.out.println(this.getName() +" no eliminará ningún efecto positivo porque "+Target.getName() + " no tiene ninguno");
            }
        }
        
        Condiciones[0] = 1; //Daño penetrante
        
        H1Post(Target, AEfectosN, AEfectosP, Condiciones); //Da paso al post después de aplicados los efectos y demás
        
    }
    
    @Override
    public void H1Post(Personaje Target, int EfectosN[], int EfectosP[], int Condiciones[]) {
        Personaje Asistir;
        String critMsg = "";
        
        if (U.RandomEntreDec(0, 100) <= CritChance) { //Probabilidad de crítico
            dmg += (int)Math.ceil(dmg * CritDmg); //El daño se multiplica por la potencia de crítico
            critMsg = "\nEs un golpe crítico!";
        }
         
        if (U.hasHighDmg(this) && !U.hasLowDmg(this)) {
            dmg = (int)Math.ceil(dmg * 1.5);
            System.out.println("Aumentando daño por tener Subida de Ataque");
        }
        
        if (U.hasLowDmg(this) && !U.hasHighDmg(this)) {
            dmg = (int)Math.ceil(dmg * 0.5);
            System.out.println("Reduciendo daño por tener Bajada de Ataque");
        }
        
        Target.SufferGet(dmg, Target, EfectosN, EfectosP, this, Condiciones);
        
        if (assist == 1) {
            int AliadosFiveM=0;
            
            for (Personaje aliado : Aliados) {
                if (aliado != this) {
                    if (aliado.getTeam().equals("Five M"))
                        AliadosFiveM++;
                }
            }
            
            if (AliadosFiveM >= 1) {
                Asistir = U.findAllyTeamToAssist(this, Aliados, this.getTeam());

                if (Asistir == null) {
                    System.out.println(this.getName() + " no tiene ningún aliado disponible para hacer una asistencia");
                } else if (!Target.IsDead()) {
                    Asistir.Assist(Target, this);
                } else
                    System.out.println(Asistir.getName() + " no hará la asistencia porque " + Target.getName() + " ya murió");
            }
        }
        Enemigo1.ResetHitInChain();
        Enemigo2.ResetHitInChain();
        Enemigo3.ResetHitInChain();
        Enemigo4.ResetHitInChain();
        Enemigo5.ResetHitInChain();
        CheckPostsAlly(Target);
    }
    
    @Override
    public void H2Get(Personaje Target, int EfectosN[], int EfectosP[]) {
        CheckGetsAlly(Target);
        
        dmg=0; shield=0;
        
        int[] AEfectosP = new int [U.CantidadEfectosPo];
        int CargasBlock=1;
        Arrays.fill(AEfectosP, 0);
        
        int[] AEfectosN = new int [U.CantidadEfectosNe];
        Arrays.fill(AEfectosN, 0);
        
        int[] Condiciones = new int [U.CantidadCondiciones];
        Arrays.fill(Condiciones, 0);
        
        Condiciones[12] = 1; //Agrega efectos
        Condiciones[13] = 1; //Se comporta como escudo
        
        switch (H2Lv) {
            case 1, 2 -> CargasBlock=1;
            case 3, 4 -> CargasBlock=2;
            case 5 -> CargasBlock=3;
        }
        
        AEfectosP[1] += CargasBlock;
        
        double porcshield = 25 + (5 * H2Lv);
        
        double extrashield=0;
        
        for (Personaje aliado : Aliados) {
            if (aliado != this && aliado.getTeam().equals("Five M"))
                extrashield += (double)0.75 + (0.25 * H2Lv);
        }
        
        porcshield += extrashield;
        porcshield *= 0.01;
        
        shield = (int)Math.ceil(this.BaseHP*porcshield);
        
        H2Post(Target, AEfectosN, AEfectosP, Condiciones);
    }
    
    @Override
    public void H2Post(Personaje Target, int EfectosN[], int EfectosP[], int Condiciones[]) {
        for (Personaje aliado : Aliados) {
            aliado.ReceiveAid(dmg, shield, aliado, this, EfectosN, EfectosP, Condiciones);
        }
        
        H2Energy = 0;
        Enemigo1.ResetHitInChain();
        Enemigo2.ResetHitInChain();
        Enemigo3.ResetHitInChain();
        Enemigo4.ResetHitInChain();
        Enemigo5.ResetHitInChain();
    }
    
    @Override
    public String getH2Behave() {
        return "Good";
    }
    
    @Override
    public void H3Get(Personaje Target, int EfectosN[], int EfectosP[]) {
        CheckGetsAlly(Target);
        
        dmg = 0; //reinicia las variables para un nuevo ataque
        assist = 0;
        
        //String de efectos a aplicar
        int AEfectosN[] = new int [U.CantidadEfectosNe];
        Arrays.fill(AEfectosN, 0);
        int AEfectosP[] = new int [U.CantidadEfectosPo];
        Arrays.fill(AEfectosP, 0);
        int Condiciones[] = new int [U.CantidadCondiciones];
        Arrays.fill(Condiciones, 0);
        
        Condiciones[0] = 1;
        Condiciones[2] = 1;
        
        dmg = (int) Math.round(DMG * (1.3+0.3*H3Lv));
        
        extraPorCargas=0;
        
        if (U.hasEffectsNe(Target)) {
            extraPorCargas = (int)Math.ceil((dmg * (0.1*H3Lv)) * U.TotalEffectsNeOf(Target));
        }
        
        H3Post(Target, AEfectosN, AEfectosP, Condiciones);
    }
    
    @Override
    public void H3Post(Personaje Target, int EfectosN[], int EfectosP[], int Condiciones[]) {
        String critMsg = "";
        
        if (U.RandomEntreDec(0, 100) <= CritChance) { //Probabilidad de crítico
                dmg += (int)Math.ceil(dmg * CritDmg); //El daño se multiplica por la potencia de crítico
                critMsg = "\nEs un golpe crítico!";
        }
         
        if (U.hasHighDmg(this) && !U.hasLowDmg(this)) {
            dmg = (int)Math.ceil(dmg * 1.5);
            System.out.println("Aumentando daño por tener Subida de Ataque");
        }
        
        if (U.hasLowDmg(this) && !U.hasHighDmg(this)) {
            dmg = (int)Math.ceil(dmg * 0.5);
            System.out.println("Reduciendo daño por tener Bajada de Ataque");
        }
        
        JOptionPane.showMessageDialog(null, this.getName() +" desintegrará totalmente a "+Target.getName()+critMsg);
        
        Target.SufferGet(dmg+extraPorCargas, Target, EfectosN, EfectosP, this, Condiciones);
        
        H3Energy = 0;
        Enemigo1.ResetHitInChain();
        Enemigo2.ResetHitInChain();
        Enemigo3.ResetHitInChain();
        Enemigo4.ResetHitInChain();
        Enemigo5.ResetHitInChain();
        CheckPostsAlly(Target);
    }
    
    @Override
    public String getH3Behave() {
        return "Harm";
    }
    
    @Override
    public void DeathGet(Personaje Target, int EfectosP[], Personaje Atacante, int Condiciones[]) {
        if (!U.ignoreImmortal(EfectosP)) {
            if (U.isImmortal(this)) {
                HP = 1;
                EfectosP[8]--;

                JOptionPane.showMessageDialog(null, "La inmortalidad salvó a "+Target.getName());
            }
            else {
                DeathPost(Target, EfectosP, Atacante, Condiciones);
            }
        }
    }

    @Override
    public void DeathPost(Personaje Target, int EfectosP[], Personaje Atacante, int Condiciones[]) {
        HP = 0;
        Shield = 0;
        IsDead = true;
        
        if (!U.deathByBleed(Condiciones)) {
            switch(U.RandomEntre(0, 4)) {
                case 0 -> {
                    JOptionPane.showMessageDialog(null, Target.getName() + " no pudo contra "+Atacante.getName());
                }
                case 1 -> {
                    JOptionPane.showMessageDialog(null, Target.getName() + " no fue suficientemente bueno para competir con "+Atacante.getName());
                }
                case 2 -> {
                    JOptionPane.showMessageDialog(null, Atacante.getName() + " terminó finalmente con "+Target.getName());
                }
                case 3 -> {
                    JOptionPane.showMessageDialog(null, Atacante.getName() + " acabó con "+Target.getName()+" de una vez por todas");
                }
                case 4 -> {
                    JOptionPane.showMessageDialog(null, Target.getName() + " finalmente murió a mano de "+ Atacante.getName());
                }
            }
        } else if (U.deathByBleed(Condiciones)) {
            JOptionPane.showMessageDialog(null, Target.getName()+" murió desangrado");
        } else if (U.deathByBurn(Condiciones)) {
            JOptionPane.showMessageDialog(null, Target.getName()+" murió quemado");
        }
        
        if (this != Aliado1) {
            Aliado1.AllyDeath(Target, Atacante);
        }
        if (this != Aliado2) {
            Aliado2.AllyDeath(Target, Atacante);
        }
        if (this != Aliado3) {
            Aliado3.AllyDeath(Target, Atacante);
        }
        if (this != Aliado4) {
            Aliado4.AllyDeath(Target, Atacante);
        }
        if (this != Aliado5) {
            Aliado5.AllyDeath(Target, Atacante);
        }
    }
    
    @Override
    public void AddEnergy() {
        if (!U.hasBlockEnergy(this)) {
            if (H2Energy < H2MaxEnergy)
                H2Energy++;
            if (H3Energy < H3MaxEnergy)
                H3Energy++;
        }
        else {
            System.out.println(this.Nombre + " no puede regenerar energía por el bloqueo de energía.");
        }
    }
    
    @Override //Elimina todos los efectos que no son permanentes
    public void UpdateEfectos() {
        this.hitInChain = false;
        
        Pasiva2();

        //Negativos ↓
        if (!U.isDoomed(this)) {
            for (int e = 2; e < 9; e++) {
                if (this.SEfectosN[e] > 0)
                    this.SEfectosN[e]--;
            }

            for (int e = 10; e < 13; e++) {
                if (this.SEfectosN[e] > 0)
                    this.SEfectosN[e]--;
            }

            for (int e = 14; e < 19; e++) {
                if (this.SEfectosN[e] > 0)
                    this.SEfectosN[e]--;
            }
        } else {
            this.SEfectosN[16]--;
            System.out.println(this.getName() + " no se despojó de los efectos negativos porque tenía Perdición");
        }
        
        //Positivos ↓
        if (!U.hasSalvation(this)) {
            if (this.SEfectosP[2] > 0)
                this.SEfectosP[2]--;
            if (this.SEfectosP[7] > 0)
                this.SEfectosP[7]--;
            if (this.SEfectosP[9] > 0)
                this.SEfectosP[9]--;
            if (this.SEfectosP[11] > 0)
                this.SEfectosP[11]--;

            for (int e = 14; e < 21; e++) {
                if (this.SEfectosP[e] > 0)
                    this.SEfectosP[e]--;
            }
        } else {
            this.SEfectosP[17]--;
            System.out.println("Los efectos positivos de " + this.getName() + " perduraron porque tenía Salvación");
        }
    }
    
    @Override
    public void HealBleed() {
        int Condiciones[] = new int [U.CantidadCondiciones];
        for (int c = 0; c < Condiciones.length; c++) {
            Condiciones[c] = 0;
        }
        
        if (U.hasRepair(this)) {
            if (!U.hasBlockHealing(this)) {
                int IniHP = this.HP;

                this.HP += (int)(Math.ceil(this.BaseHP * 0.1)); //10% de la salud máxima

                if (this.HP > this.BaseHP) {
                    HP = BaseHP;
                }

                this.SEfectosP[12]--; //Quita la carga de reconstrucción

                JOptionPane.showMessageDialog(null, this.Nombre + " reconstruyó "+(this.HP - IniHP)+" de vida");
            } else {
                System.out.println(this.Nombre + " no se pudo Reconstruir por tener Bloqueo de Curación");
            }
        }
        if (this.SEfectosP[13] > 1) { //Si tiene más de una carga de regeneración, regenera 2 de regeneración por turno
            if (!U.hasBlockHealing(this)) {
                int IniHP = this.HP;

                this.HP += (int)(Math.ceil(this.BaseHP * 0.1)); //10% de la salud máxima

                if (this.HP > this.BaseHP) {
                    HP = BaseHP;
                }

                this.SEfectosP[13] -= 2; //Borra dos cargas de regen

                JOptionPane.showMessageDialog(null, this.Nombre + " regeneró "+(this.HP - IniHP)+" de vida");
            } else {
                System.out.println(this.Nombre + " no se pudo Regenerar por tener Bloqueo de Curación");
            }
        } else if (this.SEfectosP[13] > 0) { //Si solo tiene una carga de regeneración
            if (!U.hasBlockHealing(this)) {
                int IniHP = this.HP;

                this.HP += (int)(Math.ceil(this.BaseHP * 0.05)); //Una carga individual restaura 5% de la salud máxima

                if (this.HP > this.BaseHP) {
                    HP = BaseHP;
                }

                this.SEfectosP[13]--;

                JOptionPane.showMessageDialog(null, this.Nombre + " regeneró "+(this.HP - IniHP)+" de vida");
            } else {
                System.out.println(this.Nombre + " no se pudo Regenerar por tener Bloqueo de Curación");
            }
        }
        
        if (U.hasHemorrhage(this)) {
            int IniHP = this.HP;
            
            this.HP -= (int)(Math.ceil(this.BaseHP * 0.1));
            
            this.SEfectosN[9]--;
            
            JOptionPane.showMessageDialog(null, this.Nombre + " perdió "+(IniHP - this.HP)+" de vida por Hemorragia");
            
            if (this.HP <= 0) {
                Condiciones[8] = 1; //Muerte por sangrado / hemorragia
                DeathGet(this, this.SEfectosP, null, Condiciones);
            }
        }
        
        if (this.SEfectosN[13] > 1) { //Si tiene mínimo 2 cargas de sangrado
            int IniHP = this.HP;
            
            this.HP -= (int)(Math.ceil(this.BaseHP * 0.1));
            
            this.SEfectosN[13] -= 2;
            
            JOptionPane.showMessageDialog(null, this.Nombre + " sangró "+(IniHP - this.HP)+" de vida");
            
        } else if (this.SEfectosN[13] > 0) {
            int IniHP = this.HP;
            
            this.HP -= (int)(Math.ceil(this.BaseHP * 0.05));
            
            this.SEfectosN[13]--;
            
            JOptionPane.showMessageDialog(null, this.Nombre + " sangró "+(IniHP - this.HP)+" de vida");
        }
        
        if (U.isBurned(this)) {
            int IniHP = this.HP;
            
            this.HP -= (int)(Math.ceil(this.HP * 0.01));
            
            JOptionPane.showMessageDialog(null, this.Nombre + " perdió "+(IniHP - this.HP)+" de vida por Quemadura");
            
            if (this.HP <= 0) {
                Condiciones[9] = 1; //Muerte por quemadura
                DeathGet(this, this.SEfectosP, null, Condiciones);
            }
        }
    }
    
    @Override
    public void ConvertEfectos(Personaje Target, int[] EfectosN, int[] EfectosP, Personaje Atacante, int[] Condiciones) {
        String convertNMsg = "";
        String convertPMsg = "";
        
        //Convierte los positivos a negativos
        if (!U.hasSalvation(this)) { //Si no tiene salvación
            //Bloqueo → Bajada de defensa
            if (U.hasBlock(this)) {
                this.SEfectosN[3] += EfectosP[1];
                this.SEfectosP[1] -= EfectosP[1];
                convertPMsg += "\n"+U.GetPEffectName(1) + " → " + U.GetNEffectName(3)+" ["+EfectosP[1]+"]";
            }
            //Concentración → Molestia
            if (U.hasHighAcc(this)) {
                this.SEfectosN[10] += EfectosP[2];
                this.SEfectosP[2] -= EfectosP[2];
                convertPMsg += "\n"+U.GetPEffectName(2) + " → " + U.GetNEffectName(10)+" ["+EfectosP[2]+"]";
            }
            //Contraataque → Bajada de defensa
            if (U.hasCounter(this)) {
                this.SEfectosN[3] += EfectosP[3];
                this.SEfectosP[3] -= EfectosP[3];
                convertPMsg += "\n"+U.GetPEffectName(3) + " → " + U.GetNEffectName(3)+" ["+EfectosP[3]+"]";
            }
            //Desvío → Bajada de defensa
            if (U.hasDeflection(this)) {
                this.SEfectosN[3] += EfectosP[4];
                this.SEfectosP[4] -= EfectosP[4];
                convertPMsg += "\n"+U.GetPEffectName(4) + " → " + U.GetNEffectName(3)+" ["+EfectosP[4]+"]";
            }
            //Etéreo → Torpeza
            if (U.isEthereal(this)) {
                this.SEfectosN[18] += EfectosP[5];
                this.SEfectosP[5] -= EfectosP[5];
                convertPMsg += "\n"+U.GetPEffectName(5) + " → " + U.GetNEffectName(18)+" ["+EfectosP[5]+"]";
            }
            //Evasión → Torpeza
            if (U.hasEvasion(this)) {
                this.SEfectosN[18] += EfectosP[6];
                this.SEfectosP[6] -= EfectosP[6];
                convertPMsg += "\n"+U.GetPEffectName(6) + " → " + U.GetNEffectName(18)+" ["+EfectosP[6]+"]";
            }
            //Holgura → Vulnerabilidad
            if (U.isLoosed(this)) {
                this.SEfectosN[14] += EfectosP[7];
                this.SEfectosP[7] -= EfectosP[7];
                convertPMsg += "\n"+U.GetPEffectName(7) + " → " + U.GetNEffectName(14)+" ["+EfectosP[7]+"]";
            }
            //Inmortalidad → Hemorragia
            if (U.isImmortal(this)) {
                this.SEfectosN[9] += EfectosP[8];
                this.SEfectosP[8] -= EfectosP[8];
                convertPMsg += "\n"+U.GetPEffectName(8) + " → " + U.GetNEffectName(9)+" ["+EfectosP[8]+"]";
            }
            //Inmunidad → Alteración
            if (U.isImmune(this)) {
                this.SEfectosN[8] += EfectosP[9];
                this.SEfectosP[9] -= EfectosP[9];
                convertPMsg += "\n"+U.GetPEffectName(9) + " → " + U.GetNEffectName(8)+" ["+EfectosP[9]+"]";
            }
            //Invisivilidad → Bajada de defensa
            if (U.isInvisible(this)) {
                this.SEfectosN[3] += EfectosP[10];
                this.SEfectosP[10] -= EfectosP[10];
                convertPMsg += "\n"+U.GetPEffectName(10) + " → " + U.GetNEffectName(3)+" ["+EfectosP[10]+"]";
            }
            //Rapidez → Ralentizamiento
            if (U.hasHighSpeed(this)) {
                this.SEfectosN[11] += EfectosP[11];
                this.SEfectosP[11] -= EfectosP[11];
                convertPMsg += "\n"+U.GetPEffectName(11) + " → " + U.GetNEffectName(11)+" ["+EfectosP[11]+"]";
            }
            //Reconstrucción → Sangrado
            if (U.hasRepair(this)) {
                this.SEfectosN[13] += EfectosP[12];
                this.SEfectosP[12] -= EfectosP[12];
                convertPMsg += "\n"+U.GetPEffectName(12) + " → " + U.GetNEffectName(13)+" ["+EfectosP[12]+"]";
            }
            //Regeneración → Sangrado
            if (U.hasRegen(this)) {
                this.SEfectosN[13] += EfectosP[13];
                this.SEfectosP[13] -= EfectosP[13];
                convertPMsg += "\n"+U.GetPEffectName(13) + " → " + U.GetNEffectName(13)+" ["+EfectosP[13]+"]";
            }
            //Subida de ataque → Bajada de ataque
            if (U.hasHighDmg(this)) {
                this.SEfectosN[2] += EfectosP[14];
                this.SEfectosP[14] -= EfectosP[14];
                convertPMsg += "\n"+U.GetPEffectName(14) + " → " + U.GetNEffectName(2)+" ["+EfectosP[14]+"]";
            }
            //Subida de defensa → Bajada de defensa
            if (U.hasHighDef(this)) {
                this.SEfectosN[3] += EfectosP[15];
                this.SEfectosP[15] -= EfectosP[15];
                convertPMsg += "\n"+U.GetPEffectName(15) + " → " + U.GetNEffectName(3)+" ["+EfectosP[15]+"]";
            }
            //Subida de resistencia → Bajada de resistencia
            if (U.hasHighRes(this)) {
                this.SEfectosN[17] += EfectosP[16];
                this.SEfectosP[16] -= EfectosP[16];
                convertPMsg += "\n"+U.GetPEffectName(16) + " → " + U.GetNEffectName(17)+" ["+EfectosP[16]+"]";
            }
            //Agilidad → Torpeza
            if (U.hasHighEva(this)) {
                this.SEfectosN[18] += EfectosP[18];
                this.SEfectosP[18] -= EfectosP[18];
                convertPMsg += "\n"+U.GetPEffectName(18) + " → " + U.GetNEffectName(18)+" ["+EfectosP[18]+"]";
            }
            //Desapercibido → Provocación
            if (U.isUnnoticed(this)) {
                this.SEfectosP[20] += EfectosP[19];
                this.SEfectosP[19] -= EfectosP[19];
                convertPMsg += "\n"+U.GetPEffectName(19) + " → " + U.GetNEffectName(20)+" ["+EfectosP[19]+"]";
            }
            //Provocación → Bajada de defensa
            if (U.isTaunting(this)) {
                this.SEfectosN[3] += EfectosP[20];
                this.SEfectosP[20] -= EfectosP[20];
                convertPMsg += "\n"+U.GetPEffectName(20) + " → " + U.GetNEffectName(3)+" ["+EfectosP[20]+"]";
            }
        } else {
            System.out.println("Los efectos positivos de " + this.getName() + " no pueden ser convertidos al tener Salvación");
        }
        
        
        //Convierte los efectos negativos en positivos
        if (!U.isDoomed(this)) {
            //Aturdimiento → Rapidez
            if (U.isStunned(this)) {
                this.SEfectosP[11] += EfectosN[0];
                this.SEfectosN[0] -= EfectosN[0];
                convertNMsg += "\n"+U.GetNEffectName(0) + " → " + U.GetPEffectName(11)+" ["+EfectosN[0]+"]";
            }
            //Congelamiento → Rapidez
            if (U.isFreezed(this)) {
                this.SEfectosP[11] += EfectosN[1];
                this.SEfectosN[1] -= EfectosN[1];
                convertNMsg += "\n"+U.GetNEffectName(1) + " → " + U.GetPEffectName(11)+" ["+EfectosN[1]+"]";
            }
            //Bajada de ataque → Subida de ataque
            if (U.hasLowDmg(this)) {
                this.SEfectosP[14] += EfectosN[2];
                this.SEfectosN[2] -= EfectosN[2];
                convertNMsg += "\n"+U.GetNEffectName(2) + " → " + U.GetPEffectName(14)+" ["+EfectosN[2]+"]";
            }
            //Bajada de defensa → Subida de defensa
            if (U.hasLowDef(this)) {
                this.SEfectosP[15] += EfectosN[3];
                this.SEfectosN[3] -= EfectosN[3];
                convertNMsg += "\n"+U.GetNEffectName(3) + " → " + U.GetPEffectName(15)+" ["+EfectosN[3]+"]";
            }
            //Bloqueo de curación → Subida de defensa
            if (U.hasBlockHealing(this)) {
                this.SEfectosP[15] += EfectosN[4];
                this.SEfectosN[4] -= EfectosN[4];
                convertNMsg += "\n"+U.GetNEffectName(4) + " → " + U.GetPEffectName(15)+" ["+EfectosN[4]+"]";
            }
            //Bloqueo de energía → Subida de ataque
            if (U.hasBlockEnergy(this)) {
                this.SEfectosP[14] += EfectosN[5];
                this.SEfectosN[5] -= EfectosN[5];
                convertNMsg += "\n"+U.GetNEffectName(5) + " → " + U.GetPEffectName(14)+" ["+EfectosN[5]+"]";
            }
            //Bloqueo de habilidades → Subida de ataque
            if (U.hasBlockAbility(this)) {
                this.SEfectosP[14] += EfectosN[6];
                this.SEfectosN[6] -= EfectosN[6];
                convertNMsg += "\n"+U.GetNEffectName(6) + " → " + U.GetPEffectName(14)+" ["+EfectosN[6]+"]";
            }
            //Ceguera → Concentración
            if (U.isBlind(this)) {
                this.SEfectosP[2] += EfectosN[7];
                this.SEfectosN[7] -= EfectosN[7];
                convertNMsg += "\n"+U.GetNEffectName(7) + " → " + U.GetPEffectName(2)+" ["+EfectosN[7]+"]";
            }
            //Alteración → Inmunidad
            if (U.isAltered(this)) {
                this.SEfectosP[9] += EfectosN[8];
                this.SEfectosN[8] -= EfectosN[8];
                convertNMsg += "\n"+U.GetNEffectName(8) + " → " + U.GetPEffectName(9)+" ["+EfectosN[8]+"]";
            }
            //Hemorragia → Regeneración
            if (U.hasHemorrhage(this)) {
                this.SEfectosP[13] += EfectosN[9];
                this.SEfectosN[9] -= EfectosN[9];
                convertNMsg += "\n"+U.GetNEffectName(9) + " → " + U.GetPEffectName(13)+" ["+EfectosN[9]+"]";
            }
            //Molestia → Concentración
            if (U.hasLowAcc(this)) {
                this.SEfectosP[2] += EfectosN[10];
                this.SEfectosN[10] -= EfectosN[10];
                convertNMsg += "\n"+U.GetNEffectName(10) + " → " + U.GetPEffectName(2)+" ["+EfectosN[10]+"]";
            }
            //Ralentizamiento → Rapidez
            if (U.hasLowSpeed(this)) {
                this.SEfectosP[11] += EfectosN[11];
                this.SEfectosN[11] -= EfectosN[11];
                convertNMsg += "\n"+U.GetNEffectName(11) + " → " + U.GetPEffectName(11)+" ["+EfectosN[11]+"]";
            }
            //Helado → Rapidez
            if (U.hasBlockEnergy(this)) {
                this.SEfectosP[11] += EfectosN[12];
                this.SEfectosN[12] -= EfectosN[12];
                convertNMsg += "\n"+U.GetNEffectName(12) + " → " + U.GetPEffectName(11)+" ["+EfectosN[12]+"]";
            }
            //Sangrado → Regeneración
            if (U.hasBleeding(this)) {
                this.SEfectosP[13] += EfectosN[13];
                this.SEfectosN[13] -= EfectosN[13];
                convertNMsg += "\n"+U.GetNEffectName(13) + " → " + U.GetPEffectName(13)+" ["+EfectosN[13]+"]";
            }
            //Vulnerabilidad → Holgura
            if (U.isVulnerable(this)) {
                this.SEfectosP[7] += EfectosN[14];
                this.SEfectosN[14] -= EfectosN[14];
                convertNMsg += "\n"+U.GetNEffectName(14) + " → " + U.GetPEffectName(7)+" ["+EfectosN[14]+"]";
            }
            //Quemado → Regeneración
            if (U.isBurned(this)) {
                this.SEfectosP[13] += EfectosN[15];
                this.SEfectosN[15] -= EfectosN[15];
                convertNMsg += "\n"+U.GetNEffectName(15) + " → " + U.GetPEffectName(13)+" ["+EfectosN[15]+"]";
            }
            //Bajada de resistencia → Subida de resistencia
            if (U.hasLowRes(this)) {
                this.SEfectosP[16] += EfectosN[17];
                this.SEfectosN[17] -= EfectosN[17];
                convertNMsg += "\n"+U.GetNEffectName(17) + " → " + U.GetPEffectName(16)+" ["+EfectosN[17]+"]";
            }
            //Torpeza → Agilidad
            if (U.hasLowEva(this)) {
                this.SEfectosP[18] += EfectosN[18];
                this.SEfectosN[18] -= EfectosN[18];
                convertNMsg += "\n"+U.GetNEffectName(18) + " → " + U.GetPEffectName(18)+" ["+EfectosN[18]+"]";
            }
        } else {
            System.out.println("Los efectos negativos de " + this.getName() + " no pueden ser convertidos al tener Perdición");
        }
        
        if (!convertPMsg.equals(""))
            JOptionPane.showMessageDialog(null, this.getName()+" sufrió las siguientes conversiones:\n"+convertPMsg);
        if (!convertNMsg.equals(""))
            JOptionPane.showMessageDialog(null, this.getName()+" ganó las siguientes conversiones:\n"+convertNMsg);
        
        //Los efectos que se pudieron haber pasado a negativos son devueltos a valor 0
        for (int i = 0; i < U.CantidadEfectosPo; i++) {
            if (this.SEfectosP[i] < 0)
                this.SEfectosP[i] = 0;
        }
        for (int i = 0; i < U.CantidadEfectosNe; i++) {
            if (this.SEfectosN[i] < 0)
                this.SEfectosN[i] = 0;
        }
    }
    
    @Override
    public int getID() {
        return this.ID;
    }
    
    @Override
    public int getInGameID() {
        return this.InGameID;
    }
    
    @Override
    public int getLVL() {
        return this.CharLv;
    }
    
    @Override
    public int getPsLvl() {
        return this.PsLv;
    }
    
    @Override
    public int getH1Lvl() {
        return this.H1Lv;
    }
    
    @Override
    public int getH2Lvl() {
        return this.H2Lv;
    }
    
    @Override
    public int getH3Lvl() {
        return this.H3Lv;
    }
    
    @Override
    public String getName() {
        return this.Nombre;
    }
    
    @Override
    public String getTeam() {
        return this.TEAM;
    }
    
    @Override
    public String getSide() {
        return this.SIDE;
    }
    
    @Override
    public String getPsInfo() {
        return this.PsDesc;
    }
    
    @Override
    public String getH1Info() {
        return this.H1Desc;
    }
    
    @Override
    public String getH2Info() {
        return this.H2Desc;
    }
    
    @Override
    public String getH3Info() {
        return this.H3Desc;
    }
    
    @Override
    public int getH2Energy() {
        return this.H2Energy;
    }
    
    @Override
    public int getH2MaxEnergy() {
        return this.H2MaxEnergy;
    }
    
    @Override
    public String msgH2NotReady() {
        return "Greenbeam no puede proteger a sus aliados porque sigue concentrando energía";
    }
    
    @Override
    public int getH3Energy() {
        return this.H3Energy;
    }
    
    @Override
    public int getH3MaxEnergy() {
        return this.H3MaxEnergy;
    }
    
    @Override
    public String msgH3NotReady() {
        return "Greenbeam aún está concentrando su energía desintegrante";
    }
    
    @Override
    public int getBaseHP() {
        return this.BaseHP;
    }
    
    @Override
    public int getHP() {
        return this.HP;
    }
    
    @Override
    public int getShield() {
        return this.Shield;
    }
    
    @Override
    public int getDMG() {
        return this.DMG;
    }
    
    @Override
    public int getSPEED() {
        return this.SPEED;
    }
    
    @Override
    public int getDEF() {
        return this.DEF;
    }
    
    @Override
    public int getRES() {
        return this.RES;
    }
    
    @Override
    public int getACC() {
        return this.ACC;
    }
    
    @Override
    public int getEVA() {
        return this.EVA;
    }
    
    @Override
    public boolean IsDead() {
        return this.IsDead;
    }
    
    @Override
    public int[] getEfectosN() {
        return this.SEfectosN;
    }
    
    @Override
    public int[] getEfectosP() {
        return this.SEfectosP;
    }
    
    @Override
    public int[] getCargas() {
        return null;
    }
    
    @Override
    public Personaje AllyLeft() {
        return LeftAlly;
    }
    
    @Override
    public Personaje AllyRight() {
        return RightAlly;
    }
    
    @Override
    public Personaje Aliado1() {
        return Aliado1;
    }
    
    @Override
    public Personaje Aliado2() {
        return Aliado2;
    }
    
    @Override
    public Personaje Aliado3() {
        return Aliado3;
    }
    
    @Override
    public Personaje Aliado4() {
        return Aliado4;
    }
    
    @Override
    public Personaje Aliado5() {
        return Aliado5;
    }
    
    @Override
    public Personaje Enemigo1() {
        return Enemigo1;
    }
    
    @Override
    public Personaje Enemigo2() {
        return Enemigo2;
    }
    
    @Override
    public Personaje Enemigo3() {
        return Enemigo3;
    }
    
    @Override
    public Personaje Enemigo4() {
        return Enemigo4;
    }
    
    @Override
    public Personaje Enemigo5() {
        return Enemigo5;
    }
    
    @Override
    public void AllyDeath(Personaje Target, Personaje Atacante) {
        //Crimson X no hace nada
    }

    @Override
    public void CheckAllyGet(Personaje Target, Personaje Atacante) {
        
    }

    @Override
    public void CheckAllyPost(Personaje Target, Personaje Atacante) {
        
    }

    @Override
    public boolean HitInChain() {
        return this.hitInChain;
    }
    
    @Override
    public void GetHitInChain() {
        this.hitInChain = true;
    }
    
    @Override
    public void ResetHitInChain() {
        this.hitInChain = false;
    }
}
