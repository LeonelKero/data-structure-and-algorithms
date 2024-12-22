package datastructures.linkedlist;

/**
 * Represents a node of a simple linked list. It holds a value of type Integer and point to the next node.
 * The next node can be null.
 */
class Node {
    Integer value;
    Node next;

    public Node(Integer value) {
        this.value = value;
    }
}
