/*Desarrolle un programa en Java que procesa las notas de los estudiantes en una materia X
cualesquiera mientras el usuario lo desee. Para cada estudiante, el programa debe leer la nota y el
grupo en el que está el estudiante que puede ser 1, 2 ó 3.
Al finalizar el procesamiento de todos los estudiantes, el programa tiene que calcular y reportar el
promedio de notas de todos los estudiantes, así también debe calcular y reportar el promedio de
notas de los estudiantes del grupo 1, promedio de notas de los estudiantes del grupo 2 y el promedio
de notas de los estudiantes del grupo 3.*/
package cotidiano2_ejercicio4;

import javax.swing.JOptionPane;

public class Cotidiano2_Ejercicio4
{
   public static void main(String[] args)
   {
      int nota, conf=1, ciclo=1;
      int cantg1=0, cantg2=0, cantg3=0, cantot=0;
      int notasg1=0, notasg2=0, notasg3=0, notastot;
      float promg1=0, promg2=0, promg3=0, promtot=0;
      
      do {
         conf = 1;
         do {
            Object[] options = {"Grupo 1","Grupo 2","Grupo 3","Terminar"};
               String grup = String.valueOf(JOptionPane.showOptionDialog(null, "Seleccione el grupo: ",
               "Indique",JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE,null,options, options[0]));

            switch(grup)
            {
               case "0":
               {
                  do {
                     nota = Integer.parseInt(JOptionPane.showInputDialog(
                     "Digite la nota del estudiante", "100"));

                     if ((nota<1)||(nota>100))
                     {
                        JOptionPane.showMessageDialog(null,
                        "La nota no puede ser "+nota, "Error", JOptionPane.ERROR_MESSAGE);
                     }
                  } while ((nota<1)||(nota>100));

                  notasg1 += nota;
                  cantg1++;
               } break;
               case "1":
               {
                  do {
                     nota = Integer.parseInt(JOptionPane.showInputDialog(
                     "Digite la nota del estudiante", "100"));

                     if ((nota<1)||(nota>100))
                     {
                        JOptionPane.showMessageDialog(null,
                        "La nota no puede ser "+nota, "Error", JOptionPane.ERROR_MESSAGE);
                     }
                  } while ((nota<1)||(nota>100));

                  notasg2 += nota;
                  cantg2++;
               } break;
               case "2":
               {
                  do {
                     nota = Integer.parseInt(JOptionPane.showInputDialog(
                     "Digite la nota del estudiante", "100"));

                     if ((nota<1)||(nota>100))
                     {
                        JOptionPane.showMessageDialog(null,
                        "La nota no puede ser "+nota, "Error", JOptionPane.ERROR_MESSAGE);
                     }
                  } while ((nota<1)||(nota>100));

                  notasg3 += nota;
                  cantg3++;
               } break;
               case "3":
               {
                  conf = 0;
               } break; 
            }
            //Fin Switch

         } while (conf == 1);
         //Fin While

         if (cantg1 > 0)
         {
            promg1 = notasg1 / cantg1;
         }
         if (cantg2 > 0)
         {
            promg2 = notasg2 / cantg2;
         }
         if (cantg3 > 0)
         {
            promg3 = notasg3 / cantg3;
         }

         notastot = (notasg1 + notasg2 + notasg3);
         cantot = (cantg1 + cantg2 + cantg3);

         if (cantot>0)
         {
            promtot = notastot / cantot;
         }

         JOptionPane.showMessageDialog(null,
         "Cantidad de notas del grupo 1: "+cantg1+
         "\nPromedio de notas del grupo 1: "+promg1+
         "\n\nCantidad de notas del grupo 2: "+cantg2+
         "\nPromedio de notas del grupo 2: "+promg2+
         "\n\nCantidad de notas del grupo 3: "+cantg3+
         "\nPromedio de notas del grupo 3: "+promg3+
         "\n\nCantidad total de notas: "+cantot+
         "\nPromedio total de notas: "+promtot, "Resultados", JOptionPane.PLAIN_MESSAGE);

         Object[] options = {"Sí (Conservar valores)","Sí (Borrar valores)","No (Finalizar)"};
            int cycle = JOptionPane.showOptionDialog(null, "¿Quiere volver a repetir el programa?",
            "Confirmar",JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,null,options, options[0]);

         switch(cycle)
         {
            case 0:
            {
               ciclo = 1;
            } break;
            case 1:
            {
               //Borra los valores
               cantg1=0; cantg2=0; cantg3=0; cantot=0;
               notasg1=0; notasg2=0; notasg3=0; notastot=0;
               promg1=0; promg2=0; promg3=0; promtot=0;
               ciclo = 1;
            } break;
            case 2:
            {
               ciclo = 0;
            } break;
         }
         //Fin Switch

      } while (ciclo == 1);
   }
}