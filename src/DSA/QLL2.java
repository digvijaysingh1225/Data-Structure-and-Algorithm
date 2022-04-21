package DSA;

public class QLL2 {
    Node1 rear;
    Node1 front;
    public void enqueue(String data)
    {
        Node1 n1 = new Node1(data);
        if(front==null && rear==null)
        {
            front=rear=n1;
        }
        else
        {
            rear.next=n1;
            rear=n1;
        }
    }
    public void traverse(){
        if(front==null){
            System.out.println("Underflow");
        }
        else{
            while(front != null){
                System.out.println(front.data);
                front=front.next;
            }
        }
    }

    public static void main(String[] args) {
        QLL2 obj =new QLL2();
        for (int i = 0; i < args.length; i++) {
            int sum=0;
            String temp = args[i];
            int ans = Integer.parseInt(temp);
            int len = temp.length();
            for (int j = 0; j < args[i].length(); j++) {
                    int rem;
                    while (ans > 0) {
                        rem = ans % 10;
                        sum+=rem*len;
                        len--;
                        ans = ans / 10;
                    }

            }

            obj.enqueue(String.valueOf(sum));
//            System.out.println(sum);
        }
        obj.traverse();
    }

}
