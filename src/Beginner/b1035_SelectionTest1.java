package Beginner;

import java.util.Scanner;

public class b1035_SelectionTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valorA = sc.nextInt();
        int valorB = sc.nextInt();
        int valorC = sc.nextInt();
        int valorD = sc.nextInt();

        int somaAB = valorA + valorB;
        int somaCD = valorC + valorD;

        if ((valorB > valorC)
                && (valorD > valorA)
                && (valorC > 0)
                && (valorD > 0)
                && (somaCD > somaAB)
                && (valorA % 2 == 0)) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }

        sc.close();
    }
}
