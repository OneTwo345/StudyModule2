package Tim_chuoi_lien_tiep_co_do_dai_lon_nhat;

import java.util.LinkedList;
import java.util.Scanner;

public class Find {
//Viết chương trình nhắc người dùng nhập chuỗi và
// hiển thị chuỗi con được sắp xếp theo thứ tự có độ dài lớn nhất.
// Phân tích sự phức tạp về thời gian của chương trình.
public static void main(String[] args) {

   // abcabab
    // abc
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap vao chuoi");
    String s = scanner.nextLine();
    LinkedList<Character> max = new LinkedList<>();
    LinkedList<Character> text = new LinkedList<>();
    for (int i = 0; i < s.length(); i++) {
        if (text.isEmpty() || s.charAt(i) >= text.getLast()) {
            text.add(s.charAt(i));
        } else {
            if (max.size() < text.size()) {
                max.clear();
                max.addAll(text);
            }
            text.clear();
            text.add(s.charAt(i));
        }
    }
    if (max.size() < text.size()) {
        max.clear();
        max.addAll(text);
    }
    System.out.println("Chuoi dai nhat la " + max);
}
}
