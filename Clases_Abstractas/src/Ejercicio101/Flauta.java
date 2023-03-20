/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio101;

/**
 *
 * @author Pablo Calvente
 */
public class Flauta extends Viento {

    private boolean tipo; //true ->travesera o False->dulce
    private String lengueta;//plastico, madera o metal

    public Flauta(String marca, int mes, int anyo, Partitura p, boolean tipoMaterial, boolean tipoFlauta, String lengueta) {
        super(marca, mes, anyo, p, tipoMaterial);
        this.tipo = tipoFlauta;
        if (lengueta.equalsIgnoreCase("Plastico") || lengueta.equalsIgnoreCase("Madera") || lengueta.equalsIgnoreCase("Metal")) {
            this.lengueta = lengueta;
        } else {
            this.lengueta = "Metal";
        }
    }

    public void cambiarLengueta(String nueva) {
        if (nueva.equalsIgnoreCase("Plastico") || nueva.equalsIgnoreCase("Madera") || nueva.equalsIgnoreCase("Metal")) {
            lengueta = nueva;
        } else {
            System.out.println("No se ha podido cambiar la lengueta");
        }
    }

    @Override
    public void afinarse() {
        String tipoFlauta = "";
        if (tipo) {
            tipoFlauta = "travesera";
        } else {
            tipoFlauta = "dulce";
        }
        System.out.println("Se ha usado una baqueta para afinar correctamente la flauta " + tipoFlauta + " con lengueta de " + lengueta);
    }

    @Override
    public String tocarPartitura() {
        String res = "";
        if (!roto) {
            for (int i = 0; i < super.getP().numNotas(); i++) {
                switch (super.getP().listaNotas[i].getValor()) {
                    case "DO":
                        res += "flo";
                        for (int j = 0; j < super.getP().listaNotas[i].getDuracion(); j++) {
                            res += "*";
                        }
                        break;
                    case "RE":
                        res += "fle";
                        for (int j = 0; j < super.getP().listaNotas[i].getDuracion(); j++) {
                            res += "*";
                        }
                        break;
                    case "MI":
                        res += "fli";
                        for (int j = 0; j < super.getP().listaNotas[i].getDuracion(); j++) {
                            res += "*";
                        }
                        break;
                    case "FA":
                        res += "fla";
                        for (int j = 0; j < super.getP().listaNotas[i].getDuracion(); j++) {
                            res += "*";
                        }
                        break;
                    case "SOL":
                        res += "flon";
                        for (int j = 0; j < super.getP().listaNotas[i].getDuracion(); j++) {
                            res += "*";
                        }
                        break;
                    case "LA":
                        res += "flan";
                        for (int j = 0; j < super.getP().listaNotas[i].getDuracion(); j++) {
                            res += "*";
                        }
                        break;
                    default:
                        res += "flin";
                        for (int j = 0; j < super.getP().listaNotas[i].getDuracion(); j++) {
                            res += "*";
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
        System.out.println("Se ha dejado de tocar la flauta");
    }

}
