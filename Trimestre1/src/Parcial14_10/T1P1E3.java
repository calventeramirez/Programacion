package Parcial14_10;

import java.util.Scanner;
//Autor: Pablo Jesús Calvente Ramírez
public class T1P1E3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int horas = 0, sueldo = 0, horasnormales = 0, horasextras = 0;
        final int HNORMAL = 12, HEXTRAS = 16;

        System.out.print("Introduzca el número de horas trabajadas durante la semana: ");
        horas = teclado.nextInt();
        teclado.close();

        if (horas < 0) {
            System.out.println("ERROR. No se puede trabajar horas negativas");
        } else {
            horasextras = horas - 40;
            if (horasextras > 0) {
                horasnormales = horas - horasextras;
                sueldo = (horasnormales * HNORMAL) + (horasextras * HEXTRAS);
            } else {
                sueldo = horas * HNORMAL;
            }
            System.out.println("El sueldo semanales de: " + sueldo + " euros.");
        }
    }

}
