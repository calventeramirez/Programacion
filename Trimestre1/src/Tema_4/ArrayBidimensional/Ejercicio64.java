package Tema_4.ArrayBidimensional;

import java.util.Scanner;

/*
Se dice que una matriz M es simétrica perfecta si tiene el
mismo número de filas y de columnas (MxM) y si todos
sus elementos cumplen que el elemento de la posición [i][j] 
es el mismo que el de la posición [j][i].
Implementa un programa que analice una matriz (creala 
y ponle valores tú) e indique si es simétrica perfecta o no.
 */
public class Ejercicio64 {

    public static void main(String[] args) {
        int[][] matriz;
        boolean simetrica = true;
        int m = 0;
        Scanner t = new Scanner(System.in);

        do {
            System.out.print("Introduzca el tamaño de la matriz(mayor que 0): ");
            m = t.nextInt();
        } while (m <= 0);

        matriz = new int[m][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Introduzca el valor "+i+", "+j+": ");
                matriz[i][j] = t.nextInt();
            }
        }
        
        for (int i = 0; i < m && simetrica; i++) {
            for (int j = 0; j < m && simetrica; j++) {
                if(matriz[i][j] != matriz[j][i] && i != j){
                    simetrica =false;
                }
            }
        }
        
        System.out.print("La matriz es: ");
        if(simetrica){
            System.out.println("SIMETRICA");
        }else{
            System.out.println("NO SIMETRICA");
        }
    }
}
