package Ejercicio109;

public class testImpar {

    public static void main(String[] args) {
        try {
            Impar num = new Impar(24);
            System.out.println(num);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}
