
package Tema_4.ArrayUnidimensional;

import java.util.Scanner;


public class ArraysMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int N, nota, suma=0;
       int []notas;
       
       Scanner t = new Scanner(System.in);
        System.out.print("Introduzca el numero de notas que vas a introducir: ");
        N = t.nextInt();
        notas=new int[N];
        for(int i = 0; i<notas.length; i++){
           do{
               System.out.print("Introduzca la nota "+(i+1)+": ");
               nota = t.nextInt();
           }while(nota < 0 || nota>10);
            notas[i]=nota;
        }
        for(int i = 0; i<notas.length; i++){
            suma += notas[i];
        }
        System.out.println("La suma es: "+suma);
        System.out.println("La media es: "+ (suma/notas.length));
    }

}
