
package Ejercicio89;


public class testPajareria{
    public static void main(String[] args) {
        Perro p1= new Perro("Bobby", "Pastor aleman", 4, 8);
        Perro p2 = new Perro("Max", "Hasky", 4, 8);
        
        Gato g1 = new Gato ("Mili", "Persa", 4, 5);
        Gato g2 = new Gato("Don gato", "Esfinge", 4, 5);
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(g1);
        System.out.println(g2);
        
        System.out.println(p1.comunicarse());
        System.out.println(p2.dormir());
        System.out.println(g1.comunicarse());
        System.out.println(g2.dormir());
      }
}
