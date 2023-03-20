
package Ejercicio72;

import java.util.Scanner;


public class main{
    public static void main(String[] args) {
       Persona p;
       Scanner t = new Scanner(System.in);
       
       String nombre, sexo,pais;
       int edad, saludo;
       
        System.out.print("Intrduzca el nombre: ");
        nombre = t.next();
        
        do{
            System.out.print("Introduzca la edad: ");
            edad = t.nextInt();
        }while(edad <= 0);
        
        do{
            System.out.print("Introduzca el sexo (M para masculinos y F para femeninos):");
            sexo = t.next();
        }while(!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F"));
        
        System.out.print("Introduzca el pais: ");
        pais = t.next();
        
        saludo = (int) (Math.random()*(3-1+1)+1);
        
        p = new Persona(nombre, sexo, pais, edad, saludo);
        
        System.out.println(p.saludar());
        System.out.println(p.esMayorEdad());
        p.mostrarDatos();
        System.out.println(p.toString());
    }
}
