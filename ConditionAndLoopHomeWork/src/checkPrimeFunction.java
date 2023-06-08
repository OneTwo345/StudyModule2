public class checkPrimeFunction {
    public static void main(String[] args) {
        System.out.println(isPrime(6));

    }
    public static boolean isPrime(int x) {
        if (x < 2) {
            return false;
        }
        ;
        if (x == 2 || x == 3) {
            return true;
        }
        for (int i = 2; i < Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}

