package Tema_3;

import java.util.Scanner;

public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = 0;
        String nombre = "";
        Scanner t = new Scanner(System.in);
        do {
            System.out.println("1 - Introducir  nombre");
            System.out.println("2 - Mostrar nombre");
            System.out.println("3 - Salir");
            opcion = t.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Introduceme un nombre: ");
                    nombre = t.next();
                    break;
                case 2:
                    if (nombre.equals("")) {
                        System.out.println("No hay nombre introducido");
                    } else {
                        System.out.println(nombre);
                    }
                    break;
                case 3:
                    break;
                 default:
                     System.out.println("No has introducido un numero correcto");
            }
           
        } while (opcion != 3);
        t.close();
    }

}
