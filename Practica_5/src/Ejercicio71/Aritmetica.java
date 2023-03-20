package Ejercicio71;

/**
 *
 * @author usuario
 */
public class Aritmetica {
    private double x, y;
    
    public Aritmetica(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public Aritmetica(){
        this.x = 0;
        this.y = 0;
    }
    
    public double suma(double x, double y){
        return x+y;
    }
    
    public double resta(double x, double y){
        return x-y;
    }
    
    public double multiplicacion(double x, double y){
        return x*y;
    }
    
    public double division(double x, double y){
        if(y == 0){
            return 0;
        }else{
            return x/y;
        }
    }
    
    public double potencia(double x, double y){
        return Math.pow(x, y);
    }
}
