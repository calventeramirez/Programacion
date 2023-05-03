package T3P3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Pablo Jesús Calvente Ramírez (1A DAW)
 * @version 1.0
 *
 *
 */
public class testAgenda {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        Agenda a = new Agenda();
        int numMenu = -1;
        System.out.println("---------------------------------------------------");
        System.out.println("       Bienvenidos a Hoteles Luxuries              ");
        System.out.println("---------------------------------------------------");

        do {
            menu();
            try {
                numMenu = t.nextInt();
                switch (numMenu) {
                    case 1:
                        t.nextLine();//linea para limpiar buffer
                        aniadir(t, a);
                        break;
                    case 2:
                        t.nextLine();//linea para limpiar buffer
                        borrar(t, a);
                        break;
                    case 3:
                        t.nextLine();//linea para limpiar buffer
                        a.limpiarAgenda();
                        break;
                    case 4:
                        t.nextLine();//linea para limpiar buffer
                        a.mostrarAgenda();
                        break;
                    case 5:
                        t.nextLine();//linea para limpiar buffer
                        a.copiaSeguridad();
                        break;
                    case 6:
                        System.out.println("Nos vemos.");
                        break;
                    default:
                        System.out.println("Error en la matrix");

                }
            } catch (InputMismatchException e) {
                t.nextLine();
                System.out.println("Error. Introduzca un numero maximo");
            }
        } while (numMenu != 6);

    }

    static void menu() {
        System.out.println("1. Añadir persona");
        System.out.println("2. Borrar persona");
        System.out.println("3. Limpiar Agenda");
        System.out.println("4. Mostrar agenda");
        System.out.println("5. Guardar copia seguridad de la agenda");
        System.out.println("6. Salir");
    }

    static void aniadir(Scanner t, Agenda a) {
        try {
            System.out.print("Introduzca el dni de la persona: ");
            String dni = t.nextLine();
            System.out.print("Introduzca el nombre de la persona: ");
            String nombre = t.nextLine();
            System.out.print("Introduzca el apellido/dos de la persona: ");
            String apellido = t.nextLine();
            System.out.print("Introduzca la nacionalidad de la persona: ");
            String nacionalidad = t.nextLine();
            System.out.print("Introduzca el sexo de la persona: (H: hombre, M: mujer) ");
            String s = t.nextLine();
            boolean sex = false;
            if (s.equalsIgnoreCase("H")) {
                sex = true;
            }
            System.out.print("Introduzca la fecha de nacimiento de la persona: ");
            String fecha = t.nextLine();
            a.aniadirPersona(dni, nombre, apellido, fecha, nacionalidad, sex);
            System.out.println("Persona añadida correctamente");
        } catch (InputMismatchException e) {
            t.nextLine();
            System.out.println("Error. Introduzca valores validos.");
        }
    }

    static void borrar(Scanner t, Agenda a) {
        try {
            System.out.print("Introduzca el dni de la persona que quiera eliminar: ");
            String dni = t.nextLine();
            a.borrarPersona(dni);
        } catch (InputMismatchException e) {
            t.nextLine();
            System.out.println("Error. Introduzca datos validos.");
        }
    }

}
