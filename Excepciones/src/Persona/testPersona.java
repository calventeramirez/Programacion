
package Persona;


public class testPersona{
    public static void main(String[] args) {
       try{
           Persona p = new Persona("Arron", 2, 'M');
           //p.setEdad(-10);
           System.out.println(p);
       }catch(RuntimeException e){
           System.out.println(e.getMessage());
       }
       
        
    }
}
