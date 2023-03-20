package Tema_4.ArrayUnidimensional;

/*
Uno de los métodos más famosos para ordenar un array numérico es el 
algoritmo de ordenación por selección. Este algoritmo consiste en:
•Se busca el elemento más pequeño del array se coloca en la primera posición.
•Se hace lo mismo que en el punto anterior pero ahora se toma todo el array
menos la primera posición (porque ya está ordenada).
•Se repite el primer punto pero ahora solo se toma todo el array menos las dos
primeras posiciones (porque ya están ordenadas).
•Se repite el primer punto hasta que ordeno todos los elementos del array
Crea un programa en el que se defina un array de 10 números enteros 
aleatorios (entre 1 y 100) y ordene ese array usando la ordenación 
por selección
 */
/**
 *
 * @author Pablo Calvente
 */
public class Ejercicio57 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int N = 10;
        int[] arrayOriginal = new int[N];
        int menor = 101, num = 0, aux = 0;
        //Rellenar el array y coge el menor numero
        System.out.print("El array original es: ");
        for (int i = 0; i < N; i++) {
            num = (int) (Math.random() * (100 - 1 + 1) + 1);
            arrayOriginal[i] = num;
            System.out.print(num + " ");
            if (num < menor) {
                menor = num;
               // System.out.println("esel menor "+menor);
            }
        }

        System.out.print("\nEl array ordenado es: ");
        //Ordeno con el primero numero
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
               if(arrayOriginal[j]<arrayOriginal[i]){
                   aux = arrayOriginal[i];
                   arrayOriginal[i] = arrayOriginal[j];
                   arrayOriginal[j] = aux;
               }
            }
            System.out.print(arrayOriginal[i] + " ");
        }

    }

}
