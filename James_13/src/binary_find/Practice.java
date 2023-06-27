package binary_find;

public class Practice {
    public static int findNumbers(int[] arr, int number, int left, int right) {
        if (right >= left) {

            int mid = left + (right - left) / 2;
            if (arr[mid] == number){
                return mid;
            }
            if (arr[mid] > number) {
               return findNumbers(arr, number, left, mid - 1);
            } else if (mid < number) {
               return findNumbers(arr, number, mid + 1, right);
            }


        }
        return -1;
    }
}
