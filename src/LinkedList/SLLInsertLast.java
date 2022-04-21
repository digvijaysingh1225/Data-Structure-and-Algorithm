package LinkedList;

public class SLLInsertLast {
    static Node insertlast(Node head,int data){
        Node temp = new Node(data);
        if(head==null){
            return temp;
        }
        Node h1 = head;
        while(h1.next != null){
            h1 = h1.next;
        }
        h1.next=temp;
        return head;
    }

    public static void main(String[] args) {
        Node head = null;
        head = insertlast(head,10);
        head = insertlast(head,20);
        head = insertlast(head,30);

    }
}
