package Ejercicio127;

import Ejercicio126.Persona;
import java.util.InputMismatchException;
import java.util.Scanner;

public class testAgenda {

    public static void main(String[] args) {
        Agenda a = new Agenda();
        Scanner t = new Scanner(System.in);
        int num = 0;
        String dni = "";
        do {
            System.out.println("-----------------------------");
            System.out.println("|          Agenda           |");
            System.out.println("-----------------------------");
            System.out.println("1. Añadir Persona");
            System.out.println("2. Borrar Persona");
            System.out.println("3. Buscar Persona");
            System.out.println("4. Mostar Agenda");
            System.out.println("5. Ordenar Agenda");
            System.out.println("6. Salir");

            try {
                System.out.print(">>");
                num = t.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error. No se ha podido guardar el dato: " + e.getMessage());
            }
            switch (num) {
                case 1:
                    Persona p = anadirPersona(t);
                    if (p != null) {
                        a.aniadirPersona(p);
                    }
                    break;
                case 2:
                    t.nextLine();
                    dni = "";
                    System.out.print("Introduzca el DNI de la persona a borrar: ");
                    try {
                        dni = t.nextLine();
                        a.borrarPersona(dni);
                    } catch (InputMismatchException e) {
                        System.out.println("Error. No se ha podido guardar el dato: " + e.getMessage());
                    }
                    break;
                case 3:
                    t.nextLine();
                    dni = "";
                    System.out.print("Introduzca el DNI a buscar: ");
                    dni = t.nextLine();
                    a.buscarPersona(dni);
                    break;
                case 4:
                    a.mostrarAgenda();
                    break;
                case 5:
                    a.ordenarAgenda();
                    System.out.println("La agenda se ha ordenado");
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Fallo en la Matrix");
            }

        } while (num != 6);

    }

    static Persona anadirPersona(Scanner t) {
        try {
            t.nextLine();
            System.out.print("Introduzca el DNI de la persona: ");
            String dni = t.nextLine();
            System.out.print("Introduce el nombre de la persona: ");
            String nombre = t.nextLine();
            System.out.print("Introduce el apellido de la persona: ");
            String apellido = t.nextLine();
            System.out.print("Introduce el sexo: (F femenino, M masculino) ");
            String s = t.next();
            boolean sexo = true;
            if (s.equalsIgnoreCase("F")) {
                sexo = false;
            }
            System.out.println("Introduce la edad: ");
            int edad = t.nextInt();
            System.out.println("Introduce el peso: ");
            double peso = t.nextDouble();
            Persona p = new Persona(dni, nombre, apellido, sexo, edad, peso);
            return p;
        } catch (InputMismatchException e) {
            System.out.println("Error al introducir un dato. " + e.getMessage());
        }
        return null;
    }
}
