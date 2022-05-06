package com.company;

public class LinkedList {
    Node head;

    public static class Node{
        int data;
        Node next;
        Node prev;
    }

    public void insert(int data){
        //creating inserting to the node
        Node node = new Node();
        node.data = data;

        // if it's your first node
        if(head == null){head = node;}

        //if it's not your first node
        else{
            Node n = head;
            while(n.next!=null)
                n=n.next;
            n.next = node;
        }
    }

    public void show(){
        Node node = head;

        while(node.next!=null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }


}
