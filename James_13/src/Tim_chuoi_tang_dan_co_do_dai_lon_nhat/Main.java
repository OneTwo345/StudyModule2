package Tim_chuoi_tang_dan_co_do_dai_lon_nhat;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the text");
        String s = scanner.nextLine();
        LinkedList<Character> max = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {

            LinkedList<Character> lists = new LinkedList<>();
            lists.add(s.charAt(i));
            for (int j = i+1; j < s.length(); j++){
                if(s.charAt(j)>lists.getLast()){
                    lists.add(s.charAt(j));

                }
            }
            if (lists.size() > max.size()) {
                //Nếu kích cỡ của list trung gian lớn hơn kích cỡ của list có độ dài lớn nhất thì gán lại max
                max.clear();
                max.addAll(lists);
            }
            lists.clear();
        }
        // Hiển thị chuỗi tăng dần dài nhất
        for (Character ch: max) { // 1 vòng lặp
            System.out.print(ch); // 1 câu lệnh
        }
        System.out.println();

    }
}
