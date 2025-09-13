package Beginner;

import java.util.Scanner;

public class b1007_Difference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valorA = sc.nextInt();
        int valorB = sc.nextInt();
        int valorC = sc.nextInt();
        int valorD = sc.nextInt();

        int produtoAB = valorA * valorB;
        int produtoCD = valorC * valorD;

        int diferenca = produtoAB - produtoCD;

        System.out.println("DIFERENCA = " + diferenca);

        sc.close();
    }
}
