package quanlyrapphim;

public class Test {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(15,5,2022);
        Ngay ngay2 = new Ngay(31,1,2025);
        Ngay ngay3 = new Ngay(16,2,2021);
        HangSanXuat hangSanXuat1 = new HangSanXuat("Hang A","Viet Nam");
        HangSanXuat hangSanXuat2 = new HangSanXuat("Hang B","My");
        HangSanXuat hangSanXuat3 = new HangSanXuat("Hang C","Ba Lan");
        BoPhim boPhim1 = new BoPhim("Bo gia",2020,hangSanXuat1,65000,ngay1);
        BoPhim boPhim2 = new BoPhim("Running Man",2021,hangSanXuat2,100000,ngay2);
        BoPhim boPhim3 = new BoPhim("Bo gia",2025,hangSanXuat3,115000,ngay3);
        System.out.println("So sanh gia 1 re hon gia 2: " + boPhim1.kiemTraGiaVeReHon(boPhim2));
        System.out.println("So sanh gia 3 re hon gia 2: " + boPhim3.kiemTraGiaVeReHon(boPhim2));
        System.out.println("Ten hang san xuat bo phim 3: "+ boPhim3.layTenHangSanXuat());
        System.out.println("Gia ve sau giam: " + boPhim2.layGiaSauKhuyenMai(10));
    }

}
