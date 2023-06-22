package CountTimesString;

import java.util.Map;
import java.util.TreeMap;

public class Practice {
//    public static void main(String[] args) {
//
//
//        String text = "Im not the king, im a person";
//        Map<String, Integer> wordCount = new TreeMap<>();
//        String[] words = text.split(" ");
//        for (String word: words){
//            String key = word.toLowerCase();
//            if(wordCount.containsKey(key)){
//                wordCount.put(key,wordCount.get(key)+1);
//            }else {
//                wordCount.put(key,1);
//            }
//
//        }
//        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
//
//    }
//
//    }
public static void main(String[] args) {
    String text = "This is a sample text with several words.";

    // Tạo một HashMap để lưu trữ các từ và số lần xuất hiện của chúng
    Map<String, Integer> wordCount = new TreeMap<>();

    // Tách chuỗi thành các từ và đếm số lần xuất hiện của từng từ
    String[] words = text.split("\\s+");
    for (String word : words) {
        // Chuyển toàn bộ từ thành chữ hoa hoặc chữ thường
        String key = word.toLowerCase();

        // Kiểm tra xem từ đã có trong HashMap hay chưa
        if (wordCount.containsKey(key)) {
            // Nếu có, tăng số lần xuất hiện lên 1
            wordCount.put(key, wordCount.get(key) + 1);
        } else {
            // Nếu không, thêm từ vào HashMap với số lần xuất hiện bằng 1.
            wordCount.put(key, 1);
        }
    }

    // Hiển thị kết quả đếm số lượng mỗi từ
    for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
        System.out.println(entry.getKey() + ": " + entry.getValue());
    }
}
}