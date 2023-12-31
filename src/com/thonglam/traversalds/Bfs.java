package com.thonglam.traversalds;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs {
    public static void traveral(Node node) {

        Queue<Node> q = new LinkedList<Node>();
        q.add(node);


        while (!q.isEmpty()){
            node = q.remove();
            System.out.println(node.data+ " ");

            if(node.left !=null)
                q.add(node.left);

            if(node.right !=null)
                q.add(node.right);
        }
    }
}
