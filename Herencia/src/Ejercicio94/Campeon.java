package Ejercicio94;

/**
 *
 * @author usuario
 */
public class Campeon extends Personaje {

    private double pm;
    private int nivel;
    private String rol;
    private Habilidad[] habilidades;

    public Campeon(String nombre, String rol, Habilidad habilidad, int hp, int sp, int ap) {
        super(nombre, (int) ((Math.random() * (1920 - 1000 + 1)) + 1000), (int) ((Math.random() * (1920 - 1000 + 1)) + 1000), hp, sp, ap);

        if (rol.equalsIgnoreCase("Tanque")) {
            this.rol = "Tanque";
            pm = 100;
        } else if (rol.equalsIgnoreCase("Support")) {
            this.rol = "Support";
            pm = 300;
        } else if (rol.equalsIgnoreCase("Mago")) {
            this.rol = "Mago";
            pm = 500;
        } else if (rol.equalsIgnoreCase("Jungla")) {
            this.rol = "Jungla";
            pm = 200;
        } else {
            this.rol = "Carry";
            pm = 300;
        }
        nivel = 1;
        habilidades[0] = habilidad;
    }

    public void subirNivel(Habilidad nueva) {
        nivel++;
        super.hp += (int) (Math.random() * 9) + 1;
        super.sp += ((int) (Math.random() * 9) + 1) / 10;
        super.ap += ((int) (Math.random() * 9) + 1) / 10;
        switch (nivel) {
            case 4:
                habilidades[1] = nueva;
                break;
            case 6:
                habilidades[2] = nueva;
                break;
            case 8:
                habilidades[3] = nueva;
                break;
            default:
                break;
        }
    }

    public String atacar(Personaje enemigo) {
        String res = "";
        if (enemigo.sp - super.ap > 0 && enemigo.hp > 0) {
            enemigo.hp = enemigo.sp - super.ap;
            res = "Has atacado exitosamente al enemigo";
        } else {
            res = "No has atacado exitosamente al enemigo";
        }
        return res;
    }
}
