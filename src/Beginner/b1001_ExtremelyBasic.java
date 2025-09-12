package Beginner;
import java.util.Scanner;
public class b1001_ExtremelyBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int soma = n1 + n2;

        System.out.println("X = " + soma);

        sc.close();
    }
}
