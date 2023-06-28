package BinaryPractice;

public class Binary {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,8,9,10};

        System.out.println(binarySearch(arr,1,arr.length,8));

    }

    public static int binarySearch(int arr[], int left, int right, int target) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
              return   binarySearch(arr, left, mid - 1, target);
            } else if (arr[mid] < target) {
              return   binarySearch(arr, mid + 1, right, target);
            }

        }
        return -1;
    }
}
