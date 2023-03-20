package T2P2;

/**
 *
 * @author usuario
 */
public class Capitan extends Puro {

    public Capitan(String nombre, int edad, String origen, Zanpakuto espada, int numEscuadron) {
        super(nombre, edad, origen, espada, numEscuadron);
    }

    @Override
    public void invocarBankai() {
        super.getEspada().bankai(super.getNumEscuadron() * 1.5, super.getEspada().getResistencia() * 1.5);
        System.out.println(super.nombre + " ha invocado su bankai");
    }

    @Override
    public void pelear(Shinigami defensor) {
        if (defensor instanceof Capitan) {
            ((Capitan) defensor).vida -= Math.abs(super.getEspada().getAtaque() - defensor.getEspada().getResistencia());
        } else if (defensor instanceof Teniente) {
            ((Teniente) defensor).vida -= Math.abs(super.getEspada().getAtaque() + super.poder - defensor.getEspada().getResistencia());
        } else if (defensor instanceof Sustituto) {
            ((Sustituto) defensor).vida -= Math.abs(super.getEspada().getAtaque() - defensor.getEspada().getResistencia() - ((Sustituto) defensor).poder);
        }
    }

    @Override
    public String toString() {
        String res = "";
        res += super.nombre + "[vida: " + super.vida + ", poder: " + poder + "] Capitan del " + super.getNumEscuadron() + " escuadron.\n";
        res += super.getEspada().toString();
        return res;
    }
}
