
package Ejercicio70;

import java.util.Scanner;


public class main{
    public static void main(String[] args) {
        double base, altura;
        Scanner t = new Scanner(System.in);
        Rectangulo rectangulo;
        System.out.println("-----------------------------------------------------------------");
        System.out.print("Introduzca el valor de la base: ");
        base=t.nextDouble();
        System.out.print("Introduzca el valor de la altura: ");
        altura = t.nextDouble();
        rectangulo=new Rectangulo(base, altura);
        System.out.println("----------------------------------------------------------------");
        System.out.println("Rectángulo con base "+base+" y altura "+altura);
        System.out.println("Área: "+rectangulo.area(base, altura));
        System.out.println("Perímetro: "+rectangulo.perimetro(base, altura));
        System.out.println("----------------------------------------------------------------");
    }
}
