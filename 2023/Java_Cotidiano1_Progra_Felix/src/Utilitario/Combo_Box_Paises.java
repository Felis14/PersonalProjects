package Utilitario;

import javax.swing.JComboBox;

public class Combo_Box_Paises {
    public void CargarCbPaises(JComboBox box) {
        String paises[] = {"Antigua y Barbuda", "Argentina", "Bahamas", "Barbados", "Belice", "Bolivia", "Brasil", "Canadá", "Chile", "Colombia",
        "Costa Rica", "Cuba", "Dominica", "Ecuador", "El Salvador", "Estados Unidos", "Granada", "Guatemala", "Guyana", "Haití", "Honduras",
        "Jamaica", "México", "Nicaragua", "Panamá", "Paraguay", "Perú", "República Dominicana", "San Cristóbal y Nieves",
        "San Vicente y Las Granadinas", "Santa Lucía", "Surinam", "Trinidad y Tobago", "Uruguay", "Venezuela"};
        
        for (int i=0; i < paises.length ; i++) {
            box.addItem(paises[i]);
        }
    }
    
    public void CargarCbAFG(JComboBox box) {
        String est[] = {"Saint George", "Saint John", "Saint Mary", "Saint Paul", "Saint Peter", "Saint Phillip"};
        
        for (int i=0; i < est.length; i++) {
            box.addItem(est[i]);
        }
    } //0
    
    public void CargarCbARG(JComboBox box) {
        String est[] = {"Buenos Aires", "Catamarca", "Chaco", "Chubut", "Córdoba", "Corrientes", "Entre Ríos", "Formosa", "Jujuy", "La Pampa",
        "La Rioja", "Mendoza", "Misiones", "Neuquén", "Río Negro", "Salta", "San Juan", "San Luis", "Santa Cruz", "Santa Fe",
        "Santiago del Estero", "Tierra del Fuego", "Tucumán"};
        
        for (int i=0; i < est.length; i++) {
            box.addItem(est[i]);
        }
    } //1
    
    public void CargarCbBHS(JComboBox box) {
        String est[] = {"Acklins Islands", "Berry Islands", "Bimini", "Black Point", "Cat Island", "Central Abaco", "Central Andros",
        "Central Eleuthera", "City of Freeport", "Crooked Island and Long Cay", "East Grand Bahama", "Exuma", "Grand Cay",
        "Harbour Island", "Hope Town", "Inagua", "Long Island", "Mangrove Cay", "Mayaguana", "Moore's Island", "North Abaco",
        "North Andros", "North Eleuthera", "Ragged Island", "Rum Cay", "San Salvador", "South Abaco", "South Andros", "South Eleuthera",
        "Spanish Wells", "West Grand Bahama"};
        
        for (int i=0; i < est.length; i++) {
            box.addItem(est[i]);
        }
    } //2
    
    public void CargarCbBRB(JComboBox box) {
        String est[] = {"Bridgetown", "Christ Church", "Saint Andrew", "Saint George", "Saint James", "Saint John", "Saint Josep",
        "Saint Lucy", "Saint Michael", "Saint Peter", "Saint Philip", "Saint Thomas"};
        
        for (int i=0; i<est.length; i++) {
            box.addItem(est[i]);
        }
    } //3
    
    public void CargarCbBLZ(JComboBox box) {
        String est[] = {"Belice", "Cayo", "Co- rozal", "Orange Walk", "Stann Creek", "Toledo"};
        
        for (int i=0; i < est.length; i++) {
            box.addItem(est[i]);
        }
    } //4
    
    public void CargarCbBOL(JComboBox box) {
        String est[] = {"Beni", "Cochabamba", "Chuquisaca", "La Paz", "Oruro", "Pando", "Potosí", "Tarija", "Santa Cruz"};
        
        for (int i=0; i < est.length; i++) {
            box.addItem(est[i]);
        }
    } //5
    
    public void CargarCbBRA(JComboBox box) {
        String est[] = {"Acre", "Alagoas", "Amapá", "Amazonas", "Bahía", "Brasilia", "Ceará", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso",
        "Mato Grosso del Sur", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Río de Janeiro", "Río Grande del Norte",
        "Río Grande del Sur", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins", "Distrito Federal"};
        
        for (int i=0; i < est.length; i++) {
            box.addItem(est[i]);
        }
    } //6
    
    public void CargarCbCAN(JComboBox box) {
        String est[] = {"Alberta", "Columbia Británica", "Isla del Príncipe Eduardo", "Manitoba", "Nueva Escocia", "Nuevo Brunswick",
        "Nunavut", "Ontario", "Quebec", "Saskatchewan", "Terranova y Labrador", "Territorios del Noroeste", "Yukón"};
        
        for (int i=0; i < est.length; i++) {
            box.addItem(est[i]);
        }
    } //7
    
    public void CargarCbCHL(JComboBox box) {
        String est[] = {"Antofagasta", "Arica y Parinacota", "Atacama", "Aysén", "Bío-Bío", "Coquimbo", "La Araucanía", "Los Lagos", "Los Ríos",
        "Magallanes", "Maulo", "Metropolitana", "O'Higgins", "Valparaíso"};
        
        for (int i=0; i < est.length; i++) {
            box.addItem(est[i]);
        }
    } //8
    
    public void CargarCbCOL(JComboBox box) {
        String est[] = {"Amazonas", "Antioquia", "Arauca", "Atlántico", "Bogotá, D. C.", "Bolívar", "Boyacá", "Caldas", "Caquetá", "Casanare",
        "Cauca", "Cesar", "Chocó", "Córdoba", "Cundinamarca", "Guainía", "Guaviare", "Huila", "La Guajira", "Magdalena", "Meta", "Nariño",
        "Norte de Santander", "Putumayo", "Quindío", "Risaralda", "San Andrés y Providencia", "Santander", "Sucre", "Tolima", "Valle del Cauca",
        "Vaupás", "Vichada"};
        
        for (int i=0; i < est.length; i++) {
            box.addItem(est[i]);
        }
    } //9
    
    public void CargarCbCRC(JComboBox box) {
        String est[] = {"San José", "Alajuela", "Cartago", "Heredia", "Guanacaste", "Puntarenas", "Limón"};
        
        for (int i=0; i < est.length; i++) {
            box.addItem(est[i]);
        }
    } //10
    
    public void CargarCbCUB(JComboBox box) {
        
    } //11
}
