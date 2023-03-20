package Ejercicio89;

/**
 *
 * @author usuario
 */
public class Gato extends Mamifero {

    private String raza, nombre, pelaje;

    public Gato(String nombre, String raza, int numPatas, double mediaVida) {
        super(numPatas, mediaVida);
        this.nombre = nombre;
        this.raza = raza;
        pelaje = "corto";
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        if (pelaje.equalsIgnoreCase("corto") || pelaje.equalsIgnoreCase("largo") || pelaje.equalsIgnoreCase("Semilargo")) {
            this.pelaje = pelaje;
        }
    }

    @Override
    public String comunicarse() {
        return "MIAU";
    }

    @Override
    public String dormir() {
        return nombre + " duerme una media de " + 15 + " horas";
    }

    public void cazar() {
        System.out.println("Mi gato de " + super.numPatas + " patas está cazando");
    }

    @Override
    public String toString() {
        return nombre + " es un gato, es de raza " + raza + " con un pelaje " + pelaje + " y " + super.toString();
    }
}
