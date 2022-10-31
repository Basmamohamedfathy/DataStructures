package com.java;

public class HashTable<K,T> {
    int size;
    Entity []arrayHash;
    public HashTable(int size) {
        this.size = size;
        arrayHash = new Entity[this.size];
        for(int i=0;i<arrayHash.length;i++){
            arrayHash[i]=new Entity<>();
        }

    }

    private int getHash(K key){
        String str= key.toString();
        int asciiValue=0;
        for(int i=0; i<str.length(); i++)
        {
             int val = str.charAt(i);
            asciiValue+=val;
        }
        while (asciiValue>size){
            asciiValue=asciiValue%size;
        }
      return asciiValue;
    }
    public void put(K key ,T value){
        int index =getHash(key);
        Entity arrValue =arrayHash[index];
        Entity newItem=new Entity<>( key,value);
        newItem.next=arrValue.next;
        arrValue.next=newItem;

    }
    public T getValue( K key){
        T value=null;
        int index =getHash(key);
        Entity arrValue =arrayHash[index];
        while (arrValue!=null){
            if(arrValue.key==key){
                value=(T)arrValue.value;
                break;
            }
            arrValue=arrValue.next;
        }
        return value;
    }
    public void remove( K key){
        T value=null;
        int index =getHash(key);
        Entity previous=new Entity();
        Entity arrValue =arrayHash[index];
        while (arrValue!=null){
            if(arrValue.key==key){
                value=(T)arrValue.value;
                break;
            }
            previous=arrValue;
            arrValue=arrValue.next;
        }
        previous.next=arrValue.next;

    }


}
