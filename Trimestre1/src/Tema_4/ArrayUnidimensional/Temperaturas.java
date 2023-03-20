package Tema_4.ArrayUnidimensional;

/*
Array de tamaño 7 que almacena temp (aleatorias entre 13 y 27)
mostrar diagrama de barras usando *
 */
public class Temperaturas {

    public static void main(String[] args) {
        int[] temperaturas = new int[7];

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Dia " + (i + 1) + " ");
            temperaturas[i] = (int) (Math.random() * (27 - 13 + 1) + 13);
            for (int j = 1; j <= temperaturas[i]; j++) {
                System.out.print("* ");
            }
            System.out.println(temperaturas[i] + " grados");
        }
    }
}
