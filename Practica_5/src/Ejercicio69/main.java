
package Ejercicio69;


public class main{
    public static void main(String[] args) {
       Hora reloj = new Hora(5,20,51);
       
        System.out.println(reloj.getHoras()+":"+reloj.getMinutos()+":"+reloj.getSegundos());
        reloj.setMinutos(52);
        reloj.setHoras(17);
        reloj.setSegundos(1);
        System.out.println(reloj.getHoras()+":"+reloj.getMinutos()+":"+reloj.getSegundos());
    }
}
