package NumberFormatException;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input x");
        int x = scanner.nextInt();
        System.out.println("Input y");
        int y = scanner.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.calculate(x,y);
    }
    private void calculate(int x, int y){
            try{
                int sum = x+y;
                int subtraction = x - y;
                int mutilple = x * y;
                int divide = x/y;
                int modulo = x % y;
                System.out.println("Tổng x + y = " + sum);
                System.out.println("Hiệu x - y = " + subtraction);
                System.out.println("Tích x * y = " + mutilple);
                System.out.println("Thương x / y = " + divide);
                System.out.println("So du x  / y = " + modulo);
            }catch (Exception e){
                System.out.println("Xay ra ngoai le: " + e.getMessage());
            }
    }
}
