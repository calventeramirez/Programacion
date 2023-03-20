
package Ejercicio75;


public class main{
    public static void main(String[] args) {
        Cuenta n1 = new Cuenta("Paco", 1000);
        
        System.out.println(n1);
        
        n1.ingresar(500);
        n1.retirar(50000);
        System.out.println(n1);
    }
}
