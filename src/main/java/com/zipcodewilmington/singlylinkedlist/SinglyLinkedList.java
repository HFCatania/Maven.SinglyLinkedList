package com.zipcodewilmington.singlylinkedlist;



/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<Integer> {
    Node head;
    int nodeCount;

    private static class Node<Integer>{
        int integer;
        Node<Integer> next;
        int nodeCount = 0;

        Node(Node <Integer> next, int element){
            this.integer = element;
            this.next = next;
        }
    }

    public void add(int integer){
        Node newNode = new Node(head, integer);
        newNode.next = head;
        head = newNode;
        nodeCount++;
    }

    public void remove(int index){
        if(head == null)
            return;
        Node temp = head;

        if(index == 0){
            head = temp.next;
            return;
        }
        for (int i = 0; i < index-1 ; i++) {
            temp = temp.next;
            nodeCount--;
        }
        if(temp == null || temp.next == null)
            return;
        Node next = temp.next.next;
        temp.next = next;

    }

    public boolean contains(int a){
        Node current = head;
        while(current != null){
            if(current.integer == a)
                return true;
                current = current.next;
        }
        return false;
    }

    public int find(int indexOf){
        Node current = this.head;
        int i = 0;
        while (current != null){
            if(current.integer == indexOf)
                return i;
            current = current.next;
            i++;
        }
        return -1;
    }

    public int size(){
        return nodeCount;
    }

    public int get(int index){
        Node current = head;
        int count = 0;

        while(current != null){
            if(count == index) return current.integer;
            count++;
            current = current.next;
        }
        return -1;
    }

    public SinglyLinkedList<Integer> copy(){
        SinglyLinkedList<Integer> copy = new SinglyLinkedList<>();
        Node original = this.head;
        Node copyNode = copy.head;

        while(original != null){
            copyNode.integer = original.integer;
            original = original.next;
            copyNode = copyNode.next;
        }
        return copy;
    }

    public void sort(){
        for (int i = 0; i < nodeCount; i++) {
            Node current = head;
            Node next = head.next;
            for(int j = 0; j < nodeCount -1; j++){
                int temp = current.integer;
                current.integer = next.integer;
                next.integer = temp;
            }
            current = next;
            next = next.next;
        }
    }






 }
