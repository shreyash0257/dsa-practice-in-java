package Tree_Binary_With_Array;

public class Main {
    public static void main(String[] args) {
        BinaryTree newBinaryTree = new BinaryTree(7);

        newBinaryTree.insert("N1");
        newBinaryTree.insert("N2");
        newBinaryTree.insert("N3");
        newBinaryTree.insert("N4");
        newBinaryTree.insert("N5");
        newBinaryTree.insert("N6");
        newBinaryTree.insert("N7");

        System.out.println("Pre");
        newBinaryTree.preOrder(1);
        System.out.println("\nIn");
        newBinaryTree.inOrder(1);
        System.out.println("\nPost");
        newBinaryTree.postOrder(1);
        System.out.println("\nLevel");
        newBinaryTree.levelOrder();
        System.out.println();
        newBinaryTree.search("N4");
        System.out.println();
        newBinaryTree.delete("N4");
        System.out.println("\nLevel");
        newBinaryTree.levelOrder();
        System.out.println("\n");
        newBinaryTree.deleteBinaryTree();
    }
}
