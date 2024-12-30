/*Desarrolle un proyecto de Aplicación en el lenguaje de programación Java que 
manipula un Arreglo bidimensional (Matriz) de tipo entero que almacena números enteros. 
El programa se maneja por medio de un menú con las opciones que se muestran a continuación.
Menú Principal
1. Agregar datos a la Matriz
2. Reportar los datos de la Matriz
3. Consultar un dato de la matriz (Indicando la posición de la fila y columna donde está el número en la matriz).
4. Modificar un dato de la Matriz (Permitiendo preguntar al usuario si desea modificar o no el número).
5. Reportar los números pares de la matriz
6. Reportar los números impares de la matriz
7. Reportar Estadísticas
8. Reportar los datos de la Matriz en un rango dado por el usuario (Valor Mínimo – Valor Máximo)
9. Copiar y reportar los elementos pares en otra matriz
10. Copiar y reportar los elementos impares en otra matriz
Dirección Regional de Educación San José Norte
COLEGIO TÉCNICO PROFESIONAL DE CALLE BLANCOS
11. Salir
 El tamaño de la matriz debe ser de 3 filas X 3 columnas y la dimensión de la matriz tiene que ser
con una constante.
 Debe desarrollar las siguientes funciones que se tienen que llamar o invocar en un
procedimiento denominado reportar estadísticas, el cual se llama en la opción 7 del menú
principal.
 Función que recibe una matriz entera como parámetro y devuelve el promedio de los
elementos (datos) de la matriz.
 Función que recibe una matriz entera como parámetro y devuelve el promedio de los
elementos pares del vector.
 Función que recibe una matriz entera como parámetro y devuelve el promedio de
elementos impares de la matriz.
 Función que recibe una matriz entera como parámetro y devuelve el elemento menor
presente en la matriz.
 Función que recibe una matriz como parámetro y devuelve el elemento mayor presente
en la matriz.
 Función que recibe una matriz como parámetro y devuelve el promedio de los elementos
que están presentes en la diagonal izquierda de la matriz.
 Función que recibe una matriz como parámetro y devuelve el promedio de los elementos
que están presentes en la diagonal derecha de la matriz.
 En la opción 8 debe desarrollar un procedimiento en donde el usuario digita un valor mínimo y
un valor máximo y de acuerdo a eso, en el procedimiento se reportan los datos del vector que
están entre ese valor mínimo y ese valor máximo, es decir los datos que están en ese rango
correspondiente. */

package cotidianio6_ejercicio1;

import javax.swing.JOptionPane;

public class Cotidianio6_Ejercicio1 {
    static final int dim = 3, matrix[][] = new int [dim][dim];
    static int confirms = 0, window=0, AlTrue = 1, statpop=0;
    
    static Object menu;
    
    public static void main(String[] args)
    {
        do {
            menu();
        } while (AlTrue == 1);
    }
    
    static void menu()
    {
        Object[] menupal = {"Agregar datos", "Reportar datos", "Consultar posición", "Modificar dato", "Reportar pares", "Reportar impares",
        "Menu Estadisticas", "Consultar rango", "Copiar pares", "Copiar impares", "Salir"};
        
        if (window == 0) {
            menu = JOptionPane.showInputDialog(null, "Menú principal:\n\n• Agregar datos\n• Reportar datos\n• Consultar posición\n• Modificar un dato"+
                "\n• Reportar datos pares\n• Reportar datos impares\n• Menu de estadísticas\n• Consultar rango"+
                "\n• Copiar pares\n• Copiar impares\n• Salir\n\nSeleccione una opción:", "Menu", JOptionPane.QUESTION_MESSAGE, null, menupal, menupal[0]);
        }
        
        if (statpop == 1) {
            menu = "Menu Estadisticas";
        }
        
        if (menu == "Agregar datos")
            leer(matrix);
        else if (menu == "Reportar datos")
            report(matrix);
        else if (menu == "Consultar posición")
            checkpos(matrix);
        else if (menu == "Modificar dato")
            modify(matrix);
        else if (menu == "Reportar pares")
            reportpar(matrix);
        else if (menu == "Reportar impares")
            reportimpar(matrix);
        else if (menu == "Menu Estadisticas")
            stats();
        else if (menu == "Consultar rango")
            range(matrix);
        else if (menu == "Copiar pares")
            copypar(matrix);
        else if (menu == "Copiar impares")
            copyimpar(matrix);
        else
            salir();
    }
    
