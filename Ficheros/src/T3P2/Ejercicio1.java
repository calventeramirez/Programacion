package T3P2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * 
 * @author Pablo Jesús Calvente Ramírez
 * 
 * @version 1.0
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        FileWriter escritor = null;
        BufferedWriter miBufferE = null;
        int l = 0, n = 0;
        String ruta = "src/T3P2/numero.txt";
        //Pido numero de lineas mayor a 2
        do {
            System.out.print("Numero de lineas del fichero: ");
            try {
                l = t.nextInt();
                if (l < 3) {
                    System.out.println("Valores mayores a 2!!");
                }
            } catch (InputMismatchException e) {
                t.nextLine();
                System.out.println("ERROR: debes introducir un numero !!");
            }
        } while (l < 3);
        //Pido la cantidad de numeros
        do {
            System.out.print("Cantidad de numeros por linea: ");
            try {
                n = t.nextInt();
                if (n < 1) {
                    System.out.println("Valores mayores que 2!!");
                }
            } catch (InputMismatchException e) {
                t.nextLine();
                System.out.println("ERROR: debes introducir un número");
            }
        } while (n < 2);

        try {
            //Comenzamos a crear el ficheo
            escritor = new FileWriter(ruta);
            miBufferE = new BufferedWriter(escritor);
            int cont = 0;
            do {
                for (int i = 0; i < n - 1; i++) {
                    miBufferE.write(((int) (Math.random() * 17) + 3) + ",");
                }
                miBufferE.write(((int) (Math.random() * 17) + 3) + "");
                miBufferE.newLine();
                cont++;
            } while (cont < l);
            System.out.println("El fichero numeros.txt se ha generado con exito.");
        } catch (IOException e) {
            System.out.println("Error. No se ha podido guardar el numero");
        } finally {
            //Cierro el escritor y el buffer
            try {
                if (miBufferE != null) {
                    miBufferE.close();
                }
                if (escritor != null) {
                    escritor.close();
                }
            } catch (IOException e) {
                System.out.println("Error. No se ha podido guardar el numero");
            }
        }
    }
}
