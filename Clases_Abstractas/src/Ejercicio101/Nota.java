package Ejercicio101;

/**
 *
 * @author usuario
 */
public class Nota {

    private String valor;
    private int duracion;

    public Nota(String valor, int duracion) {
        this.valor = valor;
        this.duracion = duracion;
    }

    public String getValor() {
        return valor;
    }

    public int getDuracion() {
        return duracion;
    }
    
    @Override
    public String toString() {
        return "[" + valor + ", " + duracion + "]";
    }

}
