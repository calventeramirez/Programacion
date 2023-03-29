package Ejercicio120;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio120 {

    public static void main(String[] args) {
        String ruta1 = "src/Ejercicio120/", ruta2 = "src/Ejercicio120/";
        FileReader lector1 = null;
        FileReader lector2 = null;
        BufferedReader miBufferL1 = null;
        BufferedReader miBufferL2 = null;
        FileWriter escritor = null;
        BufferedWriter miBufferE = null;
        Scanner t = new Scanner(System.in);

        try {
            System.out.print("Introduzca el nombre del primer archivo: ");
            ruta1 += t.nextLine();
            System.out.print("Introduzca el nombre del segundo archivo: ");
            ruta2 += t.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Error. Debe introducir caracteres validos: " + e.getMessage());
        }

        try {
            lector1 = new FileReader(ruta1);
            miBufferL1 = new BufferedReader(lector1);
            String nombre1 = ruta1.substring((ruta1.lastIndexOf("/") + 1));
            lector2 = new FileReader(ruta2);
            miBufferL2 = new BufferedReader(lector2);
            String nombre2 = ruta2.substring(ruta2.lastIndexOf("/") + 1);

            escritor = new FileWriter("src/Ejercicio120/" + nombre1.substring(0, nombre1.lastIndexOf(".")) + "-" + nombre2.substring(0, nombre2.lastIndexOf(".")) + ".txt");
            miBufferE = new BufferedWriter(escritor);

            String linea = "";
            do {
                linea = miBufferL1.readLine();
                if (linea != null) {
                    miBufferE.write(linea);
                    miBufferE.newLine();
                }
            } while (linea != null);
            do {
                linea = miBufferL2.readLine();
                if (linea != null) {
                    miBufferE.write(linea);
                    miBufferE.newLine();
                }
            } while (linea != null);
        } catch (FileNotFoundException e) {
            System.out.println("Error. No se ha encontrado fichero: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error. No se puede leer o cerrar el fichero: " + e.getMessage());
        } finally {
            try {
                if (miBufferL1 != null) {
                    miBufferL1.close();
                }
                if (lector1 != null) {
                    lector1.close();
                }
                if (miBufferL2 != null) {
                    miBufferL2.close();
                }
                if (lector2 != null) {
                    lector2.close();
                }
                if (miBufferE != null) {
                    miBufferE.close();
                }
                if (escritor != null) {
                    escritor.close();
                }
                t.close();
            } catch (IOException e) {
                System.out.println("Error. No se puede leer o cerrar el fichero: " + e.getMessage());
            }
        }
    }
}
