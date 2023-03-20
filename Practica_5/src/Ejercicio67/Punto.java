package Ejercicio67;

/**
 *
 * @author usuario
 */
public class Punto {
    private int x, y;
    
    public Punto(){
        x=0;
        y=0;
    }
    
    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void moverHorizontal(int valor){
        x += valor;
    }
    
    public void moverVertical(int valor){
        y += valor;
    }
    
    public void mostrar(){
        System.out.println("Punto ("+x+", "+y+")");
    }
}
