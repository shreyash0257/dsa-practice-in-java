package Queue_With_Array;

public class Queue {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;

    public Queue(int size) {
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("Queue successfully created.");
    }

    public boolean isFull() {
        if(topOfQueue == arr.length-1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if(beginningOfQueue == -1 || beginningOfQueue == arr.length) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(int value) {
        if(isFull()) {
            System.out.println("Queue is full.");
        } else if(isEmpty()) {
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println(value + " inserted in queue.");
        } else {
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println(value + " inserted in queue.");
        }
    }

    public int dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        } else {
            int result = arr[beginningOfQueue];
            beginningOfQueue++;
            if(beginningOfQueue > topOfQueue) {
                beginningOfQueue = -1;
                topOfQueue = -1;
            }
            return result;
        }
    }

    public int peek() {
        if(!isEmpty()) {
            return arr[beginningOfQueue];
        } else {
            System.out.println("Queue is empty.");
            return -1;
        }
    }

    public void deleteQueue() {
        arr = null;
        beginningOfQueue = -1;
        topOfQueue = -1;
        System.out.println("Queue is deleted.");
    }

}
