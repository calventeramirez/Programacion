/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema_3;

import java.util.Scanner;

/**
 *
 * @author Pablo Calvente
 */
public class Cuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        int filas=1;
        do{
            System.out.println("Introduzca un numero de filas: ");
            filas=t.nextInt();
        }while(filas<=0);
        
        for(int i = 1; i<=filas; i++){
            for(int j = 1; j<=filas; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
}
