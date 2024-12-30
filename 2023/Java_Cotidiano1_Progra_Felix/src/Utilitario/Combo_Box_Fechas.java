package Utilitario;

import javax.swing.JComboBox;

public class Combo_Box_Fechas {
    public void d31(JComboBox CbBox){
        int i=1;
        while (i<=31) {
            CbBox.addItem(i);
            i++;
        }
    }
    
    public void d28(JComboBox CbBox){
        int i=1;
        while (i<=28) {
            CbBox.addItem(i);
            i++;
        }
    }
    
    public void d30(JComboBox CbBox){
        int i=1;
        while (i<=30) {
            CbBox.addItem(i);
            i++;
        }
    }
}
