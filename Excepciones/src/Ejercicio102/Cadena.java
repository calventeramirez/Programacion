package Ejercicio102;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cadena {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entero;
        String cadena;
        try {
            System.out.print("Introduce una cadena de texto: ");
            cadena = sc.next();
            System.out.print("Introduce el numero para sacar la letra de la cadena: ");
            entero = sc.nextInt();

            System.out.print(cadena.charAt(entero));
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("No existe la posición  en la cadena");
        }catch(InputMismatchException e){
            System.err.println("Error al introducir los datos");
        }

    }
}
