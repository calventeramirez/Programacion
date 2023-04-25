package Ejercicio128;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Pablo Calvente
 */
public class medac {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        HashMap<Integer, Double> mapa = new HashMap<>();
        int n = 0;

        System.out.println("-------------------------");
        System.out.println("|   Aplicacion Medac    |");
        System.out.println("-------------------------");

        System.out.print("Introduzca el numero total de trabajadores: ");
        try {
            n = t.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error. Debe meter un numero valido.");
            t.nextLine();
        }

        for (int i = 0; i < n; i++) {
            int clave = -1; //0 hombres, 1 mujeres
            try {
                do {
                    System.out.println("Introduzca el sexo (0: hombre, 1:mujer):");
                    System.out.print(">> ");
                    clave = t.nextInt();
                } while (clave != 0 && clave != 1);
            } catch (InputMismatchException e) {
                System.out.println("Error. Debe meter un numero valido.");
                t.nextLine();
            }

            double sueldo = -1;
            try {
                do {
                    System.out.println("Introduzca el sueldo:");
                    System.out.print(">> ");
                    sueldo = t.nextDouble();
                } while (sueldo <= 0);
            } catch (InputMismatchException e) {
                System.out.println("Error. Debe meter un numero valido.");
                t.nextLine();
            }
            mapa.put(clave, sueldo);
        }

        //Media de hombres
         double sumH = 0;
         double sumM = 0;
         double contH =0;
         double contM = 0;
        for (Map.Entry<Integer, Double> m : mapa.entrySet()) {
            if(m.getKey() == 0){
                sumH += m.getValue();
                contH++;
            }else{
                sumM += m.getValue();
                contM++;
            }
           
        }
 
        System.out.println("La media de sueldos de hombres es: " + (sumH/contH));
        System.out.println("La media de sueldos de mujer es: " + (sumM/contM));
    }

}
