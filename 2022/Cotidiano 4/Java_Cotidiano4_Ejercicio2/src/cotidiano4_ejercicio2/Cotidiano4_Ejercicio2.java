 /*Realice un programa que procesa vehículos que circulan por un peaje en una autopista, mientras el
usuario lo desee. En el programa debe desarrollar los procedimientos que se detallan a continuación.
 La lectura y procesamiento de los datos de los vehículos lo debe hacer en un procedimiento donde
le va preguntando al usuario para cada vehículo que circula por el peaje los siguientes datos: tipo
de vehículo (de 1 a 4) y el número de caseta (de 1 a 3) por donde circula el vehículo. Cuando se
va a digitar el tipo de vehículo debe mostrarle al usuario los tipos de vehículos (1=Motos, 2=Livianos,
3=Pesado, 4=Más 2 Toneladas), así también cuando se solicita el número de caseta mostrarle al
usuario las casetas disponibles (1=Caseta1, 2 = Caseta2, 3 = Caseta3). Es importante que al leer el
tipo de vehículo y el número de caseta se muestre un pequeño menú al usuario de las posibles
alternativas a seleccionar en cada uno de los casos correspondientes. Los montos que pagan los
vehículos de acuerdo con el tipo de vehículo se manejan en constantes de la siguiente manera:
MOTOS=200, LIVIANOS=600; PESADOS=900, MAS2TONE=1200. Al procesar cada tipo de vehículo, el
programa debe mostrarle al usuario en un mensaje cuanto es el monto que debe pagar de
acuerdo con el tipo de vehículo y el usuario debe digitar con cuánto dinero paga el cliente y el
programa debe mostrarle el vuelto correspondiente de acuerdo con el dinero que pagó el cliente,
por ejemplo, si el vehículo es un vehículo liviano debe pagar ¢600 y si el cliente paga con ¢1000 el
vuelto sería ¢400.
 Desarrolle un procedimiento donde se reporte las siguientes estadísticas de los vehículos
procesados: cantidad de vehículos de cada uno de los tipos de vehículos, total de dinero
recaudado de cada uno de los tipos de vehículos y el total general de dinero recaudado de todos
los vehículos que circularon por el peaje.
 Desarrolle un procedimiento donde se calcule y reporte las siguientes estadísticas de las casetas:
cantidad de vehículos que circularon por cada una de las casetas, total de dinero recaudado en
cada una de las casetas, promedio por cada una de las casetas.
 Desarrolle un procedimiento que se llame Menú Principal y debe llamarlo en el void main() del
programa, el cual tiene las siguientes opciones:
Menú Principal
1. Lectura y Procesamiento de Vehículos
2. Reporta Estadísticas por Vehículos
3. Reporta Estadísticas por Casetas
4. Salir*/
package cotidiano4_ejercicio2;

import javax.swing.JOptionPane;

public class Cotidiano4_Ejercicio2 {
    static int cantmotoc1, cantmotoc2, cantmotoc3;
    static int cantlivc1, cantlivc2, cantlivc3;
    static int cantpesc1, cantpesc2, cantpesc3;
    static int cant2tonc1, cant2tonc2, cant2tonc3;
    
    static int cantvecc1, cantvecc2, cantvecc3;
    
    static int cantmoto, cantliv, cantpes, cant2ton;
    
    static int cantvec;
    
    static int pago, pag=1, AlTrue = 1;
    
    static int dineromotoc1, dineromotoc2, dineromotoc3;
    static int dinerolivc1, dinerolivc2, dinerolivc3;
    static int dineropesc1, dineropesc2, dineropesc3;
    static int dinero2tonc1, dinero2tonc2, dinero2tonc3;
    
    static int dinerovecc1, dinerovecc2, dinerovecc3;
    
    static int dineromoto, dineroliv, dineropes, dinero2ton;
    
    static int dinerotot; static String elecc;
    
