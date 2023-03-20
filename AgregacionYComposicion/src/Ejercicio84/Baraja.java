package Ejercicio84;

/**
 *
 * @author usuario
 */
public class Baraja {

    private Carta[] baraja;
    private final int NUMEROCARTASTOTAL = 48;

    public Baraja() {
        baraja = new Carta[NUMEROCARTASTOTAL];
        int cont = 0;
        for (int i = 0; i < Carta.PALOS.length; i++) {
            for (int j = 0; j < Carta.LIMITECARTASPALOS; j++) {
                baraja[cont] = new Carta((j + 1), Carta.PALOS[i]);
                cont++;
            }
        }
    }

    public void mostrar() {
        for (int i = 0; i < NUMEROCARTASTOTAL; i++) {
            if (i % 12 == 0) {
                System.out.println();
            }
            System.out.print(baraja[i] + "");
        }
    }

    public void barajar() {
        for (int i = 0; i < NUMEROCARTASTOTAL; i++) {
            int x = (int) (Math.random() * (NUMEROCARTASTOTAL));
            int y = (int) (Math.random() * (NUMEROCARTASTOTAL));
            Carta aux;

            aux = baraja[y];
            baraja[y] = baraja[x];
            baraja[x] = aux;
        }
    }
}
