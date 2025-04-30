package codingcrack.hackerrank;

public class InsertNodeAtTailOfLinkedList {
    Node head;

    public void insertAtTail(int data){
    Node newNode = new Node(data);

    if(head==null){
        head =newNode;
        return;
    }

    Node current = head;
    while (current.next != null){
        current = current.next;
    }
    current.next = newNode;

    }

    public static void main(String[] args) {

    }
}
