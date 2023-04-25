package src.general;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el título aquí");
        String titulo = sc.nextLine();

        System.out.println("Ingresa el autor aqui");
        String autor = sc.nextLine();
        System.out.println( titulo + " escrito por el autor " + autor);


    }
}
