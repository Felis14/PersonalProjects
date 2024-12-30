package ejercicio1_coti8;

import javax.swing.JOptionPane;

public class Ejercicio1_coti8 {

    //define la estructura que va a tener cada nodo de la lista
    static class Nodo {

        int nota;//en este campo se guardaria la nota
        Nodo siguiente;//Campo puntero para enlazar un nodo con el siguiente
    }

    //Define la variable global lista de tipo Nodo y la inicia en null. Esta variable lista es la variable global que tienen toda la lusta de Nodos
    static Nodo lista = null;

     //PROCEDIMIENTOS DESARROLLADOS

    //Procedimiento que permite construir o crear un nodo
    static void insertatipopila(int x) {

        //Define variable nueva de tipo Nodo, o sea, nuevo tiene las mismas características o atributos que tiene nodo 
        Nodo nuevo; //

        //Construye un nuevo nodo con los atributos de Nodo y ese nuevo nodo lo crea en la memoria del computador 
        nuevo = new Nodo();

        //Asigna a la parte dato del nuevo nodo, elparámetro x
        nuevo.nota = x;
        nuevo.siguiente = null;

        //eSTE if permite preguntar si lista es null entonces el nodo que acaba de crear sería el primero nodo de la lista
        if (lista == null) {
            lista = nuevo;
        } else {
            //Aquí el puntero siguiente apunta a lista y enlaz el nuevo nodo
            nuevo.siguiente = lista;
            lista = nuevo;
            //Aquí lista señala a lo que está apuntando nuevo
        }

    }

    //Procedimiento que permite que el usuario digite los datos que se van a insertar en cada uno de los nodos de la lista
    static void insertardatos() {
        //Variables locales del procedimiento
        int num;
        boolean respu;

        //Este ciclo permite leer datos mientras el usuario lo desee
        do {

            do {
                num = Integer.parseInt(JOptionPane.showInputDialog("Ingresando datos a la lista como pila: "
                        + "\n\nDigite número a agregar: "));

                //este if  es para determinar los valores de los datos dentro del rango permitido
                if ((num < 1) || (num > 100)) {
                    JOptionPane.showMessageDialog(null, "Nota incorrecta, no esta dentro del rango");
                }

            } while ((num < 1) || (num > 100));

            //Aquí inserta el número que digita eñ usuario en cada Nodo con el procedimiento insertatipopila
            insertatipopila(num);

            //Aquí lee la respuesta del usuario si digita quiere digitar nuevos datos
            JOptionPane.showMessageDialog(null, "Dato almacenado correctamente...");

            if (num >= 70) {
                JOptionPane.showMessageDialog(null, "Su nota es aprobada");
            } else if (num < 70 && num >= 50) {
                JOptionPane.showMessageDialog(null, "Su nota es aplazada");
            } else {
                JOptionPane.showMessageDialog(null, "Su nota es reprobada");
            }

            respu = JOptionPane.showConfirmDialog(null, "Continua agregando datos a la lista? ") == JOptionPane.OK_OPTION;
        } while (respu == true);

    }

    //Procedimiento que permite reportar los elementos de los nodos de la litsa
    static void reportadatoslista(Nodo temp) {
        //Define variablesalida y la inicia en blanco
        String salida = "";

        //Aquí temp hace lo mismo que está haciendo lista, que es señalar al primer nodo de la lista
        temp = lista;

        if (temp == null) {
            JOptionPane.showMessageDialog(null, "La lista está vacía");
        } else //Si temp no es null es pq la lista tiene datos  
        {
            salida += "Los elementos de la lista son: \n";

            //este ciclo permite recorrer todos los Nodos de la lista para imprimir los elementos de cada nodo
            while (temp != null) {
                //Imprime cada dato del nodo en salida
                salida += temp.nota;
                salida += "\n";
                //Aquí temp se cambia o se mueve al siguiente nodo 
                temp = temp.siguiente;
            }
            JOptionPane.showMessageDialog(null, salida);
        }
    }

