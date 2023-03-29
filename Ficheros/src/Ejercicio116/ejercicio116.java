package Ejercicio116;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ejercicio116 {

    public static void main(String[] args) {
        String ruta = "src/Ejercicio116/miTexto.txt";
        FileReader lector = null;
        BufferedReader miBuffer = null;

        try {
            lector = new FileReader(ruta);
            miBuffer = new BufferedReader(lector);

            String linea = "";
            String primeraLinea = "";
            String ultimaLinea = "";
            String todasLineas = "";
            boolean primera = true;
            do {
                linea = miBuffer.readLine();
                if (linea != null) {
                    if (linea.length() > primeraLinea.length()) {
                        primera = true;
                    }
                    if (primera) {
                        primeraLinea = linea;
                        todasLineas = "";
                        primera = false;
                    }
                    if (linea.length() == primeraLinea.length()) {
                        ultimaLinea = linea;
                        todasLineas += linea + "\n";
                    }
                }
            } while (linea != null);

            System.out.println("-------------------------------------------");
            System.out.println("La primera linea es: " + primeraLinea);
            System.out.println("La ultima linea es: " + ultimaLinea);
            System.out.println("Todas las lineas es: " + todasLineas);
        } catch (FileNotFoundException e) {
            System.out.println("Error no se ha encontrado el fichero: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error al abrir o cerrar el fichero: " + e.getMessage());
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
