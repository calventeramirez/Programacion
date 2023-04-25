package Ejercicio129;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class notasMedias {

    public static void main(String[] args) {
        HashMap<String, Double> diccionario = new HashMap<>();
        Scanner t = new Scanner(System.in);
        double nota = 0, sum = 0;
        int cont = 0;
        String nombre = "";

        do {
            try {
                System.out.println("Introduzca el nombre del alumno: (FIN para acabar)");
                System.out.print(">>");
                nombre = t.nextLine();
                if (!nombre.equalsIgnoreCase("FIN")) {
                    System.out.println("Introduce la nota media del alumno: ");
                    System.out.print(">>");
                    nota = t.nextDouble();
                    diccionario.put(nombre, nota);
                    t.nextLine();
                }
                
            } catch (InputMismatchException e) {
                System.out.println("Error. No se ha introducia un valor correcto");
            }
        } while (!nombre.equalsIgnoreCase("Fin"));

        //muestro la alumno y nota
        for (Map.Entry<String, Double> m : diccionario.entrySet()) {
            System.out.println("Nombre: " + m.getKey() + ", Nota media: " + m.getValue());
            if (m.getKey().startsWith("J")) {
                diccionario.put(m.getKey(), (diccionario.get(m.getKey()) + 1));
            } else if (m.getKey().startsWith("A") || m.getKey().startsWith("D")) {
                diccionario.remove(m.getKey());
            }
        }

        //Si no esta vacia mostrar nota y medias de todas ellas
        if (!diccionario.isEmpty()) {
            for (Map.Entry<String, Double> m : diccionario.entrySet()) {
                System.out.println(m.getValue());
                sum += m.getValue();
            }
        }
        System.out.println("Nota media general: " + (sum / diccionario.size()));
    }
}
