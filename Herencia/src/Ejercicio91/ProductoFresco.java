package Ejercicio91;

/**
 *
 * @author usuario
 */
public class ProductoFresco extends Producto {

    private String fechaEnvasado, paisOrigen, metodoConservacion;

    public ProductoFresco(String caducidad, String numlote, String fechaEnvasado, String paisOrigen, String metodoConservacion) {
        super(caducidad, numlote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
        this.metodoConservacion = metodoConservacion;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public String getMetodoConservacion() {
        return metodoConservacion;
    }

    @Override
    public String toString() {
        return super.toString() + "\nFecha de envasado: " + fechaEnvasado + "\nPais de Origen: " + paisOrigen + "\nCon el metodo de conservación: " + metodoConservacion;
    }
}
