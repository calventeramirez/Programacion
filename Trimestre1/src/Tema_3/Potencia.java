package Tema_3;

import java.util.Scanner;

public class Potencia {

    /**
     * @param args the command line arguments
     */
    /*
    *Pedir 2 numeros base y exponente y sin utilizar math.pow
    * -Si ponen negativos volver a pedir
    *-calcular la potencia
     */
    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);
        int base = 0, exp = 0, resultado = 1;
        do {
            System.out.print("Meta la base: ");
            base = t.nextInt();
            System.out.print("Mete el exponente: ");
            exp = t.nextInt();
        } while (base < 0 || exp < 0);
        for (int i =1; i <= exp; i++) {
            resultado *= base;
        }
        System.out.println("El resultado es: "+resultado);
    }

}
