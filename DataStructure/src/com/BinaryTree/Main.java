package com.BinaryTree;

public class Main {
    public static void main(String[] args) {
        Binarytree<Integer> test = new Binarytree<>(12);
        test.addNode(14,test.root);
        test.addNode(7,test.root);
        test.addNode(18,test.root);
        test.addNode(3,test.root);
        test.search(7,test.root);
        test.search(200,test.root);
        test.preOrder(test.root);
        System.out.println("");
        test.inOrder(test.root);
        System.out.println("");
        test.postOrder(test.root);
        System.out.println("");
        test.delete(7);
        test.preOrder(test.root);
    }
}
