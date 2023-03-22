package T3P1;

public class NumeroE {

    int numero;

    public NumeroE(int num) {
        if (num < 0) {
            throw new NumeroError("Error no se puede crear un numero negativo");
        }

        this.numero = num;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int nuevo) {
        if (nuevo < 0) {
            throw new NumeroError("Error no se puede guardar un numero negativo");
        }

        this.numero = nuevo;
    }

    public String toString() {
        return this.numero + "";
    }
}
