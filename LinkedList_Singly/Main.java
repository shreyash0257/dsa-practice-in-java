package LinkedList_Singly;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.createSinglyLinkedList(5);
        System.out.println(sLL.head.value);

        sLL.insertInLinkedList(6,1);
        sLL.insertInLinkedList(7,3);
        sLL.insertInLinkedList(8,2);
        sLL.insertInLinkedList(9,0);
        sLL.insertInLinkedList(10,4);
        System.out.println(sLL.head.next.value);
        System.out.println(sLL.head.next.next.value);
        System.out.println(sLL.head.next.next.next.value);

        System.out.println();

        sLL.traverseSinglyLinkedList();

        System.out.println();

        sLL.searchNode(7);

        System.out.println();

        sLL.deletionOfNode(0);

        sLL.traverseSinglyLinkedList();

        sLL.deleteSinglyLinkedList();

        System.out.println();

        sLL.traverseSinglyLinkedList();
    }
}
