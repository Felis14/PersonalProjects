package cotidiano6_ejercicio2;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Cotidiano6_Ejercicio2 {
    static final int dim = 3, matrix[][] = new int [dim][dim];
    static int confirms = 1, window=0, AlTrue = 1, statpop=0;
    
    static Object menu;
    
    public static void main(String[] args)
    {
        do {
            menu();
        } while (AlTrue == 1);
    }
    
    static void menu()
    {
        Object[] menupal = {"Agregar notas", "Agregar notas aleatorias", "Reportar notas", "Buscar nota",
            "Modificar nota", "Menu Estadisticas", "Reportar notas en rango", "Reportar notas diagonal izq.",
            "Reportar notas diagonal der.", "Copiar aprobadas", "Copiar aplazadas", "Copiar reprobadas", "Salir"};
        
        if (window == 0) {
            menu = JOptionPane.showInputDialog(null, "Menú principal:\n\n• Agregar notas\n• Agregar notas aleatorias\n• Reportar notas\n• Buscar notas"+
                "\n• Modificar notas\n• Menu de estadisticas\n• Reportar notas en un rango\n• Reportar notas en diagonal izquierda"+
                "\n• Reportar notas en diagonal derecha\n• Copiar aprobadas\n• Copiar aplazadas\n• Copiar reprobadas\n• Salir\n\nSeleccione una opción:",
                "Menu", JOptionPane.QUESTION_MESSAGE, null, menupal, menupal[0]);
        }
        
        if (statpop == 1) {
            menu = "Menu Estadisticas";
        }
        
        if (menu == "Agregar notas")
            leer(matrix);
        else if (menu == "Agregar notas aleatorias")
            notasrand(matrix);
        else if (menu == "Reportar notas")
            report(matrix);
        else if (menu == "Buscar nota")
            checkpos(matrix);
        else if (menu == "Modificar nota")
            modify(matrix);
        else if (menu == "Menu Estadisticas")
            stats();
        else if (menu == "Reportar notas en rango")
            range(matrix);
        else if (menu == "Reportar notas diagonal izq.")
            reportizq(matrix);
        else if (menu == "Reportar notas diagonal der.")
            reportder(matrix);
        else if (menu == "Copiar aprobadas")
            copyapr(matrix);
        else if (menu == "Copiar aplazadas")
            copyapl(matrix);
        else if (menu == "Copiar reprobadas")
            copyrep(matrix);
        else
            salir();
    }
    
    static void leer(int v[][])
    {
        for (int f=0; f<3; f++)
        {
            for (int c=0; c<3; c++)
            {
                do {
                    v[f][c] = Integer.parseInt(JOptionPane.showInputDialog("Fila: "+(f+1)+"\nColumna: "+(c+1)+
                            "\n\nDigite el valor a guardar:"));
                    
                    if (v[f][c] > 100 || v[f][c] < 1)
                        JOptionPane.showMessageDialog(null, "Nota máxima es 100 y mínima es 1");
                } while (v[f][c] > 100 || v[f][c] < 1);
                
                if (confirms == 1) {
                    if (v[f][c] >= 70)
                        JOptionPane.showMessageDialog(null, "Nota aprobada.");
                    else if (v[f][c] >= 50)
                        JOptionPane.showMessageDialog(null, "Nota aplazada.");
                    else
                        JOptionPane.showMessageDialog(null, "Nota reprobada.");
                }
            }
        }
    }
    
    static void notasrand(int v[][])
    {
        int random;
        for (int f=0; f<3; f++) {
            for (int c=0; c<3; c++) {
                boolean encontrado = false;
                random = (int)(Math.random()* 60)+41;
                
                for (int f2=0; f2<3; f2++) {
                    for (int c2=0; c2<3; c2++) {
                        if (v[f2][c2] == random)
                            encontrado = true;
                    }
                }
                if (!encontrado) {
                    v[f][c] = random;
                    
                    if (v[f][c] >= 70)
                        JOptionPane.showMessageDialog(null, "Nota aprobada.   " + v[f][c]);
                    else if (v[f][c] >= 50)
                        JOptionPane.showMessageDialog(null, "Nota aplazada.   " + v[f][c]);
                    else
                        JOptionPane.showMessageDialog(null, "Nota reprobada.   "+ v[f][c]);
                }
                else {
                    c--;
                }
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
        int cont=0;
        String msg = "Notas encontradas:\n\n";
        int nota = Integer.valueOf(JOptionPane.showInputDialog("Digite la nota a buscar:            Digite 0 para volver al menu"));
        
        if (nota>100)
            nota = 100;
        
        if (nota!=0) {
            for (int f=0; f<3; f++) {
                for (int c=0; c<3; c++) {
                    if (v[f][c] == nota) {
                        cont++;
                        msg += "Encontrada la nota "+v[f][c]+" en la fila "+f+" y la columna "+c+"\n";
                    }
                }
            }
            if (cont>0)
                JOptionPane.showMessageDialog(null, msg, "Notas encontradas", JOptionPane.PLAIN_MESSAGE);
            else
                JOptionPane.showMessageDialog(null, "No se encontró la nota "+nota);
        }
        else
        {
            window = 0;
        }
    }
    
    static void modify(int v[][])
    {
        window = 1;
        int f, c;
        do {
            f = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila de la nota a modificar:              Digite 0 para volver al menú"));
            
            if (f == 0)
                window = 0;
            else if ((f < 1)||(f > 3))
                JOptionPane.showMessageDialog(null, "Fuera de rango.", "Error", JOptionPane.ERROR_MESSAGE);
        } while ((f < 0)||(f > 3));
        
        if (window == 1) {
            do {
                c = Integer.parseInt(JOptionPane.showInputDialog("Fila: "+f+"\nDigite la columna de la nota a modificar:            Digite 0 para volver al menú"));
                
                if (c == 0)
                    window = 0;
                else if ((c < 1)||(c > 3))
                    JOptionPane.showMessageDialog(null, "Fuera de rango.", "Error", JOptionPane.ERROR_MESSAGE);
            } while ((c < 0)||(c > 3));

            if (window == 1) {
                c -= 1; f -= 1;
                Integer.parseInt(JOptionPane.showInputDialog("Nota en fila "+(f+1)+" y columna "+(c+1)+" actual:"+v[f][c]+"\nNota nueva:"));
            }
        }
    }
    
    static void reportizq(int v[][])
    {
        String msg = "Notas de la diagonal izquierda:\n\n";
        
        for (int f=0; f<3; f++)
        {
            for (int c=0; c<3; c++)
            {
                if (f == c)
                    msg += "["+v[f][c]+"]      ";
                else
                    msg += "[--]     ";
            }
            msg += "\n";
        }
        
        JOptionPane.showMessageDialog(null, msg, "Notas", JOptionPane.PLAIN_MESSAGE);
    }
    
    static void reportder(int v[][])
    {
        String msg = "Notas de la diagonal derecha:\n\n";
        
        for (int f=0; f<3; f++)
        {
            for (int c=0; c<3; c++)
            {
                if ((f==0 && c ==2) || (f==1 && c==1) || (f==2 && c==0))
                    msg += "["+v[f][c]+"]      ";
                else
                    msg += "[--]     ";
            }
            msg += "\n";
        }
        
        JOptionPane.showMessageDialog(null, msg, "Notas", JOptionPane.PLAIN_MESSAGE);
    }
    
    static void stats()
    {
        window=1;
        statpop=1;
        
        Object[] stats = {"Promedio", "Promedio aprobadas", "Promedio aplazadas", "Promedio reprobadas", "Nota menor",
            "Nota mayor", "Promedio diagonal izquierda", "Promedio diagonal derecha", "Volver"};
        
        menu = JOptionPane.showInputDialog(null, "Menú de estadísticas: \n\n"+
                "• Promedio\n• Promedio aprobadas\n• Promedio aplazadas\n• Promedio reprobadas\n• Nota menor\n• Nota mayor\n• Promedio de la diagonal izquierda"+
                "\n• Promedio de la diagonal derecha\n• Volver\n\nSeleccione una opción:", "Menu", JOptionPane.QUESTION_MESSAGE,
                null, stats, stats[0]);
        
        if (menu == "Promedio")
            JOptionPane.showMessageDialog(null, "El promedio de las notas de la matriz es "+prom(matrix), "Promedio", JOptionPane.PLAIN_MESSAGE);
        else if (menu == "Promedio aprobadas")
            JOptionPane.showMessageDialog(null, "El promedio de las notas aprobadas es "+promapr(matrix), "Promedio", JOptionPane.PLAIN_MESSAGE);
        else if (menu == "Promedio aplazadas")
            JOptionPane.showMessageDialog(null, "El promedio de las notas aplazadas es "+promapl(matrix), "Promedio", JOptionPane.PLAIN_MESSAGE);
        else if (menu == "Promedio reprobadas")
            JOptionPane.showMessageDialog(null, "El promedio de las notas reprobadas es "+promrep(matrix), "Pormedio", JOptionPane.PLAIN_MESSAGE);
        else if (menu == "Nota menor")
            JOptionPane.showMessageDialog(null, "La nota menor de la matriz es "+min(matrix), "Nota menor", JOptionPane.PLAIN_MESSAGE);
        else if (menu == "Nota mayor")
            JOptionPane.showMessageDialog(null, "La nota mayor de la matriz es "+max(matrix), "Nota mayor", JOptionPane.PLAIN_MESSAGE);
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
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite la nota mínima:"));
        if (n1 < 1)
            n1 = 1;
        if (n1 > 100)
            n1 = 100;
        
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Nota mínimo: "+n1+"\nDigite la nota máxima:"));
        if (n2 > 100)
            n2 = 100;
        if (n2 < 1)
            n2 = 1;
        
        if (n2 < n1) {
            cambio = n1;
            n1 = n2;
            n2 = cambio;
        }
        
        String msg = "Notas de la matriz entre "+n1+" y "+n2+"\n\n";
        
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
        
        int opc = JOptionPane.showOptionDialog(null, msg+"\n¿Quiere volver a hacer una consulta?", "Notas",
                JOptionPane.PLAIN_MESSAGE,JOptionPane.PLAIN_MESSAGE, null, opcs, opcs[0]);
        
        switch(opc)
        {
            case 0:
                window = 1; break;
            case 1:
                window = 0; break;
        }
    }
    
    static void copyapr(int v[][])
    {
        int matcop[][] = new int [3][3];
        
        for (int f=0; f < 3; f++)
        {
            for (int c=0; c < 3; c++)
            {
                matcop[f][c] = v[f][c];
            }
        }
        
        String msg = "Notas de la matriz:\n\n";
        
        for (int f=0; f<3; f++)
        {
            for (int c=0; c<3; c++)
            {
                msg += "["+v[f][c]+"]      ";
            }
            msg += "\n";
        }
        
        msg += "\nNotas aprobadas de la matriz:\n\n";
        
        for (int f=0; f<3; f++)
        {
            for (int c=0; c<3; c++)
            {
                if (matcop[f][c] >= 70)
                    msg += "["+matcop[f][c]+"]      ";
                else
                    msg += "[--]     ";
            }
            msg += "\n";
        }
        
        JOptionPane.showMessageDialog(null, msg, "Notas", JOptionPane.PLAIN_MESSAGE);
    }
    
    static void copyapl(int v[][])
    {
        int matcop[][] = new int [3][3];
        
        for (int f=0; f < 3; f++)
        {
            for (int c=0; c < 3; c++)
            {
                matcop[f][c] = v[f][c];
            }
        }
        
        String msg = "Notas de la matriz:\n\n";
        
        for (int f=0; f<3; f++)
        {
            for (int c=0; c<3; c++)
            {
                msg += "["+v[f][c]+"]      ";
            }
            msg += "\n";
        }
        
        msg += "\nNotas aplazadas de la matriz:\n\n";
        
        for (int f=0; f<3; f++)
        {
            for (int c=0; c<3; c++)
            {
                if (matcop[f][c] >= 50 && matcop[f][c] < 70)
                    msg += "["+matcop[f][c]+"]      ";
                else
                    msg += "[--]     ";
            }
            msg += "\n";
        }
        
        JOptionPane.showMessageDialog(null, msg, "Notas", JOptionPane.PLAIN_MESSAGE);
    }
    
    static void copyrep(int v[][])
    {
        int matcop[][] = new int [3][3];
        
        for (int f=0; f < 3; f++)
        {
            for (int c=0; c < 3; c++)
            {
                matcop[f][c] = v[f][c];
            }
        }
        
        String msg = "Notas de la matriz:\n\n";
        
        for (int f=0; f<3; f++)
        {
            for (int c=0; c<3; c++)
            {
                msg += "["+v[f][c]+"]      ";
            }
            msg += "\n";
        }
        
        msg += "\nNotas reprobadas de la matriz:\n\n";
        
        for (int f=0; f<3; f++)
        {
            for (int c=0; c<3; c++)
            {
                if (matcop[f][c] < 50)
                    msg += "["+matcop[f][c]+"]      ";
                else
                    msg += "[--]     ";
            }
            msg += "\n";
        }
        
        JOptionPane.showMessageDialog(null, msg, "Notas", JOptionPane.PLAIN_MESSAGE);
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
    
    static float prom(int v[][])
    {
        int suma = 0;
        
        for (int f = 0; f < dim; f++){
            for (int c = 0; c < dim; c++)
                suma += v[f][c];
        }
        
        return suma / (dim*dim);
    }
    
    static float promapr(int v[][])
    {
        int suma = 0, contapr = 0;
        
        for (int f = 0; f < dim; f++){
            for (int c = 0; c < dim; c++) {
                if (v[f][c] >= 70) {
                    suma += v[f][c];
                    contapr++;
                }
            }
        }
        
        if (suma!=0)
            return suma / contapr;
        else
            return 0;
    }
    
    static float promapl(int v[][])
    {
        int suma = 0, contapl = 0;
        
        for (int f = 0; f < dim; f++){
            for (int c = 0; c < dim; c++) {
                if (v[f][c] >= 50 && v[f][c] < 70) {
                    suma += v[f][c];
                    contapl++;
                }
            }
        }
        
        if (suma!=0)
            return suma / contapl;
        else
            return 0;
    }
    
    static float promrep(int v[][])
    {
        int suma = 0, contrep = 0;
        
        for (int f = 0; f < dim; f++){
            for (int c = 0; c < dim; c++) {
                if (v[f][c] < 50) {
                    suma += v[f][c];
                    contrep++;
                }
            }
        }
        
        if (suma!=0)
            return suma / contrep;
        else
            return 0;
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
    
    static float promdi(int v[][])
    {
        int suma = 0;
        for (int i=0; i < dim; i++)
        {
            suma += v[i][i];
        }
        
        return suma / dim;
    }
    
    static float promdd(int v[][])
    {
        int suma = 0, c=2;
        for (int f=0; f < 3; f++) {
                suma += v[f][c];
                c--;
        }
        return suma / dim;
    }
}
