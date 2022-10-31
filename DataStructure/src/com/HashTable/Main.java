package com.HashTable;

public class Main {
    public static void main(String[] args) {
        HashTable<Integer,String> table=new HashTable<>(8);
        table.put(5,"basma");
        table.put(10,"mohamed");
        table.put(7,"fathy");
        table.put(9,"no");
        System.out.println(table.getValue(9));
        table.remove(9);
        System.out.println(table.getValue(9));
    }
}
