package Ejercicio76;

public class TestUrna {

    public static void main(String[] args) {
        Urna urna = new Urna((int) (Math.random() * (10 - 1 + 1) + 1), (int) (Math.random() * (10 - 1 + 1) + 1));
        System.out.println(urna);
        while ((urna.getBolasTotales() >= 2)) {
            String bola1 = urna.extraer(), bola2 = urna.extraer();
            int blancas = urna.getBlancas(), negras = urna.getNegras();

            System.out.println("Se ha extraido una bola " + bola1);
            System.out.println("Se ha extraido una bola " + bola2);

            if (bola1.equalsIgnoreCase(bola2)) {
                urna.setBlancas(blancas + 1);
                System.out.println("Se ha metido una bola blanca");
            } else {
                urna.setNegras(negras + 1);
                System.out.println("Se ha metido una bola negra");
            }
            System.out.println(urna);
        }
        System.out.println("Se ha extraido la bola final de color " + urna.extraer());
        System.out.println(urna);
    }
}
