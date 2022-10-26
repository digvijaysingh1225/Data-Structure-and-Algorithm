package Arrays;

public class singleNumber {
    public static void main(String[] args) {
        int[] arr = {2,2,1,4,3,6,4,6,3};
        int res = 0;
        for (int i :
                arr) {
            res ^= i;
        }
        System.out.println(res);
    }
}
