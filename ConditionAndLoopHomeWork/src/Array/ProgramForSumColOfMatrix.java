package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ProgramForSumColOfMatrix {
    public static void main(String[] args) {
//        int[][] myArray = {{2,6,8,7},
//                            {8,5,9,6},
//                            {9,1,5,6}};
        Scanner scanner = new Scanner(System.in);
       int size1,size2;
        System.out.println("Input row");
        size1 = scanner.nextInt();
        System.out.println("Input col");
        size2 = scanner.nextInt();

        int[][]myArray =new int[size1][size2];
        for(int l = 0; l <size1;l++){
            for (int k = 0; k < size2; k++){
                System.out.println("Input number ["+l+"]"+"["+k+"]");
                myArray[l][k]=scanner.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(myArray));
        int sum = 0;
        for (int i = 0; i < myArray.length; i++){

//             for (int j = 0; j < myArray[i].length;j++){

                sum += myArray[i][2];
//             }
        }
        System.out.println(sum);
    }
}
