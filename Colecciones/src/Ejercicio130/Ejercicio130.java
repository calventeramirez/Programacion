package Ejercicio130;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio130 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        HashMap<String, Integer> diccinonario = new HashMap<>();
        String[] misPalabras;
        String linea = "";

        do {
            linea = t.nextLine();
            if (!linea.equalsIgnoreCase("")) {
                misPalabras = linea.split(" ");
                for (int i = 0; i < misPalabras.length; i++) {
                    if (diccinonario.containsKey(misPalabras[i].toUpperCase())) {
                        int suma = diccinonario.get(misPalabras[i].toUpperCase());
                        diccinonario.put(misPalabras[i].toUpperCase(), suma + 1);
                    } else {
                        diccinonario.put(misPalabras[i].toUpperCase(), 1);
                    }
                }
            }
        } while (!linea.equalsIgnoreCase(""));

        //Salida
        for (Map.Entry<String, Integer> m : diccinonario.entrySet()) {
            System.out.println("Palabra: " + m.getKey() + ", Veces: " + m.getValue());
        }

    }
}
