package Ejercicio91;

/**
 *
 * @author usuario
 */
public class ProdCongAgua extends ProductosCongelados {

    private double salinidad;

    public ProdCongAgua(String caducidad, String numlote, String fechaEnvasado, String paisOrigen, double tempMantenimiento, double salinidad) {
        super(caducidad, numlote, fechaEnvasado, paisOrigen, tempMantenimiento);
        this.salinidad = salinidad;
    }

    public double getSalinidad() {
        return salinidad;
    }

    @Override
    public String toString() {
        return super.toString() + "Salinidad: " + salinidad;
    }
}
