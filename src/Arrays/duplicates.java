package Arrays;

public class duplicates {

        public static void main(String[] args) {

        int[] arr = {1,3,4,2,2};
        System.out.println(findDuplicate_mark(arr));
    }
        public static int findDuplicate_mark(int[] nums) {
        int len = nums.length;
        for (int num : nums) {
            int idx = Math.abs(num);
            if (nums[idx] < 0) {
                return idx;
            }
            nums[idx] = -nums[idx];
        }

        return len;
    }

}
