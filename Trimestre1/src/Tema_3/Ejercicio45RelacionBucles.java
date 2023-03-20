
package Tema_3;

import java.util.Scanner;


public class Ejercicio45RelacionBucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner t = new Scanner (System.in);
       int num = 0;
       int numAleatorio = (int)(Math.random()*(100-1+1)+1);
      // boolean encontrado=false;
       
       do{
           System.out.print("Dame un numero entre 1 y 100: ");
           num = t.nextInt();
           if(num<numAleatorio){
               System.out.println("Te has quedado corto");
           }else if(num>numAleatorio){
               System.out.println("Te has pasado");
           }/*else{
               //encontrado = true;
           }*/
       }while(num != numAleatorio);
       t.close();
        System.out.println("Felicidades has encontrado el numero");
    }

}
