/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio133;

import java.util.HashMap;

/**
 *
 * @author Pablo Calvente
 */
public class Departamento {

    HashMap<Integer, Empleado> empleado;

    public Departamento() {
        empleado = new HashMap<>();
    }

    public void aniadirEmpleado(int dni, Empleado emp) {
        if (empleado.containsKey(dni)) {
            System.out.println("Ya esta añadido el empleado");
        } else {
            empleado.put(dni, emp);
            System.out.println("Se ha añadido el empleado");
        }
    }

    public void borrarEmpleado(int dni) {
        if (empleado.containsKey(dni)) {
            empleado.remove(dni);
            System.out.println("Se ha eliminado el empleado con DNI: " + dni);
        } else {
            System.out.println("No existe ningun empleado con DNI " + dni);
        }
    }

    public void buscarEmpleado(int dni) {
        if (empleado.containsKey(dni)) {
            System.out.println("Empleado: " + dni + "\n" + empleado.get(dni));
        } else {
            System.out.println("No se ha encontrado al empleado con DNI: " + dni);
        }
    }

    public void revisarSueldos() {
        for (int k : empleado.keySet()) {
            switch (empleado.get(k).getAnioAntiguedad()) {
                case 0:
                case 1:
                    break;
                case 2:
                case 3:
                case 4:
                    empleado.get(k).setSueldoBase(empleado.get(k).getSueldoBase() + 200);
                    break;
                case 6:
                case 7:
                case 8:
                    empleado.get(k).setSueldoBase(empleado.get(k).getSueldoBase() + 500);
                    break;
                case 9:
                case 10:
                    empleado.get(k).setSueldoBase(empleado.get(k).getSueldoBase() + 750);
                    break;
                default:
                    empleado.get(k).setSueldoBase(empleado.get(k).getSueldoBase() + 900);
                    break;
            }
        }
        System.out.println("Se han revisado los sueldos");
    }

    public void nuevoAnio() {
        for (int k : empleado.keySet()) {
            empleado.get(k).setAnioAntiguedad(empleado.get(k).getAnioAntiguedad() + 1);
        }
    }

    public void mostrarDepartamento() {
        for (int k : empleado.keySet()) {
            System.out.println("Empleado: " + k + "\n" + empleado.get(k));
        }
    }

    public void borrarTodo() {
        empleado.clear();
        System.out.println("Se ha eliminado todos los empleados");
    }
}
