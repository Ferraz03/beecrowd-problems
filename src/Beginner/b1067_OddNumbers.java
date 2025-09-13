package Beginner;

import java.util.Scanner;

public class b1067_OddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valorX = sc.nextInt();
        if (valorX >= 1 && valorX <= 1000){
            for (int i = 1; i <= valorX; i++){
                if (i % 2 == 1){
                    System.out.println(i);
                }
            }
        }
    }
}
