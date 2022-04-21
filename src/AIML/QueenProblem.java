package AIML;

import java.util.Arrays;

public class QueenProblem {
//    int[] currentsol;
    static int[] currentsol=new int[8];
    public static void main(String[] args) {

        int currentrow=0,col;
        while(currentrow<8){


            for (col = 0; col < 8; col++) {
                currentsol[currentrow] = col;
                if (issafe(currentrow, col)) {

                    currentrow++;
                    break;
                }

            }
        }
            System.out.println(Arrays.toString(currentsol));



    }

    public static boolean issafe(int row, int col) {
        for (int r = 0; r < row-1; r++) {
            if(col==currentsol[r]){
                return false;
            }
            if(Math.abs(row-r)==Math.abs(currentsol[row]-currentsol[r])){
                return false;
            }

        }
        return true;
    }

}
