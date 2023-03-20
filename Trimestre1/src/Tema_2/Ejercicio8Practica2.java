package Tema_2;

import java.util.Scanner;

public class Ejercicio8Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int caras;
        Scanner t = new Scanner(System.in);
        int num;
        System.out.print("Introduzca el numero de caras: ");
        caras = t.nextInt();
        num =(int)((Math.random()*(caras-1+1))+1);
        System.out.println("El numero de caras es: "+ num);
    }

}
