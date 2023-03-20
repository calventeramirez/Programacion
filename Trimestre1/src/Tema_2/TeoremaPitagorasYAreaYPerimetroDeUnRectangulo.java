package Tema_2;

import java.util.Scanner;

public class TeoremaPitagorasYAreaYPerimetroDeUnRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valor1, valor2, pitagoras, area, perimetro;

        System.out.print("Introduzca el primer valor: ");
        valor1 = teclado.nextDouble();
        System.out.print("Introduzca el segundo valor: ");
        valor2 = teclado.nextDouble();
        teclado.close();
        pitagoras = Math.sqrt(Math.pow(valor1, 2) + Math.pow(valor2, 2));
        area = 2 * valor1 + 2 * valor2;
        perimetro = valor1 * valor2;
        System.out.println("Los valores son: " + valor1 + " y " + valor2);
        System.out.println("El teorema de pitagoras es: " + pitagoras);
        System.out.println("El area del rectangulo es: " + area + " y el perimetro es: " + perimetro);

    }

}
