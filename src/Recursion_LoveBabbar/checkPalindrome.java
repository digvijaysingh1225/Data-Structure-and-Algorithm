package Recursion_LoveBabbar;

public class checkPalindrome {
    public static void main(String[] args) {
        String s = "abbaabbaa";
        char[] a = s.toCharArray();
        System.out.println(isPalindrome(a,0,s.length()-1));
    }
    static boolean isPalindrome(char[] s,int start,int end){
        if(start>end){
            return true;
        }
        if(s[start] != s[end]){
//            System.out.println("String is not palindrome");
            return false;
        }
        else{
            return isPalindrome(s,++start,--end);
        }
    }
}
