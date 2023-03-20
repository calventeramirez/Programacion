package Persona;

/**
 *
 * @author usuario
 */
public class Persona {

    private String nombre;
    private int edad;
    private char sexo;

    public Persona(String n, int e, char s) {
        if (e < 0) {
            throw new RuntimeException("La edad no puede ser negativa.");
        }
        if ((s != 'F') && (s != 'M')) {
            throw new RuntimeException("Error al meter el sexo. (Valido M o F).");
        }
        nombre = n;
        edad = e;
        sexo = s;
    }

    public void setEdad(int edad) throws Exception{
        if (edad < 0) {
            throw new Exception("No se puede introducir una edad negativa");
        }

        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo = " + sexo + '}';
    }

}
