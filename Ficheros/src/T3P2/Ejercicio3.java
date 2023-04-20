package T3P2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
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
public class Ejercicio3 {

    public static void main(String[] args) {
        String ruta = "src/T3P2/";
        Scanner t = new Scanner(System.in);
        FileReader lector = null;
        FileWriter escritor = null;
        BufferedReader miBufferL = null;
        BufferedWriter miBufferE = null;

        System.out.print("Introduzca fichero a codificar: ");
        //Pido fichero
        try {
            ruta += t.next();

        } catch (InputMismatchException e) {
            System.out.println("Error: caracter no valido.");
        }
        
        try {
            //Genero la ruta de codificacion
            String ruta2 = ruta.split("\\.")[0] + ".cod";
            //Instacio las clases con las que vamos a leer y escribir
            lector = new FileReader(ruta);
            escritor = new FileWriter(ruta2);
            miBufferL = new BufferedReader(lector);
            miBufferE = new BufferedWriter(escritor);

            int caracter;//variable para leer caracteres
            do {
                caracter = miBufferL.read();//leo caracter a caracter
                if (caracter != -1 && caracter != (int) ('\r') && caracter != (int) ('\n')) {//Compruebo que no sea o retorno de carro o final de fichero
                    if (caracter >= 65 && caracter <= 89) {//sumo uno desde A a Y
                        caracter++;
                    } else if (caracter == 90) {//Si es Z la pongo como A
                        caracter = 65;
                    } else if (caracter >= 97 && caracter <= 121) {//sumo 1 desde a hasta y
                        caracter++;
                    } else if (caracter == 122) {//si es z cambio por a
                        caracter = 97;
                    } else if (caracter == 32) {//sustitullo el espacio en blanco por ]
                        caracter = (int) (']');//Corchete de cierre
                    } else if (caracter >= 48 && caracter <= 57) {//sustitullo los numeros por Ç
                        caracter = (int) ('Ç');
                    } else {//Demas caracteres le quito 5 valores 
                        caracter -= 5;
                    }
                    //Escribo en fichero
                    miBufferE.write(caracter);

                } else if (caracter == 10) {//si es salto de linea lo hago
                    miBufferE.newLine();
                }
            } while (caracter != -1);
            System.out.println("Archivo " + ruta2.split("/")[2] + " generado con exito.");
        } catch (IOException e) {
            System.out.println("Error al abrir o cerrar el fichero.");
        } finally {
            try {
                //Cierro buffers y filewriter
                if (miBufferL != null) {
                    miBufferL.close();
                }
                if (lector != null) {
                    lector.close();
                }
                if (miBufferE != null) {
                    miBufferE.close();
                }
                if (escritor != null) {
                    escritor.close();
                }
            } catch (IOException e) {
                System.out.println("Error. No se ha podido leer o cerrar el fichero: ");
            }
        }
    }
}
