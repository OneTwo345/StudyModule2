package ConditionAndLoop;

import java.util.Scanner;

public class Show20PrimeNumber {
    public static void main(String[] args) {

        int count = 0;

        int number = 2;
        System.out.println("2 ");
        System.out.println("3 ");
        while (count < 18) {

            for (int i = 2; i < (Math.sqrt(number)); i++) {
                if (number % i == 0) {
                    break;
                } else {
                    System.out.println(number);
                    count++; break;
                }
            }
            number++;

            ;

        }
    }
}
