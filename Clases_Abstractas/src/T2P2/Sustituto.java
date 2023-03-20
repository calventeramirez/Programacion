package T2P2;

/**
 *
 * @author usuario
 */
public class Sustituto extends Mestizo {

    private String zonaAsignada;

    public Sustituto(String nombre, int edad, String origen, Zanpakuto espada, String zonaAsignada) {
        super(nombre, edad, origen, espada);
        this.zonaAsignada = zonaAsignada;
    }

    public void vigilar() {
        System.out.println(super.nombre + " sustituto vigila " + zonaAsignada);
    }

    @Override
    public void invocarBankai() {
        super.getEspada().bankai(super.getHollow() / 10, super.getEspada().getResistencia() * 2);
        System.out.println(super.nombre + "ha invocado su bankai");
    }

    @Override
    public void pelear(Shinigami defensor) {
        if (defensor instanceof Sustituto) {
            ((Sustituto) defensor).vida -= Math.abs(super.getEspada().getAtaque() - defensor.getEspada().getResistencia());
        } else if (defensor instanceof Teniente) {
            ((Teniente) defensor).vida -= Math.abs(super.getEspada().getAtaque() + super.poder - defensor.getEspada().getResistencia());
        } else if (defensor instanceof Capitan) {
            ((Capitan) defensor).vida -= Math.abs(super.getEspada().getAtaque() - (defensor.getEspada().getResistencia() + ((Capitan) defensor).poder));
        }
    }

    @Override
    public String toString() {
        String res = "";
        res += super.nombre + "[vida: " + super.vida + ", poder: " + poder + "] Shinigami Sustituto\n";
        res += zonaAsignada;
        return res;
    }

}
