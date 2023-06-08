import java.util.Scanner;

public class MoneyBank {
    public static void main(String[] args) {
        double money;
        int month;
        double interestRate;
        double totalInterest = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your money");
        money = scanner.nextDouble();
        System.out.println("Input month");
        month = scanner.nextInt();
        System.out.println("Input your interest rate");
        interestRate = scanner.nextDouble();

        for (int i = 1; i < month; i++) {
            totalInterest += money * (interestRate / 100) * 12 * month;
        }
        System.out.println("Total of interest: " + totalInterest);
    }


}
