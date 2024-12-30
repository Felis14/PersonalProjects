/*Desarrolle un programa en Java que lee un número entero. El programa debe determinar y evaluar
si el número leído es un número primo o no es un número primo y para ello debe considerar el uso de
alguno de los tipos de ciclos en Java.*/
package cotidiano2_ejercicio2;

import javax.swing.JOptionPane;

public class Cotidiano2_Ejercicio2 
{
   public static void main(String[] args)
   {
      //Define las variables, num es para lo que indica el usuario a verificar
      //Res0 es para contar las veces que se hace una división SIN RESIDUO (si solo lo hace 2 veces, es primo)
      //Cycle es para el ciclo general
      int num, res0, Cycle;
      
      //Ciclo general (Se controla con la variable cycle)
      do
      {
         //Res0 se reinicia cada que el bucle inicia de nuevo
         res0 = 0;
         
         //El usuario digita el número a verificar
         num = Integer.parseInt(JOptionPane.showInputDialog(
         "Digite el número a verificar si es primo o no: "));
         
         //Inicia un contador en 1 que se aumenta en uno cada vez que se repite, hasta que el contador
         //sea menor o igual al número digitado
         for (int i=1; i<= num; i++)
         {
            //Si el numero es divisible por el número al que va el contador (residuo igual a 0) el contador
            //de veces que dividió sin residuo se aumenta
            if (num % i == 0)
               res0++;
         }
         //Termina el ciclo cuando el contador es igual al numero digitado
         
         //Si el contador de divisiones terminadas en residuo cero es 2, es primo, muestra el mensaje
         if (res0 == 2)
         {
            JOptionPane.showMessageDialog(null,
            "El número "+num+" es primo.");
         }
         else //Si no, dice que no es primo
         {
            JOptionPane.showMessageDialog(null,
            "El número "+num+" no es primo.");
         }
         
         //Pregunta si quiere volver a verificar otro numero y controla el ciclo general
         int Seg = JOptionPane.showConfirmDialog(null,
         "¿Quiere volver a verificar otro número?", "Confirmar", JOptionPane.YES_NO_OPTION);
         
         //Si es sí, el ciclo es 1; continua
         if (Seg == JOptionPane.YES_OPTION)
            Cycle = 1;
         else //Si no, se detiene
            Cycle = 0;
      } while (Cycle == 1);
      System.exit(0);
   }
}