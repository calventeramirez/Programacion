/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio126;

import java.util.Objects;

/**
 *
 * @author Pablo Calvente
 */
public class Persona {

    private String dni, nombre, apellido;
    private boolean sexo;//true -> masculino, false-> femenino
    private int edad;
    private double peso;

    public Persona(String dni, String nombre, String apellido, boolean sexo, int edad, double peso) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
    }

    public Persona(String dni) {
        this.dni = dni;
        nombre = "";
        apellido = "";
        edad = 0;
        peso = 0;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public boolean isSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso + '}';
    }

    public boolean equals(Persona p) {
        return this.dni.equalsIgnoreCase(p.dni);
    }
    
    public int compareTo(Persona p){
        int salida = 0;
        if(this.dni.equalsIgnoreCase(p.getDni())){
            salida = 1;
        }else if(!this.dni.equalsIgnoreCase(dni)){
            salida = -1;
        }
        
        return salida;
    }
}
