package Ejercicio81;

public class TestGuerreros {

    public static void main(String[] args) {
        Arma a1 = new Arma("Espada legendaria", 1000, 20);
        Arma a2 = new Arma("Hacha legendaria", 500, 30);
        Guerrero g1 = new Guerrero("Alphanus", 120, 3, a1, 6);
        Guerrero g2 = new Guerrero("Drogy", 100, 2, a2, 5);

        System.out.println(g1);
        for (int i = 0; i < 16; i++) {
            g1.atacar(g2);
            g2.atacar(g1);
        }

        System.out.println(g1);
        System.out.println(g2);

    }

}
