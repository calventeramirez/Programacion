package Tema_3;

import java.util.Scanner;

public class SumaFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int mayor = 1, suma = 0;

        for (int i = 1; i <= 10; i++) {
            suma += i;
        }
        System.out.println("La suma es: " + suma);
        System.out.println("---------------------------------------------------------------------------------------------------------");
        do {
            System.out.print("Meta un numero mayor que 1 para calcular la suma entre 1 y este: ");
            mayor = t.nextInt();
        } while (mayor <= 1);
        suma = 0;
        for (int i = 1; i <= mayor; i++) {
            suma += i;
        }
        System.out.println("La suma es: " + suma);

    }

}
