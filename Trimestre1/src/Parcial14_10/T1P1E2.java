package Parcial14_10;

import java.util.Scanner;
//Autor: Pablo Jesús Calvente Ramírez
public class T1P1E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota1 = 0, nota2 = 0, nota3 = 0, mediaSinDecimales = 0;
        double mediaConDecimales = 0.0;
        String nota = "";
        System.out.print("Introduzca la primera nota: ");
        nota1 = teclado.nextInt();
        System.out.print("Introduzca la segunda nota: ");
        nota2 = teclado.nextInt();
        System.out.print("Introduzca la tercera nota: ");
        nota3 = teclado.nextInt();
        teclado.close();
        
        /*Correción
        bolean error=false;
        if (nota1 < 0 || nota1 >=10) {
            System.out.println("ERROR. La primera nota no es correcta.");
        error=true;
        } 
        if (nota2 <0 || nota2>= 10) {
            System.out.println("ERROR. La segunda nota no es correcta.");
        error=true;
        }
        if (nota3 < 0|| nota3>=10) {
            System.out.println("ERROR. La tercera nota no es correcta.");
        error=true;
        if(!error){
         //codigo media
        }
        */

        if (nota1 < 0) {
            System.out.println("ERROR. La primera nota no es correcta.");
        } else if (nota2 < 0) {
            System.out.println("ERROR. La segunda nota no es correcta.");
        } else if (nota3 < 0) {
            System.out.println("ERROR. La tercera nota no es correcta.");
        } else {
            mediaConDecimales = (nota1 + nota2 + nota3) / 3;
            mediaSinDecimales = (int) Math.round(mediaConDecimales);
            if (mediaSinDecimales >= 0 && mediaSinDecimales <= 4) {
                nota = "INSUFICIENTE";
            } else if (mediaSinDecimales == 5 || mediaSinDecimales == 6) {
                nota = "SUFICIENTE";
            } else if (mediaSinDecimales == 7 || mediaSinDecimales == 8) {
                nota = "NOTABLE";
            } else {
                nota = "SOBRESALIENTE";
            }
            
            /*Corrección
            
            if (mediaSinDecimales <= 4) {
                nota = "INSUFICIENTE";
            } else if (mediaSinDecimales <= 6) {
                nota = "SUFICIENTE";
            } else if (mediaSinDecimales <= 8) {
                nota = "NOTABLE";
            } else {
                nota = "SOBRESALIENTE";
            }
            */
            
            System.out.println("La media es " + nota);
            
            
        }
    }

}
