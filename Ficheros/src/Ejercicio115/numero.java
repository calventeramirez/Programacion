package Ejercicio115;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class numero {

    public static void main(String[] args) {
        String ruta = "src/Ejercicio115/numeros.txt";
        FileReader lector = null;
        BufferedReader miBuffer = null;

        try {
            lector = new FileReader(ruta);
            miBuffer = new BufferedReader(lector);
            String linea = "";
            int max = -999999, min = 999999, vecesMax = 0, vecesMin = 0, transformacion = 0;
            do {
                linea = miBuffer.readLine();
                if (linea != null) {
                    transformacion = Integer.parseInt(linea);
                    if (max < transformacion) {
                        max = transformacion;
                        vecesMax = 1;
                    } else if (min > transformacion) {
                        min = transformacion;
                        vecesMin = 1;
                    } else if (max == transformacion) {
                        vecesMax++;
                    } else if (min == transformacion) {
                        vecesMin++;
                    }
                }
            } while (linea != null);
            System.out.println("-----------------------------------------------------------------");
            System.out.println("Numero maximo: " + max + " y aparece: " + vecesMax);
            System.out.println("Numero minimo: " + min + " y aparece: " + vecesMin);
            System.out.println("-----------------------------------------------------------------");
        } catch (FileNotFoundException e) {
            System.out.println("Error fichero no encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error al leer o cargar el fichero: " + e.getMessage());
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
