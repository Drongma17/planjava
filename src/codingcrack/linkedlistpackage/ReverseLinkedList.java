package codingcrack.linkedlistpackage;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        
        while (current != null) {
            ListNode next = current.next; // Store the next node
            current.next = prev;          // Reverse the link
            prev = current;               // Move prev to current
            current = next;               // Move to the next node
        }
        
        return prev; // Prev will be the new head
    }

    // Helper function to print the Linked List
    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main function to test the code
    public static void main(String[] args) {
        ReverseLinkedList solution = new ReverseLinkedList();

        // Creating a Linked List: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original Linked List:");
        solution.printList(head);

        // Reverse the Linked List
        head = solution.reverseList(head);

        System.out.println("Reversed Linked List:");
        solution.printList(head);
    }
}