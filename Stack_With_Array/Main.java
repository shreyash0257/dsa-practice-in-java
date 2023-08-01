package Stack_With_Array;

public class Main {
    public static void main(String[] args) {
        Stack newStack = new Stack(5);
        newStack.push(5);
        newStack.push(6);
        newStack.push(2);
        newStack.push(3);
        newStack.push(1);
        newStack.pop();
        newStack.pop();
        newStack.peek();

        newStack.deleteStack();
        newStack.peek();
    }
}
