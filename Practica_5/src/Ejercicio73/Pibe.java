package Ejercicio73;

/**
 *
 * @author usuario
 */
public class Pibe {

    private String nombre;
    private int esfuerzo, vidaTotal, hambre;
    private boolean estado; //Vivo = true, muerto = false
    final int PTOSESFUERZO = 10, PTOSHAMBRES = 3, PTOSVIDA = 7;

    public Pibe(String nombre) {
        this.nombre = nombre;
        esfuerzo = PTOSESFUERZO;
        hambre = PTOSHAMBRES;
        vidaTotal = PTOSVIDA;
        estado = true;
    }

    public void jugar() {
        if (estado) {
            System.out.println(nombre + " ha jugado.");
            esfuerzo -= 3;
            hambre -= 1;
            if (!vivo()) {
                estado = false;
                System.out.println(nombre + "ha muerto. Buena suerte la proxima vez");
            }
        } else {
            System.out.println("Esta muerto no puede jugar mendrugo");
        }

    }

    public void comer(boolean favorita) {
        if (estado && favorita && hambre + 3 > 3) {
            hambre = PTOSHAMBRES;
        } else if (estado && favorita) {
            hambre += 3;
        } else if (estado && !favorita && hambre + 2 > 3) {
            hambre = PTOSHAMBRES;
        } else if (estado && !favorita) {
            hambre += 2;
        } else {
            System.out.println("Esta muerto no lo sigas intentando");
        }
    }

    public void comunicarse() {
        if (estado) {
            esfuerzo--;
            System.out.println(nombre + " se ha comunicado");
            if (!vivo()) {
                estado = false;
                System.out.println(nombre + "ha muerto. Buena suerte la proxima vez");
            }
        } else {
            System.out.println("Esta muerto deja de intentarlo");
        }
    }

    public void dormir() {
        if (estado && esfuerzo + 5 > PTOSESFUERZO) {
            esfuerzo = PTOSESFUERZO;
            System.out.println("Se ha restaurado el esfuerzo al maximo");
        } else if (estado) {
            esfuerzo += 5;
            System.out.println("Se ha restaurado hasta " + esfuerzo + " puntos de esfuerzo");
        } else {
            System.out.println("Esta muerto carajo");
        }
    }

    private boolean vivo() {
        boolean esta = true;
        if ((esfuerzo <= 0 || hambre <= 0) && vidaTotal == 0) {
            esta = false;
            vidaTotal = -1;
            hambre = -1;
            esfuerzo = -1;
            System.out.println(nombre + " ha muerto");
        } else if ((esfuerzo <= 0 || hambre <= 0) && vidaTotal > 0) {
            vidaTotal--;
            System.out.println(nombre + " ha perdido una vida");
            hambre = PTOSHAMBRES;
            esfuerzo = PTOSESFUERZO;
        }
        return esta;
    }
}
