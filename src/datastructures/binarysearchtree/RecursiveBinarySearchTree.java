package datastructures.binarysearchtree;

//This is a recursive BST meaning the methods in this are written recursively.
public class RecursiveBinarySearchTree {
    private Node root;

    class Node{
        int value;
        Node right;
        Node left;

        private Node(int value){
            this.value=value;
        }
    }

    private Node recursiveInsert(Node currentNode, int value){
        if (currentNode == null) return new Node(value);

        if (value < currentNode.value){
            currentNode.left = recursiveInsert(currentNode.left,value);
        } else if (value > currentNode.value) {
            currentNode.right = recursiveInsert(currentNode.right,value);
        }
        return currentNode;
    }

    private boolean recursiveContains(Node currentNode, int value){
        if (currentNode == null) return false;

        if (currentNode.value == value) return true;

        if (value < currentNode.value){
            return recursiveContains(currentNode.left,value);
        }else {
            return recursiveContains(currentNode.right,value);
        }
    }

    public void recursiveInsert(int value){
        if (root == null) root = new Node(value);
        recursiveInsert(root,value);
    }

    public boolean recursiveContains(int value){
        return recursiveContains(root,value);
    }
}
