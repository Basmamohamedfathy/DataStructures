package com.HashTable;

public class Entity<K,T> {
    K key;
    T value;
    Entity next;

    public Entity(K key, T value) {
        this.key = key;
        this.value = value;
        next = null;
    }
    public Entity() {
        next = null;
    }
    public K Getkey(T value){
        return key;
    }
}
