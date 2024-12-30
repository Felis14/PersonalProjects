package Utilitario;

import java.util.Date;

public class Fecha_Sistema {
    public String fecha() {
        int dd, mm, yy;
        
        //Definiendo y construyendo f del tipo clase date
        Date f = new Date();
        
        dd = f.getDate();
        
        //La funcion getmonth obtiene el mes del sistema, y se le suma 1 porque el mes lo obtienes a partir del número 0
        mm = f.getMonth() + 1;
        
        //La funcion getyear obtiene el año de la fecha, pero se le suma 1900 para que trabaje el año en formate de 4 digitos
        yy = f.getYear() + 1900;
        
        return dd + "/" + mm + "/" + yy;
    }
}
