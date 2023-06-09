package Array;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinimumOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input size of array");
        int size = scanner.nextInt();

        int[] myArray = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Input element " + i + " array");
            myArray[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(myArray));
        int min = 0;
        for (int j = 0; j < size; j++) {
            if (myArray[min] > myArray[j]) {
                min = j;
            }
        }
        System.out.println("The minimum number is " + myArray[min] + " in position " + min);
    }
}
