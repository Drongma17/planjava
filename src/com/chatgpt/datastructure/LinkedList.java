package com.chatgpt.datastructure;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    // Insert at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at the end
    public void insertAtEnd(int data) {
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

    // Insert at a given position
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 0) {
            insertAtBeginning(data);
        } else {
            Node temp = head;
            for (int i = 0; temp != null && i < position - 1; i++) {
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Invalid position");
            } else {
                newNode.next = temp.next;
                temp.next = newNode;
            }
        }
    }

    // Delete at the beginning
    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            head = head.next;
        }
    }

    // Delete at the end
    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
        } else if (head.next == null) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    // Delete at a given position
    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty");
        } else if (position == 0) {
            deleteAtBeginning();
        } else {
            Node temp = head;
            for (int i = 0; temp != null && i < position - 1; i++) {
                temp = temp.next;
            }
            if (temp == null || temp.next == null) {
                System.out.println("Invalid position");
            } else {
                temp.next = temp.next.next;
            }
        }
    }

    // Print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtEnd(1);
        list.insertAtBeginning(2);
        list.insertAtPosition(3, 1);
        list.printList(); // Output: 2 3 1

        list.deleteAtBeginning();
        list.deleteAtEnd();
        list.printList(); // Output: 3
    }
}