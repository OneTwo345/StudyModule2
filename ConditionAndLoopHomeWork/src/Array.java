public class Array {
    public static void main(String[] args) {
        int[] myArray = {1, 3, 5, 6, 7, 8};
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                System.out.println(myArray[i]);
            }
        }
    }
}
