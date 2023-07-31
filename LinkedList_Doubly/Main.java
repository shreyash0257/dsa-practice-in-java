package LinkedList_Doubly;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.createDLL(5);
        dll.insertDLL(1, 0);
        dll.insertDLL(2,1);
        dll.insertDLL(8,7);
        dll.traverseDLL();
        dll.reverseTraverseDLL();
        dll.searchDLL(5);
        System.out.println();
        dll.deleteNodeDLL(0);
        dll.traverseDLL();
        dll.deleteNodeDLL(10);
        dll.traverseDLL();

        dll.deleteDLL();
        dll.traverseDLL();
    }
}
