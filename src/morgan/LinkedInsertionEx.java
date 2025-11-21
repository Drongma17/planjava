package morgan;

public class LinkedInsertionEx {
    Node head;

    void insertNode(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head == null){
            head = node;
        }else {
            Node n = head;
            while (n.next != null){
                n = n.next;
            }
            n.next = node;
        }
    }


    void insertAtStart(int data){
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }


    public void insertAt(int index, int data){
        Node node = new Node();
        node.data = data;

        if(index == 0){
            insertAtStart(data);
        }else {
            Node n = head;
            for(int i=0; i<index-1; i++){
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }


    public void deleteAt(int index){
        Node n = head;
        Node n1 = null;
        for(int i=0; i<index-1; i++){
            n = n.next;
        }
        n1 = n.next;
        n.next = n1.next;
        System.out.println("deleted data is = " + n1.data);
    }


    void showNode(){
        Node nod = head;
        while (nod.next != null){
            System.out.print(nod.data+"  ");
            nod = nod.next;
        }
        System.out.println(nod.data);
    }



    public static void main(String[] args) {
        LinkedInsertionEx linked = new LinkedInsertionEx();
        linked.insertNode(2);
        linked.insertNode(4);
        linked.insertNode(6);
        linked.insertAtStart(25);
        linked.insertAt(2, 52);
        linked.deleteAt(3);
        linked.showNode();
    }
}
