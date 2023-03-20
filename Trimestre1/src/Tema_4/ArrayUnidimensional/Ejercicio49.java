package Tema_4.ArrayUnidimensional;

/*
Crea un array de 100 Crea un array de 100 elementos dónde cada elemento 
sea un número aleatorio entre 1 y 100. A continuación muestra por pantalla 
el mayor y el menor elemento de ese array.
*/

/**
 *
 * @author Pablo Calvente
 */
public class Ejercicio49 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int N = 100;
        int []array = new int [N];
        int mayor=0, menor = 100, alea=0;
        for(int i= 0; i<N; i++){
            alea = (int) (Math.random()*(100-1+1)+1);
            array[i] = alea;
            if(alea > mayor){
                mayor = alea;
            }
            if(alea < menor){
                menor = alea;
            }
        }
        
        System.out.println("El mayor es: "+ mayor);
        System.out.println("El menor es: "+ menor);
        
    }

}
