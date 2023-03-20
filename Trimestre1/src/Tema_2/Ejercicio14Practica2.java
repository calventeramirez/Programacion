package Tema_2;

import java.util.Scanner;

public class Ejercicio14Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int segundos, min;
        System.out.print("Introduzca el numero de segundos de un partido: ");

        segundos = t.nextInt();
        min =  (segundos / 60)+1;

        System.out.println("Estamos en el minuto: " + min);

    }

}
