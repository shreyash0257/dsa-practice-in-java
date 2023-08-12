package Heap_Binary;

public class Main {
    public static void main(String[] args) {
        BinaryHeap binaryHeap = new BinaryHeap(5);
        binaryHeap.insert(10,"Min");
        binaryHeap.insert(5,"Min");
        binaryHeap.insert(15,"Min");
        binaryHeap.insert(1,"Min");
        binaryHeap.levelOrder();
        System.out.println(binaryHeap.extractHeadOfBinaryHeap("Min"));
        binaryHeap.levelOrder();
        binaryHeap.deleteBinaryHeap();
    }
}
