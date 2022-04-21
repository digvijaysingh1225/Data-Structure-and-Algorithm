package LinkedList;

// Traversing a Singly Linked List



public class SinglyLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        printlist(head);
    }

    static void printlist(Node head) {
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
    static Node insertbegin(Node head,int x){
        Node temp = new Node(x);
        temp.next = head;
        return head;
    }

}
