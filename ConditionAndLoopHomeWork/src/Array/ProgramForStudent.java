package Array;

import java.util.Scanner;

public class ProgramForStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers of students");
        int size;
        size = scanner.nextInt();
       int[] students = new int[size];
       int count = 0;
       for (int i = 0; i < size; i++){
           System.out.println("Input mark of student");
           students[i]= scanner.nextInt();
           if (students[i]>5){
               System.out.println(students[i]+" Pass");
               count++;
           }
       }
        System.out.println("The numbers of pass student is: "+count);
    }
}
