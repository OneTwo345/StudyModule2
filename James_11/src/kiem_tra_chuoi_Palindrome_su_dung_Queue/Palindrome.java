package kiem_tra_chuoi_Palindrome_su_dung_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        Queue<Character> text = new LinkedList<>();
       String s1 = s.toLowerCase();

        for (int i = s.length() - 1; i >= 0; i--) {
            text.add(s1.charAt(i));
        }
        for (int i = 0; i < s.length(); i++){
            if(s1.charAt(i) != text.remove()){
                return false;
            }
        }
        return true;

    }
}
