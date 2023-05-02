package Ejercicio132;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Pablo Calvente
 */
public class testAgenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Agenda a = new Agenda();
        int numMenu = 0;
        Scanner t = new Scanner(System.in);

        do {
            menu();
            System.out.print(">>");
            try {
                numMenu = t.nextInt();
                switch (numMenu) {
                    case 1:
                        t.nextLine();
                        aniadir(t, a);
                        break;
                    case 2:
                        t.nextLine();
                        borrar(t, a);
                        break;
                    case 3:
                        //No se que metodo pedia el enunciado, opto por poner otro metodo
                        a.cantidadCiudades();
                        break;
                    case 4:
                        t.nextLine();
                        System.out.println(a.resumen());
                        break;
                    case 5:
                        t.nextLine();
                        System.out.println(a.mostrarDatos());
                        break;
                    case 6:
                        t.nextLine();
                        a.borrar();
                        break;
                    case 7:
                        t.nextLine();
                        System.out.println("Saliendo del sistema");
                        break;
                    default:
                        t.nextLine();
                        System.out.println("Fallo en la matrix");
                }
            } catch (InputMismatchException e) {
                t.nextLine();
                System.out.println("Error. Mete un numero.");
            }

        } while (numMenu != 7);

    }

    static void menu() {
        System.out.println("1. Añadir Alumno");
        System.out.println("2. Borrar Alumno");
        System.out.println("3. Mostrar Instituto");
        System.out.println("4. Alumnos por ciudad");
        System.out.println("5. Mostrar datos");
        System.out.println("6. Borrar todo");
        System.out.println("7. Salir");
    }

    static void aniadir(Scanner t, Agenda a) {
        String nombre, ciudad;
        try {
            System.out.print("Introduzca el nombre: ");
            nombre = t.nextLine();
            System.out.print("Introduzca la ciudad: ");
            ciudad = t.nextLine();
            a.aniadirAlumno(nombre, ciudad);
        } catch (InputMismatchException e) {
            System.out.println("Error. Has introducido algun dato mal");
        }
    }

    static void borrar(Scanner t, Agenda a) {
        String nombre;
        try {
            System.out.print("Introduzca el nombre del alumno a borrar: ");
            nombre = t.nextLine();
            a.borrar(nombre);
        } catch (InputMismatchException e) {
            System.out.println("Error. Has introducido algun dato mal");
        }
    }
}
