package Leetcode;
import java.util.Arrays;

public class SearchInMatrices {
    public static void main(String[] args) {
        int[][] matrices = {{1,2,3},{4,5,6},{7,8,9}};
        int target = 10;

        System.out.println(Arrays.toString(rowcolmatrix(matrices,target)));
    }

    static int[] rowcolmatrix(int[][] matrix,int target){
        int row=0;
        int col=matrix.length-1;

        while(row< matrix.length && col>=0){
            if(matrix[row][col]==target){
                return new int[]{row,col};
            }
            if(matrix[row][col]<target){
                row++;
            }
            else{
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
