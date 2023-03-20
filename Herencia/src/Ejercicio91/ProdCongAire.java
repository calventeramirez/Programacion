package Ejercicio91;

/**
 *
 * @author usuario
 */
public class ProdCongAire extends ProductosCongelados {

    private double nitrogeno, oxigeno, co2, vaporAgua;

    public ProdCongAire(String caducidad, String numlote, String fechaEnvasado, String paisOrigen, double tempMantenimiento, double nitrogeno, double oxigeno, double co2, double vaporAgua) {
        super(caducidad, numlote, fechaEnvasado, paisOrigen, tempMantenimiento);
        this.nitrogeno = nitrogeno;
        this.oxigeno = oxigeno;
        this.co2 = co2;
        this.vaporAgua = vaporAgua;
    }

    public double getNitrogeno() {
        return nitrogeno;
    }

    public double getOxigeno() {
        return oxigeno;
    }

    public double getCo2() {
        return co2;
    }

    public double getVaporAgua() {
        return vaporAgua;
    }

    @Override
    public String toString() {
        return super.toString() + "Porcentajes:\nOxigeno: " + oxigeno + "\nNitrogeno: " + nitrogeno + "\nCO2: " + co2 + "\nVapor de agua: " + vaporAgua;
    }

}
