package dsa.practice.linkedlist;

public class LinkedList {
    private Node head;

    public LinkedList(){
        this.head = null;
    }

    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            Node curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    public void remove(int data){
        if(head == null){
            System.out.println("Nothing to remove");
            return;
        }

        if(head.data == data){
            head = head.next;
            return;
        }
        Node prev = head;
        Node curr = prev.next;
        while (curr != null){
            if(curr.data == data){
                prev.next = curr.next;
                break;
            }
            prev = curr;
            curr = curr.next;
        }
        if(curr == null){
            System.out.println("No data found to remove");
        }
    }

    public void display(){
        Node curr = head;
        while (curr != null){
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public boolean isEmpty(Node head){
        return head == null;
    }

    public void reverse(){
        if(head == null || head.next == null){
            System.out.println("Linked list is empty or only 1 element");
            return;
        }
        Node prev = null;
        Node curr = head;
        Node next = curr.next;

        while(curr.next != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            next = next.next;
        }
        curr.next = prev;
        head = curr;
    }
}