    //Procedimiento que permite consula un dato en el nodo
    static void consultardatos(Nodo temp) {
        int datoabuscar;
        int encontrado = 0;

        temp = lista;

        datoabuscar = Integer.parseInt(JOptionPane.showInputDialog("Modificando datos en la lista"
                + "\nDigite dato a buscar:"));

        if (temp == null) {
            JOptionPane.showMessageDialog(null, "Lista esta vacia");
        } else {
            while (temp != null) {
                if (temp.nota == datoabuscar) {
                    encontrado = 1;
                    JOptionPane.showMessageDialog(null, "Condultando un dato en la lista"
                            + "\nDato encontrado es: " + temp.nota);

                    temp = null;
                    break;
                }
                temp = temp.siguiente;
            }
        }
        if (encontrado == 0) {
            JOptionPane.showMessageDialog(null, "Numero " + datoabuscar + " no encontrado");
        }
    }

    //Procedimiento que permite modificar un dato en la lista
    static void modificardato(Nodo temp) {
        //Variables locales del procedimiento
        int datoabuscar, nuevodato;
        int encontrado = 0;

        //Inicia encontrado en 0, porque vamos a suponer que el dato no esta encontradp
        //Aqui temp hace lo mismo que esta haciendo lista
        temp = lista;

        datoabuscar = Integer.parseInt(JOptionPane.showInputDialog("Modificando datos en la lista"
                + "\nDigite dato a buscar:"));

        if (temp == null) {
            JOptionPane.showMessageDialog(null, "Lista esta vacia");
        } else {
            while (temp != null)//Ciclo que recorre todos los nodos de la lista
            {
                if (temp.nota == datoabuscar)//aqui compara el dato en el nodo con el dato a buscar
                {
                    encontrado = 1;
                    JOptionPane.showMessageDialog(null, "Dato encontrado es: " + temp.nota);

                    if (JOptionPane.showConfirmDialog(null, "Esta seguro(a) de modificar el dato en el nodo?") == JOptionPane.OK_OPTION) {
                        nuevodato = Integer.parseInt(JOptionPane.showInputDialog("Modificando datos en la lista"
                                + "\nDigite el nuevo dato"));

                        temp.nota = nuevodato;//aqui actualiza el dato del noto con el nuevo dato

                        JOptionPane.showMessageDialog(null, "Dato modificado correctamente");

                        temp = null;//asigna null a temp para que cuando vuelva al ciclo ya no se cumpla más veces el ciclo
                        break;//interrumpe el ciclo
                    } else {
                        JOptionPane.showMessageDialog(null, "Dato no ha sido modificado");

                        temp = null;
                        break;
                    }
                }
                //avanza al siguiente nodo de la lists
                temp = temp.siguiente;
            }//Termina el ciclo
        }
        if (encontrado == 0) {
            JOptionPane.showMessageDialog(null, "Numero " + datoabuscar + " no encontrado");
        }
    }

    //Procedimiento que permite reportar los elementos de los nodos de la litsa
    static void rangousuario(Nodo temp) {

        int maximo, minimo;

        //Define variablesalida y la inicia en blanco
        String salida = "";

        //Aquí temp hace lo mismo que está haciendo lista, que es señalar al primer nodo de la lista
        temp = lista;

        if (temp == null) {
            JOptionPane.showMessageDialog(null, "La lista está vacía");
        } else //Si temp no es null es pq la lista tiene datos  
        {
            //Se le solicita al usuario que digite un numero minimo para el rango
            minimo = Integer.parseInt(JOptionPane.showInputDialog("Digite la nota minima que quiere para su rango"));

            //se le solicita al usuario un numero maximo para el rango
            maximo = Integer.parseInt(JOptionPane.showInputDialog("Digite la nota maxima que quiere para su rango"));

            salida = "Los elementos de la lista son: \n";

            //este ciclo permite recorrer todos los Nodos de la lista para imprimir los elementos de cada nodo
            while (temp != null) {

                do {
                    //Imprime cada dato del nodo en salida
                    if ((temp.nota >= minimo) && (temp.nota <= maximo)) {
                        salida += temp.nota;
                        salida += "\n";
                    }
                } while (!(temp.nota >= minimo) && !(temp.nota <= maximo));

                //Aquí temp se cambia o se mueve al siguiente nodo
                temp = temp.siguiente;
            }
            JOptionPane.showMessageDialog(null, salida);
        }
    }

