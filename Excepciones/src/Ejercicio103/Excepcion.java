
package Ejercicio103;


public class Excepcion{
    private String salida;
    private int sum;
    
    public Excepcion(String sal){
        salida = sal;
        sum = 0;
    }
    
    public int modificar(int dato){
        if(dato < 0){
            throw new RuntimeException("Soy una excepcion");
        }
        return sum += dato;
    }
    
    
}
