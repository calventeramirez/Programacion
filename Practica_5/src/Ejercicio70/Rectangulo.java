package Ejercicio70;

/**
 *
 * @author usuario
 */
public class Rectangulo {

    private double base, altura;

    public Rectangulo(double base, double altura) {
        this.altura = altura;
        this.base = base;
    }

    public Rectangulo() {
        this.altura = 0;
        this.base = 0;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double area(double base, double altura) {
        return base * altura;
    }

    public double perimetro(double base, double altura) {
        return (2 * (base + altura));
    }
}
