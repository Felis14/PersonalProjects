/*Realice un programa que lea 3 números, la lectura de números debe hacerlo en un procedimiento
En el programa, debe desarrollar una función de tipo entero que recibe como parámetro 3 números
enteros que representan a los lados de un triangulo y la funcion retorna o devuelve lo siguiente
1 si los 3 lados son iguales
2 si los 3 son diferentes
3 si al menos dos de sus lados son iguales
El programa debe desarrollar una función de tipo entero que recibe 3 números enteros como parametro
y devuelve el promedio de los 3 numeros que recibio como parametro
Una vez desarrolladas las funciones de llamar o invocar las funciones y de acuerdo a lo que retorna
o devuelve la función debe reportar en un procedimiento o en el main[] el tipo de triangulo
correspondiente, es decir si la función devuelve 1 el triánglo es equilátero, 2 es escaleno y 3 es
isóceles y en el caso de la otra funcion debe reportar el promedio de los 3 números.*/
package cotidiano3_ejercicio1;

import javax.swing.JOptionPane;

public class Cotidiano3_Ejercicio1
{
    static int n1, n2, n3, sum, cont;
    static float prom;
    public static void main(String[] args)
    {
        do {
            leer();
            reportri();
            bucle();
            desp();
            
        } while (cont == 1);
    }
    
    static void leer()
    {
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite la medida del lado: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite la medida del segundo lado: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite la medida de la base: "));
        sum = n1 + n2 + n3;
    }
    
    static int calc(int lad, int lad2, int base)
    {
        if ((lad==lad2)&&(lad==base))
        {
            return 1;
        }
        else
            if ((lad!=lad2)&&(lad!=base)&&(base!=lad2))
                return 2;
            else
                return 3;
    }
    
    static void reportri()
    {
        if (calc(n1, n2, n3)==1)
            JOptionPane.showMessageDialog(null,
            "El triángulo es equilatero.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        else
            if (calc(n1, n2, n3)==2)
                JOptionPane.showMessageDialog(null,
                "El triángulo es escaleno.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
            else
                JOptionPane.showMessageDialog(null,
                "El triángulo es isóceles.", "Resultados", JOptionPane.INFORMATION_MESSAGE);
    }
    
    static void reportprom()
    {
        prom = sum / 3;
        JOptionPane.showMessageDialog(null,
        "El promedio de los 3 lados es: "+prom, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
    
    static void bucle()
    {
        int seg = JOptionPane.showConfirmDialog(null,
        "¿Desea repetirlo?", "Confirmar", JOptionPane.YES_NO_OPTION);
        
        if (seg == JOptionPane.YES_OPTION)
            cont = 1;
        else
            cont = 0;
    }
    
    static void desp()
    {
        if (cont == 0)
            JOptionPane.showMessageDialog(null,
            "¡Gracias por usar este programa!", "¡Hasta luego!", JOptionPane.PLAIN_MESSAGE);
    }
}
