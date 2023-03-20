
package Clase10_03;

import java.util.Scanner;


public class e1{
    public static void main(String[] args) {
        int nume, deno;
        double res;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce numerador: ");
        nume = entrada.nextInt();
        System.out.println("Introduce denominador: ");
        deno = entrada.nextInt();
        
        try{
            res = nume/deno;
        }catch (Exception e){
            System.out.println("Error al dividir por 0");
            res = 0;
        }
        
        System.out.println(res);
       
    }
}
