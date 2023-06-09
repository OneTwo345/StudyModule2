package Array;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementInArray {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 4, 5, 8};
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Input your number you want to delete");
        number = scanner.nextInt();
        for (int i = 0; i < myArray.length; i++){
            if (number == myArray[i]){
               for (int j = i; j < myArray.length -1; j++){
                   myArray[j]=myArray[j+1];
               }
               myArray[myArray.length-1]=0;
            }
        }
        System.out.println(Arrays.toString(myArray));
    }
}
