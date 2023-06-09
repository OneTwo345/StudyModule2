package Array;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElementIntoArray {
    public static void main(String[] args) {
        int[] myArray = {1,3,5,7,9};
      int[] mainArray = insertElement(myArray,4,2);
        System.out.print(Arrays.toString(mainArray));

    }
    public static int[] insertElement(int[] arr, int number,int index){
        int[] newArray = new int[arr.length +1];
        for (int i = 0; i < arr.length; i++){
            if (index == i){
                for (int j = 0; j < index; j++){
                    newArray[j] = arr[j];
                }
                newArray[index]=number;
                for (int k = index + 1 ; k< newArray.length;k++){
                    newArray[k] = arr[k-1];
                }

            }
        }
        return newArray;
    }
}
