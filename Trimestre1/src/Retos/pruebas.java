package arrays;

import java.util.Scanner;

/**
 *
 * @author Pablo Calvente
 */
public class pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creo los arrays con las plazas libres ya que iniciamos con el parking sin vehiculos
        String plazasGrandes[] = {"L", "L", "L", "L", "L", "L", "L", "L", "L", "L"}, plazasPequeñas[] = {"L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L"};
        int num = 0, plaza = 0;
        String tamaño = "", otraVez = "";
        boolean peque = true;
        Scanner teclado = new Scanner(System.in);
        
        //Empezamos con el do-while para que se repita el menu hasta que metamos el numero 4
        do {
            System.out.println("APARCAMIENTOS WEB NOVA");
            System.out.println("---------------------------------------");
            System.out.println("1) Aparcar vehículo.");
            System.out.println("2) Sacar vehículo.");
            System.out.println("3) Mostrar aparcamiento.");
            System.out.println("4) Salir");
            System.out.print("Opcion? ");
            num = teclado.nextInt();
            //Usamos un switch para gestionar el menu
            switch (num) {
                case 1: ///Si el numero que introduce el usuario es 1
                    do {//Primer do-while para repetir el meter vehiculo o no hacerlo
                        do {//Segundo do-while para repetir si no introducimos G o P
                            System.out.print("Tamaño del vehiculo(G/P)?");
                            tamaño = teclado.next();
                        } while (!tamaño.equalsIgnoreCase("G") && !tamaño.equalsIgnoreCase("P"));
                        //Compruebo si al introducir el coche es uno grande o uno pequeño
                        if (tamaño.equalsIgnoreCase("G")) {
                            for (int i = 0; i < plazasGrandes.length; i++) {//Recorro el array de las plazas grandes
                                if (plazasGrandes[i].equalsIgnoreCase("L")) {//Compruebo si esta libre la plaza, si es asi guardo que esta ocupado
                                    plazasGrandes[i] = "O";
                                    System.out.println("Vehiculo aparcado en G" + i);
                                    i = plazasGrandes.length;//Fuerzo a salir del for
                                }
                                if (i == plazasGrandes.length - 1) {//Si llegamos a la ultima plaza y no esta libre no se puede guardar el vehiculo grande
                                    System.out.println("No se ha podido aparcar el vehiculo");
                                }
                            }
                        } else if (tamaño.equalsIgnoreCase("P")) {//Usamos else-if porque si es grande no puede ser pequeño a la vez
                            for (int i = 0; i < plazasPequeñas.length; i++) {//Recorro el array de las plazas pequeñas
                                if (plazasPequeñas[i].equalsIgnoreCase("L")) {//Compruebo si la plaza esta libre en el pequeño, si es asi guardo que esta ocupado
                                    plazasPequeñas[i] = "O";
                                    System.out.println("Vehiculo aparcado en P" + i);
                                    i = plazasPequeñas.length;//Fuerzo la salida del for
                                }
                                if (i == plazasPequeñas.length - 1) {//Si no esta libre al final debo comprobar si hay hueco en el parking grande
                                    peque = false;//Le digo que no hay hueco en el parking de pequeños
                                }
                            }
                            if (!peque) {//Si el pequeño esta ocupado entro
                                for (int i = 0; i < plazasGrandes.length; i++) {//Recorro el array de los grandes
                                    if (plazasGrandes[i].equalsIgnoreCase("L")) {//Compruebo que esta libre alguna plaza
                                        plazasGrandes[i] = "O";
                                        System.out.println("Vehiculo aparcado en G" + i);
                                        i = plazasGrandes.length;//fuerzo la salida del for
                                    }
                                    if (i == plazasGrandes.length - 1) {//Si no hay hueco libres saco un error por pantalla
                                        System.out.println("No se ha podido aparcar el vehiculo");
                                    }
                                }
                            }
                        }
                        System.out.print("Aparcar otro(S/N)?  ");
                        otraVez = teclado.next();
                    } while (otraVez.equalsIgnoreCase("S"));
                    break;
                case 2:
                    do {//Primer do-while para repetir el sacar vehiculo o no hacerlo
                        do {//Segundo do-while para repetir si no introducimos G o P
                            System.out.print("Tamaño del vehiculo(G/P)?");
                            tamaño = teclado.next();
                            System.out.print("Numero de plaza? ");
                            plaza = teclado.nextInt();
                        } while (!tamaño.equalsIgnoreCase("G") && !tamaño.equalsIgnoreCase("P"));

                        if (tamaño.equalsIgnoreCase("G") && !plazasGrandes[plaza].equalsIgnoreCase("L")) {//compruebo que si el parking es el grande y no esta libre saco el vehiculo
                            plazasGrandes[plaza] = "L";
                            System.out.println("La plaza queda disponible");
                        } else if (tamaño.equalsIgnoreCase("P")  && !plazasPequeñas[plaza].equalsIgnoreCase("L")) {//compruebo que si el parking es el pequeño y no esta libre saco el vehiculo
                            plazasPequeñas[plaza] = "L";
                            System.out.println("La plaza queda disponible");
                        } else {//Si esta libre la plaza
                            System.out.println("IMPOSIBLE: en esa plaza no hay ningún vehiculo");
                        }
                        System.out.print("Aparcar otro(S/N)?  ");
                        otraVez = teclado.next();
                    } while (otraVez.equalsIgnoreCase("S"));
                    break;
                case 3:
                    System.out.println("Situacion del aparcamiento: ");
                    System.out.print("Plazas G = [");
                    for (int i = 0; i < plazasGrandes.length - 1; i++) {//Recorro el array para mostrarlo como se pide en el enunciado hasta el penultimo elemento
                        System.out.print(plazasGrandes[i] + ", ");
                    }
                    System.out.println(plazasGrandes[plazasGrandes.length - 1] + "]");//Para terminar saco el ultimo elemento y termino de sacar como me pide el ejercicio
                    System.out.print("Plazas de P = [");
                    for (int i = 0; i < plazasPequeñas.length - 1; i++) {//Recorro el array para mostrarlo como se pide en el enunciado hasta el penultimo elemento
                        System.out.print(plazasPequeñas[i] + ", ");
                    }
                    System.out.println(plazasPequeñas[plazasPequeñas.length - 1] + "]");//Para terminar saco el ultimo elemento y termino de sacar como me pide el ejercicio
                    break;
                case 4:
                    System.out.println("Aparcamientos Web Nova le desea Feliz Halloween!!");
                    break;
                default:
                    System.out.println("\nNo es un numero valido\n");
            }

        } while (num != 4);
        teclado.close();
    }

}
