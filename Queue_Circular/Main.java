package Queue_Circular;

public class Main {
    public static void main(String[] args) {
        CircularQueue newCircularQueue = new CircularQueue(3);

        newCircularQueue.enqueue(5);
        newCircularQueue.enqueue(4);
        newCircularQueue.enqueue(10);
        System.out.println(newCircularQueue.dequeue());
        newCircularQueue.enqueue(2);
        newCircularQueue.enqueue(8);
        int res = newCircularQueue.peek();
        System.out.println(res);

        newCircularQueue.deleteQueue();
        boolean res1 = newCircularQueue.isEmpty();
        System.out.println(res1);
    }
}
