class Node {
    static Node head;
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }

    public void insert(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }

    public void printlist(Node curNode) {
        curNode = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (curNode != null) {
            System.out.print(curNode.data + "->");
            curNode = curNode.next;
        }
        System.out.print("NULL");
    }
}

public class linkedlist {
    public static void main(String[] args) {
        Node node = new Node(0);
        node.insert(9);
        node.insert(1);
        node.insert(2);
        node.insert(3);
        node.printlist(Node.head);
    }
}
