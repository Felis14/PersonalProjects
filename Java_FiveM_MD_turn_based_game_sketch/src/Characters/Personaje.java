package Characters;

public interface Personaje {
    
    int getID(); //Obtiene la ID del personaje
    int getInGameID(); //Obtiene la ID del personaje en partida
    int getLVL(); //Obtiene el nivel
    String getName(); //Obtiene el nombre
    String getTeam(); //Obtiene el equipo
    String getSide(); //Obtiene su bando
    
    String getPsInfo(); //Obtiene la descripción de la pasiva
    String getH1Info(); //Obtiene la descripción de la habilidad básica
    String getH2Info(); //Obtiene la descripción de la habilidad alternativa
    String getH2Behave(); //Obtiene el comportamiento de la habilidad alternativa (Daña o cura)
    String msgH2NotReady(); //Obtiene un mensaje de la habilidad alternativa no lista
    String getH3Info(); //Obtiene la descripción de la habilidad definitiva
    String getH3Behave(); //Obtiene el comportamiento de la habilidad Definitiva (Daña o cura)
    String msgH3NotReady(); //Obtiene un mensaje de la habilidad definitiva no lista
    
    int getBaseHP(); int getHP(); //Obtiene la vida máxima y la vida actual
    int getShield(); //Obtiene el escudo
    int getDMG(); //Obtiene el daño
    int getSPEED(); //Obtiene la velocidad
    int getDEF(); //Obtiene la defensa
    int getRES(); //Obtiene la resistencia
    int getACC(); //Obtiene la precisión
    int getEVA(); //Obtiene el esquive
    
    boolean IsDead(); //Chequea si está muerto
    boolean HitInChain(); //Para ataques con encadenamientos SIN rebote    
    void GetHitInChain(); //Para cambiar el hitInChain a true
    
    int getPsLvl(); //Obtiene el nivel de la pasiva
    int getH1Lvl(); //Obtiene el nivel de la habilidad básica
    int getH2Lvl(); //Obtiene el nivel de la habilidad alternativa
    int getH2Energy(); //Obtiene la energía actual de la habilidad alternativa
    int getH2MaxEnergy(); //Obtiene la energía máxima de la habilidad alternativa
    int getH3Lvl(); //Obtiene el nivel de la habilidad definitiva
    int getH3Energy(); //Obtiene la energía actual de la habilidad definitiva
    int getH3MaxEnergy(); //Obtiene la energía máxima de la habilidad definitiva
    
    int[] getCargas(); //Obtiene las cargas (si tiene)
    
    Personaje AllyLeft(); //Obtiene el aliado adyacente a la izquierda
    Personaje AllyRight(); //Obtiene el aliado adyacente a la derecha
    
    Personaje Aliado1(); //Obtiene el aliado 1 (ID 1)
    Personaje Aliado2(); //Obtiene el aliado 2 (ID 2)
    Personaje Aliado3(); //Obtiene el aliado 3 (ID 3)
    Personaje Aliado4(); //Obtiene el aliado 4 (ID 4)
    Personaje Aliado5(); //Obtiene el aliado 5 (ID 5)
    
    Personaje Enemigo1(); //Obtiene el enemigo 1 (ID 6)
    Personaje Enemigo2(); //Obtiene el enemigo 2 (ID 7)
    Personaje Enemigo3(); //Obtiene el enemigo 3 (ID 8)
    Personaje Enemigo4(); //Obtiene el enemigo 4 (ID 9)
    Personaje Enemigo5(); //Obtiene el enemigo 5 (ID 10)
    
    int[] getEfectosN(); //Obtiene los efectos negativos
    int[] getEfectosP(); //Obtiene los efectos positivos
    
    void CargarStats(Personaje A1, Personaje A2, Personaje A3, Personaje A4, Personaje A5,
                    Personaje E1, Personaje E2, Personaje E3, Personaje E4, Personaje E5,
                    int CharLv, int PsLv, int H1Lv, int H2Lv, int H3Lv, String InGameID); //Carga todas las estadisticas del personaje
    void Start(); //Carga algún comportamiento que tenga el personaje al inicio
    void SufferGet(int hp, Personaje Target, int EfectosN[], int EfectosP[], Personaje Atacante, int Condiciones[]); //Antes de sufrir un ataque
    void SufferPost(int hp, Personaje Target, int EfectosN[], int EfectosP[], Personaje Atacante, int Condiciones[]); //Despues de sufrir un ataque
    void ReceiveAid(int hp, int shield, Personaje Target, Personaje Aliado, int EfectosN[], int EfectosP[], int Condiciones[]);
    void CheckGet(int dmg, Personaje Target, Personaje Atacante, int Condiciones[]); //Antes de que un enemigo ataque
    void CheckPost(int dmg, Personaje Target, Personaje Atacante, int Condiciones[]); //Después de que un enemigo ataque
    void ResetHitInChain(); //Cuando finaliza el turno de un enemigo
    void CheckAllyGet(Personaje Target, Personaje Aliado); //Antes de que un aliado ataque
    void CheckAllyPost(Personaje Target, Personaje Aliado); //Después de que un aliado ataque
    void Assist(Personaje Target, Personaje Asistencia); //Hace una asistencia o contraataque a un enemigo
    void H1Get(Personaje Target, int EfectosN[], int EfectosP[]); //Prepara la habilidad básica
    void H1Post(Personaje Target, int EfectosN[], int EfectosP[], int Condiciones[]); //Hace la habilidad básica y lo que pase después de terminar
    void H2Get(Personaje Target, int EfectosN[], int EfectosP[]); //Prepara la habilidad alternativa
    void H2Post(Personaje Target, int EfectosN[], int EfectosP[], int Condiciones[]); //Hace la habilidad alternativa y lo que pase después de terminar
    void H3Get(Personaje Target, int EfectosN[], int EfectosP[]); //Prepara la habilidad definitiva
    void H3Post(Personaje Target, int EfectosN[], int EfectosP[], int Condiciones[]); //Hace la habilidad definitiva y lo que pase después de terminar
    void DeathGet(Personaje Target, int EfectosP[], Personaje Atacante, int Condiciones[]); //Recibe el mensaje de que va a morir
    void DeathPost(Personaje Target, int EfectosP[], Personaje Atacante, int Condiciones[]); //Muere y activa algún comportamiento que pase después de morir
    void AllyDeath(Personaje Target, Personaje Atacante);
    
    void AddEnergy(); //Agrega 1 de energía a todas las habilidades
    void UpdateEfectos(); //Actualiza los efectos no permanentes
    void ConvertEfectos(Personaje Target, int EfectosN[], int EfectosP[], Personaje Atacante, int Condiciones[]); //Convierte efectos
    void HealBleed(); //Si hay sangrado y curación los hace
}
