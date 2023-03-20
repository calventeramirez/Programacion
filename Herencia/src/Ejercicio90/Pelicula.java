package Ejercicio90;

/**
 *
 * @author usuario
 */
public class Pelicula extends Multimedia {

    private String actorPrincipal, actrizPrincipal;

    public Pelicula(String titulo, String formato, double duracion, String actor, String actriz) {
        super(titulo, formato, duracion);
        actorPrincipal = actor;
        actrizPrincipal = actriz;
    }

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    @Override
    public String toString() {
        return super.toString() + ", como actor principal " + actorPrincipal + " y la actriz principal es " + actrizPrincipal;
    }

    public boolean equals(Pelicula p) {
        return super.equals(p) && actorPrincipal.equalsIgnoreCase(p.actorPrincipal) && actrizPrincipal.equalsIgnoreCase(p.actrizPrincipal);
    }
}
