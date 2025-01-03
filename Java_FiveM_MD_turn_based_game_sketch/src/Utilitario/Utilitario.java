package Utilitario;

import Characters.Personaje;
import java.util.ArrayList;

public class Utilitario {
    
    public final int CantidadEfectosNe = 19;
    public final int CantidadEfectosPo = 21;
    public final int CantidadCondiciones = 18;
    
    public int RandomEntre(int NumMin, int NumMax) {
        int n=0;
        
        n += Math.floor((Math.random() * (NumMax + 1 - NumMin)) + NumMin);
        
        return n;
    }
    
    public double RandomEntreDec(double NumMin, double NumMax) {
        int n=0;
        
        n += (Math.random() * (NumMax + 1 - NumMin)) + NumMin;
        
        return n;
    }
    
    public boolean hasEffectsPo(Personaje Target) {
        for (int i = 0; i < CantidadEfectosPo; i++) {
            if (Target.getEfectosP()[i] >= 1) {
                return true;
            }
        }
        
        return false;
    }
    
    public boolean hasEffectsNe(Personaje Target) {
        for (int i = 0; i < CantidadEfectosNe; i++) {
            if (Target.getEfectosN()[i] >= 1) {
                return true;
            }
        }
        
        return false;
    }
    
    public int[] EffectsPoOf(Personaje Target) {
        ArrayList<Integer> effectsList = new ArrayList<>();
        
        for (int i = 0; i < CantidadEfectosPo; i++) {
            if (Target.getEfectosP()[i] >= 1) {
                effectsList.add(i);
            }
        }
        
        int[] effects = new int[effectsList.size()];
        for (int i = 0; i < effectsList.size(); i++) {
            effects[i] = effectsList.get(i);
        }

        return effects;
    }
    
    public int[] EffectsNeOf(Personaje Target) {
        ArrayList<Integer> effectsList = new ArrayList<>();
        
        for (int i = 0; i < CantidadEfectosNe; i++) {
            if (Target.getEfectosN()[i] >= 1) {
                effectsList.add(i);
            }
        }
        
        int[] effects = new int[effectsList.size()];
        for (int i = 0; i < effectsList.size(); i++) {
            effects[i] = effectsList.get(i);
        }

        return effects;
    }
    
    public int TotalEffectsPoOf(Personaje Target) {
        int effects=0;
        
        for (int i = 0; i < CantidadEfectosPo-1; i++) {
            if (Target.getEfectosP()[i] > 0) {
                effects += Target.getEfectosP()[i];
            }
        }
            
        return effects;
    }
    
    public int TotalEffectsNeOf(Personaje Target) {
        int effects=0;
        
        for (int i = 0; i < CantidadEfectosNe-1; i++) {
            if (Target.getEfectosN()[i] > 0) {
                effects += Target.getEfectosN()[i];
            }
        }
            
        return effects;
    }
    
    public Personaje findAllyToAssist(Personaje personaje, Personaje[] Aliados) {
        Personaje Asistir = null;
        
        int noDisp = 0;
        
        boolean loop = true;
        
        while (loop) {
            int Ally = RandomEntre(0, 4);
            
            for (Personaje aliado : Aliados) {
                if (aliado != personaje) {
                    if (isStunned(aliado) || isFreezed(aliado) || aliado.IsDead() || isBlind(aliado)) {
                        noDisp++;
                    }
                }
            }
            
            if (Aliados[Ally] != personaje && noDisp < 4) {
                if (!isStunned(Aliados[Ally]) && !isFreezed(Aliados[Ally]) && !Aliados[Ally].IsDead() && !isBlind(Aliados[Ally])) {
                    Asistir = Aliados[Ally];
                    loop = false;
                }
            }
            
            if (noDisp >= 4)
                return null;
        }
        
        return Asistir;
    }
    
    public Personaje findAllyTeamToAssist(Personaje personaje, Personaje[] Aliados, String Team) {
        Personaje Asistir = null;
        
        int noDisp = 0;
        
        boolean loop = true;
        
        while (loop) {
            int Ally = RandomEntre(0, 4);
            
            for (Personaje aliado : Aliados) {
                if (aliado != personaje) {
                    if (isStunned(aliado) || isFreezed(aliado) || aliado.IsDead() || isBlind(aliado) || !aliado.getTeam().equals(Team)) {
                        noDisp++;
                    }
                }
            }
            
            if (Aliados[Ally] != personaje && noDisp < 4) {
                if (!isStunned(Aliados[Ally]) && !isFreezed(Aliados[Ally]) && !Aliados[Ally].IsDead() && !isBlind(Aliados[Ally]) && Aliados[Ally].getTeam().equals(Team)) {
                    Asistir = Aliados[Ally];
                    loop = false;
                }
            }
            
            if (noDisp >= 4)
                return null;
        }
        
        return Asistir;
    }
    
