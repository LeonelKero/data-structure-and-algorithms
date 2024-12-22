package datastructures.linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
        final var linkedList = new LinkedList(7);

        System.out.println("Initial state");
        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLength();

        //linkedList.printList();

        linkedList.appendNode(9);

        linkedList.printList();
    }
}
