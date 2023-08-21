package com.interview.linkdin.cyclicLinkedListSolutionWithHashSet;



public class Algorithm {


    public static void main(String[] args) {

        CustomLinkedList noCyclelinkedList=new CustomLinkedList();
        Node firstNode=new Node(3);
        Node secondNode=new Node(4);
        Node thirdNode=new Node(5);
        Node fourthNode=new Node(6);
        Node fifthNode=new Node(7);

        noCyclelinkedList.head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = fifthNode;

        System.out.println(noCyclelinkedList.hasCycle());

        CustomLinkedList cyclelinkedList=new CustomLinkedList();
        cyclelinkedList.head = firstNode;
        thirdNode.next = secondNode;

        System.out.println(cyclelinkedList.hasCycle());
    }
}
