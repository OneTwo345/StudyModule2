package ConditionAndLoop;

public class ShowPrimeLowerThan100 {
    public static void main(String[] args) {
        int number = 2;
        System.out.println("2");
        System.out.println("3");
        while (number < 100) {
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0) {
                    break;
                } else {
                    System.out.println(number);
                    break;
                }
            }
            number++ ;
        }
    }

}
