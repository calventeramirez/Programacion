package Ejercicio92;

/**
 *
 * @author usuario
 */
public class ProfesorUniversidad extends Profesor {

    private boolean puedeInvestigar, estaInvestigando;
    private double numHorasInvestiga;

    public ProfesorUniversidad(String nombre, int numAsigTotales, double numHorasInvestigar) {
        super(nombre, numAsigTotales);
        if (numHorasTotales >= 8) {
            this.puedeInvestigar = true;
            this.numHorasInvestiga = numHorasInvestigar;
        } else {
            this.puedeInvestigar = false;
            this.numHorasInvestiga = 0;
        }
        estaInvestigando = false;
    }

    public void investigar() {
        if (puedeInvestigar && !estaInvestigando && !super.darClase) {
            System.out.println(super.getNombre() + " esta investigando");
            estaInvestigando = true;
        } else {
            System.out.println(super.getNombre() + " no puede investigar");
        }
    }

    public void pararInvestigar() {
        if (estaInvestigando) {
            System.out.println(super.getNombre() + " ha dejado de investigar");
            estaInvestigando = false;
        } else {
            System.out.println(super.getNombre() + " no puede dejar de investigar");
        }
    }
    
    public void cogerAsignatura(Asignatura nueva){
        
    }
}
