package Ejercicio73;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class main {

    public static void main(String[] args) {
        Pibe p1;
        Scanner t = new Scanner(System.in);
        String nombre;

        System.out.print("Introduzca el nombre del Pibe: ");
        nombre = t.next();

        p1 = new Pibe(nombre);
        for (int i = 0; i < 25; i++) {
            p1.jugar();
        }
        for (int i = 0; i < 5; i++) {
            p1.comer(false);
        }
        for (int i = 0; i < 2; i++) {
            p1.dormir();
        }

    }
}
