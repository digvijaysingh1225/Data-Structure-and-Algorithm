package DSA;

class Node1{
    String data;
    Node1 next;

    public Node1(String data)
    {
        this.data = data;
    }
}
//
public class QueueByLinkedList {
    Node1 front,rear;
    public void enqueue(String data)
    {
        Node1 n1 = new Node1(data);
        if(front==null && rear==null){
            front=rear=n1;
        }
        else
        {
            rear.next=n1;
            rear=n1;
        }
    }
    public void traverse()
    {
        if(front==null){
            System.out.println("Underflow");
        }
        else
        {
            while(front != null) {
                System.out.println(front.data);
                front = front.next;
            }
        }
    }




    public static void main(String[] args)
    {
        QueueByLinkedList obj = new QueueByLinkedList();

        for (int i = 0; i < args.length; i++)
        {
            String even="";
            String odd="";
            for (int j = 0; j < args[i].length(); j++)
            {

                if(args[i].charAt(j) % 2 == 0)
                {
                    even=even+args[i].charAt(j);
                }
                else
                {
                    odd=odd+args[i].charAt(j);
                }
            }
            String ans = even+odd;
            obj.enqueue(ans);
//            obj.traverse();
//            System.out.println(ans);
        }
        obj.traverse();

    }


}
