/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio101;

/**
 *
 * @author Pablo Calvente
 */
public abstract class Viento extends Instrumento {

    private boolean tipo; //true->viento false->madera

    public Viento(String marca, int mes, int anyo, Partitura p, boolean tipo) {
        super(marca, mes, anyo, p);
        this.tipo = tipo;
    }

    public Viento(String marca, int mes, int anyo, boolean tipo) {
        super(marca, mes, anyo);
        this.tipo = tipo;
    }

    public abstract void afinarse();

    @Override
    public abstract String tocarPartitura();

    @Override
    public abstract void pararDeTocar();

}
