package Ejercicio79;

/**
 *
 * @author usuario
 */
public class Pila {

    private int[] pila;
    private int posVacia;

    public Pila(int tamano) {
        pila = new int[tamano];
        for (int i = 0; i < tamano; i++) {
            pila[i] = 0;
        }
        posVacia = 0;
    }

    public void insertar(int elemento) {
        for (int i = 0; i < pila.length; i++) {
            if (pila[i] == 0) {
                pila[i] = elemento;
                posVacia++;
                i = pila.length;
            }

            if (i == pila.length - 1) {//Si no consigo introducirlo saco el error
                System.out.println("No se ha podido insertar, no hay hueco");
            }
        }
    }

    public int cima() {
        return pila[posVacia - 1];
    }

    public int extraer() {
        int extr = -1;
        extr = pila[posVacia - 1];
        posVacia--;
        pila[posVacia] = 0;
        return extr;
    }

    public boolean vacia() {
        return posVacia == 0;
    }

    public boolean llena() {
        return posVacia == pila.length;
    }

    @Override
    public String toString() {
        String res = "";
        res += "El estado de la pila: ";
        for (int i = 0; i < pila.length - 1; i++) {
            res += pila[i];
        }
        res += pila[pila.length - 1];
        res += "Y tiene " + posVacia + "posiciones vacia.";
        return res;
    }
}
