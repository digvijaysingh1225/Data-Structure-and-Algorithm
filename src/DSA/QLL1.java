package DSA;
//Output:- Poeoeoe , Neoeeoe etc
public class QLL1 {
    Node1 front;
    Node1 rear;

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
        QLL1 obj = new QLL1();

        for (int i = 0; i < args.length; i++) {
            String ans = "";
            String temp= args[i];
            boolean empty=true;
            for (int j = 0; j < args[i].length(); j++) {
                if(j==0){
                    if(temp.charAt(j)=='-'){
                        ans+="N";
                        continue;
                    }
                    else {
                        ans+="P";
                    }
                }
                if (temp.charAt(j) % 2 == 0 && temp.charAt(j)!='0') {
                    ans+="e";
                    empty=false;
                }else if(temp.charAt(j) % 2 != 0){
                    ans+="o";
                    empty=false;
                }
                else if(temp.charAt(j)=='0'){
                    if(empty){
                        continue;
                    }
                    ans+="z";
                }

            }
            obj.enqueue(ans);


        }
        obj.traverse();
    }
}
