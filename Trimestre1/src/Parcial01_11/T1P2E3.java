package Parcial01_11;
//Autor: Pablo Jesús Calvente Ramírez

import java.util.Scanner;

public class T1P2E3 {

    public static void main(String[] args) {
        final int NORIGINAL = 6;
        int[] original = new int[NORIGINAL];
        int numero = 0, comparacion1 = 0, comparacion2 = 0, contadorComp1 = 0, contadorComp2 = 0, primeraVez = -1, ultmaVez = 0;
        Scanner teclado = new Scanner(System.in);
        //Apartado A
        System.out.println("APARTADO A");
        for (int i = 0; i < NORIGINAL; i++) {//Recorro el array y guardo los numeros posicion a posicion
            do {//compruebo que el numero introducido sea mayor que 0
                System.out.print("Mete un numero mayor a 0: ");
                numero = teclado.nextInt();
                if (numero <= 0) {
                    System.out.println("ERROR! Mete un numero mayor que 0!!");
                }
            } while (numero <= 0);
            original[i] = numero;//guardo en el array
        }
        for (int i = 0; i < NORIGINAL; i++) {//Muestro el array
            System.out.print(original[i] + " ");
        }

        //Apartado B
        System.out.println("\nAPARTADO B");
        do {//compruebo que este entre 2 y 120
            System.out.print("Ahora mete un numero entre 2 y 120: ");
            comparacion1 = teclado.nextInt();//guardo para mas adelante usar el numero
            if (comparacion1 < 2 || comparacion1 > 120) {//error
                System.out.println("ERROR!  Mete un numero entre 2 y 120!!");
            }
        } while (comparacion1 < 2 || comparacion1 > 120);

        do {//compruebo que este entre 2 y 120
            System.out.print("Ahora mete un numero entre 2 y 120: ");
            comparacion2 = teclado.nextInt();//guardo en otra variable para mas adelante usar el numero
            if (comparacion2 < 2 || comparacion2 > 120) {//error
                System.out.print("ERROR!  Mete un numero entre 2 y 120!!");
            }
        } while (comparacion2 < 2 || comparacion2 > 120);

        //Apartado C
        System.out.println("APARTADO C");
        //Compruebo si estan o no estan en el array y guardo la primera y ultima vez que aparece
        for (int i = 0; i < NORIGINAL; i++) {//recorro el array
            if (comparacion1 == original[i]) {//compruebo que aparezca en la primera variable
                contadorComp1++;
                if (primeraVez == -1) {//si es la primera vez solo la guardo la primera vez
                    primeraVez = i;
                }
                ultmaVez = i;
            }
            if (comparacion2 == original[i]) {//compruebo que aparezca en la segunda variable
                contadorComp2++;
                if (primeraVez == -1) {//si es la primera vez solo se guarda la primera aparicion
                    primeraVez = i;
                }
                ultmaVez = i;
            }
        }

        if (contadorComp1 != 0 && contadorComp2 == 0) {//apartado C numero1
            //compruebo que solo aparezca el primero numero y no el segundo para asi entrar en la rama 
            System.out.println(comparacion1 + " esta en el array");
            System.out.println(comparacion2 + " NO esta en el array");
            System.out.println(comparacion1 + " aparece por primera vez: " + primeraVez);
            System.out.println(comparacion1 + " aparece por ultma vez: " + ultmaVez);
        } else if (contadorComp2 != 0 && contadorComp1 == 0) {//apartado c numero 2
            //compruebo que solo aparezca el segundo numero y no el primero para asi entrar en la ram
            System.out.println(comparacion1 + " NO esta en el array");
            System.out.println(comparacion2 + " esta en el array");
            System.out.println(comparacion2 + " aparece por primera vez: " + primeraVez);
            System.out.println(comparacion2 + " aparece por ultma vez: " + ultmaVez);
        } else if (contadorComp1 != 0 && comparacion2 != 0) {//apartado C numero 3
            //compruebo si los dos aparecen
            System.out.println(comparacion1 + " esta en el array");
            System.out.println(comparacion2 + " esta en el array");
            for (int i = 0; i < NORIGINAL; i++) {//recorro el array
                if (original[i] == comparacion1) {//permuto el primer numero que aparece por el comparacion2
                    original[i] = comparacion2;
                } else if (original[i] == comparacion2) {//permuto el segundo numero que aparece por el comparacion1
                    original[i] = comparacion1;
                }
            }
            for (int i = 0; i < NORIGINAL; i++) {//muestro el array
                System.out.print(original[i] + " ");
            }
            System.out.println("");
        }

        //Apartado D
        System.out.println("APARTADO D");
        /*opcion con 2 arrays
        int [] copiaMovida = new int[NORIGINAL]
        for (int i = 0; i < NORIGINAL - 1; i++) {
            copiaMovida[i + 1] = original[i];
        }
        copiaMovida[0] = original[NORIGINAL - 1];

        for (int i = 0; i < NORIGINAL; i++) {
            System.out.print(copiaMovida[i] + " ");
        }*/
        //opcion modificando el original
        int aux = original[original.length - 1];
        for (int i = NORIGINAL - 1; i > 0; i--) {//Recorro el array al reves
            original[i] = original[i - 1];
        }
        original[0] = aux;//añado por ultimo el primero por el ultimo
        for (int i = 0; i < NORIGINAL; i++) {//muestro el array
            System.out.print(original[i] + " ");
        }
    }
}
