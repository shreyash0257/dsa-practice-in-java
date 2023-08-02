package Queue_With_Linkedlist;

public class Queue {
    Linkedlist list;

    public Queue() {
        list = new Linkedlist();
        System.out.println("Queue is successfully created.");
    }

    public boolean isEmpty() {
        if(list.head == null) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(int value) {
        list.insertInLinkedList(value, list.size);
        System.out.println(value + " inserted in queue.");
    }

    public int dequeue() {
        int value = -1;
        if(isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            value = list.head.value;
            list.deletionOfNode(0);
        }
        return value;
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        } else {
            return list.head.value;
        }
    }

    public void deleteQueue() {
        list.head = null;
        list.tail = null;
    }

}
