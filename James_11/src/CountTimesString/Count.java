package CountTimesString;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input text you want to count");
        String text = scanner.nextLine();
        Map<String, Integer> wordCount = new TreeMap<>();
        String[] words = text.split(" ");
        System.out.println(Arrays.toString(words));
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        for(Map.Entry<String,Integer> entry: wordCount.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
