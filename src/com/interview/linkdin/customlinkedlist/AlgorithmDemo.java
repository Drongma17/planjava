package com.interview.linkdin.customlinkedlist;

public class AlgorithmDemo {

    public static void main(String[] args) {
        CustomLinkedList linkedList=new CustomLinkedList();

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

        linkedList.displayContents();
//        linkedList.deleteBackHalf();
//        linkedList.displayContents();
        linkedList.deleteKthNodeFromEnd(3);
        linkedList.displayContents();


    }
}
