package Tema_4.ArrayUnidimensional;

/*
Crea un array de 100 elementos dónde cada elemento sea un número
aleatorio entre 1 y 100. Realiza los siguientes apartados:
a) Haz un programa que muestre los valores múltiplos de 5.
b) Otro que sólo muestre los números pares.
c) Otro que muestre el mayor de todos los elementos del array y
su posición (si hay varios iguales, muestra el primero)
 */
/**
 *
 * @author Pablo Calvente
 */
public class Ejercicio50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int N = 100;
        int[] array = new int[N];
        int alea = 0, mayor = 0, pos = -1;

        for (int i = 0; i < N; i++) {
            alea = (int) (Math.random() * (100 - 1 + 1) + 1);
            array[i] = alea;
        }

        System.out.print("Los multiplos de 5 son: ");
        for (int i = 0; i < N - 1; i++) {
            if (array[i] % 5 == 0) {
                System.out.print(array[i] + " ");
            }
        }

        System.out.print("\nLos multiplos de 2 son: ");
        for (int i = 0; i < N - 1; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }

        for (int i = 0; i < N - 1; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
                pos = i;
            }
        }
        System.out.println("\nEl numero mayor es: " + mayor + " y la posicion es: " + pos);
    }

}
