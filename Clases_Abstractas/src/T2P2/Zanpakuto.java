package T2P2;

/**
 *
 * @author usuario
 */
public class Zanpakuto {

    private String nombre;
    private double anchura, altura, ataque, resistencia;
    private boolean estado;//true ->shikai false -> bankai
    private double ataqueOriginal, resitenciaOriginal; //Se crean para almacenar los valores original para despues volverselos a poner en shikai

    public Zanpakuto(String nombre, double anchura, double altura) {
        this.nombre = nombre;
        this.altura = altura;
        this.anchura = anchura;
        ataque = ((Math.random() * (25 - 2 + 1)) + 2);
        ataqueOriginal = ataque;
        resistencia = ((Math.random() * (150 - 70 + 1)) + 70);
        resitenciaOriginal = resistencia;
        estado = true;
    }

    public void bankai(double mAtaque, double mResistencia) {
        ataque *= mAtaque;
        resistencia *= mResistencia;
        estado = false;
    }

    public void shikai() {
        estado = true;
        ataque = ataqueOriginal;
        resistencia = resitenciaOriginal;
    }

    public double getResistencia() { //Creada para porder obtener la resistencia
        return resistencia;
    }

    public double getAtaque() {//Creada para poder acceder al ataque para sustituto
        return ataque;
    }

    @Override
    public String toString() {
        String res = "";
        res = nombre + " [atq: " + ataque + ", res: " + res + "] ";
        if (estado) {
            res += "Shikai";
        } else {
            res += "Bankai";
        }
        return res;
    }

}
