package Clase;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*
Del fichero poema.txt mostrar cada palabra por pantalla debajo de la otra
*/
public class EjercicioCadena2 {

    public static void main(String[] args) {
        String ruta = "src/Clase/poema.txt";
        FileReader lector = null;
        BufferedReader miBuffer = null;

        try {
            lector = new FileReader(ruta);
            miBuffer = new BufferedReader(lector);

            String linea = "";
            do {
                linea = miBuffer.readLine();
                if (linea != null) {
                    String[] cadena = linea.split(" ");
                    for (int i = 0; i < cadena.length; i++) {
                        System.out.println(cadena[i]);
                    }
                }

            } while (linea != null);
        } catch (FileNotFoundException e) {
            System.out.println("Error. Fichero no encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error. No se ha podido cerrar o leer el fichero: " + e.getMessage());
        }
    }
}
