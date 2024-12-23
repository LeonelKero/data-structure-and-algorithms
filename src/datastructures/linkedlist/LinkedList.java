package datastructures.linkedlist;

import java.util.Objects;

/**
 * Simple linked list.
 *
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

    public void printList() {
        System.out.println("\nLinked List of " + this.length + " elements");
        var temp = this.head; // pass head to temporary variable
        if (this.head != null) System.out.print("Head=(" + this.head.value + ") ");
        else System.out.print("Head=(null) ");

        while (temp != null) { // loop node to node
            System.out.print("(" + temp.value + ")->");
            temp = temp.next;
        }

        System.out.print("null");
        if (this.tail != null) System.out.print(" Tail=(" + this.tail.value + ")\n");
        else System.out.print(" Tail=(null) ");
    }

    public void getHead() {
        System.out.println("Head is " + this.head.value);
    }

    public void getTail() {
        System.out.println("Tail is " + this.tail.value);
    }

    public void getLength() {
        System.out.println("Length is " + this.length);
    }

    public void appendNode(final Integer value) {
        System.out.println("\nAdding node " + value);
        final var newNode = new Node(value); // create new node to be appended
        if (this.length == 0) { // in case of first node append
            this.head = newNode;
        } else {
            this.tail.next = newNode; // make tail points to this appended node
        }
        this.tail = newNode;
        this.length++; // increment length by 1.
    }

    public void popNode() {
        System.out.println("\nRemoving the last node.");
        if (this.length == 0) { // here we have an empty linked list
            System.out.println("Empty List");
        } else {
            if (this.length == 1) {
                // in case of a single node - drop that node
                this.head = null;
                this.tail = null;
                this.length--;
                return;
            }
            var temp = this.head;
            while (temp.next != null) { // trigger this loop only if there is at least two nodes
                if (Objects.equals(temp.next.value, this.tail.value)) {
                    this.tail = temp;
                    temp.next = null;
                    this.length--;
                    break;
                }
                temp = temp.next;
            }
        }
    }
}
