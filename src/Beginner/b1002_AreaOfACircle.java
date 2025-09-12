package Beginner;
import java.util.Scanner;

public class b1002_AreaOfACircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();
        double n = 3.14159;
        double a = n * Math.pow(r,2);

        System.out.printf("A=%.4f%n",a);

        sc.close();
    }
}
