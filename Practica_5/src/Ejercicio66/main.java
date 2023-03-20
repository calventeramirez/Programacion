
package Ejercicio66;


public class main{
    public static void main(String[] args) {
       Coche nissan = new Coche("Negro", 1.33, 1.2, 5);
       
       nissan.arrancar();
        System.out.println(nissan.chequear());
       nissan.pintar("Rojo");
       nissan.desplazar();
       System.out.println(nissan.chequear());
       nissan.parar();
       nissan.desplazar();
       nissan.echarGasolina(50);
       nissan.arrancar();
       nissan.desplazar();
        System.out.println(nissan.toString());
    }
}
