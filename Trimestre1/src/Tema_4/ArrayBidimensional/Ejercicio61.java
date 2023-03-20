package Tema_4.ArrayBidimensional;

import java.util.Scanner;

/*
Crea un programa que cree una matriz de tamaño NxM 
(tamaños introducido por teclado)   e   introduzca   en  
ella  los  valores   también  a   través   del   teclado  teclado.  
A continuación deberá mostrar por pantalla cuántos valores
son mayores que cero, cuántos son menores que cero y 
cuántos son igual a cero (es decir, se muestran 3 números).
 */
public class Ejercicio61 {

    public static void main(String[] args) {
        int n = 0, m = 0, mayores = 0, menores = 0, iguales = 0, num=0;
        int[][] matriz;
        Scanner t = new Scanner(System.in);

        do {
            System.out.print("Introduzca el valor de la N: ");
            n = t.nextInt();
            System.out.print("Introduzca el valor de la M: ");
            m = t.nextInt();
        } while (n <= 0 || m <= 0);

        matriz = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Introduzca el valor "+(i+1)+", "+(j+1)+": ");
                num = t.nextInt();
                matriz[i][j] = num;
                
                if(num < 0){
                    menores++;
                }else if(num >0){
                    mayores++;
                }else{
                    iguales ++;
                }
            }
        }
        
        System.out.println("La matriz es: ");
        for(int i =0; i<n; i++){
            System.out.print("[");
            for(int j =0; j<m-1; j++){
                System.out.print(matriz[i][j]+", ");
            }
            System.out.println(matriz[i][m-1]+"]");
        }
        
        System.out.println("Los numeros mayor de 0 son: "+mayores);
        System.out.println("Los numeros menor de 0 son: "+menores);
        System.out.println("Los numeros iguales a 0 son: "+iguales);
    }
}
