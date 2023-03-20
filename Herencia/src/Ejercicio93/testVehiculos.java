package Ejercicio93;

/**
 *
 * @author usuario
 */
public class testVehiculos {

    public static void main(String[] args) {
        Vehiculo[] veh = new Vehiculo[8];

        veh[0] = new Coche("Rojo", 4, 180, 90);
        veh[1] = new Coche("Azul", 4, 160, 95);
        veh[2] = new Camioneta("Blanco", 4, 120, 90, 120000);
        veh[3] = new Camioneta("Naranja", 4, 140, 120, 125000);
        veh[4] = new Bicicleta("Amarillla", 2, true);
        veh[5] = new Bicicleta("Azul", 2, false);
        veh[6] = new Motocicleta("Negra", 3, true, 120, 90);
        veh[7] = new Motocicleta("Negra", 3, false, 150, 120);
        
        for(int i = 0; i<veh.length; i++){
            System.out.println(veh[i]);
        }
        
        
    }
}
