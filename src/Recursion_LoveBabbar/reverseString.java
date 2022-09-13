package Recursion_LoveBabbar;

public class reverseString {
    public static void main(String[] args) {
        String s = "abcde";
        char[] a = s.toCharArray();
        reverseString(a,0,s.length()-1);
        System.out.println(String.valueOf(a));
    }
    static void reverseString(char[] s, int start,int end){
        if(start>end){
            return;
        }

        swap(s,start,end);

        start++;
        end--;
        reverseString(s,start,end);


    }
    private static void swap(char[] a,int i,int j){
        char temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
