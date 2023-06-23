package chuong_trinh_quan_ly_san_pham;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choose = 0;


        do {
            System.out.println("1.Thêm sản phẩm\n" +
                    "2. Sửa thông tin sản phẩm theo id\n" +
                    "3. Xoá sản phẩm theo id\n" +
                    "4. Hiển thị danh sách sản phẩm\n" +
                    "5. Tìm kiếm sản phẩm theo tên\n" +
                    "6. Sắp xếp sản phẩm tăng dần, giảm dần theo giá\n"+
                    "0. Exit");
             choose = scanner.nextInt();
            switch (choose){
                case 1:
                    System.out.println("Nhap san pham muon them");
                    ProductManager.add();break;
                case 3:
                    System.out.println("Nhap ID san pham muon xoa");
                    String id = scanner.nextLine();
                    ProductManager.removeProduct(id);break;
                case 2:
                    System.out.println("Nhap ID san pham muon sua");break;
                case 4:
                    ProductManager.displayProduct();break;
                case 5:
                    System.out.println("Nhap vao ten san pham");
                    String name = scanner.nextLine();
                    ProductManager.findProductByName(name);break;
                case 6:
                    ProductManager.sortProductByPrice();break;





        }
        }while (choose!=0);
    }
}
