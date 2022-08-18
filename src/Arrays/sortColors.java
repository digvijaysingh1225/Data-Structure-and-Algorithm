package Arrays;

import java.util.Arrays;
public class sortColors {
    public static void main(String[] args) {
        int[] arr = {2,0,1};
        System.out.println(Arrays.toString(sortColors(arr)));
    }
    public static int[] sortColors(int[] nums) {
        int l=0;
        int m=0;
        int h=nums.length-1;
        while(m<=h){
            if(nums[m]==0){
                int temp = nums[m];
                nums[m] = nums[l];
                nums[l]= temp;
                m++;
                l++;
            }
            else if(nums[m]==1){
                m++;
            }
            else if(nums[m]==2){
                int temp = nums[m];
                nums[m] = nums[h];
                nums[h]= temp;
                h--;

            }
        }
        return nums;
    }
}
