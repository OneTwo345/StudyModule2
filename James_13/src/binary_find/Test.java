package binary_find;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] numbers = {1,5,6,8,9,11,12,17,18,21,25};


        System.out.println(FuntionSearch.binarySearch(numbers,0,11,6));
        System.out.println(Practice.findNumbers(numbers,6,0,11));
        System.out.println(Practice2.searchBinary(numbers,0,11,6));





    }
}
