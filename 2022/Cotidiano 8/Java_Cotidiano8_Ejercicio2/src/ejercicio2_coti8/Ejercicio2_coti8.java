package ejercicio2_coti8;

import javax.swing.JOptionPane;

public class Ejercicio2_coti8 {

    static class Nodo {

        int numventa;
        int tipoventa;
        float monto;
        Nodo siguiente;
    }

    //Define la variable lista global del tipo de la estructura nodo y la inicia en null
    static Nodo lista = null;

    //PROCEDIMIENTOS DESARROLLADOS 
    
    //Procedimiento que permite construir o crerar un nodo y lo agrega a la lista
    static void insertatipopila(int numeventa, int tipventa, float precio) 
    {

        //Define variable nueva de tipo Nodo, o sea, nuevo tiene las mismas características o atributos que tiene nodo 
        Nodo nuevo; //

        //Construye un nuevo nodo con los atributos de Nodo y ese nuevo nodo lo crea en la memoria del computador 
        nuevo = new Nodo();

        //Asigna a la parte dato del nuevo nodo, elparámetro x
        nuevo.numventa = numeventa;
        nuevo.tipoventa = tipventa;
        nuevo.monto = precio;
        nuevo.siguiente = null;

        //Este if permite preguntar si lista es null entonces el nodo que acaba de crear sería el primero nodo de la lista
        if (lista == null) {
            lista = nuevo;
        } else {
            //Aquí el puntero siguiente apunta a lista y enlaz el nuevo nodo
            nuevo.siguiente = lista;
            lista = nuevo;
            //Aquí lista señala a lo que está apuntando nuevo
        }
    }
    
    //Procedimiento para insertar datos en los nodos
    static void insertarventasenlistacomopila() {
        //variables locales del procedimiento
        int pnumero, ptipo;
        float pmonto;
        boolean respu;

        //Este ciclo permite leer datos mientras el usuario lo desee
        do {
            //Este ciclo es para validar que la identificacion no se repita en la lista
            do {
                pnumero = Integer.parseInt(JOptionPane.showInputDialog("Ingresando datos a la lista como pila: "
                        + "\n\nDigite el numero de venta a almacenar: "));

                if (validarventa(lista, pnumero) == 1) {
                    JOptionPane.showMessageDialog(null, "Este numero de venta ya existe\n Digite otro", "Venta", JOptionPane.ERROR_MESSAGE);
                }
            } while (validarventa(lista, pnumero) == 1);

            do {
                ptipo = Integer.parseInt(JOptionPane.showInputDialog("Ingresando datos a la lista como pila"
                        + "\n\nDigite el tipo de venta:"
                        + "\n1. Contado"
                        + "\n2. Credito"));

                //este if  es para determinar los valores de los datos dentro del rango permitido
                if ((ptipo < 1) || (ptipo > 2)) {
                    JOptionPane.showMessageDialog(null, "Tipo incorrecto, no esta dentro del rango");
                }

            } while ((ptipo < 1) || (ptipo > 2));

            pmonto = Float.parseFloat(JOptionPane.showInputDialog("Ingresando datos a la lista como pila: "
                    + "\n\nDigite el monto de la venta: "));

            //Aqui inserta en el nodo los datos que digita el usuario cpn el procedimiento inserta tipo pila
            insertatipopila(pnumero, ptipo, pmonto);

            JOptionPane.showMessageDialog(null, "Datos almacenados correctamente..");

            //aqui lee la respuesta del usuario si quiere digitar datos nuevos
            respu = JOptionPane.showConfirmDialog(null, "Continuar agregando datos a la lista?") == JOptionPane.OK_OPTION;

        } while (respu == true);
    }

    //Este procedimiento permite reportar los datos guardado en cada uno de los nodos de la lista
    static void reportarventaslista(Nodo temp) {
        String salida = "";

        //aqui temp hace lo mismo que esta haciendo lista
        temp = lista;

        if (temp == null) {
            JOptionPane.showMessageDialog(null, "Lista esta vacia");
        } else {
            salida += "Los datos de las ventas son: \n";

            //aqui se imprimen los datos de la lista
            salida += "Numero   " + "   Tipo   " + "    Monto\n";
        }

        //Ciclo para imprimir los datos de los nodos 
        while (temp != null) {
            salida += temp.numventa + "     " + temp.tipoventa + "     " + temp.monto + "\n";

            //mueve temp al siguiente nodo de la lista
            temp = temp.siguiente;
        }
        JOptionPane.showMessageDialog(null, salida);

    }

