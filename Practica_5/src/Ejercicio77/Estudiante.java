package Ejercicio77;

/**
 *
 * @author usuario
 */
public class Estudiante {

    private String nombre, apellidos;
    private double[] calificaciones;

    public Estudiante(String nombre, String apellidos, int tamano) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        calificaciones = new double[tamano];

        for (int i = 0; i < tamano; i++) {
            calificaciones[i] = -1;
        }
    }

    public boolean InsertarNota(double nota) {
        boolean metida = false;
        for (int i = 0; i < calificaciones.length; i++) {
            if (calificaciones[i] == -1) {
                calificaciones[i] = nota;
                i = calificaciones.length;
                metida = true;
            }
        }
        return metida;
    }

    public String MostrarNotas() {
        String salida = "";
        salida += "Notas: ";
        for (int i = 0; i < calificaciones.length - 1; i++) {
            if (calificaciones[i] != -1) {
                salida += calificaciones[i] + ", ";
            } else {
                salida += "No hay nota, ";
            }
        }
        if (calificaciones[calificaciones.length - 1] != -1) {
            salida += calificaciones[calificaciones.length - 1] + ".";
        } else {
            salida += "No hay nota.";
        }
        return salida;
    }

    public double CalularMedia() {
        double suma = 0.0;
        int cont = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            if (calificaciones[i] == -1) {
                i = calificaciones.length;
            } else {
                suma += calificaciones[i];
                cont++;
            }
        }

        if (cont > 0) {
            return suma / cont;
        } else {
            return 0.0;
        }
    }

    public int[] IndicarRangos() {
        int[] salida = {0, 0, 0, 0};
        for (int i = 0; i < calificaciones.length; i++) {
            if (calificaciones[i] == -1) {
                i = calificaciones.length;
            } else if (calificaciones[i] > -1 && calificaciones[i] < 5) {
                salida[0]++;
            } else if (calificaciones[i] < 7) {
                salida[1]++;
            } else if (calificaciones[i] < 9) {
                salida[2]++;
            } else if (calificaciones[i] < 11) {
                salida[3]++;
            }
        }
        return salida;
    }

    @Override
    public String toString() {
        String salida = "";
        int[] rangos = IndicarRangos();
        salida += "Estudiante: " + nombre + " " + apellidos;
        salida += "\n" + MostrarNotas();
        salida += "\nRangos: ";
        salida += "Suspenso: " + rangos[0];
        salida += ", Aprobado: " + rangos[1];
        salida += ", Notables: " + rangos[2];
        salida += ", Sobresaliente: " + rangos[3] + ".";
        salida += "\nMedia: " + CalularMedia();
        return salida;
    }
}
