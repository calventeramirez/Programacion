package T3P1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Objects;

public class mainNumeroE {

    public static void main(String[] args) {

        //Variables
        String nombre = "Pablo Jesús Calvente"; //PON AQUI TU NOMBRE Y PRIMER APELLIDO

        Scanner entrada = new Scanner(System.in);
        int v1 = -100, v2 = -100; //valores que se piden al usuario
        int cociente = 0; //resultado de la division
        double raiz = 0; //resultado de la raiz cuadrada
        boolean salida = true;
        NumeroE n1 = null;
        NumeroE n2 = null;
        
        //Solicito el un valor y creo el primer número
        do {
            try {
                System.out.print("Introduce primer valor positivo: ");
                v1 = entrada.nextInt();
                salida = true;
            } catch (InputMismatchException e) {
                System.out.println("Error. Introduzca un valor numerico");
                entrada.nextLine();
                salida = false;
            }
        } while (!salida);

        //Solicito el otro valor y creo el segundo número
        do {
            try {
                System.out.print("Introduce segundo valor positivo: ");
                v2 = entrada.nextInt();
                salida = true;
            } catch (InputMismatchException e) {
                System.out.println("Error. Introduzca un valor numerico");
                entrada.nextLine();
                salida = false;
            }
        } while (!salida);
        
        //Creo los objetos
        try {
            n1 = new NumeroE(v1);
            n2 = new NumeroE(v2);
        } catch (NumeroError e) {
            System.out.println(e.getMessage());
        }

        //Realizo las operaciones
        try{
            cociente = n1.getNumero() / n2.getNumero();
        }catch(ArithmeticException e){
            System.out.println("Error al hacer el calculo numerico");
            cociente = 0;
        }catch(NullPointerException e){
            System.out.println("Error. No existe alguna de los numeros.");
            cociente = 0;
        }catch (Exception e){
            System.out.println("Error desconocido");
            cociente = 0;
        }
        
        
        try{
            raiz = Math.sqrt(n1.getNumero() - n2.getNumero());
        }catch(ArithmeticException e){
            System.out.println("Error al hacer el calculo numerico.");
            raiz = 0;
        }catch(NullPointerException e){
            System.out.println("Error. No existe alguna de los numeros.");
            raiz = 0;
        }catch (Exception e){
            System.out.println("Error desconocido");
            raiz = 0;
        }
        

        System.out.println("El cociente da como resultado: " + cociente);
        System.out.println("La raiz de la resta da como resultado: " + raiz);

        //Fin del programa
        //----------------------------------------------
        //Linea de comprobación: NO HACER CASO y NO TOCAR
        System.out.print("\n Codigo de chequeo de alumno: ");
        System.out.println(checkNumber(nombre, v1, v2));
        //----------------------------------------------

    }

    //NO HACER CASO y NO TOCAR
    public static int checkNumber(String n, int a, int b) {
        return Objects.hash(String.valueOf(n), Integer.valueOf(a), Integer.valueOf(b));
    }

}
