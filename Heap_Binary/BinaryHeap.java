package Heap_Binary;

public class BinaryHeap {
    int[] arr;
    int sizeOfTree;

    public BinaryHeap(int size) {
        arr = new int[size];
        this.sizeOfTree = 0;
        System.out.println("Binary heap has been created.");
    }

    public boolean isEmpty() {
        if(sizeOfTree == 0) {
            return true;
        } else {
            return false;
        }
    }

    public Integer peek() {
        if(isEmpty()) {
            System.out.println("Binary heap is empty.");
            return null;
        }
        return arr[1];
    }

    public int sizeOfBinaryTree() {
        return sizeOfTree;
    }

    public void levelOrder() {
        for(int i=1; i<=sizeOfTree; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

    public void heapifyBottomToTop(int index, String heapType) {
        int parent = index/2;
        if(index <= 1) {
            return;
        }
        if(heapType.equals("Min")) {
            if(arr[index] < arr[parent]) {
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;
            }
        } else if(heapType.equals("Max")) {
            if(arr[index] > arr[parent]) {
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;
            }
        }

        heapifyBottomToTop(parent, heapType);
    }

    public void insert(int value, String typeHeap) {
        arr[sizeOfTree+1] = value;
        sizeOfTree++;
        heapifyBottomToTop(sizeOfTree, typeHeap);
        System.out.println(value + " successfully inserted in heap.");
    }

    public void heapifyTopToBottom(int index, String heapType) {
        int left = index*2;
        int right = index*2 + 1;
        int swapChild = 0;
        if(sizeOfTree < left) {
            return;
        }
        if(heapType.equals("Max")) {
            if(sizeOfTree == left) {
                if(arr[index] < arr[left]) {
                    int temp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = temp;
                }
            } else {
                if(arr[left] > arr[right]) {
                    swapChild = left;
                } else {
                    swapChild = right;
                }
                if(arr[index] < arr[swapChild]) {
                    int temp = arr[index];
                    arr[index] = arr[swapChild];
                    arr[swapChild] = temp;
                }
            }
        } else if (heapType.equals("Min")) {
            if(sizeOfTree == left) {
                if(arr[index] > arr[left]) {
                    int temp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = temp;
                }
            } else {
                if(arr[left] < arr[right]) {
                    swapChild = left;
                } else {
                    swapChild = right;
                }
                if(arr[index] > arr[swapChild]) {
                    int temp = arr[index];
                    arr[index] = arr[swapChild];
                    arr[swapChild] = temp;
                }
            }
        }

        heapifyTopToBottom(swapChild,heapType);
    }

    public int extractHeadOfBinaryHeap(String heapType) {
        if(isEmpty()) {
            return -1;
        } else {
            int extractedValue = arr[1];
            arr[1] = arr[sizeOfTree];
            sizeOfTree--;
            heapifyTopToBottom(1, heapType);
            return extractedValue;
        }
    }

    public void deleteBinaryHeap() {
        arr = null;
        System.out.println("Binary Heap has been deleted.");
    }
}
