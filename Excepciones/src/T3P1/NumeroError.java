package T3P1;

/**
 *
 * @author Pablo Jesús Calvente Ramírez
 */
public class NumeroError extends RuntimeException {

    /**
     * Constructor vacio para crear la excepción
     */
    public NumeroError() {
        super();
    }

    /**
     * Contructor que devuelve el el mensaje de error
     *
     * @param msg Menseje de error
     */
    public NumeroError(String msg) {
        super(msg);
    }
}
