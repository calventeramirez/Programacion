package Vidoconsolas;

/*
 *Definir la clase videoconsola, y se necesita conocer  compañia, modelo(alfanumerico), generacion a la que 
 * pertence(entero), el bus de datos(8,16,32,64,128 o 256) y si esta en produccion o no.
 * Crear con Constructor con los parametros que creas convenientes y piensa (implementa) como hacer que si
 * no se mete un valor de los indicados en el bus de datos, se ponga por defecto 256
 */
public class Videoconsola {

    private String compania;
    private int generacion, busDatos;
    private boolean produccion;

    public Videoconsola(String compania, int generacion, int busDatos, boolean produccion) {
        this.compania = compania;
        this.generacion = generacion;
        if((busDatos!=8)&&(busDatos!=16)&&(busDatos!=32)&&(busDatos!=64)&&(busDatos!=128)){
            this.busDatos = 256;
        }else{
                this.busDatos = busDatos;
         }
        
        this.produccion = produccion;
    }
    
    public Videoconsola(String compania, int generacion, boolean produccion) {
        this.compania = compania;
        this.generacion = generacion;
        this.busDatos = 256;
        this.produccion = produccion;
    }
    
    
}
