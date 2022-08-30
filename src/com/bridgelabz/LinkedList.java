package com.bridgelabz;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;

    void push(T data) {
        Node<T> node = new Node<>(data);

        if (head == null) {
            head = node;
            tail = node;
        }
        else {
            node.next = head;
            head = node;
        }
    }

    public T pop() {
        T popElement = head.data;
        head = head.next;
        return popElement;
    }

//    void append(T data){
//        Node<T> node = new Node<>(data);
//        if(head == null){
//            head = node;
//            tail = node;
//        }
//        else{
//            tail.next = node;
//            tail = node;
//        }
//    }

//    public void insert(T data) {
//        Node<T> node = new Node<>(data);
//        head.next = node;
//        node.next = tail;
//    }

//    public T popLast() {
//        T popLastElement = tail.data;
//        Node<T> temp = head;
//
//        while(temp.next != tail){
//            temp = temp.next;
//        }
//
//        temp.next = null;
//        temp = tail;
//        return  popLastElement;
//
//    }

    public Node<T> search(T searchData) {
        Node<T> temp = head;

        while(temp != null){
            if(temp.data.equals(searchData))
                return temp;
            temp = temp.next;
        }
        return null;
    }

    public boolean insertAfter(T searchData, T insertData) {
        Node<T> newNode = new Node<>(insertData);
        Node<T> searchNode = search(searchData);

        if (searchNode != null) {
            newNode.next = searchNode.next;
            searchNode.next = newNode;
            return true;
        }
        return false;
    }

    void print() {
        Node<T> temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(tail.next);
    }
}