    static Object[] vec = {"Moto", "Liviano", "Pesado", "2+ Toneladas", "Cancelar"};
    
    static Object[] infocasetas = {"Volver", "Info. Motos", "Info. Livianos", "Info. Pesados", "Info. 2+ Toneladas", "Info. Total"};
            
    public static void main(String[] args)
    {
        do {
            menu();
        } while (AlTrue == 1);
    }
    
    static void menu()
    {
        if (pag == 1)
        {
            Object[] opci = { "Salir", "Insertar Vehiculo", "Sig. Pág"};
            
            int opc = JOptionPane.showOptionDialog(null, "Seleccione una opción",
            "Pag. 1 - Insertar Vehiculo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
            null, opci, opci[0]);
            
            switch(opc)
            {
                case 0:
                {
                    JOptionPane.showMessageDialog(null, "Gracias por usar este programa.");
                    System.exit(0);
                } break;
                case 1:
                {
                    leer();
                } break;
                case 2:
                {
                    pag++;
                } break;
            }
        }
        if (pag == 2)
        {
            Object[] opci = {"Ant. Pág", "Info. Caseta 1", "Info. Caseta 2", "Info. Caseta 3", "Sig. Pág"};
            
            int opc = JOptionPane.showOptionDialog(null, "Seleccione una opción",
            "Pag. 2 - Información de Casetas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
            null, opci, opci[0]);
            
            switch(opc)
            {
                case 0:
                {
                    pag--;
                } break;
                case 1:
                {
                    pag=21;
                } break;
                case 2:
                {
                    pag=22;
                } break;
                case 3:
                {
                    pag=23;
                } break;
                case 4:
                {
                    pag++;
                }
            }
        }
        if (pag == 3)
        {
            Object[] opci = {"Ant. Pag", "Info. Total Motos", "Info. Total Livianos", "Info. Total Pesados", "Info. Total 2+ Toneladas", "Info. Total"};
            
            int opc = JOptionPane.showOptionDialog(null, "Seleccione una opción",
            "Pag. 3 - Información por vehículos", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
            null, opci, opci[0]);
            
            switch(opc)
            {
                case 0:
                {
                    pag--;
                } break;
                case 1:
                {
                    cantmoto = cantmotoc1 + cantmotoc2 + cantmotoc3;
                    dineromoto = cantmoto * 200;
                    
                    JOptionPane.showMessageDialog(null, "Cantidad total de motos: "+cantmoto
                    +"\nCantidad de dinero: "+dineromoto);
                } break;
                case 2:
                {
                    cantliv = cantlivc1 + cantlivc2 + cantlivc3;
                    dineroliv = cantliv * 600;
                    
                    JOptionPane.showMessageDialog(null, "Cantidad total de vehiculos livianos: "+cantliv
                    +"\nCantidad de dinero: "+dineroliv);
                } break;
                case 3:
                    {
                    cantpes = cantpesc1 + cantpesc2 + cantpesc3;
                    dineropes = cantpes * 900;
                    
                    JOptionPane.showMessageDialog(null, "Cantidad total de vehiculos pesados: "+cantpes
                    +"\nCantidad de dinero: "+dineropes);
                } break;
                case 4:
                {
                    cant2ton = cant2tonc1 + cant2tonc2 + cant2tonc3;
                    dinero2ton = cant2ton * 1200;
                    
                    JOptionPane.showMessageDialog(null, "Cantidad total de vehiculos de 2 o más toneladas: "+cant2ton
                    +"\nCantidad de dinero: "+dinero2ton);
                } break;
                case 5:
                {
                    cantmoto = cantmotoc1 + cantmotoc2 + cantmotoc3;
                    dineromoto = cantmoto * 200;
                    cantliv = cantlivc1 + cantlivc2 + cantlivc3;
                    dineroliv = cantliv * 600;
                    cantpes = cantpesc1 + cantpesc2 + cantpesc3;
                    dineropes = cantpes * 900;
                    cant2ton = cant2tonc1 + cant2tonc2 + cant2tonc3;
                    dinero2ton = cant2ton * 1200;
                    
                    cantvec = cantmoto + cantliv + cantpes + cant2ton;
                    dinerotot = dineromoto + dineroliv + dineropes + dinero2ton;
                    
                    JOptionPane.showMessageDialog(null, "Cantidad total de vehiculos: "+cantvec
                    +"\nCantidad de dinero: "+dinerotot);
                }
            }
        }
        if (pag == 21)
        {
            int opc = JOptionPane.showOptionDialog(null, "Seleccione una opción",
            "Info. Caseta 1", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
            null, infocasetas, infocasetas[0]);
            
            //"Volver", "Info. Motos", "Info. Livianos", "Info. Pesados", "Info. 2+ Toneladas", "Info. Total"
            switch(opc)
            {
                case 0:
                {
                    pag = 2;
                } break;
                case 1:
                {
                    JOptionPane.showMessageDialog(null, "Cantidad de motos en la caseta 1: "+cantmotoc1
                    +"\nCantidad de dinero: "+dineromotoc1);
                } break;
                case 2:
                {
                    JOptionPane.showMessageDialog(null, "Cantidad de vehiculos livianos en la caseta 1: "+cantlivc1
                    +"\nCantidad de dinero: "+dinerolivc1);
                } break;
                case 3:
                {
                    JOptionPane.showMessageDialog(null, "Cantidad de vehiculos pesados en la caseta 1: "+cantpesc1
                    +"\nCantidad de dinero: "+dineropesc1);
                } break;
                case 4:
                {
                    JOptionPane.showMessageDialog(null, "Cantidad de vehiculos de 2 o más toneladas en la caseta 1: "+cant2tonc1
                    +"\nCantidad de dinero: "+dinero2tonc1);
                } break;
                case 5:
                {
                    cantvecc1 = cantmotoc1 + cantlivc1 + cantpesc1 + cant2tonc1;
                    dinerovecc1 = dineromotoc1 + dinerolivc1 + dineropesc1 + dinero2tonc1;
                    
                    JOptionPane.showMessageDialog(null, "Cantidad de vehiculos totales en la caseta 1: "+cantvecc1
                    +"\nCantidad de dinero: "+dinerovecc1);
                } break;
            }
        }
        if (pag == 22)
        {
            int opc = JOptionPane.showOptionDialog(null, "Seleccione una opción",
            "Info. Caseta 2", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
            null, infocasetas, infocasetas[0]);
            
            switch(opc)
            {
                case 0:
                {
                    pag = 2;
                } break;
                case 1:
                {
                    JOptionPane.showMessageDialog(null, "Cantidad de motos en la caseta 2: "+cantmotoc2
                    +"\nCantidad de dinero: "+dineromotoc2);
                } break;
                case 2:
                {
                    JOptionPane.showMessageDialog(null, "Cantidad de vehiculos livianos en la caseta 2: "+cantlivc2
                    +"\nCantidad de dinero: "+dinerolivc2);
                } break;
                case 3:
                {
                    JOptionPane.showMessageDialog(null, "Cantidad de vehiculos pesados en la caseta 2: "+cantpesc2
                    +"\nCantidad de dinero: "+dineropesc2);
                } break;
                case 4:
                {
                    JOptionPane.showMessageDialog(null, "Cantidad de vehiculos de 2 o más toneladas en la caseta 2: "+cant2tonc2
                    +"\nCantidad de dinero: "+dinero2tonc2);
                } break;
                case 5:
                {
                    cantvecc2 = cantmotoc2 + cantlivc2 + cantpesc2 + cant2tonc2;
                    dinerovecc2 = dineromotoc2 + dinerolivc2 + dineropesc2 + dinero2tonc2;
                    
                    JOptionPane.showMessageDialog(null, "Cantidad de vehiculos totales en la caseta 2: "+cantvecc2
                    +"\nCantidad de dinero: "+dinerovecc2);
                } break;
            }
        }
        if (pag == 23)
        {
            int opc = JOptionPane.showOptionDialog(null, "Seleccione una opción",
            "Info. Caseta 3", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
            null, infocasetas, infocasetas[0]);
            
            switch(opc)
            {
                case 0:
                {
                    pag = 2;
                } break;
                case 1:
                {
                    JOptionPane.showMessageDialog(null, "Cantidad de motos en la caseta 2: "+cantmotoc3
                    +"\nCantidad de dinero: "+dineromotoc3);
                } break;
                case 2:
                {
                    JOptionPane.showMessageDialog(null, "Cantidad de vehiculos livianos en la caseta 3: "+cantlivc3
                    +"\nCantidad de dinero: "+dinerolivc3);
                } break;
                case 3:
                {
                    JOptionPane.showMessageDialog(null, "Cantidad de vehiculos pesados en la caseta 3: "+cantpesc3
                    +"\nCantidad de dinero: "+dineropesc3);
                } break;
                case 4:
                {
                    JOptionPane.showMessageDialog(null, "Cantidad de vehiculos de 2 o más toneladas en la caseta 3: "+cant2tonc3
                    +"\nCantidad de dinero: "+dinero2tonc3);
                } break;
                case 5:
                {
                    cantvecc3 = cantmotoc3 + cantlivc3 + cantpesc3 + cant2tonc3;
                    dinerovecc3 = dineromotoc3 + dinerolivc3 + dineropesc3 + dinero2tonc3;
                    
                    JOptionPane.showMessageDialog(null, "Cantidad de vehiculos totales en la caseta 3: "+cantvecc3
                    +"\nCantidad de dinero: "+dinerovecc3);
                } break;
            }
        }
    }
    
