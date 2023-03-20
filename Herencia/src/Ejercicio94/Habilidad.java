package Ejercicio94;

/**
 *
 * @author usuario
 */
public class Habilidad {

    String nombre;
    private double coste, danyoBasico;
    int nivel;
    char tecla;

    public Habilidad(String nombre, char tecla) {
        this.nombre = nombre;
        this.tecla = tecla;
        nivel = 1;
        coste = (int) ((Math.random() * 10) + 1);
        danyoBasico = (int) ((Math.random() * (20 - 5 + 1) + 5)) + ((1 / 3) * coste);
    }

    public String subirNivel() {
        nivel++;
        coste += (int) ((Math.random() * 10) + 1);
        danyoBasico = (int) ((Math.random() * (20 - 5 + 1) + 5)) + ((1 / 3) * coste);
        return "El personaje a subido al nivel: " + nivel;
    }

    @Override
    public String toString() {
        String res = "Habilidad:\n";
        res += "Nombre: " + nombre;
        res += "\nTecla: " + tecla;
        res += "\nNivel: " + nivel;
        res += "\nCoste de mana: " + coste;
        res += "\nDaño: " + danyoBasico;
        return res;
    }
}
