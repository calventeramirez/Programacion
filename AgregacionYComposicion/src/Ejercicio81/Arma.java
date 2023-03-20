package Ejercicio81;

/**
 *
 * @author usuario
 */
public class Arma {

    private String nombre;
    private int resistencia, poder;
    private int nivel;

    public Arma(String nombre, int resistencia, int poder) {
        this.nombre = nombre;
        this.resistencia = resistencia;
        this.poder = poder;
        nivel = 1;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public int getResistencia() {
        return resistencia;
    }

    public int getPoder() {
        return poder;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    //Metodos
    public void SubirNivel() {
        nivel++;
        resistencia += 2;
        poder += 1;
    }

    @Override
    public String toString() {
        String res = "";
        res += "Arma: \n";
        res += "Nombre: ";
        res += nombre;
        res += "\nResistencia: ";
        res += resistencia;
        res += "\nPoder: ";
        res += poder;
        return res;
    }
}