    static void leer()
    {
        Object[] menu = {"Caseta 1", "Caseta 2", "Caseta 3", "Cancelar"};
        int select = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Insertar vehiculos",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, menu, menu[0]);
            
        switch(select)
        {
            case 0:
            {
                int vecsel = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Insertar vehiculos",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, vec, vec[0]);
                
                switch(vecsel)
                {
                    case 0:
                    {
                        elecc = "Moto";
                        cantmotoc1++;
                        do {
                            cancelar();
                            
                            if (pago < 200)
                            {
                                error();
                            }
                        } while (pago < 200);
                        
                        dineromotoc1 += 200;
                        
                        Object[] cancel = {"Pagar", "Cancelar"};
                        int sel = JOptionPane.showOptionDialog(null, "Paga con "+pago+"¢\nVuelto: "+(pago-200)+"¢\nSeleccione una opción", "Insertar vehiculos",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, cancel, cancel[0]);
                        
                        switch(sel)
                        {
                            case 0:
                            {
                                JOptionPane.showMessageDialog(null, "Vehiculo registrado.\nPaga con: "+pago
                                +"¢\nVuelto: "+(pago-200)+"¢");
                            } break;
                            case 1:
                            {
                                cantmotoc1--; dineromotoc1-=200;
                                JOptionPane.showMessageDialog(null, "Compra cancelada.");
                            } break;
                        }
                    } break;
                    case 1:
                    {
                        elecc = "Liviano";
                        cantlivc1++;
                        do {
                            cancelar();
                            
                            if (pago < 600)
                            {
                                error();
                            }
                        } while (pago < 600);
                        
                        dinerolivc1 += 600;
                        
                        Object[] cancel = {"Pagar", "Cancelar"};
                        int sel = JOptionPane.showOptionDialog(null, "Paga con "+pago+"¢\nVuelto: "+(pago-600)+"¢\nSeleccione una opción", "Insertar vehiculos",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, cancel, cancel[0]);
                        
                        switch(sel)
                        {
                            case 0:
                            {
                                JOptionPane.showMessageDialog(null, "Vehiculo registrado.\nPaga con: "+pago
                                +"¢\nVuelto: "+(pago-600)+"¢");
                            } break;
                            case 1:
                            {
                                cantlivc1--; dinerolivc1-=600;
                                JOptionPane.showMessageDialog(null, "Compra cancelada.");
                            } break;
                        }
                    } break;
                    case 2:
                    {
                        elecc = "Pesado";
                        cantpesc1++;
                        do {
                            cancelar();
                            
                            if (pago < 900)
                            {
                                error();
                            }
                        } while (pago < 900);
                        
                        dineropesc1 += 900;
                        
                        Object[] cancel = {"Pagar", "Cancelar"};
                        int sel = JOptionPane.showOptionDialog(null, "Paga con "+pago+"¢\nVuelto: "+(pago-900)+"¢\nSeleccione una opción", "Insertar vehiculos",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, cancel, cancel[0]);
                        
                        switch(sel)
                        {
                            case 0:
                            {
                                JOptionPane.showMessageDialog(null, "Vehiculo registrado.\nPaga con: "+pago
                                +"¢\nVuelto: "+(pago-900)+"¢");
                            } break;
                            case 1:
                            {
                                cantpesc1--; dineropesc1-=900;
                                JOptionPane.showMessageDialog(null, "Compra cancelada.");
                            } break;
                        }
                    }
                    case 3:
                    {
                        elecc = "2+ Toneladas";
                        cant2tonc1++;
                        do {
                            cancelar();
                            
                            if (pago < 1200)
                            {
                                error();
                            }
                        } while (pago < 1200);
                        
                        dinero2tonc1 += 1200;
                        
                        Object[] cancel = {"Pagar", "Cancelar"};
                        int sel = JOptionPane.showOptionDialog(null, "Paga con "+pago+"¢\nVuelto: "+(pago-1200)+"¢\nSeleccione una opción", "Insertar vehiculos",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, cancel, cancel[0]);
                        
                        switch(sel)
                        {
                            case 0:
                            {
                                JOptionPane.showMessageDialog(null, "Vehiculo registrado.\nPaga con: "+pago
                                +"¢\nVuelto: "+(pago-1200)+"¢");
                            } break;
                            case 1:
                            {
                                cant2tonc1--; dinero2tonc1-=1200;
                                JOptionPane.showMessageDialog(null, "Compra cancelada.");
                            } break;
                        }
                    }
                }
            } break;
            case 1:
            {
                int vecsel = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Insertar vehiculos",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, vec, vec[0]);
                
                switch(vecsel)
                {
                    case 0:
                    {
                        elecc = "Moto";
                        cantmotoc2++;
                        do {
                            cancelar();
                            
                            if (pago < 200)
                            {
                                error();
                            }
                        } while (pago < 200);
                        
                        dineromotoc2 += 200;
                        
                        Object[] cancel = {"Pagar", "Cancelar"};
                        int sel = JOptionPane.showOptionDialog(null, "Paga con "+pago+"¢\nVuelto: "+(pago-200)+"¢\nSeleccione una opción", "Insertar vehiculos",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, cancel, cancel[0]);
                        
                        switch(sel)
                        {
                            case 0:
                            {
                                JOptionPane.showMessageDialog(null, "Vehiculo registrado.\nPaga con: "+pago
                                +"¢\nVuelto: "+(pago-200)+"¢");
                            } break;
                            case 1:
                            {
                                cantmotoc2--; dineromotoc2-=200;
                                JOptionPane.showMessageDialog(null, "Compra cancelada.");
                            } break;
                        }
                    } break;
                    case 1:
                    {
                        elecc = "Liviano";
                        cantlivc2++;
                        do {
                            cancelar();
                            
                            if (pago < 600)
                            {
                                error();
                            }
                        } while (pago < 600);
                        
                        dinerolivc2 += 600;
                        
                        Object[] cancel = {"Pagar", "Cancelar"};
                        int sel = JOptionPane.showOptionDialog(null, "Paga con "+pago+"¢\nVuelto: "+(pago-600)+"¢\nSeleccione una opción", "Insertar vehiculos",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, cancel, cancel[0]);
                        
                        switch(sel)
                        {
                            case 0:
                            {
                                JOptionPane.showMessageDialog(null, "Vehiculo registrado.\nPaga con: "+pago
                                +"¢\nVuelto: "+(pago-600)+"¢");
                            } break;
                            case 1:
                            {
                                cantlivc2--; dinerolivc2-=600;
                                JOptionPane.showMessageDialog(null, "Compra cancelada.");
                            } break;
                        }
                    } break;
                    case 2:
                    {
                        elecc = "Pesado";
                        cantpesc2++;
                        do {
                            cancelar();
                            
                            if (pago < 900)
                            {
                                error();
                            }
                        } while (pago < 900);
                        
                        dineropesc2 += 900;
                        
                        Object[] cancel = {"Pagar", "Cancelar"};
                        int sel = JOptionPane.showOptionDialog(null, "Paga con "+pago+"¢\nVuelto: "+(pago-900)+"¢\nSeleccione una opción", "Insertar vehiculos",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, cancel, cancel[0]);
                        
                        switch(sel)
                        {
                            case 0:
                            {
                                JOptionPane.showMessageDialog(null, "Vehiculo registrado.\nPaga con: "+pago
                                +"¢\nVuelto: "+(pago-900)+"¢");
                            } break;
                            case 1:
                            {
                                cantpesc2--; dineropesc2-=900;
                                JOptionPane.showMessageDialog(null, "Compra cancelada.");
                            } break;
                        }
                    }
                    case 3:
                    {
                        elecc = "2+ Toneladas";
                        cant2tonc2++;
                        do {
                            cancelar();
                            
                            if (pago < 1200)
                            {
                                error();
                            }
                        } while (pago < 1200);
                        
                        dinero2tonc2 += 1200;
                        
                        Object[] cancel = {"Pagar", "Cancelar"};
                        int sel = JOptionPane.showOptionDialog(null, "Paga con "+pago+"¢\nVuelto: "+(pago-1200)+"¢\nSeleccione una opción", "Insertar vehiculos",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, cancel, cancel[0]);
                        
                        switch(sel)
                        {
                            case 0:
                            {
                                JOptionPane.showMessageDialog(null, "Vehiculo registrado.\nPaga con: "+pago
                                +"¢\nVuelto: "+(pago-1200)+"¢");
                            } break;
                            case 1:
                            {
                                cant2tonc2--; dinero2tonc2-=1200;
                                JOptionPane.showMessageDialog(null, "Compra cancelada.");
                            } break;
                        }
                    }
                }
            } break;
            case 2:
            {
                int vecsel = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Insertar vehiculos",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, vec, vec[0]);
                
                switch(vecsel)
                {
                    case 0:
                    {
                        elecc = "Moto";
                        cantmotoc3++;
                        do {
                            cancelar();
                            
                            if (pago < 200)
                            {
                                error();
                            }
                        } while (pago < 200);
                        
                        dineromotoc3 += 200;
                        
                        Object[] cancel = {"Pagar", "Cancelar"};
                        int sel = JOptionPane.showOptionDialog(null, "Paga con "+pago+"¢\nVuelto: "+(pago-200)+"¢\nSeleccione una opción", "Insertar vehiculos",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, cancel, cancel[0]);
                        
                        switch(sel)
                        {
                            case 0:
                            {
                                JOptionPane.showMessageDialog(null, "Vehiculo registrado.\nPaga con: "+pago
                                +"¢\nVuelto: "+(pago-200)+"¢");
                            } break;
                            case 1:
                            {
                                cantmotoc3--; dineromotoc3-=200;
                                JOptionPane.showMessageDialog(null, "Compra cancelada.");
                            } break;
                        }
                    } break;
                    case 1:
                    {
                        elecc = "Liviano";
                        cantlivc3++;
                        do {
                            cancelar();
                            
                            if (pago < 600)
                            {
                                error();
                            }
                        } while (pago < 600);
                        
                        dinerolivc3 += 600;
                        
                        Object[] cancel = {"Pagar", "Cancelar"};
                        int sel = JOptionPane.showOptionDialog(null, "Paga con "+pago+"¢\nVuelto: "+(pago-600)+"¢\nSeleccione una opción", "Insertar vehiculos",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, cancel, cancel[0]);
                        
                        switch(sel)
                        {
                            case 0:
                            {
                                JOptionPane.showMessageDialog(null, "Vehiculo registrado.\nPaga con: "+pago
                                +"¢\nVuelto: "+(pago-600)+"¢");
                            } break;
                            case 1:
                            {
                                cantlivc3--; dinerolivc3-=600;
                                JOptionPane.showMessageDialog(null, "Compra cancelada.");
                            } break;
                        }
                    } break;
                    case 2:
                    {
                        elecc = "Pesado";
                        cantpesc3++;
                        do {
                            cancelar();
                            
                            if (pago < 900)
                            {
                                error();
                            }
                        } while (pago < 900);
                        
                        dineropesc3 += 900;
                        
                        Object[] cancel = {"Pagar", "Cancelar"};
                        int sel = JOptionPane.showOptionDialog(null, "Paga con "+pago+"¢\nVuelto: "+(pago-900)+"¢\nSeleccione una opción", "Insertar vehiculos",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, cancel, cancel[0]);
                        
                        switch(sel)
                        {
                            case 0:
                            {
                                JOptionPane.showMessageDialog(null, "Vehiculo registrado.\nPaga con: "+pago
                                +"¢\nVuelto: "+(pago-900)+"¢");
                            } break;
                            case 1:
                            {
                                cantpesc3--; dineropesc3-=900;
                                JOptionPane.showMessageDialog(null, "Compra cancelada.");
                            } break;
                        }
                    }
                    case 3:
                    {
                        elecc = "2+ Tonelada";
                        cant2tonc3++;
                        do {
                            cancelar();
                            
                            if (pago < 1200)
                            {
                                error();
                            }
                        } while (pago < 1200);
                        
                        dinero2tonc3 += 1200;
                        
                        Object[] cancel = {"Pagar", "Cancelar"};
                        int sel = JOptionPane.showOptionDialog(null, "Paga con "+pago+"¢\nVuelto: "+(pago-1200)+"¢\nSeleccione una opción", "Insertar vehiculos",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, cancel, cancel[0]);
                        
                        switch(sel)
                        {
                            case 0:
                            {
                                JOptionPane.showMessageDialog(null, "Vehiculo registrado.\nPaga con: "+pago
                                +"¢\nVuelto: "+(pago-1200)+"¢");
                            } break;
                            case 1:
                            {
                                cant2tonc3--; dinero2tonc3-=1200;
                                JOptionPane.showMessageDialog(null, "Compra cancelada.");
                            } break;
                        }
                    }
                }
            } break;
            case 3:
            {
                
            } break;
        }
    }
    
    static void cancelar()
    {
        pago = Integer.parseInt(JOptionPane.showInputDialog("Precios:\nMoto: 200¢"
        +"\nLiviano: 600¢\nPesado: 900¢\n2+ Toneladas: 1200¢"+
        "\n\nVehiculo seleccionado: "+elecc+"\n\nDigite el monto con el que va a pagar", "0"));
    }
    
    static void error()
    {
        JOptionPane.showMessageDialog(null,
        "El monto con el que se cancela debe ser igual o mayor al precio.");
    }
}
