package Recursion;

public class SumOfDigit {
    public static void main(String[] args) {
        int n=1342;
//        System.out.println(sumofdigit(n));
        System.out.println(prod(n));
    }

    static int sumofdigit(int n){
        if(n==0){
            return 0;
        }

        return n%10 + sumofdigit(n/10);
    }
    static int prod(int n){
        if(n%10==n){
            return n;
        }
        return n%10 * prod(n/10);
    }
}
