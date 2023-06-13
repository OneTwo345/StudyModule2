package quanlysinhvien;

public class Test1 {
   public static void main(String[] args) {


      NgaySinhNhat ngay1 = new NgaySinhNhat(1, 1, 2021);
      NgaySinhNhat ngay2 = new NgaySinhNhat(2, 2, 2022);
      NgaySinhNhat ngay3 = new NgaySinhNhat(3, 3, 2023);
      Lop lop1 = new Lop("10A", "CodeGym1");
      Lop lop2 = new Lop("11A", "CodeGym2");
      Lop lop3 = new Lop("12A", "CodeGym3");

      SinhVien sv1 = new SinhVien("01", "Duy", ngay2, 9.0, lop1);
      SinhVien sv2 = new SinhVien("01", "Duy", ngay2, 4.0, lop2);
      SinhVien sv3 = new SinhVien("01", "Duy", ngay2, 9.0, lop3);
      System.out.println("Ten Khoa: ");
      System.out.println("Sv1: "+sv1.layTenKhoa());
      System.out.println("Sv2: "+sv2.layTenKhoa());
      System.out.println("Sv3: "+sv3.layTenKhoa());
      System.out.println("Kiem tra thi dat: ");
      System.out.println("Sv1: "+ sv1.kiemTraThiDat());
      System.out.println("Sv2: "+ sv2.kiemTraThiDat());
      System.out.println("Sv3: "+ sv3.kiemTraThiDat());


   }

}
