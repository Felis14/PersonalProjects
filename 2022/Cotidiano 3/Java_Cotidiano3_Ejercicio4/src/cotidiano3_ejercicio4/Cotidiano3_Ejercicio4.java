/*Desarrolle un programa que lee en un procedimiento, 2 números enteros y un número de operación
que corresponde al operador que se va a procesar con los números leídos, a saber: 1=Sumar, 2=Restar,
3=Producto, 4=División, 5=Residuo, 6=Promedio, 7=Porcentaje, 8=Mayor, 9=Menor, 10=Sumar
Cuadrados, 11=Sumar Cubos.
Para cada una de las operaciones debe desarrollar una función, las cuales se van a llamar o invocar
según la operación a procesar, las cuales se detallan a continuación:
• La función Sumar recibe 2 números como parámetro y devuelve el resultado de sumar el número 1
más el número 2.
• La función Restar recibe 2 números como parámetro y devuelve el resultado de restar el número 1
menos el número 2.
• La función Producto recibe 2 números como parámetro y devuelve el resultado de multiplicar el
número 1 por el número 2.
• La función División recibe 2 números como parámetro y devuelve el resultado de dividir el número
mayor entre el número menor.
• La función Residuo recibe 2 números como parámetro y devuelve el resultado de dividir y retornar
el residuo de dividir el número mayor entre el número menor.
• La función Promedio recibe 2 números como parámetro y devuelve el resultado el promedio de los
2 números que recibió como parámetro.
• La función Porcentaje recibe 2 números como parámetro y devuelve el resultado de calcular el
porcentaje que indica el segundo número al primer número, por ejemplo, si en el primer número se
indica 50 y en el segundo número se indica 10, entonces quiere decir que se va a calcular el 10% a
50, o sea el resultado sería 5.
• La función Mayor recibe 2 números como parámetro y devuelve el número mayor de los 2 números
que recibió como parámetro.
• La función Menor recibe 2 números como parámetro y devuelve el número menor de los 2 números
que recibió como parámetro.
• La función Sumar Cuadrados recibe 2 números como parámetro y devuelve la suma del cuadrado
del primer número más el cuadrado del segundo número.
La función Sumar Cubos recibe 2 números como parámetro y devuelve la suma del cubo del primer
número más el cubo del segundo número.*/
package cotidiano3_ejercicio4;

import javax.swing.JOptionPane;

public class Cotidiano3_Ejercicio4
{
    static int num1, num2, numcopy, alwaystrue=1, repeat=1, overwrite=1, pag=2, currentmenu;
    
    static Object[] pag1 = {"Sobreescribir números" , "Intercambiar números", "Salir", "Sig. Pag."};
    static Object[] pag2 = {"Ant. Pag.", "Suma", "Resta", "Multiplicación", "División", "Sig. Pag."};
    static Object[] pag3 = {"Ant. Pag.", "Residuo", "Promedio", "Porcentaje", "Sig. Pag."};
    static Object[] pag4 = {"Ant. Pag.", "Num. Mayor", "Num. Menor", "Sig. Pag."};
    static Object[] pag5 = {"Ant. Pag.", "Sumar cuadrados", "Sumar cubos"};
    
    public static void main(String[] args)
    {
        do {
            if (overwrite == 1)
            {
                leernums();
                overwrite = 0;
            }
            menu();
        } while (alwaystrue == 1);
    }
    
