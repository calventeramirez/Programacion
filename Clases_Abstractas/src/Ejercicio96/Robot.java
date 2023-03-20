package Ejercicio96;

/**
 *
 * @author usuario
 */
public abstract class Robot {

    protected int aguante, velocidad, potencia;

    public Robot(int aguante, int velocidad, int potencia) {
        this.aguante = aguante;
        this.velocidad = velocidad;
        this.potencia = potencia;
    }

    public abstract void combatir(Robot r);

    public abstract void mostrar() ;
}
