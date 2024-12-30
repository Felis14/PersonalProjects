package Control_Objetos;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Control_Objetos_Users {
    
    //Recibe como parametro una contraseña digitada por el usuario y la compara con las más comunes de la web, evitando posibles brechas de seguridad
    public int ContraseñasMalas(String texto) {
        texto = texto.toLowerCase();
        int contramala=0; 
        String contrasmalas[] = {"password", "123456", "123456789", "guest", "qwerty", "12345678", "111111", "col123456", "123123",
        "1234567", "1234567890", "0123456789", "012345", "000000", "555555", "222222", "333333", "444444", "666666", "777777", "888888", "999999",
        "123321", "654321", "543210", "012210", "7777777", "d1lakiss", "110110jp", "dragon", "987654321", "9876543210", "000000000000", "111111111111",
        "222222222222", "333333333333", "444444444444", "555555555555", "666666666666", "77777777777", "888888888888", "999999999999", "qwerty123456",
        "qwerty012345", "ytrewq", "654321ytrewq", "ytrewq654321", "baseball", "abc123", "football", "monkey", "letmein", "shadow", "master", "696969",
        "michael", "mustang", "1234...890", "pussy", "superman", "1qaz2wsx", "qazwsx", "fuckyou", "jordan", "killer", "trustno1", "hunter", "buster",
        "asdfgh", "batman", "soccer", "tigger", "charlie", "q1w2e3r4", "q1w2e3", "qweasdzxc", "asdfasdf", "qwer1234"};
        for (int i=0; i<contrasmalas.length; i++) {
            if (texto.equals(""+contrasmalas[i])) {
                contramala++;
            }
        }
        return contramala;
    }
    
    //Limpia todo en el form de registrar
    public void LimpiarRegistrar(JTextField txt1, JPasswordField txt2, JTextField txt3, JTextField txt4, JLabel err1, JLabel err2) {
        txt1.setText("");
        txt2.setText(""); txt2.setEchoChar('•');
        txt3.setText("");
        txt4.setText("");
        err1.setIcon(null); err2.setIcon(null);
        err1.setToolTipText(""); err2.setToolTipText("");
    }
    
    //Limpia todo en el form de consultar
    public void LimpiarConsultar(JComboBox cb1, JTextField txt1, JPasswordField txt2, JTextField txt3, JTextField txt4, JTextField txt5, JTextField txt6) {
        cb1.setSelectedIndex(0);
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        txt4.setText("");
        txt5.setText("");
        txt6.setText("");
        txt2.setEchoChar('•');
    }
          
    //Bloquea todo en modificar     
    public void BloquearModificar(JComboBox cb1, JButton bt1, JTextField txt1, JTextField txt2, JTextField txt3) {
        cb1.setEnabled(true);
        bt1.setEnabled(false);
        txt1.setEditable(true);
        txt2.setEditable(false);
        txt3.setEditable(false);
    }
    
    //Desbloquea los objetos en modificar para permitir manipularlos
    public void DesbloquearModificar(JComboBox cb1, JButton bt1, JTextField txt1, JTextField txt2, JTextField txt3) {
        cb1.setEnabled(false);
        bt1.setEnabled(true);
        txt1.setEditable(false);
        txt2.setEditable(true);
        txt3.setEditable(true);
    }
    
    //Limpia todos los campos de modificar
    public void LimpiarModificar(JComboBox cb1, JTextField txt1, JPasswordField txt2, JTextField txt3, JTextField txt4, JTextField txt5, JTextField txt6) {
        cb1.setSelectedIndex(0);
        txt1.setText("");
        txt2.setText(""); txt2.setEchoChar('•');
        txt3.setText("");
        txt4.setText("");
        txt5.setText("");
        txt6.setText("");
    }
    
    //Bloquea los objetos en el form activar
    public void BloquearActivar(JComboBox cb1, JTextField txt1, JButton bt1, JButton bt2) {
        cb1.setEnabled(true);
        txt1.setEditable(true);
        bt1.setEnabled(true);
        bt2.setEnabled(false);
    }
    
    //Desbloquea los objetos en el form de activar, para que asi se puedan desactivar o activar usuarios
    public void DesbloquearActivar(JComboBox cb1, JTextField txt1, JButton bt1, JButton bt2) {
        cb1.setEnabled(false);
        txt1.setEditable(false);
        bt1.setEnabled(false);
        bt2.setEnabled(true);
    }
}