    public String GetNEffectName(int id) {
        String name="";
        
        switch(id) {
            case 0 -> name = "Aturdimiento";
            case 1 -> name = "Congelado";
            case 2 -> name = "Bajada de ataque";
            case 3 -> name = "Bajada de defensa";
            case 4 -> name = "Bloqueo de curación";
            case 5 -> name = "Bloqueo de energía";
            case 6 -> name = "Bloqueo de habilidades";
            case 7 -> name = "Ceguera";
            case 8 -> name = "Alteración";
            case 9 -> name = "Hemorragia";
            case 10 -> name = "Molestia";
            case 11 -> name = "Ralentizamiento";
            case 12 -> name = "Helado";
            case 13 -> name = "Sangrado";
            case 14 -> name = "Vulnerabilidad";
            case 15 -> name = "Quemado";
            case 16 -> name = "Perdición";
            case 17 -> name = "Bajada de Resistencia";
            case 18 -> name = "Torpeza";
        }
        
        return name;
    }
    
    public int GetNEffectProbDelConver(int id) {
        int prob = 0;
        
        switch(id) {
            case 0 -> prob = 25;
            case 1 -> prob = 10;
            case 2 -> prob = 100;
            case 3 -> prob = 100;
            case 4 -> prob = 50;
            case 5 -> prob = 25;
            case 6 -> prob = 50;
            case 7 -> prob = 50;
            case 8 -> prob = 25;
            case 9 -> prob = 10;
            case 10 -> prob = 100;
            case 11 -> prob = 100;
            case 12 -> prob = 40;
            case 13 -> prob = 50;
            case 14 -> prob = 40;
            case 15 -> prob = 20;
            case 16 -> prob = 0;
            case 17 -> prob = 100;
            case 18 -> prob = 100;
        }
        
        return prob;
    }
    
    public String GetPEffectName(int id) {
        String name="";
        
        switch(id) {
            case 0 -> name = "Asistencia";
            case 1 -> name = "Bloqueo"; 
            case 2 -> name = "Concentración";
            case 3 -> name = "Contraataque";
            case 4 -> name = "Desvío";
            case 5 -> name = "Etéreo";
            case 6 -> name = "Evasión";
            case 7 -> name = "Holgura";
            case 8 -> name = "Inmortalidad";
            case 9 -> name = "Inmunidad";
            case 10 -> name = "Invisibilidad";
            case 11 -> name = "Rapidez";
            case 12 -> name = "Reconstrucción";
            case 13 -> name = "Regeneración";
            case 14 -> name = "Subida de ataque";
            case 15 -> name = "Subida de defensa";
            case 16 -> name = "Subida de resistencia";
            case 17 -> name = "Salvación";
            case 18 -> name = "Agilidad";
            case 19 -> name = "Desapercibido";
            case 20 -> name = "Provocación";
        }
        
        return name;
    }
    
    public int GetPEffectProbDelConver(int id) {
        int prob = 0;
        
        switch(id) {
            case 0 -> prob = 20;
            case 1 -> prob = 75;
            case 2 -> prob = 100;
            case 3 -> prob = 25;
            case 4 -> prob = 25;
            case 5 -> prob = 10;
            case 6 -> prob = 25;
            case 7 -> prob = 30;
            case 8 -> prob = 10;
            case 9 -> prob = 25;
            case 10 -> prob = 50;
            case 11 -> prob = 100;
            case 12 -> prob = 10;
            case 13 -> prob = 50;
            case 14 -> prob = 100;
            case 15 -> prob = 100;
            case 16 -> prob = 100;
            case 17 -> prob = 0;
            case 18 -> prob = 100;
            case 19 -> prob = 50;
            case 20 -> prob = 50;
        }
        
        return prob;
    }
    
    //<editor-fold defaultstate="collapsed" desc=" Efectos Negativos ">
    public boolean isStunned(Personaje Char) {
        return Char.getEfectosN()[0] > 0;
    }
    
    public boolean isFreezed(Personaje Char) {
        return Char.getEfectosN()[1] > 0;
    }
    
    public boolean hasLowDmg(Personaje Char) {
        return Char.getEfectosN()[2] > 0;
    }
    
    public boolean hasLowDef(Personaje Char) {
        return Char.getEfectosN()[3] > 0;
    }
    
    public boolean hasBlockHealing(Personaje Char) {
        return Char.getEfectosN()[4] > 0;
    }
    
    public boolean hasBlockEnergy(Personaje Char) {
        return Char.getEfectosN()[5] > 0;
    }
    
    public boolean hasBlockAbility(Personaje Char) {
        return Char.getEfectosN()[6] > 0;
    }
    
    public boolean isBlind(Personaje Char) {
        return Char.getEfectosN()[7] > 0;
    }
    
    public boolean isAltered(Personaje Char) {
        return Char.getEfectosN()[8] > 0;
    }
    
    public boolean hasHemorrhage(Personaje Char) {
        return Char.getEfectosN()[9] > 0;
    }
    
    public boolean hasLowAcc(Personaje Char) {
        return Char.getEfectosN()[10] > 0;
    }
    
    public boolean hasLowSpeed(Personaje Char) {
        return Char.getEfectosN()[11] > 0;
    }
    
