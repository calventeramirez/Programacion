package Tema_4.ArrayBidimensional;

/*
Crea una matriz 4x4
a)rellenar de 20 todas las celdas
b)Rellenar de 10 la diagonal principal
c)mostrar la matriz y en el lugar del 20 sacar el 10 y viceversa
 */
public class matrizDiagonal {

    public static void main(String[] args) {
        final int N = 4;
        int[][] matriz = new int[N][N];
        //A)
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = 20;
            }
        }

        //B)
        for (int i = 0; i < N; i++) {
            matriz[i][i] = 10;
        }

        //C)
        for (int i = 0; i < N; i++) {
            System.out.print("[");
            for (int j = 0; j < N - 1; j++) {
                if (matriz[i][j] == 20) {
                    System.out.print("10, ");
                } else if (matriz[i][j] == 10) {
                    System.out.print("20 ");
                }
            }
            if (matriz[i][N - 1] == 20) {
                System.out.println("10]");
            } else if (matriz[i][N - 1] == 10) {
                System.out.println("20]");
            }
        }
    }
}
