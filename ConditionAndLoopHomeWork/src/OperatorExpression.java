import java.util.Scanner;

public class OperatorExpression {
    public static void main(String[]arg){
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        width = scanner.nextFloat();
        System.out.println("Enter height: ");
       height = scanner.nextFloat();
       float area = width * height;
        System.out.println("Arena is " + area);

    }
}
