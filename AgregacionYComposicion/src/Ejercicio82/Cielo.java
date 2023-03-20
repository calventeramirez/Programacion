package Ejercicio82;

/**
 *
 * @author usuario
 */
public class Cielo {

    private int n, m;
    private Estrella[][] cielo;

    public Cielo(int n, int m) {
        this.n = n;
        this.m = m;
        cielo = new Estrella[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                this.cielo[i][j] = null;
            }
        }

    }

    public void ponerEstrellas(int numEstrella) {
        if (numEstrella > (cielo.length * cielo[0].length)) {
            System.out.println("ERROR NO SE PUEDE HACER UN CIELO CON TANTAS ESTRELLAS");
        } else {
            for (int i = 0; i < numEstrella; i++) {
                int aleax, aleay;
                do{
                    aleax = (int)(Math.random()*cielo.length);
                    aleay= (int)(Math.random()*cielo[0].length);
                }while(cielo[aleax][aleay] != null);
                
                cielo[aleax][aleay] = new Estrella(aleax, aleay);
                
            }
        }

    }

    @Override
    public String toString() {
        String res = "";
        res += "Cielo estrellado";
        res += "\n";
        for (int i = 0; i < cielo.length; i++) {
            for (int j = 0; j < cielo[i].length; j++) {
                if(cielo[i][j] == null){
                    res += " ";
                }else{
                    res += cielo[i][j] + " ";
                }
                
            }

            res += "\n";
        }
        return res;
    }
}
