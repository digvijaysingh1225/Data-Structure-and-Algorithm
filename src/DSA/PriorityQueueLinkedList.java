package DSA;

class NodeP{
    int data;
    NodeP next;
    int priority;
    public NodeP(int data,int priority){
        this.data=data;
        this.priority=priority;
    }
}
public class PriorityQueueLinkedList {
    NodeP front;
    NodeP rear;
    public PriorityQueueLinkedList(){
        front=null;
        rear=null;
    }
    public void enqueue(NodeP newnode){
        if(rear==null || newnode.priority < rear.priority){
            newnode.next=rear;
            rear=newnode;
        }
        else{
            NodeP temp = rear;
            while(temp.next!=null && temp.next.priority <= newnode.priority){
                temp = temp.next;
            }
            newnode.next=temp.next;
            temp.next=newnode;
        }
    }
    public void display(){
        NodeP temp = rear;
        while(temp!=null){
            System.out.println(temp.data+" "+ temp.priority);
            temp=temp.next;
        }
    }

}
class PriorityQueueLinkedListMain{
    public static void main(String[] args) {
        NodeP n1 = new NodeP(15,4);
        NodeP n2 = new NodeP(20,3);
        NodeP n3 = new NodeP(30,5);
        PriorityQueueLinkedList obj = new PriorityQueueLinkedList();
        obj.enqueue(n1);
        obj.enqueue(n2);
        obj.enqueue(n3);
        obj.display();
    }
}
