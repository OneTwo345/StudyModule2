package chuyen_doi_thap_phan_sang_nhi_phan;

import java.util.Stack;

public class TransNumber {
    public static void toBinary(int number){
        Stack<Integer> result = new Stack<>();
        while (number>0){
            int soDu = number % 2;
            result.push(soDu );
            number /=2;
        }
        while (!result.empty()){
            System.out.print(result.pop() + "");
        }


    }

}
