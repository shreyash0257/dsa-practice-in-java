package Tree_Binary_With_Linkedlist;

public class Main {
    public static void main(String[] args) {
        BinaryTreeLL binaryTree = new BinaryTreeLL();
        binaryTree.insert("N1");
        binaryTree.insert("N2");
        binaryTree.insert("N3");
        binaryTree.insert("N4");
        binaryTree.insert("N5");
        binaryTree.insert("N6");

        System.out.println();
        binaryTree.search("N4");

        System.out.println("\nLevel");
        binaryTree.levelOrder();
        System.out.println("\nPre");
        binaryTree.preOrder(binaryTree.root);
        System.out.println("\nIn");
        binaryTree.inOrder(binaryTree.root);
        System.out.println("\nPost");
        binaryTree.postOrder(binaryTree.root);

        System.out.println("\n" + binaryTree.getDeepestNode().value);
        binaryTree.deleteNode("N3");

        System.out.println("\nLevel");
        binaryTree.levelOrder();

        binaryTree.deleteBinaryTree();
        
    }
}
