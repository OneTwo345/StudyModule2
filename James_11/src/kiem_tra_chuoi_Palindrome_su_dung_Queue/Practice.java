package kiem_tra_chuoi_Palindrome_su_dung_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Practice {
    public static boolean isDoiXung(String s){
        Queue<Character> text = new LinkedList<>();
        String s1 = s.toLowerCase();

        for(int i = 0; i < s.length(); i++){
            text.add(s1.charAt(i));
        }
        for (int j = s.length() -1; j > 0; j--){
            if (s1.charAt(j)!=text.remove()){
                return false;
            }
        }
        return true;
    }
}
