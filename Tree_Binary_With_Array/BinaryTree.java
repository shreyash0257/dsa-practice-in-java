package Tree_Binary_With_Array;

public class BinaryTree {
    String[] arr;
    int lastUsedIndex;

    public BinaryTree(int size) {
        arr = new String[size+1];
        this.lastUsedIndex = 0;
        System.out.println("Blank tree of size " + size + " is created.");
    }

    public boolean isFull() {
        if(arr.length-1 == lastUsedIndex) {
            return true;
        } else {
            return false;
        }
    }

    public void insert(String value) {
        if(!isFull()) {
            arr[lastUsedIndex+1] = value;
            lastUsedIndex++;
            System.out.println(value + " has been inserted.");
        } else {
            System.out.println("Binary Tree is full.");
        }
    }

    public void preOrder(int index) {
        if(index > lastUsedIndex) {
            return;
        }
        System.out.print(arr[index] + " ");
        preOrder(index*2);
        preOrder(index*2 + 1);
    }

    public void inOrder(int index) {
        if(index > lastUsedIndex) {
            return;
        }
        inOrder(index*2);
        System.out.print(arr[index] + " ");
        inOrder(index*2 + 1);
    }

    public void postOrder(int index) {
        if(index > lastUsedIndex) {
            return;
        }
        postOrder(index*2);
        postOrder(index*2 + 1);
        System.out.print(arr[index] + " ");
    }

    public void levelOrder() {
        for(int i=1; i<=lastUsedIndex; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public int search(String value) {
        for(int i=1; i<=lastUsedIndex; i++) {
            if(arr[i].equals(value)) {
                System.out.println(value + " is found at " + i);
                return i;
            }
        }
        System.out.println(value + " dne in binary tree.");
        return -1;
    }

    public void delete(String value) {
        int location = search(value);
        if(location == -1) {
            return;
        } else {
            arr[location] = arr[lastUsedIndex];
            lastUsedIndex--;
            System.out.println(value + " successfully deleted.");
        }
    }

    public void deleteBinaryTree() {
        try {
            arr = null;
            System.out.println("Binary Tree has been successfully deleted.");
        } catch (Exception e) {
            System.out.println("Binary Tree deletion has caused error.");
        }
    }
}
