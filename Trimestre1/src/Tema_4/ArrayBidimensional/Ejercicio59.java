
package Tema_4.ArrayBidimensional;
/*
Crea un programa que cree una matriz de tamaño 5x5 
que almacene los números del 1 al 25 y luego muestre 
la matriz por pantalla (en forma de matriz).
*/

public class Ejercicio59{
    public static void main(String[] args) {
       final int N = 5;
       int cont = 1;
       int [][] matriz = new int[N][N];
       
       for(int i =0; i<N; i++){
           for(int j = 0; j <N; j++){
               matriz[i][j] = cont;
               cont++;
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
