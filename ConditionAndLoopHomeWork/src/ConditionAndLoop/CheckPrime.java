package ConditionAndLoop;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number you want to check?");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println(number + " is the not prime");
        }
        if (number == 2) {
            System.out.println(" 2 is the prime");
        }

        for (int i = 2; i <= (number / 2); i++) {
            if (number % i == 0) {
                System.out.println(number + " is not the prime");
                return;
            }
        }
        System.out.println(number + " is the prime");

    }
}
