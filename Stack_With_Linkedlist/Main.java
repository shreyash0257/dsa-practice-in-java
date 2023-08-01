package Stack_With_Linkedlist;

public class Main {
    public static void main(String[] args) {
        Stack newStack = new Stack();

        boolean res = newStack.isEmpty();
        System.out.println(res);

        newStack.push(1);
        newStack.push(2);
        newStack.push(3);

//        int result = newStack.pop();
//        System.out.println(result + " popped out.");


        int result = newStack.peek();
        System.out.println(result + " peeked.");

        newStack.delete();
    }
}
