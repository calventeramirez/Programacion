package Ejercicio93;

/**
 *
 * @author usuario
 */
public class Camioneta extends Coche {

    protected double carga;

    public Camioneta(String color, int ruedas, int velocidad, int cilindrada, double carga) {
        super(color, ruedas, velocidad, cilindrada);
        this.carga = carga;
    }

    @Override
    public String toString() {
        return super.toString() + "Carga: " + carga;
    }

}
