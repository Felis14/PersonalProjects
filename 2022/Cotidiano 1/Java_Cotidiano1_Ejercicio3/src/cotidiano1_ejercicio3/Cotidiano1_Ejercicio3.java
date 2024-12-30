package cotidiano1_ejercicio3;

import javax.swing.JOptionPane;

public class Cotidiano1_Ejercicio3
{
    public static void main(String[] args)
    {
        int num, sumP=0, sumt, sumI=0, contP=0, contI=0; float promP=0, promI=0, promtot=0;
        
        for (int i=1;i<=10;i++)
        {
            //Dentro del ciclo leemos la nota de cada estudiante
            num = Integer.parseInt(JOptionPane.showInputDialog(
            "Digite un número: "));
            
            if (num % 2 == 0)
            {
                JOptionPane.showMessageDialog(null,
                "El número es par.", "Result", JOptionPane.INFORMATION_MESSAGE);
                sumP += num; contP++;
            }
            else
            {
                JOptionPane.showMessageDialog(null,
                "El número es impar.", "Result", JOptionPane.INFORMATION_MESSAGE);
                sumI += num; contI++;
            }
            
        //â†“â†“â†“ Termina el ciclo for
        }
        //Evita el divido entre cero
        if (contP!=0)
        {
            promP = sumP / contP;
        }
        if (contI!=0)
        {
            promI = sumI / contI;
        }
        sumt = sumI + sumP; promtot = sumt / 10;
        JOptionPane.showMessageDialog(null,
            "Cantidad de números pares: "+contP+
            "\n\nEl promedio de los números pares es: "+promP+
            "\n\n\n\nCantidad de números impares: "+contI+
            "\n\nEl promedio de los números impares es: "+promI+
            "\n\nEl promedio de todos los números es: "+promtot);
        
        System.exit(0);
    }
}
