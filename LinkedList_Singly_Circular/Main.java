package LinkedList_Singly_Circular;

public class Main {
    public static void main(String[] args) {
        CircularSinglyLinkedlist csll = new CircularSinglyLinkedlist();
        csll.createCSLL(5);
        System.out.println(csll.head.value);
        System.out.println(csll.head.next.value);
        System.out.println();
        csll.insertCSLL(4,0);
        csll.insertCSLL(2,1);
        csll.insertCSLL(7,8);
        System.out.println(csll.head.value);
        System.out.println();
        csll.traverseCSLL();
        csll.searchCSLL(7);
        System.out.println();
        csll.deleteNode(10);
        csll.traverseCSLL();

        csll.deleteCSLL();
        csll.traverseCSLL();

    }
}
