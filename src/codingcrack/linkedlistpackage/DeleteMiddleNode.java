package codingcrack.linkedlistpackage;

class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}

public class DeleteMiddleNode {

    public ListNode deleteMiddle(ListNode head) {
        // Edge Case: If the list has only one node, return null
        if (head == null || head.next == null) {
            return null;
        }

        // Initialize pointers
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        // Traverse to find the middle node
        while (fast != null && fast.next != null) {
            prev = slow; // Keep track of previous node
            slow = slow.next;
            fast = fast.next.next;
        }

        // Delete the middle node by skipping it
        prev.next = slow.next;

        return head;
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
        DeleteMiddleNode solution = new DeleteMiddleNode();

        // Creating a Linked List: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original Linked List:");
        solution.printList(head);

        // Delete Middle Node
        head = solution.deleteMiddle(head);

        System.out.println("Linked List After Deleting Middle Node:");
        solution.printList(head);
    }
}