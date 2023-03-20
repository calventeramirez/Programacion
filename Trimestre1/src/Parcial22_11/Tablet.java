package Parcial22_11;

/**
 *
 * @author usuario
 */
public class Tablet {

    private String marca, modelo;
    private int RAM;
    private double megapixeles, peso, pulgadas, versionAndroid;
    private boolean encendida;

    public Tablet(String marca, String modelo, int RAM, double megapixeles, double peso) {
        this.marca = marca;
        this.modelo = modelo;
        this.RAM = RAM;
        this.megapixeles = megapixeles;
        this.peso = peso;
        encendida = false;
        pulgadas = 10.1;
        versionAndroid = 11.0;
    }
    
    public void apagarse(){
        if(encendida){
            System.out.println("El tablet se ha apagado");
            encendida = false;
        }else{
            System.out.println("El tablet no se puede apagar porque ya esta apagado");
        }
    }
    
    public void encenderse(){
        if(!encendida){
            System.out.println("Bienvenido al Sistema de "+marca);
            System.out.println("Este terminal es el modelo: "+modelo);
            System.out.println("SO: Android "+versionAndroid);
            encendida = true;
        }else{
            System.out.println("Ya esta encendido la tablet no puedes volver a encenderlo, apagalo antes.");
        }
    }
    
    @Override
    public String toString(){
        String salida="";
        salida += "Caracteristicas de la Tablet: \n";
        salida += marca+" - "+modelo+"\n";
        salida += "Version de Android: "+versionAndroid+"\n";
        salida += "Tamaño: "+pulgadas+" pulgadas\n";
        salida += "Pesa "+peso+" gramos\n";
        salida += "Camara con "+megapixeles+" megapixeles\n";
        if(encendida){
            salida += "La tablet esta encendida";
        }else{
            salida += "La tablet esta apagada";
        }
        return salida;
    }
}
