package Clase;

import java.util.Scanner;

/*
Copiar en un String un bloque de wikipedia.
a)Sacar por pantalla el numero de letras
b)Pedir dos valores por teclado(enteros positivos). Sacar por pantalla la subcadena
que va desde el menor al mayor.
c)Contar el numero de palabras(Suponemos que todas las palabras estan separadas por
espacio)
d)Contrar el numero de lineas(/n)
e)Quitar la ultima palabra y engancharla al principio
 */
public class E1Clase {

    public static void main(String[] args) {
        String texto = "El Real Madrid Club de Fútbol, más conocido simplemente"
                + " como Real Madrid, es una entidad polideportiva con sede en"
                + " Madrid, España.\n" + "Fue oficialmente registrada como club de "
                + "fútbol por sus socios el 6 de marzo de 1902 con el objeto de "
                + "la práctica y desarrollo de este deporte —si bien sus"
                + " orígenes datan del año 1900,7​ y su denominación de "
                + "(Sociedad) Madrid Foot-ball Club de octubre de 1901—, siendo "
                + "el quinto club fundado en la capital.\nTuvo a Julián "
                + "Palacios y los hermanos Juan Padrós y Carlos Padrós como "
                + "principales valedores de su creación.​\nIdentificado por su "
                + "color blanco —del que recibe el apelativo de «blancos» o "
                + "«merengues»—,1​2​ es uno de los cuatro clubes profesionales de "
                + "fútbol del país cuya entidad jurídica no es la de sociedad "
                + "anónima deportiva (S. A. D.)\nya que su propiedad recae "
                + "en sus más de 90 000 socios. Otra salvedad comparte con el "
                + "Athletic Club y el Fútbol Club Barcelona al participar sin "
                + "interrupción en la máxima categoría de la Liga Nacional de "
                + "Fútbol Profesional, la Primera División de España, desde su"
                + " establecimiento en 1929.​";
        //Apartado A)
        String cadena = texto.replace(" ", "");
        System.out.println(cadena.split("").length);

        //Apartado B)
        int mayor = 0, menor = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            do {
                System.out.print("Introduzca el numero mayor: ");
                mayor = teclado.nextInt();
            } while (mayor < 0);
            do {
                System.out.print("Introduzca el numero menor: ");
                menor = teclado.nextInt();
            } while (menor < 0);
        } while (mayor < menor && mayor <= texto.length());

        System.out.println(texto.substring(menor, mayor));

        //Apartado C)
        System.out.println(texto.split(" ").length);

        //Apartado D)
        System.out.println(texto.split("/n").length);

        //Apartado E)
        String[] textoSpliteado = texto.split(" ");
        String cadenaFinal = textoSpliteado[textoSpliteado.length - 1];
        String textoFinal = "";
        for (int i = textoSpliteado.length - 1; i > 0; i--) {
            textoFinal = textoSpliteado[i - 1] + texto;
        }
        textoFinal = cadenaFinal + textoFinal;
        System.out.println(textoFinal);

    }
}
