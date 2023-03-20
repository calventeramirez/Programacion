package Tema_3;

public class ParesConFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                suma += i;
            }
        }
        System.out.println("Hay " + suma + " numeros pares");

    }

}
