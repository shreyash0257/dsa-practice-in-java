package Queue_With_Linkedlist;

public class Main {
    public static void main(String[] args) {
        Queue newQueue = new Queue();
        newQueue.enqueue(10);
        newQueue.enqueue(20);
        newQueue.enqueue(30);
        newQueue.deleteQueue();
        newQueue.peek();
    }
}
