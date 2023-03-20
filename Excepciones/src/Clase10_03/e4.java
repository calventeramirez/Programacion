package Clase10_03;


public class e4 {

    public static void main(String[] args) {
        int[] lista = new int[10];
        int suma = 0, i = 0;

        for (i = 0; i < lista.length; i++) {
            lista[i] = (int) (Math.random() * 10);
            System.out.print(lista[i] + " ");
        }

        System.out.println("");
        for (i = 1; i < lista.length; i++) {
            try {
                suma += (lista[i] / lista[i - 1]);
            } catch (ArithmeticException e) {
                System.err.println("Imposible dividir por 0");
            } catch (IndexOutOfBoundsException e) {
                System.err.println("Error por salir del indice" + (i+1));
            }

        }

        System.out.println(suma);
    }
}
