package Tema_2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

public class ConversorCentimetrosAPulgadasImplicito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double PULGADASACTMS = 2.54;
        double ctms = 15.2;
        
        double pulgadas = ctms / PULGADASACTMS;

        System.out.println(ctms + " ctms son " + pulgadas + " pulgadas");

    }

}
