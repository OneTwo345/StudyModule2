package quanlysinhvien;

import java.util.Objects;

public class NgaySinhNhat {
    private int ngay1, thang1, nam1;

    public NgaySinhNhat(int ngay1, int thang1, int nam1) {
        this.ngay1 = ngay1;
        this.thang1 = thang1;
        this.nam1 = nam1;
    }

    public int getNgay1() {
        return ngay1;
    }

    public void setNgay1(int ngay1) {
        this.ngay1 = ngay1;
    }

    public int getThang1() {
        return thang1;
    }

    public void setThang1(int thang1) {
        this.thang1 = thang1;
    }

    public int getNam1() {
        return nam1;
    }

    public void setNam1(int nam1) {
        this.nam1 = nam1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NgaySinhNhat that = (NgaySinhNhat) o;
        return ngay1 == that.ngay1 && thang1 == that.thang1 && nam1 == that.nam1;
    }


}


