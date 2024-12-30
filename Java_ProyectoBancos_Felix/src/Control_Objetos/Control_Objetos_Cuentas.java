package Control_Objetos;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Control_Objetos_Cuentas {
    
    //Limpia los objetos en registrar
    public void LimpiarRegistrar(JTextField txt1, ButtonGroup bg1, ButtonGroup bg2, JTextField txt2) {
        txt1.setText("");
        bg1.clearSelection();
        bg2.clearSelection();
        txt2.setText("");
    }
    
    //Bloquea los objetos del formulario registrar
    public void BloquearRegistrar(JComboBox cb1, JTextField txt1, JRadioButton rb1, JRadioButton rb2, JRadioButton rb3, JRadioButton rb4,
    JTextField txt2, JButton btncon, JButton btnbus, JButton btnreg) {
        txt1.setEditable(true);
        cb1.setEnabled(true);
        rb1.setEnabled(false);
        rb2.setEnabled(false);
        rb3.setEnabled(false);
        rb4.setEnabled(false);
        txt2.setEditable(false);
        btncon.setEnabled(true);
        btnbus.setEnabled(true);
        btnreg.setEnabled(false);
    }
    
    //Desbloquea los objetos del form registrar para el ingreso de datos
    public void DesbloquearRegistrar(JComboBox cb1, JTextField txt1, JRadioButton rb1, JRadioButton rb2, JRadioButton rb3, JRadioButton rb4,
    JTextField txt2, JButton btncon, JButton btnbus, JButton btnreg) {
        txt1.setEditable(false);
        cb1.setEnabled(false);
        rb1.setEnabled(true);
        rb2.setEnabled(true);
        rb3.setEnabled(true);
        rb4.setEnabled(true);
        txt2.setEditable(true);
        btncon.setEnabled(false);
        btnbus.setEnabled(false);
        btnreg.setEnabled(true);
    }
    
    //Bloquea consultar, sirve para cuando se va a buscar un cliente primero
    public void BloquearConsultar(JComboBox cb1, JTextField txt1, JButton but1, JComboBox cb3, JTextField txt2, JButton but2) {
        cb1.setEnabled(true);
        txt1.setEditable(true);
        but1.setEnabled(true);
        cb3.setEnabled(false);
        txt2.setEditable(false);
        but2.setEnabled(false);
    }
    
    //"Desbloquea" consultar, sirve para buscar una cuenta del cliente ya seleccionado
    public void DesbloquearConsultar(JComboBox cb1, JTextField txt1, JButton but1, JComboBox cb3, JTextField txt2, JButton but2) {
        cb1.setEnabled(false);
        txt1.setEditable(false);
        but1.setEnabled(false);
        cb3.setEnabled(true);
        txt2.setEditable(true);
        but2.setEnabled(true);
    }
    
    //Bloquear todo, bloquea todo cuando ya se consulta una cuenta de un cliente especifico
    public void BloquearTodoConsultar(JComboBox cb1, JTextField txt1, JButton but1, JComboBox cb3, JTextField txt2, JButton but2) {
        cb1.setEnabled(false);
        txt1.setEditable(false);
        but1.setEnabled(false);
        cb3.setEnabled(false);
        txt2.setEditable(false);
        but2.setEnabled(false);
    }
    
    //Limpiar los campos de consultar, menos la info del cliente, para poder buscar una cuenta del mismo
    public void LimpiarConsultar(JComboBox cb1, JTextField txt1, JTextField txt2, JTextField txt3,
    ButtonGroup bg1, ButtonGroup bg2, JLabel lb1, JTextField txt4, JTextField txt5) {
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        bg1.clearSelection();
        bg2.clearSelection();
        lb1.setText("-");
        txt4.setText("");
        txt5.setText("");
    }
    
    //Limpia todos los campos en consultar
    public void LimpiarTodoConsultar(JComboBox cb1, JTextField txt1, JTextField txt2, JTextField txt3,
    ButtonGroup bg1, ButtonGroup bg2, JLabel lb1, JTextField txt4, JTextField txt5, JTextField txt6) {
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        bg1.clearSelection();
        bg2.clearSelection();
        lb1.setText("-");
        txt4.setText("");
        txt5.setText("");
        txt6.setText("");
        cb1.setSelectedIndex(0);
    }
}