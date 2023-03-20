package Ejercicio88;

/**
 *
 * @author usuario
 */
public class Directivo extends Empleado {

    public Directivo(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Soy " + super.getNombre() + ", directivo de la empresa";
    }
}
