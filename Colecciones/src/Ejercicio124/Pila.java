package Ejercicio124;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Pila {

    ArrayList<Integer> lista;

    public Pila() {
        lista = new ArrayList<>();
    }

    public void insertar(int elemento) {
        lista.add(elemento);
    }

    public int cima() {
        return lista.get(lista.size() - 1);
    }

    public int extraer() {
        int num = lista.get(lista.size() - 1);
        try {
            lista.remove(lista.size() - 1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error. No se ha podido acceder a la posicion: " + e.getMessage());
            num = -1;
        }
        return num;
    }

    public boolean vacia() {
        lista.clear();
        return true;
    }

    public boolean llena() {
        if (lista.isEmpty()) {
            return false;
        }
        return true;
    }

    public String toString() {
        return lista.toString();
    }
}
