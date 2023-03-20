package Ejercicio101;

/**
 *
 * @author usuario
 */
public abstract class Instrumento {

    protected String marca;
    protected int mes, anyo;
    protected boolean roto;//true -> esta roto, false ->no lo esta
    private Partitura p;

    public Instrumento(String marca, int mes, int anyo, Partitura p) {
        this.marca = marca;
        this.mes = mes;
        this.anyo = anyo;
        this.p = p;
        roto = false;
    }

    public Instrumento(String marca, int mes, int anyo) {
        this.marca = marca;
        this.mes = mes;
        this.anyo = anyo;
        p = new Partitura("Desconocido", "Desconocido");
        int num = (int) (Math.random() * (100 - 10 + 1) + 10);
        for (int i = 0; i < num; i++) {
            String nota = notaAleatoria();
            int num2 = (int) (Math.random() * (5) + 1);
            p.addNotas(new Nota(nota, num2));
        }
    }

    public boolean aniadirNota() {
        return p.addNotas(new Nota(notaAleatoria(), (int) (Math.random() * (5) + 1)));
    }

    public Partitura getP() {
        return p;
    }

    private String notaAleatoria() {//Meto propio para generar una nota aleatoria
        String nota = "";
        int aleaNota = (int) (Math.random() * (7) + 1);
        switch (aleaNota) {
            case 1:
                nota = "RE";
                break;
            case 2:
                nota = "MI";
                break;
            case 3:
                nota = "FA";
                break;
            case 4:
                nota = "SOL";
                break;
            case 5:
                nota = "LA";
                break;
            case 6:
                nota = "SI";
                break;
            default:
                nota = "DO";
        }
        return nota;
    }

    public abstract String tocarPartitura();

    public abstract void pararDeTocar();
}
