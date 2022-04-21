package Recursion;

public class nto1 {
    public static void main(String[] args) {
        int n=5;
        funcBoth(n);
    }
    static void func(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        func(n-1);
    }
    static void funcRev(int n){
        if(n==0){
            return;
        }
        funcRev(n-1);
        System.out.println(n);

    }
    static void funcBoth(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        funcBoth(n-1);
        System.out.println(n);
    }
}
