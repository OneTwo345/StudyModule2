package merge_sort;

public class MyMergeSort {
    public int[] mergeSort(int a[], int left, int right) {
        //TH Dac biet va dieu kien dung:
        if (left > right)
            return new int[0];
        if (left == right){
            int[] singleElement = {a[left]};
            return singleElement;
        }
        //chia ra
        System.out.println("Chia: " + left + " - " + right);
        int k = (left + right)/2;
        int[] a1 = mergeSort(a,left,k);
        int[] a2 = mergeSort(a,k+1,right);
        // tron vao: a1 va a2 la cac mang da duoc sap xep
        int n = a1.length + a2.length;
        int[] result = new int[n];
        int i = 0, i1 = 0, i2 =0;
        while (i < n){
            if(i1<a1.length&& i2 < a2.length){
                if(a1[i1]<= a2[i2]){
                    result[i] = a1[i1];
                    i++; i1++;
                }else {//a2 nho hon
                    result[i] = a2[i2];
                    i++; i2++;
                }
            }else {// a1 rong hoac a2 rong
                if(i1 < a1.length){ // a1 pl
                    result[i] = a1[i1];
                    i++; i1++;
                }else {// a2 ok
                    result[i] = a2 [i2];
                    i++; i2++;

                }
            }
        }
        return result;



    }
}
