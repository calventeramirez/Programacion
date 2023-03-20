package Tema_4.ArrayBidimensional;

import java.util.Scanner;

/*
Dada una matriz MxM, crear un programa que muestre: 
a)El mayor elemento de la diagonal principal.
b)La media de los valores de la diagonal principal.
 */
public class Ejercicio63 {

    public static void main(String[] args) {
        int m = 0, mayor = -1, suma = 0, cont = 0;
        double media = 0.0;
        int[][] matriz;
        Scanner t = new Scanner(System.in);

        do {
            System.out.print("Introduzca el tamaño de la matriz: ");
            m = t.nextInt();
        } while (m <= 0);

        matriz = new int[m][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Introduzca el valor " + (i) + ", " + j + ": ");
                matriz[i][j] = t.nextInt();
                if (matriz[i][j] > mayor && i == j) {
                    mayor = matriz[i][j];
                }
                if (i == j) {
                    suma += matriz[i][j];
                    cont++;
                }
            }
        }
        if (cont > 0) {
            media = suma / cont;
        }
        System.out.println("El elemento mayor de la diagonal es: " + mayor);
        System.out.println("La media de los valores de la diagonal es: " + media);
    }
}
