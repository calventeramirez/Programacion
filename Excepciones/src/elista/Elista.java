package elista;

/**
 *
 * @author usuario
 */
public class Elista {

    private int lista[];

    public Elista(int tam) {
        this.lista = new int[tam];
    }

    public void meter(int pos, int valor) throws ArrayIndexOutOfBoundsException{
        this.lista[pos] = valor;
    }

    public int sacar(int pos) throws ArrayIndexOutOfBoundsException{
        return this.lista[pos];
    }
}
