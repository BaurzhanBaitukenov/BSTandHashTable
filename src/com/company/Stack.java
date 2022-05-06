package com.company;


public class Stack {
    private int arr[];
    private int top;
    private int capacity = 10;


    public Stack(int capacity) {
        this.arr = new int[capacity];
        this.top = 0;
        this.capacity = 10;
    }


    public void push(int data){
        if(arr.length == capacity)
            increaseCapacity();
        arr[capacity] = data;
        capacity++;
    }


    public int pop(){
        if(capacity == 0)
            throw new ArrayIndexOutOfBoundsException();
        int result = arr[capacity-1];
        capacity--;
        return result;
    }


    public int peek(){
        if(capacity == 0)
            throw new ArrayIndexOutOfBoundsException();
        int result = arr[capacity-1];
        return result;
    }


    public int capacityA(){
        return capacity;
    }


    public void increaseCapacity(){
        int newCapacity = 2* arr.length;
        int [] newArr = new int[newCapacity];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }


    private void Empty(){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
        capacity = 0;
    }
}
