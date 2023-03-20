
package Tema_4.ArrayBidimensional;

/*
Crear Array 5x5 y rellenarlo con numero entre 1 y 20.
a)Mostrar la matriz
b)crear otra matriz llamada "copia" del mismo tamaño y vuelva el contenidode la primera matriz
en copia pero si el numero es mayor a 10 pones un 9 y muestrala
c)Calcula la suma de todos los elemntos de "copias"
d)Calcula la multiplicación de la diagonal principal de "copia"
*/
public class matrizCopia{
    public static void main(String[] args) {
       final int N = 5;
       int [][]original = new int[N][N], copia = new int[N][N];
       int suma=0, multiplicacion = 1;
       //a)
       for(int i =0; i<N; i++){
           for (int j = 0; j<N; j++){
               original[i][j]=(int)(Math.random()*(20-1+1)+1);
           }
       }
        System.out.println("Matriz original: ");
       for(int i =0; i<N; i++){
           System.out.print("[");
           for (int j = 0; j<N-1; j++){
               System.out.print(original[i][j]+", ");
           }
           System.out.println(original[i][N-1]+"]");
       }
       
       //B)
       for(int i =0; i<N; i++){
           for (int j = 0; j<N; j++){
               if(original[i][j]>10){
                   copia[i][j]=9;
               }else{
                   copia[i][j]=original[i][j];
               }
               
               if(i == j){
                   multiplicacion *= copia[i][j];
               }
               
               suma += copia[i][j];
           }
       }
        System.out.println("La copia de la matriz es: ");
       for(int i =0; i<N; i++){
           System.out.print("[");
           for (int j = 0; j<N-1; j++){
               System.out.print(copia[i][j]+", ");
           }
           System.out.println(copia[i][N-1]+"]");
       }
       
       //C)
        System.out.println("La suma de la matriz copia es: "+suma);
        
        //d)
        System.out.println("La multiplicacion es: "+multiplicacion);
    }
}
