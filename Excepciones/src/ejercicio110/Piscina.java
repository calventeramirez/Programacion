package ejercicio110;

/**
 *
 * @author usuario
 */
public class Piscina {

    public final int MAXNIVEL;
    private int nivel;

    public Piscina(int tope) {
        if (tope < 0) {
            tope = 0;
        }
        this.MAXNIVEL = tope;
        nivel = 0;
    }

    public int getNivel() {
        return nivel;
    }

    public void quitarAgua(int cantidad) {
        if(nivel - cantidad < 0){
            throw new RuntimeException("Error. No se puede quitar tanta agua ya que queda "+cantidad);
        }
        nivel -= cantidad;
    }

    public void ponerAgua(int cantidad) {
        if(nivel+cantidad > MAXNIVEL){
            throw new RuntimeException("Error no se puede llenar mas del maximo.");
        }
        nivel += cantidad;
    }
}
