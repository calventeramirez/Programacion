

package Tema_4.ArrayUnidimensional;
/*
Sea el array flags con los valores: 0,1,0,-1,0,-1,-1,-1,0,0,-1. Crea un
nuevo array llamado tivic que sea copia del anterior.
A continuación recorre el primer array (flags) y cambia todos 
los valores negativos por el valor 8.
*/
/**
 *
 * @author Pablo Calvente
 */
public class Ejercicio48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int []flags={0,1,0,-1,0,-1,-1,-1,0,0,-1}, tivic=new int[flags.length];
        for(int i = 0; i<flags.length; i++){
            tivic[i]=flags[i];
        }
        
        for (int i =0; i<flags.length; i++){
            if(flags[i]<0){
                flags[i] = 8;
            }
        }
        for (int i = 0; i<flags.length-1; i++){
            System.out.print(flags[i]+" ");
        }
        System.out.println(flags[flags.length-1]);
    }

}
