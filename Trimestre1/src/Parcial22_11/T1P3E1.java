package Parcial22_11;

import java.util.Scanner;

public class T1P3E1 {

    public static void main(String[] args) {
        int n = 0, suma = 0, fila = -1;
        int[][] matriz, copia;
        Scanner teclado = new Scanner(System.in);
        //Apartado A
        //Pido el dato del tamaño del array
        do {
            System.out.print("Introduce un valor mayor a 1: ");
            n = teclado.nextInt();
            if (n <= 1) {
                System.out.println("ERROR!! El numero debe ser mayor a 1");
            }
        } while (n <= 1);
        //Una vez sea valido creo el array matriz
        matriz = new int[n][n];

        //Apartado B
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = (int) (Math.random() * (20 - 2 + 1) + 2);
                matriz[i][j] = num;
                suma += num; //Para el apartado D, sumo conforme voy guardando los elementos para ahorrar complejidad
            }
        }

        //Apartado C
        System.out.println("\nApartado C");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] < 10) {//Condicional para saber si tengo que añadir un 0 para que ocupe dos espacios o no
                    System.out.print("0" + matriz[i][j] + " ");
                } else {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();
        }

        //Apartado D
        System.out.println("APARTADO D");
        System.out.println("La suma de los elementos de la matriz es: " + suma);

        //Apartado E
        System.out.println("Apartado E");
        copia = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] >= 10) {//intercambio los valores mayores de diez por 9
                    copia[i][j] = 9;
                } else {//si son menores a 10 los guardo igual
                    copia[i][j] = matriz[i][j];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("0" + copia[i][j] + " ");//Muestro con un 0 delante todos ya que todos son menores a 2 cifras
            }
            System.out.println();
        }

        //Apartado F
        System.out.println("APARTADO F");

        do {
            System.out.print("Dime que fila debo intercambiar (1 a " + n + "): ");
            fila = teclado.nextInt();
        } while (fila <= 0 || fila > n);

        fila--;//Resto uno para poder usarlo para mirar que fila tengo

        for (int i = 0; i < n; i++) {
            int aux1 = matriz[fila][i];
            matriz[fila][i] = copia[fila][i];
            copia[fila][i] = aux1;
        }

        System.out.println("Matriz: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] < 10) {//Condicional para saber si tengo que añadir un 0 para que ocupe dos espacios o no
                    System.out.print("0" + matriz[i][j] + " ");
                } else {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();
        }

        System.out.println("Copia: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (copia[i][j] < 10) {//Condicional para saber si tengo que añadir un 0 para que ocupe dos espacios o no
                    System.out.print("0" + copia[i][j] + " ");
                } else {
                    System.out.print(copia[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
