package kiem_tra_dau_ngoac;

import java.util.Stack;

public class CheckDauNgoac {
    public static void main(String[] args) {


        String a = "s * (s – a) * (s – b) * (s – c)";
        String b = "s * (s – a) * (s – b * (s – c)";

        Stack<Character> stackKho = new Stack<>();
        for(int i = 0; i < a.length();i++){
            if(a.charAt(i) == '('|| a.charAt(i)==')'){
                stackKho.push(a.charAt(i));
            }
            for (int j =0; j < stackKho.size(); j++){

            }
        }


    }
}