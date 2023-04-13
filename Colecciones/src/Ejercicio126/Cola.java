/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio126;

import java.util.ArrayList;

/**
 *
 * @author Pablo Calvente
 */
public class Cola {

    private ArrayList<Persona> cola;

    public Cola() {
        cola = new ArrayList<>();
    }

    public boolean estaVacia() {
        return cola.isEmpty();
    }

    public void entrar(Persona p) {
        if (cola.add(p)) {
            System.out.println("Se ha introducido la persona");
        } else {
            System.out.println("No se ha podido introducir la persona");
        }
    }

    public String salir() {
        return cola.remove(0).toString();
    }

    public Persona primero() {
        return cola.get(0);
    }

    public int cantidad() {
        return cola.size();
    }
}
