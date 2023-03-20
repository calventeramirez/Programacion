package Ejercicio91;

/**
 *
 * @author usuario
 */
public class Producto {

    private String fechaCaducidad, numLote;

    public Producto(String caducidad, String numlote) {
        fechaCaducidad = caducidad;
        numLote = numlote;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    @Override
    public String toString() {
        return "Fecha de caducidad: " + fechaCaducidad + "\nNumero de lote: " + numLote;
    }
}
