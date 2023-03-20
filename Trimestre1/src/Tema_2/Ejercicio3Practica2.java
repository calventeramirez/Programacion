
package Tema_2;

import java.util.Scanner;


public class Ejercicio3Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double v1,v2,v3,v4,v5,media;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduzca 5 valores: ");
        System.out.print("Introduzca el valor 1: ");
        v1=teclado.nextDouble();
        System.out.print("Introduzca el valor 2: ");
        v2=teclado.nextDouble();
        System.out.print("Introduzca el valor 3: ");
        v3=teclado.nextDouble();
        System.out.print("Introduzca el valor 4: ");
        v4=teclado.nextDouble();
        System.out.print("Introduzca el valor 5: ");
        v5=teclado.nextDouble();
        
        media = (v1+v2+v3+v4+v5)/5;
        System.out.println("La media es: "+media);
    }

}
