package DSA;

import java.util.Scanner;

public class QueueProblemStatement {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

    }
    public void insertArray(int size){
        int arr[] = new int[size];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i]=sc.nextInt();
        }
    }
    int ans;
    public void pair(int arr[]){
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                ans = arr[i]*arr[j];
            }
        }

    }

    public void queue(){
            int queue[] = new int[2];
            int front=0;
            int rear=1;
            queue[front]=Integer.MAX_VALUE;
            queue[rear]=Integer.MIN_VALUE;




    }

}
// Hi, I am Digvijay Singh
// I am currently doing my btech in computer science and engineering with specialization in Aritficial Intelligence and machine learning