package Array;

import java.util.Scanner;

public class FindMinimum {
    public static void main(String[] args) {

        int[] myArray = {1, 3, 5, 9, 6, 9};
        int index = minValue(myArray);
        System.out.println("The smallest element in the array is: " + myArray[index]);

    }

    public static int minValue(int[] arr) {
        int min = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[min] > arr[i]) {
                min = i;
            }


        }
        return min;


    }
}
