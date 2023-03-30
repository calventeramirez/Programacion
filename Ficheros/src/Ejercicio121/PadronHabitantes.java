package Ejercicio121;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PadronHabitantes {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String ruta = "src/Ejercicio121/padron.txt";
        FileReader lector = null;
        FileWriter escritor = null;
        BufferedReader miBufferL = null;
        BufferedWriter miBufferE = null;

        int num = 0;
        boolean comprobar = true;

        do {
            menu();
            num = introducirNumero(num, comprobar, teclado);
            switch (num) {
                case 1:
                    registrarHabitante(teclado, miBufferL, lector, miBufferE, escritor, ruta);
                    break;
                case 2:
                    mostrarHabitantes(miBufferL, lector, ruta);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Fallo en la matrix");
            }
        } while (num != 3);

    }

    //Menu.
    static void menu() {
        System.out.println("Padron de habitantes de Malaga");
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        System.out.println("Elije una opcion: ");
        System.out.println("1. Registrar habitantes.");
        System.out.println("2. Mostrar padron.");
        System.out.println("3. Salir");
        System.out.println("¿Opcion?");
        System.out.print(">>");
    }

    //Introducir numero
    static int introducirNumero(int num, boolean comprobar, Scanner teclado) {
        do {
            if (!comprobar) {
                System.out.println("Opcion no valida (1-3): ");
                System.out.print(">> ");
                comprobar = true;
            }
            try {
                num = teclado.nextInt();
                if (num != 1 && num != 2 && num != 3) {
                    comprobar = false;
                }

            } catch (InputMismatchException e) {
                System.out.println("Error. Se ha introducido un valor no valido: " + e.getMessage());
                num = 0;
                teclado.nextLine();
                comprobar = false;
            }
        } while (!comprobar);
        return num;
    }

    static void registrarHabitante(Scanner teclado, BufferedReader miBufferR, FileReader lector, BufferedWriter mibufferW, FileWriter escritor, String ruta) {
        String dni = "";
        boolean rep = false;
        try {
            System.out.println("DNI?");

            do {
                System.out.print(">>");
                dni = teclado.nextLine();
                rep = false;
                String linea = "";
                lector = new FileReader(ruta);
                miBufferR = new BufferedReader(lector);
                do {
                    linea = miBufferR.readLine();
                    if (linea != null) {
                        if (linea.equalsIgnoreCase(dni)) {
                            rep = true;
                        }
                    }
                } while (linea != null && !rep);
                if (rep) {
                    miBufferR.close();
                    lector.close();
                    System.out.println("El habitante ya esta registrado. Indique otro DNI: ");
                    
                }
            } while (rep);

            escritor = new FileWriter(ruta, true);
            mibufferW = new BufferedWriter(escritor);
            mibufferW.write(dni);
            mibufferW.newLine();

        } catch (FileNotFoundException e) {
            System.out.println("Error. No se encuentra el fichero: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error. No se puede leer o escribir en el fichero: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error. No se ha introducido un dato correcto: " + e.getMessage());
        } finally {
            try {
                if (miBufferR != null) {
                    miBufferR.close();
                }
                if (lector != null) {
                    lector.close();
                }
                if (mibufferW != null) {
                    mibufferW.close();
                }
                if (escritor != null) {
                    escritor.close();
                }

            } catch (IOException e) {
                System.out.println("Error. No se ha podido cerrar el fichero: " + e.getMessage());
            }
        }
    }

    static void mostrarHabitantes(BufferedReader miBufferR, FileReader lector, String ruta) {
        try {
            lector = new FileReader(ruta);
            miBufferR = new BufferedReader(lector);
            String linea = "";
            do {
                linea = miBufferR.readLine();
                if (linea != null) {
                    System.out.println(linea);
                }
            } while (linea != null);
        } catch (FileNotFoundException e) {
            System.out.println("Error. No se ha localizado el fichero: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error. No se a podido leer el fichero: " + e.getMessage());
        } finally {
            try {
                if (lector != null) {
                    lector.close();
                }
                if (miBufferR != null) {
                    miBufferR.close();
                }
            } catch (IOException e) {
                System.out.println("Error. No se ha podido cerrar el fichero: " + e.getMessage());
            }
        }
    }
}
