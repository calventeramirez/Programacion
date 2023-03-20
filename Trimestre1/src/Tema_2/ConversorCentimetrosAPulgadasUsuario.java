package Tema_2;

import java.util.Scanner;

public class ConversorCentimetrosAPulgadasUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double PULGADASACTMS = 2.54;
        Scanner teclado = new Scanner(System.in);
        double ctms = teclado.nextDouble();
        teclado.close();
        double pulgadas = ctms / PULGADASACTMS;

        System.out.print(ctms + " ctms son " + pulgadas + " pulgadas");
    }

}
