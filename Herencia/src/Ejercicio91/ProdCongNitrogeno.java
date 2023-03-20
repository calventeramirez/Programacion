package Ejercicio91;

/**
 *
 * @author usuario
 */
public class ProdCongNitrogeno extends ProductosCongelados {

    private String metodoCongelacion;
    private int tiempoExposicion;

    public ProdCongNitrogeno(String caducidad, String numlote, String fechaEnvasado, String paisOrigen, double tempMantenimiento, String metodoCongelacion, int tiempoExposicion) {
        super(caducidad, numlote, fechaEnvasado, paisOrigen, tempMantenimiento);
        this.metodoCongelacion = metodoCongelacion;
        this.tiempoExposicion = tiempoExposicion;
    }

    public String getMetodoCongelacion() {
        return metodoCongelacion;
    }

    public int getTiempoExposicion() {
        return tiempoExposicion;
    }

    @Override
    public String toString() {
        return super.toString() + " Metodo de Congelacion: " + metodoCongelacion + "\nTiempoExposicion: " + tiempoExposicion;
    }
}