    static void leer(int v[][])
    {
        for (int f=0; f<3; f++)
        {
            for (int c=0; c<3; c++)
            {
                v[f][c] = Integer.parseInt(JOptionPane.showInputDialog("Fila: "+(f+1)+"\nColumna: "+(c+1)+"\n\nDigite el valor a guardar:"));
                
                if (confirms == 1)
                    JOptionPane.showMessageDialog(null, "Numero guardado.");
            }
        }
    }
    
    static void report(int v[][])
    {
        String msg = "Datos de la matriz:\n\n";
        
        for (int f=0; f<3; f++)
        {
            for (int c=0; c<3; c++)
            {
                msg += "["+v[f][c]+"]      ";
            }
            msg += "\n";
        }
        
        JOptionPane.showMessageDialog(null, msg, "Datos", JOptionPane.PLAIN_MESSAGE);
    }
    
    static void checkpos(int v[][])
    {
        window = 1;
        int f, c;
        do {
            f = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila de la posicion a consultar:              Digite 0 para volver al menú"));
            
            if (f == 0)
                window = 0;
            else if ((f < 1)||(f > 3))
                JOptionPane.showMessageDialog(null, "Fuera de rango.", "Error", JOptionPane.ERROR_MESSAGE);
        } while ((f < 0)||(f > 3));
        
        if (window == 1) {
            do {
                c = Integer.parseInt(JOptionPane.showInputDialog("Fila: "+f+"\nDigite la columna de la posicion a consultar:            Digite 0 para volver al menú"));
                
                if (c == 0)
                    window = 0;
                else if ((c < 1)||(c > 3))
                    JOptionPane.showMessageDialog(null, "Fuera de rango.", "Error", JOptionPane.ERROR_MESSAGE);
            } while ((c < 0)||(c > 3));

            if (window == 1) {
                c -= 1; f -= 1;
                JOptionPane.showMessageDialog(null, "El dato almacenado en la fila "+(f+1)+" y en la columna "+(c+1)+" es "+v[f][c], null, JOptionPane.PLAIN_MESSAGE);
            }
        }
    }
    
    static void modify(int v[][])
    {
        window = 1;
        int f, c;
        do {
            f = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila de la posicion a modificar:              Digite 0 para volver al menú"));
            
            if (f == 0)
                window = 0;
            else if ((f < 1)||(f > 3))
                JOptionPane.showMessageDialog(null, "Fuera de rango.", "Error", JOptionPane.ERROR_MESSAGE);
        } while ((f < 0)||(f > 3));
        
        if (window == 1) {
            do {
                c = Integer.parseInt(JOptionPane.showInputDialog("Fila: "+f+"\nDigite la columna de la posicion a modificar:            Digite 0 para volver al menú"));
                
                if (c == 0)
                    window = 0;
                else if ((c < 1)||(c > 3))
                    JOptionPane.showMessageDialog(null, "Fuera de rango.", "Error", JOptionPane.ERROR_MESSAGE);
            } while ((c < 0)||(c > 3));

            if (window == 1) {
                c -= 1; f -= 1;
                Integer.parseInt(JOptionPane.showInputDialog("Valor en fila "+(f+1)+" y columna "+(c+1)+" actual:"+v[f][c]+"\nValor nuevo:"));
            }
        }
    }
    
    static void reportpar(int v[][])
    {
        String msg = "Datos de la matriz:\n\n";
        
        for (int f=0; f<3; f++)
        {
            for (int c=0; c<3; c++)
            {
                if (v[f][c] % 2 == 0)
                    msg += "["+v[f][c]+"]      ";
                else
                    msg += "[--]     ";
            }
            msg += "\n";
        }
        
        JOptionPane.showMessageDialog(null, msg, "Datos", JOptionPane.PLAIN_MESSAGE);
    }
    
