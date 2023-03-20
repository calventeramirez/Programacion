package Ejercicio101;

/**
 *
 * @author Pablo Calvente
 */
public abstract class Cuerda extends Instrumento {

    private int numCuerdas;
    private boolean tipo; //true ->Pulsada, false ->percutida

    public Cuerda(String marca, int mes, int anyo, Partitura p, int numCuerdas, boolean tipo) {
        super(marca, mes, anyo, p);
        this.numCuerdas = numCuerdas;
        this.tipo = tipo;
    }

    public Cuerda(String marca, int mes, int anyo, int numCuerdas, boolean tipo) {
        super(marca, mes, anyo);
        this.numCuerdas = numCuerdas;
        this.tipo = tipo;
    }

    public abstract void afinarse();

    @Override
    public abstract String tocarPartitura();

    @Override
    public abstract void pararDeTocar();

}
