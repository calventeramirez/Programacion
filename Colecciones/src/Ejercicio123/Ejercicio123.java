package Ejercicio123;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio123 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int tam = 0;
        //Pido el tamaño del array
        do {
            System.out.print("Introduzca el numero de elementos que se va a introducir: ");
            try {
                tam = t.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error. No se ha introducido un numero, por favor introduzca un numero.");
                t.nextLine();
            }
        } while (tam <= 0);

        //Creo el arrayList
        ArrayList<Integer> lista = new ArrayList<>();

        //Relleno el arrayList
        for (int i = 0; i < tam; i++) {
            System.out.print("Introduzca el dato de la posicion " + (i + 1) + ": ");
            try {
                lista.add(t.nextInt());
            } catch (InputMismatchException e) {
                System.out.println("Error. No se ha introducido un numero, por favor introduzca un numero.");
                t.nextLine();
                i--;
            }
        }

        //Muestro el arrayList
        System.out.print("Lista 1: [");
        for (Integer dato : lista) {
            System.out.print(dato + " ");
        }
        System.out.println("]");

        //Intercambio la primera pos con la ultima
        Integer aux;
        aux = lista.get(0); //Guardo lo que hay en la primera posicion del array
        lista.set(0, lista.get(tam - 1));
        lista.set(tam - 1, aux);

        //Pido otro array del mismo tam
        //Creo el arrayList2
        ArrayList<Integer> lista2 = new ArrayList<>();

        //Relleno el arrayList2
        for (int i = 0; i < tam; i++) {
            System.out.print("Introduzca el dato de la posicion " + (i + 1) + ": ");
            try {
                lista2.add(t.nextInt());
            } catch (InputMismatchException e) {
                System.out.println("Error. No se ha introducido un numero, por favor introduzca un numero.");
                t.nextLine();
                i--;
            }
        }

        //Muestro el arrayList2
        System.out.print("Lista2: [");
        for (Integer dato : lista) {
            System.out.print(dato + " ");
        }
        System.out.println("]");

        //Introduzco el array2 en el 1
        for (int i = 0; i < tam; i++) {
            lista.add(lista.get(i));
        }

        //Sumo los elementos
        int sum = 0;
        for (Integer elemento : lista) {
            sum += elemento;
        }
        System.out.println("Suma: " + sum);

        //Calcula la media aritmetica
        double media = sum / lista.size();
        System.out.println("Media: " + media);

        //Muestro elementos de la lista cuyo elementos sea menor que la media
        System.out.println("Lista menor que la media: [");
        for (Integer elemento : lista) {
            if (elemento < media) {
                System.out.print(elemento + " ");
            }
        }
        System.out.println("]");

    }
}
