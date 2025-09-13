package Beginner;

import java.util.Scanner;

public class b1006_Average2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double notaA = sc.nextDouble();
        double notaB = sc.nextDouble();
        double notaC = sc.nextDouble();

        int pesoA = 2;
        int pesoB = 3;
        int pesoC = 5;

        int somaPesos = pesoA + pesoB + pesoC;

        double MEDIA = (notaA * pesoA + notaB * pesoB + notaC * pesoC) / (somaPesos);

        System.out.printf("MEDIA = %.1f", MEDIA);

        sc.close();
    }
}
