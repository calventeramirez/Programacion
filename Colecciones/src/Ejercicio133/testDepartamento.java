package Ejercicio133;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Pablo Calvente
 */
public class testDepartamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        Departamento dep = new Departamento();
        int numMenu = 0;

        do {
            menu();
            System.out.print(">>");
            try {
                numMenu = t.nextInt();
                switch (numMenu) {
                    case 1:
                        dep.mostrarDepartamento();
                        break;
                    case 2:
                        aniadir(t, dep);
                        break;
                    case 3:
                        despedir(t, dep);
                        break;
                    case 4:
                        dep.nuevoAnio();
                        break;
                    case 5:
                        dep.revisarSueldos();
                        break;
                    case 6:
                        dep.borrarTodo();
                        break;
                    case 7:
                        System.out.println("Adios.");
                        break;
                    default:
                        System.out.println("Fallo en la matrix");
                }
            } catch (InputMismatchException e) {
                t.nextLine();
                System.out.println("Error. Introduzca un numero.");
            }
        } while (numMenu != 7);
    }

    static void menu() {
        System.out.println("1. Mostrar Departamento");
        System.out.println("2. Añadir Empleado");
        System.out.println("3. Despedir Empleado");
        System.out.println("4. Aumentar antigúedad del departamento");
        System.out.println("5. Revisar salarios");
        System.out.println("6. Despedir a todos los empleados");
        System.out.println("7. Salir");
    }

    static void aniadir(Scanner t, Departamento dep) {
        try {
            boolean sex = false;
            System.out.print("Introduzca el DNI: ");
            int dni = t.nextInt();
            t.nextLine();
            System.out.print("Introduzca el nombre: ");
            String nombre = t.nextLine();
            System.out.print("Introduzca el apellido: ");
            String apellido = t.nextLine();
            System.out.println("Introduzca el sexo: (M: masculino, F: femenino)");
            String s = t.nextLine();
            if (s.equalsIgnoreCase("m")) {
                sex = true;
            }
            Empleado emp = new Empleado(nombre, apellido, sex);
            dep.aniadirEmpleado(dni, emp);
        } catch (InputMismatchException e) {
            t.nextLine();
            System.out.println("Error. Dato introducido no correcto");
        }
    }

    static void despedir(Scanner t, Departamento dep) {
        System.out.print("Introduce el dni a borrar: ");
        try {
            int dni = t.nextInt();
            dep.borrarEmpleado(dni);
        } catch (InputMismatchException e) {
            t.nextLine();
            System.out.println("Error. Dato no valido");
        }

    }
}
