package Ejercicio85;

import Ejercicio84.*;

/**
 *
 * @author usuario
 */
public class Baraja {

    private Carta[] baraja;
    private final int NUMEROCARTASTOTAL = 48;
    private Carta[] usadas;
    private int contador;

    public Baraja() {
        baraja = new Carta[NUMEROCARTASTOTAL];
        usadas = new Carta[NUMEROCARTASTOTAL];
        int cont = 0;
        for (int i = 0; i < Carta.PALOS.length; i++) {
            for (int j = 0; j < Carta.LIMITECARTASPALOS; j++) {
                baraja[cont] = new Carta((j + 1), Carta.PALOS[i]);
                cont++;
            }
        }
        contador = 0;
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

    public int cartasDisponibles() {
        return NUMEROCARTASTOTAL - contador;
    }

    public String siguienteCarta() {
        String res = "";
        if (cartasDisponibles() == 0) {
            res = "No ha cartas en el mazo";
        } else {
            res = baraja[contador].toString();
            usadas[contador] = baraja[contador];
            baraja[contador] = null;
            contador++;
        }
        return res;
    }

    public void darCartas() {

    }

    public String cartasUsadas() {
        String res = "Cartas Usadas:\n";
        for (int i = 0; i < contador; i++) {
            res += usadas[i] + "\n";

        }
        return res;
    }
}
