/*Realice un programa en Java que lee dos números enteros correspondiente a la base y al exponente
de una potencia. La lectura de los números lo debe hacer en un procedimiento que se denomine
lectura datos.
En el programa desarrolle una función de tipo entero que recibe 2 números enteros como parámetro
que representan la base y el exponente de la potencia. La función debe calcular y retornar el
resultado de elevar la base al exponente, considerando lo siguiente:
Toda base elevada al exponente 0 el resultado es 1.
Toda base elevada al exponente 1 el resultado es la misma base.
Toda base elevada al exponente positivo el resultado es la multiplicación de la base tantas veces
indica el exponente.
Toda base elevada a un exponente negativo el resultado es 1 / base↑expo*/
package cotidiano3_ejercicio2;

import javax.swing.JOptionPane;

public class Cotidiano3_Ejercicio2
{
    static int base, expo, seg=1;
    public static void main(String[] args)
    {
        do {
            leer();
            JOptionPane.showMessageDialog(null,
            "Resultado de la potencia:"+
            "\n\nEl resultado del número "+base+" potenciado a "+expo+" es "+potencia(base, expo),
            "Resultado", JOptionPane.PLAIN_MESSAGE);
            
            int cont = JOptionPane.showConfirmDialog(null, "¿Calcular otro número?", "Confirmar"
            , JOptionPane.YES_NO_OPTION);
            
            if (cont == JOptionPane.NO_OPTION)
            {
                JOptionPane.showMessageDialog(null, "Gracias por usar este programa",
                "¡Hasta Luego!", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            }
        } while (seg == 1);
    }
    
    static void leer()
    {
        base = Integer.parseInt(JOptionPane.showInputDialog("Digite la base de la potencia"));
        expo = Integer.parseInt(JOptionPane.showInputDialog("Digite el exponente de la potencia"));
    }
    
    static float potencia(int b, int e)
    {
        float res=1;
        if (e == 0)
            return 0;
        if (e == 1)
            return base;
        if (e > 0)
        {
            for (int i=1; i<=e; i++)
            {
                res *= b;
            }
            return res;
        }
        else
        {
            e-=e*2;
            for (int i=1; i<=e; i++)
            {
                res *= b;
            }
            res = 1 / res;
            return res;
        }
    }
}
