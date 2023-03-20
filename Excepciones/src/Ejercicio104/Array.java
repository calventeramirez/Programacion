package Ejercicio104;

/*
Implementa  un programa que cree un  array  de números  decimales  cuyo tamaño
debe indicarlo el usuario por teclado.  A continuación, utilizando un bucle,  debe pedir
tantos valores por teclado como tamaño tenga el array y los debe ir guardando en cada
celda del array. Hay que manejar todas posibles excepciones y seguir pidiendo valores
hasta rellenar completamente el vector.
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class Array {

    public static void main(String[] args) {
        double[] array;
        int tamano = 0;
        Scanner t = new Scanner(System.in);
        boolean salida = false;

        //Creamos el array
        do {
            try {
                System.out.print("Introduzca el tamaño del array: ");
                tamano = t.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error. No se ha introducido un valor por teclado no valido");
                t.nextLine();
            }
        } while (tamano <= 0);
        array = new double[tamano];

        //Rellenamos array
        for (int i = 0; i < tamano; i++) {
            try {
                System.out.print("Introduce el valor para la posición " + (i + 1)+": ");
                double valor = t.nextDouble();
                array[i] = valor;
            } catch (InputMismatchException e) {
                System.out.println("Error. No se ha introducido un valor por teclado");
                t.nextLine();
                i--;
            }
        }

        //Mostramos el array
        try {
            for (int i = 0; i < tamano; i++) {
                System.out.print(array[i] + " ");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error. Se ha pasado del tamaño del array.");
        }

        System.out.println("");
    }
}
