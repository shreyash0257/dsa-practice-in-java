package LinkedList_Doubly_Circular;

public class CircularDoublyLinkedlist {
    public Node head;
    public Node tail;
    public int size;

    public Node createCDLL(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        node.prev = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertCDLL(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;

        if(head == null) {
            createCDLL(nodeValue);
            return;
        } else if(location == 0){
            node.next = head;
            node.prev = tail;
            head.prev = node;
            head = node;
            tail.next = node;
        } else if(location >= size) {
            node.next = head;
            node.prev = tail;
            head.prev = node;
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

    public void traverseCDLL() {
        if(head != null) {
            Node temp = head;
            for(int i=0; i<size; i++) {
                System.out.print(temp.value);
                if(i != size-1) {
                    System.out.print(" -> ");
                }
                temp = temp.next;
            }
            System.out.println("\n");
        } else {
            System.out.println("\nCDLL dne.");
        }
    }

    public void reverseTraversalCDLL() {
        if(head != null) {
            Node temp = tail;
            for(int i=0; i<size; i++) {
                System.out.print(temp.value);
                if(i != size-1){
                    System.out.print(" <- ");
                }
                temp = temp.prev;
            }
            System.out.println("\n");
        } else {
            System.out.println("\nCDLL dne.");
        }
    }

    public boolean searchCDLL(int nodeValue) {
        if(head != null) {
            Node temp = head;
            for(int i=0; i<size; i++) {
                if(temp.value == nodeValue) {
                    System.out.println(nodeValue + " is found at " + i);
                    return true;
                }
                temp = temp.next;
            }
        }
        System.out.println("CDLL dne.");
        return false;
    }

    public void deleteNodeCDLL(int location) {
        if(head == null) {
            System.out.println("CDLL dne.");
            return;
        } else if(location == 0) {
            if(size == 1) {
                head.next = null;
                head.prev = null;
                head = null;
                tail = null;
                size--;
            } else {
                head = head.next;
                head.prev = tail;
                tail.next = head;
                size--;
            }
        } else if (location >= size) {
            if(size == 1) {
                head.prev = null;
                head.next = null;
                head = tail = null;
                size--;
            } else {
                tail = tail.prev;
                tail.next = head;
                head.prev = tail;
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

    public void deleteCDLL() {
        Node temp = head;
        for(int i=0; i<size; i++) {
            temp.prev = null;
            temp = temp.next;
        }
        head = null;
        tail = null;
        System.out.println("CDLL has been deleted.");
    }
}
