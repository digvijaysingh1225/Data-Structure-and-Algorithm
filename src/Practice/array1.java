package Practice;

import java.util.Scanner;

/* Create an array of 10 elements input from user and print the sum of these elements as output
*/
public class array1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[]=new int[100];
        int sum=0;
        for(int i=0;i<10;i++){
            arr[i]=s.nextInt();
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }

}
