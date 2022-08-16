package String;

import java.util.Scanner;

public class reverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        method1(s);
    }
    static void method1(String s){
        String res="";
        String temp="";

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=' '){
                temp=temp+s.charAt(i);
            }
            else{
                res=" "+temp+res;
                temp="";
            }
        }
        res=temp+res;
        System.out.println(res);
    }
}