    //Procedimiento que permite reportar los elementos de los nodos de la litsa
    static void reportadatoslistaaprobados(Nodo temp) {
        //Define variablesalida y la inicia en blanco
        String salida = "";

        //Aquí temp hace lo mismo que está haciendo lista, que es señalar al primer nodo de la lista
        temp = lista;

        if (temp == null) {
            JOptionPane.showMessageDialog(null, "La lista está vacía");
        } else //Si temp no es null es pq la lista tiene datos  
        {
            salida += "Los elementos de la lista son: \n";

            //este ciclo permite recorrer todos los Nodos de la lista para imprimir los elementos de cada nodo
            while (temp != null) {

                if (temp.nota >= 70) {
                    //Imprime cada dato del nodo en salida
                    salida += temp.nota;
                    salida += "\n";
                }
                //Aquí temp se cambia o se mueve al siguiente nodo 
                temp = temp.siguiente;
            }
            JOptionPane.showMessageDialog(null, salida);
        }
    }

    //Procedimiento que permite reportar los elementos de los nodos de la litsa
    static void reportadatoslistaaplazados(Nodo temp) {
        //Define variablesalida y la inicia en blanco
        String salida = "";

        //Aquí temp hace lo mismo que está haciendo lista, que es señalar al primer nodo de la lista
        temp = lista;

        if (temp == null) {
            JOptionPane.showMessageDialog(null, "La lista está vacía");
        } else //Si temp no es null es pq la lista tiene datos  
        {
            salida += "Los elementos de la lista son: \n";

            //este ciclo permite recorrer todos los Nodos de la lista para imprimir los elementos de cada nodo
            while (temp != null) {

                if ((temp.nota < 70) && (temp.nota >= 50)) {
                    //Imprime cada dato del nodo en salida
                    salida += temp.nota;
                    salida += "\n";
                }
                //Aquí temp se cambia o se mueve al siguiente nodo 
                temp = temp.siguiente;
            }
            JOptionPane.showMessageDialog(null, salida);
        }
    }

    //Procedimiento que permite reportar los elementos de los nodos de la litsa
    static void reportadatoslistareprobados(Nodo temp) {
        //Define variablesalida y la inicia en blanco
        String salida = "";

        //Aquí temp hace lo mismo que está haciendo lista, que es señalar al primer nodo de la lista
        temp = lista;

        if (temp == null) {
            JOptionPane.showMessageDialog(null, "La lista está vacía");
        } else //Si temp no es null es pq la lista tiene datos  
        {
            salida += "Los elementos de la lista son: \n";

            //este ciclo permite recorrer todos los Nodos de la lista para imprimir los elementos de cada nodo
            while (temp != null) {

                if (temp.nota < 50) {
                    //Imprime cada dato del nodo en salida
                    salida += temp.nota;
                    salida += "\n";
                }
                //Aquí temp se cambia o se mueve al siguiente nodo 
                temp = temp.siguiente;
            }
            JOptionPane.showMessageDialog(null, salida);
        }
    }


     //FUNCIONES A DESARROLLAR
    
