package com.BinaryTree;

public class BSTNode<T> {
    T value;
    BSTNode left;
    BSTNode right;

    public BSTNode(T data) {
        value = data;
        right = null;
        left = null;
    }
}

