package Ejercicio122;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.plaf.basic.BasicMenuUI;

public class HolHorseAlone {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        FileReader lector = null;
        FileReader lector2 = null;
        FileWriter escritor = null;
        BufferedReader miBufferL = null;
        BufferedReader miBuffereL2 = null;
        BufferedWriter miBufferE = null;

        String ruta = "src/Ejercicio122/data/";
        boolean esta = true;
        String nombre = "";
        int dinero = 0;
        int aput = 0;
        int apug = 0;

        boolean carga = true;

        inicio();
        try {
            nombre = t.nextLine();
            ruta += nombre;
        } catch (InputMismatchException e) {
            System.out.println("Error. No se ha leido bien el caracter.");
            t.nextLine();
        }
        ruta += ".dat";
        do {
            try {
                if (!esta) {//Creo nuevo usuario ya que no esta su fichero
                    try {
                        escritor = new FileWriter(ruta);
                        miBufferE = new BufferedWriter(escritor);
                        miBufferE.write("nombre:" + nombre);
                        miBufferE.newLine();
                        miBufferE.write("dinero:" + 5000);
                        dinero = 5000;
                        miBufferE.newLine();
                        miBufferE.write("aput:" + 0);
                        aput = 0;
                        miBufferE.newLine();
                        miBufferE.write("apug:" + 0);
                        apug = 0;
                        miBufferE.newLine();
                        try {
                            miBufferE.close();
                            escritor.close();
                        } catch (IOException e) {
                            System.out.println("Fallo al cerrar");
                        }
                        esta = true;
                    } catch (IOException e) {
                        System.out.println("Error. No se ha podido leer algun dato: " + e.getMessage());
                    }
                } else {//leo los datos del fichero
                    String linea = "";
                    lector = new FileReader(ruta);
                    miBufferL = new BufferedReader(lector);
                    try {
                        do {
                            linea = miBufferL.readLine();
                            if (linea != null) {
                                String[] cadena = linea.split(":");

                                if (cadena[0].equalsIgnoreCase("nombre")) {
                                    nombre = cadena[1];
                                } else if (cadena[0].equalsIgnoreCase("dinero")) {
                                    dinero = Integer.parseInt(cadena[1]);
                                } else if (cadena[0].equalsIgnoreCase("aput")) {
                                    aput = Integer.parseInt(cadena[1]);
                                } else if (cadena[0].equalsIgnoreCase("apug")) {
                                    apug = Integer.parseInt(cadena[1]);
                                }
                            }

                        } while (linea != null);
                    } catch (IOException e) {
                        System.out.println("Error. No se ha podido leer algun dato: " + e.getMessage());
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Error.  Te has salido del tamaño del array: " + e.getMessage());
                    }

                }

            } catch (FileNotFoundException e) {
                //Aqui iniciar fichero si no se ha creado
                esta = false;
            }
        } while (!esta);

        mostrarDatos(nombre, dinero, aput, apug);
        String[] nombreCaballo = new String[3];
        nombreCaballo = cargarCaballos(miBuffereL2, lector2);
        int[] carrerasGanadas = new int[3];
        carrerasGanadas = cargarCarrerasGanadas(lector2, miBuffereL2);
        if (nombreCaballo == null) {
            carga = false;
        }

