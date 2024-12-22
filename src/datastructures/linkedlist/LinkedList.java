package datastructures.linkedlist;

/**
 * Simple linked list.
 * @head Head node
 * @tail tail node
 * @length: Length of the list
 */
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
