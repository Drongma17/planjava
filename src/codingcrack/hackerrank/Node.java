package codingcrack.hackerrank;

public class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", node=" + next +
                '}';
    }
}
