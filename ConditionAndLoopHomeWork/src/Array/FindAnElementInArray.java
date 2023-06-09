package Array;

import java.util.Scanner;

public class FindAnElementInArray {
    public static void main(String[] args) {
        String[] farms = {"chickens", "cows", "horses", "sheeps", "rabbits", "ducks"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the animals");
        String inputName = scanner.nextLine();
        boolean isExit = false;
        for (int i = 0; i < farms.length; i++) {
            if (farms[i].equals(inputName)) {
                System.out.println("Position of the animals in the list " + inputName + " is: " + i);
                isExit = true;
                break;
            }
        }
        if (!isExit) {
            System.out.println("Not found" + inputName + " in the list.");
        }
    }
}
