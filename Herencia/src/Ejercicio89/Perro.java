package Ejercicio89;

/**
 *
 * @author usuario
 */
public class Perro extends Mamifero {

    private String raza, nombre;
    private boolean mezcla;//false -> pura raza, true -> mezcla

    public Perro(String nombre, String raza, int numPatas, double mediaVida) {
        super(numPatas, mediaVida);
        this.nombre = nombre;
        this.raza = raza;
        mezcla = false;
    }

    @Override
    public String comunicarse() {
        return "GUAU";
    }

    @Override
    public String dormir() {
        return nombre + " duerme una media de " + 18 + " horas";
    }

    public String jugar() {
        return nombre + " esta jugando";
    }

    public boolean isMezcla() {
        return mezcla;
    }

    public void setMezcla(boolean mezcla) {
        this.mezcla = mezcla;
    }

    @Override
    public String toString() {
        String res = "";
        res += nombre + " es un perro ";
        res += "es de raza " + raza + " ";
        if (mezcla) {
            res += "no es de pura raza ";
        } else {
            res += "es de pura raza ";
        }
        res += super.toString();
        return res;
    }

}
