package codingcrack.linkedlistpackage;

public class OddFirstEvenNextReorderedLinked {

    private ListNode oddEvenList(ListNode head) {
        //  1,2,3,4,5,6
        if (head == null && head.next == null)
            return head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
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


    public static void main(String[] args) {
        OddFirstEvenNextReorderedLinked solution = new OddFirstEvenNextReorderedLinked();

        // Creating a Linked List: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original Linked List:");
        solution.printList(head);
        solution.oddEvenList(head);
        System.out.println("Linked List After old and even sequence :");
        solution.printList(head);

    }
}
