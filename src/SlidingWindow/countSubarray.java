package SlidingWindow;

public class countSubarray {
    public static void main(String[] args) {
        int[] arr = {1,4,6};
        int l = 3;
        int r = 8;
        System.out.println(subarrays(arr, l, r, arr.length));
    }
    static long subarrays(int A[], int L, int R, int N) {
        // code here
        long Rcnt = countSub(A, N, R);
        long Lcnt = countSub(A, N, L-1);

        return Rcnt - Lcnt;
    }

    static long countSub(int[] A, int N, long x){
        int i = 0;
        int j = 0;
        long count = 0;
        long sum = 0;
        while(j<N){
            sum += A[j];

            while(i<=j && sum > x){
                sum -= A[i];
                i++;
            }
            count += (j-i+1);
            j++;
        }
        return count;
    }
}
