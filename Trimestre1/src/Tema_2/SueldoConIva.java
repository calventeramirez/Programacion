package Tema_2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

public class SueldoConIva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dado un sueldo con decimales mostrar por pantalla el sueldo total(sueldo +21%IVA)*/
        double sueldo = 1500;
        final double IVA = 21;
        System.out.println("El sueldo total del empleado es: " + (sueldo + (sueldo * (IVA/100))));

    }

}
