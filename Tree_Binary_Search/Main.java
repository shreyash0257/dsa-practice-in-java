package Tree_Binary_Search;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree newBST = new BinarySearchTree();
        newBST.insert(70);
        newBST.insert(50);
        newBST.insert(90);
        newBST.insert(30);
        newBST.insert(60);
        newBST.insert(80);
        newBST.insert(100);
        newBST.insert(20);
        newBST.insert(40);

        System.out.println("\nPre");
        newBST.preOrder(newBST.root);
        System.out.println("\nIn");
        newBST.inOrder(newBST.root);
        System.out.println("\nPost");
        newBST.postOrder(newBST.root);
        System.out.println("\nLevel");
        newBST.levelOrder();

        System.out.println();
        newBST.search(newBST.root, 30);
        newBST.deleteBST();

    }
}
