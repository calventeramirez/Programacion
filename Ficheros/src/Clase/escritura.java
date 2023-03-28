package Clase;
//1. Importamos la herramientas que vamos a usar

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class escritura {

    public static void main(String[] args) {
        String ruta = "src/Clase/salida.txt";
        FileWriter escritor = null;
        BufferedWriter miBuffer = null;

        try {
            //2.Creamos los flujos de datos
            escritor = new FileWriter(ruta, true);//El true es para que no sobreescriba el fichero y queremos que sobreescriba quitamos el true, pero perderemos la info de cada fichero cuando ejecutemos el codigo.
            miBuffer = new BufferedWriter(escritor);

            //3.Escribir
            miBuffer.write("Kakarot"); //Para cargar los datos al fichero
            miBuffer.newLine(); //Para salto de linea
            miBuffer.write(Integer.toString(123));//Para meter numeros

            /*//4.Cerramos los flujos(Nivel junior) (No es recomendable)
            miBuffer.close();
            escritor.close();*/
        } catch (IOException e) {
            System.out.println("Error en escritura: " + e.getMessage());
        } finally {
            //4.Nivel profesional (Muy recomendable)
            try {
                if (miBuffer != null) {
                    miBuffer.close();
                }
                if (escritor != null) {
                    escritor.close();
                }
            } catch (IOException e) {
                System.out.println("Error en escritura: " + e.getMessage());
            }

        }
    }
}
