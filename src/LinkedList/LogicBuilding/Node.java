package LinkedList.LogicBuilding;

import java.sql.SQLOutput;

public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        n1.next = n2;
        n2.next = n3;
        Node current = n1;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
    }
}
