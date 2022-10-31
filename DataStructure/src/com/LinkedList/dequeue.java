package com.LinkedList;

public class dequeue<T> {
    Doublylinkedlist<T> store = new Doublylinkedlist<T>();
    public void EnqueueHead(T item){

        store.addHead(item);
    }
    public void Enqueuetail(T item){

        store.addTail(item);
    }
    public T DequeueHead(){
        T top=(T) store.head.value;
        store.removeHead();
        return top;
    }
    public T Dequeuetail(){
        T tail=(T) store.tail.value;
        store.removeTail();
        return tail;
    }
    public void peekHead(){

        System.out.println(store.head.value);
    }
    public void peekTail(){

        System.out.println(store.tail.value);
    }
    public int size(){

        return store.size();
    }

}
