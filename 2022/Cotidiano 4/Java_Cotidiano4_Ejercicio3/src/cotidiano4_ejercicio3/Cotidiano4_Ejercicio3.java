/*Desarrolle un programa que lee y procesa salarios de los empleados que trabajan en una empresa X
cualesquiera mientras el usuario lo desee. En el programa debe desarrollar los procedimientos que se
detallan a continuación.
 La lectura y procesamiento de los datos de los empleados lo debe hacer en un procedimiento
donde tiene que procesar empleados mientras el usuario lo desee y para cada empleado debe
leer la identificación del empleado de tipo entero, el salario de tipo float, el género del empleado
de tipo entero (1=Masculino, 2=Femenino) y el código de departamento de tipo entero donde
trabaja el empleado (1=Generales, 2=Planillas, 3=Recursos Humanos). Es importante que al leer el
género y el código de departamento se muestre un pequeño menú al usuario de las posibles
alternativas a seleccionar en cada uno de los casos correspondientes. Además, que en el
momento en que el usuario va a digitar los datos de un empleado, el programa indique el número
del empleado que se está procesando en ese momento.
 Desarrolle un procedimiento donde se calcule y reporte las siguientes estadísticas de los empleados
procesados: calcular y reportar el total de todos los salarios procesados, el total de salarios de
empleados Masculinos, el total de salarios de empleados Femeninos, promedio de todos los salarios
de género Masculinos procesados y promedio de todos los salarios de género Femeninos
procesados.
 Desarrolle un procedimiento donde se calcule y reporte las siguientes estadísticas de acuerdo con
los empleados procesados: promedio de todos los salarios procesados, el total de salarios de
empleados de cada uno de los 3 departamentos, promedio de salarios de cada uno de los 3
departamentos.
 Desarrolle un procedimiento que se llame Menú Principal y debe llamarlo en el void main() del
programa, el cual tiene las siguientes opciones:
Menú Principal
1. Procesamiento de Empleados
2. Reportar Estadísticas por Género
3. Reportar Estadísticas por Departamento
4. Salir*/
package cotidiano4_ejercicio3;

import javax.swing.JOptionPane;

public class Cotidiano4_Ejercicio3 {
    static int cedula, s1ced, gene, AlTrue=1;
    static String cedulaStr, mensaje;
    static float sal;
    static int empleadosM, empleadosF;
    static float salariosM, salariosF;
    static int empleadosdep1, empleadosdep2, empleadosdep3;
    static float salariosdep1, salariosdep2, salariosdep3;
    
    static float promM, promF, promdep1, promdep2, promdep3;
    
    public static void main(String[] args)
    {
        do {
            menu();
        } while (AlTrue == 1);
    }
    
    static void menu()
    {
        Object[] menu = {"Ingresar empleado", "Estadisticas por genero", "Estadisticas por departamento", "Salir"};
        
        int sel = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Menu",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, menu, menu[0]);
        
        switch(sel)
        {
            case 0:
            {
                leer();
            } break;
            case 1:
            {
                statgen();
            } break;
            case 2:
            {
                statdep();
            } break;
            case 3:
            {
                int salir = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea salir?", null,
                JOptionPane.YES_NO_OPTION);
                
                if (salir == JOptionPane.YES_OPTION)
                {
                    JOptionPane.showMessageDialog(null, "Gracias por usar este programa.");
                    System.exit(0);
                }
            }
        }
    }
    
    static void leer()
    {
        do {
            cedula = Integer.parseInt(JOptionPane.showInputDialog("Digite la cédula del empleado:"));
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
        
        do {
            sal = Float.parseFloat(JOptionPane.showInputDialog("Digite el salario del empleado:", "100000"));
            
            if (sal < 100000)
                JOptionPane.showMessageDialog(null, "El salario mínimo es 100.000¢");
        } while (sal < 100000);
        
        Object[] gen = {"Masculino", "Femenino"};
        
        int sel = JOptionPane.showOptionDialog(null, "Seleccione el genero del empleado", "Ingreso de datos",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, gen, gen[0]);
        
        switch(sel)
        {
            case 0:
            {
                empleadosM++;
                salariosM+=sal;
            } break;
            case 1:
            {
                empleadosF++;
                salariosF+=sal;
            }
        }
        
        Object[] dep = {"Generales", "Planillas", "Recursos humanos"};
        
        sel = JOptionPane.showOptionDialog(null, "Seleccione el departamento del empleado", "Ingreso de datos",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, dep, dep[0]);
        
        switch(sel)
        {
            case 0:
            {
                empleadosdep1++;
                salariosdep1+=sal;
            } break;
            case 1:
            {
                empleadosdep2++;
                salariosdep2+=sal;
            } break;
            case 2:
            {
                empleadosdep3++;
                salariosdep3+=sal;
            } break;
        }
    }
    
    static void statgen()
    {
        mensaje = "";
        if (empleadosM > 0)
        {
            promM = salariosM / empleadosM;
            
            mensaje += "Cantidad de empleados masculinos: "+empleadosM+"\nSalario promedio: "+promM;
        }
        else
        {
            mensaje += "No se han registrado empleados masculinos.";
        }
        if (empleadosF > 0)
        {
            promF = salariosF / empleadosF;
            
            mensaje += "\n\nCantidad de empleados femeninos: "+empleadosF+"\nSalario promedio: "+promF;
        }
        else
        {
            mensaje += "\n\nNo se han registrado empleados femeninos.";
        }
        
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    static void statdep()
    {
        mensaje = "";
        if (empleadosdep1 > 0)
        {
            promdep1 = salariosdep1 / empleadosdep1;
            
            mensaje += "Cantidad de empleados de Generales: "+empleadosdep1+"\nSalario promedio: "+promdep1;
        }
        else
        {
            mensaje += "No se han registrado empleados de Generales.";
        }
        if (empleadosdep2 > 0)
        {
            promdep2 = salariosdep2 / empleadosdep2;
            
            mensaje += "\n\nCantidad de empleados de Planillas: "+empleadosdep2+"\nSalario promedio: "+promdep2;
        }
        else
        {
            mensaje += "\n\nNo se han registrado empleados de Planillas.";
        }
        if (empleadosdep3 > 0)
        {
            promdep3 = salariosdep3 / empleadosdep3;
            
            mensaje += "\n\nCantidad de empleados de Recursos Humanos: "+empleadosdep3+
            "\nSalario promedio: "+promdep3;
        }
        else
        {
            mensaje += "\n\nNo se han registrado empleados de Recursos Humanos.";
        }
        
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
