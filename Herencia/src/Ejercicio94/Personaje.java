package Ejercicio94;

/**
 *
 * @author usuario
 */
public class Personaje {

    protected String nombre;
    protected int x, y;
    protected double hp, sp, ap;//hp=Vida, SP = punto de escudo, AP = Puntos de ataque

    public Personaje(String nombre, int x, int y, double hp, double sp, double ap) {
        this.nombre = nombre;
        if (x > 0) {
            this.x = x;
        } else {
            this.x = 0;
        }
        if (y > 0) {
            this.y = y;
        } else {
            this.y = 0;
        }
        if (hp > 0) {
            this.hp = hp;
        } else {
            this.hp = 0;
        }
        if (sp > 0) {
            this.sp = sp;
        } else {
            this.sp = 0;
        }
        if (ap > 0) {
            this.ap = ap;
        } else {
            this.ap = 0;
        }

    }
    
    public void desplazarse(int x, int y) {
        if (x > 0) {
            this.x += x;
        }

        if (y > 0) {
            this.y += y;
        }
    }
    
    
    
    @Override
    public String toString() {
        String res = "";
        res += "Nombre: " + nombre;
        res += "\nPosición: [" + x + ", " + y + "]\n";
        res += "Puntos de Vida: " + hp;
        res += "\nPuntos de Armadura: " + sp;
        res += "\nPuntos de Ataque: " + ap;
        return res;
    }
}
