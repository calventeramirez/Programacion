package Clase10_03;


public class e3 {

    public static void main(String[] args) {
        int[] lista = new int[5];

        for (int i = 0; i <= lista.length; i++) {
            try{
                lista[i] = -1;
            }catch(Exception e){
                System.err.println("El indice "+i+" no existe");
            }
        }

        for (int i = 0; i < lista.length; i++) {
            System.out.println("Cajon " + i + ": " + lista[i]);
        }
    }
}
