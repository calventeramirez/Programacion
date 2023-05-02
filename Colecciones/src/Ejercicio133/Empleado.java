/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio133;

import java.util.Objects;

/**
 *
 * @author Pablo Calvente
 */
public class Empleado {

    private String nombre, apellido;
    private boolean sexo;//true --> hombre, false --> mujer
    private double sueldoBase;
    private int anioAntiguedad;

    public Empleado(String nombre, String apellido, boolean sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        sueldoBase = 800;
        anioAntiguedad = (int) (Math.random() * 11);//aleatorio entre 0 y 10
    }

    public int getAnioAntiguedad() {
        return anioAntiguedad;
    }

    public void setAnioAntiguedad(int anioAntiguedad) {
        this.anioAntiguedad = anioAntiguedad;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    @Override
    public String toString() {
        if (sexo) {
            return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido + ", sexo= Masculino" + ", sueldoBase=" + sueldoBase + ", anioAntiguedad=" + anioAntiguedad + '}';

        } else {
            return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido + ", sexo= Femenino" + ", sueldoBase=" + sueldoBase + ", anioAntiguedad=" + anioAntiguedad + '}';
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (this.sexo != other.sexo) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.apellido, other.apellido);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.nombre);
        hash = 37 * hash + Objects.hashCode(this.apellido);
        hash = 37 * hash + (this.sexo ? 1 : 0);
        return hash;
    }

}
