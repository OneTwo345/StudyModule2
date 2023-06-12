package Array;

public class MatrixCheo {
    public static void main(String[] args) {
        int[][] myArray = {{2,6,8,7},
                            {8,5,9,6},
                            {8,5,4,6},
                            {9,1,5,6}};
        int sum = 0;
        for (int i = 0; i <myArray.length; i++){
            for(int j=0; j < myArray[i].length;j++){
                if (i == j){
                    sum+= myArray[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
