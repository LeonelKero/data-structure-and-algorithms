package datastructures.linkedlist;

public class LinkedListMainApp {
    public static void main(String[] args) {
        final var linkedList = new LinkedList(7);

        System.out.println("Initial state");
        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLength();


        linkedList.appendNode(8);
        linkedList.printList();

        linkedList.appendNode(9);
        linkedList.printList();

        linkedList.popNode();

        linkedList.printList();

        linkedList.prependNode(5);
        linkedList.printList();

        Node removedNode = linkedList.removeFirstNode();
        System.out.println("\tRemoved Node: " + removedNode.value);
        linkedList.printList();
    }
}
