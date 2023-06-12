package Build_StopWatch;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10000];
        Random random = new Random();

        for (int i = 0; i < args.length; i++) {
            arr[i] = random.nextInt();
        }
        StopWatch stopWatch = new StopWatch();

    }
    }
