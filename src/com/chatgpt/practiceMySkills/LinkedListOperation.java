package com.chatgpt.practiceMySkills;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}


public class LinkedListOperation {
    Node head;

    LinkedListOperation() {
        this.head = null;
    }

    // insert at beginning

    private void insertAtBeginning(int data) {

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }


    // insert at end
    private void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }


    // insert at given position
    private void insertAtGivenPosition(int data, int position) {
        Node newNode = new Node(data);
        Node temp = head;
        if (position == 0) {
            insertAtBeginning(data);
        } else {
            int count = 0;
            while (count < (position - 1)) {
                temp = temp.next;
                count++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }


    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("head is null");
        } else {
            head = head.next;
        }
    }


    public void deleteAtPosition() {

    }
}
