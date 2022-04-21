package AIML;

import java.util.Scanner;

public class Stack {
    Scanner s = new Scanner(System.in);
    int n=4;
    int top=-1;
    int stack[] = new int[n];

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Stack a=new Stack();

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

     void Push() {
        int value;
        if(top==(n-1)){
            System.out.println("Stack is Full");
        }
        else{
            System.out.println("Enter Element : ");
            value=s.nextInt();
            stack[++top]=value;
        }
     }

    int Pop(){
        if(top==-1){
            System.out.println("Empty ");
        }
        else{
            return stack[top--];
        }
        return 0;
    }

    void display(){
        if(top!=-1){
            for(int i=top;i>-1;i--){
                System.out.println(stack[i]);
            }
        }

    }

}
