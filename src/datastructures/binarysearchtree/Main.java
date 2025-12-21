package datastructures.binarysearchtree;

public class Main {

    public static void main(String[] args) {

        //This is an iterative version meaning the methods use a loop to move to next nodes.
//        BinarySearchTree binarySearchTree = new BinarySearchTree();
//
//        binarySearchTree.insert(7);
//        binarySearchTree.insert(4);
//        binarySearchTree.insert(8);
//        binarySearchTree.insert(1);
//
//        System.out.println(binarySearchTree.contains(7));

        //This is a recursive version of BST (Methods use recursion to move to the next nodes).

        RecursiveBinarySearchTree rBST = new RecursiveBinarySearchTree();

        rBST.recursiveInsert(5);
        rBST.recursiveInsert(7);
        rBST.recursiveInsert(8);
        rBST.recursiveInsert(3);
        rBST.recursiveInsert(1);

        System.out.println(rBST.recursiveContains(5));

        System.out.println(rBST);

    }

}
