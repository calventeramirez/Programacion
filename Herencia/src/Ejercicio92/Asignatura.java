package Ejercicio92;

/**
 *
 * @author usuario
 */
public class Asignatura {

    private int codAsig;
    private double numHoras;

    public Asignatura(int codAsig, double numHoras) {
        this.codAsig = codAsig;
        this.numHoras = numHoras;
    }

    public int getCodAsig() {
        return codAsig;
    }
    
    @Override
    public String toString() {
        return "Cod de la asignatura: " + codAsig + "\nNumero de horas: " + numHoras;
    }
}
