package T3P3;

/**
 *
 * @author Pablo Jesús Calvente Ramírez (1A DAW)
 * @version 1.0
 */
public class Persona {

    private String nombre, apellidos, fnacimiento, nacionalidad;
    private boolean sexo;//true --> masculino, false--> femenino

    /**
     * Constructor de la clase persona. Crearan instacias del objeto Persona.
     *
     * @param nombre nombre de la persona
     * @param apellidos apellido o apellidos de las personas
     * @param fnacimiento Fecha de nacimiento
     * @param nacionalidad nacionalidad
     * @param sexo sexo, si es true es Hombre si es false es mujer
     */
    public Persona(String nombre, String apellidos, String fnacimiento, String nacionalidad, boolean sexo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fnacimiento = fnacimiento;
        this.nacionalidad = nacionalidad;
        this.sexo = sexo;
    }

    /**
     * Constructor vacio. Se inicializa con valores predeterminados.
     */
    public Persona() {
        nombre = "";
        apellidos = "";
        fnacimiento = "1 Enero 1900";
        nacionalidad = "";
        sexo = true;
    }

    /**
     * Representacion de la persona.
     *
     * @return Persona
     */
    @Override
    public String toString() {
        if (sexo) {
            return "Nombre: " + nombre + "\nApellidos: " + apellidos + "\nSexo: Hombre" + "\nF. Nacimiento: " + fnacimiento + "\nNacionalidad: " + nacionalidad + "\n----------\n";

        } else {
            return "Nombre: " + nombre + "\nApellidos: " + apellidos + "\nSexo: Mujer" + "\nF. Nacimiento: " + fnacimiento + "\nNacionalidad: " + nacionalidad + "\n----------\n";

        }
    }

}
