package Utilitario_Validaciones;

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
        
        if (String.valueOf(dd).length() == 1 && String.valueOf(mm).length() == 2) {
            return "0"+dd + "-" + mm + "-" + yy;
        } else if (String.valueOf(dd).length() == 2 && String.valueOf(mm).length() == 1) {
            return dd + "-" + "0"+mm + "-" + yy;
        } else if (String.valueOf(dd).length() == 1 && String.valueOf(mm).length() == 1) {
            return "0"+dd + "-" + "0"+mm + "-" + yy;
        } else {
            return dd + "-" + mm + "-" + yy;
        }
    }
}
