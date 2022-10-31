package com.java;

public class queue<T> {
    Dlinkedlist<T> store = new Dlinkedlist<T>();
    public void push(T item){

        store.addHead(item);
    }
    public T pop(){
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
