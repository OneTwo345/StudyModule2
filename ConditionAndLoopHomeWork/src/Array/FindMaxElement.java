package Array;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxElement {
    public static void main(String[] args) {
        int size;
        int[] numberArray;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array.length under 8");
        size = scanner.nextInt();
        while (size > 8) {
            System.out.println("Input array.length under 8");
            size = scanner.nextInt();
        }
        numberArray = new int[size];
        for (int i = 0; i < numberArray.length; i++) {
            System.out.println("Input array element");
            numberArray[i] = scanner.nextInt();

        }
        System.out.println(Arrays.toString(numberArray));
        int max = 0;
        for (int j = 0; j < numberArray.length; j++) {
            if (numberArray[max] < numberArray[j]) {
                max = j;
            }

        }
        System.out.println("The max number is: " + numberArray[max] + " on position " + max);


    }
}
