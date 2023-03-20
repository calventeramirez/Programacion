
package Ejercicio83;


public class testRevolver{
    public static void main(String[] args) {
        Revolver revWin = new Revolver("Winchester", "1883", 6);
        
        System.out.println(revWin);
        for(int i = 1; i<26; i++){
            System.out.println(revWin.disparar());
        }
        System.out.println(revWin);
        
    }
}
