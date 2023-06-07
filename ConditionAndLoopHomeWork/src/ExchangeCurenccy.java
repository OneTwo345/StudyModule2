import java.util.Scanner;

public class ExchangeCurenccy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usd, vnd;
        System.out.println("Input your amount money to change for VND");
        usd = scanner.nextDouble();
        vnd = usd * 23000;
        System.out.println("The amount money is " + vnd + "VND");
    }
}
