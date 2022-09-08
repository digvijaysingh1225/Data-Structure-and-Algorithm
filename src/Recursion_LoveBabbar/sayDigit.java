package Recursion_LoveBabbar;

public class sayDigit {
    public static void main(String[] args) {
        String[] arr = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        int n = 412;
        sayDigit(n,arr);
    }
    static void sayDigit(int n,String[] arr){
        if(n==0){
            return;
        }
        int digit = n%10;
        n/=10;
        sayDigit(n,arr);
        System.out.print(arr[digit] + " ");
    }
}
