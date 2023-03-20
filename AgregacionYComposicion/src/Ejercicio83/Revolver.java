package Ejercicio83;

/**
 *
 * @author usuario
 */
public class Revolver {

    private String marca, modelo;
    private Bala[] tambor;
    private int martillo;

    public Revolver(String marca, String modelo, int tamano) {
        this.marca = marca;
        this.modelo = modelo;
        tambor = new Bala[tamano];
        martillo = tamano-1;
        for (int i = 0; i < tamano; i++) {
            Bala bala;
            if ((Math.random() * 4) % 2 == 0) {
                bala = new Bala(5, 20);
            } else {
                bala = new Bala(20, 70);
            }
            tambor[i] = bala;
        }
    }

    public String disparar() {
        String disp = "";
        if (tambor[martillo] != null) {
            disp += tambor[martillo];
            tambor[martillo] = null;
        } else {
            disp += "No hay bala en este hueco";
        }

        if (martillo == tambor.length - 1) {
            martillo = 0;
        } else {
            martillo++;
        }
        return disp;
    }

    @Override
    public String toString() {
        String res = "";
        res += "Marca: " + marca;
        res += "\nModelo: " + modelo;
        res += "\nTamaño del tambor: " + (tambor.length);
        res += "\nTambor = [";
        for (int i = 0; i < tambor.length - 1; i++) {
            if (tambor[i] != null) {
                res += tambor[i] + "|";
            } else {
                res += "Vacio|";
            }
        }
        if (tambor[tambor.length - 1] != null) {
            res += tambor[tambor.length - 1];
        } else {
            res += "Vacio";
        }
        return res;
    }
}
