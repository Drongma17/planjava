package codingcrack.hackerrank;

class LinkedList {
    // Node class
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the list
    Node head;

    // Insert at a specific position (0-based index)
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        
        if (position < 0) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete node at a specific position (0-based index)
    public void deleteAtPosition(int position) {
        if (head == null || position < 0) {
            System.out.println("Invalid position or list is empty");
            return;
        }

        if (position == 0) {
            head = head.next;
            return;
        }

        Node temp = head;
        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Position out of bounds");
            return;
        }

        temp.next = temp.next.next;
    }

    // Display the list
    public void display() {
        Node temp = head;
        if (temp == null) {
            System.out.println("List is empty");
            return;
        }

        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method to test functionality
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtPosition(10, 0); // Insert at head
        list.insertAtPosition(20, 1); // Insert at position 1
        list.insertAtPosition(15, 1); // Insert in the middle
        list.display();

        list.deleteAtPosition(1); // Delete node at position 1
        list.display();

        list.deleteAtPosition(0); // Delete head
        list.display();

        list.deleteAtPosition(5); // Invalid deletion
        list.display();
    }
}
