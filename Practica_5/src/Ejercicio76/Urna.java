package Ejercicio76;

/**
 *
 * @author usuario
 */
public class Urna {

    private int negras, blancas;

    public Urna(int negras, int blancas) {
        this.negras = negras;
        this.blancas = blancas;
    }

    public int getNegras() {
        return negras;
    }

    public int getBlancas() {
        return blancas;
    }

    public int getBolasTotales() {
        return negras + blancas;
    }

    public String extraer() {
        String res = "";
        int suma = getBolasTotales();
        if ((int) (Math.random() * (suma - 1 + 1) + 1) <= blancas) {
            blancas--;
            res = "b";
        } else {
            negras--;
            res = "n";
        }
        return res;
    }

    public void setNegras(int negras) {
        this.negras = negras;
    }

    public void setBlancas(int blancas) {
        this.blancas = blancas;
    }

    @Override
    public String toString() {
        String res = "";
        res += "\nUrna:\n";

        res += "Blancas: " + blancas + "\n";
        res += "Negras: " + negras + "\n";
        return res;
    }
}
