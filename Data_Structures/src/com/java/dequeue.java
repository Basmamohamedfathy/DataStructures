package com.java;

public class dequeue<T> {
    Dlinkedlist<T> store = new Dlinkedlist<T>();
    public void pushHead(T item){

        store.addHead(item);
    }
    public void pushtail(T item){

        store.addTail(item);
    }
    public T popHead(){
        T top=(T) store.head.value;
        store.removeHead();
        return top;
    }
    public T poptail(){
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
