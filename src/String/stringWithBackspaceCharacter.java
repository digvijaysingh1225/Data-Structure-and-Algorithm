package String;

import java.util.Scanner;

public class stringWithBackspaceCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(helper(s1,s2));
    }

    static boolean helper(String str1, String str2){
        String res1 = "";
        String res2 = "";
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i)!='#'){
                res1=res1+ str1.charAt(i);
            }
            else{
                res1=res1.replace(res1.substring(res1.length()-1),"");
            }
        }
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i)!='#'){
                res2=res2+ str2.charAt(i);
            }
            else{
                res2=res2.replace(res2.substring(res2.length()-1),"");
            }
        }
        return res1.equals(res2);
    }
}
