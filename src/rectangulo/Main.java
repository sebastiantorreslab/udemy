package src.rectangulo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double alto;
        double ancho;

        System.out.println("Ingresa el alto del rectangulo :\n ");
        alto = Double.parseDouble(sc.nextLine());

        System.out.println("Ingresa el ancho del rectangulo :\n ");
        ancho = Double.parseDouble(sc.nextLine());

        System.out.println("\n el área del rectangulo es: " + alto*ancho);
        System.out.println("\n el perímetro del rectangulo es: " + (alto+ancho) * 2);




    }
}
