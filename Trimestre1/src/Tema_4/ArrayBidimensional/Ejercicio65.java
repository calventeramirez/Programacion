
package Tema_4.ArrayBidimensional;

import java.util.Scanner;

/*
Implementar el juego de Piedra-Papel-Tijeras para dos jugadores
humanos usando una matriz de comprobaciones: Cada fila 
corresponde a uno de los tres elementos de juego.   Igual   para 
las   columnas.     Las   celdas   de   esa   matriz   tendrá   
algunos   de   los siguientes valores:
•0 : si el elemento de la fila y el de la columna son el mismo
(empate).
•1: si el elemento de la fila gana al elemento de la columna.
•-1 : si el elemento de la fila pierde contra el elemento de la
columna. 
*/

public class Ejercicio65{
    public static void main(String[] args) {
       int [][]matrizComprobacion={{0,-1,1},{1,0,-1},{-1, 1,0}};
       Scanner t = new Scanner(System.in);
       int jugador1=-1, jugador2=-1, resultado=-2;
       do{
           System.out.print("Introduzca 0 para piedra, 1 para papel y 2 para tijeras: ");
           jugador1 = t.nextInt();
       }while(jugador1<0 || jugador1>2);
       
       do{
           System.out.print("Introduzca 0 para piedra, 1 para papel y 2 para tijeras: ");
           jugador2 = t.nextInt();
       }while(jugador2<0 || jugador2>2);
        
       resultado =matrizComprobacion[jugador1][jugador2];
       switch(resultado){
           case -1:
               System.out.println("Gana el jugador 2");
               break;
           case 0:
               System.out.println("Empate");
               break;
           case 1:
               System.out.println("Gana el jugador 1");
               break;
       }
    }
}
