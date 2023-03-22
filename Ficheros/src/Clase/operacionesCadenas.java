package Clase;

public class operacionesCadenas {

    public static void main(String[] args) {
        String texto = "Hoy es el cumple del señor Don Fernando, cumple, cumple";
        String res = texto + ". Cumple 18.";

        char cara = texto.charAt(0);
        System.out.println(cara);
        System.out.println("La longitud de la cadena es: " + texto.length());
        System.out.println("El primer y el ultimo caracter: " + texto.charAt(0) + " y " + texto.charAt(texto.length() - 1));
        System.out.println(texto.indexOf("ñ"));//ME dice la primera posicion del caracter que yo ponga
        System.out.println(texto.lastIndexOf("ñ"));//Ultima posicion del caracter
        System.out.println(texto.toLowerCase().indexOf("cUmple".toLowerCase()));//Para comprobar si existe la palabra

        System.out.println(texto.substring(4));//Saca desde el indice, incluido este, hasta el final
        System.out.println(texto.substring(4, 14));//saca desde el indice, incluido este, hasta el final sin incluirlo
        System.out.println(texto.substring(texto.indexOf("e"), texto.lastIndexOf("e")));

        System.out.println(texto.replace("e", "*"));
        System.out.println(texto.replaceAll("cumple", "***"));

        String[] salida = texto.split(" ");
        for (int i = 0; i < salida.length; i++) {
            System.out.print(salida[i] + " ");
        }
        System.out.println("");
        
        String ruta = "C:/Descargas/NomiresMama/LittlePonny.mkv.exe.zip.rar";
        String[] sal = ruta.split("/");
        System.out.println(sal[sal.length-1]);//Saco el nombre del fichero
        String[] sal2 = ruta.split("\\.");
        System.out.println(sal2[sal2.length-1]);//Saco el ultimo punto para ver la extension
        
        String cadena = sal[sal.length-1];
        System.out.println(cadena.substring(cadena.lastIndexOf(".")+1));//Igual que la anteriro pero sin usar el split con el . ya que es raro sacarlo asi
        texto.trim();//Quita tanto el espacio en la`posicion 0 y el espacion de la posicion final
    }
}
