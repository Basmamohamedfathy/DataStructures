package com.LinkedList;

public class queue<T> {
    Doublylinkedlist<T> store = new Doublylinkedlist<T>();
    public void Enqueue(T item){

        store.addHead(item);
    }
    public T Dequeue(){
        T tail=(T) store.tail.value;
        store.removeTail();
        return tail;
    }
    public void peek(){

        System.out.println(store.tail.value);
    }
    public int size(){

        return store.size();
    }
}
