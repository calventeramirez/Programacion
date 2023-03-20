
package Ejercicio111;


public class testGato{
    public static void main(String[] args) {
       try{
           Gato g1 = new Gato("Gardfield", 5);
           Gato g2 = new Gato("kl", -5);
           
           g1.setNombre("Hl");
           g1.setEdad(-5);
       }catch(Exception e){
           System.out.println(e.getMessage());
       }
        
    }
}
