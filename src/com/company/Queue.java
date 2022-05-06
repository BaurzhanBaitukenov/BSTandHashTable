package com.company;
public class Queue {
    int rear;
    int front;
    int queue[];
    int capacity;

    public Queue(int capacity) {
        this.queue = new int[capacity];
    }

    public void enQueue(int data){
        queue[rear] = data;
        rear++;
        capacity++;
    }

    public int deQueue(){
        int data = queue[front];
        front++;
        capacity--;

        return data;
    }

    public void show(){
        for (int i = 0; i < capacity; i++) {
            System.out.print(queue[front+i]+" ");
        }
    }

    public void showSize(){
        System.out.println("My size is " + capacity);
    }
}
