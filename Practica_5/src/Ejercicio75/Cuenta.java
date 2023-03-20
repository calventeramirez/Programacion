package Ejercicio75;

/**
 *
 * @author usuario
 */
public class Cuenta {
    private String titular;
    private double cantidad;
    
    public Cuenta(String titular, double cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }
    
    public Cuenta (){
        titular="";
        cantidad=0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }


    public double getCantidad() {
        return cantidad;
    }

  
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    public void ingresar(double ingreso){
        if(ingreso>0.0){
            cantidad += ingreso;
            System.out.println("Se ha ingresado la siguiente cantidad "+ingreso);
        }
    }
    
    public void retirar (double retirada){
        if(cantidad-retirada >= 0.0){
            cantidad -= retirada;
        }else{
            System.out.println("Error: No se puede retirar debido a que no tiene suficiente dinero muerto de hambre");
        }
    }
    
    @Override
    public String toString(){
        return "Esta cuenta pertenece a "+titular+" y posee actualmente una cantidad de "+cantidad+" €";
    }
}
