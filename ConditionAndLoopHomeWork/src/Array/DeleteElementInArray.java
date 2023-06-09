package Array;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] myArray = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        int number;
        System.out.println("Input the number you want to check");
        number = scanner.nextInt();
        int[] newArray = removeElement(myArray, number);
        if(newArray.length ==0) {
            System.out.println("The " + number +" are not in array");
        } else {
            System.out.println(Arrays.toString(newArray));
        }
//        System.out.println("NewArray is: " + removeElement(myArray,number));

    }
    public static int[] removeElement(int[] arr, int number) {

        int[] newArr = new int[arr.length];
        boolean checkElement = false;

        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                checkElement = true;
                for(int j = i; j < arr.length -1; j++) {
                    System.out.println(j);
                    arr[j] = arr[j + 1];
                }
            }
        }
        if (checkElement == false) {
            return new int[0];
        } else {
            return arr;
        }

    }


}
