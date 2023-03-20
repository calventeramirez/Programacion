package Parcial01_11;
//Autor: Pablo Jesús Calvente Ramírez

import java.util.Scanner;

public class T1P2E1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double suma = 0.0;//Creo una variable para acumular la suma
        int x = 1;//La variable X para que el usuario meta por pantalla el valor
        do {//do-while para que si el numero es 0 se repita
            System.out.print("Introduzca el numero para calcular la ecuación: ");
            x = teclado.nextInt();
        } while (x == 0);
        teclado.close();
        for (int i = 1; i <= 9; i++) {//Recorremos de 1 a 9 debido a que la ecuacuion es: x^i /i
            suma += (Math.pow(x, i)) / i;
        }
        System.out.println("La suma del polinomio es: " + suma);
    }
}
