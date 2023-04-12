package Ejercicio124;

public class testPila {

    public static void main(String[] args) {
        Pila pila = new Pila();
        System.out.println(pila.toString());
        System.out.println(pila.llena());
        for (int i = 0; i < 100; i++) {
            pila.insertar(i * ((int) (Math.random() * 10) + 2));
        }
        System.out.println(pila.llena());
        System.out.println(pila.cima());
        System.out.println(pila.extraer());
        System.out.println(pila);
        System.out.println(pila.vacia());

    }
}
