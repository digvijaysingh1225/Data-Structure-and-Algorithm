package String;

import java.util.Scanner;

public class reverseIndividualWordsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        method1(s);
    }

    static void method1(String s){
        String temp = "";
        String res= "";

        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i)!=' '){
                temp = s.charAt(i)+temp;
            }
            else{
                res = res +temp+" ";
                temp="";
            }


        }
        res = res+temp;
        System.out.println(res);
    }
}
