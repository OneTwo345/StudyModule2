package Java_32;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        if (day >= 1 && day <= 31) {

            this.day = day;
        } else {
            this.day = 1;
        }
        ;
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            month = 1;
        }
        ;
        if (year >= 0) {
            this.year = year;
        } else {
            year = 1;
        }
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int d) {
        if (d >= 1 && d <= 31) {
            this.day = d;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1) {
            this.year = year;
        }
    }
    @Override
    public String toString() {
        return this.day + "/" + this.month + "/" + this.year;
    }
}
