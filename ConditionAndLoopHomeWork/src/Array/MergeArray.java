package Array;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr1 = new int[5];
        int[] arr2 = new int[6];
        for (int i = 0; i < arr1.length ; i++) {
            System.out.println("Input element into arr1 ");
            arr1[i] = scanner.nextByte();
        }
        for (int j = 0; j < arr2.length; j++) {
            System.out.println("Input element into arr2 ");
            arr2[j] = scanner.nextByte();
        }
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int l = 0; l < arr1.length; l++) {
            arr3[l] = arr1[l];
            System.out.print(arr3[l]+ " ");
        }
        for (int k = arr1.length; k < arr3.length; k++) {
            arr3[k] = arr2[k - arr1.length];
            System.out.print(arr3[k]+ " ");
        }
    }
}
