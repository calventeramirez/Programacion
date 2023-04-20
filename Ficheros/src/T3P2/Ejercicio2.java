package T3P2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Pablo Jesús Calvente Ramírez
 *
 * @version 1.0
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        String ruta = "src/T3P2/numero.txt";
        FileReader lector = null;
        BufferedReader miBufferL = null;
        int mayor = -1, menor = 99, suma = 0;
        double media = 0.0;

        try {
            lector = new FileReader(ruta);
            miBufferL = new BufferedReader(lector);
            String linea = "";
            int cont = 0;
            System.out.println("Obteniendo datos del fichero numeros.txt...");
            do {
                linea = miBufferL.readLine();
                if (linea != null) {
                    String[] spliteo = linea.split(",");
                    for (int i = 0; i < spliteo.length; i++) {
                        if (mayor < Integer.parseInt(spliteo[i])) {
                            mayor = Integer.parseInt(spliteo[i]);
                        }
                        if (menor > Integer.parseInt(spliteo[i])) {
                            menor = Integer.parseInt(spliteo[i]);
                        }
                        suma += Integer.parseInt(spliteo[i]);
                        cont++;
                    }
                }
            } while (linea != null);
            media = (double) suma / cont;
            System.out.println("Mayor valor: " + mayor);
            System.out.println("Menor valor: " + menor);
            System.out.println("Suma total: " + suma);
            System.out.println("Media: " + media);
        } catch (IOException e) {
            System.out.println("ERROR: debido a la gestion del fichero");
        } finally {
            try {
                if (miBufferL != null) {
                    miBufferL.close();
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
