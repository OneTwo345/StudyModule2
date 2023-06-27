package Tim_chuoi_tang_dan_co_do_dai_lon_nhat;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the text");
        String s = scanner.nextLine();
        int size = s.length();
        LinkedList<Character> max = new LinkedList<>();
        for(int i = 0; i < size; i++ ){
            LinkedList<Character> text = new LinkedList<>();
            text.add(s.charAt(i));
            for (int j = i+1 ; j < size;j++){
                if(s.charAt(j)>text.getLast()){
                    text.add(s.charAt(j));
                }
            }
            if (max.size() < text.size()){
                max.clear();
                max.addAll(text);
            }
        }
        System.out.println("Chuoi dai nhat la: " + max);



    }
}
