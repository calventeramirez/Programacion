
package T2P2;


public class testShinigamis{
    public static void main(String[] args) {
       Teniente t1 = new Teniente("PEPE", 251, "Europeo", new Zanpakuto("Recolector de almas", 5.2, 25), 10);
       Capitan c1 = new Capitan("Federico", 258, "Japones", new Zanpakuto("Segador de la muerte", 30, 50), 5);
       Sustituto s1 = new Sustituto("Carlos", 2590, "Mali", new Zanpakuto("Segadora 2", 50, 80), "Kanto");
       
       t1.invocarBankai();
       c1.pelear(t1);
       c1.pelear(s1);
       
       
        System.out.println(c1.toString());
       
    }
}
