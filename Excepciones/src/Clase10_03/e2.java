package Clase10_03;

import java.util.Scanner;
import java.util.InputMismatchException;

public class e2 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int num = 0;
        boolean error = true;
        do {
            System.out.println("Introducir un numero: ");
            try {
                num = t.nextInt();
                if (num > 0){
                    error = false;
                }
            } catch (InputMismatchException e) {
                t.nextLine();
                error = true;
                System.err.println("Error. No se ha metido un numero");
            }
        }while(error);
        System.out.println("Resultado: " + num);
    }
}
