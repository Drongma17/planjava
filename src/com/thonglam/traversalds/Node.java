package com.thonglam.traversalds;

public class Node {

    Node left;
    Node right;
    String data;

    public Node(String data){
        this.data = data;
    }


    public Node(String data, Node left, Node right){
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
