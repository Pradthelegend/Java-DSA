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

    private boolean recursiveContains(Node currentNode, int value){
        if (root == null) return false;

        if (currentNode.value == value) return true;

        if (value < currentNode.value){
            return recursiveContains(currentNode.left,value);
        }else {
            return recursiveContains(currentNode.right,value);
        }
    }

    public boolean recursiveContains(int value){
        return recursiveContains(root,value);
    }
}
