package T2P2;

/**
 *
 * @author usuario
 */
public abstract class Mestizo extends Shinigami {

    private double hollow, quincy;

    public Mestizo(String nombre, int edad, String origen, Zanpakuto espada) {
        super(nombre, edad, origen, espada);
        hollow = ((Math.random() * (50 - 10 + 1)) + 10);
        quincy = 50 - hollow;
    }

    public double getHollow() {//Creado para acceder al valor de hollow
        return hollow;
    }

    @Override
    public abstract void invocarBankai();

    @Override
    public abstract void pelear(Shinigami defensor);

}
