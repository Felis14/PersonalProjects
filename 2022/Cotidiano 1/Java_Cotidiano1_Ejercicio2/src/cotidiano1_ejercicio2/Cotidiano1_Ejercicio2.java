package cotidiano1_ejercicio2;

import javax.swing.JOptionPane;

public class Cotidiano1_Ejercicio2
{
    public static void main(String[] args)
    {
        int lad, lad2, base;
        
        do
        {
        lad = Integer.parseInt(JOptionPane.showInputDialog(
        "Digite la medida del lado: "));
        
        if (lad == 0)
        {
            JOptionPane.showMessageDialog(null,
            "Digite un número mayor a cero.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        } while (lad == 0);
        
        do
        {
        lad2 = Integer.parseInt(JOptionPane.showInputDialog(
        "Digite la medida del otro lado: "));
        
        if (lad2 == 0)
        {
            JOptionPane.showMessageDialog(null,
            "Digite un número mayor a cero.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        } while (lad2 == 0);
        
        do
        {
        base = Integer.parseInt(JOptionPane.showInputDialog(
        "Digite la medida de la base: "));
        
        if (base == 0)
        {
            JOptionPane.showMessageDialog(null,
            "Digite un número mayor a cero.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        } while (base == 0);
        
        if ((base==lad)&&(base==lad2))
        {
            JOptionPane.showMessageDialog(null,
            "El triángulo es equilatero.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            if ((lad==lad2)||(lad==base))
            {
                JOptionPane.showMessageDialog(null,
                "El triángulo es isoceles.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null,
                "El tríangulo es escaleno.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        System.exit(0);
    }
}
