package Ejercicio74;

/**
 *
 * @author usuario
 */
public class Libro {

    private int isbn, numPag;
    private String titulo, autor;

    public Libro(String titulo, String autor, int numPag, int isbn) {
        this.autor = autor;
        this.titulo = titulo;
        this.numPag = numPag;
        this.isbn = isbn;
    }

    public Libro() {
        autor = "";
        titulo = "";
        numPag = 0;
        isbn = 0;
    }

    public int getIsbn() {
        return isbn;
    }

    public int getNumPag() {
        return numPag;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "El libro "+titulo+" con ISBN "+isbn+" creado por "+autor+" tiene "+numPag;
    }
    
    
}
