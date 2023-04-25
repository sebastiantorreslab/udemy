package src.mayorNumero;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("INgresa el primer valor: ");
        int num1 = Integer.parseInt(sc.nextLine());

        System.out.println("INgresa el segundo valor: ");
        int num2 = Integer.parseInt(sc.nextLine());

       String resultadoo= num1 > num2?"El número " + num1+ " es mayor que " + num2 : "El número " +  num2 + " es mayor que " + num1;
        System.out.println(resultadoo);
    }
}
