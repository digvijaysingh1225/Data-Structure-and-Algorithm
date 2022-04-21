package Recursion;

public class factorial {
    public static void main(String[] args) {
        int n=5;
        System.out.println(func(n));
    }
    static int func(int n){
        if(n<=1){
            return 1;
        }

        return n*func(n-1);
    }
}
