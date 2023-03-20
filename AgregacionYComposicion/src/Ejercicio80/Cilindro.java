package Ejercicio80;

/**
 *
 * @author usuario
 */
public class Cilindro {

    private double altura;
    private Circulo c;

    public Cilindro(Circulo c, double altura) {
        this.c = c;
        this.altura = altura;
    }

    public double volumen() {
        return c.area() * altura;
    }

    @Override
    public String toString() {
        String res = "";
        res += c;
        res += "\nAltura: ";
        res += altura;
        return res;
    }

}
