package Tema_4.ArrayUnidimensional;

import java.util.Scanner;

/*
 Crea dos arrays de enteros tamaño 5.  A continuación:
•Rellena el primero con números aleatorios entre el 2 y el 50. 
•Rellena el segundo con valores que introduzca el usuario por teclado.
•Crea un tercer array cuyos valores en cada celda van a ser la suma 
de las celdas correspondientes de los otros dos arrays. Es decir, para 
la celda 1: la suma de las celdas 1 del 1er y del 2º array. Para la celda 2:
la suma de las celdas 2 del  1er y del 2º array y así sucesivamente.
•Muestra el tercer array por pantalla.
•Muestra la suma de todos los elementos del tercer array
 */
/**
 *
 * @author Pablo Calvente
 */
public class Ejercicio56 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int N = 5;
        int[] array1 = new int[N], array2 = new int[N], arraySuma = new int[N];
        int suma = 0;
        Scanner t = new Scanner(System.in);
        //Relleno con numeros aleatorio el primer Array
        for (int i = 0; i < N; i++) {
            array1[i] = (int) (Math.random() * (50 - 2 + 1) + 2);
        }

        //Rellenar con numeros por teclado
        for (int i = 0; i < N; i++) {
            System.out.print("\nIntroduzca el numero " + (i + 1) + ": ");
            array2[i] = t.nextInt();
        }

        //suma de los arrays y muestro la suma
        System.out.print("El array 3ero es: ");
        for (int i = 0; i < N; i++) {
            arraySuma[i] = array1[i]+array2[i]; 
            suma+=arraySuma[i];
            System.out.print(arraySuma[i]+ " ");
        }
        
        //Suma 
        System.out.println("\nLa suma del array 3 es: "+suma);
    }

}
