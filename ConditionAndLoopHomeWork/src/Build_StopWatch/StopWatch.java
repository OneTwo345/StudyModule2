package Build_StopWatch;

import java.util.Date;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public StopWatch(){
        startTime = new Date().getTime();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
    public void start() {
        startTime = new Date().getTime();
    }

    public void stop() {
        endTime = new Date().getTime();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

}
