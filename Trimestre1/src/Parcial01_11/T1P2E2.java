package Parcial01_11;

//Autor: Pablo Jesús Calvente Ramírez
import java.util.Scanner;

public class T1P2E2 {

    public static void main(String[] args) {
        int contadorJugador = 0, contadorMaquina = 0;//Contadores de vidas
        int jugador = 0, maquina = 0;//numeros que han metido la maquina y el jugador
        Scanner teclado = new Scanner(System.in);

        do {//do-while para comprobar si el jugador no ha metido 0 para salir
            System.out.println("Victorias Maquina: " + contadorMaquina);
            System.out.println("Victorias Jugador: " + contadorJugador);
            do {//do while para comprobar si esta entre 5 y 15 ademas que si es 0 tenga que salir
                System.out.print("Introduce un numero entre 5 y 15 (0 para salir): ");
                jugador = teclado.nextInt();
            } while ((jugador < 5 || jugador > 15) && jugador != 0);
            if (jugador != 0) {//para no hacer las operaciones si el jugador no quiere salir
                maquina = (int) (Math.random() * (20 - 1 + 1) + 1);
                System.out.println("La maquina ha sacado el numero " + maquina + ".");
                if (jugador > maquina) {//comprueba si el jugador gana
                    System.out.println("Tu ganas!!");
                    contadorJugador++;
                } else if (jugador < maquina) {//compruebo si el jugador pierde
                    System.out.println("Has perdido!!");
                    contadorMaquina++;
                } else {//caso de empate
                    System.out.println("Empate");
                }
            }

        } while (jugador != 0);
        System.out.println("Game over!");
        teclado.close();
    }
}
