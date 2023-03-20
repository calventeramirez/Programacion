package Tema_4.ArrayUnidimensional;

import java.util.Scanner;

/*
Crear un array de 100 pos.
Pedir dos num min y max
Crear array y rellenarlo con valores entre el min y el max
Mostralor por pantalla
 */
public class ArrayMiniMaxYRellenar {

    public static void main(String[] args) {
        int[] arrayOriginal = new int[100], arrayMaxMin;
        int cont = 0, max, min, alea = 0, cont2 = 0;
        Scanner t = new Scanner(System.in);

        do {
            System.out.print("Introduzca el num maximo: ");
            max = t.nextInt();
            System.out.print("Introduzca el num minimo: ");
            min = t.nextInt();
        } while (max <= min || min <= 2 );

        for (int i = 0; i < arrayOriginal.length; i++) {
            alea = (int) (Math.random() * (100 + 1 - 1) + 1);
            arrayOriginal[i] = alea;
            if (alea <= max && alea >= min) {
                cont++;
            }
        }

        arrayMaxMin = new int[cont];
        for (int i = 0; i < arrayOriginal.length; i++) {
            if (arrayOriginal[i] <= max && arrayOriginal[i] >= min) {
                arrayMaxMin[cont2] = arrayOriginal[i];
                cont2++;
            }
        }

        System.out.print("El array es: ");
        for (int i = 0; i < arrayMaxMin.length - 1; i++) {
            System.out.print(arrayMaxMin[i] + ", ");

        }
        System.out.println(arrayMaxMin[arrayMaxMin.length - 1]);

    }
}
