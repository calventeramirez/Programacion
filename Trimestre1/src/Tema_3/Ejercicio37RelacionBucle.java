
package Tema_3;

import java.util.Scanner;


public class Ejercicio37RelacionBucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num=1, primeraAparicion=0, ultimaAparicion=0, contador=0;
        Scanner t = new Scanner(System.in);
        do{
            System.out.print("Dame un número: ");
            num = t.nextInt();
            contador++;
  
            if(num==12){
                if(primeraAparicion==0){
                    primeraAparicion = contador;
                }
                ultimaAparicion = contador;
            }
            System.out.println(num);
        }while(num!=0);
        System.out.println();
        System.out.println("Primera Aparición en posicion: "+primeraAparicion);
        System.out.println("Ultima aparicion en posicion: "+ultimaAparicion);
    }

}
