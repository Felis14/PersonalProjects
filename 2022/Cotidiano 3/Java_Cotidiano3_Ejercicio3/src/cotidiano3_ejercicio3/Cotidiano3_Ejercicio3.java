/*Desarrolle un programa en Java que lee y procesa números enteros. La lectura de los números lo
debe hacer en un procedimiento denominado lecturadatos() y debe leer N números.

En el programa desarrolle una función de tipo entero que recibe un número entero como parámetro y
devuelve o retorna 1, si el número que recibió la función como parámetro es primo y devuelve 2 si
el número que recibió la función como parámetro no es primo.

En el programa desarrolle una función de tipo entero que recibe un número entero como parámetro y
devuelve o retorna 0, si el número que recibió la función como parámetro es par y devuelve 1 si el
número que recibió la función como parámetro es impar.

En el programa desarrolle una función de tipo entero que recibe un número entero como parámetro y
devuelve o retorna él factorial del número que recibe como parámetro. Teniendo, por ejemplo, que él
factorial del número 0 o 1 es 1 y el factorial de 3! = 1 x 2 x 3 = 6.

Cada vez que se lee y procesa cada número, el programa debe reportar de acuerdo a los datos que
devuelven o retornan las funciones, en un procedimiento reportardatos que luego debe llamar en el
main(), si el número procesado es PAR, IMPAR, PRIMO, NO PRIMO y el resultado del factorial de lo que
retorna la función que calcula el factorial, así también debe reportar el promedio de números pares,
promedio de números impares, promedio de números primos y promedio de números no primos procesados.*/
package cotidiano3_ejercicio3;

import javax.swing.JOptionPane;

public class Cotidiano3_Ejercicio3
{
    static String NumsDisp="";
    static int numcant, num, numlist[], cont;
    static int primos=0, noprimos=0, pares=0, impares=0;
    static int sumprimos=0, sumnoprimos=0, sumpares=0, sumimpares=0;
    static float promprimos=0, promnoprimos=0, prompares=0, promimpares=0;
    
    public static void main(String[] args)
    {
        leercant();
        for (cont = 0; cont<numcant; cont++)
        {
            leernum();
            numlist[cont] = num;
            reportprim();
            reportpar();
            reportfact();
        }
        listanums();
        promedios();
        finalreport();
    }
    
    static void leercant()
    {
        numcant = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de números a procesar"));
        numlist = new int [numcant];
    }
    
    static void leernum()
    {
        num = Integer.parseInt(JOptionPane.showInputDialog("Números a procesar: "+numcant+
        "\n# de lectura: "+(cont+1)+"\nDigite un número"));
    }
    
    static int primonoprimo(int n1)
    {
        int res0=0;
        for (int i=1; i<=n1; i++)
        {
            if (n1 % i == 0)
            {
                res0++;
            }
        }
        if (res0 ==2)
            return 1;
        else
            return 2;
    }
    
    static int parimpar(int n1)
    {
        if (n1 % 2 == 0)
            return 1;
        else
            return 2;
    }
    
    static int factorial(int n1)
    {
        int result = 1;
        for (int i=1; i<=n1; i++)
        {
            result *= i;
        }
        return result;
    }
    
    static void reportprim()
    {
        if (primonoprimo(num) == 1)
        {
            JOptionPane.showMessageDialog(null, "El número "+num+" es primo.", null, JOptionPane.PLAIN_MESSAGE);
            sumprimos += num;
            primos += 1;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El número "+num+" no es primo.", null, JOptionPane.PLAIN_MESSAGE);
            sumnoprimos += num;
            noprimos += 1;
        }
    }
    
    static void reportpar()
    {
        if (parimpar(num) == 1)
        {
            JOptionPane.showMessageDialog(null, "El número "+num+" es par.", null, JOptionPane.PLAIN_MESSAGE);
            sumpares += num;
            pares += 1;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El número "+num+" es impar.", null, JOptionPane.PLAIN_MESSAGE);
            sumimpares += num;
            impares += 1;
        }
    }
    
    static void reportfact()
    {
        JOptionPane.showMessageDialog(null, "El factorial de "+num+" es "+factorial(num));
    }
    
    static void listanums()
    {
        NumsDisp="Lista de números: \n";
        for (int i=0; i<numcant; i++)
        {
            if (primonoprimo(numlist[i]) == 1)
                NumsDisp += numlist[i]+"   Primo";
            else
                NumsDisp += numlist[i]+"   No primo";
            if (parimpar(numlist[i]) == 1)
                NumsDisp += ",      Par";
            else
                NumsDisp += ",   Impar";
            NumsDisp += ",   Factorial: "+factorial(numlist[i])+"\n";
        }
    }
    
    static void promedios()
    {
        if (primos != 0)
            promprimos = sumprimos / primos;
        if (noprimos != 0)
            promnoprimos = sumnoprimos / noprimos;
        if (pares != 0)
            prompares = sumpares / pares;
        if (impares != 0)
            promimpares = sumimpares / impares;
    }
    
    static void finalreport()
    {
        JOptionPane.showMessageDialog(null,
        NumsDisp+"\nContadores:\n"+"Primos = "+primos+"\nNo primos = "+noprimos+"\nPares = "+pares+"\nImpares = "+impares+
        "\n\nTotales:\n"+"Primos = "+sumprimos+"\nNo primos = "+sumnoprimos+"\nPares = "+sumpares+"\nImpares = "+sumimpares+
        "\n\nPromedios:\n"+"Primos = "+promprimos+"\nNo primos = "+promnoprimos+"\nPares = "+prompares+"\nImpares = "+promimpares);
    }
}