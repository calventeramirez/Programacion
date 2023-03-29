package Ejercicio119;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ejercicio119 {

    public static void main(String[] args) {
        String ruta = "src/Ejercicio119/miFichero.txt";
        FileReader lector = null;
        BufferedReader miBuffer = null;

        try {
            lector = new FileReader(ruta);
            miBuffer = new BufferedReader(lector);

            String linea = "";
            do {
                linea = miBuffer.readLine();
                if (linea != null) {
                    String[] spliteo = linea.split(":");
                    System.out.println("Item: " + spliteo[0]);
                    System.out.println("Precio: " + spliteo[1]);
                    System.out.println("Cantidad: " + spliteo[2]);
                }
            } while (linea != null);
        } catch (FileNotFoundException e) {
            System.out.println("Error. No se encuentra el archivo: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error. No se puede cerrar o leer el fichero: " + e.getMessage());
        } finally {
            try {
                if (miBuffer != null) {
                    miBuffer.close();
                }
                if (lector != null) {
                    lector.close();
                }
            } catch (IOException e) {
                System.out.println("Error. No se ha podido leer o cerrar el fichero: ");
                System.out.println(e.getMessage());
            }
        }
    }
}
