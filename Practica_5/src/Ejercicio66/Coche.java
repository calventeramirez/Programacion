package Ejercicio66;

/**
 *
 * @author usuario
 */
public class Coche {

    private String color;
    private double anchura, altura;
    private int numPuertas, numRuedas, gasolina;
    private boolean arrancado;

    public Coche(String color, double anchura, double altura, int numPuertas) {
        this.color = color;
        this.anchura = anchura;
        this.altura = altura;
        this.numPuertas = numPuertas;
        numRuedas = 4;
        arrancado = false;
        gasolina = 25;
    }

    public void arrancar() {
        if (!chequear() && gasolina >=5) {
            arrancado = true;
            System.out.println("El coche se ha arrancado");
            gasolina -= 5;
        } else {
            System.out.println("No se ha podido arrancar debido a que el coche esta arrancado");
        }

    }

    public void parar() {
        if (chequear()) {
            arrancado = false;
            System.out.println("El coche se ha apagado");
        } else {
            System.out.println("El coche no se puede apagar ya que esta apagado");
        }

    }

    public void desplazar() {
        if (chequear() && gasolina >= 20) {
            gasolina -= 20;
            System.out.println("El coche se esta desplazando");
        } else if (chequear() && gasolina < 20) {
            System.out.println("EL coche no tiene suficiente gasolina para moverse");
        } else {
            System.out.println("EL coche no se puede desplazar debido a que esta parado");
        }
    }

    public void echarGasolina(int cantidad) {
        if (cantidad + gasolina > 50 && !chequear()) {
            gasolina = 50;
            System.out.println("No se ha echado toda la cantidad ya que has llenado el tanque antes");
        } else if (!chequear()) {
            gasolina += cantidad;
        } else {
            System.out.println("No se puede echar gasolina hasta que apagues el coche mendrugo");
        }
    }

    public boolean chequear() {
        return arrancado;
    }
    
    public void pintar(String color){
        this.color = color;
    }
    
    @Override
    public String toString(){
        String coche;
        coche = "El coche es de color "+color+",  el tamaño del coche es "+anchura +"X"+altura+" con "+numPuertas+" puertas y "+numRuedas+" ruedas.";
        return coche;
    }
}
