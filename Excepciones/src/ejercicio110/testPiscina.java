package ejercicio110;

public class testPiscina {

    public static void main(String[] args) {
        Piscina p = new Piscina((int) ((Math.random() * 100) + 1));
        System.out.println("Piscina con tamano: " + p.MAXNIVEL);

        System.out.println("Metiendo agua: ");
        for (int i = 0; i < 5; i++) {
            try {
                p.ponerAgua((int) ((Math.random() * 25) + 1));
                System.out.println(p.getNivel());
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }

        }

        System.out.println("Sacando agua: ");
        for (int i = 0; i < 5; i++) {
            try {
                p.quitarAgua((int) ((Math.random() * 25) + 1));
                System.out.println(p.getNivel());
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }

        }

    }

}
