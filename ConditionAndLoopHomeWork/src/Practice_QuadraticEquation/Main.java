package Practice_QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao gia tri a");
        double a = scanner.nextDouble();
        System.out.println("Nhap vao gia tri b");
        double b = scanner.nextDouble();
        System.out.println("Nhap vao gia tri c");
        double c = scanner.nextDouble();
        QuadraticEquation ptbac2 = new QuadraticEquation(a,b,c);
        double delta = ptbac2.getDiscriminant();
        if (delta<0){
            System.out.println("Phuong trinh vo nghiem");

        }else if (delta==0){
            System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + (-b/2*a));
        }else {
            double x1, x2;
            x1 = (-b + Math.sqrt(delta))/(2*a);
            x2 = (-b - Math.sqrt(delta))/(2*a);

            System.out.println("Phuong trinh co 2 nghiem phan biet x1 = " + x1);
            System.out.println("Phuong trinh co 2 nghiem phan biet x2 = " + x2);
        }
    }
}
