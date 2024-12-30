package Utilitario;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Validaciones {
    //Clase Validaciones que permite validar que al digitar datos por el usuario no permita digite
    //numeros cuando el campo texto acepte letras y viceversa
 
    //Procedimiento para que acepte solo numeros
    public void solonumeros(java.awt.event.KeyEvent evt) {
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
    
    public void noEspacios(java.awt.event.KeyEvent evt) {
        char k = evt.getKeyChar();
        if (k == KeyEvent.VK_SPACE) {
            JOptionPane.showMessageDialog(null, "No se pueden digitar espacios.", "Error", JOptionPane.ERROR_MESSAGE);
            evt.consume();
        }
    }
    
    public void solonumerosfecha(java.awt.event.KeyEvent evt) {
        char k = evt.getKeyChar();
        if (k != KeyEvent.VK_BACK_SPACE &&
        k != KeyEvent.VK_DELETE &&
        k != KeyEvent.VK_ENTER) {
            if (!Character.isDigit(k)) {
                JOptionPane.showMessageDialog(null, "Solo se aceptan números.", "Error", JOptionPane.ERROR_MESSAGE);
                evt.consume();
            }
        }
    }
    
    //Procedimiento para que acepte solo letras
    public void sololetras(java.awt.event.KeyEvent evt) {
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
}
