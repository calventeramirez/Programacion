package Tema_4.ArrayBidimensional;

import java.util.Scanner;

/*
Crea un programa que encuentre el elemento de mayor 
valor de una matriz y...
a)... muestre la posición de su primera aparición.
b)... muestre una lista con las posiciones de todas sus apariciones.
 */
public class Ejercicio62 {

    public static void main(String[] args) {
        int[][] matriz;
        boolean primera = true;
        int n = 0, m = 0, num = 0, mayor = -1;
        Scanner t = new Scanner(System.in);

        do {
            System.out.print("Introduzca el valor de la N: ");
            n = t.nextInt();
            System.out.print("Introduzca el valor de la M: ");
            m = t.nextInt();
        } while (n <= 0 || m <= 0);

        matriz = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Introduzca el valor " + (i) + ", " + j + ": ");
                num = t.nextInt();
                matriz[i][j] = num;
                if (num > mayor) {
                    mayor = num;
                }
            }
        }
        System.out.println("EL numero mayor es: " + mayor);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matriz[i][j] == mayor) {
                    if (primera) {
                        System.out.println("La primera vez que aparece es: " + (i) + ", " + (j) + ".");
                        primera = false;
                    }
                    System.out.print("[" + (i) + ", " + (j) + "]");
                }
                System.out.println("");
            }
        }
    }
}
