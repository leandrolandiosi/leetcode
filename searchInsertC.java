public class searchInsertC {
    public static int searchInsert(int[] nums, int target) {
        int i = (nums.length/2)-1;
        if (target > nums[nums.length-1]){
            return nums.length;
        }
        if ((target < nums[0]) || (nums.length == 1)) {
            return 0;
        }
        while (true) {
            if (target == nums[i]) {
                return i;
            }
            if (target > nums[i]) {
                i++;
                if (target < nums[i]) {
                    return i;
                }
            }
            if (target < nums[i]) {
                i--;
                if (target > nums[i]) {
                    return i;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int i = searchInsert(nums,1);
        //System.out.println(i);
    }
}
