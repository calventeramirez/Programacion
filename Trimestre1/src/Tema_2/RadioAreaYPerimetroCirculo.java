package Tema_2;

import java.util.Scanner;

public class RadioAreaYPerimetroCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double radio, area, perimetro;
        System.out.print("Introduzca el valor del radio: ");
        radio = teclado.nextDouble();
        teclado.close();
        area = Math.PI * Math.pow(radio, 2);
        perimetro = 2 * Math.PI * radio;

        System.out.println("El valor del area es: " + area + " y el perimetro es: " + perimetro + " para un circulo de radio " + radio);

    }

}
