package Tema_4.ArrayUnidimensional;
/*
Haz un programa que dados dos arrays (tamaño y tipo los que tu quieras)
diga sin esos arrays son iguales o no. Dos arrays son iguales si sus 
elementos son iguales y están en la misma posición.
*/
/**
 *
 * @author Pablo Calvente
 */
public class Ejercicio52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int N = 5;
        int[] array1 = {2, 5, 8, 7, 10}, array2 = {2, 5, 9, 7, 10};
        int i = 0;
        boolean iguales = true;

        while (i < N && iguales) {
            if (array1[i] != array2[i]) {
                iguales = false;
            }
            i++;
        }

        if (!iguales) {
            System.out.println("Los arrays no son iguales");
        } else {
            System.out.println("Los arrays son iguales");
        }
    }

}
