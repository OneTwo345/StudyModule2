public class Number {
    public static void main(String[] args) {
        int number = 36;
        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            arr[i] = i;
        }
        System.out.println(searchBinary(arr,0,number,number));
    }

    public static int searchBinary(int[] arr, int left, int right, int target) {

        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (arr[mid]*arr[mid] == target) {
                return mid;
            } else if (arr[mid]*arr[mid] > target) {
                return searchBinary(arr, left, mid - 1, target);

            } else if (arr[mid]*arr[mid] < target) {
                return searchBinary(arr, mid + 1, right, target);

            }

        }
        return -1;
    }
}