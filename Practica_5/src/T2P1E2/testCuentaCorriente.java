package T2P1E2;

public class testCuentaCorriente {

    public static void main(String[] args) {
        CuentaCorriente c1 = new CuentaCorriente("Jaime Hormiga", "23567897F");
        c1.setLimiteDescubierto(-50);
        System.out.println(c1.ingresar(1000));
        System.out.println(c1.sacarDinero(300));

        System.out.println(c1);

        System.out.println(c1.sacarDinero(700));
        System.out.println(c1.sacarDinero(200));

        CuentaCorriente c2 = new CuentaCorriente(9000);
        c2 = new CuentaCorriente(c1);

        System.out.println(c2.sacarDinero(500));
        System.out.println(c2);   

    }
}
