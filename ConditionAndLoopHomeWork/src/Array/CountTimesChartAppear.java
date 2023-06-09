package Array;

public class CountTimesChartAppear {
    public static void main(String[] args) {
        String text = "duydkkka";
        char vb = 'k';
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == vb) {
                count++;
            }
        }
        System.out.println("Time appear of '" + vb + "' in  '" + text + "' is: " + count);





        }
    }

