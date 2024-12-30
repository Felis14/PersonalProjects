/*Desarrolle un proyecto de Aplicación en el lenguaje de programación Java que manipula un Arreglo
unidimensional (Vector) de tipo entero que almacena números enteros. El programa se maneja por
medio de un menú con las opciones que se muestran a continuación.
Menú Principal
1. Agregar datos al Vector
2. Reportar los datos del Vector
3. Consultar un dato del Vector (Indicando la posición donde está el número en el vector).
4. Modificar un dato del Vector (Permitiendo preguntar al usuario si desea modificar o no el
número).
5. Reportar los números pares del vector
6. Reportar los números impares del vector
7. Reportar Estadísticas
8. Reportar los datos del Vector en un rango dado por el usuario (Valor Mínimo – Valor Máximo)
9. Salir
• El tamaño del vector puede ser de 10 posiciones o 5 posiciones y la dimensión del vector tiene
que ser con una constante.
• Debe desarrollar las siguientes funciones que se tienen que llamar o invocar en un
procedimiento denominado reportar estadísticas, el cual se llama en la opción 7 del menú
principal.
• Función que recibe un vector entero como parámetro y devuelve el promedio de los
elementos (datos) del vector.
• Función que recibe un vector entero como parámetro y devuelve el promedio de los
elementos pares del vector.
• Función que recibe un vector entero como parámetro y devuelve el promedio de
elementos impares del vector.
• Función que recibe un vector entero como parámetro y devuelve el elemento menor
presente en el vector.
• Función que recibe un vector como parámetro y devuelve el elemento mayor presente
en el vector.
• Función que recibe un vector entero como parámetro y devuelve el promedio de los
elementos primos presente en el vector.
• Función que recibe un vector entero como parámetro y devuelve el promedio de los
elementos no primos presente en el vector.
• En la opción 8 debe desarrollar un procedimiento en donde el usuario digita un valor mínimo y
un valor máximo y de acuerdo a eso, en el procedimiento se reportan los datos del vector que
están entre ese valor mínimo y ese valor máximo, es decir los datos que están en ese rango
correspondiente.*/
package cotidiano5_ejercicio1;

import javax.swing.JOptionPane;

public class Cotidiano5_Ejercicio1 {
    //Constante global para el vector de 10 posiciones
    static final int vec[] = new int [10];
    
    //AlTrue siempre repite el ciclo, window es para quedarse en una función hasta salir de ella
    //confirms es para ocultar o mostrar los mensajes de "Dato ingresado"
    //window y stats es para que ciertas partes del menú aparezcan de nuevo al repetirse el ciclo sin tener
    //seleccionarlas desde el menu
    static int AlTrue=1, window=0, stats=0, confirms=0;
    
    //opc almacena la elección de las opciones de los menús
    static Object opc;
    
    public static void main(String[] args)
    {
        //AlTrue siempre se mantiene en 1, el programa SIEMPRE se va a repetir hasta elegir la opción salir
        do {
            menu();
        } while (AlTrue == 1);
    }
    
    static void menu()
    {
        //Crea las opciones del menú
        Object[] menu = {"Agregar datos al vector", "Reportar datos del vector", "Consultar datos del vector", "Modificar un dato", "Intercambiar posiciones",
        "Reportar números pares", "Reportar números impares", "Reportar estadísticas", "Reportar datos en un rango", "Salir"};
        
        //Si hay una ventana en función, salta la pregunta para volver a la opción anterior, hasta que el usuario cambie esto
        if (window == 0) {
            //Crea un mensaje con una lista desplegable con las opciones definidas en la parte de arriba
            opc = JOptionPane.showInputDialog(null, "Menú Principal\n•Agregar datos al vector"
            +"\n•Reportar datos del vector\n•Consultar datos del vector\n•Modificar un dato\n•Intercambiar posiciones\n•Reportar números pares"
            +"\n•Reportar números impares\n•Reportar estadísticas\n•Reportar datos en un rango\n•Salir\n\nSeleccione una opción", "Menu",
                        JOptionPane.QUESTION_MESSAGE, null, menu, menu[0]);
        }
        
        //Si el sub-menú de stats está abierto, opc siempre va a ser "Reportar estadísticas"
        if (stats == 1)
        {
            opc = "Reportar estadísticas";
        }
        
        //Hace una función según la opcion del menú
        if (opc == "Agregar datos al vector")
        {
            datos();
        }
        else if (opc == "Reportar datos del vector")
        {
            reporte();
        }
        else if (opc == "Consultar datos del vector")
        {
            consulta();
        }
        else if (opc == "Modificar un dato")
        {
            modify();
        }
        else if (opc == "Intercambiar posiciones")
        {
            switchpos();
        }
        else if (opc == "Reportar números pares")
        {
            reportpar();
        }
        else if (opc == "Reportar números impares")
        {
            reportimpar();
        }
        else if (opc == "Reportar estadísticas")
        {
            stats();
        }
        else if (opc == "Reportar datos en un rango")
        {
            range(vec);
        }
        else
            salir();
    }
    
