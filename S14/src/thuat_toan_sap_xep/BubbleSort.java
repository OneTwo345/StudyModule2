package thuat_toan_sap_xep;

import java.util.Arrays;

public class BubbleSort {
    public static void  bubbleSort(int[] arr){
        for(int n = 1; n < arr.length; n++){
            for(int i = 0; i < arr.length - n; i++){
                if(arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr,int i, int j){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;

    }

    public static void main(String[] args) {
        int[] arr1 = {1,4,2,5,7,3};
        bubbleSort(arr1);
    }
}
