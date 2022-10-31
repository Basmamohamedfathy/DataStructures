package com.LinkedList;

public class Doublylinkedlist<T> {
     Node head;
     Node tail;

    public Doublylinkedlist() {
        head=null;
        tail=null;
    }
    public Doublylinkedlist(T head) {
        Node newNode = new Node(head);
        this.head = newNode ;
        this.tail=newNode;
    }
    public void addHead(T item) {
        if (head == null) {
            Node newNode = new Node(item);
            this.head = newNode ;
            this.tail=newNode;
        } else {

            Node newNode = new Node(item);
            head.previous = newNode;
            newNode.next = head;
            head = newNode;
            newNode.previous = null;
        }
    }
    public void addTail(T item) {
           Node newNode = new Node(item);
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;

    }
    public Node find(T element) {
        Node current = head;
        if (head == null) {
            return null;
        } else if (head != null) {
            while (current != null) {
                if (current.value == element) {
                    return current;
                }
                current = current.next;

            }
        }
        return null;
    }
    public boolean contains(T element) {

        return find(element)!=null;
    }
    public void enumeration() {
        Node current = head;
        if(head == null) {
            System.out.println("linked list is empty");
            return;
        }
        System.out.print("[");
        while(current != null) {
            if (current.next!=null){
                System.out.print(current.value+",");
            }else{
                System.out.print(current.value);
            }
            current = current.next;
        }
        System.out.print("]");
    }
    public void reverseEnumeration() {
        Node current = tail;
        if(head == null) {
            System.out.println("linked list is empty");
            return;
        }
        System.out.print("[");
        while(current != null) {
            if (current.previous!=null){
                System.out.print(current.value+",");
            }else{
            System.out.print(current.value);
            }
            current = current.previous;
        }
        System.out.print("]");
    }
    public void removeHead(){
            head.next.previous=null;
            head=head.next;
    }
    public void removeTail (){
            tail.previous.next=null;
            tail=tail.previous;
    }
    public void remove(T element){
        if(head.value==element){
            removeHead();
        }else if(tail.value==element){
            removeTail();
        }else{
           Node current= find(element);
            current.next.previous=current.previous;
            current.previous.next=current.next;
        }
    }
    public int size(){
        int count=1;
        Node current= head;
        while (current != null && current.next!=null) {
            current = current.next;
            count++;
        }
        return count;
    }

}

