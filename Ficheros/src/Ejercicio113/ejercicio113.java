package Ejercicio113;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio113 {

    public static void main(String[] args) {
        String ruta = "src/Ejercicio113/EJ113.dat";
        FileWriter escritor = null;
        BufferedWriter miBuffer = null;
        String texto = "";
        Scanner t = new Scanner(System.in);

        try {
            escritor = new FileWriter(ruta);
            miBuffer = new BufferedWriter(escritor);
            System.out.print("Introduzca un texto hasta introducir un ENTER o salto de linea sin ninguna frase: ");
            do {
                texto = t.nextLine();
                miBuffer.write(texto);
                miBuffer.newLine();
            } while (texto.split("").length != 1 && !texto.split("").equals(System.lineSeparator()));
        } catch (IOException e) {
            System.out.println("Error no se ha podido crear el fichero: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error Se ha introducido mal el texto: " + e.getMessage());
            t.nextLine();
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
