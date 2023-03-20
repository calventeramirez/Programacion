package Ejercicio91;

/**
 *
 * @author usuario
 */
public class ProductosCongelados extends Producto {

    private String fechaEnvasado, paisOrigen;
    private double tempMantenimiento;

    public ProductosCongelados(String caducidad, String numlote, String fechaEnvasado, String paisOrigen, double tempMantenimiento) {
        super(caducidad, numlote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
        this.tempMantenimiento = tempMantenimiento;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public double getTempMantenimiento() {
        return tempMantenimiento;
    }

    @Override
    public String toString() {
        return super.toString() + "\nFecha Envasado: " + fechaEnvasado + "\nPais de Origen: " + paisOrigen + "\nTemperatura de almacenamiento: " + tempMantenimiento;
    }
}
