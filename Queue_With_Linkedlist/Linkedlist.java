package Queue_With_Linkedlist;

public class Linkedlist {
    public Node head;
    public Node tail;
    public int size;

    public Node createLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    // Insert Method SinglyLinkedList

    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if(head == null) {
            createLinkedList(nodeValue);
        } else if(location == 0) {
            node.next = head;
            head = node;
        } else if(location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int i = 0;
            while(i < location-1) {
                tempNode = tempNode.next;
                i++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    // SinglyLinkedList Traversal
    public void traverseLinkedList() {
        if(head == null) {
            System.out.println("Singly Linked List doesn't exist.");
        } else {
            Node tempNode = head;
            for(int i=0; i<size; i++) {
                System.out.print(tempNode.value);
                if(i != size-1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("\n");
    }

    // Search for a node
    public boolean searchNode(int nodeValue) {
        if(head != null) {
            Node tempNode = head;
            for(int i=0; i<size; i++) {
                if(tempNode.value == nodeValue) {
                    System.out.print(nodeValue + " is found at location: " + i + "\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.print("Node not found.");
        return false;
    }

    // delete a node from singlyLinkedList
    public void deletionOfNode(int location) {
        if(head == null) {
            System.out.println("The SLL does not exist.");
            return;
        } else if( location == 0) {
            head = head.next;
            size--;
            if(size == 0) {
                tail = null;
            }
        } else if(location >= size) {
            Node tempNode = head;
            for(int i=0; i<size-1; i++) {
                tempNode = tempNode.next;
            }
            if(tempNode == head) {
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        } else {
            Node tempNode = head;
            for(int i=0; i<location-1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    // deleting entire singlyLinkedList
    public void deleteLinkedList() {
        head = null;
        tail = null;

        System.out.println("The SLL is deleted successfully");
    }
}
