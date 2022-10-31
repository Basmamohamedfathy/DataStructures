package com.BubbleSort;

public class Main {
    public static void main( String args[] ) {
        int [] array = {5,17,20,8,14,25,24,9,3,56,100,4};
        int len = array.length;
        bubbleSort.bubble_sort(array,len);
        System.out.print("[");
        for(int i = 0; i<len; ++i){
            System.out.print(array[i] + " ");
        }
        System.out.print("]");
    }
}
