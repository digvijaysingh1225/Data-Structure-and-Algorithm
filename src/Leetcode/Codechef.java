package Leetcode;

import java.util.Scanner;

public class Codechef {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
//        Scanner sc = new Scanner(System.in);
//        int a,b,x,y = sc.nextInt();
////        int b = sc.nextInt();
////        int x = sc.nextInt();
////        int y = sc.nextInt();
//
//        int res = (a*x)+(b*y);
//
//        System.out.println(res);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ctr=0;
        int[] arr = new int[n];

        for(int i=1;i<=n;i++){
            if(n%i==0){
                ctr++;
                for(int j=0;j<n;j++){
                    arr[j]=i;
                }
            }
        }
        System.out.println(ctr);
        System.out.println(arr);
    }
}
