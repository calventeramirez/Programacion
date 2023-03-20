package Retos;

public class FizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.print("fizzbuzz ");
            } else if (i % 5 == 0) {
                System.out.print("buzz ");
            } else if (i % 3 == 0) {
                System.out.print("fizz ");
            } else {
                System.out.print(i + " ");
            }
            //Divisible entre 10 para tener mejor visibilidad en pantalla
            if(i%10==0){
                System.out.println("");
            }
        }
    }

}
