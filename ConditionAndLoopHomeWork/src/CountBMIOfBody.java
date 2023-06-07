import java.util.Scanner;

public class CountBMIOfBody {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Input your weight (kg)");
        weight = scanner.nextDouble();
        System.out.println("Input your height (met)");
        height = scanner.nextDouble();
        bmi = weight / (height * height);
        System.out.println("Your BMI: " + bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25.0) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }

}

