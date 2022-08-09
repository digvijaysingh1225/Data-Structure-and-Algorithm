package String;

import java.util.Scanner;
import java.util.Stack;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        method1(s);
//        method2(s);
//        method3(s);
    }

    static void method1(String s){
        String rev = "";
//        char[] a = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            rev=s.charAt(i)+rev;
        }
        System.out.println(rev);
    }
    static void method2(String s){
        int start=0,end=s.length()-1;
        char[] arr = s.toCharArray();
        while(start<end){
            char temp = arr[start];
            arr[start]=arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
        System.out.println(arr);
    }
    static void method3(String s){
        Stack st = new Stack();
        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));
        }
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
}
