
package Tema_4.ArrayBidimensional;
/*
Crea un programa que cree una matriz de 10x10 e introduzca 
los resultados de las tablas de multiplicar del 1 al 10
(cada tabla en una fila). Luego muestra la matriz por
pantalla (en forma de matriz).
*/

public class Ejercicio60{
    public static void main(String[] args) {
       final int N = 10;
       int [][]matriz = new int[N][N];
       
       for(int i = 0; i<N; i++){
           for(int j = 0; j <N; j++){
               matriz[i][j] = (i+1)*(j+1);
           }
       }
       
       System.out.println("La matriz es: ");
        for(int i =0; i<N; i++){
            System.out.print("[");
            for(int j =0; j<N-1; j++){
                System.out.print(matriz[i][j]+", ");
            }
            System.out.println(matriz[i][N-1]+"]");
        }
    }
}
