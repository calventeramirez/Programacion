package Ejercicio109;

/**
 *
 * @author usuario
 */
public class Impar {

    private int numero;

    /**
     * Constructor de la clase para añadir un numero impar
     *
     * @param num numero a introducir
     */
    public Impar(int num) {
        if (num % 2 == 0) {
            throw new RuntimeException("El numero no es impar");
        }
        numero = num;
    }

    /**
     * Metodo toString sobreescrito. Mostrara la representación del impar
     *
     * @return Representacion del numero impar
     */
    @Override
    public String toString() {
        return "Impar{" + "numero=" + numero + '}';
    }

}
