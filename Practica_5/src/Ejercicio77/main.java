package Ejercicio77;

public class main {

    public static void main(String[] args) {
        Estudiante pepe = new Estudiante("Pepe", "Garcia Garcia", 5);

        System.out.println(pepe.InsertarNota(5.8));
        System.out.println(pepe.InsertarNota(8.2));
        System.out.println(pepe.InsertarNota(4.2));

        System.out.println(pepe);
    }
}
