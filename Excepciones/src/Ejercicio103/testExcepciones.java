
package Ejercicio103;

import java.util.Scanner;


public class testExcepciones{
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        Excepcion exc;
        try{
            System.out.println("Introduce una cadena de caracteres: ");
            exc = new Excepcion(t.nextLine());
            exc.modificar(-5);
       }catch(RuntimeException e){
            System.out.println(e.getMessage());
       }
        System.out.println("Programa terminado");
    }
}
