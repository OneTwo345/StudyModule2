package Java_32;

public class Test {
    public static void main(String[] args) {
        MyDate md = new MyDate(31, 1, 2022);
        System.out.println("Day = " + md.getDay());
        md.setDay(35);
        System.out.println("Day = " + md.getDay());
        md.setDay(30);
        System.out.println("Day = " + md.getDay());



    }


}
