package Ejercicio82;

/**
 *
 * @author usuario
 */
public class Estrella {

    private int x, y;
    private String forma;

    public Estrella(int x, int y) {
        this.x = x;
        this.y = y;
        
        int alea = (int) (Math.random()*4);
        if(alea == 1){
            this.forma ="*";
        }else{
             forma = ".";
        }
       
    }


    @Override
    public String toString() {
        return forma;
    }

}
