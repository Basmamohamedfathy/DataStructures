package com.LinkedList;

public class Node<T> {
    T value;
    Node next;
    Node previous;

    Node(T data) {
        value = data;
        next = null;
        previous=null;
    }
}