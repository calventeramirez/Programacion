package Ejercicio88;

/**
 *
 * @author usuario
 */
public class Tecnico extends Operario{
    
    public Tecnico(String nombre, int codTrabajador) {
        super(nombre, codTrabajador);
    }
    
    @Override
    public String toString(){
        return "Soy el tecnico "+super.getNombre()+" con el codigo "+super.getCodTrabajador();
    }
    
}
