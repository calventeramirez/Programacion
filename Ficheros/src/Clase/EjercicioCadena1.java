package Clase;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*Enunciado Crear poema.txt copiar el contenido de poema.txt a salida1.dat y luego copiar en salida2.dat el contenido de poema.txt*/
public class EjercicioCadena1 {

    public static void main(String[] args) {
        String ruta = "src/Clase/poema.txt";
        FileReader lector = null;
        FileWriter escritor = null;
        FileWriter escritor2 = null;
        BufferedReader miBufferR = null;
        BufferedWriter miBufferW = null;
        BufferedWriter miBufferW2 = null;
        try {
            lector = new FileReader(ruta);
            miBufferR = new BufferedReader(lector);
            escritor = new FileWriter("src/Clase/salida1.dat");
            miBufferW = new BufferedWriter(escritor);
            escritor2 = new FileWriter("src/Clase/salida2.dat");
            miBufferW2 = new BufferedWriter(escritor2);

            String linea = "";
            int cont = 0;
            do {
                linea = miBufferR.readLine();
                if (linea != null) {
                    miBufferW.write(linea);
                    miBufferW.newLine();
                    cont++;
                    miBufferW2.write(cont + ": " + linea);
                    miBufferW2.newLine();
                }
            } while (linea != null);
        } catch (FileNotFoundException e) {
            System.out.println("Error. No se encuentra el fichero: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error. No se puede leer o cerrar el fichero: " + e.getMessage());
        } finally {
            try {
                if (miBufferR != null) {
                    miBufferR.close();
                }
                if (lector != null) {
                    lector.close();
                }
                if (miBufferW != null) {
                    miBufferW.close();
                }
                if (escritor != null) {
                    escritor.close();
                }
                if (miBufferW2 != null) {
                    miBufferW2.close();
                }
                if (escritor2 != null) {
                    escritor2.close();
                }
            } catch (IOException e) {
                System.out.println("Error. No se puede leer o cerrar el fichero: " + e.getMessage());
            }
        }

    }
}
