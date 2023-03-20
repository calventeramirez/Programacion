package Ejercicio93;

/**
 *
 * @author usuario
 */
public class Motocicleta extends Bicicleta {

    protected int velocidad, cilindrada;

    public Motocicleta(String color, int ruedas, boolean tipo, int velocidad, int cilindrada) {
        super(color, ruedas, tipo);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return super.toString() + "Velocidad: " + velocidad + "\nCilindrada: " + cilindrada;
    }
}
