package De_thi_module_2;

import java.util.*;

public class Test {
//    Ban co 2 danh sach luu tru cac so duong. Tinh tong con so theo chieu dao nguoc;
//    Vd: [2],[4],[3] va [5],[6],[4]. 342 + 465 = 870

//    public static int tong(int[]a,int[]b){
//        Stack<Integer> tong = new Stack<>();
//        for(int i = 0; i < a.length; i++){
//            tong.push(a[i]);
//        }
//        int c = tong.pop();
//        for(int j = 0; j < b.length; j++){
//            tong.push(b[j]);
//        }
//        int d = tong.pop();
//        return c+d;
//
//    }

    public static void main(String[] args) {
        int[] a = {3,4,2};
        int[] b = {4,6,5};
        int numA = 0;
        int numB = 0;
        int size = a.length;
       int[] c = new int[a.length];
       int[] d = new int[a.length];
       Stack<Integer> stackTong = new Stack<>();
      for(int i = 0; i < a.length;i++){
          stackTong.push(a[i]);
      }
        System.out.println(stackTong);
      for(int j = 0; j<size;j++){
          c[j] = stackTong.pop();
      }
        System.out.println(Arrays.toString(c));
        for(int l = 0; l < size;l++){
            stackTong.push(b[l]);
        }

        for(int m = 0; m<size;m++){
            d[m] = stackTong.pop();
        }
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));
        for(int o = 0; o < size;o++){
            numA += (c[o]*Math.pow(10,o));
        }
        System.out.println(numA);

        for(int k = 0; k < size;k++){
            numB += (d[k]*Math.pow(10,k));
        }
        System.out.println(numB);
        int result = 0;
        result = numA + numB;
        System.out.println(result);



    }

}
