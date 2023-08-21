package com.thonglam.traversalds;

public class Dfs {


    public static void traveral(Node node) {
        if(node == null)
            return;
        System.out.println(node.data);
        traveral(node.left);
        traveral(node.right);
    }
}