        if (carga) {
            System.out.println("Caballos: ");
            for (int i = 0; i < nombreCaballo.length; i++) {
                System.out.println("Nombre: " + nombreCaballo[i]);
                System.out.println("Carreras ganadas: " + carrerasGanadas[i]);
                System.out.println("-----------------------------------------");
            }
            int caballoSeleccionado = -1;
            do {
                System.out.println("Selecciona un caballo de 0 a 2");
                try {
                    caballoSeleccionado = t.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Error. Introduce un numero: " + e.getMessage());
                    t.nextLine();
                }
            } while (caballoSeleccionado < 0 || caballoSeleccionado > 2);
            if (dinero > 15) {
                int apuesta = 0;
                String c = "";
                do {
                    System.out.println("Que cantidad quiere apostar?");
                    try {
                        apuesta = t.nextInt();
                        System.out.println("Esta seguro de la apuesta? (S si es si y N si es no): ");
                        c = t.next();
                    } catch (InputMismatchException e) {
                        System.out.println("Error. Introduce un numero: " + e.getMessage());
                        t.nextLine();
                    }
                } while (apuesta < 15 || c.equalsIgnoreCase("N"));
                carrera();
                int ganador = (int) (Math.random() * 3);
                if (ganador == caballoSeleccionado) {
                    dinero += (apuesta * 1.5);
                    apug++;
                    aput ++;
                    System.out.println("Apuesta ganada");
                } else {
                    dinero -= apuesta;
                    aput++;
                    System.out.println("Apuesta perdida");
                }
                guardarPersona(escritor, miBufferE, ruta, nombre, dinero, aput, apug);
                guardarCaballo(escritor, miBufferE, nombreCaballo, carrerasGanadas, ganador);
            } else {
                System.out.println("No puede apostar. Adios.");
            }

        }

    }

    static void inicio() {
        System.out.println("------------------------------------------------------------");
        System.out.println("|             Bienvenido a Hol Horse Alone                 |");
        System.out.println("------------------------------------------------------------");
        System.out.print("Introduce el nombre del jugador: ");
    }

    static void mostrarDatos(String nombre, int dinero, int aput, int apug) {
        System.out.println("Datos del usuario:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Dinero: " + dinero);
        System.out.println("Apuesta ganada: " + apug);
        System.out.println("Apuestas perdidas: " + aput);
    }

    static String[] cargarCaballos(BufferedReader miBufferedReader2, FileReader lector2) {
        String[] nombre = new String[3];
        String linea = "";
        int cont = 0;
        try {
            lector2 = new FileReader("src/Ejercicio122/horses.dat");
            miBufferedReader2 = new BufferedReader(lector2);
            do {
                linea = miBufferedReader2.readLine();
                if (linea != null) {
                    nombre[cont] = linea.split(":")[0];
                    cont++;
                }
            } while (linea != null);
        } catch (IOException e) {
            System.out.println("Error en la carga de caballos");
            nombre = null;
        }
        try {
            miBufferedReader2.close();
            lector2.close();
        } catch (IOException e) {
            System.out.println("No se ha podido cerrar algo en carga de nombres");
        }

        return nombre;
    }

    static int[] cargarCarrerasGanadas(FileReader lector2, BufferedReader miBufferedReader2) {
        int[] carrera = new int[3];
        String linea = "";
        int cont = 0;

        try {
            lector2 = new FileReader("src/Ejercicio122/horses.dat");
            miBufferedReader2 = new BufferedReader(lector2);
            do {
                linea = miBufferedReader2.readLine();
                if (linea != null) {
                    carrera[cont] = Integer.parseInt(linea.split(":")[1]);
                }

                cont++;
            } while (linea != null);
        } catch (IOException e) {
            System.out.println("Error en la carga de caballos");
            carrera = null;
        }
        try {
            miBufferedReader2.close();
            lector2.close();
        } catch (IOException e) {
            System.out.println("No se ha podido cerrar algo en carga de nombres");
        }

        return carrera;
    }

    static void carrera() {
        System.out.println("Comienza la carrera.....");
        for (int i = 0; i < 1000000; i++);
        System.out.println("El caballo numero 0 avanza con buen pie y se coloca 2o");
        for (int i = 0; i < 1000000; i++);
        System.out.println("Estamos a mitad de carrera y no se sabe cual ganara....");
    }

    static void guardarPersona(FileWriter escritor, BufferedWriter mibufferE, String ruta, String nombre, int dinero, int aput, int apug) {
        try {
            escritor = new FileWriter(ruta);
            mibufferE = new BufferedWriter(escritor);
            mibufferE.write("nombre:" + nombre);
            mibufferE.newLine();
            mibufferE.write("dinero:" + dinero);
            mibufferE.newLine();
            mibufferE.write("aput:" + aput);
            mibufferE.newLine();
            mibufferE.write("apug:" + apug);
            mibufferE.newLine();
            try {
                mibufferE.close();
                escritor.close();
            } catch (IOException e) {
                System.out.println("Fallo al cerrar");
            }
        } catch (IOException e) {
            System.out.println("Error al cerrar el fichero");
        }
    }

    static void guardarCaballo(FileWriter escritor, BufferedWriter miBufferedWriter, String[] nombrecaballos, int[] carrerasGanadas, int caballoGanador) {
        try {
            escritor = new FileWriter("src/Ejercicio112/horses.dat");
            miBufferedWriter = new BufferedWriter(escritor);

            carrerasGanadas[caballoGanador]++;

            for (int i = 0; i < nombrecaballos.length; i++) {
                miBufferedWriter.write(nombrecaballos[i] + ":" + carrerasGanadas[i]);
                miBufferedWriter.newLine();
            }
            try {
                miBufferedWriter.close();
                escritor.close();
            } catch (IOException e) {
                System.out.println("Fallo al cerrar");
            }
        } catch (IOException e) {
            System.out.println("Error al cerrar el fichero");
        }

    }
}
