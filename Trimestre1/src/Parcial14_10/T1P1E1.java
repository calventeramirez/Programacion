package Parcial14_10;

//Autor: Pablo Jesús Calvente Ramírez
import java.util.Scanner;

public class T1P1E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int MAX = 50, MIN = 1;
        int numero = 0;
        int alea = (int) ((Math.random() * (MAX - MIN + 1)) + MIN);
        System.out.print("Introduzca un numero entre 10 y 30: ");
        numero = teclado.nextInt();
        teclado.close();
        if (numero >= 10 && numero <= 30) {
            System.out.println("La maquina a sacado un " + alea);
            if (numero > alea) {
                System.out.println("Tú ganas!!!");
            } else if (numero < alea) {
                System.out.println("La maquina gana!!!");
            } else {
                System.out.println("Empate. Prueba suerta otra vez.");
            }
        } else {
            System.out.println("ERROR. El número introducido no está en el rango indicado.");
        }

    }

}
