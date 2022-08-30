package com.bridgelabz;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("|-- Linked List Program --|\n");

        LinkedList<Integer> linkedList = new LinkedList<>();

//        linkedList.push(70);
//        linkedList.push(30);
//        linkedList.push(56);
//        linkedList.print();

        linkedList.append(56);
        linkedList.print();
        System.out.println();

        linkedList.append(30);
        linkedList.print();
        System.out.println();

        linkedList.append(70);
        linkedList.print();
    }
}
