package LinkedList;

public class SLLInsertBegin {
    static Node insertbegin(Node head,int data){
        Node temp = new Node(data);
        temp.next = head;
        return head;

    }

    public static void main(String[] args) {
        Node head = null;
        head = insertbegin(head,30);
        head = insertbegin(head,20);
        head = insertbegin(head,10);


    }
}
