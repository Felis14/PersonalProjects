/*Desarrolle un programa que procesa notas de estudiantes mientras el usuario lo desee.
En el programa debe desarrollar los procedimientos que se detallan a continuación.
-- La lectura de las notas lo debe hacer en un procedimiento donde le va preguntando al usuario los
datos a procesar y para cada estudiante que se procesa, debe leer: la identificación del estudiante
de tipo entero, la nota o promedio final de tipo float y el nivel que cursa el estudiante a saber
(1=Décimo, 2=Undécimo, 3=Duodécimo). Además, que en el momento en que el usuario va a
digitar los datos de un estudiante, el programa indique el número del estudiante que se está
procesando en ese momento y para cada nota que se lee y procesa, en el procedimiento debe
reportar la condición del estudiante de acuerdo:
-- Si la nota es mayor o igual a 70 la condición es Aprobado.
-- Si la nota es mayor o igual a 50 y menor que 70 la condición es Aplazado.
-- Si la nota es menor que 50 la condición es Reprobado.
-- Desarrolle un procedimiento donde se calcule y reporte: el promedio de notas de todos los
estudiantes, promedio de notas del nivel de Décimo, promedio de notas del nivel de Undécimo y
promedio de notas del nivel de Duodécimo.
-- Desarrolle un procedimiento donde se calcule y reporte: el promedio de notas aprobadas,
promedio de notas aplazadas, promedio de notas reprobadas.
-- Desarrolle un procedimiento que se llame Menú Principal y debe llamarlo en el void main() del
programa, el cual tiene las siguientes opciones:
Menú Principal
1. Lectura de Datos
2. Reporta Promedios por Nivel
3. Reportar Promedios de Aprobados, Aplazados y Reprobados
4. Salir */
package cotidiano4_ejercicio1;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class Cotidiano4_Ejercicio1
{
    static float nota;
    static int cedula, s1ced, grado, AlTr = 1;
    static String cedulaStr, listdisp;
    static float listnot10[] = new float [0], listnot11[] = new float [0],
    listnot12[] = new float [0], listnotcopy[];
    static int listced10[] = new int[0], listced11[] = new int[0],
    listced12[] = new int[0], listcedcopy[];
    static int cont10=0, cont11=0, cont12=0, contapr, contapl, contrep, pag=1;
    static int notasapr, notasapl, notasrep, notas10, notas11, notas12;
    static float proms10, proms11, proms12, promapr, promapl, promrep;
    
    public static void main(String[] args)
    {
        do {
            menu();
        } while (AlTr == 1);
    }
    
    static void menu()
    {
        if (pag == 1)
        {
            Object[] menu = {"Insertar Nota 10°", "Insertar Nota 11°", "Insertar Nota 12°", "Sig. Pág."};
            int select = JOptionPane.showOptionDialog(null, "Seleccione una opción",
            "Pag 1. - Insertar notas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
            null, menu, menu[0]);
            
            switch(select)
            {
                case 0:
                {
                    grado = 10;
                    datos();
                } break;
                case 1:
                {
                    grado = 11;
                    datos();
                } break;
                case 2:
                {
                    grado = 12;
                    datos();
                } break;
                case 3:
                {
                    pag++;
                } break;
            }
        }
        if (pag == 2)
        {
            Object[] menu = {"Ant. Pág.", "Promedio notas 10°", "Promedio notas 11°", "Promedio notas 12°", "Sig. Pág."};
            int select = JOptionPane.showOptionDialog(null, "Seleccione una opción",
            "Pag 2. - Promedios por nivel", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
            null, menu, menu[0]);
            
            switch(select)
            {
                case 0:
                {
                    pag--;
                } break;
                case 1:
                {
                    lista10();
                } break;
                case 2:
                {
                    lista11();
                } break;
                case 3:
                {
                    lista12();
                } break;
                case 4:
                {
                    pag++;
                } break;
            }
        }
        if (pag == 3)
        {
            Object[] menu = {"Ant. Pág.", "Promedio aprobadas", "Promedio aplazadas", "Promedio reprobadas", "Salir"};
            int select = JOptionPane.showOptionDialog(null, "Seleccione una opción",
            "Pag 3. - Promedios por estado", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
            null, menu, menu[0]);
            
            switch(select)
            {
                case 0:
                {
                    pag--;
                } break;
                case 1:
                {
                    reportpromapr();
                } break;
                case 2:
                {
                    reportpromapl();
                } break;
                case 3:
                {
                    reportpromrep();
                } break;
                case 4:
                {
                    JOptionPane.showMessageDialog(null, "Gracias por usar este programa");
                    System.exit(0);
                } break;
            }
        }
    }
    
    static void datos()
    {
        leer();
        insertar();
    }
    
    static void leer()
    {
        do {
            nota = Integer.parseInt(JOptionPane.showInputDialog("Digite la nota del estudiante:"));
            if ((nota < 1)||(nota > 100))
            {
                JOptionPane.showMessageDialog(null, "La nota mínima es 1 y la máxima es 100",
                null, JOptionPane.ERROR_MESSAGE);
            }
        } while ((nota < 1)||(nota > 100));
        
        if (nota >= 70)
        {
            JOptionPane.showMessageDialog(null, "Nota aprobada");
            contapr++;
            notasapr += nota;
        }
        else if (nota >= 50)
        {
            JOptionPane.showMessageDialog(null, "Nota aplazada");
            contapl++;
            notasapl += nota;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Nota reprobada");
            contrep++;
            notasrep += nota;
        }

        do {
            cedula = Integer.parseInt(JOptionPane.showInputDialog("Digite la cédula del estudiante:"));
            cedulaStr = String.valueOf(cedula);
            s1ced = cedulaStr.charAt(0) - '0';
            if (cedulaStr.length() != 9)
            {
                JOptionPane.showMessageDialog(null, "Una cédula solo puede tener 9 dígitos.",
                null, JOptionPane.ERROR_MESSAGE);
            }
            if ((s1ced < 1)||(s1ced > 7))
            {
                JOptionPane.showMessageDialog(null, "El primer dígito solo puede estar entre 1 y 7.",
                null, JOptionPane.ERROR_MESSAGE);
            }
        } while ((cedulaStr.length() != 9)||((s1ced < 1)||(s1ced > 7)));
    }
    
    static void insertar()
    {
        if (grado == 10)
        {
            cont10++;
            notas10 += nota;
            listnotcopy = Arrays.copyOf(listnot10, listnot10.length);
            listnot10 = Arrays.copyOf(listnotcopy, cont10+1);
            listnot10[cont10-1] = nota;
            
            listcedcopy = Arrays.copyOf(listced10, listced10.length);
            listced10 = Arrays.copyOf(listcedcopy, cont10+1);
            listced10[cont10-1] = cedula;
        }
        else if (grado == 11)
        {
            cont11++;
            notas11 += nota;
            listnotcopy = Arrays.copyOf(listnot11, listnot11.length);
            listnot11 = Arrays.copyOf(listnotcopy, cont11+1);
            listnot11[cont11-1] = nota;
            
            listcedcopy = Arrays.copyOf(listced11, listced11.length);
            listced11 = Arrays.copyOf(listcedcopy, cont11+1);
            listced11[cont11-1] = cedula;
        }
        else
        {
            cont12++;
            notas12 += nota;
            listnotcopy = Arrays.copyOf(listnot12, listnot12.length);
            listnot12 = Arrays.copyOf(listnotcopy, cont12+1);
            listnot12[cont12-1] = nota;
            
            listcedcopy = Arrays.copyOf(listced12, listced12.length);
            listced12 = Arrays.copyOf(listcedcopy, cont12+1);
            listced12[cont12-1] = cedula;
        }
    }
    
    static void lista10()
    {
        listdisp = "Cédula:             Nota:      Estado:";
        for (int i=0; i<listnot10.length-1; i++)
        {
            listdisp += "\n" + listced10[i] + "       " + listnot10[i];
            if (listnot10[i] >= 70)
                listdisp += "        Aprobado";
            else if (listnot10[i] >= 50)
                listdisp += "        Aplazado";
            else
                listdisp += "        Reprobado";
        }
        
        if (cont10 > 0)
        {
            proms10 = notas10 / cont10;
        }
        
        listdisp += "\nCantidad de notas: " + cont10 +
        "\nPromedio de notas: " + proms10;
        
        JOptionPane.showMessageDialog(null, listdisp, "Lista:", JOptionPane.PLAIN_MESSAGE);
    }
    
    static void lista11()
    {
        listdisp = "Cédula:             Nota:      Estado:";
        for (int i=0; i<listnot11.length-1; i++)
        {
            listdisp += "\n" + listced11[i] + "       " + listnot11[i];
            if (listnot11[i] >= 70)
                listdisp += "        Aprobado";
            else if (listnot11[i] >= 50)
                listdisp += "        Aplazado";
            else
                listdisp += "        Reprobado";
        }
        
        if (cont11 > 0)
        {
            proms11 = notas11 / cont11;
        }
        
        listdisp += "\nCantidad de notas: " + cont11 +
        "\nPromedio de notas: " + proms11;
        
        JOptionPane.showMessageDialog(null, listdisp, "Lista:", JOptionPane.PLAIN_MESSAGE);
    }
    
    static void lista12()
    {
        listdisp = "Cédula:             Nota:      Estado:";
        for (int i=0; i<listnot12.length-1; i++)
        {
            listdisp += "\n"+listced12[i] + "       " + listnot12[i];
            if (listnot12[i] >= 70)
                listdisp += "        Aprobado";
            else if (listnot12[i] >= 50)
                listdisp += "        Aplazado";
            else
                listdisp += "        Reprobado";
        }
        
        if (cont12 > 0)
        {
            proms12 = notas12 / cont12;
        }
        
        listdisp += "\nCantidad de notas: " + cont12 +
        "\nPromedio de notas: " + proms12;
        
        JOptionPane.showMessageDialog(null, listdisp, "Lista:", JOptionPane.PLAIN_MESSAGE);
    }
    
    static void reportpromapr()
    {
        if (contapr > 0)   
        {
            promapr = notasapr / contapr;
            JOptionPane.showMessageDialog(null, "Cantidad de notas: "+contapr
            +"\nPromedio de las notas aprobadas: "+promapr);
        }
        else
            JOptionPane.showMessageDialog(null, "No se han registrado notas aprobadas.");
    }
    
    static void reportpromapl()
    {
        if (contapl > 0)   
        {
            promapl = notasapl / contapl;
            JOptionPane.showMessageDialog(null, "Cantidad de notas: "+contapl
            +"\nPromedio de las notas aplazadas: "+promapl);
        }
        else
            JOptionPane.showMessageDialog(null, "No se han registrado notas aplazadas.");
    }
    
    static void reportpromrep()
    {
        if (contrep > 0)   
        {
            promrep = notasrep / contrep;
            JOptionPane.showMessageDialog(null, "Cantidad de notas: "+contrep
            +"\nPromedio de las notas reprobadas: "+promrep);
        }
        else
            JOptionPane.showMessageDialog(null, "No se han registrado notas reprobadas.");
    }
}
