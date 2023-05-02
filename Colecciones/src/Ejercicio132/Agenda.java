/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio132;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Pablo Calvente
 */
public class Agenda {

    HashMap<String, String> alumnoCiudad;

    public Agenda() {
        alumnoCiudad = new HashMap<>();
    }

    public void aniadirAlumno(String nombre, String ciudad) {
        if (alumnoCiudad.containsKey(nombre.toUpperCase())) {
            System.out.println("No se puede añadir un alumno ya creado");
        } else {
            alumnoCiudad.put(nombre.toUpperCase(), ciudad.toUpperCase());
            System.out.println("Se ha añadido el alumno");
        }
    }

    public void mostrarCiudad(String ciudad) {
        int cont = 0;

        for (String c : alumnoCiudad.values()) {
            if (c.equalsIgnoreCase(ciudad)) {
                cont++;
            }
        }

        System.out.println("La ciudad " + ciudad + " tiene " + cont + " alumnos.");
    }

    public int cantidadCiudades() {
        ArrayList<String> lista = new ArrayList<>();
        boolean esta;

        for (String c : alumnoCiudad.values()) {
            esta = false;
            for (int i = 0; i < lista.size(); i++) {
                if (c.equalsIgnoreCase(lista.get(i))) {
                    esta = true;
                    i = lista.size();
                }
            }

            if (!esta) {
                lista.add(c);
            }
        }

        return lista.size();
    }

    public String mostrarDatos() {
        String dev = "";

        for (String k : alumnoCiudad.keySet()) {
            dev += "Alumno: " + k + ", Ciudad: " + alumnoCiudad.get(k) + "\n";
        }

        return dev;
    }

    public void borrar(String nombre) {
        if (alumnoCiudad.containsValue(nombre)) {
            alumnoCiudad.remove(nombre);
            System.out.println("Se ha borrado el nombre");
        } else {
            System.out.println("No se ha podido eliminar el nombre ya que no existe");
        }
    }

    public void borrar() {
        alumnoCiudad.clear();
    }

    public String resumen() {
        String dev = "";
        HashMap<String, Integer> lista = new HashMap<>();

        //Calculo el numero de veces
        for (String v : alumnoCiudad.values()) {
            if (lista.containsKey(v)) {
                lista.put(v, (Integer) (lista.get(v) + 1));
            } else {
                lista.put(v, 1);
            }
        }

        //Lo edito para la salida
        for (String k : lista.keySet()) {
            dev += k + ": " + lista.get(k) + " alumnos.\n";
        }

        return dev;
    }
}
