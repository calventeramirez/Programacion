package Ejercicio68;

/**
 *
 * @author usuario
 */
public class Cafetera {

    private double capacidadMaxima, cantidadActual;

    public Cafetera() {
        capacidadMaxima = 1000;
        cantidadActual = 0;
    }

    public void echarCafe(double cantidad) {
        if (cantidadActual + cantidad > capacidadMaxima) {
            cantidadActual = capacidadMaxima;
            System.out.println("Se ha rellenado hasta la capacidad maxima");
        } else {
            cantidadActual += cantidad;
            System.out.println("Se ha rellenado la cafetera, tiene " + cantidadActual + "cc.");
        }
    }

    public void llenarCafetera() {
        cantidadActual = capacidadMaxima;
    }

    public void vaciarCafetera() {
        cantidadActual = 0;
    }

    public void servirTaza(double capacidadTaza) {
        if (cantidadActual - capacidadTaza < 0) {
            System.out.println("NO se puede servir esa taza ya que no hay suficiente cafe en la cafetera");
        } else {
            cantidadActual -= capacidadTaza;
            System.out.println("Se ha servido la taza");
        }
    }

    public void cantidadCafe() {
        System.out.println("Queda " + cantidadActual + " cc de cafe en la cafetera.");
    }

}
