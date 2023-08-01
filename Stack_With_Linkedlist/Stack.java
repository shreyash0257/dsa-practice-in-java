package Stack_With_Linkedlist;

public class Stack {
    Linkedlist linkedlist;

    public Stack() {
        linkedlist = new Linkedlist();
    }

    public void push(int value) {
        linkedlist.insertInLinkedList(value,0);
        System.out.println(value + " pushed in stack.");
    }

    public boolean isEmpty() {
        if(linkedlist.head == null) {
            return true;
        } else {
            return false;
        }
    }

    public int pop() {
        int result = -1;
        if(isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            result = linkedlist.head.value;
            linkedlist.deletionOfNode(0);
        }
        return result;
    }

    public int peek() {
        int result = -1;
        if(isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            result = linkedlist.head.value;
        }
        return result;
    }

    public void delete() {
        linkedlist.head = null;
        System.out.println("Stack is deleted.");
    }

}
