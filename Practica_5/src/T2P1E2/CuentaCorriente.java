package T2P1E2;

/**
 *
 * @author Pablo Jesús Calvente Ramírez
 */
public class CuentaCorriente {

    private double saldo, limiteDescubierto;
    private String dni, nombre;
    private final String nombreBanco = "Sr. Hormiga Bank";

    /*Constructor + sobrecarga del mismo*/
    public CuentaCorriente(String nombre, String dni) {
        this.dni = dni;
        this.nombre = nombre;
        saldo = 0;
        limiteDescubierto = -100;
    }

    public CuentaCorriente(double saldo) {
        dni = "Sin dato";
        nombre = "Sin dato";
        this.saldo = saldo;
        limiteDescubierto = 0;
    }

    public CuentaCorriente(String dni, double saldo, double limite) {
        this.dni = dni;
        nombre = "Sin dato";
        this.saldo = saldo;
        limiteDescubierto = limite;
    }

    //Constructor Copia
    public CuentaCorriente(CuentaCorriente copiado) {
        this.dni = copiado.dni;
        this.nombre = copiado.nombre;
        this.saldo = copiado.saldo;
        this.limiteDescubierto = copiado.limiteDescubierto;
    }

    /*Metodos*/
    public String sacarDinero(double dinero) {
        String res = "";
        if (saldo - dinero >= limiteDescubierto) {
            saldo -= dinero;
            res = "Se ha podido sacar el dinero";
        } else {
            res = "No se ha podido sacar el dinero";
        }
        return res;
    }

    public String ingresar(double cantidad) {
        String res = "No se ha conseguido ingresar correctamente el dinero";
        if (cantidad > 0) {
            saldo += cantidad;
            res = "Se ha Ingresado correctamente " + cantidad;
        }
        return res;
    }

    /*Getters y setters*/
    public double getSaldo() {
        return saldo;
    }

    public double getLimiteDescubierto() {
        return limiteDescubierto;
    }

    public String getDni() {
        return dni;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setLimiteDescubierto(double limiteDescubierto) {
        this.limiteDescubierto = limiteDescubierto;
    }

    /*toString*/
    @Override
    public String toString() {
        String res = "Banco " + nombreBanco + "\n";
        res += "-----------------------------------------\n";
        res += "Titular: " + nombre + " DNI: " + dni;
        res += "\nSaldo: " + saldo;
        res += "\nLimite: " + limiteDescubierto;
        return res;
    }
}
