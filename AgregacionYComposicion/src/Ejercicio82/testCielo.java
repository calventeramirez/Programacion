package ejercicio82;

import Ejercicio82.Cielo;

/**
 *
 * @author Pablo Calvente
 */
public class testCielo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cielo cielo = new Cielo(18, 60);

        cielo.ponerEstrellas(150);

        System.out.println(cielo);
    }

}
