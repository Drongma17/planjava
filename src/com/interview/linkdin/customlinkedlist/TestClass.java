package com.interview.linkdin.customlinkedlist;

public class TestClass {

    Node head;
    public void deletekNode(int k){
        // list =[a,b,c,d,e,f]; k=2
        Node first= head;
        Node second = head;

        for(int i=0; i<k; i++){
            first = first.next;
            if(first.next != null){
                if(i == k-1){
                    head = head.next;
                }
                return;
            }
        }

        while (second.next != null){
            second = second.next;
        }

    }

    public static void main(String[] args) {
        CustomLinkedList linkedList = new CustomLinkedList();

        Node firstNode=new Node(3);
        Node secondNode=new Node(4);
        Node thirdNode=new Node(5);
        Node fourthNode=new Node(6);
        Node fifthNode=new Node(7);

        linkedList.head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = fifthNode;
    }
}
