package codingcrack.linkedlistpackage;

public class DeleteMiddleNodeAndReturnRemainning {


        public ListNode deleteMiddle(ListNode head) {
            ListNode newNode = new ListNode(0, head);
            ListNode slow = newNode;
            ListNode fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            slow.next = slow.next.next;
            return newNode.next;
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
    public static void main(String[] args) {
        DeleteMiddleNodeAndReturnRemainning solution = new DeleteMiddleNodeAndReturnRemainning();

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

