package Ejercicio88;

/**
 *
 * @author usuario
 */
public class Operario extends Empleado{
    private int codTrabajador;
    
    public Operario(String nombre, int codTrabajador) {
        super(nombre);
        this.codTrabajador = codTrabajador;
    }

    public int getCodTrabajador() {
        return codTrabajador;
    }

    public void setCodTrabajador(int codTrabajador) {
        this.codTrabajador = codTrabajador;
    }
    
    @Override
    public String toString(){
        return super.toString()+" con el codigo "+codTrabajador;
    }
    
}
