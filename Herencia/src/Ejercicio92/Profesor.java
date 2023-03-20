package Ejercicio92;

/**
 *
 * @author usuario
 */
public class Profesor {

    private String nombre;
    protected Asignatura[] asignaturas;
    protected double numHorasTotales;
    protected boolean darClase;

    public Profesor(String nombre, int numAsigTotales) {
        this.nombre = nombre;
        asignaturas = new Asignatura[numAsigTotales];
        numHorasTotales = 0;
        int numAsigImpartiendo = (int) ((Math.random() * numAsigTotales) + 1);
        for (int i = 0; i < numHorasTotales; i++) {
            double horaAsignatura = ((Math.random() * (8 - 3 + 1)) + 3);
            asignaturas[i] = new Asignatura((int) ((Math.random() * (200 - 100 + 1)) + 100), horaAsignatura);
            numHorasTotales += horaAsignatura;
        }
        darClase = false;
    }

    public void empezarClase() {
        if (!darClase) {
            darClase = true;
            System.out.println(nombre + "esta dando clase de " + asignaturas[(int) (Math.random() * (asignaturas.length))].getCodAsig());
        } else {
            System.out.println(nombre + "no  puede dar clase ya que esta dando clase");
        }
    }

    public void parar() {
        if (darClase) {
            darClase = false;
            System.out.println(nombre + " ha finalizado de dar clases");
        } else {
            System.out.println(nombre + " no esta dando clase conque no puede parar nada");
        }
    }

    @Override
    public String toString() {
        String res = "";
        res += "Nombre del profesor: " + nombre;
        for (int i = 0; i < asignaturas.length; i++) {
            if (asignaturas[i] != null) {
                res += super.toString() + "\n";
            } else {
                i = asignaturas.length;
            }
        }
        res += numHorasTotales;
        if (darClase) {
            res += "Esta dando clase";
        } else {
            res += "No esta dando clase";
        }
        return res;
    }
}
