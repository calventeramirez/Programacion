package Ejercicio96;

/**
 *
 * @author usuario
 */
public class RobotCombate extends Robot{
    private int armadura;
    private boolean estadoArmadura;//true funcionando, false destruida
    private String arma;
    
    public RobotCombate(int aguante, int velocidad, int potencia, int armadura, String arma){
        super(aguante, velocidad, potencia);
        this.armadura = armadura;
        this.estadoArmadura = armadura != 0;
        this.arma = arma;
    }
    
    
    
    @Override;
    public void combatir(Robot r) {
        
    }

    @Override
    public void mostrar() {
        System.out.println("Aguante: "+super.aguante);
        System.out.println("Velocidad: "+super.velocidad);
        System.out.println("Potencia: "+super.potencia);
        System.out.println("Armadura: "+armadura);
        System.out.print("Estado de la armadura: ");
        if(estadoArmadura){
            System.out.println("Funcionando");
        }else{
            System.out.println("Caida");
        }
        System.out.println("Arma: "+arma);
    }
    
}
