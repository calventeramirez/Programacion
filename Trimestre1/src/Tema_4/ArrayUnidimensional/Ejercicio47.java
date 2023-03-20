package Tema_4.ArrayUnidimensional;

/*
Sea el array relleno con las notas: 6,3,9,7,5,8,10,2,4 y 5
Crea un programa que, a partir de ese array, muestre por pantalla 
la media aritmetica de las notas
 */
/**
 *
 * @author Pablo Calvente
 */
public class Ejercicio47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {6, 3, 9, 7, 5, 8, 10, 2, 4, 5};
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        System.out.println("La media es: "+(suma/array.length));
    }

}
