package Tema_3;

import java.util.Scanner;

public class EjercicioClase0410 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3, mayor, minimo;
        Scanner t = new Scanner(System.in);
        System.out.print("Introduzca un numero 1: ");
        num1 = t.nextInt();
        System.out.print("Introduzca el numero 2: ");
        num2 = t.nextInt();
        System.out.print("Introduzca el numero 3: ");
        num3 = t.nextInt();
        t.close();

        mayor = num1;
        minimo = num1;

        if (mayor < num2) {
            mayor = num2;
        }
        if (mayor < num3) {
            mayor = num3;
        }

        if (minimo > num2) {
            minimo = num2;
        }
        if (minimo > num3) {
            minimo = num3;
        }

        System.out.println("El numero menor es: " + minimo + " y el numero mayor es: " + mayor);
    }

}
