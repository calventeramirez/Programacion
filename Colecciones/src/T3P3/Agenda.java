package T3P3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

/**
 *
 * @author Pablo Jesús Calvente Ramírez (1A DAW)
 * @version 1.0
 */
public class Agenda {

    private HashMap<String, Persona> agenda;
    private FileWriter escritor;
    private BufferedWriter miBuffer;

    /**
     * Constructor de la Agenda. Solo se inicializa la estructura.
     */
    public Agenda() {
        agenda = new HashMap<>();
    }

    /**
     * Añade una persona a la estructura.
     *
     * @param dni dni de la persona con letras
     * @param nombre nombre de las personas
     * @param apellidos apellidos o apellido de las personas
     * @param fnacimiento Fecha de nacimiento de esta persona
     * @param nacionalidad nacionalidad de la persona
     * @param sexo sexo de la persona true hombre, false mujer
     */
    public void aniadirPersona(String dni, String nombre, String apellidos, String fnacimiento, String nacionalidad, boolean sexo) {
        if (agenda.containsKey(dni)) {
            System.out.println("No se puede añadir a " + nombre + " ya que esta en la agenda.");
        } else {
            Persona p = new Persona(nombre, apellidos, fnacimiento, nacionalidad, sexo);
            agenda.put(dni, p);
            System.out.println("Se ha añadido ha " + nombre + " a la agenda");
        }
    }

    /**
     * Borra la persona de la estructura.
     *
     * @param dni dni de la persona a borrar
     */
    public void borrarPersona(String dni) {
        if (agenda.containsKey(dni)) {
            agenda.remove(dni);
            System.out.println("Se ha eliminado correctamente la persona.");
        } else {
            System.out.println("Error. no se puede borrar una persona que no esta agendada");
        }
    }

    /**
     * Elimina todos los datos de la agenda
     */
    public void limpiarAgenda() {
        agenda.clear();
        System.out.println("La agenda se ha limpiado correctamente");
    }

    /**
     * Muestra todo los datos que hay en la estructura.
     */
    public void mostrarAgenda() {
        for (String k : agenda.keySet()) {
            System.out.println("---------\nDNI/NIE: " + k + "\n" + agenda.get(k));
        }
    }

    /**
     * Hace una copia de seguridad de la agenda en un fichero llamado
     * copiaSeguridad.txt
     */
    public void copiaSeguridad() {
        try {
            escritor = new FileWriter("src/T3P3/copiaSeguridad.txt");
            miBuffer = new BufferedWriter(escritor);
        } catch (IOException e) {
            System.out.println("Error. no se ha podido crear el fichero.");
        }

        try {
            for (String k : agenda.keySet()) {
                miBuffer.write("---------\nDNI/NIE: " + k + "\n" + agenda.get(k));
                miBuffer.newLine();
            }

            miBuffer.close();
            escritor.close();

        } catch (IOException e) {
            System.out.println("Error. No se ha podido volvar al fichero");
        }

    }
}
