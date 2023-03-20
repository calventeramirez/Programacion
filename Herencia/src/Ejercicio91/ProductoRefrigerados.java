package Ejercicio91;

/**
 *
 * @author usuario
 */
public class ProductoRefrigerados extends Producto {

    private int codOrgSupAli;
    private String fechaEnvasado;
    private double tempMantenimiento;
    private String paisOrigen;

    public ProductoRefrigerados(String caducidad, String numlote, int codOrgSupAli, String fechaEnvasado, double tempMantenimiento, String paisOrigen) {
        super(caducidad, numlote);
        this.codOrgSupAli = codOrgSupAli;
        this.fechaEnvasado = fechaEnvasado;
        this.tempMantenimiento = tempMantenimiento;
        this.paisOrigen = paisOrigen;
    }

    public int getCodOrgSupAli() {
        return codOrgSupAli;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public double getTempMantenimiento() {
        return tempMantenimiento;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCodigo Organismo de supervision alimentaria: " + codOrgSupAli + "\nFecha de envasado: " + fechaEnvasado + "\nTemperatura de mantenimiento recomendada: " + tempMantenimiento + "\nPais de Origen: " + paisOrigen;
    }
}
