/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio101;

/**
 *
 * @author Pablo Calvente
 */
public class Bongo extends Percusion {

    private int numCajas; //2 o  mas
    private boolean tipoPiel;//true ->Sintetica False->natural

    public Bongo(String marca, int mes, int anyo, Partitura p, boolean tipo, int nunCajas, boolean tipoPiel) {
        super(marca, mes, anyo, p, tipo);
        if (nunCajas > 1) {
            this.numCajas = nunCajas;
        } else {
            this.numCajas = 2;
        }
        this.tipoPiel = tipoPiel;
    }

    @Override
    public void afinarse() {
        System.out.println("Se han ajustado los " + numCajas + "*4 pernos de los bongos");
    }

    @Override
    public String tocarPartitura() {
        String res = "";
        if (!roto) {
            for (int i = 0; i < super.getP().numNotas(); i++) {
                switch (super.getP().listaNotas[i].getValor()) {
                    case "DO":
                        res += "tom ";
                        break;
                    case "RE":
                        res += "tem ";
                        break;
                    case "MI":
                        res += "tim ";
                        break;
                    case "FA":
                        res += "tam";
                        break;
                    case "SOL":
                        res += "totom ";
                        break;
                    case "LA":
                        res += "tatam ";
                        break;
                    default:
                        res += "tutim ";
                }
            }
        } else {
            res = "No se pudo tocar el piano";
        }
        return res;
    }

    @Override
    public void pararDeTocar() {
        System.out.println("Se ha parado de tocar los bongos");
    }

}
