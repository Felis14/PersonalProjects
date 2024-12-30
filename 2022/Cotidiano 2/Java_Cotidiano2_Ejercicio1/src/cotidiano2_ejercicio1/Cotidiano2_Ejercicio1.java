/*Realice un programa en Java (utilizando alguno de los tipos de ciclos que maneja Java) que lee un
número entero y una vez leído el número, el programa debe calcular y reportar el factorial del número
leído.
Considere el siguiente ejemplo para saber en qué consiste él factorial de un número: Factorial de 3! =
1 x 2 x 3 = 6
Al desarrollar el ejercicio, es importante considerar que el factorial del número 0 y el factorial del
número 1 el resultado es 1.
Modifique el programa de tal manera que se procesen números mientras el usuario lo desee.*/
package cotidiano2_ejercicio1;

import javax.swing.JOptionPane;

public class Cotidiano2_Ejercicio1 
{
   public static void main(String[] args)
   {
      //Variable num guarda el numero a calcular el factorial, cont es para controlar el ciclo general
      int num, Cont;
      float sum; //sum inicia en 1, que es por lo que inicia el factorial
      
      do { //Inicial el ciclo
         sum = 1; //Cuando el ciclo comienza la variable, sum se reinicia
         
         //El usuario digita el numero a calcular el factorial
         num = Integer.parseInt(JOptionPane.showInputDialog(
         "Número a calcular el factorial: "));
         //Si numero es 1 o 0: da a sum 1 porque el factorial de 1 y 0 es = 1
         if ((num == 1)||(num == 0))
         {
            sum = 1;
         }
         else //Si no, el bucle repite una multiplicacion del contador que incrementa * la variable sum
         {
            for (int i=1; i<=num;i++)
            {
               sum*=i;
            }
         }     
         //Muestra el resultado del factorial
         JOptionPane.showMessageDialog(null,
         "El factorial de "+num+" es: "+sum);
         //Continuar o no segun el usuario
         int Seg = JOptionPane.showConfirmDialog(null,
         "¿Quiere calcular el factorial de otro número?", "Confirmar", JOptionPane.YES_NO_OPTION);
         //Si el usuario indica continuar, cont es = 1, si no, cont = 0
         if (Seg == JOptionPane.YES_OPTION)
            Cont = 1;
         else
            Cont = 0;
      //Ciclo general que se define por la selección anterior
      } while (Cont == 1);
      //Fin del programa
      System.exit(0);
   }
}