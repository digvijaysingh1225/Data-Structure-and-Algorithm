package SDE_Striver;
import java.util.Arrays;
public class setMatrixZeros {
    public static void main(String[] args) {
        int[][] arr = {{-4,-2147483648,6,-7,0},{-8,6,-8,-6,0},{2147483647,2,-9,-6,-10}};
        setZeroes(arr);
        for (int[] row : arr)


            System.out.println(Arrays.toString(row));

    }
    public static void setZeroes(int[][] matrix) {
        int m=matrix.length, n=matrix[0].length;
        boolean isRow0=false, isCol0=false;

        for(int j=0;j<n;j++){
            if(matrix[0][j]==0)
                isRow0=true;
        }

        for(int i=0;i<m;i++){
            if(matrix[i][0]==0)
                isCol0=true;
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[0][j]==0 || matrix[i][0]==0)
                    matrix[i][j]=0;
            }
        }

        if(isRow0){
            for(int j=0;j<n;j++)
                matrix[0][j]=0;
        }

        if(isCol0){
            for(int i=0;i<m;i++)
                matrix[i][0]=0;
        }
    }
}
