package java24_chuyendoithapphansangnhiphan;

import java.util.Scanner;

public class ChuyenDoi {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen N > 0");
        n = scanner.nextInt();
        String nhiPhan = " ";
        //Chia lien tuc cho 2 va lay phan du
        //Dao nguoc chuoi =>
        // 10:2 = 5 du 0
        // 5:2 =2 du 1
        // 2:2 =1 du 0
        // 1:2 = 0 du 1
        // ket qua la 1010
        while (n > 0){
            nhiPhan = (n%2) + nhiPhan;
            n = n/2;
        }
        System.out.println("So he nhi phan la: "+nhiPhan);
    }
}
