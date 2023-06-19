package Main;

import Model.Student;
import Model.StudentService;
import Until.GetValue;

import java.util.Scanner;

public class View {
     static StudentService studentService = new StudentService();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choose = 0;
        do {
            System.out.println("MENU");
            System.out.println("CHỌN CHỨC NĂNG");
            System.out.println(
                    " 1. Thêm sinh viên .\n"
                            + " 2. Xem danh sách .\n"
                            + " 3. Kiểm tra danh sách có rỗng hay không? .\n"
                            + " 4. Lấy ra số lượng sinh viên trong danh sach .\n"
                            + " 5. Làm rỗng danh sách sinh viên .\n"
//                            + " 6. Kiem tra xem sinh viên co ton tai hay không, dựa vào mã sinh vien  .\n"
                            + " 6. Xóa 1 sinh viên ra  danh sách, dựa vào mã sinh viên  .\n"
//                            + " 8. Tim kiem sinh vien theo ten.\n"
                            + " 7. In ra danh sách theo điểm từ cao đến thấp.\n"
                            + " 0. Exit.\n");
            choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 1:
                    studentService.add(new Student(GetValue.getString("Nhap ma sinh vien"),
                            GetValue.getString("Ho va ten"),
                            GetValue.getString("Nhap gioi tinh"),
                            Integer.parseInt(GetValue.getString("Nhap nam sinh")),
                            Double.parseDouble(GetValue.getString("Nhap diemTrungBinh"))
                            ));
                    break;
                case 2:
                    studentService.printStudents();
                    break;
                case 3:
                    System.out.println(" Danh sach rong: " + studentService.isEmptyStudents());
                    break;
                case 4:
                    System.out.println("So luong hien tai: " + studentService.getSizeOfStudents());
                    break;
                case 5:
                    studentService.emptyStudents();
                    break;
//                case 6:
//                    System.out.println("Nhap ma sinh vien: ");
//
//                    SinhVien sv2 = new SinhVien(scanner.nextLine());
//                    System.out.println("Kiem tra sinh vien co trong danh sach: " + dssv.kiemTraTonTai(sv2));
//                    break;

                case 6:
                    deleteStudent();
                    break;
//                case 8:
//                    System.out.println("Nhập họ và tên: ");
//                    dssv.timSinhVien(scanner.nextLine());
//                    break;
                case 7:
                    studentService.sapXepSinhVienGiamDanTheoDiem();
                    studentService.printStudents();
                    break;

            }

        } while (choose != 0);
    }

    private static void deleteStudent(){
        String maSV = GetValue.getString("Nhap Ma SV");
        if(!studentService.checkExist(maSV)){
            System.out.printf("Khong tim thay sinh vien %s trong danh sach.\n", maSV);
            deleteStudent();
        }
        studentService.delete(maSV);
        System.out.println("Xoa thanh cong");

    }
}
