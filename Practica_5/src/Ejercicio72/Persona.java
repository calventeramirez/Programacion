package Ejercicio72;

/**
 *
 * @author usuario
 */
public class Persona {
    private String nombre, sexo, pais;
    private int edad, saludo;
    
    public Persona(String nombre, String sexo, String pais, int edad, int saludo){
        this.nombre=nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.pais = pais;
        this.saludo = saludo;
    }
    
    public Persona (){
        this.nombre ="";
        this.sexo="Helicoptero Apache";
        this.edad=0;
        this.pais="El de los tuertos";
        this.saludo = 1;
    }
    
    public String saludar(){
        String devolver = "";
        if(saludo == 1){
            devolver = "Hola! Me llamo "+nombre+" y soy de "+pais;
        }else if(saludo == 2){
            devolver = "Hola Holita, querido vecinillo, "+nombre+" soy Flanders.";
        }else{
            devolver = "Hola soy Paco, su teleasistente. Encantado de conocerle "+ nombre+" desde "+pais+" con "+edad+ " años";
        }
        return devolver;
    }
    
    public void mostrarDatos(){
        System.out.println(toString());
    }
    
    public boolean esMayorEdad(){
        return edad>17;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+nombre+"\nEdad: "+edad+"\nSexo: "+sexo+"\nPais: "+pais;
    }
}
