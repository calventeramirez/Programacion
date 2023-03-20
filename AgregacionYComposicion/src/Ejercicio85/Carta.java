package Ejercicio85;

import Ejercicio84.*;

/**
 *
 * @author usuario
 */

public class Carta {

    private int numero;
    private char palo;
    public  static final String[] PALOS  = {"Trebol", "Pica", "Corazon", "Diamante"};
    public static final int LIMITECARTASPALOS=12;
    
    public Carta(int num, String palo) {
        this.numero = num;
        if (palo.equalsIgnoreCase("Pica")) {
            this.palo = '\u2660';
        } else if (palo.equalsIgnoreCase("Trebol") || palo.equalsIgnoreCase("Trébol")) {
            this.palo = '\u2663';
        } else if (palo.equalsIgnoreCase("Corazon") || palo.equalsIgnoreCase("Corazón")) {
            this.palo = '\u2665';
        } else if (palo.equalsIgnoreCase("Diamante")) {
            this.palo = '\u2666';
        }
    }

    @Override
    public String toString() {
        String res = "";
        if (numero <= 9) {
            res += "[" + numero + "-" + palo + "]";
        } else if (numero == 10) {
            res += "[J" + "-" + palo + "]";
        } else if (numero == 11) {
            res += "[Q" + "-" + palo + "]";
        } else if (numero == 12) {
            res += "[K" + "-" + palo + "]";
        }
        return res;
    }
}
