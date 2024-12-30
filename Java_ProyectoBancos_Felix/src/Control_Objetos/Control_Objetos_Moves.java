package Control_Objetos;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Control_Objetos_Moves {
    //Limpia todos los campos en registrar
    public void LimpiarTodoRegistrar(JTextField txt1, JTextField txt2, JTextField txt3, JTextField txt4, JTextField txt5,
    JLabel Sig, ButtonGroup tiptr) {
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        txt4.setText("");
        txt5.setText("");
        Sig.setText("-");
        tiptr.clearSelection();
    }
    
    //Limpia los campos suficientes para conservar la informacion de cliente y cuenta
    public void ConsultarOtraCuenta(JTextField txt1, JTextField txt2, JTextField txt3, JTextField txt4,
    JLabel Sig, ButtonGroup tiptr) {
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        txt4.setText("");
        Sig.setText("-");
        tiptr.clearSelection();
    }
    
    //Bloquea registrar
    public void BloquearRegistrar(JComboBox cb1, JTextField txt1, JButton but1, JComboBox cb3, JTextField txt2, JButton but2, JButton but3,
    JTextField txt3, JTextField txt4, JTextField txt5, JRadioButton rb1, JRadioButton rb2) {
        cb1.setEnabled(true);
        txt1.setEditable(true);
        but1.setEnabled(true);
        cb3.setEnabled(false);
        txt2.setEditable(false);
        but2.setEnabled(false);
        but3.setEnabled(false);
        txt3.setEditable(false);
        txt4.setEditable(false);
        txt5.setEditable(false);
        rb1.setEnabled(false);
        rb2.setEnabled(false);
    }
    
    //Desbloquea registrar, para buscar la cuenta
    public void DesbloquearRegistrar(JComboBox cb1, JTextField txt1, JButton but1, JComboBox cb3, JTextField txt2, JButton but2, JButton but3,
    JTextField txt3, JTextField txt4, JTextField txt5, JRadioButton rb1, JRadioButton rb2) {
        cb1.setEnabled(false);
        txt1.setEditable(false);
        but1.setEnabled(false);
        cb3.setEnabled(true);
        txt2.setEditable(true);
        but2.setEnabled(true);
        but3.setEnabled(false);
        txt3.setEditable(false);
        txt4.setEditable(false);
        txt5.setEditable(false);
        rb1.setEnabled(false);
        rb2.setEnabled(false);
    }
    
    //Bloquea todo en registrar una vez ya se buscó el movimiento
    public void BloquearTodoRegistrar(JComboBox cb1, JTextField txt1, JButton but1, JComboBox cb3, JTextField txt2, JButton but2, JButton but3,
    JTextField txt3, JTextField txt4, JTextField txt5, JRadioButton rb1, JRadioButton rb2) {
        cb1.setEnabled(false);
        txt1.setEditable(false);
        but1.setEnabled(false);
        cb3.setEnabled(false);
        txt2.setEditable(false);
        but2.setEnabled(false);
        but3.setEnabled(true);
        txt3.setEditable(true);
        txt4.setEditable(true);
        txt5.setEditable(true);
        rb1.setEnabled(true);
        rb2.setEnabled(true);
    }
    
    //Bloquea todo para que solo se pueda buscar el cliente
    public void BuscandoCliente(JTextField txt1, JTextField txt2, JTextField txt3, JComboBox cb1, JComboBox cb2, JComboBox cb3,
    JButton bt1, JButton bt2, JButton bt3, JButton bt4, JButton bt5) {
        txt1.setEditable(true);
        txt2.setEditable(false);
        txt3.setEditable(false);
        cb1.setEnabled(true);
        cb2.setEnabled(false);
        cb3.setEnabled(false);
        bt1.setEnabled(true);
        bt2.setEnabled(false);
        bt3.setEnabled(false);
        bt4.setEnabled(false);
        bt5.setEnabled(false);
    }
    
    //Bloquea todo para que solo se pueda buscar la cuenta
    public void BuscandoCuenta(JTextField txt1, JTextField txt2, JTextField txt3, JComboBox cb1, JComboBox cb2, JComboBox cb3,
    JButton bt1, JButton bt2, JButton bt3, JButton bt4, JButton bt5) {
        txt1.setEditable(false);
        txt2.setEditable(true);
        txt3.setEditable(false);
        cb1.setEnabled(false);
        cb2.setEnabled(true);
        cb3.setEnabled(false);
        bt1.setEnabled(false);
        bt2.setEnabled(true);
        bt3.setEnabled(true);
        bt4.setEnabled(false);
        bt5.setEnabled(false);
    }
    
    //Bloquea todo para que solo se puedan buscar movimientos
    public void BuscandoMov(JTextField txt1, JTextField txt2, JTextField txt3, JComboBox cb1, JComboBox cb2, JComboBox cb3,
    JButton bt1, JButton bt2, JButton bt3, JButton bt4, JButton bt5) {
        txt1.setEditable(false);
        txt2.setEditable(false);
        txt3.setEditable(true);
        cb1.setEnabled(false);
        cb2.setEnabled(false);
        cb3.setEnabled(true);
        bt1.setEnabled(false);
        bt2.setEnabled(true);
        bt3.setEnabled(false);
        bt4.setEnabled(true);
        bt5.setEnabled(true);
    }
    
    //Limpiar todos los textos de consultar
    public void LimpiarTodoConsultar(JTextField txt1, JTextField txt2, JTextField txt3, JTextField txt4, JTextField txt5, JTextField txt6, JTextField txt7,
    JLabel Sig, ButtonGroup tiptr) {
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        txt4.setText("");
        txt5.setText("");
        txt6.setText("");
        txt7.setText("");
        Sig.setText("-");
        tiptr.clearSelection();
    }
    
    //Limpia todo menos la cuenta y la info del cliente para consultar algun otro movimiento
    public void ConsultarOCuentaConsultar(JTextField txt1, JTextField txt2, JTextField txt3, JTextField txt4, JTextField txt5, JTextField txt6,
    JLabel Sig, ButtonGroup tiptr) {
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        txt4.setText("");
        txt5.setText("");
        txt6.setText("");
        Sig.setText("-");
        tiptr.clearSelection();
    }
    
    //Limpia todo menos la informacion del cliente para buscar otra cuenta
    public void ConsultarOtroMov(JTextField txt1, JTextField txt2, JTextField txt3, JTextField txt4, JTextField txt5, ButtonGroup tiptr) {
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        txt4.setText("");
        txt5.setText("");
        tiptr.clearSelection();
    }
    
    //Bloquea todo en el form de consultar
    public void BloquearTodoConsultar(JTextField txt1, JTextField txt2, JTextField txt3, JComboBox cb1, JComboBox cb2, JComboBox cb3,
    JButton bt1, JButton bt2, JButton bt3, JButton bt4, JButton bt5) {
        txt1.setEditable(false);
        txt2.setEditable(false);
        txt3.setEditable(false);
        cb1.setEnabled(false);
        cb2.setEnabled(false);
        cb3.setEnabled(false);
        bt1.setEnabled(false);
        bt2.setEnabled(true);
        bt3.setEnabled(false);
        bt4.setEnabled(true);
        bt5.setEnabled(false);
    }
}