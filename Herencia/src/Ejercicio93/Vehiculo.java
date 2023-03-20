package Ejercicio93;

/**
 *
 * @author usuario
 */
public class Vehiculo {

    protected String color;
    protected int ruedas;

    public Vehiculo(String color, int ruedas) {
        this.color = color;
        this.ruedas = ruedas;
    }

    @Override
    public String toString() {
        return "Color: " + color + "\nNumero de ruedas: " + ruedas;
    }
}
