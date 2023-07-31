package LinkedList_Doubly_Circular;

public class Main {
    public static void main(String[] args) {
        CircularDoublyLinkedlist cdll = new CircularDoublyLinkedlist();
        cdll.createCDLL(1);
        System.out.println(cdll.head.value);
        cdll.insertCDLL(4, 0);
        cdll.insertCDLL(7,1);
        cdll.insertCDLL(2, 8);
        cdll.traverseCDLL();
        cdll.reverseTraversalCDLL();
        cdll.searchCDLL(2);
        cdll.searchCDLL(7);
        cdll.deleteNodeCDLL(0);
        cdll.traverseCDLL();
        cdll.deleteCDLL();
        cdll.traverseCDLL();
    }
}
