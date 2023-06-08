import java.util.Scanner;

public class FindUocChungLonNhatOfTwoNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number a ");
        int a = scanner.nextInt();
        a = Math.abs(a);
        System.out.println("Input number b ");
        int b = scanner.nextInt();
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        }
        if (a != b) {
            int c = Math.abs(a - b);

            for (; c >= 1; c--) {
                if (a % c == 0 && b % c == 0) {
                    break;
                }
            }
            System.out.println("The answer is: " + c);
        }
    }
}
