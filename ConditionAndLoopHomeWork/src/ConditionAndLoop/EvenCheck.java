package ConditionAndLoop;

import java.util.Scanner;

public class EvenCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Input even number");

        do {
            number = scanner.nextInt();
            System.out.println("Please input even number");
        } while (number % 2 != 0);
    }
}
