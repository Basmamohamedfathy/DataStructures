package com.LinkedList;

public class stack<T> {
    Doublylinkedlist<T> store = new Doublylinkedlist<>();
 public void push(T item){

     store.addHead(item);
 }
 public T pop(){
     T top=(T) store.head.value;
     store.removeHead();
     return top;
 }
 public void peek(){

     System.out.println(store.head.value);
    }
 public int size(){
     return store.size();
}

}
