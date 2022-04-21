package AIML;

import java.util.Scanner;

public class Queue {
    public Scanner s = new Scanner(System.in);
    int Maxsize=4;
    int front=-1,rear=-1;
    int queue[]=new int[Maxsize];


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Queue a = new Queue();
        int c;
        int x=1;
        while(x==1){
            System.out.println("1.Push ");
            System.out.println("2.Pop ");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            System.out.println("Enter Your Choice : ");
            c=s.nextInt();
            int v;
            switch (c) {
                case (1) -> a.Push();
                case (2) -> {
                    v = a.Pop();
                    System.out.println("Pop Element is " + v);
                }
                case (3) -> a.display();
                case (4) -> x = 0;
                default -> System.out.println("Enter valid choice number");
            }
        }
    }

    void Push(){
        int value;
        if(rear==Maxsize-1){
            System.out.println("Queue is Full ");
        }
        else{
            System.out.println("Enter Element : ");
            value=s.nextInt();
            queue[++rear]=value;
            if(rear==0){
                ++front;
            }
        }
    }
    int Pop(){
        if(front>rear){
            System.out.println("Queue is Empty. ");
        }
        else{
            return queue[front++];
        }
        return 0;
    }

    void display(){
        if(rear!=0){
            for(int i=front;i<=rear;i++){
                System.out.println(queue[i]);
            }
        }
    }
}
