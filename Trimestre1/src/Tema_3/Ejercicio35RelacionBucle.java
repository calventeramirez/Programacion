
package Tema_3;

import java.util.Scanner;


public class Ejercicio35RelacionBucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner t = new Scanner(System.in);
       int n=0, m=0;
       do{
           System.out.print("Introduce primer número: ");
           n = t.nextInt();
           System.out.print("Introduce segundo número: ");
           m = t.nextInt();
       }while(n<0 || m<0);
        System.out.print("Los multiplos de "+n+" y  "+ (n*m)+" son: ");
       for(int i = n; i<=(m*n); i++){
           if(i %n == 0){
               System.out.print(i+" ");
           }
       }
    }

}
