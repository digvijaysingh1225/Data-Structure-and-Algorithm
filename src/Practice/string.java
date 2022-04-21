package Practice;

import java.util.Scanner;

/* Ques- Count no. of vowels in a string input from user.
*/
public class string {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        int ctr=0;
        for(int i=0;i<s1.length();i++){
            char s2=s1.charAt(i);
            if(s2=='a'||s2=='A'||s2=='e'||s2=='E'||s2=='i'||s2=='I'||s2=='o'||s2=='O'||s2=='u'||s2=='U'){
                ctr++;
            }
        }
        System.out.println(ctr);
    }
}
