package Array;

import java.util.Scanner;

public class AddElementInArray {
    public static void main(String[] args) {
        int[] myArrays = {1, 3, 5, 7, 9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number you want to add");
        int number;
        number = scanner.nextInt();
        System.out.println("Input index you want to add");
        int index = scanner.nextInt();
        insertNumberIntoArray(myArrays, index, number);
        for (int i = 0; i < insertNumberIntoArray(myArrays, index, number).length;i++){
            System.out.print(insertNumberIntoArray(myArrays, index, number)[i]);
        }
    }


    public static int[] insertNumberIntoArray(int[] arr, int index, int number) {
        int[] newArray = new int[arr.length + 1];
        if (index <= -1 || index > arr.length - 1) {
            System.out.println("Can't input that position");
        }
        for (int i = 0; i < index; i++) {
            newArray[i] = arr[i];

        }
        newArray[index] = number;
        for (int j = index + 1; j < newArray.length; j++) {
            newArray[j] = arr[j - 1];
        }
        return newArray;
    }

}