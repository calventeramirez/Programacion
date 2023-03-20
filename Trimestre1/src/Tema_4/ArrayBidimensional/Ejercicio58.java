package Tema_4.ArrayBidimensional;

import java.util.Scanner;

/*
Realizar un programa que pida al usuario un numero N entre 3 y 5
y a continuación crear una matriz NxN cuyo elemento se lo piden al usuario
 */
public class Ejercicio58 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int n = 0;
        int [][] matriz;
        do {
            System.out.print("Introduzca un numero para saber el tamaño de la matriz(entre 3 y 5): ");
            n = t.nextInt();
        } while (n < 3 || n > 5);
        
        matriz = new int[n][n];
        
        for(int i = 0; i< n; i++){
            for(int j = 0; j <n; j++){
                System.out.print("Introduzca el valor "+(i+1)+", "+(j+1)+": ");
                matriz[i][j]=t.nextInt();
            }
        }
        System.out.println("\nLa matriz es: ");
        
        for(int i = 0; i< n; i++){
            System.out.print("[");
            for(int j = 0; j <n; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("]");
        }
    }
}
