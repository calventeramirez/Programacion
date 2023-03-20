package Ejercicio74;

public class main {

    public static void main(String[] args) {
        Libro it = new Libro("It", "Stephen King", 350, 158255);
        Libro nombreViento = new Libro("El nombre del viento", "Patrick Rockfuss", 380, 75000);

        System.out.println(it);
        System.out.println(nombreViento);

        if (it.getNumPag() > nombreViento.getNumPag()) {
            System.out.println(it.getTitulo() + " tiene mas paginas");
        } else if (it.getNumPag() < nombreViento.getNumPag()) {
            System.out.println(nombreViento.getTitulo() + " tiene mas paginas");
        }else{
            System.out.println("Tienen el mismo numero de paginas");
        }
    }
}
