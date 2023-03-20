package Ejercicio90;

/**
 *
 * @author usuario
 */
public class Cancion extends Multimedia {

    private String artista, editor, genero;

    public Cancion(String titulo, String artista, String formato, double duracion, String editor, String genero) {
        super(titulo, formato, duracion);
        this.artista = artista;
        this.editor = editor;
        if (genero.equalsIgnoreCase("pop") || genero.equalsIgnoreCase("rock") || genero.equalsIgnoreCase("flamenco") || genero.equalsIgnoreCase("hiphop") || genero.equalsIgnoreCase("R&B") || genero.equalsIgnoreCase("reggaeton")) {
            this.genero = genero;
        } else {
            this.genero = "rock";
        }
    }

    public String getArtista() {
        return artista;
    }

    public String getEditor() {
        return editor;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return super.toString() + ", como artista " + artista + " su editor es " + editor + " y su genero " + genero;
    }

}
