package codingcrack.linkedlistpackage;

public class MyLinkedList {

    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.value = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }


    private void insertAtBegin(int data){
        Node node = new Node();
        node.value = data;
        node.next = head;
        head = node;
    }

    private void insertAt(int index, int value){
        Node node = new Node();
        node.value = value;
        Node n = head;
        if(index ==0){
            insertAtBegin(value);
        }
        for(int i=0; i<index-1; i++){
            n = n.next;
        }
        node.next =n.next;
        n.next = node;
    }

    private Node deleteMidNodeInLinkedList(){
        Node node = new Node(0, head);
        Node slow = node;
        Node fast = head;

        while(fast !=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return node.next;
    }


    private void showElement() {
        Node node = head;
        while (node.next != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
        System.out.println(node.value);
    }


    public static void main(String[] args) {
        MyLinkedList newNode = new MyLinkedList();
        newNode.insert(3);
        newNode.insert(4);
        newNode.insert(8);
        newNode.insertAtBegin(25);
        newNode.insertAtBegin(45);
        newNode.insertAtBegin(56);
        newNode.insertAt(2, 100);
        newNode.showElement();
        newNode.deleteMidNodeInLinkedList();
        newNode.showElement();
    }
}
