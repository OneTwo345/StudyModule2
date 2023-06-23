package kiem_tra_ngoac;

import java.util.Queue;
import java.util.Stack;

public class Check {


    public static boolean isCorrect(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

