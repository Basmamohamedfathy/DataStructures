package com.LinkedList;

public class Main {

    public static void main(String[] args) {
	// try Dlinked list class

       Doublylinkedlist<Integer> test = new Doublylinkedlist<>();
        test.addHead(5);
        test.addHead(9);
        test.addTail(3);
        test.addTail(7);
        System.out.println(test.find(7));
        System.out.println(test.contains(10));
        System.out.println(test.contains(7));
        test.enumeration();
        test.remove(5);
        test.removeHead();
        test.removeTail();
        test.reverseEnumeration();
        System.out.println(test.size());


    // try stack class

        stack<Integer> testStack=new stack<>();
        testStack.push(5);
        testStack.push(6);
        testStack.push(7);
        testStack.push(8);
        System.out.println(testStack.pop());
        testStack.peek();
        System.out.println(testStack.size());

    // try queue class


        /*queue<Integer> testqueue=new queue<>();
        testqueue.Enqueue(5);
        testqueue.Enqueue(6);
        testqueue.Enqueue(7);
        testqueue.Enqueue(8);
        System.out.println(testqueue.Dequeue());
        testqueue.peek();
        System.out.println(testqueue.size());*/


    // try dequeue class

        dequeue<Integer> testqueue=new dequeue<>();
        testqueue.EnqueueHead(5);
        testqueue.EnqueueHead(6);
        testqueue.Enqueuetail(7);
        testqueue.Enqueuetail(8);
        System.out.println(testqueue.DequeueHead());
        System.out.println(testqueue.Dequeuetail());
        testqueue.peekHead();
        testqueue.peekTail();
        System.out.println(testqueue.size());



    }




}
