package com.bridgelabz;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("|-- Linked List Program --|\n");

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.push(40);
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        linkedList.print();

//        if(linkedList.search(30) != null ){
//            System.out.println("Element Found");
//        }
//        else {
//            System.out.println("Element Not Found");
//        }

//        System.out.println("Element to Pop: " + linkedList.pop());
//        linkedList.print();
//
//        System.out.println("Element to Pop: " + linkedList.popLast());
//        linkedList.print();

//        linkedList.append(56);
//        linkedList.append(30);
//        linkedList.append(70);
//        linkedList.print();

//        linkedList.insert(30);
//        linkedList.print();

//        linkedList.insertAfter(30,40);
//        linkedList.print();
//        System.out.println();
//
//        linkedList.remove(40);
//        linkedList.print();
//        System.out.println();
//        System.out.println("Size of Linked List: " + linkedList.size());
    }
}
