package laboratorioCaja;

public class Main {
    public static void main(String[] args) {

        Caja caja = new Caja();
        caja.setAlto(15);
        caja.setAncho(15);
        caja.setLargo(15);

        System.out.println("Volumen de caja: " + caja.volumen());

        Caja caja1 = new Caja(20,20,20);
        System.out.println("Volumen de caja1: " + caja1.volumen());



    }
}
