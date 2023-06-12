package Coffee;

public class Test {
    public static void main(String[] args) {
        CoffeeBill hd = new CoffeeBill("Trung Nguyen",1000000,1.5);
        CoffeeBill hd2 = new CoffeeBill("Trung Nguyen",200000,1.5);
        System.out.println("Tong tien: " + hd.tinhTongTien());
        System.out.println("Kiem tra khoi luong > 2kg "+hd.checkThePrice(2));
        System.out.println("Kiem tra tong tien lon hon 500k "+hd.checkTongTienLonHon500());
        System.out.println("Kiem tra tong tien lon hon 500k "+hd2.checkTongTienLonHon500());
        System.out.println("Giam gia cua Hd: " + hd.giamGia(10));
        System.out.println("Giam gia cua Hd2: " + hd2.giamGia(10));
        System.out.println("Sau giam gia cua Hd1: "+ hd.giaSauKhiGiam(10));
        System.out.println("Sau giam gia cua Hd2: "+ hd2.giaSauKhiGiam(10));
    }
}
