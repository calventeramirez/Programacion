package Ejercicio94;

/**
 *
 * @author usuario
 */
public class Minion extends Personaje {

    private String tipo;

    public Minion(double hp, double sp, double ap, String tipo) {
        super("minion", (int) ((Math.random() * (1520 - 400 + 1)) + 400), (int) ((Math.random() * (1520 - 400 + 1)) + 400), 0, 0, 0);
        if (tipo.equalsIgnoreCase("Mago")) {
            this.tipo = "Mago";
            super.hp = 12;
            super.sp = 40;
            super.ap = 30;
        } else if (tipo.equalsIgnoreCase("Cañon")) {
            this.tipo = "Cañon";
            super.hp = 75;
            super.sp = 5;
            super.ap = 25;
        } else {
            this.tipo = "Melee";
            super.hp = 50;
            super.sp = 10;
            super.ap = 10;
        }
    }

}
