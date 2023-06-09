package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size;
        int[] myArray;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size");
        size = scanner.nextInt();
        while (size > 5) {
            System.out.println("Enter the size");
            size = scanner.nextInt();
        }
        ;
        myArray = new int[size];
        for (int o = 0; o < size; o++) {
            System.out.println(o + 1 + " Input the element: ");
            myArray[o] = scanner.nextInt();
        }

        int i = 0;
        int j = myArray.length - 1;
        int temp;
        for (; i < j; i++, j--) {
            temp = myArray[i];
            myArray[i] = myArray[j];
            myArray[j] = temp;
        }
        System.out.println("The answer is: ");
        System.out.println(Arrays.toString(myArray));


    }

}
