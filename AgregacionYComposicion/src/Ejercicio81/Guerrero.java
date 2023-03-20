package Ejercicio81;

/**
 *
 * @author usuario
 */
public class Guerrero {

    private String nombre;
    private int saludMax, saludActual, ataque, escudo, experienciaActual, siguienteNivel, nivel;
    private boolean muerto; //false ->vivo, true ->muerto
    private Arma arma;

    public Guerrero(String nombre, int saludTotal, int ataque, Arma arma, int escudo) {
        this.nombre = nombre;
        this.saludMax = saludTotal;
        saludActual = saludTotal;
        this.ataque = ataque;
        this.arma = arma;
        this.escudo = escudo;
        muerto = false;
        nivel = 1;
        experienciaActual = 0;
        siguienteNivel = (int) Math.ceil(nivel * 10 + nivel * 1.5);
    }

//Getters y setters
    public boolean isMuerto() {
        return muerto;
    }

    public int getSaludActual() {
        return saludActual;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getEscudo() {
        return escudo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setMuerto(boolean muerto) {
        this.muerto = muerto;
    }

    public void setSaludActual(int saludActual) {
        this.saludActual = saludActual;
    }

    //Metodos
    public void atacar(Guerrero antonio) {
        if (!muerto && !antonio.isMuerto()) {
            if (arma.getResistencia() > 0) {
                int hostia = ataque + arma.getPoder() - antonio.getEscudo();
                if (hostia < 0) {
                    hostia = 0;
                }
                antonio.setSaludActual(hostia);
                experienciaActual += 3;

                System.out.println(nombre + " ha atacado a " + antonio.getNombre() + " con el arma " + arma.getNombre());
                System.out.println("Daño: " + (ataque + arma.getPoder() - antonio.getEscudo()));
                arma.setResistencia(arma.getResistencia() - 1);
            } else {
                int hostia = ataque - antonio.getEscudo();
                if (hostia < 0) {
                    hostia = 0;
                }
                antonio.setSaludActual(hostia);
                experienciaActual += 5;

                System.out.println(nombre + " ha atacado a " + antonio.getNombre() + " con los puños");
                System.out.println("Daño: " + (ataque - antonio.getEscudo()));
                arma.setResistencia(arma.getResistencia() - 1);
            }
            subidaNivel();
            if (antonio.saludActual <= 0) {
                antonio.setMuerto(true);
                System.out.println(antonio.getNombre() + " ha muerto");
            }

        } else {
            if (!muerto) {
                System.out.println(antonio.getNombre() + " esta muerto no puedes atacar");
            } else if (!antonio.isMuerto()) {
                System.out.println(nombre + " esta muerto");
            } else {
                System.out.println("No puede atacar");
            }
        }

    }

    private boolean subir() {
        boolean sube = false;
        if (experienciaActual >= siguienteNivel) {
            sube = true;
        }
        return sube;
        //return experienciaActual >=siguienteNivel;
    }

    private void subidaNivel() {
        if (subir()) {
            nivel++;
            experienciaActual = 0;
            siguienteNivel = (int) Math.ceil(nivel * 10 + nivel * 1.5);
            ataque++;
            escudo++;
            saludMax += 10;
            System.out.println("Felicidades subio de nivel el guerrero");
        }
    }

    private void mejorarArma(String nombre) {
        if (arma.getNombre().equalsIgnoreCase(nombre)) {
            arma.SubirNivel();
        } else {
            System.out.println("El arma no se ha podido mejorar ya que no coincide con la equipada");
        }
    }

    //ToString
    @Override
    public String toString() {
        String res = "";
        res += "Guerrero: ";
        res += nombre;
        res += "\nSalud actual: ";
        if (saludActual <= 0) {
            res += "Muerto";
        } else {
            res += saludActual;
        }
        res += "\nAtaque: ";
        res += ataque;
        res += "\nPoder Defensa: ";
        res += escudo;
        res += "\n" + arma;
        return res;
    }
}
