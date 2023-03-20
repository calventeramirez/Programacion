package Ejercicio93;

/**
 *
 * @author usuario
 */
public class Coche extends Vehiculo {

    protected int velocidad, cilindrada;

    public Coche(String color, int ruedas, int velocidad, int cilindrada) {
        super(color, ruedas);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }

    public String toString() {
        return super.toString() + "Velocidad: " + velocidad + "Km/h\n" + "Cilindrada: " + cilindrada;
    }

}
