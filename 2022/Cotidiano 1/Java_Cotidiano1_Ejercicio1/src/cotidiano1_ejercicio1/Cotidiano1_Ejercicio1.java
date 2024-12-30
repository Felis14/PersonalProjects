package cotidiano1_ejercicio1;

import javax.swing.JOptionPane;

public class Cotidiano1_Ejercicio1
{
    public static void main(String[] args)
    {
        int num1, num2, num3, max=0, min=0;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog(
        "Digite el primer número: "));
        
        num2 = Integer.parseInt(JOptionPane.showInputDialog(
        "Digite el segundo número: "));
        
        num3 = Integer.parseInt(JOptionPane.showInputDialog(
        "Digite el tercer número: "));
        
        if ((num1>num2)&&(num1>num3))
        {
            max = num1;
        }
        else
        {
            if ((num2>num1)&&(num2>num3))
            {
                max = num2;
            }
            else
            {
                if ((num3>num1)&&(num3>2))
                {
                    max = num3;
                }
            }
        }
        
        if ((num1<num2)&&(num1<num3))
        {
            min = num1;
        }
        else
        {
            if ((num2<num1)&&(num2<num3))
            {
                min = num2;
            }
            else
            {
                if ((num3<num1)&&(num3<num2))
                {
                    min = num3;
                }
            }
        }
        
        if (max==0)
        {
            JOptionPane.showMessageDialog(null,
            "Todos los números son iguales.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null,
            "Los números digitados son: "+num1+", "+num2+", "+num3+
            "\n\nEl número mayor es: "+max+"\nEl número menor es: "+min, "Resultados", JOptionPane.INFORMATION_MESSAGE);
        } 
    }
}
