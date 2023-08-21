package com.interview.linkdin.treeDemo;

public class Algorithm {




    public static void main(String[] args) {
        Node rootNode = new Node();
        rootNode.data = 5;
        Node rootTwo = new Node();
        rootTwo.data = 2;
        Node rootFour=new Node();
        rootFour.data = 4;
        Node rootNine= new Node();
        rootNine.data = 9;
        Node rootTen = new Node();
        rootTen.data =10;
        Node rootSeven = new Node();
        rootSeven.data= 7;

        rootNode.left =rootTwo;
        rootNode.right = rootFour;
        rootTwo.left = rootNine;
        rootTwo.right = rootTen;
        rootFour.left = rootSeven;

        BinarySearchTree tree = new BinarySearchTree();
        tree.root =rootNode;

        tree.preOrderTravelsal();
        System.out.println();


        tree.inOrderTravelsal();
        System.out.println();

        tree.postOrderTravelsal();
        System.out.println();

        System.out.println(tree.contains(1));
        System.out.println(tree.contains(2));
        System.out.println(tree.contains(3));
        System.out.println(tree.contains(4));

        System.out.println(tree.contains(5));
        System.out.println(tree.contains(-4));
        System.out.println(tree.contains(0));
        System.out.println(tree.contains(0));
//        tree.insert(1);
//        tree.insert(2);
//        tree.insert(3);
    }
}