    public boolean isFrozen(Personaje Char) {
        return Char.getEfectosN()[12] > 0;
    }
    
    public boolean hasBleeding(Personaje Char) {
        return Char.getEfectosN()[13] > 0;
    }
    
    public boolean isVulnerable(Personaje Char) {
        return Char.getEfectosN()[14] > 0;
    }
    
    public boolean isBurned(Personaje Char) {
        return Char.getEfectosN()[15] > 0;
    }
    
    public boolean isDoomed(Personaje Char) {
        return Char.getEfectosN()[16] > 0;
    }
    
    public boolean hasLowRes(Personaje Char) {
        return Char.getEfectosN()[17] > 0;
    }
    
    public boolean hasLowEva(Personaje Char) {
        return Char.getEfectosN()[18] > 0;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Efectos Positivos ">
    public boolean hasAssist(Personaje Char) {
        return Char.getEfectosP()[0] > 0;
    }
    
    public boolean hasBlock(Personaje Char) {
        return Char.getEfectosP()[1] > 0;
    }
    
    public boolean hasHighAcc(Personaje Char) {
        return Char.getEfectosP()[2] > 0;
    }
    
    public boolean hasCounter(Personaje Char) {
        return Char.getEfectosP()[3] > 0;
    }
    
    public boolean hasDeflection(Personaje Char) {
        return Char.getEfectosP()[4] > 0;
    }
    
    public boolean isEthereal(Personaje Char) {
        return Char.getEfectosP()[5] > 0;
    }
    
    public boolean hasEvasion(Personaje Char) {
        return Char.getEfectosP()[6] > 0;
    }
   
    public boolean isLoosed(Personaje Char) {
        return Char.getEfectosP()[7] > 0;
    }
   
    public boolean isImmortal(Personaje Char) {
        return Char.getEfectosP()[8] > 0;
    }
    
    public boolean isImmune(Personaje Char) {
        return Char.getEfectosP()[9] > 0;
    }
    
    public boolean isInvisible(Personaje Char) {
        return Char.getEfectosP()[10] > 0;
    }
    
    public boolean hasHighSpeed(Personaje Char) {
        return Char.getEfectosP()[11] > 0;
    }
    
    public boolean hasRepair(Personaje Char) {
        return Char.getEfectosP()[12] > 0;
    }
    
    public boolean hasRegen(Personaje Char) {
        return Char.getEfectosP()[13] > 0;
    }
    
    public boolean hasHighDmg(Personaje Char) {
        return Char.getEfectosP()[14] > 0;
    }
    
    public boolean hasHighDef(Personaje Char) {
        return Char.getEfectosP()[15] > 0;
    }
    
    public boolean hasHighRes(Personaje Char) {
        return Char.getEfectosP()[16] > 0;
    }
    
    public boolean hasSalvation(Personaje Char) {
        return Char.getEfectosP()[17] > 0;
    }
    
    public boolean hasHighEva(Personaje Char) {
        return Char.getEfectosP()[18] > 0;
    }
    
    public boolean isUnnoticed(Personaje Char) {
        return Char.getEfectosP()[19] > 0;
    }
    
    public boolean isTaunting(Personaje Char) {
        return Char.getEfectosP()[20] > 0;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Condiciones ">
    public boolean isTrueDmg(int[] Con) {
        return Con[0] == 1;
    }
    
    public boolean ignoreEvade(int[] Con) {
        return Con[1] == 1;
    }
    
    public boolean ignoreBlock(int[] Con) {
        return Con[2] == 1;
    }
    
    public boolean ignoreEthereal(int[] Con) {
        return Con[3] == 1;
    }
    
    public boolean ignoreCounter(int[] Con) {
        return Con[4] == 1;
    }
    
    public boolean ignoreImmortal(int[] Con) {
        return Con[5] == 1;
    }
    
    public boolean alwaysApplyEffects(int[] Con) {
        return Con[6] == 1;
    }
    
    public boolean ignoreCheckGet(int[] Con) {
        return Con[7] == 1;
    }
    
    public boolean deathByBleed(int[] Con) {
        return Con[8] == 1;
    }
    
    public boolean deathByBurn(int[] Con) {
        return Con[9] == 1;
    }
    
    public boolean behaveHeal(int[] Con) {
        return Con[10] == 1;
    }
    
    public boolean behaveCleanEffects(int[] Con) {
        return Con[11] == 1;
    }
    
    public boolean behaveAddEffects(int[] Con) {
        return Con[12] == 1;
    }
    
    public boolean behaveShield(int[] Con) {
        return Con[13] == 1;
    }
    
    public boolean firstCleanEffects(int[] Con) {
        return Con[14] == 1;
    }
    
    public boolean ignoreBlockHealing(int[] Con) {
        return Con[15] == 1;
    }
    
    public boolean ignoreAltered(int[] Con) {
        return Con[16] == 1;
    }
    
    public boolean ignoreCheckPost(int[] Con) {
        return Con[17] == 1;
    }
    //</editor-fold>
}
