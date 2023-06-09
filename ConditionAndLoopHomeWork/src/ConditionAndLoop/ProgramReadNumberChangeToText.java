package ConditionAndLoop;

import java.util.Scanner;

public class ProgramReadNumberChangeToText {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number you want to read?");
        number = scanner.nextInt();
        if (number < 0 || number > 999) {
            System.out.println("Out of ability");
            return;
        }
        String result = "";

        if (number <= 10) {
            switch (number) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                case 10:
                    System.out.println("ten");
                    break;
//                case 11:
//                    System.out.println("eleven");
//                    break;
//                case 12:
//                    System.out.println("twelve");
//                    break;
//                case 13:
//                    System.out.println("thirteen");
//                    break;
//                case 14:
//                    System.out.println("fourteen");
//                    break;
//                case 15:
//                    System.out.println("fifteen");
//                    break;
            }
        } else if (number < 20) {
            switch (number - 10){
                case 6,7,8,9:
            }

        }


    }
}
