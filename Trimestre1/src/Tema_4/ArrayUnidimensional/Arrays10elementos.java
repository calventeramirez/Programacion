package Tema_4.ArrayUnidimensional;

public class Arrays10elementos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = new int[10];
        int aux = 0;
        for (int i = 0; i < array.length; i++) {
            int alea = (int) ((Math.random() * (23 - 10 + 1)) + 10);
            array[i] = alea;
            System.out.println(alea);
        }
        aux = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = aux;
        System.out.println("Intercambiadas las variables");
        System.out.println("La variable 1 es: " + array[0]);
        System.out.println("La variable 2 es: " + array[array.length-1]);
        System.out.print("El array contiene: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
    }

}
