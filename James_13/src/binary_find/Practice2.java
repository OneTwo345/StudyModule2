package binary_find;

public class Practice2 {
    public static int searchBinary(int[] arr, int left, int right, int target){

        if(right>= left){
            int mid = left + (right - left)/2;
            if (arr[mid] == target){
                return mid;
            } else if (arr[mid]>target) {
                return searchBinary(arr, left, mid-1, target);

            } else if (arr[mid] < target) {
                return searchBinary(arr, mid +1 , right, target);

            }

        }
        return -1;
    }
}
