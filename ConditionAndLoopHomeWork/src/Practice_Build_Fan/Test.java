package Practice_Build_Fan;

import ConditionAndLoop.SystemTime;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
       Fan fan1 = new Fan(3,true,10,"yellow");
       Fan fan2 = new Fan(2,false,5,"blue");
        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 2: " + fan2.toString());
        Fan fan3 = new Fan();
        fan3.setSpeed(3);
        fan3.setOn(true);
        System.out.println("Fan 3: " + fan3.toString());
    }

}
