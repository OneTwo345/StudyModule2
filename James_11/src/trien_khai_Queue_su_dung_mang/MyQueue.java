package trien_khai_Queue_su_dung_mang;

public class MyQueue {
    private int capacity;
    private int[] queueArr;
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public MyQueue(int queueSize){
        this.currentSize = queueSize;
        queueArr = new int[this.capacity];
    }

    public boolean isQueuefull(){
        boolean status = false;
        if (currentSize == capacity){
            status = true;

        }
        return status;
    }
    public boolean isQueueEmpty(){
        boolean status = false;
        if(currentSize == 0){
            status = true;
        }
        return status;
    }
    public void enqueue(int item){
        if (isQueuefull()){
            System.out.println("Can't add item: "+item);
        }else {
            tail++;
            if (tail == capacity -1){
                tail = 0;
            }
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Add"+item +" success");
        }

    }
    public void dequeue(){
        if (isQueueEmpty()){
            System.out.println("Underflow ! Unable to remove element from Queue ");

        }else {
            head++;
        }
        if (head == capacity -1 ){
            System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
            head = 0;

        }else {
            System.out.println("Pop operation done ! removed: "+queueArr[head-1]);
        }
        currentSize--;
    }


}
