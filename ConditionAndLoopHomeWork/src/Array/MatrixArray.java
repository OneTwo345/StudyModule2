package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixArray {
    public static void main(String[] args) {
//        int[][] myArray = {{1,2,4},{9,5,6},{5,2,1}};
        Scanner scanner = new Scanner(System.in);
        int size1, size2;
        System.out.println("Input size 1");
        size1 = scanner.nextInt();
        System.out.println("Input size 2");
        size2 = scanner.nextInt();
        int[][] myArray = new int[size1][size2];
        for (int l = 0; l < size1; l++){
            for (int k = 0; k < size2; k++){
                System.out.println("Input element [" + l + "][" + k + "]:");
                myArray[l][k]=scanner.nextInt();
            }

        }
        System.out.println(Arrays.deepToString(myArray));
        int max = 0;
       int row = 0;
        int col = 0;
        for (int i = 0; i < myArray.length; i++){
         for( int j = 0; j < myArray[i].length; j++){
             if (myArray[i][j]>max){
                 max = myArray[i][j];
                 row = i;
                 col = j;
             }
         }
        }
        System.out.println("The max number is: " + max + " in position: ["+row+"]"+"["+ col+"]" );
    }
}
