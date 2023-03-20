package Tema_4.ArrayUnidimensional;

import java.util.Scanner;

/*
Usando   arrays:   escribe   un   programa   que   pida   10   números 
naturales   y   a continuación, indique cuál es el valor máximo de esa 
sucesión de números, el número de veces que aparece y sus respectivas 
posiciones. Ejemplo:
7 10 143 10 52 143 72 10 143 7
El valor máximo es el 143
Aparece 3 veces en las posiciones 2,5,8
 */
/**
 *
 * @author Pablo Calvente
 */
public class Ejercicio55 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int N = 10;
        int[] arrayOriginal = new int[N];
        int mayor = -1, num = 0, cont = 0;
        Scanner t = new Scanner(System.in);

        for (int i = 0; i < N; i++) {
            do {
                System.out.print("Introduzca un valor natural: ");
                num = t.nextInt();
                System.out.println("");
            } while (num <= 0);
            arrayOriginal[i] = num;
            if (mayor < num) {
                mayor = num;
                cont = 1;
            }else if(mayor == num){
                cont++;
            }
        }

        System.out.println("El valor maximo es: " + mayor);
        System.out.print("Aparece " + cont + " veces en las posiciones: ");

        for (int i = 0; i < N; i++) {
            if (arrayOriginal[i] == mayor) {
                System.out.print(i + ", ");
            }
        }
    }

}