    static void reportimpar(int v[][])
    {
        String msg = "Datos de la matriz:\n\n";
        
        for (int f=0; f<3; f++)
        {
            for (int c=0; c<3; c++)
            {
                if (v[f][c] % 2 != 0)
                    msg += "["+v[f][c]+"]      ";
                else
                    msg += "[--]     ";
            }
            msg += "\n";
        }
        
        JOptionPane.showMessageDialog(null, msg, "Datos", JOptionPane.PLAIN_MESSAGE);
    }
    
    static void stats()
    {
        window=1;
        statpop=1;
        
        Object[] stats = {"Promedio", "Promedio pares", "Promedio impares", "Dato menor", "Dato mayor", "Promedio diagonal izquierda",
        "Promedio diagonal derecha", "Volver"};
        
        menu = JOptionPane.showInputDialog(null, "Menú de estadísticas: \n\n"+
                "• Promedio\n• Promedio de pares\n• Promedio de impares\n• Dato menor\n• Dato mayor\n• Promedio de la diagonal izquierda"+
                "\n• Promedio de la diagonal derecha\n• Volver\n\nSeleccione una opción:", "Menu", JOptionPane.QUESTION_MESSAGE,
                null, stats, stats[0]);
        
        if (menu == "Promedio")
            JOptionPane.showMessageDialog(null, "El promedio de los datos de la matriz es "+prom(matrix), "Promedio", JOptionPane.PLAIN_MESSAGE);
        else if (menu == "Promedio pares")
            JOptionPane.showMessageDialog(null, "El promedio de los datos pares es "+prompar(matrix), "Promedio", JOptionPane.PLAIN_MESSAGE);
        else if (menu == "Promedio impares")
            JOptionPane.showMessageDialog(null, "El promedio de los datos impares es "+promimpar(matrix), "Promedio", JOptionPane.PLAIN_MESSAGE);
        else if (menu == "Dato menor")
            JOptionPane.showMessageDialog(null, "El dato menor de la matriz es "+min(matrix), "Dato menor", JOptionPane.PLAIN_MESSAGE);
        else if (menu == "Dato mayor")
            JOptionPane.showMessageDialog(null, "El dato mayor de la matriz es "+max(matrix), "Dato mayor", JOptionPane.PLAIN_MESSAGE);
        else if (menu == "Promedio diagonal izquierda")
            JOptionPane.showMessageDialog(null, "El promedio de la diagonal izquierda es "+promdi(matrix), "Promedio", JOptionPane.PLAIN_MESSAGE);
        else if (menu == "Promedio diagonal derecha")
            JOptionPane.showMessageDialog(null, "El promedio de la diagonal derecha es "+promdd(matrix), "Promedio", JOptionPane.PLAIN_MESSAGE);
        else {
            window = 0;
            statpop = 0;
        }
    }
    
    static void range(int v[][])
    {
        window=1;
        int n1, n2, cambio;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor mínimo:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Valor mínimo: "+n1+"\nDigite el valor máximo:"));
        
        if (n2 < n1) {
            cambio = n1;
            n1 = n2;
            n2 = cambio;
        }
        
        String msg = "Datos de la matriz entre "+n1+" y "+n2+"\n\n";
        
        for (int f=0; f<3; f++)
        {
            for (int c=0; c<3; c++)
            {
                if ((v[f][c] >= n1)&&(v[f][c] <= n2))
                    msg += "["+v[f][c]+"]      ";
                else
                    msg += "[--]     ";
            }
            msg += "\n";
        }
        
        Object[] opcs = {"Volver a consultar", "Volver al menú"};
        
        int opc = JOptionPane.showOptionDialog(null, msg+"\n¿Quiere volver a hacer una consulta?", "Datos",
                JOptionPane.PLAIN_MESSAGE,JOptionPane.YES_NO_OPTION, null, opcs, opcs[0]);
        
        switch(opc)
        {
            case 0:
                window = 1; break;
            case 1:
                window = 0; break;
        }
    }
    
