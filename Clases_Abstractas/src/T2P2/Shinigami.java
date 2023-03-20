package T2P2;

/**
 *
 * @author usuario
 */
public abstract class Shinigami {

    protected String nombre, origen;
    protected int edad;
    protected double vida, poder;
    private Zanpakuto espada;

    public Shinigami(String nombre, int edad, String origen, Zanpakuto espada) {
        this.nombre = nombre;
        this.edad = edad;
        this.origen = origen;
        this.espada = espada;
        vida = 1500;
        poder = ((Math.random() * (50 - 5 + 1)) + 5);
    }

    public Zanpakuto getEspada() {
        return espada;
    }

    public abstract void invocarBankai();

    public abstract void pelear(Shinigami defensor);

    @Override
    public String toString() {
        String res = "";
        res += nombre + "[vida: " + vida + ", poder: " + poder + "]\n";
        res += espada.toString();
        return res;
    }
}
