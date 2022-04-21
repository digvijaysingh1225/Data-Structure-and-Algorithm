package LinkedList;

public class ProblemLL {
    Node head = null;

    public static void main(String[] args)  {
        ProblemLL n1 = new ProblemLL();
        n1.insertNode(10);
        n1.insertNode(20);
        n1.insertNode(30);
        n1.printLL();
        System.out.println();
        System.out.println(n1.sizeLL());
        n1.searchElement(40);

    }
    public void insertNode(int data){
        Node<Integer> newNode = new Node<Integer>(data);
        if(head==null){
            head = newNode;
            return;
//            head.next=null;
        }
        Node temp = head;
        while(temp.next != null){
            temp=temp.next;
        }
        temp.next = newNode;

    }
    public void searchElement(Integer x){

        if(head==null){
            System.out.println("Not Found. List is Empty");

            return;
        }
        Node temp = head;
        while(temp!=null){
            int count=0;
            if(temp.data==x){
                System.out.println("Element Found");
                count=1;
                return;
            }
            temp=temp.next;

        }
        System.out.println("Element Not Found");

    }

    public int sizeLL(){
        int count=0;
        if(head==null){
            return -1;
        }
        Node temp = head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }
    public void printLL(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }


}
