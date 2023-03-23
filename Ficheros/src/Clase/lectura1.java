package Clase;

//1.Importar las herramientas que vamos a usar
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class lectura1 {

    public static void main(String[] args) {
        String ruta = "src/Clase/prueba.txt";
        FileReader lector = null;
        BufferedReader mibuffer = null;
        try {
            //2.Creamos los flujos de datos 
            lector = new FileReader(ruta);
            mibuffer = new BufferedReader(lector);

            //3.Leer como necesito y/o me digan
            //Para lineas
            String linea = "";
            int cont = 0;
            do {
                linea = mibuffer.readLine();
                if (linea != null) {//Para que no salga null al final del fichero
                    System.out.println(linea);
                    cont++;
                }
            } while (linea != null);
            System.out.println("El numero de lineas es: " + cont);

            //Para caracteres
            int cosa = 0;
            int conta = 0;
            do {
                cosa = mibuffer.read();
                if (cosa != -1) {//Para evitar que saque -1 al final
                    System.out.println((char) cosa);
                    conta++;
                }
            } while (cosa != -1);
            System.out.println("El numero de caracteres es: " + conta);
            /* //4.Cerramos todos los flujos (Nivel Junior)
            mibuffer.close();
            lector.close();*/
        } catch (FileNotFoundException e) {
            System.out.println("Error. Fichero no encontrado.");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("Error. No se ha podido leer o cerrar el fichero");
            System.out.println(e.getMessage());
        } finally {
            //4.Cerramos todos los flujos (Nivel Senior)
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
