package Ejercicio78;

/**
 *
 * @author usuario
 */
public class ListaCadenas {

    private String[] lista;
    private int posVacia;

    public ListaCadenas(int tamano) {
        lista = new String[tamano];
        for (int i = 0; i < tamano; i++) {
            lista[i] = "";
        }
        posVacia = 0;
    }

    public void aniadir(String elemento) {
        if (posVacia >= lista.length) {
            System.out.println("ERROR LA LISTA ESTA LLENA");
        } else {
            lista[posVacia] = elemento;
            posVacia++;
            System.out.println("Se ha introducido el elemento");
        }
    }

    public void aniadir(String elemento, int pos) {
        if (pos >= 0 && pos < lista.length) {
            if (lista[pos].equalsIgnoreCase("")) {
                posVacia++;
            }
            lista[pos] = elemento;

        } else {
            System.out.println("ERROR MENDRUGO NO PUEDES PONER UN ELEMENTO EN UNA POSICION QUE NO EXISTE");
        }
    }

    public int tamanio() {
        return lista.length;
    }

    public boolean vacia() {
        if (posVacia == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String obtener(int pos) {
        return lista[pos];
    }

    public int buscar(String elemento) {
        int pos = -1;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].equalsIgnoreCase(elemento)) {
                pos = i;
            }
        }
        return pos;
    }

    public void borrar() {
        for (int i = 0; i < lista.length; i++) {
            lista[i] = "";
        }
        posVacia = 0;
    }

    public void borrar(int pos) {
        if (pos >= 0 && pos <= lista.length - 1) {
            lista[pos] = "";
        } else {
            System.out.println("Error no existe posición");
        }
    }

    public void borrar(String elemento) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].equalsIgnoreCase(elemento)) {
                lista[i] = "";
            }
        }
    }

    public String[] trozo(int pos1, int pos2) {
        String[] salida;
        if (pos1 >= 0 && pos1 < lista.length && pos2 >= 0 && pos2 < lista.length) {
            salida = new String[pos2 - pos1 - 1];
            int cont = 0;
            for (int i = pos1; i <= pos2; i++) {
                salida[cont] = lista[pos1];
                cont++;
            }

        } else {
            salida = new String[lista.length];
            for (int i = 0; i < salida.length; i++) {
                salida[i] = "";
            }
        }
        return salida;
    }
}
