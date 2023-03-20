package Ejercicio71;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        Aritmetica a;
        double x, y;

        System.out.print("Introduzca el primer valor: ");
        x = t.nextDouble();
        System.out.print("Introduzca el segundo valor: ");
        y = t.nextDouble();
        
        a = new Aritmetica(x, y);
        
        System.out.println("----------------------------------------------------------------");
        System.out.println("La suma es: "+a.suma(x, y));
        System.out.println("La resta es: "+a.resta(x, y));
        System.out.println("La multiplicación es: "+a.multiplicacion(x, y));
        System.out.println("La division es: "+a.division(x, y));
        System.out.println("La potencia es: "+a.potencia(x, y));
        System.out.println("-----------------------------------------------------------------");
    }
}
