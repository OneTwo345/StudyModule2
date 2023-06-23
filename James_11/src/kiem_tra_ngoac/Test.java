package kiem_tra_ngoac;

public class Test {
    public static void main(String[] args) {
        String a = "s * (s – a) * (s – b) * (s – c)";
        String b ="(– b + (b2 – 4*a*c)^0.5) / 2*a";
        String c = "s * (s – a) * (s – b * (s – c)";
        String d = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a)) ";
        System.out.println(Check.isCorrect(a));
    }
}
