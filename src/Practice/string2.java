package Practice;
// Input 2 string from user and check if they re anagram or not.

import java.util.Arrays;
import java.util.Scanner;

public class string2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        String s2=s.nextLine();
        char [] arr1=s1.toCharArray();
        char[] arr2=s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(arr1.length==arr2.length){
            if(Arrays.equals(arr1,arr2)){
                System.out.println("Strings are Anagram");
            }
        }
        else{
            System.out.println("String are not Anagram");
        }
    }
}
