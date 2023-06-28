package thuat_toan_sap_xep;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        for(int n = 0; n < arr.length;n++){
            int index = findMin(arr,n);
            swap(arr,n,index);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int findMin(int[] arr, int index){
        int min = index;
        for(int i = index; i < arr.length; i++){
            if(arr[min]>arr[i]){
               min = i;
            }
        }
        return min;
    }
    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    public static void main(String[] args) {
        int[] arr1 = {1,4,2,5,7,3};
       selectionSort(arr1);
    }
}
