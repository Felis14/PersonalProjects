/*Desarrolle un proyecto de Aplicación en el lenguaje de programación Java que manipula un vector de tipo float.
En el vector se van a guardar las notas de los estudiantes de una materia X cualesquiera. El programa debe estar
implementado con un menú de opciones, como se muestra a continuación y donde se realiza lo
establecido en cada una de ellas.
Al desarrollar el ejercicio considere lo siguiente:
•**** Una Nota es aprobada si es mayor o igual a 70.
•**** Una Nota es aplazada si está entre 50 y menor que 70.
•**** Una Nota es reprobada si es menor que 50.
El vector se debe manejar con una constante con el valor de 5 o 10 notas de estudiantes.
Menú Principal
1. Agregar Notas al Vector.
2. Reportar todas las notas almacenadas en el Vector.
3. Consultar o Buscar una Nota en el Vector (Indicando la posición donde está la nota en el vector).
4. Modificar una Nota almacenada en el Vector (Permitiendo preguntar al usuario si desea modificar o no la Nota).
5. Reportar Estadísticas.
6. Reportar las Notas Aprobadas almacenadas en el Vector
7. Reportar las Notas Aplazadas almacenadas en el Vector
8. Reportar las Notas Reprobadas almacenadas en el Vector
9. Reportar todas las Notas que están entre un rango de Notas dado por el Usuario (En este caso, el Usuario digita
un Valor Mínimo y un Valor Máximo y se reportan las notas que están entre ese rango de notas dado por el usuario).
10. Salir
• Debe desarrollar las siguientes funciones que se tienen que llamar o invocar en un procedimiento denominado
reportar estadísticas, el cual se llama en la opción 5 del menú principal.
• Función que recibe un vector de tipo float como parámetro y devuelve el promedio de las notas almacenadas en el vector.
• Función que recibe un vector de tipo float como parámetro y devuelve el promedio de las notas aprobadas almacenadas en el vector.
• Función que recibe un vector de tipo float como parámetro y devuelve el promedio de las notas aplazadas almacenadas en el vector.
• Función que recibe un vector de tipo float como parámetro y devuelve el promedio de las notas reprobadas almacenadas en el vector.
• Función que recibe un vector de tipo float como parámetro y devuelve la nota mayor almacenada en el vector.
• Función que recibe un vector de tipo float como parámetro y devuelve la nota menor almacenada en el vector*/
package cotidiano5_ejercicio2;

import javax.swing.JOptionPane;

public class Cotidiano5_Ejercicio2 {
    static final float vec[] = new float [10];
    
    static int AlTrue=1, window=0, stats=0, confirms=1;
    
    static Object opc;
    static String state;
    
    static Object[] topmenu = {"Sobreescribir notas", "Reportar todas las notas", "Consultar nota en posicion",
    "Modificar una nota", "Reportar estadisticas", "Reportar notas aprobadas", "Reportar notas aplazadas",
    "Reportar notas reprobadas", "Reportar notas en rango", "Salir"};
    
    static Object[] statmenu = {"Promedio total", "Promedio notas aprobadas", "Promedio notas aplazadas",
    "Promedio notas reprobadas", "Mayor nota almacenada", "Menor nota almacenada", "Volver"};
    
    public static void main(String[] args)
    {
        datos();
        do {
            menu();
        } while (AlTrue == 1);
    }
    
    static void menu()
    {
        if (window == 0) {
            opc = JOptionPane.showInputDialog(null, "Menú Principal\n•Sobreescribir notas"+
            "\n•Reportar todas las notas\n•Consultar nota en posicion\n•Modificar una nota\n•Reportar estadisticas"
            +"\n•Reportar notas aprobadas\n•Reportar notas aplazadas\n•Reportar notas reprobadas"+
            "\n•Reportar notas en un rango\n•Salir\n\nSeleccione una opción", "Menu",
                JOptionPane.QUESTION_MESSAGE, null, topmenu, topmenu[0]);
        }
        
        if (stats == 1) {
            opc = "Reportar estadisticas";
        }
        
        if (opc == "Sobreescribir notas")
        {
            datos();
        }
        else if (opc == "Reportar todas las notas")
        {
            reporte();
        }
        else if (opc == "Consultar nota en posicion")
        {
            consulta();
        }
        else if (opc == "Modificar una nota")
        {
            modify();
        }
        else if (opc == "Reportar estadisticas")
        {
            stats();
        }
        else if (opc == "Reportar notas aprobadas")
        {
            aprob();
        }
        else if (opc == "Reportar notas aplazadas")
        {
            aplaz();
        }
        else if (opc == "Reportar notas reprobadas")
        {
            reprob();
        }
        else if (opc == "Reportar notas en rango")
        {
            range();
        }
        else
        {
            salir();
        }
    }
    