    //Procedimiento que permite consula un dato en el nodo
    static void buscarventas(Nodo temp) {
        int datoabuscar;
        int encontrado = 0;

        temp = lista;

        datoabuscar = Integer.parseInt(JOptionPane.showInputDialog("Modificando datos en la lista"
                + "\nDigite dato a buscar:"));

        if (temp == null) {
            JOptionPane.showMessageDialog(null, "Lista esta vacia");
        } else {
            while (temp != null) {
                if (temp.numventa == datoabuscar) {
                    encontrado = 1;
                    JOptionPane.showMessageDialog(null, "Condultando un dato en la lista"
                            + "\nDato encontrado es: " + temp.numventa);

                    JOptionPane.showMessageDialog(null, "Sus datos son"
                            + "\nNumero de venta: " + temp.numventa
                            + "\nTipo de venta: " + temp.tipoventa
                            + "\nMonto de la venta: " + temp.monto);

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

    //Procedimiento que recibe una lista como parametro y elimina el primer nodo de la lista
    static void eliminaprimernodolista(Nodo temp) {
        //Aqui temp hace lo mismo que esta haciendo lista
        temp = lista;

        if (temp == null) {
            JOptionPane.showMessageDialog(null, "Lista esta vacia");
        } else //Quiere decir que si hay datos y si puede eliminar
        {
            if (JOptionPane.showConfirmDialog(null, "Eliminando datos de la lista "
                    + "\nDato a eliminar: " + temp.numventa
                    + "\n\nEsta seguro (a) de eliminar el nodo?") == JOptionPane.OK_OPTION) {
                //Aqui lista se mueve al siguiente nodo por medio del puntero siguiente y asi lista estaria ubicada apuntando al nodo
                //que está después del primer nodo
                lista = temp.siguiente;

                //Le asigna a la siguiente posicion null para que no le pregunte si lo quiere cambiar
                temp = null;

                JOptionPane.showMessageDialog(null, "Nodo ha sido eliminado correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Nodo no ha sido eliminado correctamente");
            }
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
           while (temp != null){
               
               do{
                    //Imprime cada dato del nodo en salida
                    if ((temp.monto >= minimo) && (temp.monto <= maximo)) {
                        salida += temp.monto;
                        salida += "\n";
                    }     
               }while(!(temp.monto >= minimo) && !(temp.monto <= maximo));
               
               //Aquí temp se cambia o se mueve al siguiente nodo
               temp = temp.siguiente;
           }
           JOptionPane.showMessageDialog(null,salida);
        }
    }  
    
    //Procedimiento que reporta los datos tipo contado
    static void reportarcontados(Nodo temp)
    {
        String salida = "";

        //aqui temp hace lo mismo que esta haciendo lista
        temp = lista;

        if (temp.tipoventa == 1)
        {   
            if (temp == null) {
                JOptionPane.showMessageDialog(null, "Lista esta vacia");
            } else {
                salida += "Los datos de las ventas tipo contado son: \n";

                //aqui se imprimen los datos de la lista
                salida += "Numero   " + "   Tipo   " + "    Monto\n";
            }

            //Ciclo para imprimir los datos de los nodos 
            while (temp != null) {
                salida += temp.numventa + "     " + temp.tipoventa + "     " + temp.monto + "\n";

                //mueve temp al siguiente nodo de la lista
                temp = temp.siguiente;
            }
            JOptionPane.showMessageDialog(null, salida);
        }
    }
    
    //Procedimiento que reporta los datos tipo credito
    static void reportarcreditos(Nodo temp)
    {
        String salida = "";

        //aqui temp hace lo mismo que esta haciendo lista
        temp = lista;

        if (temp.tipoventa == 2)
        {   
            if (temp == null) {
                JOptionPane.showMessageDialog(null, "Lista esta vacia");
            } else {
                salida += "Los datos de las ventas tipo crédito son: \n";

                //aqui se imprimen los datos de la lista
                salida += "Numero   " + "   Tipo   " + "    Monto\n";
            }

            //Ciclo para imprimir los datos de los nodos 
            while (temp != null) {
                salida += temp.numventa + "     " + temp.tipoventa + "     " + temp.monto + "\n";

                //mueve temp al siguiente nodo de la lista
                temp = temp.siguiente;
            }
            JOptionPane.showMessageDialog(null, salida);
        }
    }
    
    //FUNCIONES DESARROLLADAS
    
    //Función para calcular el promedio de ventas
    static float promedioventas(Nodo temp) {

        float sumaventas = 0;//Acumulador 
        int cannodos = 0;//contador

        //aqui temp señala o apunta al primer nodo de la lista
        temp = lista;

        if (temp == null) {
            return 0;
        } else//Si no es porque hay datos en la lista
        {
            //Este ciclo recorre todos los nodos de la lista
            while (temp != null) {
                sumaventas += temp.monto;
                cannodos++;

                //Avanza el puntero al siguete nodo de la lista
                temp = temp.siguiente;
            }
        }
        //este if es para saber si acumulo datos en el acumulador
        if (sumaventas > 0) {
            return sumaventas / cannodos;
        } else {
            return 0;
        }
    }

    //Función para calcular el promedio de ventas tipo contado
    static float promedioventascontado(Nodo temp) {

        float sumaventascontado = 0;//Acumulador 
        int contcontado = 0;//contador

        //aqui temp señala o apunta al primer nodo de la lista
        temp = lista;

        if (temp == null) {
            return 0;
        } else//Si no es porque hay datos en la lista
        {
            //Este ciclo recorre todos los nodos de la lista
            while (temp != null) {
                if (temp.tipoventa == 1) {
                    sumaventascontado += temp.monto;
                    contcontado++;
                }

                //Avanza el puntero al siguete nodo de la lista
                temp = temp.siguiente;
            }
        }
        //este if es para saber si acumulo datos en el acumulador
        if (sumaventascontado > 0) {
            return sumaventascontado / contcontado;
        } else {
            return 0;
        }
    }
    
    //Función para calcular el promedio de ventas tipo crédito
    static float promedioventascredito(Nodo temp) {

        float sumaventascredito = 0;//Acumulador 
        int contcredito = 0;//Contador

        //Aqui temp señala o apunta al primer nodo de la lista
        temp = lista;

        if (temp == null) {
            return 0;
        } else//Si no es porque hay datos en la lista
        {
            //Este ciclo recorre todos los nodos de la lista
            while (temp != null) {
                if (temp.tipoventa == 2) {
                    sumaventascredito += temp.monto;
                    contcredito++;
                }

                //Avanza el puntero al siguete nodo de la lista
                temp = temp.siguiente;
            }
        }
        //este if es para saber si acumulo datos en el acumulador
        if (sumaventascredito > 0) {
            return sumaventascredito / contcredito;
        } else {
            return 0;
        }
    }

    //funcion que recibe una lista como parametro y una identificacion a buscar en la lista
    static int validarventa(Nodo temp, int numventa) {
        //Aqui partimos del supuesto de la ide no esta, entonces por eso se le asigna 0 a encontrado
        int encontrado = 0;

        //Aqui temp hace lo mismo que lista, es decir apunta al primer nodo de la lista
        temp = lista;

        //Si temp es null porque está vacia la lista 
        if (temp == null) {
            return 0;
        } else //Hay datos y se buscan el ide en toda la lista
        {
            //ciclo para recorrer toda la lista
            while (temp != null) {
                //Aqui compara id de la estructura nodo con ide que es la identificacion a buscar
                if (temp.numventa == numventa) {
                    //Aqui encontrado se le asigna uno porque encontro una identificación igual a temp se asigna null 
                    //para que no se cumpla más el ciclo y break para interrumpir el ciclo
                    encontrado = 1;
                    temp = null;
                    break;
                }
                temp = temp.siguiente;//Para acceder al siguiente nodo
            }
        }
        return encontrado;
    }
    
     //funcion que recibe una lista como parametro y devulve el elemento mayor de la lista
    static float mayor(Nodo temp) {
        //Variable local donde se va a guardar el numero mayor
        float mayor;

        //Aqui temp hace lo mismo que lista
        temp = lista;

        if (temp == null) {
            return 0;
        } else {
            mayor = temp.monto;//Asigna a menor el primer dato de la lista partiendo del supuesto de que el mayor esta en el primer nodo

            //Ciclo que recorre todos los nodos de la lista
            while (temp != null) {
                if (mayor <= temp.monto)//Compara el primer dato con el siguiente
                {
                    mayor = temp.monto;//Actualiza el mayo con el dato del nodo actual
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
        float menor;

        //Aqui temp hace lo mismo que lista
        temp = lista;

        if (temp == null) {
            return 0;
        } else {
            menor = temp.monto;//Asigna a menor el primer dato de la lista partiendo del supuesto de que el menor esta en el primer nodo

            //Ciclo que recorre todos los nodos de la lista
            while (temp != null) {
                if (menor >= temp.monto)//Compara el primer dato con el siguiente
                {
                    menor = temp.monto;//Actualiza el menor con el dato del nodo actual
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
   
    //Muestra un menu estadaisticas al usuario
    static void menustats() {
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "Menu Principal "
                    + "\n1 = Promedio de todos los montos"
                    + "\n2 = Promedio de montos tipo Contado"
                    + "\n3 = Promedio de montos tipo Crédito"
                    + "\n4 = Monto de venta mayor"
                    + "\n5 = Monto de venta menor"
                    + "\n6 = Salir"));

            //Switch para escoger el procedimiento a realizar
            switch (op) {
                case 1: {
                    JOptionPane.showMessageDialog(null,"El promedio de las ventas es: "+promedioventas(lista));
                }
                break;
                case 2: {
                    JOptionPane.showMessageDialog(null,"El promedio de las ventas tipo Contado es: "+promedioventascontado(lista));
                }
                break;
                case 3: {
                    JOptionPane.showMessageDialog(null,"El promedio de las ventas tipo Crédito es: "+promedioventascredito(lista));
                }
                break;
                case 4: {
                    JOptionPane.showMessageDialog(null,"La venta con el monto mayor es: "+mayor(lista));
                }
                break;
                case 5: {
                    JOptionPane.showMessageDialog(null,"La venta con el monto menor es: "+menor(lista));
                }
                break;
            }
        } while ((op >= 1) && (op < 6)); //Condición del ciclo
    }

    //Procedimiento que muestra el menu principal al usuario
    static void menuprincipal() {
        int op;
        do {
            //AquÃ­ le sale el menÃº de opciones al usuario
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "Menu Principal "
                    + "\n1 = Agregar Ventas a la lista tipo Pila"
                    + "\n2 = Reportar todas las Ventas almacenadas"
                    + "\n3 = Buscar una Venta"
                    + "\n4 = Eliminar la Venta del inicio"
                    + "\n5 = Reportar Estadísticas"
                    + "\n6 = Reportar todas las ventas en un rango"        
                    + "\n7 = Reportar las ventas de tipo contado"
                    + "\n8 = Reportar las ventas de tipo crédito"
                    + "\n9 = Salir"));

            //Switch para escoger el procedimiento a realizar
            switch (op) {
                case 1: {
                    insertarventasenlistacomopila();
                }
                break;
                case 2: {
                    reportarventaslista(lista);
                }
                break;
                case 3: {
                    buscarventas(lista);
                }
                break;
                case 4: {
                    eliminaprimernodolista(lista);
                }
                break;
                case 5: {
                    //repoooooort
                }
                break;
                case 6: {
                    rangousuario(lista);
                }
                break;
                case 7: {
                }
                break;
                case 8: {
                }
                break;
            }
        } while ((op >= 1) && (op < 9)); //Condición del ciclo
    }

    public static void main(String[] args) {

        menuprincipal();
        System.exit(0);
    }
}