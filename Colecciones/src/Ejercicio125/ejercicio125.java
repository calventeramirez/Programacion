package Ejercicio125;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio125 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        int numMenu = 0;

        System.out.println(" -----------------------------");
        System.out.println("|    Programa de ArrayList    |");
        System.out.println(" -----------------------------");

        do {
            menu();
            System.out.print(">> ");

            try {
                numMenu = t.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error. No se ha introducido un numero " + e.getMessage());
                t.nextLine();
            }

            switch (numMenu) {
                case 1:
                    agregar(t, lista);
                    break;
                case 2:
                    buscar(t, lista);
                    break;
                case 3:
                    eliminar(t, lista);
                    break;
                case 4:
                    modificar(t, lista);
                    break;
                case 5:
                    insertar(t, lista);
                    break;
                case 6:
                    mostrar(lista);
                    break;
                default:
            }
        } while (numMenu != 7);

    }

    static void menu() {
        System.out.println("1. Agregar elemento");
        System.out.println("2. Buscar elemento");
        System.out.println("3. Eliminar elemento");
        System.out.println("4. Modificar elemento");
        System.out.println("5. Insertar en posición deseada elemento");
        System.out.println("6. Mostrar contenido");
        System.out.println("7. Salir");
    }

    static void agregar(Scanner t, ArrayList lista) {
        System.out.println("Introduce el numero a introducir en la lista: ");
        System.out.print(">> ");
        try {
            int num = t.nextInt();
            lista.add(num);
            System.out.println("El número " + num + " se ha introducido en la lista");
        } catch (InputMismatchException e) {
            System.out.println("Error. No se ha introducido bien el dato por teclado: " + e.getMessage());
            t.nextLine();
        }
    }

    static void buscar(Scanner t, ArrayList lista) {
        boolean esta = false;

        System.out.println("Introduce el numero a buscar en la lista: ");
        System.out.print(">> ");
        try {
            int num = t.nextInt();
            if (lista.contains(num)) {
                System.out.println("El numero esta en la lista");
            } else {
                System.out.println("El numero NO esta en la lista");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error. No se ha introducido bien el dato por teclado: " + e.getMessage());
            t.nextLine();
        }
    }

    static void eliminar(Scanner t, ArrayList lista) {
        System.out.println("Introduce el numero a buscar en la lista: ");
        System.out.print(">> ");
        try {
            int num = t.nextInt();
            if (lista.remove((Integer) num)) {
                System.out.println("Se ha conseguido eliminar el numero");
            } else {
                System.out.println("No se ha conseguido eliminar el numero");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error. No se ha introducido un numero: " + e.getMessage());
            t.nextLine();
        }
    }

    static void modificar(Scanner t, ArrayList lista) {
        System.out.println("Introduce el numero a cambiar en la lista: ");
        System.out.print(">> ");
        try {
            int num = t.nextInt();
            int pos = lista.indexOf(num);
            if (pos != -1) {
                System.out.println("Introduce el numero por el que vamos a cambiar el anterior: ");
                System.out.print(">> ");
                num = t.nextInt();
                lista.set(pos, num);
                System.out.println("Se ha cambiado el numero por el introducido");
            } else {
                System.out.println("No se ha podido cambiar el numero.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error. No se ha introducido un numero: " + e.getMessage());
            t.nextLine();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error. No se puede acceder a esa posición de la lista: " + e.getMessage());
        }
    }

    static void insertar(Scanner t, ArrayList lista) {
        System.out.println("Introduce el numero a cambiar en la lista: ");
        System.out.print(">> ");
        try {
            int num = t.nextInt();
            int pos = 0;
            do {
                System.out.println("Introduce la posición a borrar: ");
                System.out.print(">> ");
                pos = t.nextInt();
            } while (pos < 0);
            lista.set(pos, num);

        } catch (InputMismatchException e) {
            System.out.println("Error. No se ha introducido un numero: " + e.getMessage());
            t.nextLine();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error. No se puede acceder a esa posición de la lista: " + e.getMessage());
        }
    }

    static void mostrar(ArrayList lista) {
        System.out.println(lista.toString());
    }
}
