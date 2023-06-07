import java.util.Scanner;

public class SolvingFirstDegreeEquations {
    public static void main(String[]args){
        System.out.println("Solving First Degree Equations");
        System.out.println("ax + b = 0");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a = ");
        double a = scanner.nextFloat();
        System.out.println("Please input b = ");
        double b = scanner.nextDouble();
        System.out.println("Result x = " + (-b / a));

    }
}
