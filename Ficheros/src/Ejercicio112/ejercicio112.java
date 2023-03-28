package Ejercicio112;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio112 {

    public static void main(String[] args) {
        String ruta = "src/Ejercicio112/datos.txt";
        FileWriter escritor = null;
        BufferedWriter miBuffer = null;
        Scanner teclado = new Scanner(System.in);

        try {
            escritor = new FileWriter(ruta);
            miBuffer = new BufferedWriter(escritor);
            System.out.print("Dime tu nombre >> ");
            String nombre = teclado.nextLine();
            System.out.print("Dime tu edad >> ");
            int edad = teclado.nextInt();

            miBuffer.write(nombre);
            miBuffer.newLine();
            miBuffer.write(Integer.toString(edad));

            System.out.println("Dastos guardados en datos.txt");

        } catch (IOException e) {
            System.out.println("Error en la escritura: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error al introducir el dato: " + e.getMessage());
        } finally {
            try {
                if (miBuffer != null) {
                    miBuffer.close();
                }
                if (escritor != null) {
                    escritor.close();
                }
            } catch (IOException e) {
                System.out.println("Error en escritura: " + e.getMessage());
            }
        }

    }
}
