package com.interview.linkdin.treeDemo;

public class BinarySearchTree {
    Node root;

    public void preOrderTravelsal(){
        preOrderTravelsal(this.root);
    }

    private void preOrderTravelsal(Node root) {
        if(root != null){
            System.out.print(root.data + " ");
            preOrderTravelsal(root.left);
            preOrderTravelsal(root.right);
        }
    }


    public void inOrderTravelsal(){
        inOrderTravelsal(this.root);
    }

    private void inOrderTravelsal(Node root) {
        if(root != null){
            inOrderTravelsal(root.left);
            System.out.print(root.data + " ");
            inOrderTravelsal(root.right);
        }
    }

    public void postOrderTravelsal(){
        postOrderTravelsal(this.root);
    }

    private void postOrderTravelsal(Node root) {
        if(root != null){
            postOrderTravelsal(root.left);
            postOrderTravelsal(root.right);
            System.out.print(root.data + " ");
        }
    }


    public void insert(int value){
        insert(this.root, value);
    }

    private Node insert(Node root, int value) {
        if(root == null){
            root = new Node();
            root.data = value;
        } else if (value < root.data) {
            // insert on left
            root.left = insert(root.left,value);
        } else if (value > root.data) {
            // insert on right
            root.right = insert(root.right, value);
        }
        return root;
    }

    public boolean contains(int value){
        return contains(this.root, value);
    }

    private boolean contains(Node root, int value) {
        if(root == null){
            return false;
        }

        if(value < root.data){
            contains(root.left, value);
        }
        if(value> root.data){
            return contains(root.right, value);
        }
        return true;
    }
}
