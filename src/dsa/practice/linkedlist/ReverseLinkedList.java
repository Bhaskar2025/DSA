package dsa.practice.linkedlist;

public class ReverseLinkedList {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);
        linkedList.add(60);

        linkedList.display();

        linkedList.reverse();
        linkedList.display();
    }
}
