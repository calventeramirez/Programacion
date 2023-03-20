package Tema_4.ArrayUnidimensional;
/*
array de 100 aleatorio, sacar otro array justo con las posiciones y guardar los pares
*/
public class ArrayDiferenteTamañoJusto {

    public static void main(String[] args) {
        int[] arrayOriginal = new int[100], arrayDuplicado;
        int cont = 0, cont2 = 0;
        for (int i = 0; i < arrayOriginal.length; i++) {
            int num = (int) (Math.random() * (100 - 1 + 1) + 1);
            arrayOriginal[i] = num;
            if (num % 2 == 0) {
                cont++;
            }
        }

        arrayDuplicado = new int[cont];
        for (int i = 0; i < arrayOriginal.length; i++) {
            if (arrayOriginal[i] % 2 == 0) {
                arrayDuplicado[cont2] = arrayOriginal[i];
                cont2++;
            }
        }

        System.out.print("El array duplicado par es: ");
        for (int i = 0; i < arrayDuplicado.length; i++) {
            System.out.print(arrayDuplicado[i] + " ");
        }
    }
}
