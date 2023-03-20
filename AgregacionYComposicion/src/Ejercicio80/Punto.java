package Ejercicio80;

/**
 *
 * @author usuario
 */
public class Punto {

    private double x, y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        String res = "";
        res += "Punto: (";
        res += x;
        res += ", ";
        res += y;
        res += ")\n";
        return res;
    }

    public void trasladar(double a, double b) {
        x += a;
        y += b;
    }
}
