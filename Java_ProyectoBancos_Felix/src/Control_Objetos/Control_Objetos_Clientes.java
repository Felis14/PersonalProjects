package Control_Objetos;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import org.jdesktop.swingx.JXDatePicker;

public class Control_Objetos_Clientes {
    
    //Funcion que recibe una fecha en formato dd/mm/yyyy y la devuelve en formato yyyy/mm/dd
    public String DBFecha(String fecha) {
        //La fecha entrante es XX/XX/XXXX
        //Se separará la fecha en tres variables, dia, mes y año, para despues acomodarlas al revés
        String D="", M="", A="", F;
        //La variable sec permite saber cuando se pasa un "/", o sea, cuando cambia de dia a mes y de mes a año
        int sec=0;
        for (int i=0; i<fecha.length(); i++) {
            //Si el caracter en la posicion contador es /, suma al contador para saltar y suma a sec para pasar a la siguiente variable
            if (fecha.charAt(i) == '-') {
                sec++;
                i++;
            }
            //Agrega el caracter segun en la seccion que está
            if (sec == 0) {
                D += fecha.charAt(i);
            } else if (sec == 1) {
                M += fecha.charAt(i);
            } else {
                A += fecha.charAt(i);
            }
        }
        //Da la vuelta a la fecha sumando las variables de año a dia
        F = A+"-"+M+"-"+D;
        //Devuelve la fecha ya cambia como XXXX/XX/XX
        return F;
    }
    
    //DisFecha es lo mismo que DBFecha, pero pasa la fecha de yyyy/mm/dd a dd/mm/yyyy
    public String DisFecha(String fecha) {
        //La fecha entrante es XXXX/XX/XX
        //Se separará la fecha en tres variables, dia, mes y año, para despues acomodarlas al revés
        String D="", M="", A="", F;
        //La variable sec permite saber cuando se pasa un "/", o sea, cuando cambia de dia a mes y de mes a año
        int sec=0;
        for (int i=0; i<fecha.length(); i++) {
            //Si el caracter en la posicion contador es /, suma al contador para saltar y suma a sec para pasar a la siguiente variable
            if (fecha.charAt(i) == '-') {
                sec++;
                i++;
            }
            //Agrega el caracter segun en la seccion que está
            if (sec == 0) {
                A += fecha.charAt(i);
            } else if (sec == 1) {
                M += fecha.charAt(i);
            } else {
                D += fecha.charAt(i);
            }
        }
        //Da la vuelta a la fecha sumando las variables de año a dia
        F = D+"-"+M+"-"+A;
        //Devuelve la fecha ya cambia como XX/XX/XXXX
        return F;
    }
    
    //Limpia todos los campos en el form de Registrar
    public void LimpiarRegistrar(JTextField txt1, JTextField txt2, JTextField txt3, JTextField txt4, JTextField txt5) {
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        txt4.setText("");
        txt5.setText("");
    }
    
    //Limpia todos los campos en el form de consultar
    public void LimpiarConsultar(JTextField txt1, JTextField txt2, JTextField txt3, JTextField txt4, JTextField txt5, JTextField txt6) {
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        txt4.setText("");
        txt5.setText("");
        txt6.setText("");
    }
    
    //Bloquea los objetos en registrar hasta que se usen
    public void BloquearObjetosRegistrar(JTextField txt1, JTextField txt2, JTextField txt3, JTextField txt4, JTextField txt5, JButton btnbus, JButton btnreg) {
        txt1.setEditable(true);
        txt2.setEditable(false);
        txt3.setEditable(false);
        txt4.setEditable(false);
        txt5.setEditable(false);
        btnbus.setEnabled(true);
        btnreg.setEnabled(false);
    }
    
    //Desbloquea los objetos en registrar, para ingresar datos
    public void DesbloquearObjetosRegistrar(JTextField txt1, JTextField txt2, JTextField txt3, JTextField txt4, JTextField txt5, JButton btnbus, JButton btnreg) {
        txt1.setEditable(false);
        txt2.setEditable(true);
        txt3.setEditable(true);
        txt4.setEditable(true);
        txt5.setEditable(true);
        btnbus.setEnabled(false);
        btnreg.setEnabled(true);
    }
    
    //Bloquea objetos en el form de Actualizar
    public void BloquearObjetosActualizar(JComboBox cb1, JTextField txt1, JTextField txt2, JTextField txt3, JTextField txt4, JTextField txt5, JButton btnbus, JButton btnact) {
        cb1.setEnabled(true);
        txt1.setEditable(true);
        txt2.setEditable(false);
        txt3.setEditable(false);
        txt4.setEditable(false);
        txt5.setEditable(false);
        btnbus.setEnabled(true);
        btnact.setEnabled(false);
    }
    
    //Desbloquea los objetos en el form para cambiarlos
    public void DesbloquearObjetosActualizar(JComboBox cb1, JTextField txt1, JTextField txt2, JTextField txt3, JTextField txt4, JTextField txt5, JButton btnbus, JButton btnact) {
        cb1.setEnabled(false);
        txt1.setEditable(false);
        txt2.setEditable(true);
        txt3.setEditable(true);
        txt4.setEditable(true);
        txt5.setEditable(true);
        btnbus.setEnabled(false);
        btnact.setEnabled(true);
    }
}
