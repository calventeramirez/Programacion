package Retos;

import java.util.Scanner;

/*
Crar un programa que retorne el numero total
de bumeranes de numeros enteros e imprima 
cada uno de ellos .

ejemplo:
array [2,21,2,3,3,4,2,4]    2 bumeranes ([2,1,2] y [4,2,4]
 */
public class Boomerang {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int num = 0, cont = 0, cont2=0;
        int array[] = new int[10], bumeran[];
        //Guardo los datos en el array
        for (int i = 0; i < array.length; i++) {
            do {
                System.out.print("Introduzca el numero " + (i + 1) + ": ");
                num = t.nextInt();
            } while (num < 0);
            array[i] = num;
        }
        //Busco en el array cuantos bumeran hay
        for (int i = 0; i < array.length; i++) {
            if (array[i + 2] == array[i] && array[i] != array[i + 1] && (i+2)<array.length) {
                cont++;
            }
        }
        //Guardo en el array los bumerans
        bumeran = new int[cont];
        for(int i = 0; i<array.length; i++){
             if (array[i + 2] == array[i] && array[i] != array[i + 1]&& (i+2)<array.length) {
                 bumeran[cont2] = array[i];
                 cont2++;
                 bumeran[cont2] = array[i+1];
                 cont2++;
                 bumeran[cont2] = array[i+2];
                 cont2++;
             }
        }
        //Muestro por pantalla los arrays
        System.out.println("El array original es: [");
        for(int i = 0; i<array.length-1; i++){
            System.out.print(array[i]+", ");
        }
        System.out.println(array[array.length-1]+"]");
        
        System.out.println("Hay "+cont+" array bumeran y son: [");
        for(int i = 0; i<bumeran.length-1; i++){
            System.out.print(bumeran[i]+", ");
        }
        System.out.println(bumeran[bumeran.length-1]+"]");
        
    }

}

