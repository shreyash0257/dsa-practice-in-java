package LinkedList_Doubly;

public class DoublyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createDLL(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        node.prev = null;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertDLL(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;

        if(head == null) {
            createDLL(nodeValue);
            return;
        } else {
            if(location == 0) {
                node.prev = null;
                node.next = head;
                head.prev = node;
                head = node;
            } else if(location >= size) {
                node.next = null;
                node.prev = tail;
                tail.next = node;
                tail = node;
            } else {
                Node temp = head;
                int index = 0;
                while(index < location-1) {
                    temp = temp.next;
                    index++;
                }
                node.next = temp.next;
                node.prev = temp;
                node.next.prev = node;
                temp.next = node;
            }
            size++;
        }
    }

    public void traverseDLL() {
        if(head != null) {
            Node temp = head;
            for(int i=0; i<size; i++) {
                System.out.print(temp.value);
                if(i != size-1) {
                    System.out.print(" -> ");
                }
                temp = temp.next;
            }
        } else {
            System.out.println("DLL dne.");
        }
        System.out.println("\n");
    }

    public void reverseTraverseDLL() {
        if(head != null) {
            Node temp = tail;
            for(int i=0; i<size; i++) {
                System.out.print(temp.value);
                if(i != size-1) {
                    System.out.print(" <- ");
                }
                temp = temp.prev;
            }
        } else {
            System.out.println("DLL dne.");
        }
        System.out.println("\n");
    }

    public boolean searchDLL(int nodeValue) {
        if(head != null) {
            Node temp = head;
            for(int i=0; i<size; i++) {
                if(temp.value == nodeValue) {
                    System.out.println(nodeValue + " is found at " + i + " from head.");
                    return true;
                }
                temp = temp.next;
            }
        }
        System.out.println("DLL dne.");
        return false;
    }

    public void deleteNodeDLL(int location) {
        if(head == null) {
            System.out.println("DLL dne.");
            return;
        } else if(location == 0) {
            if(size == 1) {
                head = null;
                tail = null;
                size--;
                return;
            } else {
                head = head.next;
                head.prev = null;
                size--;
            }
        } else if(location >= size) {
            Node temp = tail.prev;
            if(size == 1) {
                head = null;
                tail = null;
                size--;
                return;
            } else {
                temp.next = null;
                tail = temp;
                size--;
            }
        } else {
            Node temp = head;
            for(int i=0; i<location-1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp.next.prev = temp;
            size--;
        }
    }

    public void deleteDLL() {
        Node temp = head;
        for(int i=0; i<size; i++) {
            temp.prev = null;
            temp = temp.next;
        }
        head = null;
        tail = null;
        System.out.println("DLL has been deleted.");

    }
}
