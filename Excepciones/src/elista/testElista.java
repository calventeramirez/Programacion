package elista;

public class testElista {

    public static void main(String[] args) {
        Elista lista = new Elista(100);

        for (int i = 0; i < 100; i++) {
            try {
                lista.meter(i, i * 5);
                System.out.println("He metido un: " + (i * 5));
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error. " + e.getMessage());
            }
        }

        try {
            for (int i = 0; i < 200; i += 25) {
                System.out.println("Elemento " + i + ": " + lista.sacar(i));
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error. " + e.getMessage());
        }

        System.out.println("Fin del programa");
    }
}
