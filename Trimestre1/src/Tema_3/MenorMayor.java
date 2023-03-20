package Tema_3;

import java.util.Scanner;

public class MenorMayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int menor, mayor, aux1, aux2, suma = 0;

        System.out.print("Introduzca el menor valor: ");
        menor = t.nextInt();
        System.out.print("Introduzca el mayor valor: ");
        mayor = t.nextInt();
        aux1 = menor;
        aux2 = menor;
        while (aux1 <= mayor) {
            System.out.print(aux1 + " ");
            suma += aux1;
            aux1++;
        }
        System.out.println("\n");
        System.out.println("-----------------------------------------------");
        while (aux2 <= mayor) {
            if (aux2 % 2 == 0) {
                System.out.print(aux2);
            }
            aux2++;
        }
        System.out.println("\n-----------------------------------------------");
        System.out.println("La suma es: " + suma);
    }

}
