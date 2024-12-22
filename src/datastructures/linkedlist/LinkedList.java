package datastructures.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private Integer length;

    LinkedList(final Integer value) {
        Node node = new Node(value);
        this.head = node;
        this.tail = node;
        this.length = 1;
    }
}
