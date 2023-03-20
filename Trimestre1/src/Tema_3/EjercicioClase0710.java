package Tema_3;

import java.util.Scanner;

public class EjercicioClase0710 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int edad;
        final double PRECIO = 9, DESC_PEQ = 25, DESC_GRAN=75;
        System.out.print("Bienvenido a la Bolera Don Adrian, introduzca su edad por favor: ");
        edad = t.nextInt();
        t.close();
        if ((edad <= 5)&&(edad>0) || (edad > 70)) {
            System.out.println("Usted pagara 1 €");
        }else if((edad > 5)&&(edad<=14)){
            System.out.println("Usted pagara "+((PRECIO*DESC_PEQ)/100)+" €");
        }else if((edad>14)&&(edad<=50)){
            System.out.println("Usted pagara "+PRECIO+" €");
        }else if((edad < 50)&&(edad >= 70)){
            System.out.println("Usted pagara "+((PRECIO*DESC_GRAN)/100)+" €");
        }

    }

}
