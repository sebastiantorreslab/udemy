package tiendaLibros;

import java.util.Scanner;

public class Main {
    public  String hola(){
        return "Hola";
    }

    String hola = hola();

    public String getHola() {
        return hola;
    }

    public void setHola(String hola) {
        this.hola = hola;
    }

    public static void main(String[] args) {

        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        String hola = main.getHola();

        String nombre;
        int id;
        double precio;
        boolean envioGratis;

        System.out.println("Ingrese nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese un número de id: ");
        id = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el precio: ");
        precio = Integer.parseInt(sc.nextLine());
        System.out.println("Envio gratis: ");
        envioGratis = Boolean.parseBoolean((sc.nextLine()));

        System.out.println("\nTienda de libros\n");
        System.out.println("\nnombre del libro: " +  nombre);
        System.out.println("\nid del libro: " + id);
        System.out.println("\nprecio del libro " + precio);
        System.out.println("\nIncluye envío gratis: " + envioGratis);
    }

}
