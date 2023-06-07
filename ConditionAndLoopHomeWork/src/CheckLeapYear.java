public class CheckLeapYear {
    public static void main(String[] args) {
        int a = 400;
        if (a % 4 == 0 && a % 100 != 0) {
            System.out.println("This is leap year");
        } else if (a % 100 == 0 && a % 400 != 0) {
            System.out.println("This is not leap year");
        } else if (a % 100 == 0 && a % 400 == 0) {
            System.out.println("This is leap year");
        } else {
            System.out.println("This is not leap year");
        }
    }
}
