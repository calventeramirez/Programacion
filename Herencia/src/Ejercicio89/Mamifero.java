package Ejercicio89;

/**
 *
 * @author usuario
 */
public class Mamifero {
    protected int numPatas;
    private double mediaVida;
    
    public Mamifero(int numPatas, double mediaVida){
        this.numPatas = numPatas;
        this.mediaVida = mediaVida;
    }
    
    public String comunicarse(){
        return "";
    }
    
    public String  dormir(){
        return "Duerme una media de "+8+" horas";
    }
    
    @Override
    public String toString(){
        return numPatas+" patas con una vida media de "+mediaVida;
    }
}
