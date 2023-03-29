package Ejercicio118;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio118 {

    public static void main(String[] args) {
        String ruta = "src/Ejercicio118/Aurora.txt";
        FileReader lector = null;
        BufferedReader miBuffer = null;
        Scanner t = new Scanner(System.in);

        try {
            System.out.println("Escriba nombre de fichero (si no indicada nada aurora.txt): ");
            System.out.print(">>");
            String posible = "";
            posible = t.nextLine();

            if (!posible.equalsIgnoreCase("")) {
                ruta = "src/Ejercicio118/" + posible;
            }
        } catch (InputMismatchException e) {
            System.out.println("Error. Has introducido un dato incorrecto: " + e.getMessage());
            t.nextLine();
        }

        try {
            lector = new FileReader(ruta);
            miBuffer = new BufferedReader(lector);
            String linea = "";
            System.out.println("Abriendo " + ruta.substring(ruta.lastIndexOf("/") + 1));

            do {
                linea = miBuffer.readLine();
                if (linea != null) {
                    System.out.println(linea);
                }
            } while (linea != null);
        } catch (FileNotFoundException e) {
            System.out.println("Error al abrir el fichero: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error al leer o cerrar el fichero: " + e.getMessage());
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
