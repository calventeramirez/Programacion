
package Tema_2;

import java.util.Scanner;

public class Ejercicio13Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Por pantalla datos: baldosa: lado(cm)(cuadrada), habitacion: ancho (metro), largo(metro)
        double anchohab, largohab, ladobal, preciobal, areahab, areabal, numbal, preciofinal;
        Scanner t = new Scanner(System.in);
        System.out.println("Introduzca la dimension de la habitacion: ");
        System.out.println("Introduzca el largo de la habitacion:");
        largohab = t.nextDouble();
        System.out.println("Introduzca el ancho de la habitacion: ");
        anchohab = t.nextDouble();
        System.out.println("Introduzca el largo de la baldosa: ");
        ladobal = t.nextDouble();
        System.out.println("Introduzca el valor de una baldosa: ");
        preciobal = t.nextDouble();
        t.close();
        ladobal = ladobal / 100;
        areabal = ladobal * ladobal;
        areahab = anchohab * largohab;
        numbal = Math.ceil(areahab / areabal);

        preciofinal = numbal * preciobal;

        System.out.println("El valor de las baldozas son: " + preciofinal + " por " + numbal + " baldosas");

    }

}
