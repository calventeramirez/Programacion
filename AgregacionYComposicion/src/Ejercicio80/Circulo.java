package Ejercicio80;

/**
 *
 * @author usuario
 */
public class Circulo {

    private Punto p;
    private double radio;

    public Circulo(Punto p, double radio) {
        this.p = p;
        this.radio = radio;
    }

    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    public void trasladar(int a, int b) {
        p.trasladar(a, b);
    }

    @Override
    public String toString() {
        String res = "";
        res += p;
        res += "\nRadio:";
        res += radio;
        return res;
    }
}
