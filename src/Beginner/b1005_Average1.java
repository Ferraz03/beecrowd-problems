package Beginner;

import java.util.Scanner;

public class b1005_Average1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double notaA = sc.nextDouble();
        double notaB = sc.nextDouble();

        double pesoA = 3.5;
        double pesoB = 7.5;

        double somaPesos = pesoA + pesoB;
        double MEDIA = (notaA * pesoA + notaB * pesoB) / somaPesos;

        System.out.printf("MEDIA = %.5f" , MEDIA);

        sc.close();
    }
}
