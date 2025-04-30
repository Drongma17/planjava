package codingcrack.hackerrank;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeLinkedListsIntoSingleLinkedList1 {



    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        ListNode head = new ListNode(0);
        ListNode temp = head;
        List<Integer> I = new ArrayList<>();
        for(ListNode list: lists){
            while (list !=null){
                I.add(list.val);
                list = list.next;
            }
        }
        Collections.sort(I);
        for(int val: I){
            temp.next = new ListNode(val);
            temp = temp.next;
        }

        return head.next;
    }


    public static void main(String[] args) {
        // Create 3 sorted linked lists: [1->4->5], [1->3->4], [2->6]
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);

        ListNode[] lists = new ListNode[]{l1, l2, l3};

        MergeLinkedListsIntoSingleLinkedList1 merger = new MergeLinkedListsIntoSingleLinkedList1();
        ListNode merged = merger.mergeKLists(lists);

        // Print merged list
        while (merged != null) {
            System.out.print(merged.val + " ");
            merged = merged.next;
        }
    }



}