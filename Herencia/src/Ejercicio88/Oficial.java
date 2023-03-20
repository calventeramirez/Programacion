package Ejercicio88;

/**
 *
 * @author usuario
 */
public class Oficial extends Operario {

    public Oficial(String nombre, int codTrabajador) {
        super(nombre, codTrabajador);
    }

    @Override
    public String toString() {
        return "Soy el oficial " + super.getNombre() + " con el codigo " + super.getCodTrabajador();
    }
}
