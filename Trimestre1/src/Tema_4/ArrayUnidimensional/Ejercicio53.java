package Tema_4.ArrayUnidimensional;

/*
Haz   un   programa   que   dado   el   array  valores  que   posee   
los   números 2,4,6,8,1,3,5,7 genere otro array con los mismos valores 
pero con  el valor 200 en la posición 4 y el valor 300 en la posición 7 
(y el resto de valores afectados desplazados una posición).
Valores: 2 4 6 8 1 3 5 7 
Otra: 2 4 6 200 8 1 300 3 5 7
 */
/**
 *
 * @author Pablo Calvente
 */
public class Ejercicio53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int N = 10;
        int[] arrayOriginal = {2, 4, 6, 8, 1, 3, 5, 7}, arrayFinal = new int[N];
        int cont = 0;

       /* for (int i = 0; i < N; i++) {
            if (i == 3) {
                arrayFinal[i] = 200;
            } else if (i == 6) {
                arrayFinal[i] = 300;
            } else {
                arrayFinal[i] = arrayOriginal[cont];
                cont++;
            }
        }*/
       arrayFinal[3] = 200;
       arrayFinal[6] = 300;
       for(int i = 0; i<arrayFinal.length;i++){
           if(i!=3 && i!=6){
               arrayFinal[i]=arrayOriginal[cont];
               cont++;
           }
       }
        System.out.print("Valores: " );
        for (int i = 0; i < arrayOriginal.length; i++) {
            System.out.print(arrayOriginal[i]+" ");
        }
        
        System.out.print ("\nOtra: ");
        for (int i = 0; i < arrayFinal.length; i++) {
            System.out.print(arrayFinal[i]+" ");
        }
    }

}
