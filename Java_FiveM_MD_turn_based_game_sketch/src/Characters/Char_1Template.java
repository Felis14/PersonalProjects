package Characters;

import Interfaz.Partida;
import javax.swing.JOptionPane;
import Utilitario.Utilitario;

public class Char_1Template implements Personaje {
    
    Utilitario U = new Utilitario();
    
    int CharLv, PsLv, H1Lv, H2Lv, H3Lv; //Nivel de Personaje, Pasiva, Habilidad 1, Habilidad 2, Habilidad 3
    
    //Nombre, equipo, héroe o villano, ID de personaje (en lógica de juego), ID de personaje (posición en partida)
    String Nombre = "Nombre", TEAM = "Team", SIDE = "Side"; int ID = 0, InGameID;
    boolean IsDead = false;
    
    //Funciona para los personajes adyacentes
    Personaje LeftAlly; //El aliado a la izquierda
    Personaje RightAlly; //El aliado a la derecha
    
    //Todos los aliados, incluyendo el mismo (se excluye después)
    Personaje Aliado1;
    Personaje Aliado2;
    Personaje Aliado3;
    Personaje Aliado4;
    Personaje Aliado5;
    
    //Todos los enemigos
    Personaje Enemigo1;
    Personaje Enemigo2;
    Personaje Enemigo3;
    Personaje Enemigo4;
    Personaje Enemigo5;
    
    //A cada stat base se le resta su incremento, para que a la hora de ser llamados se pueda hacer stat + stat*incremento%
    //El incremento es el porcentaje que sube por nivel
    int SHP = 1959; double HPI = 2.03; int BaseHP, HP;
    int Shield = 0;
    int SDMG = 123; double DMGI = 2.04; int DMG;
    int SSPEED = 98; double SPEEDI = 1.5; int BaseSpeed, SPEED;
    int SDEF = 10; double DEFI = 4.5; int DEF;
    int SRES = 15; int RESI = 3; int RES;
    int SACC = 99; double ACCI = 2.01; int ACC;
    int SEVA = 5; double EVAI = 2.2; int EVA;
    
    double CritChance = 0.1;
    double CritDmg = 0.1;
    
    int dmgadya = 0, adicional = 0, assist = 0;
    boolean evadido = false;
    boolean hitInChain = false;
    
    //Se utilizan como vector ya que cada posicion contiene la ID del efecto y su valor la cantidad
    //de cargas de ese efecto
    int SEfectosP[] = new int [U.CantidadEfectosPo]; //Vector que almacenará los efectos positivos que tenga aplicados
    int SEfectosN[] = new int [U.CantidadEfectosNe]; //Y este todos los efectos negativos que tenga aplicados
    
    //Strings para la información de habilidades y pasiva
    String PsDesc = "";
    String H1Desc = "";
    String H2Desc = "";
    String H3Desc = "";
    
    //Energía inicial y energía requerida para cada habilidad
    int H2Energy = 0;
    int H2MaxEnergy = 0;
    int H3Energy = 0;
    int H3MaxEnergy = 0;
    
    //Para las habilidades
    int dmg; //daño %
    int chain; //Encadena enemigos
    
    //Pasiva
    public void Pasiva(){
        
    }
    
