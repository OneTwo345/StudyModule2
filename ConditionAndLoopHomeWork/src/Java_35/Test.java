package Java_35;

public class Test {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(15,5,2021);
        Ngay ngay2 = new Ngay(15,6,2030);
        Ngay ngay3 = new Ngay(15,7,2025);
        TacGia tacgia1 = new TacGia("Duy",ngay2);
        TacGia tacgia2 = new TacGia("Nam",ngay1);
        TacGia tacgia3 = new TacGia("Cuong",ngay3);
        Sach   sach1 = new Sach("Lap Trinh C",5000,2023,tacgia3);
        Sach   sach2 = new Sach("Lap Trinh A",4000,2023,tacgia3);
        Sach   sach3 = new Sach("Lap Trinh B",3000,2021,tacgia3);
        sach1.inTensach();
        sach2.inTensach();
        sach3.inTensach();
        System.out.println("So sanh NXB sach1 va sach2: " +sach1.kiemTraCungNamXuatBan(sach3));
        System.out.println("Sach 1 giam 10%: "+sach1.giaSauKhiGiam(10));
    }

}
