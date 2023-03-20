/*
Crea un array de tamaño10 que sirva para almacenar colores y pide al
usuario que rellene cada posición del array con un color. A continuación 
indica cuantas veces aparece el color “rojo” y el color “azul” usando la
siguiente salida
 */
package Tema_4.ArrayUnidimensional;

import java.util.Scanner;

/**
 *
 * @author Pablo Calvente
 */
public class Ejercicio51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int N = 10;
        String[] array = new String[N];
        int vezRojo = 0, vezAzul = 0;
        Scanner t = new Scanner(System.in);

        for (int i = 0; i < N; i++) {
            System.out.print("Introduzca un color: ");
            array[i]=t.next();
            if(array[i].equalsIgnoreCase("rojo")){
                vezRojo++;
            }
            if(array[i].equalsIgnoreCase("azul")){
                vezAzul++;
            }
        }
        System.out.println("Ek color 'rojo' aparece "+vezRojo+" veces en el array");
        System.out.println("El color 'azul' aparece "+vezAzul+" veces en el array");
    }

}