    static void datos()
    {
        //Digita los números desde la posición 0 hasta la ultima posicion del vector
        for (int i=0; i < vec.length; i++)
        {
            do {
                vec[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite la nota a guardar en la posición "+(i+1)));
                
                if ((vec[i] < 1)||(vec[i] > 100)){
                    JOptionPane.showMessageDialog(null, "La nota mínima es 1 y la máxima es 100.");
                }
            } while ((vec[i] < 1)||(vec[i] > 100));
                
            if (vec[i] >= 70)
                state = "Nota aprobada.";
            else if ((vec[i] >= 50)&&(vec[i] < 70))
                state = "Nota aplazada.";
            else
                state = "Nota reprobada.";
            
            if (confirms == 1) {
                JOptionPane.showMessageDialog(null, "Nota en posición "+(i+1)+" guardada correctamente.\n"+
                state, "Nota registrada", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }
    
    static void reporte()
    {
        //Arma el mensaje en una variable String mediante un ciclo for
        String msg = "";
            
            for (int i=0; i < vec.length; i++)
            {
                msg += "Nota en posición "+(i+1)+": "+vec[i]+"\n";
            }
            
            JOptionPane.showMessageDialog(null, msg, "Notas del vector", JOptionPane.INFORMATION_MESSAGE);
    }
    
    static void consulta()
    {
        window = 1;
        int pos;
        //Mensaje de input para leer que posición quiere leer el usuario
        do {
            pos = Integer.parseInt(JOptionPane.showInputDialog(null, "Consultar nota por posición.              Si digita 0 volverá al menú"
                +"\n\nDigite la posición a consultar:",
                null, JOptionPane.QUESTION_MESSAGE));
            
            if ((pos<0)||(pos>vec.length))
                JOptionPane.showMessageDialog(null, "Posición fuera de rango", "Error", JOptionPane.ERROR_MESSAGE);
        } while ((pos<0)||(pos>vec.length));
        
        if (pos == 0) {
            window = 0;
        }
        else {
            pos -= 1;
            
            JOptionPane.showMessageDialog(null, "La nota en la posición "+(pos+1)+" es: "+vec[pos]);
        }
    }
    
    static void modify()
    {
        window = 1;
        int mod;
        
        String msg = "";
            
        for (int i=0; i < vec.length; i++)
        {
            msg += "Nota en posición "+(i+1)+": "+vec[i]+"\n";
        }
        
        do {
            mod = Integer.parseInt(JOptionPane.showInputDialog(null, msg+"\nModificar una nota             Si digita 0 volverá al menú\n\n"
                    +"Digite la posición a modificar del vector: ", null, JOptionPane.QUESTION_MESSAGE));
            
            if (mod == 0)
            {
                window = 0;
            }
            else if ((mod < 0)||(mod>vec.length))
            {
                JOptionPane.showMessageDialog(null, "Posición fuera de rango", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while ((mod < 0)||(mod>vec.length));
        
        if (mod > 0)
        {
            mod -= 1;
        
            vec[mod] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digitar la nota - Posición: "+(mod+1)+"\n\nNota actual: "
                    +vec[mod]+"\nDigite la nueva nota: ", null, JOptionPane.QUESTION_MESSAGE));
        }
    }
    
    static void aprob()
    {
        String msg = "Notas aprobadas:\n\n";
        
        for (int i=0; i < vec.length; i++)
        {
            if (vec[i] >= 70) {
                msg += "Nota en posicion "+(i+1)+": "+vec[i]+"\n";
            }
        }
        
        JOptionPane.showMessageDialog(null, msg, "Notas", JOptionPane.INFORMATION_MESSAGE);
    }
    
    static void aplaz()
    {
        String msg = "Notas aplazadas:\n\n";
        
        for (int i=0; i < vec.length; i++)
        {
            if ((vec[i] >= 50)&&(vec[i] < 70)) {
                msg += "Nota en posicion "+(i+1)+": "+vec[i]+"\n";
            }
        }
        
        JOptionPane.showMessageDialog(null, msg, "Notas", JOptionPane.INFORMATION_MESSAGE);
    }
    
    static void reprob()
    {
        String msg = "Notas reprobadas:\n\n";
        
        for (int i=0; i < vec.length; i++)
        {
            if (vec[i] < 50) {
                msg += "Nota en posicion "+(i+1)+": "+vec[i]+"\n";
            }
        }
        
        JOptionPane.showMessageDialog(null, msg, "Notas", JOptionPane.INFORMATION_MESSAGE);
    }
    
    static void range()
    {
        window=1;
        int n1, n2, cambio;
        
        do {
            n1 = Integer.parseInt(JOptionPane.showInputDialog("Consultar notas en un rango            Si digita 0 volverá al menu\n\nDigite la nota mínima: "));
            
            if (n1 == 0)
            {
                window=0;
            }
            else if ((n1<1)||(n1>100))
            {
                JOptionPane.showMessageDialog(null, "Nota mínima 1 y máxima 100", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while ((n1 < 0)||(n1 > 100));
        
        if (n1 !=0)
        {
            do {
                n2 = Integer.parseInt(JOptionPane.showInputDialog("Consultar notas en un rango            Si digita 0 volverá al menu\n\nNota mínima: "+n1+"\n\nDigite la nota máxima: "));
                
                if  (n2 == 0)
                {
                    window = 0;
                }
                else if ((n2<1)||(n2>100))
                {
                    JOptionPane.showMessageDialog(null, "Nota mínima 1 y máxima 100", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } while ((n2 < 0)||(n2>100));
            
            if (window == 1)
            {
                if (n1 > n2)
                {
                    cambio = n1;
                    n1 = n2;
                    n2 = cambio;
                }

                String msg = "";

                for (int i=0; i<vec.length; i++)
                {
                    if ((vec[i] >= n1)&&(vec[i] <= n2))
                        msg += "Nota en posición "+(i+1)+": "+vec[i]+"\n";
                }

                JOptionPane.showMessageDialog(null, "Datos entre el rango "+(n1)+" y "+(n2)+"\n\n"+msg);
            }
        }
    }
    
    static void stats()
    {
        window = 1;
        stats = 1;       
        
        //Crea un mensaje con una lista desplegable con las opciones definidas en la parte de arriba
        opc = JOptionPane.showInputDialog(null, "Menú de estadísticas\n•Promedio de todas las notas"
        +"\n•Promedio de notas aprobadas\n•Promedio de notas aplazadas\n•Promedio de notas reprobadas\n•Mayor nota almacenada"
        +"\n•Menor nota almacenada\n•Volver\n\nSeleccione una opción", "Menu",
                    JOptionPane.QUESTION_MESSAGE, null, statmenu, statmenu[0]);
        
        if (opc == "Promedio total")
        {
            JOptionPane.showMessageDialog(null, "El promedio de las notas es "+promtot(vec),
            "Promedio de todas las notas", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (opc == "Promedio notas aprobadas")
        {
            JOptionPane.showMessageDialog(null, "El promedio de las notas aprobadas es "+promaprob(vec),
            "Promedio de notas", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (opc == "Promedio notas aplazadas")
        {
            JOptionPane.showMessageDialog(null, "El promedio de las notas aplazadas es "+promaplaz(vec),
            "Promedio de notas", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (opc == "Promedio notas reprobadas")
        {
            JOptionPane.showMessageDialog(null, "El promedio de las notas reprobadas "+promreprob(vec),
            "Promedio de notas", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (opc == "Mayor nota almacenada")
        {
            JOptionPane.showMessageDialog(null, "La mayor nota almacenada es "+mayor(vec),
            "Nota mayor", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (opc == "Menor nota almacenada")
        {
            JOptionPane.showMessageDialog(null, "La menor nota almacenada es "+menor(vec),
            "Nota menor", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            window = 0;
            stats = 0;
        }
    }
    
    static float promtot(float v[])
    {
        float suma=0;
        
        for (int i=0; i<vec.length; i++)
        {
            suma += v[i];
        }
        
        return suma / vec.length;
    }
    
    static float promaprob(float v[])
    {
        float suma=0;
        int cont=0;
        
        for (int i=0; i < v.length; i++)
        {
            if (v[i] >= 70) {
                suma += v[i];
                cont++;
            }
        }
        
        if (cont > 0)
            return suma / cont;
        else
            return 0;
    }
    
    static float promaplaz(float v[])
    {
        float suma=0;
        int cont=0;
        
        for (int i=0; i < v.length; i++)
        {
            if ((v[i] >= 50)&&(v[i] < 70)) {
                suma += v[i];
                cont++;
            }
        }
        
        if (cont > 0)
            return suma / cont;
        else
            return 0;
    }
    
    static float promreprob(float v[])
    {
        float suma=0;
        int cont=0;
        
        for (int i=0; i < v.length; i++)
        {
            if (v[i] < 50) {
                suma += v[i];
                cont++;
            }
        }
        
        if (cont > 0)
            return suma / cont;
        else
            return 0;
    }
    
    static float menor(float v[])
    {
        float menor = v[0];
        
        for (int i=1; i<v.length; i++)
        {
            if (v[i] < menor)
                menor = v[i];
        }
        
        return menor;
    }
    
    static float mayor(float v[])
    {
        float mayor = v[0];
        
        for (int i=1; i<v.length; i++)
        {
            if (v[i] > mayor)
                mayor = v[i];
        }
        
        return mayor;
    }
    
    static void salir()
    {
        //Pregunta si desea salir
        int salir = JOptionPane.showConfirmDialog(null, "¿Está seguro qué desea salir?", "Está a punto de salir", JOptionPane.YES_NO_OPTION);
        //Si la opción es sí, el programa se despide, si no continúa y el ciclo se vuelve a repetir
        if (salir == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Gracias por usar este programa.",
                    "Programa finalizado. Hasta luego.", JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        }
    }
    
}