    //Infos de pasivas y habilidades
    public void CargarInfos() {
        //<editor-fold defaultstate="collapsed" desc=" Pasiva ">
        switch(PsLv) {
            case 1 -> {
                PsDesc = """
                         Nombre Pasiva:
                         
                         Info""";
            }
            case 2 -> {
                PsDesc = """
                         Nombre Pasiva:
                         
                         Info""";
            }
            case 3 -> {
                PsDesc = """
                         Nombre Pasiva:
                         
                         Info""";
            }
            case 4 -> {
                PsDesc = """
                         Nombre Pasiva:
                         
                         Info""";
            }
            case 5 -> {
                PsDesc = """
                         Nombre Pasiva:
                         
                         Info""";
            }
        }
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc=" Habilidad Básica ">
        switch(H1Lv) {
            case 1 -> {
                H1Desc = """
                         Nombre habilidad 1:
                         
                         Info""";
            }
            case 2 -> {
                H1Desc = """
                         Nombre habilidad 1:
                         
                         Info""";
            }
            case 3 -> {
                H1Desc = """
                         Nombre habilidad 1:
                         
                         Info""";
            }
            case 4 -> {
                H1Desc = """
                         Nombre habilidad 1:
                         
                         Info""";
            }
            case 5 -> {
                H1Desc = """
                         Nombre habilidad 1:
                         
                         Info""";
            }
        }
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc=" Habilidad Estándar ">
        switch(H2Lv) {
            case 1 -> {
                H2Desc = """
                         Nombre habilidad 2:
                         
                         Info""";
            }
            case 2 -> {
                H2Desc = """
                         Nombre habilidad 2:
                         
                         Info""";
            }
            case 3 -> {
                H2Desc = """
                         Nombre habilidad 2:
                         
                         Info""";
            }
            case 4 -> {
                H2Desc = """
                         Nombre habilidad 2:
                         
                         Info""";
            }
            case 5 -> {
                H2Desc = """
                         Nombre habilidad 2:
                         
                         Info""";
            }
        }
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc=" Habilidad Potente ">
        switch(H3Lv) {
            case 1 -> {
                H3Desc = """
                         Nombre Habilidad 3:
                         
                         Info""";
            }
            case 2 -> {
                H3Desc = """
                         Nombre Habilidad 3:
                         
                         Info""";
            }
            case 3 -> {
                H3Desc = """
                         Nombre Habilidad 3:
                         
                         Info""";
            }
            case 4 -> {
                H3Desc = """
                         Nombre Habilidad 3:
                         
                         Info""";
            }
            case 5 -> {
                H3Desc = """
                         Nombre Habilidad 3:
                         
                         Info""";
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
        
        BaseHP = (int)Math.ceil(SHP + ((SHP+41) * ((HPI*CharLv) * 0.01)));
        HP = BaseHP;
        DMG = (int) Math.ceil(SDMG + ((SDMG+3) * ((DMGI*CharLv) * 0.01)));
        SPEED = (int) Math.ceil(SSPEED + ((SSPEED+2) * ((SPEEDI*CharLv) * 0.01)));
        BaseSpeed = SPEED;
        DEF = (int) Math.ceil(SDEF + (SDEF * (DEFI * CharLv) * 0.01));
        RES = (int) Math.ceil(SRES + (SRES * (RESI * CharLv) * 0.01));
        ACC = (int) Math.ceil(SACC + (((SACC+1)/2) * ((ACCI*CharLv) * 0.01)));
        EVA = (int) Math.ceil(SEVA + (SEVA * (EVAI * CharLv) * 0.01));
    }

    @Override
    public void Start() {
        //Acciones que hace un personaje al iniciar la partida
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
        //Personaje hace x cosa cuando un enemigo va a atacar
    }

    @Override
    public void CheckPost(int dmg, Personaje Target, Personaje Atacante, int Condiciones[]) {
        //Personaje hace x cosa después de que un enemigo ataca
    }
    
    @Override
    public void CheckAllyGet(Personaje Target, Personaje Atacante){
        //Personaje hace x cosa cuando un aliado va a atacar
    }

    @Override
    public void CheckAllyPost(Personaje Target, Personaje Atacante){
        //Personaje hace x cosa después de que un aliado ataca
    }
    
    @Override
    public void Assist(Personaje Target, Personaje Asistido) {
        String critMsg = "";
        
        int AEfectosN[] = new int [U.CantidadEfectosNe];
        for (int e = 0; e < AEfectosN.length; e++)
            AEfectosN[e] = 0;
        
        int AEfectosP[] = new int [U.CantidadEfectosPo];
        for (int e = 0; e < AEfectosP.length; e++)
            AEfectosP[e] = 0;
        
        int Condiciones[] = new int [U.CantidadCondiciones];
        for (int c = 0; c < Condiciones.length; c++)
            Condiciones[c] = 0;
        
        dmg = (int)Math.ceil(this.DMG * 0.6); //El daño de la asistencia es 60% el daño
        
        if (U.RandomEntreDec(0, 100) <= CritChance) { //Probabilidad de crítico
            dmg += (int)Math.ceil(dmg * CritDmg); //El daño se multiplica por la potencia de crítico
            critMsg = "\nEs un golpe crítico!";
        }
        
        if (U.hasHighDmg(this) && !U.hasLowDmg(this)) {
            dmg = (int)Math.ceil(dmg * 1.5);
            System.out.println("Reduciendo daño por tener Bajada de Ataque");
        }
        
        if (U.hasLowDmg(this) && !U.hasHighDmg(this)) {
            dmg = (int)Math.ceil(dmg * 0.5);
            System.out.println("Reduciendo daño por tener Bajada de Ataque");
        }
        
        Condiciones[4] = 1; //Una asistencia o contraataque no puede ser contraatacada
        
        if (Asistido != null) {
            JOptionPane.showMessageDialog(null, this.getName()+" asistirá a "+Asistido.getName()+critMsg);
            Target.SufferGet(dmg, Target, AEfectosN, AEfectosP, this, Condiciones);
        } else {
            JOptionPane.showMessageDialog(null, this.getName() + " va a contraatacar a "+Target.getName()+critMsg);
        }
    }

    @Override
    public void H1Get(Personaje Target, int EfectosN[], int EfectosP[]) {
        CheckGetsAlly(Target);
    }
    
    @Override
    public void H1Post(Personaje Target, int EfectosN[], int EfectosP[], int Condiciones[]) {
        
        
        CheckPostsAlly(Target);
    }

    @Override
    public void H2Get(Personaje Target, int EfectosN[], int EfectosP[]) {
        CheckGetsAlly(Target);
    }

    @Override
    public void H2Post(Personaje Target, int EfectosN[], int EfectosP[], int Condiciones[]) {
        
        
        CheckPostsAlly(Target);
    }

    @Override
    public void H3Get(Personaje Target, int EfectosN[], int EfectosP[]) {
        CheckGetsAlly(Target);
    }

    @Override
    public void H3Post(Personaje Target, int EfectosN[], int EfectosP[], int Condiciones[]) {
        
        
        CheckPostsAlly(Target);
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
        IsDead = true;
        
        if (!U.deathByBleed(Condiciones)) {
            switch(U.RandomEntre(0, 4)) {
                case 0 -> {
                    JOptionPane.showMessageDialog(null, Target.getName() + " murió a manos de "+Atacante.getName());
                }
                case 1 -> {
                    JOptionPane.showMessageDialog(null, Target.getName() + " fue asesinado por "+Atacante.getName());
                }
                case 2 -> {
                    JOptionPane.showMessageDialog(null, Atacante.getName() + " acabó con "+Target.getName() + " a sangre fría");
                }
                case 3 -> {
                    JOptionPane.showMessageDialog(null, Atacante.getName() + " le dió el golpe final a "+Target.getName());
                }
                case 4 -> {
                    JOptionPane.showMessageDialog(null, Target.getName() + " cayó muerto ante "+ Atacante.getName());
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
    
    //Variables
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
    public int[] getCargas() {
        int[] Cargas = {};
        return Cargas;
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
    public int getH3Energy() {
        return this.H3Energy;
    }
    
    @Override
    public int getH3MaxEnergy() {
        return this.H3MaxEnergy;
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
        //Cuando un aliado muere
    }

    @Override
    public String msgH2NotReady() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String msgH3NotReady() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getH2Behave() {
        return "";
    }

    @Override
    public String getH3Behave() {
        return "";
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
