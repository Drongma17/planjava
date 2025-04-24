package com.chatgpt.problemsolving;

// Define a Node class
class Node {
    int data;
    Node next;

    // Constructor to create a new node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Define a LinkedList class
class MyLinkedList {
    private Node head;

    // Method to add an element to the linked list
    public void add(int data) {
        Node newNode = new Node(data); // Create a new node

        if (head == null) { // If the list is empty, set the new node as the head
            head = newNode;
        } else {
            Node current = head;
            // Traverse to the end of the list
            while (current.next != null) {
                current = current.next;
            }
            // Add the new node at the end
            current.next = newNode;
        }
    }

    // Method to display the linked list elements
    public void display() {
        Node current = head;

        if (current == null) {
            System.out.println("The linked list is empty.");
            return;
        }

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

// Main class
public class LinkedListImplementation {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();

        // Add elements to the linked list
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        // Display the linked list
        System.out.print("Linked List: ");
        linkedList.display();
    }
}