    //Funcion que obtiene el promedio de todos los datos
    static float promedios(Nodo temp) {

        float sumanotas = 0;//Acumulador 
        int cannodos = 0;//contador

        //aqui temp señala o apunta al primer nodo de la lista
        temp = lista;

        if (temp == null) {
            return 0;
        } else//Si no es porque hay datos en la lista
        {
            //Este ciclo recorre todos los nodos de la lista
            while (temp != null) {
                sumanotas += temp.nota;
                cannodos++;

                //Avanza el puntero al siguete nodo de la lista
                temp = temp.siguiente;
            }
        }
        //este if es para saber si acumulo datos en el acumulador
        if (sumanotas > 0) {
            return sumanotas / cannodos;
        } else {
            return 0;
        }
    }
    
    //Funcion que obtiene el promedio de las notas aprobadas
    static float promediosaprobados(Nodo temp) {

        float sumanotasaprobadas = 0;//Acumulador 
        int cannodosaprobados = 0;//contador

        //aqui temp señala o apunta al primer nodo de la lista
        temp = lista;

        if (temp == null) {
            return 0;
        } else//Si no es porque hay datos en la lista
        {
            //Este ciclo recorre todos los nodos de la lista
            while (temp != null) {
                if (temp.nota >= 70) {
                    sumanotasaprobadas += temp.nota;
                    cannodosaprobados++;
                }
                //Avanza el puntero al siguete nodo de la lista
                temp = temp.siguiente;
            }
        }
        //este if es para saber si acumulo datos en el acumulador
        if (sumanotasaprobadas > 0) {
            return sumanotasaprobadas / cannodosaprobados;
        } else {
            return 0;
        }
    }
    
    //Funcion que obtiene el promedio de las notas aplazadas
    static float promediosaplazados(Nodo temp) {

        float sumanotasaplazadas = 0;//Acumulador 
        int cannodosaplazados = 0;//contador

        //aqui temp señala o apunta al primer nodo de la lista
        temp = lista;

        if (temp == null) {
            return 0;
        } else//Si no es porque hay datos en la lista
        {
            //Este ciclo recorre todos los nodos de la lista
            while (temp != null) {
                if (temp.nota < 70 && temp.nota >= 50) {
                    sumanotasaplazadas += temp.nota;
                    cannodosaplazados++;
                }
                //Avanza el puntero al siguete nodo de la lista
                temp = temp.siguiente;
            }
        }
        //este if es para saber si acumulo datos en el acumulador
        if (sumanotasaplazadas > 0) {
            return sumanotasaplazadas / cannodosaplazados;
        } else {
            return 0;
        }
    }
    
    //Funcion que obtiene el promedio de las notas reprobadas
    static float promediosreprobados(Nodo temp) {

        float sumanotasreprobadas = 0;//Acumulador 
        int cannodosreprobados = 0;//contador

        //aqui temp señala o apunta al primer nodo de la lista
        temp = lista;

        if (temp == null) {
            return 0;
        } else//Si no es porque hay datos en la lista
        {
            //Este ciclo recorre todos los nodos de la lista
            while (temp != null) {
                if (temp.nota < 50) {
                    sumanotasreprobadas += temp.nota;
                    cannodosreprobados++;
                }
                //Avanza el puntero al siguete nodo de la lista
                temp = temp.siguiente;
            }
        }
        //este if es para saber si acumulo datos en el acumulador
        if (sumanotasreprobadas > 0) {
            return sumanotasreprobadas / cannodosreprobados;
        } else {
            return 0;
        }
    }

    //funcion que recibe una lista como parametro y devulve el elemento mayor de la lista
    static float mayor(Nodo temp) {
        //Variable local donde se va a guardar el numero mayor
        int mayor;

        //Aqui temp hace lo mismo que lista
        temp = lista;

        if (temp == null) {
            return 0;
        } else {
            mayor = temp.nota;//Asigna a menor el primer dato de la lista partiendo del supuesto de que el mayor esta en el primer nodo

            //Ciclo que recorre todos los nodos de la lista
            while (temp != null) {
                if (mayor <= temp.nota)//Compara el primer dato con el siguiente
                {
                    mayor = temp.nota;//Actualiza el mayo con el dato del nodo actual
                }
                temp = temp.siguiente;
            }
        }
        if (mayor != 0) {
            return mayor;
        } else {
            return 0;
        }
    }

