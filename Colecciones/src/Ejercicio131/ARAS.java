/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio131;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Pablo Calvente
 */
public class ARAS {

    private HashMap<String, String> mapa;

    public ARAS() {
        mapa = new HashMap<>();
    }

    public void borrar(String clave) {
        if (mapa.remove(clave) != null) {
            System.out.println("Se ha eliminado la clave y el valor");
        } else {
            System.out.println("No se ha conseguido eliminar");
        }
    }

    public void meter(String clave, String valor) {
        if (mapa.containsKey(clave)) {
            System.out.println("Ya existe esa clave");
        } else {
            mapa.put(clave, valor);
            System.out.println("Se ha introducido el par clave y valor");
        }
    }

    public void actualizar(String clave, String valor) {
        if (mapa.containsKey(clave)) {
            mapa.put(clave, valor);
            System.out.println("Se ha cambiado el valor de esta clave");
        } else {
            System.out.println("No existe la celda");
        }
    }

    public boolean existeClave(String clave) {
        return mapa.containsKey(clave);
    }

    public boolean existeValor(String valor) {
        return mapa.containsValue(valor);
    }

    public void mostrar(HashMap diccionario) {
        for (Map.Entry<String, String> m : mapa.entrySet()) {
            System.out.println("Clave: " + m.getKey() + " Valor: " + m.getValue());
        }
        /*
        for(String clave:mapa.keySet()){
            System.out.println("Clave: "+clave+" Valor: "+mapa.get(clave));
        }
         */
    }
}
