package Ejercicio83;

/**
 *
 * @author usuario
 */
public class Bala {

    private double calibre, longitud;

    public Bala(double calibre, double longitud) {
        this.calibre = calibre;
        this.longitud = longitud;
    }

    public Bala() {
        calibre = 9;
        longitud = 40;
    }

    @Override
    public String toString() {
        return "Bala de calibre " + calibre + "mm y longitud " + longitud + "mm";
    }
}
