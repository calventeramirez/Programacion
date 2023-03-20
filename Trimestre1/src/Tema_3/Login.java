package Tema_3;

import java.util.Scanner;

public class Login {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        String nick, pass;
        final int VECES = 3;
        int vez = 0;
        
        System.out.print("Introduzca el usuario ");
        nick = t.nextLine();
        //t.nextLine();
        System.out.print("Introduzca la contraseña ");
        pass = t.nextLine();
        //t.nextLine();

        while (vez < VECES && (!nick.equals("Albertoj36") || !pass.equals("medacAlberto"))) {
            vez++;
            System.out.print("Introduzca el usuario ");
            nick = t.nextLine();
            System.out.print("Introduzca la contraseña ");
            pass = t.nextLine();
        }
         if (vez < VECES){
             System.out.println("Bienvenido al sistema");
         }else{
             System.out.println("Error al meter las credenciales");
         }
       
    }

}
