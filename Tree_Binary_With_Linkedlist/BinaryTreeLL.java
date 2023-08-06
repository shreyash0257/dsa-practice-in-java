package Tree_Binary_With_Linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {
    BinaryNode root;

    public BinaryTreeLL() {
        this.root = null;
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
        while (!queue.isEmpty()) {
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

    public void search(String value) {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if(presentNode.value.equals(value)) {
                System.out.println(value + " is found in tree.");
                return;
            } else {
                if(presentNode.left != null) {
                    queue.add(presentNode.left);
                }
                if(presentNode.right != null) {
                    queue.add(presentNode.right);
                }
            }
        }
        System.out.println(value + " is not found in tree.");
    }

    public void insert(String value) {
        BinaryNode newNode = new BinaryNode();
        newNode.value = value;
        if(root == null) {
            root = newNode;
            System.out.println("Inserted new node at root.");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if(presentNode.left == null) {
                presentNode.left = newNode;
                System.out.println("Successfully inserted.");
                break;
            } else if(presentNode.right == null) {
                presentNode.right = newNode;
                System.out.println("Successfully inserted.");
                break;
            } else {
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }
        }
    }

    public BinaryNode getDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode presentNode = null;
        while(!queue.isEmpty()) {
            presentNode = queue.remove();
            if(presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if(presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
        return presentNode;
    }

    public void deleteDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode previousNode = null;
        BinaryNode presentNode = null;
        while(!queue.isEmpty()) {
            previousNode = presentNode;
            presentNode = queue.remove();
            if(presentNode.left == null) {
                previousNode.right = null;
                return;
            } else if(presentNode.right == null) {
                presentNode.left = null;
                return;
            }
            queue.add(presentNode.left);
            queue.add(presentNode.right);
        }
    }

    public void deleteNode(String value) {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if(presentNode.value.equals(value)) {
                presentNode.value = getDeepestNode().value;
                deleteDeepestNode();
                return;
            } else {
                if(presentNode.left != null) {
                    queue.add(presentNode.left);
                }
                if(presentNode.right != null) {
                    queue.add(presentNode.right);
                }
            }
        }
        System.out.println("The node dne in binary tree.");
    }

    public void deleteBinaryTree() {
        root = null;
        System.out.println("Binary Tree has been successfully deleted.");
    }
}
