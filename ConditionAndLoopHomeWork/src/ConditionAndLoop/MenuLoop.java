package ConditionAndLoop;

import java.util.Scanner;

public class MenuLoop {

    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the rectangle");
        System.out.println("2. Draw the bot triangle");
        System.out.println("3. Draw the top triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Input the height");
                int height = input.nextInt();
                System.out.println("Input the width");
                int width = input.nextInt();
                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < width; j++) {
                        System.out.print("*");
                    }
                    ;
                    System.out.println(" ");
                }
                break;
            case 2:
                System.out.println("Input your width");
                int number = input.nextInt();
                System.out.println("Input your star");
                int star = input.nextInt();

                for (int i = 0; i < number; i++) {

                    for (int j = 0; j < star; j++) {
                        if (j <= i) {
                            System.out.print(" * ");
                        }
                    }
                    System.out.println(" ");
                };
            case 3:
                System.out.println("Input your width");
                int number1 = input.nextInt();
                System.out.println("Input your star");
                int star1 = input.nextInt();

                for (int l = number1; l >= 0; l--) {

                    for (int m = star1; m > 0; m--) {
                        if (m <= l) {
                            System.out.print("*");
                        }
                    }
                    System.out.println(" ");
                }
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
    }

}