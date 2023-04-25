package Ejercicio127;

import Ejercicio126.Persona;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author usuario
 */
public class Agenda {

    List<Persona> lista;

    public Agenda() {
        lista = new ArrayList<>();
    }

    public void aniadirPersona(Persona p) {
        if (lista.add(p)) {
            System.out.println("Se ha añadido el elemento");
        } else {
            System.out.println("No se ha añadido el elemento");
        }
    }

    public void borrarPersona(String dni) {
        Persona p = new Persona(dni);
        Persona[] pe = (Persona[]) lista.toArray();
        int i = 0;
        while (i < pe.length) {
            if (p.equals(pe[i])) {
                lista.remove(i);
                i = pe.length;
                System.out.println("Se ha eliminado la persona de la Agenda");
            }
            i++;
        }
        if (i == pe.length + 1) {
            System.out.println("No se ha eliminado la persona de la Agenda");
        }
    }

    public void buscarPersona(String dni) {
        Persona nuevo = new Persona(dni);
        if (lista.contains(nuevo)) {
            System.out.println(lista.get(lista.indexOf(nuevo)));
        } else {
            System.out.println("No hay nadie con ese DNI en la Agenda");
        }
    }

    public void mostrarAgenda() {
        for (Persona p : lista) {
            System.out.println(p);
        }
    }

    public void ordenarAgenda() {
        Collections.sort((List) lista);

    }
}
