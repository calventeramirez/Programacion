package Tema_3;

import java.util.Scanner;

public class TablaMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int num = 0;
        do {
            System.out.print("Mete numero: ");
            num = t.nextInt();
        } while (num <= 0);

        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

}
