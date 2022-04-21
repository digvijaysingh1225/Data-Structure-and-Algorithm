package Leetcode;

public class square {
    public int mysqrt(int x){
        int res = (int) Math.sqrt(x);
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        square s = new square();
        s.mysqrt(8);
    }
}
