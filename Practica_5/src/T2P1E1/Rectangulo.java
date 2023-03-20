package T2P1E1;

/**
 *
 * @author Pablo Jesús Calvente Ramírez
 */
public class Rectangulo {

    private double base, altura;

    /*Constructor*/
    public Rectangulo(double base, double altura) {
        this.altura = altura;
        this.base = base;
    }

    /*Metodos*/
    public double area() {
        return base * altura;
    }

    public double perimetro() {
        return 2 * (base + altura);
    }

    //toString
    @Override
    public String toString() {
        String res = "------------------------------------------------";
        res += "\nRectangulo con base " + base + " y altura " + altura;
        res += "\nArea:" + area();
        res += "\nPerímetro: " + perimetro();
        res += "\n---------------------------------------------------------";
        return res;
    }
}