    static void copypar(int v[][])
    {
        int matcop[][] = new int [3][3];
        
        for (int f=0; f < 3; f++)
        {
            for (int c=0; c < 3; c++)
            {
                matcop[f][c] = v[f][c];
            }
        }
        
        String msg = "Datos de la matriz:\n\n";
        
        for (int f=0; f<3; f++)
        {
            for (int c=0; c<3; c++)
            {
                msg += "["+v[f][c]+"]      ";
            }
            msg += "\n";
        }
        
        msg += "\nDatos pares de la matriz:\n\n";
        
        for (int f=0; f<3; f++)
        {
            for (int c=0; c<3; c++)
            {
                if (matcop[f][c] % 2 == 0)
                    msg += "["+matcop[f][c]+"]      ";
                else
                    msg += "[--]     ";
            }
            msg += "\n";
        }
        
        JOptionPane.showMessageDialog(null, msg, "Datos", JOptionPane.PLAIN_MESSAGE);
    }
    
    static void copyimpar(int v[][])
    {
        int matcop[][] = new int [3][3];
        
        for (int f=0; f < 3; f++)
        {
            for (int c=0; c < 3; c++)
            {
                matcop[f][c] = v[f][c];
            }
        }
        
        String msg = "Datos de la matriz:\n\n";
        
        for (int f=0; f<3; f++)
        {
            for (int c=0; c<3; c++)
            {
                msg += "["+v[f][c]+"]      ";
            }
            msg += "\n";
        }
        
        msg += "\nDatos impares de la matriz:\n\n";
        
        for (int f=0; f<3; f++)
        {
            for (int c=0; c<3; c++)
            {
                if (matcop[f][c] % 2 != 0)
                    msg += "["+matcop[f][c]+"]      ";
                else
                    msg += "[--]     ";
            }
            msg += "\n";
        }
        
        JOptionPane.showMessageDialog(null, msg, "Datos", JOptionPane.PLAIN_MESSAGE);
    }
    
    static void salir()
    {
        int sal = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea salir?", "Está apunto de salir", JOptionPane.YES_NO_OPTION);
        
        if (sal == JOptionPane.YES_OPTION)
        {
            JOptionPane.showMessageDialog(null, "Gracias por usar este programa", "Programa finalizado", JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        }
    }
    
    static int prom(int v[][])
    {
        int suma = 0;
        
        for (int f = 0; f < dim; f++){
            for (int c = 0; c < dim; c++)
                suma += v[f][c];
        }
        
        return suma / (dim*dim);
    }
    
    static int prompar(int v[][])
    {
        int suma = 0, contpar = 0;
        
        for (int f = 0; f < dim; f++){
            for (int c = 0; c < dim; c++)
                if (v[f][c] % 2 == 0) {
                    suma += v[f][c];
                    contpar++;
                }
        }
        
        return suma / contpar;
    }
    
    static int promimpar(int v[][])
    {
        int suma = 0, contimpar = 0;
        
        for (int f = 0; f < dim; f++){
            for (int c = 0; c < dim; c++)
                if (v[f][c] % 2 != 0) {
                    suma += v[f][c];
                    contimpar++;
                }
        }
        
        return suma / contimpar;
    }
    
    static int min(int v[][])
    {
        int min = v[0][0];
        for (int f=0; f<3; f++) {
            for (int c=0; c<3; c++) {
                if (v[f][c] < min)
                    min = v[f][c];
            }
        }
        
        return min;
    }
    
    static int max(int v[][])
    {
        int max = v[0][0];
        for (int f=0; f<3; f++) {
            for (int c=0; c<3; c++) {
                if (v[f][c] > max)
                    max = v[f][c];
            }
        }
        
        return max;
    }
    
    static int promdi(int v[][])
    {
        int suma = 0;
        for (int i=0; i < dim; i++)
        {
            suma += v[i][i];
        }
        
        return suma / dim;
    }
    
    static int promdd(int v[][])
    {
        int suma = 0, c=2;
        for (int f=0; f < 3; f++) {
                suma += v[f][c];
                c--;
        }
        return suma / dim;
    }
}
