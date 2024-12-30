/*Desarrolle un programa en Java que lee y procesa N salarios de los empleados que trabajan en una
empresa X cualesquiera. Para cada empleado, el programa debe leer el salario y el género del
empleado (1=Masculino, 2=Femenino) y al finalizar el procesamiento de los N empleados, el programa
tiene que calcular y reportar el total de todos los salarios procesados, el total de salarios de empleados
Masculinos, el total de salarios de empleados Femeninos y el promedio de todos los salarios
procesados.*/
package cotidiano2_ejercicio3;

import javax.swing.JOptionPane;

public class Cotidiano2_Ejercicio3
{
   public static void main(String[] args)
   {
      int sal, salcycle=1, cycletop;
      int contsalmas=0, contsalfem=0, salmasc=0, salfem=0, contot, saltot;
      float promsalmas=0, promsalfem=0, promtot=0;
      
      //Bucle general
      do
      {
         //Selección e introduccion de género y salario
         do
         {
            Object[] options = {"Masculino","Femenino", "Terminar"};
               int gen = JOptionPane.showOptionDialog(null, "Seleccione el género",
               "Indique",JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE,null,options, options[0]);

            switch(gen)
            {
               case 0:
               {
                  do
                  {
                     sal = Integer.parseInt(JOptionPane.showInputDialog(
                     "Digite el salario: ", "10000"));

                     if (sal<10000)
                     {
                        JOptionPane.showMessageDialog(null,
                        "El salario mínimo es 10000", "Error", JOptionPane.ERROR_MESSAGE);
                     }
                     else
                     {
                        contsalmas++;
                        salmasc += sal;

                        JOptionPane.showMessageDialog(null,
                        "Salario procesado.", "Proceso", JOptionPane.PLAIN_MESSAGE);
                     }
                  } while (sal<10000);

                  salcycle = 1;
               } break;
               case 1:
               {
                  do
                  {
                     sal = Integer.parseInt(JOptionPane.showInputDialog(
                     "Digite el salario: ", "10000"));

                     if (sal<10000)
                     {
                        JOptionPane.showMessageDialog(null,
                        "El salario mínimo es 10000", "Error", JOptionPane.ERROR_MESSAGE);
                     }
                     else
                     {
                        contsalfem++;
                        salfem += sal;

                        JOptionPane.showMessageDialog(null,
                        "Salario procesado.", "Proceso", JOptionPane.PLAIN_MESSAGE);
                     }

                     salcycle = 1;
                  } while (sal<10000);

               } break;
               case 2:
               {

                  int confT = JOptionPane.showConfirmDialog(null,
                  "¿Seguro que quiere dejar de ingresar salarios?", "Confirmar", JOptionPane.YES_NO_OPTION);

                  if (confT == JOptionPane.YES_OPTION)
                  {
                     salcycle = 0;
                  }
                  else
                     salcycle = 1;
               } break;
            }
         } while (salcycle == 1);
         //Fin de selección e introducción de generos y salarios
      
      //Calculos y mensajes
      if (contsalmas > 0)
      {
         promsalmas = salmasc / contsalmas;
      }
      if (contsalfem > 0)
      {
         promsalfem = salfem / contsalfem;
      }
      
      saltot = salmasc + salfem;
      contot = contsalmas + contsalfem;
      
      if (contot > 0)
      promtot = saltot / contot;
      
      JOptionPane.showMessageDialog(null,
      "Cantidad de salarios masculinos: "+contsalmas+
      "\nTotal de salarios masculinos: "+salmasc+
      "\nPromedio de salarios masculinos: "+promsalmas+
      "\n\nCantidad de salarios femeninos: "+contsalfem+
      "\nTotal de salarios femeninos: "+salfem+
      "\nPromedio de salarios femeninos: "+promsalfem+
      "\n\nCantidad total de salarios: "+contot+
      "\nTotal de salarios: "+saltot+
      "\nPromedio total: "+promtot, "Resultados", JOptionPane.PLAIN_MESSAGE);
      
      int topcycle = JOptionPane.showConfirmDialog(null,
      "¿Quiere seguir ingresando salarios?", "Confirmar", JOptionPane.YES_NO_OPTION);
      
      if (topcycle == JOptionPane.YES_OPTION)
      {
         cycletop = 1;
      }
      else
      {
         cycletop = 0;
      }
      
      } while (cycletop == 1);
      //Fin bucle general
      
      System.exit(0);
   }
}