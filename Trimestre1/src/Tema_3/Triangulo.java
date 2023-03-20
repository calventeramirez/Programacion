package Tema_3;

import java.util.Scanner;

/**
 *
 * @author Pablo Calvente
 */
public class Triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int filas = 1;
        do {
            System.out.print("Introduzca un numero de filas: ");
            filas = t.nextInt();
        } while (filas <= 0);

        for (int i = 1; i <= filas; i++) {
            for (int blanco = 1; blanco <= (filas - i); blanco++) {
                System.out.print(" ");
            }
            for (int negro = 1; negro <= i; negro++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

}
