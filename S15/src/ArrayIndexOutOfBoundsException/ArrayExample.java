package ArrayIndexOutOfBoundsException;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom(){
        Random rd = new Random();
        Integer[] arr = new Integer[10];
        for (int i = 0; i < 10; i++){
            arr[i] = rd.nextInt(100);
            System.out.println(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arr = new ArrayExample();
        Integer[] arr1 = arr.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui long nhap so bat ki");
        int x =scanner.nextInt();
        try {
            System.out.println("Gia tri cua phan tu co chi so " + x + "la "+ arr1[x]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Chi so vuot qua gioi han cua mang");
        }


    }
}
