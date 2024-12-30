package Utilitario_Validaciones;

import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Validaciones {
    //Clase Validaciones que permite validar que al digitar datos por el usuario no permita digite
    //numeros cuando el campo texto acepte letras y viceversa
 
    //Procedimiento para que acepte solo numeros
    public void soloNumeros(java.awt.event.KeyEvent evt) {
        //Aqui obtiene el caracter digita por el usuario
        char k = evt.getKeyChar();
        //En este if controla si el caracter es distinto de esas teclas: BACKSPACE, DELETE, ENTER
        if (k != KeyEvent.VK_BACK_SPACE &&
        k != KeyEvent.VK_DELETE &&
        k != KeyEvent.VK_ENTER) {
            //Aqui compara que si el caracter digitado no es un digito
            if (!Character.isDigit(k)) {
                JOptionPane.showMessageDialog(null, "Solo se aceptan números.", "Error", JOptionPane.ERROR_MESSAGE);
                evt.consume();
            }
        }
    }
    
    //Evita poner espacios en un campo
    public void noEspacios(java.awt.event.KeyEvent evt) {
        char k = evt.getKeyChar();
        if (k == KeyEvent.VK_SPACE) {
            JOptionPane.showMessageDialog(null, "No se pueden digitar espacios.", "Error", JOptionPane.ERROR_MESSAGE);
            evt.consume();
        }
    }
    
    //Procedimiento para que acepte solo letras
    public void soloLetras(java.awt.event.KeyEvent evt) {
        char k = evt.getKeyChar();
        if (k != KeyEvent.VK_BACK_SPACE &&
        k != KeyEvent.VK_DELETE &&
        k != KeyEvent.VK_ENTER) {
            if (Character.isDigit(k)) {
                JOptionPane.showMessageDialog(null, "Solo se aceptan letras.", "Error", JOptionPane.ERROR_MESSAGE);
                evt.consume();
            }
        }
    }
    
    //Para pasar de un campo a un textfield con la flecha de arriba
    public void subirCursorText(java.awt.event.KeyEvent evt, JTextField txt1) {
        int k = evt.getKeyCode();
        if (k == KeyEvent.VK_UP) {
            txt1.requestFocus();
        }
    }
    
    //Para pasar de un campo a un textfield con la flecha de abajo
    public void bajarCursorText(java.awt.event.KeyEvent evt, JTextField txt1) {
        int k = evt.getKeyCode();
        if (k == KeyEvent.VK_DOWN) {
            txt1.requestFocus();
        }
    }
    
    //Para pasar de un campo a un textfield con el enter
    public void saltoEnterText(java.awt.event.KeyEvent evt, JTextField txt1) {
        int k = evt.getKeyCode();
        if (k == KeyEvent.VK_ENTER) {
            txt1.requestFocus();
        }
    }
    
    //Flecha de arriba pero con un combo
    public void subirCursorCombo(java.awt.event.KeyEvent evt, JComboBox cb1) {
        int k = evt.getKeyCode();
        if (k == KeyEvent.VK_UP) {
            cb1.requestFocus();
        }
    }
    
    //Flecha de abajo con un combo
    public void bajarCursorCombo(java.awt.event.KeyEvent evt, JComboBox cb1) {
        int k = evt.getKeyChar();
        if (k == KeyEvent.VK_DOWN) {
            cb1.requestFocus();
        }
    }
    
    //Enter para pasar a un combo
    public void saltoEnterCombo(java.awt.event.KeyEvent evt, JComboBox cb1) {
        int k = evt.getKeyChar();
        if (k == KeyEvent.VK_ENTER) {
            cb1.requestFocus();
        }
    }
}
