package Ejercicio90;

/**
 *
 * @author usuario
 */
public class Multimedia {

    private String titulo, formato;
    private double duracion;

    public Multimedia(String titulo, String formato, double duracion) {
        this.titulo = titulo;
        if (formato.equalsIgnoreCase("mp3") || formato.equalsIgnoreCase("wav") || formato.equalsIgnoreCase("aac") || formato.equalsIgnoreCase("mp4") || formato.equalsIgnoreCase("mkv") || formato.equalsIgnoreCase("mov") || formato.equalsIgnoreCase("flv")) {
            this.formato = formato;
        } else {
            this.formato = "mp3";
        }
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getFormato() {
        return formato;
    }

    public double getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return titulo + " en formato " + formato + " con una duracion de " + duracion;
    }

    public boolean equals(Multimedia m) {
        return (formato.equalsIgnoreCase(m.formato)) && (duracion == m.getDuracion());
    }
}
