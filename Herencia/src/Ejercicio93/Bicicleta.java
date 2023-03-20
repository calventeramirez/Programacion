package Ejercicio93;

/**
 *
 * @author usuario
 */
public class Bicicleta extends Vehiculo {

    protected boolean tipo;//true urbana, false deportiva

    public Bicicleta(String color, int ruedas, boolean tipo) {
        super(color, ruedas);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        String res = super.toString();
        res += "\nTipo: ";
        if (tipo) {
            res += "Urbana";
        } else {
            res += "Deportiva";
        }
        return res;
    }

}
