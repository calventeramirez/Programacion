/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio101;

/**
 *
 * @author Pablo Calvente
 */
public class Piano extends Cuerda {

    private int numTeclas; //49-88 teclas
    private String tipoPiano; //de pared, de cola, electrico

    public Piano(String marca, int mes, int anyo, Partitura p, int numCuerdas, boolean tipoCuerda, int numTeclas, String tipoPiano) {
        super(marca, mes, anyo, p, numCuerdas, tipoCuerda);
        if (numTeclas > 48 && this.numTeclas < 89) {
            this.numTeclas = numTeclas;
        } else {
            this.numTeclas = (int) ((Math.random() * (88 - 48 + 1)) + 48);
        }
        if (tipoPiano.equalsIgnoreCase("De Pared") || tipoPiano.equalsIgnoreCase("De Cola") || tipoPiano.equalsIgnoreCase("Electrico")) {
            this.tipoPiano = tipoPiano;
        } else {
            this.tipoPiano = "Electrico";
        }

    }

    @Override
    public void afinarse() {
        if (!roto) {
            System.out.println("Se han tensado correctamente las " + numTeclas + " del piano.");
        }
    }

    @Override
    public String tocarPartitura() {
        String res = "";
        if (!roto) {
            for (int i = 0; i < super.getP().numNotas(); i++) {
                switch (super.getP().listaNotas[i].getValor()) {
                    case "DO":
                        for (int j = 0; j < super.getP().listaNotas[i].getDuracion(); j++) {
                            res += "ton ";
                        }
                        break;
                    case "RE":
                        for (int j = 0; j < super.getP().listaNotas[i].getDuracion(); j++) {
                            res += "ten ";
                        }
                        break;
                    case "MI":
                        for (int j = 0; j < super.getP().listaNotas[i].getDuracion(); j++) {
                            res += "tin ";
                        }
                        break;
                    case "FA":
                        for (int j = 0; j < super.getP().listaNotas[i].getDuracion(); j++) {
                            res += "tan ";
                        }
                        break;
                    case "SOL":
                        for (int j = 0; j < super.getP().listaNotas[i].getDuracion(); j++) {
                            res += "tun ";
                        }
                        break;
                    case "LA":
                        for (int j = 0; j < super.getP().listaNotas[i].getDuracion(); j++) {
                            res += "tean ";
                        }
                        break;
                    default:
                        for (int j = 0; j < super.getP().listaNotas[i].getDuracion(); j++) {
                            res += "tain ";
                        }
                }
            }
        } else {
            res = "No se pudo tocar el piano";
        }
        return res;
    }

    @Override
    public void pararDeTocar() {
        System.out.println("Se ha dejado de tocar el piano");
    }

}
