package Queue_With_Array;

public class Main {
    public static void main(String[] args) {
        Queue newQueue = new Queue(3);
        newQueue.enqueue(5);
        newQueue.enqueue(1);
        newQueue.enqueue(2);
        boolean res = newQueue.isEmpty();
        System.out.println(res);

        int result = newQueue.peek();
        System.out.println(result);

        newQueue.deleteQueue();
        boolean res2 = newQueue.isEmpty();
        System.out.println(res2);
    }
}
