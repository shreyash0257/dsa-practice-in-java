package Tree_Binary_Search;

import java.util.Queue;
import java.util.LinkedList;

public class BinarySearchTree {
    public BinaryNode root;

    public BinarySearchTree() {
        this.root = null;
    }

    private BinaryNode insert(BinaryNode currentNode, int value) {
        if(currentNode == null) {
            BinaryNode newNode = new BinaryNode();
            newNode.value = value;
            System.out.println(value + " successfully inserted.");
            return newNode;
        } else if(value <= currentNode.value) {
            currentNode.left = insert(currentNode.left, value);
            return currentNode;
        } else {
            currentNode.right = insert(currentNode.right, value);
            return currentNode;
        }
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    public void preOrder(BinaryNode node) {
        if(node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(BinaryNode node) {
        if(node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    public void postOrder(BinaryNode node) {
        if(node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    public void levelOrder() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value + " ");
            if(presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if(presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
    }

    public BinaryNode search(BinaryNode node, int value) {
        if(node == null) {
            System.out.println(value + " not found.");
            return null;
        } else if(node.value == value) {
            System.out.println(value + " found in BST.");
            return node;
        } else if(value < node.value) {
            return search(node.left, value);
        } else {
            return search(node.right, value);
        }
    }

    public BinaryNode minimumNode(BinaryNode node) {
        if(root.left == null) {
            return root;
        } else {
            return minimumNode(node.left);
        }
    }

    public BinaryNode delete(BinaryNode root, int value) {
        if(root == null) {
            System.out.println(value + " not found.");
            return null;
        }
        if(value < root.value) {
            root.left = delete(root.left, value);
        } else if(value > root.value) {
            root.right = delete(root.right, value);
        } else {
            if(root.left != null && root.right != null) {
                BinaryNode temp = root;
                BinaryNode minNodeForRight = minimumNode(temp.right);
                root.value = minNodeForRight.value;
                root.right = delete(root.right, minNodeForRight.value);
            } else if(root.left != null) {
                root = root.left;
            } else if(root.right != null) {
                root = root.right;
            } else {
                root = null;
            }
        }
        return root;
    }

    public void deleteBST() {
        root = null;
        System.out.println("BST has been deleted successfully.");
    }
}
