package Ejercicio101;

/**
 *
 * @author usuario
 */
public class Partitura {

    private String nombre;
    private String autor;
    protected Nota[] listaNotas;
    private final int NUMNOTASPARTITURAS = 100;

    public Partitura(String nombre, String autor) {
        this.nombre = nombre;
        this.autor = autor;
        listaNotas = new Nota[NUMNOTASPARTITURAS];
        for (int i = 0; i < NUMNOTASPARTITURAS; i++) {
            listaNotas[i] = null;
        }
    }

    public int numNotas() {
        int cont = 0;
        for (int i = 0; i < NUMNOTASPARTITURAS; i++) {
            if (listaNotas[i] != null) {
                cont++;
            } else {
                i = NUMNOTASPARTITURAS;
            }
        }
        return cont;
    }

    public boolean addNotas(Nota nueva) {
        boolean aniadida = false;
        if (nueva.getValor().equalsIgnoreCase("DO") || nueva.getValor().equalsIgnoreCase("RE") || nueva.getValor().equalsIgnoreCase("MI") || nueva.getValor().equalsIgnoreCase("FA") || nueva.getValor().equalsIgnoreCase("SOL") || nueva.getValor().equalsIgnoreCase("LA") || nueva.getValor().equalsIgnoreCase("SI")) {
            for (int i = 0; i < NUMNOTASPARTITURAS; i++) {
                if (listaNotas[i] == null) {
                    listaNotas[i] = nueva;
                    i = NUMNOTASPARTITURAS;
                    aniadida = true;
                }
            }
        }
        return aniadida;
    }

    @Override
    public String toString() {
        String res = "";
        res += nombre + "  de " + autor;
        res += "\n";
        for (int i = 0; i < NUMNOTASPARTITURAS; i++) {
            if (listaNotas[i] != null) {
                res += listaNotas[i].toString() + " ";
            }
            if (i % 10 == 0) {
                res += "\n";
            }
        }
        return res;
    }
}
