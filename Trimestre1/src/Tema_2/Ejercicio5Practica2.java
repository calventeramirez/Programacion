package Tema_2;

import java.util.Scanner;

public class Ejercicio5Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int sg, min, h;

        System.out.print("Introduzca el valor en segundos: ");
        sg = teclado.nextInt();
        h = sg / 3600;
        min = (h * 60) - (sg / 60);
        sg = sg % 60;

        System.out.println(h + ", " + min + ", " + sg);
    }

}
