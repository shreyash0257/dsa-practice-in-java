package Stack_With_Array;

public class Stack {
    int[] arr;
    int topOfStack;

    public Stack(int size) {
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("Stack is created of size : " + size);
    }

    public boolean isEmpty() {
        if(topOfStack == -1) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if(topOfStack == arr.length-1) {
            return true;
        }
        return false;
    }

    public void push(int value) {
        if(isFull()) {
            System.out.println("Stack is full.");
        } else {
            arr[topOfStack+1] = value;
            topOfStack++;
            System.out.println(value + " pushed in.");
        }
    }

    public void pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            int top = arr[topOfStack];
            topOfStack--;
            System.out.println(top + " popped out.");
        }
    }

    public void peek() {
        if(isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println(arr[topOfStack] + " after peek.");
        }
    }

    public void deleteStack() {
        arr = null;
        topOfStack = -1;
        System.out.println("Stack is deleted.");
    }
}
