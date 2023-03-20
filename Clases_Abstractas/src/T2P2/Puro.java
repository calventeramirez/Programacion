package T2P2;

/**
 *
 * @author usuario
 */
public abstract class Puro extends Shinigami {

    private int numEscuadron;

    public Puro(String nombre, int edad, String origen, Zanpakuto espada, int numEscuadron) {
        super(nombre, edad, origen, espada);
        if (numEscuadron > 0 && numEscuadron < 14) {
            this.numEscuadron = numEscuadron;
        } else {
            this.numEscuadron = (int) ((Math.random() * (13 - 1 + 1)) + 1);
        }
    }

    public void Shunpo() {
        System.out.println(nombre + " se ha desplazado usando shunpo.");
    }

    public int getNumEscuadron() {//Para poder consultar el numero de escuadron en teniente
        return numEscuadron;
    }

    @Override
    public abstract void invocarBankai();

    @Override
    public abstract void pelear(Shinigami defensor);

}
