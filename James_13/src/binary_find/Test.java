package binary_find;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] numbers = {1,5,7,6,9,7,10};
        int num = 9;
        int[] number1;
        number1 = Arrays.stream(numbers).sorted().toArray();
        System.out.println(Arrays.toString(number1));
        int low = 0;
        int mid;
        int hight = number1.length -1;
        while (hight>= low){
            mid  = (low + hight)/2;
            if( number1[mid] == num){
                System.out.println("Tim thay "+ num);

            }else if (
                    number1[mid]>num
            ){

            }

        }
    }
}
