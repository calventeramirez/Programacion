package Ejercicio114;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ejercicio114 {

    public static void main(String[] args) {
        String ruta = "src/Ejercicio114/ejercicio114.txt";
        FileReader lector = null;
        BufferedReader mibuffer = null;

        try {
            lector = new FileReader(ruta);
            mibuffer = new BufferedReader(lector);
            String linea = "";
            int cont = 0;

            do {
                linea = mibuffer.readLine();
                if (linea != null) {
                    cont++;
                    System.out.println(cont + ": " + linea);
                }
            } while (linea != null);
        } catch (FileNotFoundException e) {
            System.out.println("Error. Fichero no encontrado.");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("Error. No se ha podido leer o cerrar el fichero");
            System.out.println(e.getMessage());
        } finally {
            try {
                if (mibuffer != null) {
                    mibuffer.close();
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
