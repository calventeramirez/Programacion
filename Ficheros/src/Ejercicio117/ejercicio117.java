package Ejercicio117;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ejercicio117 {

    public static void main(String[] args) {
        String ruta = "src/Ejercicio117/miFichero.txt";
        FileReader lector = null;
        BufferedReader miBuffer = null;

        try {
            lector = new FileReader(ruta);
            miBuffer = new BufferedReader(lector);
            String linea = "";
            int totalCaracteres = 0, totalPalabras = 0, totalLineas = 0;

            do {
                linea = miBuffer.readLine();
                if (linea != null) {
                    totalCaracteres += linea.replace(" ", "").length();
                    totalPalabras += linea.split(" ").length;
                    totalLineas++;
                }
            } while (linea != null);
            System.out.println("--------------------------------------------");
            System.out.println("Total de caracteres: " + totalCaracteres);
            System.out.println("Total de palabras: " + totalPalabras);
            System.out.println("Total de lineas: " + totalLineas);
            System.out.println("--------------------------------------------");
        } catch (FileNotFoundException e) {
            System.out.println("Error. No se a encontrado el fichero de texto: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error. No se ha podido leer o cerrar el fichero: " + e.getMessage());
        } finally {
            try {
                if (miBuffer != null) {
                    miBuffer.close();
                }
                if (lector != null) {
                    lector.close();
                }
            } catch (IOException e) {
                System.out.println("Error. No se ha podido leer o cerrar el fichero");
                System.out.println(e.getMessage());
            }
        }
    }
}
