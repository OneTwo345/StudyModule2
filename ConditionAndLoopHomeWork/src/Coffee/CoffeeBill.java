package Coffee;

public class CoffeeBill {
    private String coffeeName;
    private double giaTien1kg;
    private double khoiLuong;

    public CoffeeBill(String name, double price, double kl) {
        this.coffeeName = name;
        this.giaTien1kg = price;
        this.khoiLuong = kl;
    }

    public double tinhTongTien() {
        return this.giaTien1kg * this.khoiLuong;
    }

    public boolean checkThePrice(double kl) {
        return this.khoiLuong > kl;

    }

    public boolean checkTongTienLonHon500() {
        return this.tinhTongTien() > 500000;
    }

    public double giamGia(double x) {
        if (this.tinhTongTien() > 500000) {
            return (x / 100 * this.tinhTongTien());
        } else return 0;
    }

    public double giaSauKhiGiam(double x) {
        return this.tinhTongTien() - this.giamGia(x);
    }

}
