

package Tema_4.ArrayUnidimensional;

import java.util.Scanner;

/*
Haz un programa que dado un array valores que posea una serie
de números pej 2,4,6,8,1,3,5,7, y un numero que se pida por teclado, 
indique si ese número está en el array o no lo está
*/
/**
 *
 * @author Pablo Calvente
 */
public class Ejercicio54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] valores = {2,4,6,8,1,3,5,7};
        Scanner t = new Scanner(System.in);
        int valor = 0;
        boolean encontrado =false;
        System.out.print("Introduzca un numero para comprobar que este en la lista de valores: ");
        valor = t.nextInt();
        for(int i = 0; i<valores.length && !encontrado;i++){
            if(valores[i] == valor){
                encontrado = true;
            }
        }
        
        if (encontrado) {
            System.out.println("EL numero ha sido encontrado");
        }else{
            System.out.println("El numero no ha sido encontrado");   
        }
    }

}
