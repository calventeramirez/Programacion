package T2P2;

/**
 *
 * @author usuario
 */
public class Teniente extends Puro {

    public Teniente(String nombre, int edad, String origen, Zanpakuto espada, int numEscuadron) {
        super(nombre, edad, origen, espada, numEscuadron);
    }

    @Override
    public void invocarBankai() {
        System.out.println(super.nombre + " aun no puede invocar su bankai");
    }

    @Override
    public void pelear(Shinigami defensor) {
        if (defensor instanceof Teniente) {
            ((Teniente) defensor).vida -= Math.abs(super.getEspada().getAtaque() - defensor.getEspada().getResistencia());
        } else if (defensor instanceof Capitan) {
            ((Capitan) defensor).vida -= Math.abs(super.getEspada().getAtaque() - defensor.getEspada().getResistencia() - ((Capitan) defensor).poder);
        } else if (defensor instanceof Sustituto) {
            ((Sustituto) defensor).vida -= Math.abs(super.getEspada().getAtaque() - defensor.getEspada().getResistencia() - ((Sustituto) defensor).poder);
        }
    }

    @Override
    public String toString() {
        String res = "";
        res += super.nombre + "[vida: " + super.vida + ", poder: " + super.poder + "] Teniente del " + super.getNumEscuadron() + " escuadron";
        res += super.getEspada().toString();
        return res;
    }

}