    static void datos()
    {
        //Digita los números desde la posición 0 hasta la ultima posicion del vector
            for (int i=0; i < vec.length; i++)
            {
                //Almacena un valor en la posicion i del vector
                vec[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor a guardar en la posición "+(i+1)));
                
                //La variable confirms sirve para desactivar y activar los mensajes de confirmación
                //(Sirve para probar el código más rápido)
                if (confirms == 1)
                {
                    JOptionPane.showMessageDialog(null, "Dato en posición "+(i+1)+" guardado correctamente.",
                        "Dato registrado", JOptionPane.PLAIN_MESSAGE);
                }
            }
    }
    
    static void reporte()
    {
        //Arma el mensaje en una variable String mediante un ciclo for
        String msg = "Datos del vector\n\n";
            
        //Repite el ciclo según el tamaño del vector y arma el mensaje
        for (int i=0; i < vec.length; i++)
        {
            msg += "Dato en posición "+(i+1)+": "+vec[i]+"\n";
        }
        //Imprime el mensaje que se armó en la variable "msg"
        JOptionPane.showMessageDialog(null, msg, "Datos", JOptionPane.INFORMATION_MESSAGE);
    }
    
    static void consulta()
    {
        /*Window se activa para que la siguiente vez que se repita el menu
        esta funcion sea la que aparezca y no las opciones del menu*/
        window = 1;
        //pos almacena el indice del vector
        int pos;
        //Mensaje de input para leer que posición quiere leer el usuario
        //El ciclo se repite si no está entre el índice
        do {
            pos = Integer.parseInt(JOptionPane.showInputDialog(null, "Consultar dato por posición.              Si digita 0 volverá al menú"
                +"\n\nDigite la posición del número:",
                null, JOptionPane.QUESTION_MESSAGE));
            //Mensaje de error si el indice esta fuera del rango del vector
            if ((pos < 0)||(pos > vec.length))
                JOptionPane.showMessageDialog(null, "Número fuera de rango", "Error", JOptionPane.ERROR_MESSAGE);
        } while ((pos < 0)||(pos > vec.length));
        
        //Si pos es 0 vuelve al menú principal, window vuelve a 0 para que vuelva a aparecer el menú
        if (pos == 0)
        {
            window = 0;
        }
        else //Si no, pos se resta para que se acople al indice, que inicia desde 0 y reporta el valor
        {    //en esa posición
            pos -= 1;
            
            JOptionPane.showMessageDialog(null, "El dato en la posición "+(pos+1)+" es: "+vec[pos]);
        }
    }
    
    static void modify()
    {
        //Window se activa para que esta ventana se mantenga cada que el ciclo se repite
        window = 1;
        //mod almacena la posicion que se quiere modificar el valor
        int mod;
        //Variable para almacenar un mensaje
        String msg = "";
        //Ciclo que se repite segun el tamaño del vector (funcion .length) y arma el mensaje
        for (int i=0; i < vec.length; i++)
        {
            msg += "Dato en posición "+(i+1)+": "+vec[i]+"\n";
        }
        
        //Se repite el ciclo hasta que sea valido, que va del 0 al tamaño del vector
        do {
            //Usuario digita el indice que quiere modificar
            mod = Integer.parseInt(JOptionPane.showInputDialog(null, msg+"\nModificar un dato             Si digita 0 volverá al menú\n\n"
                    +"Digite la posición a modificar del vector: ", null, JOptionPane.QUESTION_MESSAGE));
            //Si mod es 0 vuelve al menu, window vuelve a 0
            if (mod == 0)
                window = 0;
            else if ((mod < 0)||(mod > vec.length)) //Error si esta fuera de rango
                JOptionPane.showMessageDialog(null, "Número fuera de rango", "Error", JOptionPane.ERROR_MESSAGE);
        } while ((mod < 0)||(mod > vec.length));
        //Si mod es mayor a cero, resta a mod 1 para que se acople al indice y arma el mensaje
        if (mod > 0) {
            mod -= 1;
        
            vec[mod] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digitar el valor - Posición: "+(mod+1)+"\n\nValor actual: "
                +vec[mod]+"\nDigite el valor nuevo: ", null, JOptionPane.QUESTION_MESSAGE));
        }
    }
    
    static void switchpos()
    {
        //Activa window para que se mantenga en esta opcion
        window = 1;
        //Almacena las dos posiciones, mas una posicion para lograr el cambio
        int pos1, pos2, cambio;
        //Crea una variable para almacenar el mensaje
        String msg = "";
        //Repite el ciclo segun el tamaño del vector
        for (int i=0; i < vec.length; i++)
        {   //Reporta los datos del vector para que el usuario controle mejor que posiciones quiere cambiar
            msg += "Dato en posición "+(i+1)+": "+vec[i]+"\n";
        }
        
        do { // almacena pos 1, solo permite ponerlo dentro del rango del vector
            pos1 = Integer.parseInt(JOptionPane.showInputDialog(null, msg+"\n\nSi digita 0 vuelve al menú\nDigite el valor que quiere cambiar de posición",
                null, JOptionPane.QUESTION_MESSAGE));
        } while ((pos1<0)||(pos1 > vec.length));
        
        //Si pos1 es 0 vuelve al menu
        if (pos1 == 0)
            window = 0;
        else
        {   //Si no, el usuario digita la posicion 2
            do {
                pos2 = Integer.parseInt(JOptionPane.showInputDialog(null, msg+"\n\nCambiar posición "+pos1+" con posición: ",
                    null, JOptionPane.QUESTION_MESSAGE));
                
                if ((pos2 < 1)||(pos2 > vec.length))
                    JOptionPane.showMessageDialog(null, "Número fuera de rango", "Error", JOptionPane.ERROR_MESSAGE);
            } while ((pos2 < 1)||(pos2 > vec.length));
            
            //Resta ambos valores para que se acople al indice que inicia en 0
            pos1 -= 1; pos2 -= 1;
            
            //Con esto se logra el cambio de posicion dentro del vector
            cambio = vec[pos1];
            vec[pos1] = vec[pos2];
            vec[pos2] = cambio;
            
            //Hace la funcion reporte para que el usuario visualice el cambio
            reporte();
        }
    }
    
    static void reportpar()
    {
        //Almacena el mensaje
        String msg = "";
            
        for (int i=0; i < vec.length; i++)
        {
            //El dato solo aparece en el mensaje si es par
            if (vec[i] % 2 == 0)
                msg += "Dato en posición "+(i+1)+" es par. Valor: "+vec[i]+"\n";
        }
        
        JOptionPane.showMessageDialog(null, "Datos pares en el vector: \n"+msg);
    }
    
    static void reportimpar()
    {
        //Almacena el mensaje
        String msg = "";
            
        for (int i=0; i < vec.length; i++)
        {
            //El dato solo aparece en el mensaje si es impar
            if (vec[i] % 2 != 0)
                msg += "Dato en posición "+(i+1)+" es impar. Valor: "+vec[i]+"\n";
        }
        
        JOptionPane.showMessageDialog(null, "Datos impares en el vector: \n"+msg);
    }
    
    static void stats()
    {
        //window es 1 y stats es uno para que siempre aparezca este mensaje
        window = 1;
        stats = 1;
        
        //Crea las opciones de un menú secundario
        Object[] menu = {"Promedio de todos los datos", "Promedio pares", "Promedio impares", "Dato menor del vector",
            "Dato mayor del vector", "Promedio números primos", "Promedio números no primos", "Volver"};
        
        //Crea un mensaje con una lista desplegable con las opciones definidas en la parte de arriba
        opc = JOptionPane.showInputDialog(null, "Menú de estadísticas\n•Promedio de todos los datos"
        +"\n•Promedio pares\n•Promedio impares\n•Dato menor del vector\n•Dato mayor del vector\n•Promedio números primos"
        +"\n•Promedio números no primos\n•Volver\n\nSeleccione una opción", "Menu",
                    JOptionPane.QUESTION_MESSAGE, null, menu, menu[0]);
        //Muestra un mensaje segun la opcion
        if (opc == "Promedio de todos los datos")
        {
            JOptionPane.showMessageDialog(null, "El promedio de los datos del vector es "+promtot(vec),
            "Promedio de todos", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (opc == "Promedio pares")
        {
            JOptionPane.showMessageDialog(null, "El promedio de los números pares dentro del vector es "+prompares(vec),
            "Promedio de pares", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (opc == "Promedio impares")
        {
            JOptionPane.showMessageDialog(null, "El promedio de los números impares dentro del vector es "+promimpares(vec),
            "Promedio de impares", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (opc == "Dato menor del vector")
        {
            JOptionPane.showMessageDialog(null, "El dato menor del vector "+menor(vec),
            "Número menor en el vector", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (opc == "Dato mayor del vector")
        {
            JOptionPane.showMessageDialog(null, "El dato mayor del vector "+mayor(vec),
            "Número mayor en el vector", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (opc == "Promedio números primos")
        {
            JOptionPane.showMessageDialog(null, "El promedio de los números primos dentro del vector es "+promprim(vec),
            "Promedio de primos", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (opc == "Promedio números no primos")
        {
            JOptionPane.showMessageDialog(null, "El promedio de los números no primos dentro del vector es "+promnoprim(vec),
            "Promedio de no primos", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            //Vuelve al menu
            window = 0;
            stats = 0;
        }
    }
    
    static void range(int v[])
    {
        //almacena un dato minimo y uno maximo, cambio sirve para cambiarlos de orden si
        //es que n1 es mayor a n2
        int n1, n2, cambio;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor mínimo: "));
        
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Valor mínimo: "+n1+"\n\nDigite el valor máximo: "));
        //Si n1 es mayor que n2, los cambia para que n1 sea el menor
        if (n1 > n2)
        {
            cambio = n1;
            n1 = n2;
            n2 = cambio;
        }
        
        //Arma el mensaje
        String msg = "";
        
        for (int i=0; i < vec.length; i++)
        {
            if ((v[i] >= n1)&&(v[i] <= n2))
                msg += "Dato en posición "+(i+1)+": "+vec[i]+"\n";
        }
        //Muestra el mensaje
        JOptionPane.showMessageDialog(null, "Datos entre el rango "+(n1)+" y "+(n2)+"\n\n"+msg);
    }
    
    static int promtot(int v[])
    {
        //Crea la variable suma
        int suma=0;
        //Mediante el ciclo for se suman todos los valores
        for (int i=0; i<v.length; i++)
        {
            suma += v[i];
        }
        //Devuelve el promedio
        return suma / vec.length;
    }
    
    static int prompares(int v[])
    {
        //Crea el acumulador y el contador
        int suma=0, pares=0;
        //Lo repite pero solo lo suma si son pares
        for (int i=0; i<v.length; i++)
        {
            if (v[i] % 2 == 0)
            {
                suma += v[i];
                pares++;
            }
        }
        //Si la division es posible, devuelve el promedio, si no, devuelve 0
        if (pares > 0)
            return suma / pares;
        else
            return 0;
    }
    
    static int promimpares(int v[])
    {
        //Acumulador y contador
        int suma=0, impares=0;
        //Se repite segun el tamaño del vector, solo se suma si los valores son impares
        for (int i=0; i<v.length; i++)
        {
            if (v[i] % 2 != 0)
            {
                suma += v[i];
                impares++;
            }
        }
        //Si la division es posible, devuelve el promedio, si no devuelve 0
        if (impares > 0)
            return suma / impares;
        else
            return 0;
    }
    
    static int menor(int v[])
    {
        //Inicia asignando el primer valor del indice al dato menor
        int menor = v[0];
        //For que se repite segun el tamaño del vector, inicia desde la segunda posicion
        for (int i=1; i<v.length; i++)
        {
            //Si el valor i del vector es menor al dato menor ya almacenado, actualiza el nuevo dato
            if (v[i] < menor)
                menor = v[i];
        }
        
        return menor;
    }
    
    static int mayor(int v[])
    {
        //Inicia asignando el primer valor del indice al dato mayor
        int mayor = v[0];
        //For que se repite segun el tamaño del vector, inicia desde la segunda posicion
        for (int i=1; i<v.length; i++)
        {
            //Si el valor i del vector es mayor al dato mayor ya almacenado, actualiza el nuevo dato
            if (v[i] > mayor)
                mayor = v[i];
        }
        return mayor;
    }
    
    static int promprim(int v[])
    {
        //Acumulador, contador y contador de divisiones en 0 para saber si es primo o no primo
        int suma=0, contprim=0, res0;
        //repite segun tamaño del vector
        for (int i=0; i<v.length; i++)
        {
            //Devuelve a 0 cada que va a verificar un dato del vector
            res0 = 0;
            //Se repite desde 1 hasta el mismo numero (para usar como divisores)
            for (int n=1; n <= v[i]; n++)
            {
                //Si se hace una division perfecta, suma la variable
                if (v[i] % n == 0)
                {
                    res0++;
                }
            }
            //Al terminar el ciclo, si la cantidad de veces que se dividio perfectamente
            //es 2 es porque es primo, acumula y cuenta para luego hacer el promedio
            if (res0 == 2)
            {
                suma += v[i];
                contprim++;
            }
        }
        //Si la division es posible, devuelve el promedio, si no devuelve 0
        if (contprim > 0)
            return suma / contprim;
        else
            return 0;
    }
    
    static int promnoprim(int v[])
    {
        //Lo mismo que la funcion anterior
        int suma=0, contnoprim=0, res0;
        
        for (int i=0; i<v.length; i++)
        {
            res0 = 0;
            for (int n=1; n <= v[i]; n++)
            {
                if (v[i] % n == 0)
                {
                    res0++;
                }
            }
            //La diferencia es que buscamos no primos, entonces usamos "!=" (diferente a)
            if (res0 != 2)
            {
                suma += v[i];
                contnoprim++;
            }
        }
        //Si la division es posible devuelve el promedio, si no devuelve 0 
        if (contnoprim > 0)
            return suma / contnoprim;
        else
            return 0;
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