    static void leernums()
    {
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer número"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo número"));
    }
    
    static void menu()
    {
        if (pag == 1)
        {
        currentmenu = JOptionPane.showOptionDialog(null, "Número 1: "+num1+"\nNúmero 2: "+num2
        +"\n\nElija una opción", "Página 1     Parámetros", JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE, null, pag1, pag1[0]);
                
        menupag1();
        }
        if (pag == 2)
        {
            currentmenu = JOptionPane.showOptionDialog(null, "Número 1: "+num1+"\nNúmero 2: "+num2
            +"\n\nElija una opción", "Página 2     Operaciones básicas", JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE, null, pag2, pag2[0]);
                
            menupag2();
        }
        if (pag == 3)
        {
            currentmenu = JOptionPane.showOptionDialog(null, "Número 1: "+num1+"\nNúmero 2: "+num2
            +"\n\nElija una opción", "Página 3     Estadísticas", JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE, null, pag3, pag3[0]);
                
            menupag3();
        }
        if (pag == 4)
        {
            currentmenu = JOptionPane.showOptionDialog(null, "Número 1: "+num1+"\nNúmero 2: "+num2
            +"\n\nElija una opción", "Página 4     Calculos", JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE, null, pag4, pag4[0]);
                
            menupag4();
        }
        if (pag == 5)
        {
            currentmenu = JOptionPane.showOptionDialog(null, "Número 1: "+num1+"\nNúmero 2: "+num2
            +"\n\nElija una opción", "Página 5     Suma de Potencias", JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE, null, pag5, pag5[0]);
                
            menupag5();
        }
    }
    
    static void menupag1()
    {
        switch(currentmenu)
        {
            case 0:
            {
                overwrite = 1;
            } break;
            case 1:
            {
                numcopy = num1;
                num1 = num2;
                num2 = numcopy;
            } break;
            case 2:
            {
                JOptionPane.showMessageDialog(null, "Gracias por usar este programa.");
                System.exit(0);
            } break;
            case 3:
            {
                pag+=1;
            } break;
        }
    }
    
    static void menupag2() //"Ant. Pag.", "Suma", "Resta", "Multiplicación", "División", "Sig. Pag."
    {
        switch(currentmenu)
        {
            case 0:
            {
                pag-=1;
            } break;
            case 1:
            {
                JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + suma(num1, num2));
            } break;
            case 2:
            {
                JOptionPane.showMessageDialog(null, num1 + " - " + num2 + " = " + resta(num1, num2));
            } break;
            case 3:
            {
                JOptionPane.showMessageDialog(null, num1 + " * " + num2 + " = " + mult(num1, num2));
            } break;
            case 4:
            {
                if (num2 != 0)
                    JOptionPane.showMessageDialog(null, num1 + " / " + num2 + " = " + divi(num1, num2));
                else
                    JOptionPane.showMessageDialog(null, "No se puede dividir entre 0");
            } break;
            case 5:
            {
                pag+=1;
            } break;
        }
    }
    
    static void menupag3() // "Ant. Pag.", "Residuo", "Promedio", "Porcentaje", "Sig. Pag."
    {
        switch(currentmenu)
        {
            case 0:
            {
                pag-=1;
            } break;
            case 1:
            {
                JOptionPane.showMessageDialog(null, "El residuo de "+num1+ " / " +num2+" es "+
                residuo(num1, num2));
            } break;
            case 2:
            {
                JOptionPane.showMessageDialog(null, "El promedio entre "+num1+ " y " +num2+" es "+
                prom(num1, num2));
            } break;
            case 3:
            {
                JOptionPane.showMessageDialog(null, "El "+num1+"% de "+num2+"% es "+
                percent(num1, num2));
            } break;
            case 4:
            {
                pag+=1;
            } break;
        }
    }
    
    static void menupag4() //"Ant. Pag.", "Num. Mayor", "Num. Menor", "Sig. Pag."
    {
        switch(currentmenu)
        {
            case 0:
            {
                pag-=1;
            } break;
            case 1:
            {
                JOptionPane.showMessageDialog(null, "El número mayor entre "+num1+" y "+num2+" es "+
                max(num1,num2));
            } break;
            case 2:
            {
                JOptionPane.showMessageDialog(null, "El número menor entre "+num1+" y "+num2+" es "+
                min(num1,num2));
            } break;
            case 3:
            {
                pag+=1;
            } break;
        }
    }
    
    static void menupag5() //"Ant. Pag.", "Sumar cuadrados", "Sumar cubos"
    {
        switch(currentmenu)
        {
            case 0:
            {
                pag-=1;
            } break;
            case 1:
            {
                JOptionPane.showMessageDialog(null, num1+"² + "+num2+"² = "+sumacuadra(num1, num2));
            } break;
            case 2:
            {
                JOptionPane.showMessageDialog(null, num1+"³ + "+num2+"³ = "+sumacubos(num1, num2));
            } break;
        }
    }
    
    static int suma(int n1, int n2)
    {
        return n1 + n2;
    }
    
    static int resta(int n1, int n2)
    {
        return n1 - n2;
    }
    
    static int mult(int n1, int n2)
    {
        return n1 * n2;
    }
    
    static float divi(int n1, int n2)
    {
        return n1 /n2;
    }
    
    static int residuo(int n1, int n2)
    {
        return n1 % n2;
    }
    
    static float prom(int n1, int n2)
    {
        return (n1+n2)/2;
    }
    
    static float percent(int n1, int n2)
    {
        return n1*n2/100;
    }
    
    static int max(int n1, int n2)
    {
        if (n1 > n2)
            return n1;
        else
            return n2;
    }
    
    static int min(int n1, int n2)
    {
        if (n1 < n2)
            return n1;
        else
            return n2;
    }
    
    static int sumacuadra(int n1, int n2)
    {
        return (n1*n1)+(n2*n2); 
    }
    
    static int sumacubos(int n1, int n2)
    {
        return (n1*n1*n1)+(n2*n2*n2);
    }
}
