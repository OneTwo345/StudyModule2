package Tim_chuoi_lien_tiep_co_do_dai_lon_nhat;

import java.util.LinkedList;

public class Practice_chuoi_lien_tiep {
    public static void main(String[] args) {
        String s = "abcababcdgacd";
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> text = new LinkedList<>();
        for(int i = 0; i < s.length();i++){
            if(text.isEmpty()||s.charAt(i)>text.getLast()){
                text.add(s.charAt(i));
            }else {
                if(max.size()<text.size()){
                    max.clear();
                    max.addAll(text);
                }text.clear();
                text.add(s.charAt(i));
            }

        }
        if(max.size()<text.size()){
            max.clear();
            max.addAll(text);
        }
        System.out.println("Chuoi "+max);

    }
}
