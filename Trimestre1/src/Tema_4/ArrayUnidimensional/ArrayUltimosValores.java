package Tema_4.ArrayUnidimensional;

import java.util.Scanner;

/*
array 100 cajones entre 1 y 100
añadir 1 numero entre 1 y 100 por teclado
crear otro array con los ultimos valores del array original
 */
public class ArrayUltimosValores {

    public static void main(String[] args) {
        int[] arrayOriginal = new int[100], arrayDuplicado;
        Scanner t = new Scanner(System.in);
        int N = 0, cont = 0;

        for (int i = 1; i < arrayOriginal.length; i++) {
            arrayOriginal[i] = (int) (Math.random() * (100 - 1 + 1) + 1);
        }

        do {
            System.out.print("Introduzca un valor para sacar las ultimas posiciones que desee: ");
            N = t.nextInt();
        } while ((N < 0) || (N > 100));

        arrayDuplicado = new int[N];
        for (int i = (arrayOriginal.length - N); i < arrayOriginal.length; i++) {
            arrayDuplicado[cont] = arrayOriginal[i];
            cont++;
        }

        System.out.print("El array es: ");
        for (int i = 0; i < arrayDuplicado.length - 1; i++) {
            System.out.print(arrayDuplicado[i] + ", ");
        }
        System.out.println(arrayDuplicado[arrayDuplicado.length - 1]);
    }
}
