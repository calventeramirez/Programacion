package Tema_2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

public class NombreYEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad;
        String nombre;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribeme el nombre: ");
        nombre = teclado.nextLine();
        System.out.println("Escribeme la edad: ");
        edad = teclado.nextInt();
        teclado.close();
        System.out.println("El nombre es: "+nombre+ " y la edad es: "+edad+" anyos");
    }

}