    //funcion que recibe una lista como parametro y devulve el elemento menor de la lista
    static float menor(Nodo temp) {
        //Variable local donde se va a guardar el numero menor
        int menor;

        //Aqui temp hace lo mismo que lista
        temp = lista;

        if (temp == null) {
            return 0;
        } else {
            menor = temp.nota;//Asigna a menor el primer dato de la lista partiendo del supuesto de que el menor esta en el primer nodo

            //Ciclo que recorre todos los nodos de la lista
            while (temp != null) {
                if (menor >= temp.nota)//Compara el primer dato con el siguiente
                {
                    menor = temp.nota;//Actualiza el menor con el dato del nodo actual
                }
                temp = temp.siguiente;
            }
        }
        if (menor != 0) {
            return menor;
        } else {
            return 0;
        }
    }
    
    //Muestra un menu estadisticas al usuario
    static void menustats() {
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "Menu Principal "
                    + "\n1 = Promedio de las notas almacenadas"
                    + "\n2 = Promedio de las notas aprobadas"
                    + "\n3 = Promedio de las notas aplazadas"
                    + "\n4 = Promedio de las notas reprobadas"
                    + "\n5 = Nota mayor"
                    + "\n6 = Nota menor"
                    + "\n7 = Salir"));

            //Switch para escoger el procedimiento a realizar
            switch (op) {
                case 1: {
                    JOptionPane.showMessageDialog(null,"El promedio de las notas almacenadas es: "+promedios(lista));
                }
                break;
                case 2: {
                    JOptionPane.showMessageDialog(null,"El promedio de las notas aprobadas es: "+promediosaprobados(lista));
                }
                break;
                case 3: {
                    JOptionPane.showMessageDialog(null,"El promedio de las notas aplazadas es: "+promediosaplazados(lista));
                }
                break;
                case 4: {
                    JOptionPane.showMessageDialog(null,"El promedio de las notas reprobadas es: "+promediosreprobados(lista));
                }
                break;
                case 5: {
                    JOptionPane.showMessageDialog(null,"La nota mayor es: "+mayor(lista));
                }
                break;
                case 6: {
                    JOptionPane.showMessageDialog(null,"La nota menor es: "+menor(lista));                }
                break;
            }
        } while ((op >= 1) && (op < 7)); //Condición del ciclo
    }

    //Muestra un menú principal al usuario
    static void menuprincipal() {
        int op;
        do {
            //AquÃ­ le sale el menÃº de opciones al usuario
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "Menu Principal "
                    + "\n1 = Insertar datos en la lista"
                    + "\n2 = Reportar datos de la lista"
                    + "\n3 = Consultar datos"
                    + "\n4 = Modificar datos"
                    + "\n5 = Reportar estadisticas"
                    + "\n6 = Rango usuario"
                    + "\n7 = Reportar aprobados"
                    + "\n8 = Reportar aplazados"
                    + "\n9 = Reportar reprobados"
                    + "\n10 = Salir"));

            //Switch para escoger el procedimiento a realizar
            switch (op) {
                case 1: {
                    insertardatos();
                }
                break;
                case 2: {
                    reportadatoslista(lista);
                }
                break;
                case 3: {
                    consultardatos(lista);
                }
                break;
                case 4: {
                    modificardato(lista);
                }
                break;
                case 5: {
                    menustats();
                }
                break;
                case 6: {
                    rangousuario(lista);
                }
                break;
                case 7: {
                    reportadatoslistaaprobados(lista);
                }
                break;
                case 8: {
                    reportadatoslistaaplazados(lista);
                }
                break;
                case 9: {
                    reportadatoslistareprobados(lista);
                }
                break;
            }
        } while ((op >= 1) && (op < 10)); //Condición del ciclo
    }

    public static void main(String[] args) {

        menuprincipal();
        System.exit(0);

    }

}
